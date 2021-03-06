package models;

import play.db.ebean.Model;
import java.util.List;
import java.util.ArrayList;
import play.db.ebean.Model;
import javax.persistence.*;

/**
 * Created by bahadirkirdan on 12/12/14.
 */

@Entity
public class Courses extends Model {

    @Id
    public int id;

    public String subjectName; //CS
    public String courseNo;       //201
    public String displayName; //It is just a display name information like "CS-201"
    public String sectionNo;  // "A" or "B"


    @OneToMany
    public List<RequestedCourses> requestedCourses = new ArrayList<RequestedCourses>();

    @OneToMany
    public List<LectureIntervals> lectureIntervals = new ArrayList<LectureIntervals>();
    
    @OneToMany
    public List<CourseInstructors> courseInstructors = new ArrayList<CourseInstructors>();

}
