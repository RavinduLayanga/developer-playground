/*
 * HackerRank DSA: Arrays - DS problem
 * 
 * Note: This file is for reporting/archival purposes only. 
 * To execute this code, it must be run on the HackerRank console 
 * because it relies on their specific environment variables.
 * 
 * The main class name was changed from 'Solution' to 'ReverseArrayProblem'
 * for better repository organization.
 */

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'reverseArray' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static List<Integer> reverseArray(List<Integer> a) {
        // Write your code here
        List<Integer> result = new ArrayList<>();
        for (int i = a.size() - 1; i >= 0; i--) {
            int value = a.get(i);
            result.add(value);
        }
        return result;
    }

}

public class ReverseArrayProblem {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> res = Result.reverseArray(arr);

        bufferedWriter.write(
                res.stream()
                        .map(Object::toString)
                        .collect(joining(" "))
                        + "\n");

        bufferedReader.close();
        bufferedWriter.close();
    }
}
