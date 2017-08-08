package com.nix.at.jtp;

/**
 * Created by ymkocv on 8/4/2017.
 */
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

public class StudentDTO {
    @JsonIgnoreProperties(ignoreUnknown = true)

        private String name;
        private String course;
        private int age;
        private int id;

        @JsonCreator
        public StudentDTO(
                @JsonProperty("age") int id,
                @JsonProperty("name") String name,
                @JsonProperty("course") String course,
                @JsonProperty("age") int age)
                //@JsonProperty("student") Student student,
        {
            this.id = id;
            this.name = name;
            this.course = course;
            this.age = age;
        }

 	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

    public String getCourse() {
        return course;
    }

    public void setCourse(int age) {
        this.course = course;
    }
//	public Student getStudent() {
//		return student;
//	}
//
//	public void setStudent(Student student) {
//		this.student = student;
//	}

}
