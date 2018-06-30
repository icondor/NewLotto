import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author flo
 * @since 30/06/2018.
 */
public class LetterFrequencyInString {

//    public static ... extractFrequencies(String string) {
//
//    }

    public static void main(String[] args) {

        String nextLine = new Scanner(System.in).nextLine();

        System.out.println("Read: " + nextLine);
        System.err.println("This is an error!");

        Map<Character, Integer> frequencies = new HashMap<>();
        for(int i = 0; i < nextLine.length(); i++) {
            Character c = nextLine.charAt(i);
            if(frequencies.containsKey(c)) {
                //crestem valoarea din map cu 1
                //iau valoarea din map
                Integer frecventaCaracter = frequencies.get(c);
                // cresc cu 1
                frecventaCaracter++;
                // adaug inapoi in map
                frequencies.put(c, frecventaCaracter);
            } else {
                // initializam valoarea din map cu 1
                frequencies.put(c, 1);
            }
        }
        System.out.println(frequencies);
    }
}
