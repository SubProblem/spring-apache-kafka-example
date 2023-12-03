package org.example;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User {

    public String firstname;
    public String lastname;
    public Integer age;

}
