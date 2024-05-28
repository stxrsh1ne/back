package ru.translator.translator.Service.Impl;

import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.translator.translator.Model.Russian;
import ru.translator.translator.Repositories.RussianRepositories;
import ru.translator.translator.Service.RussianService;

@Service
public class RussianServiceImpl implements RussianService {

    private final RussianRepositories russianRepositories;

    public RussianServiceImpl(RussianRepositories russianRepositories) {
        this.russianRepositories = russianRepositories;
    }

    @Override
    public List<Russian> getTranslationOnRussian(String word){
        return russianRepositories.findAllByWord(word);
    }
}
