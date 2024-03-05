public class Demo {
    public static void main (String[] args){

        Dog rufus = new Dog("Rufus","Dalmatian",12);
        Dog buck = new Dog("buck","Doberman",2);

        System.out.println("---------------------");
        System.out.println(rufus.getName());
        System.out.println(rufus.getBreed());
        System.out.println(rufus.getAge());
        System.out.println("---------------------");
        System.out.println(buck.getName());
        System.out.println(buck.getBreed());
        System.out.println(buck.getAge());
        System.out.println("---------------------");
        System.out.println("Número de perros: "+Dog.getNumDogs()+" perros");
        System.out.println("---------------------");

    }
}
