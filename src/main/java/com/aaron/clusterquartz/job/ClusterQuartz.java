package com.aaron.clusterquartz.job;

import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author FengHaixin
 * @description 一句话描述该文件的用途
 * @date 2016-05-23
 */
@Service
public class ClusterQuartz implements Serializable
{

    public void printUserInfo()
    {


        System.out.println("***      start     *************");
        SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
        Date now = new Date();
        String strNow = format.format(now);
        String msg = String.format("do Quartz Task at %s", strNow);
        System.out.println(msg);

        System.out.println("*");
        System.out.println("*        current username is " + System.getProperty("user.name"));
        System.out.println("*        current os name is " + System.getProperty("os.name"));
        System.out.println("*");

        System.out.println("*********current user information end******************");


    }
}
