package com.kodilla.kodillapatterns2.facade.aop;

import com.kodilla.kodillapatterns2.facade.api.OrderDto;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class WatherFacada {
    public static final Logger LOGGER = LoggerFactory.getLogger(WatherFacada.class);

    @Before("execution(* com.kodilla.kodillapatterns2.facade.api.OrderFacade.processOrder(..))" +
    "&& args(order, userId) && target(object)")
    public void logEvent(OrderDto order, Long userId, Object object) {
        LOGGER.info("Class: " + object.getClass().getName());
        LOGGER.info("Args order: " + order.getItems().toString());
        LOGGER.info("Args user: " + userId);
    }
}
