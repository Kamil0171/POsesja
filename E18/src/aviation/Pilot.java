package aviation;

public class Pilot implements Cloneable{
    private String name;
    private double[] flightHours;

    public Pilot(String name, double[] flightHours) {
        this.name = name;
        this.flightHours = flightHours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double[] getFlightHours() {
        return flightHours.clone();
    }

    public void setFlightHours(double[] flightHours) {
        this.flightHours = flightHours.clone();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        try {
            Pilot cloned = (Pilot) super.clone();
            cloned.flightHours = this.flightHours.clone();
            return cloned;
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
            return null;
        }
    }

    public void checkIndex(int index, double val){
        if(index >= 0 && index < flightHours.length){
            flightHours[index] = val;
        }
    }
}
