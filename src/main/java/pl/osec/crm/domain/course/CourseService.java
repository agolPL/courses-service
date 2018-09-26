package pl.osec.crm.domain.course;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.util.stream.Collectors.toList;

@Slf4j
@Service
class CourseService {

    private final CourseRepository courseRepository;

    CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    List<CourseDto> getAllCourses() {
        log.info("Got request");
        return courseRepository.findAllCourses().stream()
                .map(Course::toDto)
                .collect(toList());
    }
}
