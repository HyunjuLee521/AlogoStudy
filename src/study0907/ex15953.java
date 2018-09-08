package study0907;

import java.util.Scanner;

class ex15953 {
    private int totalAwardedPeopleCountAt2017 = 21;
    private int[] prizeAtGradeAt2017 = {5000000, 3000000, 2000000, 500000, 300000, 100000};
    private int[] awardedPeopleCountAtGradeAt2017 = {1, 2, 3, 4, 5, 6};

    private int totalAwardedPeopleCountAt2018 = 31;
    private int[] prizeAtGradeAt2018 = {5120000, 2560000, 1280000, 640000, 320000};
    private int[] awardedPeopleCountAtGradeAt2018 = {1, 2, 4, 8, 16};

    private int outOfGrade = 0;

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int testCount = scanner.nextInt();

        for (int i = 0; i < testCount; i++) {
            System.out.println(getTotalPrize(scanner.nextInt(), scanner.nextInt()));
        }
    }

    private int getTotalPrize(int ranking2017, int ranking2018) {
        return getPrize(prizeAtGradeAt2017, awardedPeopleCountAtGradeAt2017, totalAwardedPeopleCountAt2017, ranking2017)
                + getPrize(prizeAtGradeAt2018, awardedPeopleCountAtGradeAt2018, totalAwardedPeopleCountAt2018, ranking2018);
    }

    private int getPrize(int[] prizeAtGrade, int[] awardedPeopleCountAtGrade, int totalAwardedPeopleCount, int ranking) {
        if (ranking == outOfGrade || ranking > totalAwardedPeopleCount)
            return 0;

        return prizeAtGrade[getGrade(awardedPeopleCountAtGrade, ranking)];
    }

    private int getGrade(int[] awardedPeopleCountAtGrade, int ranking) {
        int awardedPeopleCountOverGrade = 0;
        int gradeCount = awardedPeopleCountAtGrade.length;
        for (int grade = 0; grade < gradeCount; grade++) {
            awardedPeopleCountOverGrade += awardedPeopleCountAtGrade[grade];
            if (ranking <= awardedPeopleCountOverGrade) {
                return grade;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        new ex15953().run();
    }
}
