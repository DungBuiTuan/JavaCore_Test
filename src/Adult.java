import java.util.Date;

public class Adult extends Passenger{
    private String job;

    public Adult() {
    }

    public Adult(String passengerID, String name, Date birthDate, String address, int phone, Date testDate, Date flightDate, String job) {
        super(passengerID, name, birthDate, address, phone, testDate, flightDate);
        this.job = job;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Adult{" +
                ", passengerID='" + passengerID + '\'' +
                ", name='" + name + '\'' +
                ", birthDate=" + birthDate +
                ", address='" + address + '\'' +
                ", phone=" + phone +
                "job='" + job + '\'' +
                ", testDate=" + testDate +
                ", flightDate=" + flightDate +
                '}';
    }
}
