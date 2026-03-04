public class Movie {
    String name;
    int yearOfRelease;
    boolean includedInThePlan;
    double sumOfRatings;
    int totalRatings;
    int durationInMinutes;

    // method creation
    void displayTechnicalSheet(){
        System.out.println(name);
        System.out.println(yearOfRelease);
    }

    void assessment (double note){
        sumOfRatings += note;
        totalRatings ++;
    }

    double returnMedia(){
        return sumOfRatings/totalRatings;
    }
}
