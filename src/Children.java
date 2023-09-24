import java.util.Date;

public class Children extends Passenger{
    private String school;
    private String grade;

    public Children(){

    }

    public Children(String passengerID, String name, Date birthDate, String address, int phone, Date testDate, Date flightDate, String school, String grade) {
        super(passengerID, name, birthDate, address, phone, testDate, flightDate);
        this.school = school;
        this.grade = grade;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Children{" +
                ", passengerID='" + passengerID + '\'' +
                ", name='" + name + '\'' +
                ", birthDate=" + birthDate +
                ", address='" + address + '\'' +
                ", phone=" + phone +
                "school='" + school + '\'' +
                ", grade='" + grade + '\'' +
                ", testDate=" + testDate +
                ", flightDate=" + flightDate +
                '}';
    }
}
