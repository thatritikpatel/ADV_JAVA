package models;

public class InstitutePic{
	
    private Integer institutePicId;
    private Institute institute;
    private String picPath;
    private String details;


    public Integer getInstitutePicId() {
        return institutePicId;
    }

    public void setInstitutePicId(Integer institutePicId) {
        this.institutePicId = institutePicId;
    }

    public Institute getInstitute() {
        return institute;
    }

    public void setInstitute(Institute institute) {
        this.institute = institute;
    }

    public String getPicPath() {
        return picPath;
    }

    public void setPicPath(String picPath) {
        this.picPath = picPath;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}