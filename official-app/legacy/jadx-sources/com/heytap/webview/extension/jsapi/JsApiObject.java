package com.heytap.webview.extension.jsapi;

import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u000f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0007\b\u0010¢\u0006\u0002\u0010\u0005J\u0006\u0010\u0007\u001a\u00020\u0003J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\tJ\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000eJ\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0010J\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bJ\b\u0010\u0014\u001a\u00020\u000bH\u0016R\u000e\u0010\u0006\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/heytap/webview/extension/jsapi/JsApiObject;", "", "json", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "()V", "jsonObject", "asObject", "getBoolean", "", "name", "", "defaultValue", "getDouble", "", "getInt", "", "getLong", "", "getString", "toString", "Companion", "lib_webext_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class JsApiObject {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private JSONObject jsonObject;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/heytap/webview/extension/jsapi/JsApiObject$Companion;", "", "()V", "parse", "Lcom/heytap/webview/extension/jsapi/JsApiObject;", "json", "", "parse$lib_webext_release", "lib_webext_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final JsApiObject parse$lib_webext_release(@NotNull String json) {
            JSONObject jSONObject;
            Intrinsics.checkNotNullParameter(json, "json");
            try {
                jSONObject = new JSONObject(json);
            } catch (JSONException unused) {
                jSONObject = new JSONObject();
            }
            return new JsApiObject(jSONObject);
        }
    }

    public JsApiObject(@NotNull JSONObject json) {
        Intrinsics.checkNotNullParameter(json, "json");
        this.jsonObject = json;
    }

    @NotNull
    /* JADX INFO: renamed from: asObject, reason: from getter */
    public final JSONObject getJsonObject() {
        return this.jsonObject;
    }

    public final boolean getBoolean(@NotNull String name, boolean defaultValue) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.jsonObject.optBoolean(name, defaultValue);
    }

    public final double getDouble(@NotNull String name, double defaultValue) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.jsonObject.optDouble(name, defaultValue);
    }

    public final int getInt(@NotNull String name, int defaultValue) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.jsonObject.optInt(name, defaultValue);
    }

    public final long getLong(@NotNull String name, long defaultValue) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.jsonObject.optLong(name, defaultValue);
    }

    @NotNull
    public final String getString(@NotNull String name, @NotNull String defaultValue) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        String strOptString = this.jsonObject.optString(name, defaultValue);
        Intrinsics.checkNotNullExpressionValue(strOptString, "jsonObject.optString(name, defaultValue)");
        return strOptString;
    }

    @NotNull
    public String toString() {
        String string = this.jsonObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "jsonObject.toString()");
        return string;
    }

    @NotNull
    public final String getString(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        String strOptString = this.jsonObject.optString(name);
        Intrinsics.checkNotNullExpressionValue(strOptString, "jsonObject.optString(name)");
        return strOptString;
    }

    public JsApiObject() {
        this.jsonObject = new JSONObject();
    }
}
