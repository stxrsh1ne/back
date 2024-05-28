package ru.translator.translator.Service.Impl;

import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.translator.translator.Model.Erzya;
import ru.translator.translator.Repositories.ErzyaRepositories;
import ru.translator.translator.Service.ErzyaService;

@Service
public class ErzyaServiceImpl implements ErzyaService {

    private final ErzyaRepositories erzyaRepositories;

    public ErzyaServiceImpl(ErzyaRepositories erzyaRepositories) {
        this.erzyaRepositories = erzyaRepositories;
    }

    @Override
    public List<Erzya> getTranslationOnErzya(String word) {
        return erzyaRepositories.findAllByWord(word);
    }
}
