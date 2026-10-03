package com.oplus.aiunit.vision;

import com.heytap.speech.engine.protocol.directive.Directive;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0014\u0010\u0004\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00032\u0006\u0010\u0002\u001a\u00020\u0001¨\u0006\u0007"}, d2 = {"Lcom/oplus/aiunit/vision/lt5;", "", "directiveObj", "Lcom/heytap/speech/engine/protocol/directive/Directive;", "a", "<init>", "()V", "speechEngine_release"}, k = 1, mv = {1, 5, 1})
public final class lt5 {

    @NotNull
    public static final lt5 INSTANCE = new lt5();

    @Nullable
    public final Directive<?> a(@NotNull Object directiveObj) {
        Intrinsics.checkNotNullParameter(directiveObj, "directiveObj");
        String strA = gia.a(directiveObj);
        if (strA == null) {
            strA = "{}";
        }
        JSONObject jSONObject = new JSONObject(strA);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(SpeechConstant.KEY_TTS_REQUEST_HEADER);
        String strOptString = jSONObjectOptJSONObject == null ? null : jSONObjectOptJSONObject.optString(usm.f17592j);
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject(SpeechConstant.KEY_TTS_REQUEST_HEADER);
        String strOptString2 = jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.optString("name") : null;
        StringBuilder sb = new StringBuilder();
        sb.append((Object) strOptString);
        sb.append('.');
        sb.append((Object) strOptString2);
        return (Directive) gia.c(jSONObject.toString(), Directive.class, l78.INSTANCE.c(sb.toString()));
    }
}
