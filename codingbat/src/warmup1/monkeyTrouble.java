/* problem: monkeyTrouble
   We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling. We are in trouble if
   they are both smiling or if neither of them is smiling. Return true if we are in trouble.

   monkeyTrouble(true, true) → true
   monkeyTrouble(false, false) → true
   monkeyTrouble(true, false) → false
 */

package warmup1;

public class monkeyTrouble {
    public boolean Trouble(boolean a, boolean b){
        if (a && b) {
            return true;
        }
        else if (a == b){
            return true;
        }
        return false;
    }
}
