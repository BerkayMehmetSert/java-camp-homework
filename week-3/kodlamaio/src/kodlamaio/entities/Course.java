package kodlamaio.entities;

public class Course {
    private int courseId;
    private String courseName;
    private String courseDetail;
    private double coursePrice;
    private Category category;
    private Instructor instructor;
    
    public Course() {
    }
    
    public Course(int courseId, String courseName, String courseDetail, double coursePrice, Category category, Instructor instructor) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseDetail = courseDetail;
        this.coursePrice = coursePrice;
        this.category = category;
        this.instructor = instructor;
    }
    
    public int getCourseId() {
        return courseId;
    }
    
    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }
    
    public String getCourseName() {
        return courseName;
    }
    
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    
    public String getCourseDetail() {
        return courseDetail;
    }
    
    public void setCourseDetail(String courseDetail) {
        this.courseDetail = courseDetail;
    }
    
    public double getCoursePrice() {
        return coursePrice;
    }
    
    public void setCoursePrice(double coursePrice) {
        this.coursePrice = coursePrice;
    }
    
    public Category getCategory() {
        return category;
    }
    
    public void setCategory(Category category) {
        this.category = category;
    }
    
    public Instructor getInstructor() {
        return instructor;
    }
    
    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }
}
