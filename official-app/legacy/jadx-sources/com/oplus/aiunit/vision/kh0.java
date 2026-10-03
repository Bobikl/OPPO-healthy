package com.oplus.aiunit.vision;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.BeanProperty;

/* JADX INFO: loaded from: classes13.dex */
public class kh0 extends mh0 {
    public kh0(odk odkVar, BeanProperty beanProperty, String str) {
        super(odkVar, beanProperty, str);
    }

    @Override // com.oplus.aiunit.vision.mh0, com.oplus.aiunit.vision.jh0, com.oplus.aiunit.vision.wdk
    public JsonTypeInfo.As c() {
        return JsonTypeInfo.As.EXISTING_PROPERTY;
    }

    @Override // com.oplus.aiunit.vision.mh0
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public kh0 a(BeanProperty beanProperty) {
        return this.b == beanProperty ? this : new kh0(this.a, beanProperty, this.f14065c);
    }
}
