package com.oplus.aiunit.vision;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.BeanProperty;

/* JADX INFO: loaded from: classes13.dex */
public class lh0 extends xdk {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f13689c;

    public lh0(odk odkVar, BeanProperty beanProperty, String str) {
        super(odkVar, beanProperty);
        this.f13689c = str;
    }

    @Override // com.oplus.aiunit.vision.xdk, com.oplus.aiunit.vision.wdk
    public String b() {
        return this.f13689c;
    }

    @Override // com.oplus.aiunit.vision.wdk
    public JsonTypeInfo.As c() {
        return JsonTypeInfo.As.EXTERNAL_PROPERTY;
    }

    @Override // com.oplus.aiunit.vision.wdk
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public lh0 a(BeanProperty beanProperty) {
        return this.b == beanProperty ? this : new lh0(this.a, beanProperty, this.f13689c);
    }
}
