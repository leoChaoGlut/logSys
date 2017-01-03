package cn.yunyichina.log.service.frontEnd.controller;

import cn.yunyichina.log.common.entity.dto.Response;
import cn.yunyichina.log.common.log.LoggerWrapper;
import cn.yunyichina.log.service.frontEnd.entity.User;
import cn.yunyichina.log.service.frontEnd.repository.UserRepository;
import cn.yunyichina.log.service.frontEnd.service.FrontEndService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Leo
 * @Blog: http://blog.csdn.net/lc0817
 * @CreateTime: 2016/12/30 9:37
 * @Description:
 */
@RestController
public class FrontEndController {

    final LoggerWrapper logger = LoggerWrapper.getLogger(FrontEndController.class);

    @Autowired
    FrontEndService frontEndService;

    @GetMapping("options")
    public Response getOptions() {
        try {
            logger.contextBegin("前端服务接收到请求:");
            logger.contextEnd("前端服务正常返回:");
            return Response.success(null);
        } catch (Exception e) {
            logger.error(e.getLocalizedMessage(), e);
            logger.contextEnd("前端服务异常:" + e.getLocalizedMessage());
            return Response.failure(e.getLocalizedMessage());
        }
    }

    @Autowired
    UserRepository userRepository;

    @GetMapping("test")
    public Response test() {
        User user = userRepository.save(new User().setName("aaa").setAge(11));
        System.out.println(JSON.toJSONString(user, true));
        return null;
    }
}