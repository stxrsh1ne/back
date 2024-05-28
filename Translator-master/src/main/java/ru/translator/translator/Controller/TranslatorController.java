package ru.translator.translator.Controller;

import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.translator.translator.Model.Erzya;
import ru.translator.translator.Model.Mordovian;
import ru.translator.translator.Model.Russian;
import ru.translator.translator.Service.ErzyaService;
import ru.translator.translator.Service.MordovianService;
import ru.translator.translator.Service.RussianService;

@RestController
@RequestMapping(value = "/translator/api/")
@AllArgsConstructor
public class TranslatorController {

    private RussianService russianService;
    private MordovianService mordovianService;
    private ErzyaService erzyaService;


    @GetMapping("/russian")
    public ResponseEntity<List<Russian>> getTranslateOnRussian(@RequestParam String word) {
        return new ResponseEntity<>(russianService.getTranslationOnRussian(word), HttpStatus.OK);
    }

    @GetMapping("/mordovian")
    public ResponseEntity<List<Mordovian>> getTranslateOnMordovian(@RequestParam String word) {
        return new ResponseEntity<>(mordovianService.getTranslationOnMordovian(word), HttpStatus.OK);
    }

    @GetMapping("/erzya")
    public ResponseEntity<List<Erzya>> getTranslateOnErzya(@RequestParam String word) {
        return new ResponseEntity<>(erzyaService.getTranslationOnErzya(word), HttpStatus.OK);
    }
}
