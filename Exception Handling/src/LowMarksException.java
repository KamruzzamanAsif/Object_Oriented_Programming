public class LowMarksException extends Exception{
    private double marks;

    public LowMarksException(double marks){
        this.marks = marks;
    }

    public double getMarks(){
        return this.marks;
    }
}
