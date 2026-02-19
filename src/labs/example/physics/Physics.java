package labs.example.physics;
import java.lang.Math;

/*Method Name	equation	    return type	         units            
getDistance	x = v * t	        double	            miles
getVelocity	v = x/t	            double	            mph
getMomentum	p = m * v	        double	            kg m/s
getForce	f = m * a	        double	            kg m/s^2
getWork	w = f * d	            double	            NM or Joules
getKineticEnergy	ke = 1/2 * m * v ^2     double	 NM or Joule
getPotentialEnergy  pe = m * g * h          double.  NM or Joule*/

public class Physics {
    final static double GRAVITY = 9.81; //Constants should always go at the top of the the class. 

    public void physics() {

    }
    //methods (essentially little functions you have pre built)
    public double getDistance(double velocity, double time)
    {
        double distance = velocity * time;
        return distance/60;
        //dividing by 60 because time is in minutes
    }
    public double getVelocity(double distance, double time)
    {
        return distance / time; 
    }
    public double getKineticEnergy(double mass, double velocity)
    {
        //double kE = (1/2) * mass * (velocity * velocity); Option without using the math library
        return (1/2) * mass * Math.pow(velocity, 2);
    }

    public double getLightSpeedInMPH()
    {
        //speed is 186282 miles/second
        //3600 seconds in an hour
        return 186282 * 3600;
    }

        //showing this for the sake of fun -crystal
    public double getKnownDistanceToEarth()
    {
        return 92947266.72;
    }
    public double getTimeFromSunToEarthInHours()
    {
        //Known Distance to the Earth from the Sun is: 92947266.72 miles
        return getKnownDistanceToEarth() / getLightSpeedInMPH(); 
        //return 92947266.72 / getLightSpeedInMPH();
    }
    public void logEarthToSunInvalidDistance() 
    {
        System.out.println("INVALID DISTANCE:" + "\n" + "Distance is less than the number of miles from the earth to the sun");
    }

    //conversions 


}
