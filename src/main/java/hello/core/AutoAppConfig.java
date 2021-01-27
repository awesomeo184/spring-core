package hello.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
    // 등록된 패키지부터 탐색. 디폴트는 componentScan이 등록된 클래스가 속한 패키지 및 하위 패키지
    basePackages = "hello.core",
//    basePackageClasses = AutoAppConfig.class,
//     예제 AppConfig와 충돌 방지
    excludeFilters= @ComponentScan.Filter(type = FilterType.ANNOTATION,
    classes = Configuration.class)
)
public class AutoAppConfig {


}
