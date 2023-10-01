package com.udemy.primeiroprojetospringbatch.job;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ImprimeOlaJobConfig {

    @Bean
    public Job imprimeOlaJob(JobBuilderFactory jobBuilderFactory, Step step) {
        return jobBuilderFactory
                .get("imprimeOlaJob")
                .start(step)
                .incrementer(new RunIdIncrementer())
                .build();
    }

}
