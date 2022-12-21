public class Assistant extends CollegePerson implements TeachigPerson, LearningPerson{

    @Override
    public void studyAtHome() {
        System.out.println("Hi I'm " + name + " and I'm Studying!");
    }

    @Override
    public void teachToOtherPeople() {
        System.out.println("Hi I'm " + name + " and I'm Teaching!");
    }
    boolean isGoingToBeAPhD;

    public Assistant (String name, String surname, int collegeID, boolean isGoingToBeAPhD) {
        this.name = name;
        this.surname = surname;
        this.collegeID = collegeID;
        this.isGoingToBeAPhD = isGoingToBeAPhD;
    }
}
