/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg2;


public class TestCharacter {
    public static void main(String [] args){
    Character p1 = new Character("Joe", 3,50,50);
    Character p2 = new Character("Bob", 3,50,50);


  
    for(int i = 1; p1.getCurrentLife() >= 0 && p2.getCurrentLife() >= 0 && i<=3; i++){
        System.out.println();
        System.out.println("Round: " + i);
        System.out.println(p1.getName() + ":" + p1.getCurrentLife());
        System.out.println(p2.getName() + ":" + p2.getCurrentLife());  
        
        int a = p1.attack();
        p2.wound(a);
        int b = p2.attack();
        p1.wound(b);
        
        System.out.println(p1.getName() + " attacks " + p2.getName() + " for " + a);
        System.out.println(p2.getName() + " attacks " + p1.getName() + " for " + b);
    
        
        if(p1.getCurrentLife() == p2.getCurrentLife() && i==3){
            
            System.out.println(p2.getName() + "'s Health: " + p2.getCurrentLife());
            System.out.println(p1.getName() + "'s Health: " + p1.getCurrentLife());
            System.out.println("");
            System.out.println("Draw");
            break;
            
        }
        
        else if(p2.getCurrentLife() < p1.getCurrentLife() && i ==3){
            System.out.println(p1.getName() + "'s Health: " + p1.getCurrentLife());
            System.out.println(p2.getName() + "'s Health: " + p2.getCurrentLife());
            System.out.println("");
            System.out.println(p1.getName() + " Wins");
            break;
        }
        
        else if(p1.getCurrentLife() < p2.getCurrentLife() && i==3){
            System.out.println(p1.getName() + "'s Health: " + p1.getCurrentLife());
            System.out.println(p2.getName() + "'s Health: " + p2.getCurrentLife()); 
            System.out.println("");
            System.out.println(p2.getName() + " Wins!");
            break;
        }
     
        
        }
    }

        
    }




