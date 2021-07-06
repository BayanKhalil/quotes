package quotes;

public class bookQuotes {
    private String quotes;
    private String author;

    public bookQuotes(String quotes, String author) {
        this.quotes = quotes;
        this.author = author;
    }

    public String getQuotes() {
        return quotes;
    }

    public void setQuotes(String quotes) {
        this.quotes = quotes;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "bookQuotes{" +
                "quotes='" + quotes + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
