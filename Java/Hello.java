public class Hello {

    public static void main(String[] args) {
        System.out.println("Hello Aayush.");

        boolean isAlien = false;
        if (isAlien ==  false){
            System.out.println("This is what i not  get");
            System.out.println("This is what i not  get part 2");
        }
        int a = 18;
        String age = (a >= 18) ? "DL can issue" : "DL cannot issue";
        System.out.println("The man's " + (age)+".");

        double d = 20.00;
        double t = 80.00;
        double sumproduct = (d+t)*100;
        System.out.println(sumproduct);
        double sumproduct1 = sumproduct % 40.00;
        System.out.println(sumproduct1);

        boolean sumproduct2 = (sumproduct1 == 0 ) ? true : false ;
        System.out.println(sumproduct2);

        if (!sumproduct2){
            System.out.println("got some remainder");
        }
    }
}
