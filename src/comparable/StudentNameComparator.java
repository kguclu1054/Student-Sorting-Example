package comparable;

import java.util.Comparator;

public class StudentNameComparator implements Comparator<Student> {
    
	@Override
    public int compare(Student s1, Student s2) {
        return s1.GetName().compareTo(s2.GetName());
    }
}

