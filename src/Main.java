public class Main {
    public static void main(String[] args) {
        //  | a- b | / (a + b) ^3 - √c
        System.out.println(calculate(1,2,3));

    }

    public static double calculate(int a,int b , int c){
        return (Math.abs(a-b))/(Math.pow((a+b),3)) - Math.sqrt(c);

    }
}
