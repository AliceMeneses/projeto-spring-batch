package com.udemy.primeiroprojetospringbatch.config;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BatchConfig {

    @Bean
    public Job imprimeOla(JobBuilderFactory jobBuilderFactory, Step step) {
        return jobBuilderFactory
                .get("imprimeOla")
                .start(step)
                .build();
    }

    @Bean
    public Step stepImprimeOla(StepBuilderFactory stepBuilderFactory) {
        return stepBuilderFactory
                .get("stepImprimeOla")
                .tasklet((stepContribution, chunkContext) -> {
                    System.out.println("Olá mundo");
                    return RepeatStatus.FINISHED;
                }).build();
    }

}
