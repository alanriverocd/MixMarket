package com.mx.machine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class MyBestFriendApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(MyBestFriendApplication.class, args);

        JdbcTemplate jdbcTemplate = context.getBean(JdbcTemplate.class);
        try {
            jdbcTemplate.queryForObject("SELECT 'Conexion Exitosa' FROM DUAL", String.class);
            System.out.println("Conexión exitosa a la base de datos Oracle.");
        } catch (Exception e) {
            System.err.println("Error al conectar con la base de datos Oracle: " + e.getMessage());
        }
    }
}
