package com.zzzz.filter;

import org.springframework.cloud.netflix.zuul.filters.route.FallbackProvider;
import org.springframework.http.client.ClientHttpResponse;

/**
 * Created by zly on 2019/3/21.
 */
public class ApiFallbackProvider  implements FallbackProvider{
    @Override
    public String getRoute() {
        return null;
    }

    @Override
    public ClientHttpResponse fallbackResponse(String s, Throwable throwable) {
        return null;
    }
}
