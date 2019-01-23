
package classesandobjects;

import java.util.Scanner;

public class ClassesAndObjects_1 {

   
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        Dog Jeremiah = new Dog();
        
        
            
        
        String s = a.next();
        Jeremiah.setName(s);
        String miah1 = Jeremiah.getName();
        System.out.println("Name"+miah1);
        
      
       System.out.println("Age: ");
       int age= a.nextInt();
       int dog2=Jeremiah.getAge();
       Jeremiah.setAge(age);
       
       
       System.out.println("Breed: ");
        String breed = a.next();
        String dog3= Jeremiah.getbreed();
        Jeremiah.setbreed(breed);
        
       
        System.out.println("Gender:");
        char gender = a.next().charAt(0);
        char dog4 = Jeremiah.getgender();
         Jeremiah.setgender(gender);
       
    }

}
