package problem.solving.session2;

import static lessons.lesson0.binary.BinaryUtil.showBitsOf;

public class Flags64 {

    private long state = 0;

    /**
     * Update flag at specified position with specified value
     */
    public void set(boolean value, int position) {
        //00..001
        if (value) {
            // if we want to set 1
            long mask = 1 << position;

            // ???? ???? state
            // 0000 0010 mask
            // ---------
            // ???? ??1?
            state = state | mask;

        } else {
            // if we want to set 0
            // ???? ???? state
            // 1111 1101 mask
            // ---------
            // ???? ??0?
            long mask = ~(1 << position);
            state = state & mask;
        }
    }

    /**
     * Get flag value at specified position
     */
    public boolean get(int position) {
        // ???? ???? state
        // 0000 0010 mask
        // ---------
        long mask = 1 << position;
        return (state & mask) != 0;
    }

    /**
     * Flip flag value at specified position
     */
    public void flip(int position) {
        // ???? ???? state
        // 0000 0010 mask
        // ---------
//        1 XOR 1 = 0
//        0 XOR 0 = 0
//        1 XOR 0 = 1
//        0 XOR 1 = 1
        long mask = 1 << position;
        state = state ^ mask;
    }

    @Override
    public String toString() {
        return "Flags64{" +
                "stateDecimal=" + state + "\n" +
                "stateBinary=" + showBitsOf(state) +
                '}';
    }
}
