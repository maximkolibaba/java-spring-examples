package com.company.annotationdemo.scope;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.company.common.Person;

@Component
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class PrototypePerson extends Person {
}
