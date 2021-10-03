package practice;
/*
Problem Statement:
Scoring rules:
Normal bowling system till frame 9, after frame 9, in frame 10:
1. If Strike then give 2 additional chances.
2. If Spare then give additional chance.
Score System:
1. If Strike then add next frame or next two scores to the total score.
2. If Spare then add next score to the total score.
 */

public class BowlingSingle {

    private static int getTotalScore(int[] scores) {

        int totalScore = 0;
        int frame = 0;
        int i = 0;
        for (; frame < 9; i++){
            if (i % 2 == 0 && scores[i] == 10) {
                totalScore += scores[i] + scores[i+2] + scores[i+3];
                i++;
                frame++;
            }
            else if(i % 2 != 0 && scores[i-1] + scores[i] == 10) {
                totalScore += scores[i] + scores[i+1];
                frame++;
            }
            else {
                totalScore += scores[i];
                if (i % 2 != 0) {
                    frame++;
                }
            }
            if (i % 2 != 0) {
                System.out.println("Frame: " + frame + "Score: " + totalScore);
            }
        }

        for (; i < scores.length; i++) {
            if (scores[i] == 10) {
                totalScore += scores[i] + scores[i+1] +scores[i+2];
            }
            else if (i > 19 && scores[i-1] + scores[i] == 10){
                totalScore += scores[i] + scores[i+1];
            }
            else {
                totalScore += scores[i];
            }

        }

        return totalScore;
    }

    public BowlingSingle() {
        int [] scores = new int[]{5,4, 4,3, 7,3, 8,0, 7,3, 8,1, 7,3, 10,0, 8,1, 3,7,10,7,3,9};
        System.out.println(getTotalScore(scores));
    }
}
