package ru.translator.translator.Service;

import java.util.List;
import ru.translator.translator.Model.Russian;

public interface RussianService {

    List<Russian> getTranslationOnRussian(String word);
}
