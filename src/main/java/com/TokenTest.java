package com;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;

import java.util.Date;

public class TokenTest {
    public static void main(String[] args) {
        Person person = new Person();
        person.setAge(100);
        person.setName("徐");
        person.setBirthday(1997);
        System.out.println(person.toString());
        String token = JWT.create()
                .withExpiresAt(new Date(System.currentTimeMillis()))  //设置过期时间
                .withAudience(String.valueOf(person)) //设置接受方信息，一般是登录用户
                .sign(Algorithm.HMAC256("111111"));  //使用HMAC算法，111111作为密钥加密
        System.out.println("解析 token 为：" + token);

        String userId = JWT.decode(token).getAudience().get(0);
        System.out.println("解析 userId 为：" + userId);
        JWTVerifier jwtVerifier = JWT.require(Algorithm.HMAC256("111111")).build();

        System.out.println(jwtVerifier.verify(token).getToken());
        System.out.println(jwtVerifier.verify(token));
    }
}
