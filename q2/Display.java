package q2;

public class Display implements Observer {

    @Override
    public void update(Score score) {
        System.out.println("Live result: "+score.getResultFootball());
    }
    
}
