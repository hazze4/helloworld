import java.util.Scanner;

public class Main
{

    public static void goodbye(String name)
    {
        System.out.println("Goodbye, " + name);
    }
    public static void main(String[] args)
    {
        System.out.println("First Java Application!");
        Scanner sc = new Scanner(System.in);
        String name;
        System.out.print("Enter your name: ");
        name = sc.nextLine();
        goodbye(name);
        
    }        
}
