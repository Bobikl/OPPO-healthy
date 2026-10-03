package com.example.opponotificationrelay;

/** Host policy tests; does not simulate Android callback timing. */
public final class ScreenFilterTest {
    private static int checks;
    private static void check(boolean value) {
        checks++;
        if (!value) throw new AssertionError("screen check " + checks);
    }
    private static boolean delivered(boolean enabled, boolean arrivalOn, boolean sendOn,
                                     boolean removed, boolean own) {
        return !ScreenForwardPolicy.block(enabled, arrivalOn, removed, own)
            && !ScreenForwardPolicy.block(enabled, sendOn, removed, own);
    }
    public static void main(String[] args) {
        for (int bits=0; bits<16; bits++) {
            boolean enabled=(bits&1)!=0, on=(bits&2)!=0;
            boolean removed=(bits&4)!=0, own=(bits&8)!=0;
            check(ScreenForwardPolicy.block(enabled,on,removed,own)==(bits==3));
        }
        for (int bits=0; bits<32; bits++) {
            boolean enabled=(bits&1)!=0, arrivalOn=(bits&2)!=0, sendOn=(bits&4)!=0;
            boolean removed=(bits&8)!=0, own=(bits&16)!=0;
            check(delivered(enabled,arrivalOn,sendOn,removed,own)
                ==(!enabled || removed || own || (!arrivalOn && !sendOn)));
        }
        // A rejected arrival cannot be revived merely by switching the screen off.
        check(!delivered(true,true,false,false,false));
        // Queued while off, then taken while on: discarded rather than delayed.
        check(!delivered(true,false,true,false,false));
        // Only arrival/send are sampled: an intervening on/off cycle is not tracked.
        check(delivered(true,false,false,false,false));
        System.out.println("Screen filter checks passed: " + checks);
    }
}
