package com.example.Greetgo;

import org.springframework.data.repository.CrudRepository;


import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by kanatbek on 7/4/17.
 */
public interface WordRepo extends CrudRepository<Word,Long>{
    @Select("SELECT * from Word WHERE word = #{word}")
    List<Word> findByWord(String word);
}
