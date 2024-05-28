package ru.translator.translator.Repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ru.translator.translator.Model.Erzya;

@Repository
public interface ErzyaRepositories extends JpaRepository<Erzya, Long> {

    @Query("select e from Erzya e where e.word = :word")
    List<Erzya> findAllByWord(String word);
}
