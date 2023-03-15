package com.vivekanandpv.springbootschedulerstudy.scheduler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class ScheduledJobRunner {
    private final Logger logger = LoggerFactory.getLogger(ScheduledJobRunner.class);

    //  also, initialDelay
    @Scheduled(initialDelayString = "${app.scheduler.initial-delay}", fixedDelayString = "${app.scheduler.delay}")   //  initial delay of 5s then the delay specified
    public void doJob() {
        logger.info(
                String.format(
                        "Thread %d is running scheduled job running at %s",
                        Thread.currentThread().getId(),
                        LocalDateTime.now()
                )
        );
    }
}
