package school.mjc.stage0.loops.task4;

public class NumberToBreakOn {
    public void printNumbersUntilWithBreakOn(int toBreakWith, int numberToGoUntil) {
        if (numberToGoUntil < toBreakWith) {
            System.out.println("iterating till the end");
            for (int i = 1; i <= numberToGoUntil; i++) {
                System.out.println(i);
            }
        } else {
            for (int i = 1; i <= toBreakWith; i++) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        NumberToBreakOn numberToBreakOn = new NumberToBreakOn();

        if (args.length != 2) {
            System.out.println("Usage: java NumberToBreakOn <toBreakWith> <numberToGoUntil>");
            return;
        }

        int toBreakWith = Integer.parseInt(args[0]);
        int numberToGoUntil = Integer.parseInt(args[1]);

        numberToBreakOn.printNumbersUntilWithBreakOn(toBreakWith, numberToGoUntil);
    }
}
