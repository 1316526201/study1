package com.guigu.springboot1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Spring03LoggingApplicationTests {
    //记录器
    Logger logger= LoggerFactory.getLogger(getClass());
    @Test
    public void contextLoads() {
        //这是日志的级别
        //由低到高  trace<debug<info<warn<error
        //可以调整日志输出界别
        logger.trace("这是trace日志");
        logger.debug("这是debug日志");
        logger.info("这是warn日志");
        logger.error("这是error日志");
    }

}
