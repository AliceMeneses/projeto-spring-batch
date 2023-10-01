package com.udemy.primeiroprojetospringbatch.step;

import com.udemy.primeiroprojetospringbatch.tasklet.ImprimeOlaTasklet;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ImprimeOlaStepConfig {

    @Bean
    public Step imprimeOlaStep(StepBuilderFactory stepBuilderFactory, ImprimeOlaTasklet imprimeOlaTasklet) {
        return stepBuilderFactory
                .get("imprimeOlaStep")
                .tasklet(imprimeOlaTasklet)
                .build();
    }

}
