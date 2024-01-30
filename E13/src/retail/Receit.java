package retail;

import java.util.ArrayList;

public class Receit implements Cloneable{
    private String name;
    private ArrayList<Double> amounts;

    public Receit(String name, ArrayList<Double> amounts) {
        this.name = name;
        this.amounts = new ArrayList<>(amounts);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Double> getAmounts() {
        return (ArrayList<Double>) new ArrayList<>(amounts).clone();
    }

    public void setAmounts(ArrayList<Double> amounts) {
        this.amounts = (ArrayList<Double>) new ArrayList<>(amounts).clone();
    }

    @Override
    public String toString() {
        return "Receit{" +
                "name='" + name + '\'' +
                ", amounts=" + amounts +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        try {
            Receit cloned = (Receit) super.clone();
            cloned.amounts = (ArrayList<Double>) this.amounts.clone();
            return cloned;
        }catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
            return null;
        }
    }

    public void changeIndex(int indeks, double val){
        if(indeks >= 0 && indeks < amounts.size()){
            amounts.set(indeks, val);
        }
    }
}
