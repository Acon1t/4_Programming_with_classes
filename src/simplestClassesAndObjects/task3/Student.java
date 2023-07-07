package src.simplestClassesAndObjects.task3;

public class Student {
    private String name;
    private String group;
    private int[] performance;

    public static void main(String[] args) {

        Student[] students = new Student[10];
        students[0] = new Student("aaaaaaaa", "1", new int[]{10, 10, 1});
        students[1] = new Student("bbbbbbbb", "1", new int[]{7, 7, 10});
        students[2] = new Student("cccccccc", "1", new int[]{9, 4, 10});
        students[3] = new Student("dddddddd", "2", new int[]{9, 10, 6});
        students[4] = new Student("rrrrrrrr", "2", new int[]{7, 7, 8});
        students[5] = new Student("AAAAAAAA", "3", new int[]{10, 10, 9});
        students[6] = new Student("BBBBBBBB", "3", new int[]{10, 9, 10});
        students[7] = new Student("CCCCCCCC", "3", new int[]{9, 9, 9});
        students[8] = new Student("iiiiiiii", "4", new int[]{10, 8, 1});
        students[9] = new Student("llllllll", "4", new int[]{9, 10, 6});
        printExcellentStudents(students);

    }

    public Student(String name, String group, int[] performance) {
        this.name = name;
        this.group = group;
        this.performance = performance;
    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public int[] getPerformance() {
        return performance;
    }

    public static void printExcellentStudents(Student[] students) {
        for (Student student : students) {
            boolean isGood = true;
            for (int grade : student.getPerformance()) {
                if (grade < 9) {
                    isGood = false;
                }
            }
            if (isGood) {
                System.out.println(student.getName() + " from the group " + student.getGroup());

            }
        }
    }
}
