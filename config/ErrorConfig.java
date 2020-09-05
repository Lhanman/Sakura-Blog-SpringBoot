package com.Lhan.personal_blog.config;

import org.springframework.boot.web.server.ErrorPage;
import org.springframework.boot.web.server.ErrorPageRegistrar;
import org.springframework.boot.web.server.ErrorPageRegistry;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

@Component
public class ErrorConfig implements ErrorPageRegistrar {


    @Override
    public void registerErrorPages(ErrorPageRegistry registry) {
//        ErrorPage error400Page = new ErrorPage(HttpStatus.BAD_REQUEST,"/400");
//        ErrorPage error401Page = new ErrorPage(HttpStatus.UNAUTHORIZED,"/401");
        ErrorPage error403Page = new ErrorPage(HttpStatus.FORBIDDEN,"/403");
        ErrorPage error404Page = new ErrorPage(HttpStatus.NOT_FOUND,"/404");
//        ErrorPage error500Page = new ErrorPage(HttpStatus.INTERNAL_SERVER_ERROR,"500");
        registry.addErrorPages(error403Page,error404Page);
    }
}
