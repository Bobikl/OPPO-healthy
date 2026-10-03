package com.oplus.aiunit.vision;

import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u0000 \u00142\u00020\u0001:\u0001\u0003B\u0011\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012B\t\b\u0010¢\u0006\u0004\b\u0011\u0010\u0013J\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004J\u0016\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\tJ\u0016\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u000bJ\b\u0010\r\u001a\u00020\u0004H\u0016R\u0016\u0010\u000f\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u000e¨\u0006\u0015"}, d2 = {"Lcom/oplus/aiunit/vision/jja;", "", "Lorg/json/JSONObject;", "a", "", "name", "defaultValue", MapSchema.FIELD_NAME_ENTRY, "d", "", "c", "", "b", "toString", "Lorg/json/JSONObject;", "jsonObject", "json", "<init>", "(Lorg/json/JSONObject;)V", "()V", "Companion", "lib_webpro_jsbridge_release"}, k = 1, mv = {1, 4, 0})
public final class jja {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public JSONObject jsonObject;

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.jja$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/oplus/aiunit/vision/jja$a;", "", "", "json", "Lcom/oplus/aiunit/vision/jja;", "a", "(Ljava/lang/String;)Lcom/oplus/aiunit/vision/jja;", "<init>", "()V", "lib_webpro_jsbridge_release"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final jja a(@NotNull String json) {
            JSONObject jSONObject;
            Intrinsics.checkNotNullParameter(json, "json");
            try {
                jSONObject = new JSONObject(json);
            } catch (JSONException unused) {
                jSONObject = new JSONObject();
            }
            return new jja(jSONObject);
        }
    }

    public jja(@NotNull JSONObject json) {
        Intrinsics.checkNotNullParameter(json, "json");
        this.jsonObject = json;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final JSONObject getJsonObject() {
        return this.jsonObject;
    }

    public final boolean b(@NotNull String name, boolean defaultValue) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.jsonObject.optBoolean(name, defaultValue);
    }

    public final int c(@NotNull String name, int defaultValue) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.jsonObject.optInt(name, defaultValue);
    }

    @NotNull
    public final String d(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        String strOptString = this.jsonObject.optString(name);
        Intrinsics.checkNotNullExpressionValue(strOptString, "jsonObject.optString(name)");
        return strOptString;
    }

    @NotNull
    public final String e(@NotNull String name, @NotNull String defaultValue) {
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

    public jja() {
        this.jsonObject = new JSONObject();
    }
}
