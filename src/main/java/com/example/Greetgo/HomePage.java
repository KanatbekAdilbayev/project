package com.example.Greetgo;
/**
 * Created by kanatbek on 7/4/17.
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class HomePage {
    @Autowired
    WordRepo wordRepo;
    String currentWord="";

    @RequestMapping("/")
    public String index(Word word) {
        if (wordRepo.count() == 0) {
            word.setWord("Hello world!");
            wordRepo.save(word);
            return word.getWord();  }
        else {
            List<Word> list = (List<Word>) wordRepo.findByWord(currentWord);
            return list.get(0).getWord();   }
    }

    @RequestMapping(value = "/edit",method = RequestMethod.GET)
    public @ResponseBody
    void Edit(Word word,@RequestParam("letter") String letter){
        wordRepo.deleteAll();
        word.setWord(letter);
        currentWord = word.getWord();
        wordRepo.save(word);
    }
    
}