package pl.osec.crm.domain.course;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

import static java.lang.Thread.sleep;

@Slf4j
@Configuration
class TimeoutConfiguration {

    private static final int FIVE_SECONDS = 5000;

    @PostConstruct
    void waitingBeforeStart() throws InterruptedException {
        log.info("Start waiting for : {} ms", FIVE_SECONDS);
        sleep(FIVE_SECONDS);
        log.info("End waiting");
    }
}
