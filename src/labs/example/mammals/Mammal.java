/* 
@author: Seth Purvis
@date: 02/01/2026
@purpose: Week 2 Lab1 Mammal
*/

package labs.example.mammals;

public class Mammal {

    protected String hairColor
    protected String eyeColor
    protected String bodyTemp
    protected String mammalHeight
    protected String mammalLength
    protected String mammalWeight

    public void mammal(String name){

    }

    public void setName(String name){
        this.name = name;
        return;

    }

    public String getName(){
        return this.name;
    }

    public void eat() {
        System.out.println("The " + this.name + " is now eating...");
    }

    public void run() {
        System.out.println("The mammal is running.");
    }

    public void sleep() {
        System.out.println("The mammal is sleeping.");
    }

    public void scratch() {
        System.out.println("The mammal is scratching.");
    }

    public void layDown() {
        System.out.println("The mammal is laying down.");
    }

    public void sit() {
        System.out.println("The mammal is sitting.");
    }

    public void jump() {
        System.out.println("The mammal is jumping.");
    }

    public void walk() {
        System.out.println("The mammal is walking.");
    }

    public void bite() {
        System.out.println("The mammal is biting.");
    }

}