package digital.f1rstlook.taskmanager.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity // Marks this class as a database entity (a table)
@Data   // Lombok: automatically creates getters, setters, toString(), etc.
@NoArgsConstructor // Lombok: creates a no-argument constructor
@AllArgsConstructor // Lombok: creates a constructor with all arguments
public class Task {

    @Id // Marks this field as the primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-increments the ID
    private Long id;

    private String title;
    private String description;
    private boolean completed = false; // Default to not completed
    private LocalDate dueDate;
}
