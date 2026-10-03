package com.oplus.aiunit.vision;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import com.oplus.nearx.track.internal.remoteconfig.cloudconfig.entity.EventRuleEntity;
import com.oplus.pantaconnect.sdk.connectionservice.lan.LanConstants;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 ,2\u00020\u0001:\u0001\u000fB3\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010!\u001a\u00020\u001f\u0012\b\b\u0002\u0010#\u001a\u00020\u0002\u0012\u0006\u0010%\u001a\u00020\u0004\u0012\b\u0010)\u001a\u0004\u0018\u00010&¢\u0006\u0004\b*\u0010+J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0017J\u0006\u0010\u0006\u001a\u00020\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0016J\b\u0010\b\u001a\u00020\u0002H\u0016J\n\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0017J\b\u0010\n\u001a\u00020\u0002H\u0007J\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002J\u0018\u0010\u000f\u001a\u00020\u000e2\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\fH\u0016J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0003J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0003R\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0016R,\u0010\u001d\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001eR\u0014\u0010!\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010 R\u0016\u0010#\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\"R\u0014\u0010%\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010$R\u0016\u0010)\u001a\u0004\u0018\u00010&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006-"}, d2 = {"Lcom/oplus/aiunit/vision/ch5;", "Lcom/oplus/aiunit/vision/gp9;", "", "adg", "", "isConnectNet", "d", "brand", "model", "getCarrierName", "c", "f", "Lkotlin/Function0;", "tapGlsb", "", "a", "Landroid/content/Context;", "context", "Landroid/net/NetworkInfo;", "b", MapSchema.FIELD_NAME_ENTRY, "", "Ljava/lang/Object;", "adgLock", "Lkotlin/jvm/functions/Function0;", "getTapGlsbKeyGet", "()Lkotlin/jvm/functions/Function0;", "setTapGlsbKeyGet", "(Lkotlin/jvm/functions/Function0;)V", "tapGlsbKeyGet", "Landroid/content/Context;", "Lcom/oplus/aiunit/vision/r7b;", "Lcom/oplus/aiunit/vision/r7b;", "logger", "Ljava/lang/String;", "adgValid", "Z", "allUseGlsbKey", "Landroid/content/SharedPreferences;", b2n.f, "Landroid/content/SharedPreferences;", "spConfig", "<init>", "(Landroid/content/Context;Lcom/oplus/aiunit/vision/r7b;Ljava/lang/String;ZLandroid/content/SharedPreferences;)V", "Companion", "com.heytap.nearx.common"}, k = 1, mv = {1, 4, 0})
public final class ch5 implements gp9 {

    @NotNull
    public static final String CARRIER_CHINA_TELECOM = "ct";

    @NotNull
    public static final String CARRIER_WIFI = "wifi";

    @NotNull
    public static final String MOBILE = "mobile";

    @NotNull
    public static final String UNKNOWN = "unknown";

    @NotNull
    public static final String WIFI = "wifi";
    public static final String h;
    public static String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static String f10080j;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final Object adgLock;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public Function0<String> tapGlsbKeyGet;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final Context context;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final r7b logger;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public volatile String adgValid;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final boolean allUseGlsbKey;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final SharedPreferences spConfig;

