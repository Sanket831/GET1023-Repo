package Model;

public class Course {
	private int courseId;
	private String courseName;
	private int durationInMonths;
	private double fee;
	private Qualification Elligibilty;
	
	public Course() {
		// TODO Auto-generated constructor stub
	}

	public Course(int courseId, String courseName, int durationInMonths, double fee, Qualification elligibilty) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.durationInMonths = durationInMonths;
		this.fee = fee;
		Elligibilty = elligibilty;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getDurationInMonths() {
		return durationInMonths;
	}

	public void setDurationInMonths(int durationInMonths) {
		this.durationInMonths = durationInMonths;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	public Qualification getElligibilty() {
		return Elligibilty;
	}

	public void setElligibilty(Qualification elligibilty) {
		Elligibilty = elligibilty;
	}

	public int getCourseId() {
		return courseId;
	}
	
}
