/**
 *
 * @author Trevor Hartman
 * @author Linh Dinh
 *
 * @since Version 1.0
 *
 */
// Import the Scanner tool used for reading (All external packages/libraries/apis are imported similarly this)
import java.util.Scanner;

public class MrRoboto {
    /**
     * Teaching Mr. Roboto how to listen to us.
     * @param args Command line arguments [The source file path, The target file path, ...]
     **/
    public static void main(String[] args) {
        // The instantiation code for a Scanner instance.
        Scanner scanner = new Scanner(System.in);

        // Concatenate the user response to this String.
        String domo = "Domo arigato ";

        System.out.print("My name is Mr. Roboto, are you Kilroy? ");
        // Write your program here
        /* declare a variable named response
        and make it get a line of input read by the Scanner variable.*/
        String response = scanner.nextLine();
        System.out.println(domo + response); //concatenate input to String variable domo
    }
}
