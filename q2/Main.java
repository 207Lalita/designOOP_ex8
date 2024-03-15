package q2;

public class Main {
    public static void main(String[] args) {
        ScoreFootball score = new ScoreFootball();
        Observer observe1 = new Display();
        Observer observe2 = new Display();

        score.attach(observe1);
        score.attach(observe2);

        score.setScore(new Score("Thai 1-0 UAE"));
        score.setScore(new Score("Thai 2-0 UAE"));
    }
}
