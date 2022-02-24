import java.util.Date;

public class Author {
    String name;
    String middleName;
    String surname;
    Date birthday;

    public Author(String name, String middleName, String surname, Date birthday) {
        this.name = name;
        this.middleName = middleName;
        this.surname = surname;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", middleName='" + middleName + '\'' +
                ", surname='" + surname + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
