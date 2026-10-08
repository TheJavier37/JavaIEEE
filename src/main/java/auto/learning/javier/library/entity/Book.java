package auto.learning.javier.library.entity;

/**
 * @author TheJavier37 (Javier Guarnizo Vega)
 */

public class Book {

    private String title;
    private String author;
    private String genre;
    private int yearPublished;
    private double price;
    private boolean isAvailable;

    public Book(String title, String author, String genre, int yearPublished) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.yearPublished = yearPublished;
        this.price = 0.0;
        this.isAvailable = true;
    }

    public Book(String title, String author, int yearPublished, boolean available) {
        this.title = title;
        this.author = author;
        this.genre = "Sin género";
        this.yearPublished = yearPublished;
        this.price = 0.0;
        this.isAvailable = available;
    }

    public void mostrarInformacion() {
        System.out.println("---------------------");
        System.out.println("Nombre: " + title);
        System.out.println("Autor: " + author);
        System.out.println("Género: " + genre);
        System.out.println("Año de publicación: " + yearPublished);
        System.out.println("Precio: " + price);
        System.out.println("Disponible: " + isAvailable);
    }

    // Getters y Setters
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    public String getGenre() { return genre; }
    public void setGenre(String genre) { this.genre = genre; }

    public int getYearPublished() { return yearPublished; }
    public void setYearPublished(int yearPublished) { this.yearPublished = yearPublished; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public boolean isAvailable() { return isAvailable; }
    public void setAvailable(boolean available) { isAvailable = available; }
}