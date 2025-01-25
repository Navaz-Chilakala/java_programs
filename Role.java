import java.io.*;
import java.lang.*;//default package
class Role{
    public static void main(String[] args) throws Exception{

        int exp = 13;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String exp1 = br.readLine ();
        exp=Integer.parseInt(exp1);
        if (exp >= 0 && exp <= 2) {
            System.out.println("Associate Engineer");
        } else if (exp >= 3 && exp <=5) {
            System.out.println("Software Engineer");
        } else if (exp >= 6 && exp <=9) {
            System.out.println("Senior Software Engineer");
        } else if (exp >= 10) {
            System.out.println("Architect");
        } else {
            System.out.println("Invalid Experience");
        }
    }
}