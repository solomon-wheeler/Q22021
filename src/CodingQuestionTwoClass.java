import java.util.ArrayList;
import java.lang.Math;

/**
 *  Coding Question Two class:
 *  
 *  Develop your solution by completing this class.
 *  Do not change the name of this class.
 *  
*/
public class CodingQuestionTwoClass implements FlightInterface{

    public double calculateFlightDistance(ArrayList<PolarCoordinate> controlPoints){
        double xs[] = new double[controlPoints.size()];
        double ys[] = new double[controlPoints.size()];
        for (int i =0; i < controlPoints.size(); i++){
            PolarCoordinate current_polar = controlPoints.get(i);
            xs[i] = current_polar.getR() * Math.cos(current_polar.getTheta());
            ys[i] = current_polar.getR() * Math.sin(current_polar.getTheta());
        }
        FlightCalculator this_calculator  = new FlightCalculator();
        return this_calculator.calculateFlightDistance(xs,ys);
    }

}
