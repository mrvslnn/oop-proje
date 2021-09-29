package replitLists;

public class List08 {
    /*
     *
     * Write a java program which accept a sentence as parameter, than reverses
     * sentence by using StringBuilder and checks if sentence is palindrome or not
     * (without case sensitivity) Eg : input : I love Java Output: "Reversed
     * sentence : avaJ evol I . It is not a palindrome"
     *
     */
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("I love Java");
        StringBuilder sb1 = new StringBuilder();
        sb1.append(sb.reverse());
        System.out.println("Reversed sentence :" + sb1);

        if (sb1.equals(sb) == true) {
            System.out.println("It is a palindrome");
        } else {
            System.out.println("It is not a palindrome");
        }

    }
}
