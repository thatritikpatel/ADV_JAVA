package models;

public class InstituteCourseBatchTimingStudent{
	
   private Integer instituteCourseBatchTimingStudentId;
   private InstituteCourseBatchTiming instituteCourseBatchTiming;
   private Student student;
   private Integer feesDue;

    public Integer getInstituteCourseBatchTimingStudentId() {
        return instituteCourseBatchTimingStudentId;
    }

    public void setInstituteCourseBatchTimingStudentId(Integer instituteCourseBatchTimingStudentId) {
        this.instituteCourseBatchTimingStudentId = instituteCourseBatchTimingStudentId;
    }

    public InstituteCourseBatchTiming getInstituteCourseBatchTiming() {
        return instituteCourseBatchTiming;
    }

    public void setInstituteCourseBatchTiming(InstituteCourseBatchTiming instituteCourseBatchTiming) {
        this.instituteCourseBatchTiming = instituteCourseBatchTiming;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Integer getFeesDue() {
        return feesDue;
    }

    public void setFeesDue(Integer feesDue) {
        this.feesDue = feesDue;
    }
}