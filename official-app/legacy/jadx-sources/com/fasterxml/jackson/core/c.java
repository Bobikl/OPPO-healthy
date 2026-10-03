package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.c;
import com.fasterxml.jackson.core.io.InputDecorator;
import com.fasterxml.jackson.core.io.OutputDecorator;

/* JADX INFO: loaded from: classes13.dex */
public abstract class c<F extends JsonFactory, B extends c<F, B>> {
    public static final int f = JsonFactory.Feature.collectDefaults();
    public static final int g = JsonParser.Feature.collectDefaults();
    public static final int h = JsonGenerator.Feature.collectDefaults();
    public int a;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2239c;
    public InputDecorator d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public OutputDecorator f2240e;

    public c() {
        this.a = f;
        this.b = g;
        this.f2239c = h;
        this.d = null;
        this.f2240e = null;
    }

    public c(JsonFactory jsonFactory) {
        this(jsonFactory._factoryFeatures, jsonFactory._parserFeatures, jsonFactory._generatorFeatures);
    }

    public c(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.f2239c = i3;
    }
}
