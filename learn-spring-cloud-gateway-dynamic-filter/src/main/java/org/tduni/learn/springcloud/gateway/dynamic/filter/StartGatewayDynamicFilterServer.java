package org.tduni.learn.springcloud.gateway.dynamic.filter;

import com.netflix.zuul.FilterFileManager;
import com.netflix.zuul.FilterLoader;
import com.netflix.zuul.groovy.GroovyCompiler;
import com.netflix.zuul.groovy.GroovyFileFilter;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

/**
 * Created by kidal on 2017/6/13.
 *
 * @author kidal
 * @since 1.0.0
 */
@SpringCloudApplication
@EnableZuulProxy
@EnableConfigurationProperties({FilterProperties.class})
public class StartGatewayDynamicFilterServer {
    /**
     *
     */
    public static void main(String[] args) {
        new SpringApplicationBuilder(StartGatewayDynamicFilterServer.class).web(true).run(args);
    }

    /**
     *
     */
    @Bean
    public FilterLoader filterLoader(FilterProperties properties) {
        FilterLoader filterLoader = FilterLoader.getInstance();
        filterLoader.setCompiler(new GroovyCompiler());
        try {
            FilterFileManager.setFilenameFilter(new GroovyFileFilter());
            FilterFileManager.init(
                    properties.getInterval(),
                    properties.getRoot() + "/pre",
                    properties.getRoot() + "/post"
            );
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return filterLoader;
    }
}
