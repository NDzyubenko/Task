import java.util.Scanner;

class Time {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = sc.nextLine();
        System.out.println("Enter hour in 24hr format");

        int hour = sc.nextInt();
        System.out.println("Enter minute");
        int minute = sc.nextInt();
        System.out.println("Your time " + hour + ":" + minute);
        if (hour >= 3 && hour < 12)
            System.out.println("Good Morning! " + name);
        else if (hour >= 12 && hour < 16)
            System.out.println("Good Afternoon, " + name);
        else if (hour >= 16 && hour < 21)
            System.out.println("Good Evening, " + name);
        else if (hour >= 21 && hour < 24)
            System.out.println("Good night, " + name);
        else if (hour >= 0 && hour <= 2)
            System.out.println("Good night, " + name);
        for (int i = 0; i < 3; i++) {
            System.out.println("Please enter number");
            int number = sc.nextInt();
            if (number >= 2 && number <= 1000) {
                for (int n = 2; n <= number; n++) {
                    boolean isPrime = true;
                    for (int j = 2; j < n; j++) {
                        if ((n % j) == 0) {
                            isPrime = false;
                        }
                    }
                    if (isPrime) System.out.println(n + " is Prime");
                }
                break;
            }
            System.out.println("You can write a number from 2 to 1000");
            System.out.println("Let's try again");
        }
    }
}






