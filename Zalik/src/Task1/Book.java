package Task1;

import java.util.List;

public class Book<students> {
    private String title;
    private List<Student> students;
    public Student YaroslavStream() {
        Student james = students.stream()
                .filter(customer -> "Yaroslav".equals(customer.getName()))
                .findAny()
                .orElse(null);
        return james;
    }


}
