import java.util.Scanner;

/**
 * Created by Андрей on 16.04.2016.
 */
public class InteractRunner {
    public static void main(String[] arg){
        Calculator calc = new Calculator();
        calc.expo(4,4);
        int res = calc.getResult();
        System.out.println(res);
//        Scanner reader = new Scanner(System.in);
//        try {
//            Calculator calc = new Calculator();
//            String exit = "n";
//            while (!exit.equals("y")){
////                System.out.println("Enter first arg");
////                String  first = reader.next();
////                System.out.println("Enter second arg");
////                String  second = reader.next();
////                calc.subtract(Integer.valueOf(first), Integer.valueOf(second));
////                System.out.println("result =" + calc.getResult());
////                calc.clearResult();
////                System.out.println("Exit yes/no");
////                exit = reader.next();
//
////                int res;
////                calc.subtractAll(50,10,10,10);
////                res = calc.getResult();
////                System.out.println(res);
////                System.out.println("Exit yes/no");
////                exit = reader.next();
//            }
//        }finally {
//            reader.close();
//        }
    }
}
