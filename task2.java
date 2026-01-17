import java.util.*;

public class task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> map = new HashMap<>();
        int ch = 0;

        while (ch != 4) {
            System.out.println("\n*** STUDENT GRADE MANAGEMENT SYSTEM ***");
            System.out.println("1 Add Student");
            System.out.println("2 View Students");
            System.out.println("3 Sort by Grade");
            System.out.println("4 Exit");
            System.out.print("Enter choice: ");

            ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {
                case 1:
                    System.out.print("Enter name: ");
                    String n = sc.nextLine();
                    System.out.print("Enter grade: ");
                    int g = sc.nextInt();
                    map.put(n, g);
                    System.out.println("Added");
                    break;

                case 2:
                    for (String s : map.keySet()) {
                        System.out.println(s + " " + map.get(s));
                    }
                    break;

                case 3:
                    ArrayList<String> names = new ArrayList<>(map.keySet());
                    for (int i = 0; i < names.size(); i++) {
                        for (int j = i + 1; j < names.size(); j++) {
                            if (map.get(names.get(i)) < map.get(names.get(j))) {
                                String t = names.get(i);
                                names.set(i, names.get(j));
                                names.set(j, t);
                            }
                        }
                    }

                    for (String s : names) {
                        System.out.println(s + " " + map.get(s));
                    }
                    break;

                case 4:
                    System.out.println("Exit");
                    break;

                default:
                    System.out.println("Wrong choice");
            }
        }
    }
}
