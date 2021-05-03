package ExceptionHandling;

public class LowGPAException extends Exception{
    private double GPA;

    public LowGPAException(double GPA){
        this.GPA = GPA;
    }

    public double getGPA(){
        return this.GPA;
    }
}