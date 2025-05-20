package warmup1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class monkeyTroubleTest {
    private final monkeyTrouble monkeyTrouble = new monkeyTrouble();

    @Test

    void bothSmiling() {
        assertTrue(monkeyTrouble.Trouble(true, true), "Both monkeys are smiling");
    }

    @Test
    void bothnotSmiling() {
        assertTrue(monkeyTrouble.Trouble(false, false), "Both monkeys are not smiling");
    }

    @Test
    void oneSmiling() {
        assertFalse(monkeyTrouble.Trouble(false, true), "one monkey is smiling");
        assertFalse(monkeyTrouble.Trouble(true, false), "one monkey is smiling");
    }

}
