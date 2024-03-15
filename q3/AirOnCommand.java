public class AirOnCommand implements Command{
    Airconditioner air;

    public AirOnCommand(Airconditioner air){
        this.air = air;
    }

    public void execute(){
        air.on();
    }

    public void undo(){
        air.off();
    }
}
