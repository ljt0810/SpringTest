package hello.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan( //기존 예제 코드를 남겨놓기위해서 작성한 코드임
//        basePackages = "hello.core.member", //스캔을 시작할 패키지 위치 지정
//        basePackageClasses = AutoAppConfig.class, //스캔을 시작할 클래스 위치 지정

        //이처럼 하지않고 설정 정보 클래스의 위치를 프로젝트 최상단에 두면된다. (권장되는 방법)
        //스프링 부트를 사용하면 스프링 부트의 대표 시작 정보인 @SpringBootApplication 을 이 프로젝트 시작 루트 위치에 두는 것이 관례이다.
        //그리고 이 설정안에 바로 '@ComponentScan이 들어있다.
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
)
public class AutoAppConfig {

}
