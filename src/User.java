public class User {
    String name;
    String surname;
    String nickname;
    String email;
    Boolean status;

    //Static
    static int totalOnline = 0;

    public User(String name, String surname, String nickname, String email) {
        this.name = name;
        this.surname = surname;
        this.nickname = nickname;
        this.email = email;
        this.status = true;
        totalOnline++;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", nickname='" + nickname + '\'' +
                ", email='" + email + '\'' +
                ", status=" + status +
                '}';
    }
}
