package com.design.design_pattern_study.abstract_factory_pattern.factory_method_vs_abstract_factory.component;

import com.design.design_pattern_study.abstract_factory_pattern.factory_method_vs_abstract_factory.component.Component;

public abstract class SmartWatch implements Component {
    public void 추가세팅(){
        System.out.println("SmartWatch 추가 세팅");
    }
}
