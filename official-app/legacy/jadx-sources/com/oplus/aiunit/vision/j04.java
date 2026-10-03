package com.oplus.aiunit.vision;

import android.util.Base64;
import android.util.Log;
import com.heytap.log.formatter.LogFieldKey;
import io.protostuff.MapSchema;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b,\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b,\u0010-J\n\u0010\u0003\u001a\u00020\u0002*\u00020\u0002R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006R\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0004\u001a\u0004\b\u0012\u0010\u0006R\u0017\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0004\u001a\u0004\b\u0015\u0010\u0006R\u0017\u0010\u0019\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0004\u001a\u0004\b\u0018\u0010\u0006R\u0017\u0010\u001b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0004\u001a\u0004\b\u000b\u0010\u0006R\u0017\u0010\u001d\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0004\u001a\u0004\b\u000e\u0010\u0006R\u0017\u0010\u001f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u0017\u0010!\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0004\u001a\u0004\b\u0017\u0010\u0006R\u0017\u0010#\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u0004\u001a\u0004\b\u0014\u0010\u0006R\u0017\u0010%\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u0004\u001a\u0004\b\u0011\u0010\u0006R\u0017\u0010(\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010\u0004\u001a\u0004\b'\u0010\u0006R\u0017\u0010+\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010\u0004\u001a\u0004\b*\u0010\u0006¨\u0006."}, d2 = {"Lcom/oplus/aiunit/vision/j04;", "", "", "a", "Ljava/lang/String;", "getBRAND_O", "()Ljava/lang/String;", "BRAND_O", "b", "getBRAND_ONE", "BRAND_ONE", "c", "getBRAND_R", "BRAND_R", "d", "getROM_VERSION", "ROM_VERSION", MapSchema.FIELD_NAME_ENTRY, "getROM_VERSION_OPLUS", "ROM_VERSION_OPLUS", "f", "getIS_EUROPE_PROPERTIES", "IS_EUROPE_PROPERTIES", b2n.f, "getIS_WX_PROPERTIES", "IS_WX_PROPERTIES", b2n.g, "REGION_MASK_PROPERTIES_Q", "i", "REGION_MASK_PROPERTIES_R", "j", "REGION_MASK_PROPERTIES_PIPELINE_R", MapSchema.FIELD_NAME_KEY, "REGION_PROPERTIES", LogFieldKey.LEVEL_KEY, "REGION_OPLUS_PROPERTIES", LogFieldKey.MESSAGE_KEY, "REGION_OEM_PROPERTIES", "n", "getONE_LABEL_PROPERTIES", "ONE_LABEL_PROPERTIES", "o", "getONE_PARAM_SERVICE_PROPERTIES", "ONE_PARAM_SERVICE_PROPERTIES", "<init>", "()V", "obus-sdk_release"}, k = 1, mv = {1, 7, 1})
public final class j04 {

    @NotNull
    public static final j04 INSTANCE;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final String BRAND_O;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final String BRAND_ONE;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final String BRAND_R;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static final String ROM_VERSION;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final String ROM_VERSION_OPLUS;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public static final String IS_EUROPE_PROPERTIES;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public static final String IS_WX_PROPERTIES;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public static final String REGION_MASK_PROPERTIES_Q;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public static final String REGION_MASK_PROPERTIES_R;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final String REGION_MASK_PROPERTIES_PIPELINE_R;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public static final String REGION_PROPERTIES;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final String REGION_OPLUS_PROPERTIES;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public static final String REGION_OEM_PROPERTIES;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final String ONE_LABEL_PROPERTIES;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    public static final String ONE_PARAM_SERVICE_PROPERTIES;

    static {
        j04 j04Var = new j04();
        INSTANCE = j04Var;
        BRAND_O = j04Var.a("T1BQTw==");
        BRAND_ONE = j04Var.a("T25lUGx1cw==");
        BRAND_R = j04Var.a("cmVhbG1l");
        ROM_VERSION = j04Var.a("cm8uYnVpbGQudmVyc2lvbi5vcHBvcm9t");
        ROM_VERSION_OPLUS = j04Var.a("cm8uYnVpbGQudmVyc2lvbi5vcGx1c3JvbQ==");
        IS_EUROPE_PROPERTIES = j04Var.a("b3Bwby5kY3MuZW5hYmxlLmFub255bW91cw==");
        IS_WX_PROPERTIES = j04Var.a("b3Bwby52ZXJzaW9uLmV4cA==");
        REGION_MASK_PROPERTIES_Q = j04Var.a("cm8ub3Bwby5yZWdpb25tYXJr");
        REGION_MASK_PROPERTIES_R = j04Var.a("cm8udmVuZG9yLm9wbHVzLnJlZ2lvbm1hcms=");
        REGION_MASK_PROPERTIES_PIPELINE_R = j04Var.a("cm8ub3BsdXMucGlwZWxpbmUucmVnaW9u");
        REGION_PROPERTIES = j04Var.a("cGVyc2lzdC5zeXMub3Bwby5yZWdpb24=");
        REGION_OPLUS_PROPERTIES = j04Var.a("cGVyc2lzdC5zeXMub3BsdXMucmVnaW9u");
        REGION_OEM_PROPERTIES = j04Var.a("cGVyc2lzdC5zeXMub2VtLnJlZ2lvbg==");
        ONE_LABEL_PROPERTIES = j04Var.a("Y29tLm9uZXBsdXMubW9iaWxlcGhvbmU=");
        ONE_PARAM_SERVICE_PROPERTIES = j04Var.a("Y29tLm9uZXBsdXMubW9iaWxlcGhvbmU=");
    }

    @NotNull
    public final String a(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (str.length() == 0) {
            return "";
        }
        try {
            byte[] bArrDecode = Base64.decode(str, 0);
            Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(this, Base64.DEFAULT)");
            Charset UTF_8 = StandardCharsets.UTF_8;
            Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
            return new String(bArrDecode, UTF_8);
        } catch (Throwable th) {
            Log.e("Constants", th.getMessage(), th);
            return "";
        }
    }

    @NotNull
    public final String b() {
        return REGION_MASK_PROPERTIES_PIPELINE_R;
    }

    @NotNull
    public final String c() {
        return REGION_MASK_PROPERTIES_Q;
    }

    @NotNull
    public final String d() {
        return REGION_MASK_PROPERTIES_R;
    }

    @NotNull
    public final String e() {
        return REGION_OEM_PROPERTIES;
    }

    @NotNull
    public final String f() {
        return REGION_OPLUS_PROPERTIES;
    }

    @NotNull
    public final String g() {
        return REGION_PROPERTIES;
    }
}
