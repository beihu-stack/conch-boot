package ltd.beihu.core.beihubootdingtalksample;

import ltd.beihu.core.web.boot.response.BasicResponse;
import ltd.beihu.core.web.boot.response.JsonResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author: zjz
 * @Desc: 接口
 * @Date: 2019/10/17
 * @Version: V1.0.0
 */
@RestController
public class TestDingTalkMessage {

    @Resource
    private SendTextMessageWarning sendTextMessageWarning;

    @RequestMapping("/test")
    public JsonResponse testDingTalkMessage() throws Exception {
        sendTextMessageWarning.dingtalkMessage("这是一个测试钉钉机器人信息");
        return BasicResponse.success();
    }
}
