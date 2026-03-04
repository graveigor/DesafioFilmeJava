public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie();
        myMovie.name = "The GodFather";
        myMovie.yearOfRelease = 1972;
        myMovie.durationInMinutes = 180;

        myMovie.displayTechnicalSheet();
        myMovie.assessment(8);
        myMovie.assessment(5);
        myMovie.assessment(10);
        System.out.println(myMovie.sumOfRatings);
        System.out.println(myMovie.totalRatings);
        System.out.println(myMovie.returnMedia());
    }
}