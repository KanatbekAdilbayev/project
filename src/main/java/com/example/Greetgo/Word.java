package com.example.Greetgo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * Created by kanatbek on 7/4/17.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Word  {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;
    private String word;
    public String getWord() {
        return word;
    }
    public void setWord(String word) {
        this.word = word;
    }


}
