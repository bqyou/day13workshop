package tfip.day13workshop.models;

import java.time.LocalDate;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;

public class Person {

    @NotNull(message = "Name cannot be null")
    @Size(min = 2, max = 32, message = "Name must be between 2-32 chars")
    private String name;

    @Email(message = "Must be a valid email")
    private String email;

    private Boolean isMarried;

    @Min(value = 10, message = "Age cannot be less than 10")
    @Max(value = 100, message = "Age cannot be more than 100")
    private Integer age;

    @Past(message = "DOB should be in the past")
    @NotNull(message = "DOB should not be null")
    @DateTimeFormat(pattern = "MM-dd-yyyy")
    private LocalDate dateOfBirth;

    @NotEmpty(message = "You should have a hobby")
    @Size(min = 1, message = "Must be at least one hobby")
    private List<String> hobbies;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getIsMarried() {
        return isMarried;
    }

    public void setIsMarried(Boolean isMarried) {
        this.isMarried = isMarried;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

}
