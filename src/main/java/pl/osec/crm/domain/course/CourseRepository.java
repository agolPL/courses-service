package pl.osec.crm.domain.course;

import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
class CourseRepository {

    List<Course> findAllCourses() {
        return Arrays.asList(
                new Course("DO080", "Deploying Containerized Applications Technical Overview"),
                new Course("DO180", "Introduction to Containers, Kubernetes, and Red Hat OpenShift"),
                new Course("DO280", "Red Hat OpenShift Administration I"),
                new Course("DO288", "Design, build, and deploy containerized applications on an OpenShift cluster"),
                new Course("DO290", "Developing and Deploying Applications on OpenShift")
        );
    }
}
