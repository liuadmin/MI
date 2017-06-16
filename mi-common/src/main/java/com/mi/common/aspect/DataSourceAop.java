package com.mi.common.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * 数据源切换AOP
 * @author yesh
 *         (M.M)!
 *         Created by 2017/6/16.
 */
@Aspect
@Component
@Slf4j
public class DataSourceAop {

    @Before("execution(* com.mi.mapper..*.select*(..)) || execution(* com.mi.mapper..*.get*(..)) || execution(* com.mi.mapper..*.find*(..))")
    public void setReadDataSourceType() {
//        DataSourceContextHolder.read();
        log.info("dataSource切换到：Read");
    }

    @Before("execution(* com.mi.mapper..*.insert*(..)) || execution(* com.mi.mapper..*.update*(..))")
    public void setWriteDataSourceType() {
//        DataSourceContextHolder.write();
        log.info("dataSource切换到：write");
    }
}
