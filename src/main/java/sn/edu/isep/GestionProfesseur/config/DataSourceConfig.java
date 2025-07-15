package sn.edu.isep.GestionProfesseur.config;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
    public class DataSourceConfig {

        @Value("${db.url}")
        private String dbUrl;
        @Value("${db.username}")
        private String dbUsername;
        @Value("${db.password}")
        private String dbPassword;
        @Value("${db.driver}")
        private String dbDriver;

    }
