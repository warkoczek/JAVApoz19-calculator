package pl.sda.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan("pl.sda.spring")
@ImportResource("classpath*:application-beans.xml")
class AppConfig {
}
