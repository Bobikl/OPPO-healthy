package com.oplus.seedling.sdk.utils;

import com.oplus.aiunit.vision.bs9;
import com.oplus.aiunit.vision.t6e;
import java.nio.charset.Charset;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import p010kotlin.Metadata;
import p010kotlin.Pair;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.Charsets;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\t\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0007J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004H\u0007J\u001c\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r2\u0006\u0010\u000b\u001a\u00020\u0004H\u0003R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/oplus/seedling/sdk/utils/SeedlingUtils;", "", "()V", "TAG", "", "kotlin.jvm.PlatformType", "TIMESTAMP", "TIMESTAMP_RESET_VALUE", "", "getResetTimestampData", "", "data", "getTimestampFromData", "Lkotlin/Pair;", "", "", "pantanal-client_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SeedlingUtils {

    @NotNull
    public static final SeedlingUtils INSTANCE = new SeedlingUtils();
    private static final String TAG = SeedlingUtils.class.getSimpleName();

    @NotNull
    private static final String TIMESTAMP = "timestamp";
    private static final int TIMESTAMP_RESET_VALUE = 0;

    private SeedlingUtils() {
    }

    @JvmStatic
    @NotNull
    public static final String getResetTimestampData(@NotNull String data) {
        Intrinsics.checkNotNullParameter(data, "data");
        if (getTimestampFromData(data).getFirst().booleanValue()) {
            String string = new JSONObject(data).put("timestamp", 0).toString();
            Intrinsics.checkNotNullExpressionValue(string, "JSONObject(data).put(TIM…P_RESET_VALUE).toString()");
            return string;
        }
        t6e t6eVar = t6e.INSTANCE;
        String TAG2 = TAG;
        Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
        bs9.a.c(t6eVar, TAG2, "getTimestampFromData, not support timestamp, just return origin data", false, null, false, 0, false, null, 252, null);
        return data;
    }

    @JvmStatic
    private static final Pair<Boolean, Long> getTimestampFromData(String data) {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject(data);
        } catch (JSONException e2) {
            t6e t6eVar = t6e.INSTANCE;
            String TAG2 = TAG;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            bs9.a.c(t6eVar, TAG2, "getTimestampFromData error, msg = " + e2.getMessage(), false, null, false, 0, false, null, 252, null);
            jSONObject = null;
        }
        boolean z = false;
        if (jSONObject != null && jSONObject.has("timestamp")) {
            z = true;
        }
        return z ? new Pair<>(Boolean.TRUE, Long.valueOf(jSONObject.getLong("timestamp"))) : new Pair<>(Boolean.FALSE, 0L);
    }

    @JvmStatic
    @NotNull
    public static final byte[] getResetTimestampData(@NotNull byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        Charset charset = Charsets.UTF_8;
        String str = new String(data, charset);
        if (!getTimestampFromData(str).getFirst().booleanValue()) {
            t6e t6eVar = t6e.INSTANCE;
            String TAG2 = TAG;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            bs9.a.c(t6eVar, TAG2, "getTimestampFromData, not support timestamp, just return origin data", false, null, false, 0, false, null, 252, null);
            return data;
        }
        String string = new JSONObject(str).put("timestamp", 0).toString();
        Intrinsics.checkNotNullExpressionValue(string, "JSONObject(uiData).put(T…P_RESET_VALUE).toString()");
        byte[] bytes = string.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        return bytes;
    }
}
