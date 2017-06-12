package org.tduni.learn.springcloud.hello.actuate;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

/**
 * Created by kidal on 2017/6/12.
 *
 * @author kidal
 * @since 1.0.0
 */
@Component
public class RocketMQHealthIndicator implements HealthIndicator {
    /**
     *
     */
    @Override
    public Health health() {
        int errorCode = check();
        if (errorCode != 0) {
            return Health.down().withDetail("Error Code", errorCode).build();
        }
        return Health.up().build();
    }

    /**
     *
     */
    private int check() {
        return 1;
    }
}
