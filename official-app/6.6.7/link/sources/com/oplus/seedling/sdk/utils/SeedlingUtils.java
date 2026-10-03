package com.oplus.seedling.sdk.utils;

import com.oplus.aiunit.vision.ht9;
import com.oplus.aiunit.vision.s8e;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
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
        if (((Boolean) getTimestampFromData(data).getFirst()).booleanValue()) {
            String string = new JSONObject(data).put(TIMESTAMP, 0).toString();
            Intrinsics.checkNotNullExpressionValue(string, "JSONObject(data).put(TIM…P_RESET_VALUE).toString()");
            return string;
        }
        s8e s8eVar = s8e.INSTANCE;
        String str = TAG;
        Intrinsics.checkNotNullExpressionValue(str, "TAG");
        ht9.a.c(s8eVar, str, "getTimestampFromData, not support timestamp, just return origin data", false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
        return data;
    }

    @JvmStatic
    private static final Pair<Boolean, Long> getTimestampFromData(String data) {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject(data);
        } catch (JSONException e) {
            s8e s8eVar = s8e.INSTANCE;
            String str = TAG;
            Intrinsics.checkNotNullExpressionValue(str, "TAG");
            ht9.a.c(s8eVar, str, "getTimestampFromData error, msg = " + e.getMessage(), false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
            jSONObject = null;
        }
        boolean z = false;
        if (jSONObject != null && jSONObject.has(TIMESTAMP)) {
            z = true;
        }
        return z ? new Pair<>(Boolean.TRUE, Long.valueOf(jSONObject.getLong(TIMESTAMP))) : new Pair<>(Boolean.FALSE, 0L);
    }

    @JvmStatic
    @NotNull
    public static final byte[] getResetTimestampData(@NotNull byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        Charset charset = Charsets.UTF_8;
        String str = new String(data, charset);
        if (!((Boolean) getTimestampFromData(str).getFirst()).booleanValue()) {
            s8e s8eVar = s8e.INSTANCE;
            String str2 = TAG;
            Intrinsics.checkNotNullExpressionValue(str2, "TAG");
            ht9.a.c(s8eVar, str2, "getTimestampFromData, not support timestamp, just return origin data", false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
            return data;
        }
        String string = new JSONObject(str).put(TIMESTAMP, 0).toString();
        Intrinsics.checkNotNullExpressionValue(string, "JSONObject(uiData).put(T…P_RESET_VALUE).toString()");
        byte[] bytes = string.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        return bytes;
    }
}
