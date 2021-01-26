package hello.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
    // 예제 AppConfig와 충돌 방지
    excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION,
        classes =Configuration.class)
)
public class AutoAppConfig {


}
