package pl.osec.crm.domain.course;

import org.springframework.stereotype.Service;

import java.util.List;

import static java.util.stream.Collectors.toList;

@Service
class CourseService {

    private final CourseRepository courseRepository;

    CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    List<CourseDto> getAllCourses() {
        return courseRepository.findAllCourses().stream()
                .map(Course::toDto)
                .collect(toList());
    }
}
