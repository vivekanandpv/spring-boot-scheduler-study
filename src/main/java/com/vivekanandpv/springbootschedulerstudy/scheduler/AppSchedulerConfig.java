package com.vivekanandpv.springbootschedulerstudy.scheduler;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@EnableScheduling
//  configure the scheduler with an external property
//  matchIfMissing is false by default
@ConditionalOnProperty(name = "app.scheduler", matchIfMissing = false)
public class AppSchedulerConfig {
}
