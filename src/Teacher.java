public class Teacher extends CollegePerson implements TeachigPerson {
    @Override
    public void teachToOtherPeople() {
        System.out.println("Hi I'm " + name + " and I'm Teaching!");
    }
    String subject;

   public Teacher (String name, String surname, int collegeID, String subject){
       this.name = name;
       this.surname = surname;
       this.collegeID = collegeID;
       this.subject = subject;
   }
}
