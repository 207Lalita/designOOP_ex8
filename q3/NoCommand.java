public class NoCommand implements Command{
    public void execute(){
        System.out.println("No Command is assign to this slot.");
    }

    public void undo(){
        System.out.println("No Command is assign to this slot.");
    }
}
