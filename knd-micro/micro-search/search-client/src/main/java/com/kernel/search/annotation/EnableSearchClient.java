package com.kernel.search.annotation;

import com.kernel.search.client.service.impl.QueryServiceImpl;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Import;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 控制是否加载搜索中心客户端的Service
 *
 * @author knd
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@EnableFeignClients
@Import(QueryServiceImpl.class)
public @interface EnableSearchClient {

}
