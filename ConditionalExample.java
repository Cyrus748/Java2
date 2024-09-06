public class ConditionalExample {
    public static void main(String[] args) {
        int number = 10;
        checkEvenOrOdd(number);
    }

    public static void checkEvenOrOdd(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " is even.");
        } else {
            System.out.println(num + " is odd.");
        }
    }
}
