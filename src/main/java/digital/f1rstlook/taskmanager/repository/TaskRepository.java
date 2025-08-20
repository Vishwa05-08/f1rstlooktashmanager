package digital.f1rstlook.taskmanager.repository;

import digital.f1rstlook.taskmanager.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // Marks this as a Spring Data repository
public interface TaskRepository extends JpaRepository<Task, Long> {
    // By extending JpaRepository, we get all the essential database
    // operations (findAll, findById, save, delete, etc.) for free!
    // We don't need to write any more code in this file.
}
