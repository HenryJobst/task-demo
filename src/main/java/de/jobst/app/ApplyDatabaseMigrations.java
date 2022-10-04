package de.jobst.app;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.task.configuration.EnableTask;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
@EnableTask
@Profile("migration")
public class ApplyDatabaseMigrations {

    @Bean
    public CommandLineRunner commandLineRunner() {
        return new ApplyDbMigrationsCommandLineRunner();
    }

    public static void main(String[] args) {
        SpringApplication.run(ApplyDatabaseMigrations.class, args);
    }

    public static class ApplyDbMigrationsCommandLineRunner implements CommandLineRunner {
        @Override
        public void run(String... strings) throws Exception {
            System.out.println("ApplyDbMigrationsCommandLineRunner finished!");
        }
    }
}
