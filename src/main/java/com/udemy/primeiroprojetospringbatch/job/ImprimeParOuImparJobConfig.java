package com.udemy.primeiroprojetospringbatch.job;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ImprimeParOuImparJobConfig {

    @Bean
    public Job imprimeParOuImparJob(JobBuilderFactory jobBuilderFactory, Step step) {
        return jobBuilderFactory
                .get("imprimeParOuImparJob")
                .start(step)
                .incrementer(new RunIdIncrementer())
                .build();
    }

}
