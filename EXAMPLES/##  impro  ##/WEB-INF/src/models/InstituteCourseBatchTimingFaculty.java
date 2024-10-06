package models;

public class InstituteCourseBatchTimingFaculty{
	 private Integer instituteCourseBatchTimingFacultyId;
    private InstituteCourseBatchTiming instituteCourseBatchTiming;
    private Faculty faculty;

    public Integer getInstituteCourseBatchTimingFacultyId() {
        return instituteCourseBatchTimingFacultyId;
    }

    public void setInstituteCourseBatchTimingFacultyId(Integer instituteCourseBatchTimingFacultyId) {
        this.instituteCourseBatchTimingFacultyId = instituteCourseBatchTimingFacultyId;
    }

    public InstituteCourseBatchTiming getInstituteCourseBatchTiming() {
        return instituteCourseBatchTiming;
    }

    public void setInstituteCourseBatchTiming(InstituteCourseBatchTiming instituteCourseBatchTiming) {
        this.instituteCourseBatchTiming = instituteCourseBatchTiming;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }
}