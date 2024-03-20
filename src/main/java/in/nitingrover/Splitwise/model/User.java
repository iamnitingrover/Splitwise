package in.nitingrover.Splitwise.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "sp_Users")
public abstract class User extends BaseModel {
    private String name;
    private String emailID;
}
