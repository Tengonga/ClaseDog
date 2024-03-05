public class Dog {
    //State
    private String name;
    private String breed;
    private int age;
    private static int numDogs = 0;

    //CONSTRUCTOR
    public Dog(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        numDogs++;
    }

    //BEHAVIOUR
    public void bark(){
        System.out.println("Barking");
    }
    public void  wagTail(){
        System.out.println("wagging Tail");
    }

    //GETTERS AND SETTERS
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getBreed() {
        return this.breed;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }
    public int getAge() {
        return this.age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public static int getNumDogs() {
        return numDogs;
    }
    public static void setNumDogs(int numDogs) {
        Dog.numDogs = numDogs;
    }
}
