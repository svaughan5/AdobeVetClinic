package sample;

public class Animal {

    private int animalID;
    private String name;
    private String species;
    private String breed;
    private String gender;
    private int age;
    private double weight;
    private double height;
    private char status;


    //Constructors *****************************************************************
    Animal(){
        setAnimalID(0);
        setName("");
        setSpecies("");
        setBreed("");
        setGender("");
        setAge(0);
        setWeight(0.0);
        setHeight(0.0);
        setStatus('L');
    }

    Animal(int id, String name, String species, String breed, String gender){
        setAnimalID(id);
        setName(name);
        setSpecies(species);
        setBreed(breed);
        setGender(gender);
        setAge(0);
        setWeight(0.0);
        setHeight(0.0);
        setStatus('L');
    }

    //Setters *****************************************************************
    public void setAnimalID (int id){
        this.animalID = id;
    }

    public void setName (String name){
        this.name = name;
    }

    public void setSpecies (String species){
        this.species = species;
    }

    public void setBreed (String breed){
        this.breed = breed;
    }

    public void setGender (String gen){
        this.gender = gen;
    }

    public void setAge (int age){
        this.age = age;
    }

    public void setWeight (double weight){
        this.weight = weight;
    }

    public void setHeight (double height){
        this.height = height;
    }

    public void setStatus (char c){
        this.status = c;
    }

    //Getters *****************************************************************
    public int getAnimalID(){
        return animalID;
    }

    public String getName(){
        return name;
    }

    public String getSpecies(){
        return species;
    }

    public String getBreed(){
        return breed;
    }

    public String getGender(){
        return gender;
    }

    public int getAge(){
        return age;
    }

    public double getWeight(){
        return weight;
    }

    public double getHeight(){
        return height;
    }

    public char getStatus(){
        return status;
    }
}