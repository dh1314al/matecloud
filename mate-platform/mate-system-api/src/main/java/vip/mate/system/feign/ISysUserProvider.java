package vip.mate.system.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import vip.mate.core.common.api.Result;
import vip.mate.core.feign.constant.FeignConstant;
import vip.mate.system.dto.UserInfo;
import vip.mate.system.entity.SysUser;

import javax.servlet.http.HttpServletRequest;

@FeignClient(value = FeignConstant.MATE_CLOUD_SYSTEM)
public interface ISysUserProvider {

    @GetMapping("/provider/user-info-by-id")
    Result<SysUser> userInfoById(@RequestParam("userId") Long userId);

    @GetMapping("/provider/user-info")
    UserInfo loadUserByUserName(@RequestParam("userName") String userName);

    @GetMapping("/provider/mobile")
    UserInfo loadUserByMobile(@RequestParam("mobile") String mobile);

}
