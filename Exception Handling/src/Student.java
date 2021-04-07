public class Student {
    private int roll;
    private double marks;

    public Student(int roll, double marks){
        this.roll = roll;
        this.marks = marks;
    }
    public void checkResult() throws LowMarksException{
        if(this.marks>=40){
            System.out.println("Roll: "+this.roll+" Passed\n");
        }
        else{
            System.out.println("Roll: "+this.roll+" Failed\n");
            double requiredMarks = 40 - this.marks;
            throw new LowMarksException(requiredMarks);
        }
    }

    public int getRoll(){
        return this.roll;
    }

    public double getMarks(){
        return this.marks;
    }

}
