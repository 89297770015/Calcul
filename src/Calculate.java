/**
 * Created by Андрей on 15.04.2016.
 */
public class Calculate {

    public static void main(String[] args) {
        int a = Integer.valueOf(args[0]);
        int b = Integer.valueOf(args[2]);
        String operator = String.valueOf(args[1]);


        if(operator.equals("+"))
            System.out.println("summ is "+ (a+b));
        if(operator.equals("-"))
            System.out.println("difference is "+ (a-b));
        if(operator.equals("*"))
            System.out.println("work  is "+ (a*b));
        if(operator.equals("^")) {
            int res = a;
            for(int i = 0;i<b;i++){
                res = res * a;
            }
            System.out.println("degree is "+ res);
        }

        if(operator.equals("/")&&b!=0)
            System.out.println("divide is "+ (a/b));
        if(operator.equals("/")&&b==0)
            System.out.println("divide by zero is impossible");

    }


}


