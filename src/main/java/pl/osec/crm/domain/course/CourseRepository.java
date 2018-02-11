package pl.osec.crm.domain.course;

import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
class CourseRepository {

    List<Course> findAllCourses() {
        return Arrays.asList(
        
        );
    }
}
