package com.heytap.nearx.tangramconfig.device;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.customer.feedback.sdk.util.HeaderInfoHelper;
import com.heytap.nearx.tangramconfig.BuildConfig;
import com.heytap.nearx.tangramconfig.util.AppInfoUtil;
import com.heytap.nearx.tangramconfig.util.LogUtils;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import com.heytap.webview.extension.protocol.Const;
import com.oplus.nearx.track.internal.remoteconfig.cloudconfig.entity.EventRuleEntity;
import com.oplus.pantaconnect.sdk.connectionservice.lan.LanConstants;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0014\u001a\u00020\u0006J\u0006\u0010\u0015\u001a\u00020\u0006J\u0006\u0010\u0016\u001a\u00020\u0006J\b\u0010\u0017\u001a\u00020\u0018H\u0007R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\u00068FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001b\u0010\f\u001a\u00020\r8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0011\u001a\u00020\u00068FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u000b\u001a\u0004\b\u0012\u0010\t¨\u0006\u001a"}, d2 = {"Lcom/heytap/nearx/tangramconfig/device/DeviceInfo;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "OBRAND_ROM_VERSION", "", "romVersion", "getRomVersion", "()Ljava/lang/String;", "romVersion$delegate", "Lkotlin/Lazy;", "versionCode", "", "getVersionCode", "()I", "versionCode$delegate", "versionName", "getVersionName", "versionName$delegate", "dateWithFormat", "getAppName", "getPackageName", "isConnectNet", "", "Companion", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class DeviceInfo {
    private static final int NETWORK_CLASS_UNKNOWN = 0;
    private static final int NETWORK_TYPE_UNKNOWN = 0;

    @NotNull
    private final String OBRAND_ROM_VERSION;

    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: romVersion$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy romVersion;

    /* JADX INFO: renamed from: versionCode$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy versionCode;

    /* JADX INFO: renamed from: versionName$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy versionName;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final byte[] OS_NAME = {67, 111, 108, 111, 114, 79, 83};

    @NotNull
    private static final String EXTRAS_KEY_UNKNOWN = "unknown";

    @NotNull
    private static final String EXTRAS_KEY_ZERO = "0";
    private static final int EXTRAS_KEY_CLIENT_ID_LEN = 15;

    @NotNull
    private static final String MCS_HIDDEN_SD_CARD_FOLDER = ".mcs";

    @NotNull
    private static final String MCS_FILE_SUFFIX_NAME = ".ini";

    @NotNull
    private static final String MCS_CONTROL_PULL_MSG_INFO_FILE_NAME = "mcs_msg.ini";

    @NotNull
    private static final String EXTRAS_KEY_CLIENT_ID = "clientId";
    private static final String TAG = DeviceInfo.class.getSimpleName();

    @NotNull
    private static final String CARRIER_CHINA_MOBILE = "cm";

    @NotNull
    private static final String CARRIER_CHINA_UNION = "cu";

    @NotNull
    private static final String CARRIER_CHINA_TELCOM = "ct";

    @NotNull
    private static final String CARRIER_OTHER = "ot";

    @NotNull
    private static final String CARRIER_BGP = "bgp";

    @NotNull
    private static final String CARRIER_WIFI = "wifi";

    @NotNull
    private static final String CARRIER_NONE = SpeechConstant.ENGINE_TYPE_NONE;

    @NotNull
    private static final String UNKNOWN = "unknown";

    @NotNull
    private static final String WIFI = "wifi";

    @NotNull
    private static final String MOBILE = "mobile";

    @NotNull
    private static String sCarrierStatus = SpeechConstant.ENGINE_TYPE_NONE;

    @NotNull
    private static String sLastCarrierStatus = SpeechConstant.ENGINE_TYPE_NONE;
    private static final int NETWORK_TYPE_UNAVAILABLE = -1;
    private static final int NETWORK_TYPE_WIFI = -101;
    private static final int NETWORK_CLASS_WIFI = -101;
    private static final int NETWORK_CLASS_UNAVAILABLE = -1;
    private static final int NETWORK_CLASS_2_G = 1;
    private static final int NETWORK_CLASS_3_G = 2;
    private static final int NETWORK_CLASS_4_G = 3;
    private static final int NETWORK_CLASS_5_G = 4;
    private static final int NETWORK_TYPE_GPRS = 1;
    private static final int NETWORK_TYPE_EDGE = 2;
    private static final int NETWORK_TYPE_UMTS = 3;
    private static final int NETWORK_TYPE_CDMA = 4;
    private static final int NETWORK_TYPE_EVDO_0 = 5;
    private static final int NETWORK_TYPE_EVDO_A = 6;
    private static final int NETWORK_TYPE_1xRTT = 7;
    private static final int NETWORK_TYPE_HSDPA = 8;
    private static final int NETWORK_TYPE_HSUPA = 9;
    private static final int NETWORK_TYPE_HSPA = 10;
    private static final int NETWORK_TYPE_IDEN = 11;
    private static final int NETWORK_TYPE_EVDO_B = 12;
    private static final int NETWORK_TYPE_LTE = 13;
    private static final int NETWORK_TYPE_EHRPD = 14;
    private static final int NETWORK_TYPE_HSPAP = 15;
    private static final int NETWORK_TYPE_NR = 20;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\"\n\u0002\u0010\u0012\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010@\u001a\u00020\u00122\u0006\u0010A\u001a\u00020\u0012H\u0002J\u0010\u0010B\u001a\u00020\u00042\u0006\u0010C\u001a\u00020DH\u0007R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0006R\u000e\u0010\n\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0006R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0006R\u000e\u0010\u001a\u001a\u00020\u0012X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0012X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0012X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0012X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0012X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0012X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0012X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0012X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0012X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0012X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0012X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0012X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0012X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0012X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0012X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0012X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0012X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0012X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0012X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u0012X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u0012X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\u0012X\u0082D¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u0012X\u0082D¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\u0012X\u0082D¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\u0012X\u0082D¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\u0012X\u0082D¢\u0006\u0002\n\u0000R\u0011\u00104\u001a\u000205¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0016\u00108\u001a\n 9*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010:\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b;\u0010\u0006R\u0014\u0010<\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b=\u0010\u0006R\u000e\u0010>\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010?\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006E"}, d2 = {"Lcom/heytap/nearx/tangramconfig/device/DeviceInfo$Companion;", "", "()V", "CARRIER_BGP", "", "getCARRIER_BGP", "()Ljava/lang/String;", "CARRIER_CHINA_MOBILE", "CARRIER_CHINA_TELCOM", "getCARRIER_CHINA_TELCOM", "CARRIER_CHINA_UNION", "CARRIER_NONE", "CARRIER_OTHER", "getCARRIER_OTHER", "CARRIER_WIFI", "getCARRIER_WIFI", "EXTRAS_KEY_CLIENT_ID", "EXTRAS_KEY_CLIENT_ID_LEN", "", "EXTRAS_KEY_UNKNOWN", "EXTRAS_KEY_ZERO", "MCS_CONTROL_PULL_MSG_INFO_FILE_NAME", "MCS_FILE_SUFFIX_NAME", "MCS_HIDDEN_SD_CARD_FOLDER", Const.Callback.NetworkState.NetworkType.NETWORK_MOBILE, "getMOBILE", "NETWORK_CLASS_2_G", "NETWORK_CLASS_3_G", "NETWORK_CLASS_4_G", "NETWORK_CLASS_5_G", "NETWORK_CLASS_UNAVAILABLE", "NETWORK_CLASS_UNKNOWN", "NETWORK_CLASS_WIFI", "NETWORK_TYPE_1xRTT", "NETWORK_TYPE_CDMA", "NETWORK_TYPE_EDGE", "NETWORK_TYPE_EHRPD", "NETWORK_TYPE_EVDO_0", "NETWORK_TYPE_EVDO_A", "NETWORK_TYPE_EVDO_B", "NETWORK_TYPE_GPRS", "NETWORK_TYPE_HSDPA", "NETWORK_TYPE_HSPA", "NETWORK_TYPE_HSPAP", "NETWORK_TYPE_HSUPA", "NETWORK_TYPE_IDEN", "NETWORK_TYPE_LTE", "NETWORK_TYPE_NR", "NETWORK_TYPE_UMTS", "NETWORK_TYPE_UNAVAILABLE", "NETWORK_TYPE_UNKNOWN", "NETWORK_TYPE_WIFI", "OS_NAME", "", "getOS_NAME", "()[B", "TAG", "kotlin.jvm.PlatformType", LanConstants.OPERATOR_UNKNOWN, "getUNKNOWN", "WIFI", "getWIFI", "sCarrierStatus", "sLastCarrierStatus", "getNetworkClassByType", "networkType", "getNetworkType", "context", "Landroid/content/Context;", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final int getNetworkClassByType(int networkType) {
            if (networkType == DeviceInfo.NETWORK_TYPE_UNAVAILABLE) {
                return DeviceInfo.NETWORK_CLASS_UNAVAILABLE;
            }
            if (networkType == DeviceInfo.NETWORK_TYPE_WIFI) {
                return DeviceInfo.NETWORK_CLASS_WIFI;
            }
            if ((((networkType == DeviceInfo.NETWORK_TYPE_GPRS || networkType == DeviceInfo.NETWORK_TYPE_EDGE) || networkType == DeviceInfo.NETWORK_TYPE_CDMA) || networkType == DeviceInfo.NETWORK_TYPE_1xRTT) || networkType == DeviceInfo.NETWORK_TYPE_IDEN) {
                return DeviceInfo.NETWORK_CLASS_2_G;
            }
            if ((((((((networkType == DeviceInfo.NETWORK_TYPE_UMTS || networkType == DeviceInfo.NETWORK_TYPE_EVDO_0) || networkType == DeviceInfo.NETWORK_TYPE_EVDO_A) || networkType == DeviceInfo.NETWORK_TYPE_HSDPA) || networkType == DeviceInfo.NETWORK_TYPE_HSUPA) || networkType == DeviceInfo.NETWORK_TYPE_HSPA) || networkType == DeviceInfo.NETWORK_TYPE_EVDO_B) || networkType == DeviceInfo.NETWORK_TYPE_EHRPD) || networkType == DeviceInfo.NETWORK_TYPE_HSPAP) {
                return DeviceInfo.NETWORK_CLASS_3_G;
            }
            if (networkType == DeviceInfo.NETWORK_TYPE_LTE) {
                return DeviceInfo.NETWORK_CLASS_4_G;
            }
            return networkType == DeviceInfo.NETWORK_TYPE_NR ? DeviceInfo.NETWORK_CLASS_5_G : DeviceInfo.NETWORK_CLASS_UNKNOWN;
        }

        @NotNull
        public final String getCARRIER_BGP() {
            return DeviceInfo.CARRIER_BGP;
        }

        @NotNull
        public final String getCARRIER_CHINA_TELCOM() {
            return DeviceInfo.CARRIER_CHINA_TELCOM;
        }

        @NotNull
        public final String getCARRIER_OTHER() {
            return DeviceInfo.CARRIER_OTHER;
        }

        @NotNull
        public final String getCARRIER_WIFI() {
            return DeviceInfo.CARRIER_WIFI;
        }

        @NotNull
        public final String getMOBILE() {
            return DeviceInfo.MOBILE;
        }

        @SuppressLint({"MissingPermission"})
        @NotNull
        public final String getNetworkType(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            int subtype = DeviceInfo.NETWORK_TYPE_UNKNOWN;
            try {
                Object systemService = context.getSystemService("connectivity");
                Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
                if (activeNetworkInfo != null && activeNetworkInfo.isAvailable() && activeNetworkInfo.isConnected()) {
                    int type = activeNetworkInfo.getType();
                    if (type == 0) {
                        subtype = activeNetworkInfo.getSubtype();
                    } else if (type == 1) {
                        subtype = DeviceInfo.NETWORK_TYPE_WIFI;
                    }
                } else {
                    subtype = DeviceInfo.NETWORK_TYPE_UNAVAILABLE;
                }
            } catch (Throwable th) {
                LogUtils logUtils = LogUtils.INSTANCE;
                String TAG = DeviceInfo.TAG;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                String message = th.getMessage();
                if (message == null) {
                    message = "getNetworkTypeError";
                }
                logUtils.w(TAG, message, th, new Object[0]);
            }
            int networkClassByType = getNetworkClassByType(subtype);
            if (networkClassByType == DeviceInfo.NETWORK_CLASS_WIFI) {
                return "WIFI";
            }
            if (networkClassByType == DeviceInfo.NETWORK_CLASS_2_G) {
                return "2G";
            }
            if (networkClassByType == DeviceInfo.NETWORK_CLASS_3_G) {
                return "3G";
            }
            if (networkClassByType == DeviceInfo.NETWORK_CLASS_4_G) {
                return EventRuleEntity.ACCEPT_NET_4G;
            }
            return networkClassByType == DeviceInfo.NETWORK_CLASS_5_G ? EventRuleEntity.ACCEPT_NET_5G : LanConstants.OPERATOR_UNKNOWN;
        }

        @NotNull
        public final byte[] getOS_NAME() {
            return DeviceInfo.OS_NAME;
        }

        @NotNull
        public final String getUNKNOWN() {
            return DeviceInfo.UNKNOWN;
        }

        @NotNull
        public final String getWIFI() {
            return DeviceInfo.WIFI;
        }
    }

    public DeviceInfo(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.versionCode = LazyKt__LazyJVMKt.lazy(new Function0<Integer>() { // from class: com.heytap.nearx.tangramconfig.device.DeviceInfo$versionCode$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final Integer invoke() {
                int i = 0;
                try {
                    i = this.this$0.context.getPackageManager().getPackageInfo(this.this$0.context.getPackageName(), 0).versionCode;
                } catch (Throwable th) {
                    LogUtils logUtils = LogUtils.INSTANCE;
                    String TAG2 = DeviceInfo.TAG;
                    Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                    String message = th.getMessage();
                    if (message == null) {
                        message = "getVersionCodeError";
                    }
                    logUtils.w(TAG2, message, th, new Object[0]);
                }
                return Integer.valueOf(i);
            }
        });
        this.versionName = LazyKt__LazyJVMKt.lazy(new Function0<String>() { // from class: com.heytap.nearx.tangramconfig.device.DeviceInfo$versionName$2
            {
                super(0);
            }

            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final String invoke() {
                try {
                    String str = this.this$0.context.getPackageManager().getPackageInfo(this.this$0.context.getPackageName(), 0).versionName;
                    Intrinsics.checkNotNullExpressionValue(str, "info.versionName");
                    return str;
                } catch (Throwable th) {
                    LogUtils logUtils = LogUtils.INSTANCE;
                    String TAG2 = DeviceInfo.TAG;
                    Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                    String message = th.getMessage();
                    if (message == null) {
                        message = "getVersionCodeError";
                    }
                    logUtils.w(TAG2, message, th, new Object[0]);
                    return "";
                }
            }
        });
        this.OBRAND_ROM_VERSION = HeaderInfoHelper.RO_BUILD_ID;
        this.romVersion = LazyKt__LazyJVMKt.lazy(new Function0<String>() { // from class: com.heytap.nearx.tangramconfig.device.DeviceInfo$romVersion$2
            {
                super(0);
            }

            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final String invoke() {
                return SystemPropertyReflect.INSTANCE.get(this.this$0.OBRAND_ROM_VERSION, "");
            }
        });
    }

    @NotNull
    public final String dateWithFormat() {
        String str = new SimpleDateFormat("yy-MM-dd HH:mm:ss-SSS").format(new Date());
        Intrinsics.checkNotNullExpressionValue(str, "format.format(date)");
        return str;
    }

    @NotNull
    public final String getAppName() {
        return AppInfoUtil.INSTANCE.getAppName(this.context);
    }

    @NotNull
    public final String getPackageName() {
        return AppInfoUtil.INSTANCE.getPackageName(this.context);
    }

    @NotNull
    public final String getRomVersion() {
        return (String) this.romVersion.getValue();
    }

    public final int getVersionCode() {
        return ((Number) this.versionCode.getValue()).intValue();
    }

    @NotNull
    public final String getVersionName() {
        return (String) this.versionName.getValue();
    }

    @SuppressLint({"MissingPermission"})
    public final boolean isConnectNet() {
        try {
            Object systemService = this.context.getSystemService("connectivity");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                return activeNetworkInfo.isAvailable() || activeNetworkInfo.isConnected();
            }
            return false;
        } catch (Exception e2) {
            LogUtils logUtils = LogUtils.INSTANCE;
            String TAG2 = TAG;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            String message = e2.getMessage();
            if (message == null) {
                message = "isConnectNetError";
            }
            logUtils.w(TAG2, message, e2, new Object[0]);
            return false;
        }
    }
}
