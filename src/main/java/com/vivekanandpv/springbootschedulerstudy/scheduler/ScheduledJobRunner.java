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

    //  For cron:
    //  https://www.freeformatter.com/cron-expression-generator-quartz.html
    //  https://crontab.cronhub.io/

    //  Spring Cron:
    //  https://spring.io/blog/2020/11/10/new-in-spring-5-3-improved-cron-expressions
    @Scheduled(cron = "${app.scheduler.cronexp}")
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
