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

    //  scheduled methods are usually void methods, return value is ignored for non-void method
    //  scheduled methods should not take any input parameters
    @Scheduled(fixedDelay = 2000)   //  every 2 seconds
    //  Delay between end of the previous and start of the next is fixed
    //  ++++++++++++++____******* (fixed delay of 4 _ )
    //  Use fixedRate to start the next job irrespective of the completion of the previous task
    //  ++++++++++++++
    //  ____*******
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
