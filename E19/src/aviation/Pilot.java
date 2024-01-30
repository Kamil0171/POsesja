package aviation;

import java.util.ArrayList;

public class Pilot implements Cloneable {
    private String name;
    private ArrayList<Double> flightHours;

    public Pilot(String name, ArrayList<Double> flightHours) {
        this.name = name;
        this.flightHours = flightHours;
    }

    public ArrayList<Double> getFlightHours() {
        return flightHours;
    }

    public void setFlightHours(ArrayList<Double> flightHours) {
        this.flightHours = flightHours;
    }

    @Override
    public String toString() {
        return "Pilot{" +
                "name='" + name + '\'' +
                ", flightHours=" + flightHours +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        try{
            Pilot cloned = (Pilot) super.clone();
            cloned.flightHours = (ArrayList<Double>) this.getFlightHours().clone();
            return cloned;
        }catch(CloneNotSupportedException e){
            e.printStackTrace();
            return null;
        }
    }

    public void changeIndex(int index, double val) {
        if (index >= 0 && index < flightHours.size()) {
            flightHours.set(index, val);
        }
    }
}
