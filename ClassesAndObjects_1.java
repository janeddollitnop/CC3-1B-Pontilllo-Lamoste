
package classesandobjects;

import java.util.Scanner;

public class ClassesAndObjects_1 {

   
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        Dog Jeremiah = new Dog();
        Jeremiah.setName("Jeremiah");
        String miah1 = Jeremiah.getName();    
        System.out.println("Name: "  );
        String s = a.next();
       Jeremiah.setAge(19);
       int age = Jeremiah.getAge();
        System.out.println("Age: ");
       int i = a.nextInt();
        Dog Lamoste = new Dog(); 
        Lamoste.setbreed("Labrador");
        String miah2 = Lamoste.getbreed();
        System.out.println("Breed: ");
        String miah = a.next();
        Lamoste.setgender('M');
        char gender= Lamoste.getgender();
        System.out.println("Gender:");
        char ge = a.next().charAt(0);
          Character dog = a.next().charAt(0);
       
    }

}
