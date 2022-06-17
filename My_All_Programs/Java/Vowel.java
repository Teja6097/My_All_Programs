// Java program to count frequencies of array items
import java.util.Arrays;
 
class GFG
{
public static void countFreq(String arr[], int n)
{
    boolean visited[] = new boolean[n];
     
    Arrays.fill(visited, false);

    for (int i = 0; i < n; i++) {

        if (visited[i] == true)
            continue;
 
        // Count frequency
        int count = 1;
        for (int j = i + 1; j < n; j++) {
            if (arr[i] == arr[j]) {
                visited[j] = true;
                count++;
            }
        }
        System.out.println(arr[i] + " " + count);
    }
}

public static void main(String []args)
{
    String arr[] = new String[]{ "London" , "Paris", "Barcelona", "London", "Bangalore", "California", "Paris", "Amsterdam", "Barcelona", "London" };
    int n = arr.length;
    System.out.print(n);
    countFreq(arr, n);
}
}
