package Core_Java.phase_2.Method;

public class practice {
    public static void main(String[] args) {
        int n = 12;
        int i ;
        int count = 0;
        for (i= 2;i<=(int)Math.sqrt(n);i++)
        {
            if (n%i== 0)
                count++;
        }
        System.out.println(count);
    }
}
