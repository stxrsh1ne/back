package ru.translator.translator.Repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ru.translator.translator.Model.Russian;

@Repository
public interface RussianRepositories extends JpaRepository<Russian, Long> {

    @Query("select e from Russian e where e.word = :word")
    List<Russian> findAllByWord(String word);
}
