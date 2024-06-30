import java.util.Objects;

public class Employee {
private String FirstName;
private String LastName;

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getLastName() {
        return LastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(FirstName, employee.FirstName) && Objects.equals(LastName, employee.LastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(FirstName, LastName);
    }
}
