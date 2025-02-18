package Core_Java.phase_1.Programing_Lectures_Codes;

public class StudentISPassFail {
    public static void main(String[] args) {
         int maths = 54;
        int bio = 35;
        int physics = 51;
        int chemistry = 53;

        if (maths>=35   &&  chemistry>=35   && physics>= 35 && bio>= 35){
            System.out.println("student is Pass in the exam ");

        }
        else {
            System.out.println("Student is fail  in  exam");
        }



        if (maths< 35 || chemistry < 35 || physics < 35 || bio <  35)
            System.out.println("The Student is fail in the exam");
        else
            System.out.println("The Student is Pass in the exam");
    }
}
