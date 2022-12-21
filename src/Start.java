public class Start {
    public static void main(String... arg) {
        Student student = new Student("Mario", "Genovese", 113, 2);
        Teacher teacher = new Teacher("Giulio", "Franchi", 17, "Math");
        Assistant assistant = new Assistant("Carla", "Lombardo", 98, true);

        student.goToCollege();
        teacher.goToCollege();
        assistant.goToCollege();

        student.studyAtHome();
        teacher.teachToOtherPeople();
        assistant.studyAtHome();
        assistant.teachToOtherPeople();
        }
    }

