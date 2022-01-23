package JavaBasics;

public class StringConcat {
    public static void main(String[] args) {
        //+--concatenation operator
        int i=100;
        int j=200;
        String x="Hello";
        String y="World";
        System.out.println(i+j);//300 --execution starts left to right
        System.out.println(i+j+x+y);//100+200+Hello+World--300HelloWorld
        System.out.println(x+y+i+j);//Hello+World+100+200..HelloWorld100200
        System.out.println(x+y+(i+j));//HelloWorld+(100+200)--HelloWorld300
        System.out.println(i+j+x+y+i+x+j+y);//300HelloWorld100Hello200World
        System.out.println("add "+(i+j));
    }
}

