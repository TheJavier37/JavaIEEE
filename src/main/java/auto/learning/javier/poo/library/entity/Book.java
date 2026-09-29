package auto.learning.javier.poo.library.entity;

public class Book {

    private String titulo;
    private String author;
    private String genre;
    private int yearPublished;
    private double price;
    private boolean isAvailable;

    public Book(String titulo, String author, String genre, int yearPublished) {
        this.titulo = titulo;
        this.author = author;
        this.genre = genre;
        this.yearPublished = yearPublished;
        this.price = price;
        this.isAvailable = true;
    }

    public void mostrarInformacion() {
        System.out.println("---------------------");
        System.out.println("Nombre: " + titulo);
        System.out.println("Autor: " + author);
        System.out.println("Género: " + genre);
        System.out.println("Año de publicación: " + yearPublished);
        System.out.println("Precio: " + price);
        System.out.println("Disponible: " + isAvailable);
    }

    public void prestarLibro() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("El libro ha sido prestado.");
        } else {
            System.out.println("El libro no está disponible para prestar.");
        }
    }

    public void devolverLibro() {
        if (!isAvailable) {
            isAvailable = true;
            System.out.println("El libro ha sido devuelto.");
        } else {
            System.out.println("El libro ya está disponible.");
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

}
