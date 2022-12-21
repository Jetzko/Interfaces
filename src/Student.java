public class Student extends CollegePerson implements LearningPerson {
    @Override
    public void studyAtHome() {
        System.out.println("Hi I'm " + name + " and I'm Studying!");
    }
    int accademicYear;
    Student (String name, String surname, int collegeID, int accademicYear){
        this.name = name;
        this.surname = surname;
        this.collegeID = collegeID;
        this.accademicYear = accademicYear;
    }


}
