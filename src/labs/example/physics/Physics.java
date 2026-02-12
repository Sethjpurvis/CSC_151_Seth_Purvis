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
    public double getDistance(double velocity, double time){
        double distance = velocity * time;
        return distance;
        //return velocity * time;
    }


}