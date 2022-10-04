package de.jobst.app;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.task.configuration.EnableTask;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
@EnableTask
@Profile("!migration")
public class SecondAppClass {

    @Bean
    public CommandLineRunner otherCommandLineRunner() {
        return new SecondAppClassCommandLineRunner();
    }

    public static void main(String[] args) {
        SpringApplication.run(SecondAppClass.class, args);
    }

    public static class SecondAppClassCommandLineRunner implements CommandLineRunner {
        @Override
        public void run(String... strings) throws Exception {
            System.out.println("SecondAppClassCommandLineRunner finished!");
        }
    }
}
