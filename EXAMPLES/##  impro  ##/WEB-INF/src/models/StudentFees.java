package models;
import java.sql.*;



public class StudentFees{
	
    private Integer studentFeesId;
    private InstituteCourseBatchTimingStudent instituteCourseBatchTimingStudent;
    private Integer feesAmount;
    private Date feesDate;
    private Boolean paymentMode;
    private String transactionid;
    private String transactionStatus;

    public Integer getStudentFeesId() {
        return studentFeesId;
    }

    public void setStudentFeesId(Integer studentFeesId) {
        this.studentFeesId = studentFeesId;
    }

    public InstituteCourseBatchTimingStudent getInstituteCourseBatchTimingStudent() {
        return instituteCourseBatchTimingStudent;
    }

    public void setInstituteCourseBatchTimingStudent(InstituteCourseBatchTimingStudent instituteCourseBatchTimingStudent) {
        this.instituteCourseBatchTimingStudent = instituteCourseBatchTimingStudent;
    }

    public Integer getFeesAmount() {
        return feesAmount;
    }

    public void setFeesAmount(Integer feesAmount) {
        this.feesAmount = feesAmount;
    }

    public Date getFeesDate() {
        return feesDate;
    }

    public void setFeesDate(Date feesDate) {
        this.feesDate = feesDate;
    }

    public Boolean getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(Boolean paymentMode) {
        this.paymentMode = paymentMode;
    }

    public String getTransactionid() {
        return transactionid;
    }

    public void setTransactionid(String transactionid) {
        this.transactionid = transactionid;
    }

    public String getTransactionStatus() {
        return transactionStatus;
    }

    public void setTransactionStatus(String transactionStatus) {
        this.transactionStatus = transactionStatus;
    }
}