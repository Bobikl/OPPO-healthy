package com.oplus.aiunit.vision;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import com.oplus.nearx.track.internal.remoteconfig.cloudconfig.entity.EventRuleEntity;
import com.oplus.pantaconnect.sdk.connectionservice.lan.LanConstants;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.TypeCastException;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \n2\u00020\u0001:\u0001\u0003R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/oplus/aiunit/vision/eh5;", "", "", "a", "Ljava/lang/String;", "OBRAND_ROM_VERSION", "Landroid/content/Context;", "b", "Landroid/content/Context;", "context", "Companion", "com.oplus.nearx.cloudconfig"}, k = 1, mv = {1, 4, 0})
public final class eh5 {
    public static final int A;
    public static final int B = 0;
    public static final int C;
    public static final int D;
    public static final int E;
    public static final int F;
    public static final int G = 0;
    public static final int H;
    public static final int I;
    public static final int J;
    public static final int K;
    public static final int L;
    public static final int M;
    public static final int N;
    public static final int O;
    public static final int P;
    public static final int Q;
    public static final int R;
    public static final int S;
    public static final int T;
    public static final int U;
    public static final int V;
    public static final int W;
    public static final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f10932l;
    public static final String m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public static final String f10933n;

    @NotNull
    public static final String o;

    @NotNull
    public static final String p;

    @NotNull
    public static final String q;
    public static final String r;

    @NotNull
    public static final String s;

    @NotNull
    public static final String t;

