package pl.osec.crm.domain.course;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

import static java.lang.Thread.sleep;

@Slf4j
@Configuration
class TimeoutConfiguration {

    private static final int WAITING_TIME_MS = 1000 * 60 * 3;

    @PostConstruct
    void waitingBeforeStart() throws InterruptedException {
        log.info("Start waiting for : {} ms", WAITING_TIME_MS);
        sleep(WAITING_TIME_MS);
        log.info("End waiting");
    }
}
