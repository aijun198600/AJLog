package com.aijun.ajlog;

/**
 * Created by Aijun on 2017/10/23.
 */

import com.aijun.ajotherlog.AJOtherLog;
import com.alibaba.fastjson.JSON;

public class AJLog {

    public static void log() {

        Group group = new Group();
        group.setId(0L);
        group.setName("admin");

        User guestUser = new User();
        guestUser.setId(2L);
        guestUser.setName("guest");

        User rootUser = new User();
        rootUser.setId(3L);
        rootUser.setName("root");

        group.addUser(guestUser);
        group.addUser(rootUser);

        String jsonString = JSON.toJSONString(group);

        System.out.println(jsonString);

        System.out.print(AJOtherLog.logMessage);
//        System.out.print("======AJLog");
    }

}
