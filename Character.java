/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg2;


public class Character {
    static Dice dice = new Dice();
    private String name;
    private int strength;
    private int dexterity;
    private int intelligence;
    private int currentLife;
    private int maxLife;


public Character(String n, int s, int d, int i) {
 this.name=n;
 this.strength=s;
 this.dexterity=d;
 this.intelligence=i;
 this.maxLife=dice.roll()+100;
 this.currentLife=this.maxLife;
 
}

public int attack() {
     int attack=dice.roll()+strength;
     return attack;
}

public void wound(int damage) {
    currentLife=currentLife-damage;
    
}

public void heal(int heal) {
     if(currentLife>maxLife)
         currentLife=currentLife+heal;
}

public String getName() {
    return name;
}

public int getStrength() {
    return strength;
}

public int getDexterity() {
    return dexterity;
}

public int getIntelligence() {
    return intelligence;
}

public int getCurrentLife() {
    return currentLife;
}

public int getMaxLife() {
    return maxLife;
}
public void setName(String name){
        this.name=name;
}
public void setStrength(int strength){
        this.strength=strength;
}
public void setDexterity(int dexterity){
        this.dexterity=dexterity;
}
public void setIntelligence(int intelligence){
        this.intelligence=intelligence;
}
public void setMaxLife(int maxLife){
        this.maxLife=maxLife;
}
public void setCurrentLife(int currentLife){
    this.currentLife=currentLife;
}
public int decreaseCurrentLife(int attack){
    return attack;
}
}
