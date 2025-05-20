//problem: Sum Double
// Given two int values, return their sum. Unless the two values are the same, then return double their sum.
// For example, if a=1 and b=2, return 3. If a=2 and b=2, return 8.
// sumDouble(1, 2) → 3
// sumDouble(3, 2) → 5
// sumDouble(2, 2) → 8
// sumDouble(3, 3) → 12
// sumDouble(2, 3) → 5
// Source: https://codingbat.com/prob/p154485

package warmup1;

public class sumDouble{
    
    public int Double(int a, int b) {

        int sum = a + b; //adding up the input values
        if (a == b) { //checking if both input values are the same
            sum = sum * 2; //if so, then doubling the values
        }
        return sum; //returning sum
    }
}