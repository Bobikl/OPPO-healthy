package com.oplus.aiunit.vision;

import io.netty.handler.codec.DecoderResult;
import io.netty.util.internal.StringUtil;

/* JADX INFO: loaded from: classes19.dex */
public class q5c {
    public final p5c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f15633j;
    public final Object k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final DecoderResult f15634l;

    public q5c(p5c p5cVar) {
        this(p5cVar, null, null);
    }

    public DecoderResult a() {
        return this.f15634l;
    }

    public p5c b() {
        return this.i;
    }

    public Object c() {
        return this.k;
    }

    public Object d() {
        return this.f15633j;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(StringUtil.simpleClassName(this));
        sb.append('[');
        sb.append("fixedHeader=");
        sb.append(b() != null ? b().toString() : "");
        sb.append(", variableHeader=");
        sb.append(d() != null ? this.f15633j.toString() : "");
        sb.append(", payload=");
        sb.append(c() != null ? this.k.toString() : "");
        sb.append(']');
        return sb.toString();
    }

    public q5c(p5c p5cVar, Object obj) {
        this(p5cVar, obj, null);
    }

    public q5c(p5c p5cVar, Object obj, Object obj2) {
        this(p5cVar, obj, obj2, DecoderResult.SUCCESS);
    }

    public q5c(p5c p5cVar, Object obj, Object obj2, DecoderResult decoderResult) {
        this.i = p5cVar;
        this.f15633j = obj;
        this.k = obj2;
        this.f15634l = decoderResult;
    }
}
