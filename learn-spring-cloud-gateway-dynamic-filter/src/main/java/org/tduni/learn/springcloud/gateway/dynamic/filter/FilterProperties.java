package org.tduni.learn.springcloud.gateway.dynamic.filter;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by kidal on 2017/6/13.
 *
 * @author kidal
 * @since 1.0.0
 */
@ConfigurationProperties("self.filter")
@Data
public class FilterProperties {
    private String root;
    private Integer interval;
}