    @NotNull
    public static final String u;
    public static String v = null;
    public static String w = null;
    public static final int x;
    public static final int y;
    public static final int z;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final String OBRAND_ROM_VERSION;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final Context context;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final byte[] f10929c = {67, 111, 108, 111, 114, 79, 83};
    public static final String d = "unknown";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f10930e = "0";
    public static final int f = 15;
    public static final String g = ".mcs";
    public static final String h = ".ini";
    public static final String i = "mcs_msg.ini";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f10931j = "clientId";

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.eh5$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b.\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b2\u00103J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082D¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082D¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082D¢\u0006\u0006\n\u0004\b\r\u0010\nR\u0014\u0010\u000e\u001a\u00020\u00068\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0010\u0010\nR\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0011\u0010\nR\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0012\u0010\nR\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0013\u0010\nR\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0014\u0010\nR\u0014\u0010\u0015\u001a\u00020\u00068\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0015\u0010\u000fR\u0014\u0010\u0016\u001a\u00020\u00068\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0016\u0010\u000fR\u0014\u0010\u0017\u001a\u00020\u00068\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0017\u0010\u000fR\u0014\u0010\u0018\u001a\u00020\u00068\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0018\u0010\u000fR\u0014\u0010\u0019\u001a\u00020\u00068\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0019\u0010\u000fR\u0014\u0010\u001a\u001a\u00020\u00068\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001a\u0010\u000fR\u0014\u0010\u001b\u001a\u00020\u00068\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001b\u0010\u000fR\u0014\u0010\u001c\u001a\u00020\u00068\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001c\u0010\u000fR\u0014\u0010\u001d\u001a\u00020\u00068\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001d\u0010\u000fR\u0014\u0010\u001e\u001a\u00020\u00068\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001e\u0010\u000fR\u0014\u0010\u001f\u001a\u00020\u00068\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001f\u0010\u000fR\u0014\u0010 \u001a\u00020\u00068\u0002X\u0082D¢\u0006\u0006\n\u0004\b \u0010\u000fR\u0014\u0010!\u001a\u00020\u00068\u0002X\u0082D¢\u0006\u0006\n\u0004\b!\u0010\u000fR\u0014\u0010\"\u001a\u00020\u00068\u0002X\u0082D¢\u0006\u0006\n\u0004\b\"\u0010\u000fR\u0014\u0010#\u001a\u00020\u00068\u0002X\u0082D¢\u0006\u0006\n\u0004\b#\u0010\u000fR\u0014\u0010$\u001a\u00020\u00068\u0002X\u0082D¢\u0006\u0006\n\u0004\b$\u0010\u000fR\u0014\u0010%\u001a\u00020\u00068\u0002X\u0082D¢\u0006\u0006\n\u0004\b%\u0010\u000fR\u0014\u0010&\u001a\u00020\u00068\u0002X\u0082D¢\u0006\u0006\n\u0004\b&\u0010\u000fR\u0014\u0010'\u001a\u00020\u00068\u0002X\u0082D¢\u0006\u0006\n\u0004\b'\u0010\u000fR\u0014\u0010(\u001a\u00020\u00068\u0002X\u0082D¢\u0006\u0006\n\u0004\b(\u0010\u000fR\u0014\u0010)\u001a\u00020\u00068\u0002X\u0082D¢\u0006\u0006\n\u0004\b)\u0010\u000fR\u0014\u0010*\u001a\u00020\u00068\u0002X\u0082D¢\u0006\u0006\n\u0004\b*\u0010\u000fR\u0014\u0010+\u001a\u00020\u00068\u0002X\u0082D¢\u0006\u0006\n\u0004\b+\u0010\u000fR\u0014\u0010,\u001a\u00020\u00068\u0002X\u0082D¢\u0006\u0006\n\u0004\b,\u0010\u000fR\u0014\u0010-\u001a\u00020\u00068\u0002X\u0082D¢\u0006\u0006\n\u0004\b-\u0010\u000fR\u0014\u0010.\u001a\u00020\u00068\u0002X\u0082D¢\u0006\u0006\n\u0004\b.\u0010\u000fR\u0014\u0010/\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010\nR\u0016\u00100\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010\nR\u0016\u00101\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010\n¨\u00064"}, d2 = {"Lcom/oplus/aiunit/vision/eh5$a;", "", "Landroid/content/Context;", "context", "", "b", "", "networkType", "a", "CARRIER_CHINA_MOBILE", "Ljava/lang/String;", "CARRIER_CHINA_UNION", "CARRIER_NONE", "EXTRAS_KEY_CLIENT_ID", "EXTRAS_KEY_CLIENT_ID_LEN", "I", "EXTRAS_KEY_UNKNOWN", "EXTRAS_KEY_ZERO", "MCS_CONTROL_PULL_MSG_INFO_FILE_NAME", "MCS_FILE_SUFFIX_NAME", "MCS_HIDDEN_SD_CARD_FOLDER", "NETWORK_CLASS_2_G", "NETWORK_CLASS_3_G", "NETWORK_CLASS_4_G", "NETWORK_CLASS_5_G", "NETWORK_CLASS_UNAVAILABLE", "NETWORK_CLASS_UNKNOWN", "NETWORK_CLASS_WIFI", "NETWORK_TYPE_1xRTT", "NETWORK_TYPE_CDMA", "NETWORK_TYPE_EDGE", "NETWORK_TYPE_EHRPD", "NETWORK_TYPE_EVDO_0", "NETWORK_TYPE_EVDO_A", "NETWORK_TYPE_EVDO_B", "NETWORK_TYPE_GPRS", "NETWORK_TYPE_HSDPA", "NETWORK_TYPE_HSPA", "NETWORK_TYPE_HSPAP", "NETWORK_TYPE_HSUPA", "NETWORK_TYPE_IDEN", "NETWORK_TYPE_LTE", "NETWORK_TYPE_NR", "NETWORK_TYPE_UMTS", "NETWORK_TYPE_UNAVAILABLE", "NETWORK_TYPE_UNKNOWN", "NETWORK_TYPE_WIFI", "TAG", "sCarrierStatus", "sLastCarrierStatus", "<init>", "()V", "com.oplus.nearx.cloudconfig"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a(int networkType) {
            if (networkType == eh5.x) {
                return eh5.A;
            }
            if (networkType == eh5.y) {
                return eh5.z;
            }
            if (networkType == eh5.H || networkType == eh5.I || networkType == eh5.K || networkType == eh5.N || networkType == eh5.R) {
                return eh5.C;
            }
            if (networkType == eh5.J || networkType == eh5.L || networkType == eh5.M || networkType == eh5.O || networkType == eh5.P || networkType == eh5.Q || networkType == eh5.S || networkType == eh5.U || networkType == eh5.V) {
                return eh5.D;
            }
            if (networkType == eh5.T) {
                return eh5.E;
            }
            return networkType == eh5.W ? eh5.F : eh5.B;
        }

        @SuppressLint({"MissingPermission"})
        @NotNull
        public final String b(@NotNull Context context) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            int subtype = eh5.G;
            try {
                Object systemService = context.getSystemService("connectivity");
                if (systemService == null) {
                    throw new TypeCastException("null cannot be cast to non-null type android.net.ConnectivityManager");
                }
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
                if (activeNetworkInfo != null && activeNetworkInfo.isAvailable() && activeNetworkInfo.isConnected()) {
                    int type = activeNetworkInfo.getType();
                    if (type == 1) {
                        subtype = eh5.y;
                    } else if (type == 0) {
                        subtype = activeNetworkInfo.getSubtype();
                    }
                } else {
                    subtype = eh5.x;
                }
                int iA = a(subtype);
                if (iA == eh5.z) {
                    return "WIFI";
                }
                if (iA == eh5.C) {
                    return "2G";
                }
                if (iA == eh5.D) {
                    return "3G";
                }
                if (iA == eh5.E) {
                    return EventRuleEntity.ACCEPT_NET_4G;
                }
                return iA == eh5.F ? EventRuleEntity.ACCEPT_NET_5G : LanConstants.OPERATOR_UNKNOWN;
            } catch (Throwable th) {
                d7b.INSTANCE.d(eh5.k, "getNetworkType", th, new Object[0]);
            }
        }
    }

    static {
        String simpleName = eh5.class.getSimpleName();
        Intrinsics.checkExpressionValueIsNotNull(simpleName, "DeviceInfo::class.java.simpleName");
        k = simpleName;
        f10932l = "cm";
        m = "cu";
        f10933n = "ct";
        o = "ot";
        p = "bgp";
        q = "wifi";
        r = SpeechConstant.ENGINE_TYPE_NONE;
        s = "unknown";
        t = "wifi";
        u = "mobile";
        v = SpeechConstant.ENGINE_TYPE_NONE;
        w = SpeechConstant.ENGINE_TYPE_NONE;
        x = -1;
        y = -101;
        z = -101;
        A = -1;
        C = 1;
        D = 2;
        E = 3;
        F = 4;
        H = 1;
        I = 2;
        J = 3;
        K = 4;
        L = 5;
        M = 6;
        N = 7;
        O = 8;
        P = 9;
        Q = 10;
        R = 11;
        S = 12;
        T = 13;
        U = 14;
        V = 15;
        W = 20;
    }
}
