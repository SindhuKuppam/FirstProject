package JavaBasics;

public class IfElse {
    public static void main(String[] args) {
        int i=20;
        int j=40;
        if(i>j)
        {
            System.out.println("i is greater");
        }
        else
            System.out.println("j is greater");
        int a1 = 200;
        int b1 = 100;
        int c1 = 100;
        if(a1==b1 & a1==c1) // first checks if all numbers are equal or not
            System.out.println("a1 , b1 and c1 are equal numbers");
        else if(a1>b1 & a1>c1)
            System.out.println("a1 is highest");
        else if (b1>c1)
            System.out.println("b1 is highest");
        else
            System.out.println("c1 is highest");

    }
}
