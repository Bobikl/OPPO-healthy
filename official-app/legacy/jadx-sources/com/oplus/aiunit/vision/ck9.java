package com.oplus.aiunit.vision;

import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\t\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0011\u0010\t\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\n8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\fR\u001d\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\n8F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\f¨\u0006\u0013"}, d2 = {"Lcom/oplus/aiunit/vision/ck9;", "", "Lcom/oplus/aiunit/vision/gw9;", "a", "Lcom/oplus/aiunit/vision/gw9;", "request", "", "d", "()Ljava/lang/String;", "url", "", "b", "()Ljava/util/Map;", SpeechConstant.KEY_TTS_REQUEST_HEADER, "c", "params", "configs", "<init>", "(Lcom/oplus/aiunit/vision/gw9;)V", "com.heytap.nearx.httpdns"}, k = 1, mv = {1, 4, 0})
public final class ck9 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final gw9 request;

    public ck9(@NotNull gw9 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.request = request;
    }

    @NotNull
    public final Map<String, Object> a() {
        return this.request.b();
    }

    @NotNull
    public final Map<String, String> b() {
        return this.request.c();
    }

    @NotNull
    public final Map<String, String> c() {
        return this.request.d();
    }

    @NotNull
    public final String d() {
        return this.request.getUrl();
    }
}
