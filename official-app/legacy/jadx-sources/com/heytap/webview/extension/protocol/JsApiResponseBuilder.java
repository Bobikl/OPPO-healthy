package com.heytap.webview.extension.protocol;

import com.oplus.aiunit.vision.jla;
import org.apache.commons.codec.language.bm.Languages;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import p010kotlin.Deprecated;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated(message = "use IJsApiCallback.fail or IJsApiCallback.success")
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0001J\u0006\u0010\n\u001a\u00020\u0001J\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/heytap/webview/extension/protocol/JsApiResponseBuilder;", "", "()V", "jsonObject", "Lorg/json/JSONObject;", "resultObject", "addResult", "name", "", Languages.ANY, jla.DEFAULT_BUILD_METHOD, "setCode", "code", "", "setMessage", "msg", "Companion", "lib_webext_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class JsApiResponseBuilder {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final JSONObject jsonObject;

    @NotNull
    private final JSONObject resultObject;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, d2 = {"Lcom/heytap/webview/extension/protocol/JsApiResponseBuilder$Companion;", "", "()V", "newBuilder", "Lcom/heytap/webview/extension/protocol/JsApiResponseBuilder;", "lib_webext_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final JsApiResponseBuilder newBuilder() {
            return new JsApiResponseBuilder(null);
        }
    }

    public /* synthetic */ JsApiResponseBuilder(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @JvmStatic
    @NotNull
    public static final JsApiResponseBuilder newBuilder() {
        return INSTANCE.newBuilder();
    }

    @NotNull
    public final JsApiResponseBuilder addResult(@NotNull String name, @NotNull Object any) throws JSONException {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(any, "any");
        this.resultObject.put(name, any);
        return this;
    }

    @NotNull
    public final Object build() {
        return this.jsonObject;
    }

    @NotNull
    public final JsApiResponseBuilder setCode(int code) throws JSONException {
        this.jsonObject.put("code", code);
        return this;
    }

    @NotNull
    public final JsApiResponseBuilder setMessage(@NotNull String msg) throws JSONException {
        Intrinsics.checkNotNullParameter(msg, "msg");
        this.jsonObject.put("msg", msg);
        return this;
    }

    private JsApiResponseBuilder() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        this.jsonObject = jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        this.resultObject = jSONObject2;
        jSONObject.put("data", jSONObject2);
    }
}
