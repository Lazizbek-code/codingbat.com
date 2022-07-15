package lazizbek.uz.codingbat.repository;

import lazizbek.uz.codingbat.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Integer> {
    boolean existsByNameAndConditionAndCategoryId(String name, String condition, Integer category_id);
}
