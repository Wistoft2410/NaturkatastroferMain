import processing.core.PApplet;

public class DataBroker {

    String navn;
    int year;
    int deaths;

    String[] rows;

    PApplet p;

    DataBroker(PApplet tempP) {
        this.p = tempP;
    }

    void loadData() {
        rows = p.loadStrings("dnd.csv");
        String[] years = rows[0].split(",");

        for (int j = 1; j < rows.length; j++) {
            String[] cells = rows[j].split(",");
            for (int i = 2; i < cells.length; i++) {
                p.println("Land: " + cells[1] + "   |Year: " + years[i] + "   |Døde: " + cells[i]);
            }
        }
    }

}
