package n1e1;

import java.util.ArrayList;
import java.util.Arrays;

public class Calendari {
    private ArrayList<String> mesos;

    public Calendari() {
        this.mesos = new ArrayList<>(Arrays.asList("Gener", "Febrer", "Març", "Abril", "Maig", "Juny", "Juliol", "Agost", "Setembre", "Octubre", "Novembre", "Decembre"));
    }

    public ArrayList<String> getMesos() {
        return mesos;
    }

    public void setMesos(ArrayList<String> mesos) {
        this.mesos = mesos;
    }
}
