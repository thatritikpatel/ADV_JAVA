package models;

public class InstituteCourseBatchTimingDay{
	
  private Integer instituteCourseBatchTimingDayID;
  private InstituteCourseBatchTiming instituteCourseBatchTiming;
  private Day day;


	 //__________________________________________________________________________

    public Integer getInstituteCourseBatchTimingDayID() {
        return instituteCourseBatchTimingDayID;
    }

    public void setInstituteCourseBatchTimingDayID(Integer instituteCourseBatchTimingDayID) {
        this.instituteCourseBatchTimingDayID = instituteCourseBatchTimingDayID;
    }
	
	//________________________________________________________________________

    public InstituteCourseBatchTiming getInstituteCourseBatchTiming() {
        return instituteCourseBatchTiming;
    }

    public void setInstituteCourseBatchTiming(InstituteCourseBatchTiming instituteCourseBatchTiming) {
        this.instituteCourseBatchTiming = instituteCourseBatchTiming;
    }

    //____________________________________________________________________________

	public Day getDay() {
        return day;
    }

    public void setDay(Day day) {
        this.day = day;
    }


}