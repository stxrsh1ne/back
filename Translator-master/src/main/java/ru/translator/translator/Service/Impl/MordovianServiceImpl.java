package ru.translator.translator.Service.Impl;

import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.translator.translator.Model.Mordovian;
import ru.translator.translator.Repositories.MordovianRepositories;
import ru.translator.translator.Service.MordovianService;

@Service
public class MordovianServiceImpl implements MordovianService {

    private final MordovianRepositories mordovianRepositories;

    public MordovianServiceImpl(MordovianRepositories mordovianRepositories) {
        this.mordovianRepositories = mordovianRepositories;
    }

    @Override
    public List<Mordovian> getTranslationOnMordovian(String word) {
        return mordovianRepositories.findAllByWord(word);
    }
}
