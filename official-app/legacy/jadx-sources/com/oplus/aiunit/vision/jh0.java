package com.oplus.aiunit.vision;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.BeanProperty;

/* JADX INFO: loaded from: classes13.dex */
public class jh0 extends xdk {
    public jh0(odk odkVar, BeanProperty beanProperty) {
        super(odkVar, beanProperty);
    }

    @Override // com.oplus.aiunit.vision.wdk
    public JsonTypeInfo.As c() {
        return JsonTypeInfo.As.WRAPPER_ARRAY;
    }

    @Override // com.oplus.aiunit.vision.wdk
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public jh0 a(BeanProperty beanProperty) {
        return this.b == beanProperty ? this : new jh0(this.a, beanProperty);
    }
}
