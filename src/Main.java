import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author(
                "Александр",
                "Сергеевич",
                "Пушкин",
                new Date(1799, 5, 26));

        Book book1 = new Book(
                "Капитанская дочка",
                author1,
                1969,
                "Правда",
                4, Type.PaperBook,
                123);

        System.out.println(book1);

        Book book2 = new Book(
                "Капитанская дочка",
                author1,
                1969,
                "Правда",
                5, Type.PaperBook,
                123);


        System.out.println(book2);
        System.out.println("Общий рейтинг: " + Book.getCurrentRatingName());

        User user1 = new User(
                "Roman",
                "Petrov",
                "romashka",
                "romashka@mail.ru");

        User user2 = new User(
                "Petya",
                "Ivanov",
                "petrusha",
                "petrusha@mail.ru");

        System.out.println(user1);
        System.out.println(user2);
        System.out.println("Всего пользователй онлайн: " + User.totalOnline);
    }
}
