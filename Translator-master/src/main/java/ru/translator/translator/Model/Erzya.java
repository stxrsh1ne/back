package ru.translator.translator.Model;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.ArrayList;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "erzyas")
public class Erzya {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "word")
    private String word;

    @ElementCollection
    @CollectionTable(name="listOfMordovianTranslate")
    private ArrayList<String> mordovianTranslate = new ArrayList<>();


    @ElementCollection
    @CollectionTable(name="listOfRussianTranslate")
    private ArrayList<String> russiaTranslate = new ArrayList<>();
}
