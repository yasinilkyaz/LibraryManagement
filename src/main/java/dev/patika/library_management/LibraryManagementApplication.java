package dev.patika.library_management;

import org.mapstruct.MapMapping;
import org.mapstruct.MapperConfig;
import org.mapstruct.MappingTarget;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("dev.patika.library_management.core.mapper")
public class LibraryManagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(LibraryManagementApplication.class, args);
    }

}
