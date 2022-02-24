public class Book {
    String name;
    Author author;
    int year;
    String publishingHouse;
    Type type;
    int numberOfPapers;
    int authorRating;

    // Static
    static Rating ratingName;
    static int numberOfRatings = 0;
    static double averageRating = 0;



    public Book(String name, Author author, int year, String publishingHouse, int authorRating,
                Type type, int numberOfPapers){
        this.name = name;
        this.author = author;
        this.year = year;
        this.publishingHouse = publishingHouse;
        this.authorRating = authorRating;
        this.type = type;
        this.numberOfPapers = numberOfPapers;
        numberOfRatings++;
        averageRating = ( averageRating + this.authorRating ) / numberOfRatings;
    }

    public static Rating getCurrentRatingName() {
        if ( averageRating <= 1 ) {
            return Rating.VeryDissatisfied;
        } else if ( averageRating <= 2 ) {
            return Rating.Dissatisfied;
        } else if ( averageRating <= 3 ) {
            return Rating.Neutral;
        } else if ( averageRating <= 4 ) {
            return Rating.Satisfied;
        } else {
            return Rating.VerySatisfied;
        }
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + "', " + "\n" +
                "author='" + author + "', " + "\n" +
                "year=" + year + ", " + "\n" +
                "publishingHouse='" + publishingHouse + "', " + "\n" +
                "type=" + type + ", " + "\n" +
                "numberOfPapers=" + numberOfPapers + ", " + "\n" +
                "authorRating=" + authorRating + ", " + "\n" +
                "ratingName=" + getCurrentRatingName() + ", " + "\n" +
                "numberOfRatings=" + numberOfRatings + ", " + "\n" +
                "averageRating=" + averageRating + ", " + "\n" +
                '}';
    }
}
