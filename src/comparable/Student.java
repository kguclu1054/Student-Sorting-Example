package comparable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student implements Comparable<Student>{

	private int id; 
	private String name; 
	private double gpa;
	
	public Student(int id,String name, Double gpa) {
		this.id = id;
		this.name = name;
		this.gpa = gpa;
	}
	
	public int GetId() {
		return id;
	}
	
	public String GetName() {
		return name;
	}
	
	public double GetGpa() {
		return gpa;
	}
	
	@Override 
	public String toString() { 
		return "Student{" + 
	             "id=" + id + 
	             ", name='" + name + '\'' + ", "+ 
	             "gpa=" + gpa + 
	             '}'; 
		}
	
	public static void main(String[] args) {
		
		List<Student> student = new ArrayList<>();
		student.add(new Student(3, "Ali" , 3.5));
		student.add(new Student(1, "Ayşe" , 3.8));
		student.add(new Student(2, "Ahmet" , 3.2));
		
		Collections.sort(student);
		
		System.out.println(student);
		
		Collections.sort(student, new StudentNameComparator());
		System.out.println("İsme göre sıralama: " + student);
		
		Collections.sort(student, new StudentGpaComparator());
		System.out.print("Gpa(Not ortalaması)'ya göre sırala"+ student);
	
	}
	
	

	@Override
	public int compareTo(Student other) {
		return Integer.compare(this.id, other.id);
	}

}
