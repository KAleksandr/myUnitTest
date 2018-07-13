public class Calculator {
    public double summa(double a, double b){
        return a+b;
    }

    public double summa(int a, int b){
        return  a+b;
    }
    public double multiplate(double a, double b){
        return a*b;
    }
    public double multiplate(int a, int b){
        return a*b;
    }

    public int getdivision(int a, int b){
        if(b !=0){
            return a/b;
        }
        else {
            throw new ArithmeticException("To divide by zero is forbidden");
        }
    }
    public double getdivision(double a, double b){
        if(b !=0){
            return (a/b);
        }
        else {
        throw new ArithmeticException("To divide by zero is forbidden");
    }
    }
}
