package models;

public class InstituteCourseSyllabusTopic{
	
   private Integer instituteCourseSyllabusTopicId;
   private InstituteCourse instituteCourse;
   private Topic topic;

    public Integer getInstituteCourseSyllabusTopicId() {
        return instituteCourseSyllabusTopicId;
    }

    public void setInstituteCourseSyllabusTopicId(Integer instituteCourseSyllabusTopicId) {
        this.instituteCourseSyllabusTopicId = instituteCourseSyllabusTopicId;
    }

    public InstituteCourse getInstituteCourse() {
        return instituteCourse;
    }

    public void setInstituteCourse(InstituteCourse instituteCourse) {
        this.instituteCourse = instituteCourse;
    }

    public Topic getTopic() {
        return topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }
}