    static {
        String simpleName = ch5.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "DeviceInfo::class.java.simpleName");
        h = simpleName;
        i = SpeechConstant.ENGINE_TYPE_NONE;
        f10080j = SpeechConstant.ENGINE_TYPE_NONE;
    }

    public ch5(@NotNull Context context, @NotNull r7b logger, @NotNull String adgValid, boolean z, @Nullable SharedPreferences sharedPreferences) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(adgValid, "adgValid");
        this.context = context;
        this.logger = logger;
        this.adgValid = adgValid;
        this.allUseGlsbKey = z;
        this.spConfig = sharedPreferences;
        this.adgLock = new Object();
    }

    @Override // com.oplus.aiunit.vision.gp9
    public void a(@NotNull Function0<String> tapGlsb) {
        Intrinsics.checkNotNullParameter(tapGlsb, "tapGlsb");
        this.tapGlsbKeyGet = tapGlsb;
    }

    @Override // com.oplus.aiunit.vision.gp9
    @NotNull
    public String adg() {
        String strValueOf;
        if (this.adgValid.length() > 0) {
            r7b.b(this.logger, h, "adgSource is " + this.adgValid, null, null, 12, null);
            return String.valueOf(Math.abs(this.adgValid.hashCode()) % 100000);
        }
        synchronized (this.adgLock) {
            String strD = qld.INSTANCE.d(this.spConfig, this.logger);
            if (strD == null) {
                strD = "";
            }
            r7b.b(this.logger, h, "adgSource is " + strD, null, null, 12, null);
            strValueOf = String.valueOf(Math.abs(strD.hashCode()) % 100000);
        }
        return strValueOf;
    }

    @SuppressLint({"MissingPermission"})
    public final NetworkInfo b(Context context) {
        Object systemService = context != null ? context.getSystemService("connectivity") : null;
        if (systemService != null) {
            return ((ConnectivityManager) systemService).getActiveNetworkInfo();
        }
        return null;
    }

    @Override // com.oplus.aiunit.vision.gp9
    @NotNull
    public String brand() {
        String str = Build.BRAND;
        Intrinsics.checkNotNullExpressionValue(str, "android.os.Build.BRAND");
        return str;
    }

    @SuppressLint({"MissingPermission"})
    @NotNull
    public final String c() {
        try {
            Object systemService = this.context.getSystemService("connectivity");
            if (systemService == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.net.ConnectivityManager");
            }
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return "unknown";
            }
            boolean z = true;
            if (activeNetworkInfo.getType() == 1) {
                return "wifi";
            }
            Object systemService2 = this.context.getSystemService("phone");
            if (systemService2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.telephony.TelephonyManager");
            }
            String simOperatorName = ((TelephonyManager) systemService2).getSimOperatorName();
            if (simOperatorName != null && simOperatorName.length() != 0) {
                z = false;
            }
            return z ? "mobile" : simOperatorName;
        } catch (Throwable th) {
            r7b.d(this.logger, h, "getCarrierName--Exception", th, null, 8, null);
            return "unknown";
        }
    }

    @NotNull
    public final String d() {
        String str;
        NetworkInfo networkInfoB = b(this.context);
        if (networkInfoB == null || !networkInfoB.isConnected()) {
            return LanConstants.OPERATOR_UNKNOWN;
        }
        int type = networkInfoB.getType();
        if (type == 0) {
            switch (networkInfoB.getSubtype()) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                case 16:
                    str = "2G";
                    break;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                case 17:
                    return "3G";
                case 13:
                case 18:
                    str = EventRuleEntity.ACCEPT_NET_4G;
                    break;
                case 19:
                default:
                    String subtypeName = networkInfoB.getSubtypeName();
                    return (Intrinsics.areEqual(subtypeName, "TD-SCDMA") || Intrinsics.areEqual(subtypeName, "WCDMA") || Intrinsics.areEqual(subtypeName, "CDMA2000")) ? "3G" : LanConstants.OPERATOR_UNKNOWN;
                case 20:
                    str = EventRuleEntity.ACCEPT_NET_5G;
                    break;
            }
        } else {
            if (type != 1) {
                return LanConstants.OPERATOR_UNKNOWN;
            }
            str = "WIFI";
        }
        return str;
    }

    @SuppressLint({"MissingPermission"})
    public final String e(Context context) {
        Object systemService;
        NetworkInfo activeNetworkInfo;
        if (Build.VERSION.SDK_INT > 29 || (systemService = context.getSystemService("connectivity")) == null || (activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected() || activeNetworkInfo.getExtraInfo() == null) {
            return "";
        }
        String extraInfo = activeNetworkInfo.getExtraInfo();
        Intrinsics.checkNotNullExpressionValue(extraInfo, "it.extraInfo");
        return StringsKt__StringsJVMKt.replace$default(extraInfo, "\"", "", false, 4, (Object) null);
    }

    @Nullable
    public final String f() {
        Function0<String> function0 = this.tapGlsbKeyGet;
        if (function0 != null) {
            return function0.invoke();
        }
        return null;
    }

    @Override // com.oplus.aiunit.vision.gp9
    @SuppressLint({"MissingPermission"})
    @Nullable
    public String getCarrierName() {
        try {
            Object systemService = this.context.getSystemService("connectivity");
            if (systemService == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.net.ConnectivityManager");
            }
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return "unknown";
            }
            if (activeNetworkInfo.getType() != 1) {
                Object systemService2 = this.context.getSystemService("phone");
                if (systemService2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.telephony.TelephonyManager");
                }
                String simOperatorName = ((TelephonyManager) systemService2).getSimOperatorName();
                return simOperatorName == null || simOperatorName.length() == 0 ? "mobile" : simOperatorName;
            }
            try {
                String strE = !this.allUseGlsbKey ? e(this.context) : null;
                if (!(strE == null || strE.length() == 0)) {
                    return oy0.INSTANCE.a(strE);
                }
                String strF = f();
                return strF == null || strF.length() == 0 ? "wifi" : strF;
            } catch (Throwable th) {
                r7b.b(this.logger, h, "get ssid error", th, null, 8, null);
                return "wifi";
            }
        } catch (Throwable th2) {
            r7b.d(this.logger, h, "getCarrierName--Exception", th2, null, 8, null);
            return "unknown";
        }
    }

    @Override // com.oplus.aiunit.vision.gp9
    @SuppressLint({"MissingPermission"})
    public boolean isConnectNet() {
        try {
            Object systemService = this.context.getSystemService("connectivity");
            if (systemService == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.net.ConnectivityManager");
            }
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                return activeNetworkInfo.isAvailable() || activeNetworkInfo.isConnected();
            }
            return false;
        } catch (Exception e2) {
            r7b.d(this.logger, h, "isConnectNet", e2, null, 8, null);
            return false;
        }
    }

    @Override // com.oplus.aiunit.vision.gp9
    @NotNull
    public String model() {
        String str = Build.MODEL;
        Intrinsics.checkNotNullExpressionValue(str, "Build.MODEL");
        return str;
    }
}
