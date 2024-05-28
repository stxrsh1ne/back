package ru.translator.translator.Service;

import java.util.List;
import ru.translator.translator.Model.Erzya;

public interface ErzyaService {

    List<Erzya> getTranslationOnErzya(String word);
}
