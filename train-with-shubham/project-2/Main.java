import java.util.Scanner;

public class Main {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter the Age :- ");
        int age = sc.nextInt();
        System.out.print("Your Age is :- " + age);
    }
}

/*  
$ docker run --rm project-2 
Please Enter the Age :- Exception in thread "main" java.util.NoSuchElementException
        at java.base/java.util.Scanner.throwFor(Scanner.java:937)
        at java.base/java.util.Scanner.next(Scanner.java:1594)
        at java.base/java.util.Scanner.nextInt(Scanner.java:2258)
        at java.base/java.util.Scanner.nextInt(Scanner.java:2212)
        at Main.main(Main.java:7)
*/

/* In Itractive mode 
$ docker run -it --rm project-2
Please Enter the Age :- 23
Your Age is :- 23
*/