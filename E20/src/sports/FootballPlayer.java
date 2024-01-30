package sports;

import java.util.Arrays;

public class FootballPlayer implements Cloneable{
    private String name;
    private int[] goals;

    public FootballPlayer(String name, int[] goals) {
        this.name = name;
        this.goals = goals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getGoals() {
        return goals;
    }

    public void setGoals(int[] goals) {
        this.goals = goals;
    }

    @Override
    public String toString() {
        return "FootballPlayer{" +
                "name='" + name + '\'' +
                ", goals=" + Arrays.toString(goals) +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        try {
            FootballPlayer cloned = (FootballPlayer) super.clone();
            cloned.goals = this.goals.clone();
            return cloned;
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
            return null;
        }
    }

    public void changeIndex(int index, int val){
        if(index>=0 && index < goals.length){
            goals[index] = val;
        }
    }
}
