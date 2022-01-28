package com.example.online_quiz.domain.quiz;

import com.example.online_quiz.config.DataSourceProvider;

import javax.naming.NamingException;
import javax.sql.DataSource;

public class QuizDao {

    private final DataSource dataSource;

    public QuizDao() {
        try {
            this.dataSource = DataSourceProvider.getDataSource();
        } catch (NamingException e){
            throw new RuntimeException(e);
        }
    }

}
