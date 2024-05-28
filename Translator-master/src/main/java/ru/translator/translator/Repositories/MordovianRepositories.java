package ru.translator.translator.Repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ru.translator.translator.Model.Mordovian;

@Repository
public interface MordovianRepositories extends JpaRepository<Mordovian, Long> {

    @Query("select e from Mordovian e where e.word = :word")
    List<Mordovian> findAllByWord(String word);
}
