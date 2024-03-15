package q2;
import java.util.*;

public interface Subject {
    void attach(Observer o);
    void detach(Observer o);
    void notifyUpdate(Score score);
    
}