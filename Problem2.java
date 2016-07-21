/**
 * Description: This program checks to see if an array of ints contains a leader element and returns
 * the index of the leader element if it exists, other wise returns -1. The complexity of the leader 
 * method is O(N). (Justification in method comments)
 * 
 * Author: Sabina
 */

public class Problem2 {

    /**
     * This method uses one for loop to compare the ints of an array and updates a count to check
     * for an element that occurs for than half of list times and returns the index of the last occurrence
     * of this leader element. Returns -1 if the array contains no leader element.
     *
     * The complexity of the leader method is O(n) because the while loop will
     * require the array to be traversed once making it linear and since the
     * operations within the while loop are constants.
     * 
     * @param A the in array 
     * @return saveIndex the index of the leader element if it exists
     */
    static int leader(int[] A) {

        int counter = 1;
        int item = A[0];
        int saveIndex = -1;

        //For loop 
        for (int i = 1; i < A.length; i++) {
            if (item == A[i]) {
                counter++;
                saveIndex = i;
            } else {
                counter--;
            }
            if (counter == 0) {
                item = A[i];
                counter = 1;
            }
        }
        return saveIndex;
    }
    
    
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static void main(String[] arg) {

        int[] a = {23, 24, 67, 23, 67, 23, 45};     //Test case 1: should return (-1)
        int[] b = {23, 23, 67, 23, 67, 23, 45};     //Test case 2: should return (5)

        int leadIndex = leader(a);

        if (leadIndex > 0) 
            System.out.println("There is a leader element at index " + leadIndex);
          else 
            System.out.println("There is no leader element. Index " + leadIndex);
    }
}
