package backend;

import java.util.ArrayList;

import entity.Student;

public class Exercise2 {
	private ArrayList<Student> listStudent;
	
	public Exercise2() {
		listStudent = new ArrayList<>();
	}
	
	public void question2() {
		createStudent();
	}
	
	public void createStudent() {
		Student[] student = new Student[10];
		for(int i = 0; i < 10; i++) {
			student[i] = new Student(i + 1, "Nguyen Van " + (char)('A' + i), i % 3 + 1);
		}
		
		System.out.println("Lop diem danh:");
		for(Student student1 : student) {
			student1.diemDanh();
		}
		
		System.out.println("Nhom 1 di hoc bai: ");
		for(Student student1 : student) {
			if(student1.getGroup() == 1) {
				student1.hocBai();
			}
		}
		
		System.out.println("Nhom 2 di don ve sinh: ");
		for (Student student1 : student) {
			if(student1.getGroup() == 2) {
				student1.donVeSinh();
			}
		}
	}
}

