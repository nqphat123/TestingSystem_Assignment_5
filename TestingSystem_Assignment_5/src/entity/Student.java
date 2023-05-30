package entity;

public class Student implements IStudent {
	private int id;
	private String name;
	private int group;
	
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGroup() {
		return group;
	}
	public void setGroup(int group) {
		this.group = group;
	}
	public Student(int id, String name, int group) {
		super();
		this.id = id;
		this.name = name;
		this.group = group;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", group=" + group + "]";
	}
	@Override
	public void diemDanh() {
		// TODO Auto-generated method stub
		System.out.println(name+ " di diem danh");
	}
	@Override
	public void hocBai() {
		// TODO Auto-generated method stub
		System.out.println(name+ " di hoc bai");
	}
	@Override
	public void donVeSinh() {
		// TODO Auto-generated method stub
		System.out.println(name+ " di don ve sinh");
	}
	

}