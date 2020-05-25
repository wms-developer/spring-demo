package com.wms.service.impl;

import com.wms.service.IMessageService;

/**
 * @Classname MessageServiceImpl
 * @Description TODO
 * @Date 2020/5/25 14:54
 * @Author by wms
 */
public class MessageServiceImpl implements IMessageService {

    @Override
    public String getMessage() {
        return "hello world";
    }

}
