package com.oplus.aiunit.vision;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.BeanProperty;

/* JADX INFO: loaded from: classes13.dex */
public class nh0 extends xdk {
    public nh0(odk odkVar, BeanProperty beanProperty) {
        super(odkVar, beanProperty);
    }

    @Override // com.oplus.aiunit.vision.wdk
    public JsonTypeInfo.As c() {
        return JsonTypeInfo.As.WRAPPER_OBJECT;
    }

    @Override // com.oplus.aiunit.vision.wdk
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public nh0 a(BeanProperty beanProperty) {
        return this.b == beanProperty ? this : new nh0(this.a, beanProperty);
    }
}
