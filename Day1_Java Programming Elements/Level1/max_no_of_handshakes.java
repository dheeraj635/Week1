import java.util.Scanner;
public class max_no_of_handshakes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Total number of students present : ");
        int total_students = sc.nextInt();
        int max_handshakes = (total_students*(total_students-1))/2;
        System.out.println("The total number of student present is "+total_students+" maximun handshakes among total students present is "+max_handshakes);
        sc.close();
    }
}
