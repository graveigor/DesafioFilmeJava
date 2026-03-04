public class Movie {
    String name;
    int yearOfRelease;
    boolean includedInThePlan;
    double rating;
    int totalRatings;
    int durationInMinutes;

    void displayTechnicalSheet(){
        System.out.println(name);
        System.out.println(yearOfRelease);
    }

}
