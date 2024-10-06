package models;

public class InstituteCourse{
   private Integer instituteCourseId;
   private Institute institute;
   private Course course;

    public Integer getInstituteCourseId() {
        return instituteCourseId;
    }

    public void setInstituteCourseId(Integer instituteCourseId) {
        this.instituteCourseId = instituteCourseId;
    }

    public Institute getInstitute() {
        return institute;
    }

    public void setInstitute(Institute institute) {
        this.institute = institute;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}