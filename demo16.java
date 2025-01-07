public class demo16 {
    public static void main(String[] args) {
        // Declare variables
        int num = 5;

        // Unary plus
        System.out.println("Unary plus: " + (+num));

        // Unary minus
        System.out.println("Unary minus: " + (-num));

        // Increment operator (prefix and postfix)
        System.out.println("Original value: " + num);
        System.out.println("Postfix increment: " + (num++));
        System.out.println("Value after postfix increment: " + num);
        System.out.println("Prefix increment: " + (++num));
        System.out.println("Value after prefix increment: " + num);

        // Decrement operator (prefix and postfix)
        System.out.println("Postfix decrement: " + (num--));
        System.out.println("Value after postfix decrement: " + num);
        System.out.println("Prefix decrement: " + (--num));
        System.out.println("Value after prefix decrement: " + num);

        // Logical NOT
        boolean flag = true;
        System.out.println("Logical NOT of " + flag + ": " + (!flag));
    }
}
