package rpg;

/**
 *
 * @author m304user
 */
public class TestCharacter {
    public static void main(String [] args){
    Character p1 = new Character("Golden State Warriors", 25,55,20,40,45);
    Wizard p2 = new Wizard("Washington Wizard", 15,50,40,20,25);



  
    for(int i = 1; p1.getCurrentLife() >= 0 && p2.getCurrentLife() >= 0 && i<=3; i++){
        System.out.println();
        System.out.println("== Round:" + i+" ==");
        System.out.println(p1.getName() + ":" + p1.getCurrentLife());
        System.out.println(p2.getName() + ":" + p2.getCurrentLife());  
        
        int a = p1.attack();
        p2.wound(a);
        int b = p2.attack();
        p1.wound(b);
        int c = p2.castLightningBolt();
        p2.LightningBolt(c);
        int d = p2.castHeal();
        p2.heal(d);
        int damage1 = p1.attack(), damage2 = p2.castLightningBolt(), heal = p2.castHeal();
        
        System.out.println(p1.getName() + " attacks " + p2.getName() + " for " + a);
        System.out.println(p2.getName() + " attacks " + p1.getName() + " for " + b);
        System.out.println(p2.getName() + "cast LightningBolt" + " for " + c );
        System.out.println(p2.getName() + " Healed "+"for " + d);
       
       
        if(p1.getCurrentLife() == p2.getCurrentLife() && i==3){
            
            System.out.println(p2.getName() + "'s Health: " + p2.getCurrentLife());
            System.out.println(p1.getName() + "'s Health: " + p1.getCurrentLife());
    
            System.out.println("");
            System.out.println("Draw!");
            break;
            
        }
        
        
        else if(p2.getCurrentLife() < p1.getCurrentLife() && i ==3){
            System.out.println(p1.getName() + "'s Health: " + p1.getCurrentLife());
            System.out.println(p2.getName() + "'s Health: " + p2.getCurrentLife());
            System.out.println(p2.getName() + "cast LightningBolt" + " for " + b );
            System.out.println("");
            System.out.println(p1.getName() + " Wins!");
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
