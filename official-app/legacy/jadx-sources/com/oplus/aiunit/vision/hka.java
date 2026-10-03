package com.oplus.aiunit.vision;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u000f2\u00020\u0001:\u0001\bB\u0011\b\u0002\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\t\u001a\u00020\u0002H\u0016R\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/oplus/aiunit/vision/hka;", "", "", "name", "", "c", "b", "", "a", "toString", "Lorg/json/JSONObject;", "Lorg/json/JSONObject;", "jsonObject", "<init>", "(Lorg/json/JSONObject;)V", "Companion", "core-statistics_release"}, k = 1, mv = {1, 7, 1})
public final class hka {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final JSONObject jsonObject;

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.hka$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lcom/oplus/aiunit/vision/hka$a;", "", "", "jsonString", "Lcom/oplus/aiunit/vision/hka;", "a", "<init>", "()V", "core-statistics_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final hka a(@NotNull String jsonString) throws JSONException {
            Intrinsics.checkNotNullParameter(jsonString, "jsonString");
            return new hka(new JSONObject(jsonString), null);
        }
    }

    public /* synthetic */ hka(JSONObject jSONObject, DefaultConstructorMarker defaultConstructorMarker) {
        this(jSONObject);
    }

    public final int a(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        try {
            if (c(name)) {
                return 0;
            }
            return this.jsonObject.getInt(name);
        } catch (JSONException unused) {
            return 0;
        }
    }

    @Nullable
    public final String b(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (c(name)) {
            return null;
        }
        return this.jsonObject.optString(name);
    }

    public final boolean c(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.jsonObject.isNull(name) || this.jsonObject.opt(name) == null;
    }

    @NotNull
    public String toString() {
        String string = this.jsonObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "jsonObject.toString()");
        return string;
    }

    public hka(JSONObject jSONObject) {
        this.jsonObject = jSONObject;
    }
}
