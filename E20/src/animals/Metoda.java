package animals;

public class Metoda {
    public static <T extends Animal> boolean isSameSpecies(T animal1, T animal2){
        if(animal1.getClass()== animal2.getClass()){
            return true;
        }else{
            return false;
        }
    }
}
