//student class

    public class Student extends Person {
        private final String classroom;//

        public Student (String name, int age, boolean parentPermission, String classroom) {
            super(name, age, parentPermission);
            this.classroom = classroom;
        }

        public String getClassroom() {

            return classroom;
        }
    }

