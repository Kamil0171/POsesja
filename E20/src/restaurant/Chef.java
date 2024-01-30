package restaurant;

import java.util.Comparator;

public class Chef{
    private int id;
    private String name;
    private double skillLevel;

    public Chef(int id, String name, double skillLevel) {
        this.id = id;
        this.name = name;
        this.skillLevel = skillLevel;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSkillLevel() {
        return skillLevel;
    }

    @Override
    public String toString() {
        return "Chef{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", skillLevel=" + skillLevel +
                '}';
    }
}
