import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Students s1 = new Students("Zafarjon", "Eshonov", 19);
        Students s2 = new Students("Ali", "Zufaraliyev", 20);
        Students s3 = new Students("Sanjar", "Qurbon", 22);
        Students s4 = new Students("Zafarjon", "Eshonov", 21);
        Students[] studentsArray = {s1, s2, s3, s4};
        Comparator<Students> comparator = new Comparator<Students>() {
            @Override
            public int compare(Students o1, Students o2) {
                int res = o1.getName().compareTo(o2.getName());
                if (res == 0) {
                    res = o1.getSurname().compareTo(o2.getSurname()) * -1;
                    if (res == 0) {
                        if (o1.getAge() > o2.getAge()) {
                            return 1;
                        } else if (o1.getAge() < o2.getAge()) {
                            return -1;
                        }
                    }
                }
                return res;
            }
        };
        Arrays.sort(studentsArray,comparator);
        System.out.println(Arrays.toString(studentsArray));
    }
}