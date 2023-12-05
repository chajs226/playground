package com.cjs.playground.beanscope;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Getter
public class Single {
    @Autowired
    private Proto proto;
}
