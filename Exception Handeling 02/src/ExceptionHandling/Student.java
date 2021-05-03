package ExceptionHandling;

public class Student {
    private String name;
    private int roll;
    private double GPA;

    public void setName(String name) throws InvalidNamingException {
        int c1 = 0, c2 = 0;
        for(int i=0; i<name.length(); i++){
            if(name.charAt(i)>='A' && name.charAt(i)<='Z'){
                c1++;
            }
            else if(name.charAt(i)==' '){
                c2++;
            }
        }
        if(c1!= 0 && (c1+c2 ==name.length())){
            this.name = name;
        }
        else{
            throw new InvalidNamingException("You must input a valid name.");
        }
    }

    public void setRoll(int roll) throws InvalidRollException {

        if(roll>=1201 && roll<=1233){
            this.roll = roll;
        }
        else{
            throw new InvalidRollException("Invalid roll number. " +
                    "Roll number range must be 1201 to 1233.");
        }
    }

    public void setGPA(double GPA) throws InvalidGPAException {

        if(GPA<=10.00 && GPA>=0.00){
            this.GPA = GPA;
            System.out.println();
        }
        else{
            throw new InvalidGPAException("Invalid input GPA. " +
                    "GPA range must be 0.00 to 10.00.");
        }
    }

    public void checkEligibility() throws LowGPAException {
        if(this.GPA >=9.00){
            System.out.println("Name : " + this.name +
                    "\nRoll : "+this.roll+"\nEligibility : Eligible\n");
        }
        else{
            System.out.println("Name : " + this.name +
                    "\nRoll : "+this.roll+"\nEligibility : Not Eligible\n");
            double requiredGPA = 9.00 - this.GPA;
            throw new LowGPAException(requiredGPA);
        }
    }

}
