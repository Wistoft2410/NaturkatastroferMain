import processing.core.PApplet;

public class Main extends PApplet {
DataBroker broker;
    public static void main(String[] args){
        PApplet.main("Main");
    }

    @Override
    public void settings() {
        super.settings();
        size(500,500);
        broker = new DataBroker(this);


    }

    @Override
    public void setup() {
        super.setup();
        broker.loadData();

    }
}
