package bai03;

public class Animal {
    private String name;
    private String species;
    private String food;

    public Animal() {}

    public Animal(String name, String species, String food) {
        this.name = name;
        this.species = species;
        this.food = food;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSpecies() {
        return species;
    }
    public void setSpecies(String species) {
        this.species = species;
    }
    public String getFood() {
        return food;
    }
    public void setFood(String food) {
        this.food = food;
    }
    public void makeSound() {
        System.out.println("Kêu");
    }

}
