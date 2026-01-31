import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Students s1 = new Students("Zafarjon", "Eshonov", 19);
        Students s2 = new Students("Ali", "Zufaraliyev", 20);
        Students s3 = new Students("Sanjar", "Qurbon", 22);
        Students s4 = new Students("Zafarjon", "Eshonov", 21);
        Students[] studentsArray = {s1, s2, s3, s4};
        Arrays.sort(studentsArray);
        System.out.println(Arrays.toString(studentsArray));
    }
}