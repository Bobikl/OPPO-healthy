package com.oplus.aiunit.vision;

import com.heytap.health.watch.netnumber.callinterception.AbsCallInterceptionHandlerKt;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\n\u0012\u000e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\f\u0012\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\f\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\n¢\u0006\u0004\b\u0012\u0010\u0013J\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0014"}, d2 = {"Lcom/oplus/aiunit/vision/gk9;", "", "Lcom/oplus/aiunit/vision/jw9;", "a", "Lcom/oplus/aiunit/vision/jw9;", AbsCallInterceptionHandlerKt.GSON_KEY_RESPONSE, "", "code", "", "message", "", SpeechConstant.KEY_TTS_REQUEST_HEADER, "Lkotlin/Function0;", "", "bodyFunction", "", "contentLengthFunction", "configs", "<init>", "(ILjava/lang/String;Ljava/util/Map;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/util/Map;)V", "com.heytap.nearx.httpdns"}, k = 1, mv = {1, 4, 0})
public final class gk9 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final jw9 response;

    public gk9(int i, @Nullable String str, @NotNull Map<String, String> header, @NotNull Function0<byte[]> bodyFunction, @NotNull Function0<Long> contentLengthFunction, @NotNull Map<String, Object> configs) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(bodyFunction, "bodyFunction");
        Intrinsics.checkNotNullParameter(contentLengthFunction, "contentLengthFunction");
        Intrinsics.checkNotNullParameter(configs, "configs");
        this.response = new jw9(i, j35.c(str), header, bodyFunction, contentLengthFunction, configs);
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final jw9 getResponse() {
        return this.response;
    }
}
