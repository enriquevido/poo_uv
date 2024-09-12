import java.util.Scanner;

public class Dog {

//    private String dogName;

//    void changeName(String newName) {
//        this.dogName = newName;
//    }
//
//    void getName(){
//        System.out.println(dogName);
//    }

//    String name;
//    int age;
//
//    Dog(String newName, int newAge){
//        name = newName;
//        age = newAge;
//    }

    String bark;

    Dog (String bark){
        this.bark = "Guau";
    }

    Dog(String bark, String greet){
        this.bark = greet;
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog("Guau");
        System.out.println(dog1.bark);
        Dog dog2 = new Dog(dog1.bark, "Miguelito");
        System.out.println(dog2.bark);

    }
}