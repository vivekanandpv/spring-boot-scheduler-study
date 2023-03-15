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

    //  Use fixedRate to start the next job irrespective of the completion of the previous task
    //  ++++++++++++++
    //  ____*******

    //  When the jobs are running with fixedRate,
    //  it is imperative not to wait till the completion of the previous job
    //  What if the next job has to be started and previous is not yet complete?
    //  We then opt for asynchronous scheduling with @Async
    //  To enable, in the configuration of the scheduler, use @EnableAsync
    @Async
    @Scheduled(fixedRate = 2000)   //  every 2 seconds
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
