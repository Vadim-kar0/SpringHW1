package ru.geekbrains.model;

import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class Person {
    @SerializedName("Имя")
    private String firstName;
    @SerializedName("Фамилия")
    private String lastName;
    @SerializedName("Возраст")
    private int age;


    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person person)) return false;

        return new EqualsBuilder()
                .append(firstName, ((Person) o).firstName)
                .append(lastName,((Person) o).lastName)
                .append(age,((Person) o).age)
                .isEquals();

    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder()
                .append(firstName)
                .append(lastName)
                .append(age)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
                .append("Имя",firstName)
                .append("Фамилия",lastName)
                .append("Возраст",age)
                .toString();
    }
}
