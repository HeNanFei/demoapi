package com.example.demoapi.config;

import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.token.TokenEnhancer;
import org.springframework.stereotype.Component;

/**
 * @author hyh.
 * @version 1.0
 * @Date: 2021/6/9 18:49
 */
@Component
public class MyTokenEnHancer implements TokenEnhancer {
    @Override
    public OAuth2AccessToken enhance(OAuth2AccessToken accessToken, OAuth2Authentication authentication) {
        System.out.println(accessToken);

        return accessToken;
    }
}
