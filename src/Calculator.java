
public class Calculator {


    private int result;
        //сложить несколько параметров
    public void summAll(int ... params){
        for(Integer param : params){
            this.result += param;
        }
    }
        //сложить два параметров
    public void add(int a, int b){
         this.result = a + b;
    }
        //вычесть из первого параметра второй
    public void subtract(int a, int b){
         this.result = a - b;
    }

    //вычесть из первого параметра все следующие
    public void subtractAll(int ... params){
        this.result = params[0];
        for(int i = 1;i<params.length;i++){
            this.result -= params[i];
        }
    }


    public void multi(int a, int b){
        this.result = a * b;
    }

    public void multiAll(int ... params){
        for(Integer param : params){
            this.result *= param;
        }
    }

    //число num возводит в степень exp
    public void expo(int num, int ext){
        result = 1;
        for(int i = 0; i<ext ;i++){
            result *= num;
        }
    }


    public int getResult() {
        return result;
    }



    public void clearResult() {
        this.result = 0;
    }

}
/*
* нкжно добавить операции
* вычитания, умножения, деления, возведения в степень
* */