package pl.osec.crm.domain.course;

class Course {

    private final String code;
    private final String name;

    Course(String code, String name) {
        this.code = code;
        this.name = name;
    }

    CourseDto toDto() {
        return new CourseDto()
                .setCode(code)
                .setName(name);
    }
}
