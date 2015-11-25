package com.woawi.wx.server;


import com.woawi.wx.Environment;
import com.woawi.wx.message.FocusMeMessage;
import lombok.extern.slf4j.Slf4j;
import me.chanjar.weixin.common.api.WxConsts;
import me.chanjar.weixin.mp.api.WxMpMessageRouter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * 项目启动完成初始化
 *
 * @author ylxia
 * @version 1.0
 * @package com.iyerka
 * @date 2015-08-21 15:51:19
 */
@Slf4j
@Component
public class ApplicationStartUp implements ApplicationListener<ContextRefreshedEvent> {

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        ApplicationContext context = event.getApplicationContext();
        Environment.setI18n(context);


        WxMpMessageRouter router = context.getBean(WxMpMessageRouter.class);


    }


}