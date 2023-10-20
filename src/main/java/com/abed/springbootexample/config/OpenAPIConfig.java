package com.abed.springbootexample.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.info.BuildProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Getter
@Setter
public class OpenAPIConfig {

    private final BuildProperties properties;
    private final String activeProfiles;


    public OpenAPIConfig(BuildProperties properties,
                         @Value("${spring.profiles.active:}") String activeProfiles) {
        this.properties = properties;
        this.activeProfiles = activeProfiles;
    }

    @Bean
    public OpenAPI customOpenApi(){
        return new OpenAPI()
                .info(getInfo());
    }
    public Info getInfo(){
        return new Info()
                .title(properties.getName())
                .description(properties.get("description") +  " - Profiles[s]: " +  activeProfiles)
                .version(properties.getVersion())
                .contact(getContact());
    }

    public Contact getContact(){
        return new Contact()
                .name(properties.get("teamName"))
                .email(properties.get("email"))
                .url(properties.get("url"));
    }
}
