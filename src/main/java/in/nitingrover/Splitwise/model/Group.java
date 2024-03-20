package in.nitingrover.Splitwise.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Group extends BaseModel{
    private String name;
    private List<Expense> expenses;
    private List<User> users;
}
