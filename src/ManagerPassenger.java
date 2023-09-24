import java.util.ArrayList;
import java.util.List;

public class ManagerPassenger {
    private List<Passenger> passengers;
    private List<Adult> adults;
    private List<Children> childrens;
    private List<Pregnant> pregnants;

    public ManagerPassenger() {
        this.passengers = new ArrayList<>();
        this.adults = new ArrayList<>();
        this.childrens = new ArrayList<>();
        this.pregnants = new ArrayList<>();
    }

    public void showInforAdults(){
        this.adults.forEach(a -> System.out.println(a.toString()));
    }
    public void showInforChildrens(){
        this.childrens.forEach(c -> System.out.println(c.toString()));
    }
    public void showInforPregnant(){
        this.pregnants.forEach(pre -> System.out.println(pre.toString()));
    }
    public void showInforPassenger(){
        this.passengers.forEach(pa -> System.out.println(pa.toString()));
    }
}
