package org.openapitools.configuration;

import de.starwit.aicockpit.AutonomyLevel;
import de.starwit.aicockpit.ModelType;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;

@Configuration
public class EnumConverterConfiguration {

    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.autonomyLevelConverter")
    Converter<String, AutonomyLevel> autonomyLevelConverter() {
        return new Converter<String, AutonomyLevel>() {
            @Override
            public AutonomyLevel convert(String source) {
                return AutonomyLevel.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.modelTypeConverter")
    Converter<String, ModelType> modelTypeConverter() {
        return new Converter<String, ModelType>() {
            @Override
            public ModelType convert(String source) {
                return ModelType.fromValue(source);
            }
        };
    }

}
