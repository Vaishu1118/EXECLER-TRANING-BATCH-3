public class FizzBizz {

    public void printFizzBizz(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + " - FizzBizz");
            } else if (i % 3 == 0) {
                System.out.println(i + " - Fizz");
            } else if (i % 5 == 0) {
                System.out.println(i + " - Bizz");
            } else {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        // Example: Check numbers from 1 to 50
        FizzBizz fizzBizz = new FizzBizz();
        fizzBizz.printFizzBizz(1, 50);
    }
}
