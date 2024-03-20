package in.nitingrover.Splitwise.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
public class UserExpense extends BaseModel{
    private double amount;
    private User user;
}
