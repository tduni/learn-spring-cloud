package org.tduni.learn.springcloud.feign.api;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.tduni.learn.springcloud.commons.contract.api.HelloServerApi;

/**
 * Created by kidal on 2017/6/13.
 *
 * @author kidal
 * @since 1.0.0
 */
@FeignClient(value = "HELLO-SERVER"/*, fallback = HelloServerServiceFallback.class*/)
public interface HelloServerService extends HelloServerApi {
}
