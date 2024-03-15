public class AirOffCommand implements Command{
    Airconditioner air;

    public AirOffCommand(Airconditioner air){
        this.air = air;
    }

    public void execute(){
        air.off();
    }

    public void undo(){
        air.on();
    }
}
