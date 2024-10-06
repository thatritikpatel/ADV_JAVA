package models;
import java.sql.*;


public class InstituteCourseBatchTiming{

	private Integer instituteCourseBatchTimingId;
    private InstituteCourseBatch instituteCourseBatch;
    private Time startTime;
    private Time endTime;
    private Status status;
    private Date startDate;
    private Date endDate;
    private Integer fees;

    public Integer getInstituteCourseBatchTimingId() {
        return instituteCourseBatchTimingId;
    }

    public void setInstituteCourseBatchTimingId(Integer instituteCourseBatchTimingId) {
        this.instituteCourseBatchTimingId = instituteCourseBatchTimingId;
    }

	//________________________________________________________________

    public InstituteCourseBatch getInstituteCourseBatch() {
        return instituteCourseBatch;
    }

    public void setInstituteCourseBatch(InstituteCourseBatch instituteCourseBatch) {
        this.instituteCourseBatch = instituteCourseBatch;
    }

	//______________________________________________________________

    public Time getStartTime() {
        return startTime;
    }

    public void setStartTime(Time startTime) {
        this.startTime = startTime;
    }

	//__________________________________________________________________

    public Time getEndTime() {
        return endTime;
    }

    public void setEndTime(Time endTime) {
        this.endTime = endTime;
    }

	//___________________________________________________________________

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

	//___________________________________________________________________

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

	//__________________________________________________________________

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

	//___________________________________________________________________

    public Integer getFees() {
        return fees;
    }

    public void setFees(Integer fees) {
        this.fees = fees;
    }


}