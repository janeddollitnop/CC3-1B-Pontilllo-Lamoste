/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classesandobjects;

/**
 *
 * @author m304user
 */
public class Dog {
    String Name;
    int Age;
    String breed;
    char gender;

public void setName(String dogname){
   Name = dogname;
}
public String getName(){
    return Name;
}
public void setAge(int dogage){
    Age = dogage;
}
public int getAge(){
    return Age;
}
    public void setbreed(String dogbreed){
   breed = dogbreed;
}
        public String getbreed(){
    return breed;
}
        public void setgender(char dogGender){
    gender = dogGender;
}
public char getgender(){
    return gender;
}
}
