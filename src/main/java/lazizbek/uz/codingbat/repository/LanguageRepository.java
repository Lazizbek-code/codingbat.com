package lazizbek.uz.codingbat.repository;

import lazizbek.uz.codingbat.entity.Language;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LanguageRepository extends JpaRepository<Language, Integer> {

    boolean existsByName(String name);

}
