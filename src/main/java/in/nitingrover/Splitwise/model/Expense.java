package in.nitingrover.Splitwise.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Entity
public class Expense extends BaseModel{
    private String name;
    private LocalDateTime doneAt;
    private List<User> users;
    private List<UserExpense> userExpenses;
}
