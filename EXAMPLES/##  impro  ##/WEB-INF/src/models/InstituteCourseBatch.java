package models;

public class InstituteCourseBatch{
	private Integer instituteCourseBatchId;
	private InstituteCourse instituteCourse;
	private String batchName;
	private Integer fees;

    public Integer getInstituteCourseBatchId() {
        return instituteCourseBatchId;
    }

    public void setInstituteCourseBatchId(Integer instituteCourseBatchId) {
        this.instituteCourseBatchId = instituteCourseBatchId;
    }

    public InstituteCourse getInstituteCourse() {
        return instituteCourse;
    }

    public void setInstituteCourse(InstituteCourse instituteCourse) {
        this.instituteCourse = instituteCourse;
    }

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    public Integer getFees() {
        return fees;
    }

    public void setFees(Integer fees) {
        this.fees = fees;
    }
}