public class Result {
    public static  void main(String[] args){
        Student a = new Student(1,30);
        try{
            a.checkResult();
        }catch(LowMarksException e){
            System.out.println("Need "+e.getMarks()+" more marks to pass.\n");
        }

        Student b = new Student(2,75);
        try{
            b.checkResult();
        }catch(LowMarksException e){
            System.out.println("Need "+e.getMarks()+" more marks to pass.\n");
        }
    }
}
