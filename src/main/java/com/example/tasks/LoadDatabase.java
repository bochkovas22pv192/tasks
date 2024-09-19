package com.example.tasks;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import java.time.Instant;
//import java.time.LocalDate;
//import java.time.LocalDateTime;
//
//@Configuration
//class LoadDatabase {
//
//    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);
//
//    @Bean
//    CommandLineRunner initDatabase(TaskRepository repository) {
//
//        return args -> {
//            log.info("Preloading " + repository.save(new Task("Ivan@mail.ru", "Помыть полы", "Мыть полы", "Высокий", "Ivan@mail.ru", LocalDate.now(),  LocalDateTime.now(), State.NEW, LocalDateTime.now() )));
//        };
//    }
//}

class LoadDatabase {}
