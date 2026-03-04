public class Principal {
    public static void main(String[] args) {
        Movie myMovie = new Movie();
        myMovie.name = "The GodFather";
        myMovie.yearOfRelease = 1972;
        myMovie.durationInMinutes = 180;

        myMovie.displayTechnicalSheet();
    }
}