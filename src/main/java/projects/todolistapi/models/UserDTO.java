package projects.todolistapi.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Data
public class UserDTO  implements Serializable {

    @JsonProperty("username")
    private String username;
    @JsonProperty("last_name")
    private String last_name;
    @JsonProperty("first_name")
    private String first_name;
    private String email;
    @JsonProperty("password")
    private String password;
}
