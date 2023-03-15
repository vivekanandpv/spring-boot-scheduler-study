package com.vivekanandpv.springbootschedulerstudy.scheduler;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@EnableAsync    //  for async scheduling
@EnableScheduling
public class AppSchedulerConfig {
}
