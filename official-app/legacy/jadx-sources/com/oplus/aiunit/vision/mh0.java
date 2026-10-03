package com.oplus.aiunit.vision;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.BeanProperty;

/* JADX INFO: loaded from: classes13.dex */
public class mh0 extends jh0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f14065c;

    public mh0(odk odkVar, BeanProperty beanProperty, String str) {
        super(odkVar, beanProperty);
        this.f14065c = str;
    }

    @Override // com.oplus.aiunit.vision.xdk, com.oplus.aiunit.vision.wdk
    public String b() {
        return this.f14065c;
    }

    @Override // com.oplus.aiunit.vision.jh0, com.oplus.aiunit.vision.wdk
    public JsonTypeInfo.As c() {
        return JsonTypeInfo.As.PROPERTY;
    }

    @Override // com.oplus.aiunit.vision.jh0
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public mh0 a(BeanProperty beanProperty) {
        return this.b == beanProperty ? this : new mh0(this.a, beanProperty, this.f14065c);
    }
}
