import java.util.Date;

public class Pregnant extends Passenger{
    private int gestationalAge;
    private String pretermBirth;

    public Pregnant() {
    }

    public Pregnant(String passengerID, String name, Date birthDate, String address, int phone, Date testDate, Date flightDate, int gestationalAge, String pretermBirth) {
        super(passengerID, name, birthDate, address, phone, testDate, flightDate);
        this.gestationalAge = gestationalAge;
        this.pretermBirth = pretermBirth;
    }

    public int getGestationalAge() {
        return gestationalAge;
    }

    public void setGestationalAge(int gestationalAge) {
        this.gestationalAge = gestationalAge;
    }

    public String getPretermBirth() {
        return pretermBirth;
    }

    public void setPretermBirth(String pretermBirth) {
        this.pretermBirth = pretermBirth;
    }

    @Override
    public String toString() {
        return "Pregnant{" +
                ", passengerID='" + passengerID + '\'' +
                ", name='" + name + '\'' +
                ", birthDate=" + birthDate +
                ", address='" + address + '\'' +
                ", phone=" + phone +
                "gestationalAge=" + gestationalAge +
                ", pretermBirth='" + pretermBirth + '\'' +
                ", testDate=" + testDate +
                ", flightDate=" + flightDate +
                '}';
    }
}
