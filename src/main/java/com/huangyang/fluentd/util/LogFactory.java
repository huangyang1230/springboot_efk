package com.huangyang.fluentd.util;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import java.util.UUID;

/**
 * @author Yang Huang
 * @create 2023-10-21-11:21
 * @description TODO
 */
@Component
@Slf4j
public class LogFactory  implements InitializingBean{

    public void log() {
        log.debug("开始记录日志");
        while (true) {
            log.debug("我是debug日志,{}", UUID.randomUUID().toString());
            log.info("我是info日志,{}", UUID.randomUUID().toString());

            try {
                int i = 1 / 0;
            } catch (Exception e) {
                log.error("产生了错误", e);
            }
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        log();
    }
}
