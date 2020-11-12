package lessons.lesson0.binary;

import java.math.BigDecimal;

public class FloatingPointComparison {

    public static void main(String[] args) {
//        doubles();
        bigDecimals();
    }

    private static void doubles() {
        double d = 0.0;
        while (d < 42.0) {
            System.out.println(d + " | ulp = " + Math.ulp(d));
            d += 0.1;
        }
    }

    private static void bigDecimals() {
        BigDecimal d = BigDecimal.ZERO;
        BigDecimal limit = BigDecimal.valueOf(42.0);
        BigDecimal increment = BigDecimal.valueOf(0.1);

        while (d.compareTo(limit) < 0) {
            System.out.println(d);
            d = d.add(increment);
        }
    }
}
