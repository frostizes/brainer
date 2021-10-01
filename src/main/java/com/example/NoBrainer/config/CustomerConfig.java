package com.example.NoBrainer.config;

import com.example.NoBrainer.model.Customer;
import com.example.NoBrainer.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class CustomerConfig {

    @Bean
    CommandLineRunner commandLineRunner(CustomerRepository repository){
      return args -> {
          Customer ben = new Customer(
                  1L,
                  "ben",
                  "ben",
                  "ben",
                  "ben"
          );

          repository.saveAll(List.of(ben));
      };
    };
}
