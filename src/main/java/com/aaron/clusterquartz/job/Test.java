package com.aaron.clusterquartz.job;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author FengHaixin
 * @description 一句话描述该文件的用途
 * @date 2016-05-23
 */
public class Test
{
    private static final Log LOG_RECORD = LogFactory.getLog(Test.class);
    public static void main(String[] args)
    {
        LOG_RECORD.info("hello");
        new ClassPathXmlApplicationContext("/applicationContext.xml");
    }
}
