package com.quest.practice_vars;
public class StudentScores {
    public static void main(String[] args) {
        // Step 1: Initialize arrays
        String[] names = {"Alice", "Bob", "Charlie", "David", "Eve", "Frank", "Grace"};
        int[] ages = {20, 21, 22, 23, 24, 25, 26};
        int[][] scores = {
                {85, 90, 78, 92, -1},
                {88, 92, 80, -1, 85},
                {75, 80, 70, 60, 72},
                {90, 85, 88, 95, 92},
                {65, 70, 60, 68, 67},
                {80, 85, -1, 90, 95},
                {90, 88, 92, 85, 80}
        };

        // Step 2: Calculate average scores
        calculateAverageScores(names, ages, scores);

        // Step 3: Find the highest scorer
        findHighestScorer(names, ages, scores);

        // Step 4: Ranking students by average score
        rankStudents(names, ages, scores);

        // Step 5: Detect missing data
        detectMissingData(names, scores);
    }

    // Method to calculate and print average scores
    public static void calculateAverageScores(String[] names, int[] ages, int[][] scores) {
        System.out.println("Average Scores:");
        for (int i = 0; i < names.length; i++) {
            int sum = 0, count = 0;
            for (int j = 0; j < scores[i].length; j++) {
                if (scores[i][j] != -1) {
                    sum += scores[i][j];
                    count++;
                }
            }
            double average = (count > 0) ? (double) sum / count : 0;
            System.out.printf("%s (Age %d): %.2f%n", names[i], ages[i], average);
        }
        System.out.println();
    }

    // Method to find the student with the highest average score
    public static void findHighestScorer(String[] names, int[] ages, int[][] scores) {
        double highestAverage = 0;
        int topStudentIndex = -1;

        for (int i = 0; i < names.length; i++) {
            int sum = 0, count = 0;
            for (int j = 0; j < scores[i].length; j++) {
                if (scores[i][j] != -1) {
                    sum += scores[i][j];
                    count++;
                }
            }
            double average = (count > 0) ? (double) sum / count : 0;
            if (average > highestAverage) {
                highestAverage = average;
                topStudentIndex = i;
            }
        }

        if (topStudentIndex != -1) {
            System.out.printf("Highest Scorer: %s (Age %d) with average %.2f%n", names[topStudentIndex], ages[topStudentIndex], highestAverage);
        }
        System.out.println();
    }

    // Method to rank students based on average score
    public static void rankStudents(String[] names, int[] ages, int[][] scores) {
        double[] averages = new double[names.length];
        for (int i = 0; i < names.length; i++) {
            int sum = 0, count = 0;
            for (int j = 0; j < scores[i].length; j++) {
                if (scores[i][j] != -1) {
                    sum += scores[i][j];
                    count++;
                }
            }
            averages[i] = (count > 0) ? (double) sum / count : 0;
        }

        // Sorting the students by average score in descending order
        for (int i = 0; i < names.length - 1; i++) {
            for (int j = i + 1; j < names.length; j++) {
                if (averages[i] < averages[j]) {
                    // Swap averages
                    double tempAvg = averages[i];
                    averages[i] = averages[j];
                    averages[j] = tempAvg;

                    // Swap names
                    String tempName = names[i];
                    names[i] = names[j];
                    names[j] = tempName;

                    // Swap ages
                    int tempAge = ages[i];
                    ages[i] = ages[j];
                    ages[j] = tempAge;
                }
            }
        }

        System.out.println("Ranking by Average Score:");
        for (int i = 0; i < names.length; i++) {
            System.out.printf("%d. %s (Age %d): %.2f%n", i + 1, names[i], ages[i], averages[i]);
        }
        System.out.println();
    }

    // Method to detect missing data in the scores array
    public static void detectMissingData(String[] names, int[][] scores) {
        System.out.println("Missing Data Report:");
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i] + ": ");
            boolean missingvalue = false;
            for (int j = 0; j < scores[i].length; j++) {
                if (scores[i][j] == -1) {
                    System.out.print("Subject " + (j + 1) + " ");
                    missingvalue = true;
                }
            }
            if (!missingvalue) {
                System.out.print("No missing data");
            }
            System.out.println();
        }
    }
}

