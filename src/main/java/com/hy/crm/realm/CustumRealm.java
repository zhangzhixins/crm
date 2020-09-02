package com.hy.crm.realm;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.hy.crm.pojo.User;
import com.hy.crm.service.IUserService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

public class CustumRealm extends AuthorizingRealm {
    @Autowired
    private IUserService userService;
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {//授权

        return null;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {//认证

        //1,从主体传过来的认证信息中，获取认证名
        UsernamePasswordToken usernamePasswordToken=(UsernamePasswordToken) authenticationToken;
        String username=usernamePasswordToken.getUsername();
        //2.通过用户名到数据库中获取凭证
        QueryWrapper queryWrapper=new QueryWrapper();
        queryWrapper.eq("username",username);
        User user=userService.getOne(queryWrapper);
        //3.用户是否存在
        if(user==null){
            throw new UnknownAccountException("用户不存在");
        }
        /*Object principal=username;
        Object credentials="2bbffae8c52dd2532dfe629cecfb2c85";
        String realmName=getName();
        ByteSource credentislsSalt=ByteSource.Util.bytes(username);*/
        //4.构造
        SimpleAuthenticationInfo simpleAuthenticationInfo=new SimpleAuthenticationInfo(user.getUsername(),user.getPwd(),getName());
        /*simpleAuthenticationInfo.setCredentialsSalt(ByteSource.Util.bytes(username));*/
        return simpleAuthenticationInfo;
    }


}
