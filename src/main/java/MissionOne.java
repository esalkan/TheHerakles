/**
 * @author esalkan
 * @vcard https://esalkan.com
 * @project TheHerakles Task No :82
 * @type Desktop Web Automation
 * @repo https://github.com/esalkan/TheHerakles.git
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissionOne {

    public static void main(String[] args) {
        // Create empty a list of integers
        List<Integer> list = Arrays.asList(0,1,0,3,0,5,0,7,0,9);

        // Print the list after moving all the zeros to the end
        for (Integer integer : moveToBackAllZeroInList(list)) {
            System.out.println("integer = " + integer);
        }
    }


    public static List<Integer> moveToBackAllZeroInList(List<Integer> list) {
        // Create a new list
        List<Integer> newList = new ArrayList<>();
        // Create a counter for the number of zeros
        int count = 0;
        // Loop through the list
        for (Integer integer : list) {
            // If the integer is zero, increment the counter
            if (integer == 0) {
                count++;
            } else { // If the integer is not zero, add it to the new list
                newList.add(integer);
            }
        }
        // Loop through the new list and add the number of zeros to the end
        for (int i = 0; i < count; i++) {
            newList.add(0);
        }
        // Return the new list
        return newList;
    }
}
