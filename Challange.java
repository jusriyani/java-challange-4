public class Challange {
    public static void main(String[] args){
        getScore(15);
        getScore(28);
        getScore(52);
        getScore(78);
        getScore(95);
        getScore(105);
    }

    static void getScore(int score){
        if(score >= 0 && score <= 25){
            System.out.println("You got E");
        }else if(score >= 26 && score <= 50){
            System.out.println("You got D");
        }else if (score >= 51 && score <= 75){
            System.out.println("You got C");
        }else if (score >= 76 && score <= 90){
            System.out.println("You got B");
        }else if (score >= 91 && score <= 100){
            System.out.println("You got A");
        }else if (score >=100){
            System.out.println("You enter the invalid score");
        }
    }
}