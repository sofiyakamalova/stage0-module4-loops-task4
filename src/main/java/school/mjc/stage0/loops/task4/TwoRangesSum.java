package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        int skippedSum = 0;
        int countedSum = 0;

        if (numberToSkip > lastInRow) {
            System.out.println("number to skip is bigger than the last");
            return;
        }

        if (lastInRow < 0) {
            System.out.println("last number in row is negative");
            return;
        }

        for (int i = 1; i <= numberToSkip; i++) {
            if (i % numberToSkip != 0) {
                skippedSum += i;
            }
        }

        for (int i = 1; i <= lastInRow; i++) {
            countedSum += i;
        }

        System.out.println("skipped sum is " + skippedSum);
        System.out.println("counted sum is " + countedSum);
    }

    public static void main(String[] args) {
        TwoRangesSum twoRangesSum = new TwoRangesSum();

        if (args.length != 2) {
            System.out.println("Usage: java TwoRangesSum <numberToSkip> <lastInRow>");
            return;
        }

        int numberToSkip = Integer.parseInt(args[0]);
        int lastInRow = Integer.parseInt(args[1]);

        twoRangesSum.printSumOfTwoRanges(numberToSkip, lastInRow);
    }
}
