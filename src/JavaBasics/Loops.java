package JavaBasics;

public class Loops {
    public static void main(String[] args) {
        //to avoid code repetition--loops are used
        //while loop
        //used when no of iterations is not known
        //repeat block of code until  specific condition is met
        //generates infinite loop if we don't specify increment/decrement operator

        int i=1;
        while(i<=10)
        {
            System.out.println(i);
            i++;
        }
       //for loop
        //used when we know the no of iterations

        for(int k=10;k>=-10;k--)
        {
            System.out.println(k);
        }
        //do-while--executes at least once
int k=1;
        do
            {
                System.out.println(k);
                k++;
            }while(k<=10);


       }
}
