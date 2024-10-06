package models;

public class FacultyCourse{
	
    private Integer facultyCourseId;
    private Faculty faculty;
    private Course course;

    public Integer getFacultyCourseId() {
        return facultyCourseId;
    }

    public void setFacultyCourseId(Integer facultyCourseId) {
        this.facultyCourseId = facultyCourseId;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

}