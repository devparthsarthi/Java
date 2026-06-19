//One day a highly important task was commissioned to Vasya — writing a program in one night. The program consists of n lines of code.Vasya is already exhausted, so he works like this:First he writes v lines of code.Then he drinks a cup of tea.After that he writes ⌊v / k⌋ lines.Then another cup of tea.Then he writes ⌊v / k²⌋ lines.And so on:Here, ⌊a / b⌋ denotes the integer part of the division of a by b.The moment ⌊v / k^p⌋ = 0, Vasya falls asleep immediately and wakes up only in the morning, when the program should already be finished.Your task is to determine the minimum possible value of v such that Vasya writes at least n lines of code before falling asleep.
import java.util.*;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.close();

        long low = 1;
        long high = (long) 1e18;
        long result = high;

        while (low <= high) {
            long mid = (low + high) / 2;
            if (canWrite(n, k, mid)) {
                result = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        System.out.println(result);
    }

    private static boolean canWrite(int n, int k, long v) {
        long total = 0;
        long current = v;
        while (current > 0) {
            total += current;
            current /= k;
        }
        return total >= n;
    }
}