package classes_and_objects_Lab3;
//Вариант 10
public class Literature {
    private int code;
    private String type;
    private String title;
    private int yearOfPublication;
    private String publisher;

    public Literature(int code, String type, String title, int yearOfPublication, String publisher) {
        this.code = code;
        this.type = type;
        this.title = title;
        this.yearOfPublication = yearOfPublication;
        this.publisher = publisher;
    }

    // Геттеры и сеттеры для всех свойств
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "Literature{" +
                "code=" + code +
                ", type='" + type + '\'' +
                ", title='" + title + '\'' +
                ", yearOfPublication=" + yearOfPublication +
                ", publisher='" + publisher + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Literature book = new Literature(123, "Book", "Java Programming", 2022, "PublisherX");
        System.out.println(book.toString());
    }
}
