package labs.example.physics;

public class Main {
    public static void main(String[] args) {
        //PROPERTIES
        //makes sure to assign values to these later
        double velocity = 100; //mph
        double time = 20; //minutes
        double mass; 
        double acceleration; 
        
        

        //VARIABLES 
        double foundvelocity; 
        double force; 
        double distance; 
        double momentum; 
        double work; 
        double kinecticEnergy; 
        double potentialEnergy; 

        //objects (calling your physics class)
        Physics physics = new Physics();

        distance = physics.getDistance(velocity, time); //same thing as coding distance = velocity * time; 
        foundvelocity = physics.getVelocity(distance, time);
        

    }
}