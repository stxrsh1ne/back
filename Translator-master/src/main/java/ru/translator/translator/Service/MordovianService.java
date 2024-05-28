package ru.translator.translator.Service;

import java.util.List;
import ru.translator.translator.Model.Mordovian;

public interface MordovianService {

    List<Mordovian> getTranslationOnMordovian(String word);
}
