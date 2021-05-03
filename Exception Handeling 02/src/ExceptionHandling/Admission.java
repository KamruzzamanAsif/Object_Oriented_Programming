package ExceptionHandling;

import java.util.Scanner;

public class Admission {
    public static  void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Student std = new Student();

        try{
            System.out.println("Student name(in uppercase): ");
            String name = scanner.nextLine(); // name must be in uppercase letter
                                              // otherwise exception will occur
            std.setName(name);

            System.out.println("Student Roll: ");
            int roll = scanner.nextInt(); // roll must be in range 1201 to 1233
                                          // otherwise exception will occur
            std.setRoll(roll);

            System.out.println("Student GPA(SSC+HSC): ");
            double marks = scanner.nextDouble(); // GPA range 0.00 to 10.00
                                                 // otherwise exception will occur
            std.setGPA(marks);

            std.checkEligibility();

        }catch(InvalidNamingException e){
            System.out.println("Exception occurred:\n"+e);
            e.printStackTrace();
        }catch(InvalidRollException f){
            System.out.println("Exception occurred:\n"+f);
            f.printStackTrace();
        }catch(InvalidGPAException g){
            System.out.println("Exception occurred:\n"+g);
            g.printStackTrace();
        }catch(LowGPAException h){
            System.out.println("Need "+h.getGPA()+
                    " more GPA to Sit for Medical Admission Test.\n");
        }

    }
}
