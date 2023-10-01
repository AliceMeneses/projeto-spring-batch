package com.udemy.primeiroprojetospringbatch.step;

import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.function.FunctionItemProcessor;
import org.springframework.batch.item.support.IteratorItemReader;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class ImprimeParOuImparStepConfig {

    @Bean
    public Step imprimeParOuImparStep(StepBuilderFactory stepBuilderFactory) {
        return stepBuilderFactory
                .get("imprimeParOuImparStep")
                .<Integer, String> chunk(1)
                .reader(contaAteDezReader())
                .processor(parOuImparProcessor())
                .writer(imprimeWriter())
                .build();
    }

    private IteratorItemReader<Integer> contaAteDezReader() {
        List<Integer> numeros = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        return new IteratorItemReader<>(numeros.iterator());
    }

    private FunctionItemProcessor<Integer, String> parOuImparProcessor() {
        return new FunctionItemProcessor<>(
                item -> item % 2 == 0 ? String.format("Item %s é par", item) : String.format("Item %s é impar", item)
        );
    }

    private ItemWriter<String> imprimeWriter() {
        return itens -> itens.forEach(System.out::println);
    }

}
