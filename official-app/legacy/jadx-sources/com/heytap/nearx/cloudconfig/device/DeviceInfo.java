package com.heytap.nearx.cloudconfig.device;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Environment;
import android.telephony.TelephonyManager;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.customer.feedback.sdk.util.HeaderInfoHelper;
import com.heytap.nearx.cloudconfig.util.LogUtils;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import com.heytap.webview.extension.protocol.Const;
import com.oplus.nearx.track.internal.remoteconfig.cloudconfig.entity.EventRuleEntity;
import com.oplus.pantaconnect.sdk.connectionservice.lan.LanConstants;
import java.lang.reflect.Method;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Enumeration;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.TypeCastException;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.Charsets;
import p010kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 ,2\u00020\u0001:\u0001,B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0011\u001a\u00020\u0006J\b\u0010\u0012\u001a\u00020\u0006H\u0002J\u0006\u0010\u0013\u001a\u00020\u0006J\u0006\u0010\u0014\u001a\u00020\u0006J\n\u0010\u0015\u001a\u0004\u0018\u00010\u0006H\u0007J\u0006\u0010\u0016\u001a\u00020\u0006J\u0006\u0010\u0017\u001a\u00020\u0006J\b\u0010\u0018\u001a\u00020\u0006H\u0002J\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006J\u0006\u0010\u001a\u001a\u00020\u0006J\u0006\u0010\u001b\u001a\u00020\u0006J\u0010\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\rH\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0007J\u0006\u0010 \u001a\u00020\u001fJ\u000e\u0010!\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020#J\u0012\u0010$\u001a\u00020\u001f2\b\u0010%\u001a\u0004\u0018\u00010\u0006H\u0002J\b\u0010&\u001a\u00020\u001fH\u0007J\b\u0010'\u001a\u0004\u0018\u00010\u0006J\u000e\u0010(\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u0006J\u0006\u0010*\u001a\u00020+R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\u00068FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001b\u0010\f\u001a\u00020\r8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u000e\u0010\u000f¨\u0006-"}, d2 = {"Lcom/heytap/nearx/cloudconfig/device/DeviceInfo;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "OBRAND_ROM_VERSION", "", "romVersion", "getRomVersion", "()Ljava/lang/String;", "romVersion$delegate", "Lkotlin/Lazy;", "versionCode", "", "getVersionCode", "()I", "versionCode$delegate", "brand", "buildClientId", "dateWithFormat", "getCarrier", "getCarrierName", "getCarrierStatus", "getLastCarrierStatus", "getLocalIp4Address", "getLocalIp6Address", "getPackageName", "getUUIDHashCode", "intToIp", "i", "isConnectNet", "", "isExternalStorageMediaMounted", "isHexDigit", "character", "", "isImeiInvalid", "imei", "isWifiConnecting", "reflectColorImei", "replaceNonHexChar", TypedValues.Custom.S_STRING, "setCarrierStatus", "", "Companion", "com.heytap.nearx.cloudconfig"}, k = 1, mv = {1, 1, 16})
public final class DeviceInfo {

    @NotNull
    private static final String CARRIER_BGP;
    private static final String CARRIER_CHINA_MOBILE;

    @NotNull
    private static final String CARRIER_CHINA_TELCOM;
    private static final String CARRIER_CHINA_UNION;
    private static final String CARRIER_NONE;

    @NotNull
    private static final String CARRIER_OTHER;

    @NotNull
    private static final String CARRIER_WIFI;

    @NotNull
    private static final String MOBILE;
    private static final int NETWORK_CLASS_2_G;
    private static final int NETWORK_CLASS_3_G;
    private static final int NETWORK_CLASS_4_G;
    private static final int NETWORK_CLASS_5_G;
    private static final int NETWORK_CLASS_UNAVAILABLE;
    private static final int NETWORK_CLASS_UNKNOWN = 0;
    private static final int NETWORK_CLASS_WIFI;
    private static final int NETWORK_TYPE_1xRTT;
    private static final int NETWORK_TYPE_CDMA;
    private static final int NETWORK_TYPE_EDGE;
    private static final int NETWORK_TYPE_EHRPD;
    private static final int NETWORK_TYPE_EVDO_0;
    private static final int NETWORK_TYPE_EVDO_A;
    private static final int NETWORK_TYPE_EVDO_B;
    private static final int NETWORK_TYPE_GPRS;
    private static final int NETWORK_TYPE_HSDPA;
    private static final int NETWORK_TYPE_HSPA;
    private static final int NETWORK_TYPE_HSPAP;
    private static final int NETWORK_TYPE_HSUPA;
    private static final int NETWORK_TYPE_IDEN;
    private static final int NETWORK_TYPE_LTE;
    private static final int NETWORK_TYPE_NR;
    private static final int NETWORK_TYPE_UMTS;
    private static final int NETWORK_TYPE_UNAVAILABLE;
    private static final int NETWORK_TYPE_UNKNOWN = 0;
    private static final int NETWORK_TYPE_WIFI;
    private static final String TAG;

    @NotNull
    private static final String UNKNOWN;

    @NotNull
    private static final String WIFI;
    private static String sCarrierStatus;
    private static String sLastCarrierStatus;
    private final String OBRAND_ROM_VERSION;
    private final Context context;

    /* JADX INFO: renamed from: romVersion$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy romVersion;

    /* JADX INFO: renamed from: versionCode$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy versionCode;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final byte[] OS_NAME = {67, 111, 108, 111, 114, 79, 83};
    private static final String EXTRAS_KEY_UNKNOWN = "unknown";
    private static final String EXTRAS_KEY_ZERO = "0";
    private static final int EXTRAS_KEY_CLIENT_ID_LEN = 15;
    private static final String MCS_HIDDEN_SD_CARD_FOLDER = ".mcs";
    private static final String MCS_FILE_SUFFIX_NAME = ".ini";
    private static final String MCS_CONTROL_PULL_MSG_INFO_FILE_NAME = "mcs_msg.ini";
    private static final String EXTRAS_KEY_CLIENT_ID = "clientId";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\"\n\u0002\u0010\u0012\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010?\u001a\u00020\u00122\u0006\u0010@\u001a\u00020\u0012H\u0002J\u0010\u0010A\u001a\u00020\u00042\u0006\u0010B\u001a\u00020CH\u0007R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0006R\u000e\u0010\n\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0006R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0006R\u000e\u0010\u001a\u001a\u00020\u0012X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0012X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0012X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0012X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0012X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0012X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0012X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0012X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0012X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0012X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0012X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0012X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0012X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0012X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0012X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0012X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0012X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0012X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0012X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u0012X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u0012X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\u0012X\u0082D¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u0012X\u0082D¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\u0012X\u0082D¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\u0012X\u0082D¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\u0012X\u0082D¢\u0006\u0002\n\u0000R\u0011\u00104\u001a\u000205¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u000e\u00108\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00109\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b:\u0010\u0006R\u0014\u0010;\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b<\u0010\u0006R\u000e\u0010=\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010>\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006D"}, d2 = {"Lcom/heytap/nearx/cloudconfig/device/DeviceInfo$Companion;", "", "()V", "CARRIER_BGP", "", "getCARRIER_BGP", "()Ljava/lang/String;", "CARRIER_CHINA_MOBILE", "CARRIER_CHINA_TELCOM", "getCARRIER_CHINA_TELCOM", "CARRIER_CHINA_UNION", "CARRIER_NONE", "CARRIER_OTHER", "getCARRIER_OTHER", "CARRIER_WIFI", "getCARRIER_WIFI", "EXTRAS_KEY_CLIENT_ID", "EXTRAS_KEY_CLIENT_ID_LEN", "", "EXTRAS_KEY_UNKNOWN", "EXTRAS_KEY_ZERO", "MCS_CONTROL_PULL_MSG_INFO_FILE_NAME", "MCS_FILE_SUFFIX_NAME", "MCS_HIDDEN_SD_CARD_FOLDER", Const.Callback.NetworkState.NetworkType.NETWORK_MOBILE, "getMOBILE", "NETWORK_CLASS_2_G", "NETWORK_CLASS_3_G", "NETWORK_CLASS_4_G", "NETWORK_CLASS_5_G", "NETWORK_CLASS_UNAVAILABLE", "NETWORK_CLASS_UNKNOWN", "NETWORK_CLASS_WIFI", "NETWORK_TYPE_1xRTT", "NETWORK_TYPE_CDMA", "NETWORK_TYPE_EDGE", "NETWORK_TYPE_EHRPD", "NETWORK_TYPE_EVDO_0", "NETWORK_TYPE_EVDO_A", "NETWORK_TYPE_EVDO_B", "NETWORK_TYPE_GPRS", "NETWORK_TYPE_HSDPA", "NETWORK_TYPE_HSPA", "NETWORK_TYPE_HSPAP", "NETWORK_TYPE_HSUPA", "NETWORK_TYPE_IDEN", "NETWORK_TYPE_LTE", "NETWORK_TYPE_NR", "NETWORK_TYPE_UMTS", "NETWORK_TYPE_UNAVAILABLE", "NETWORK_TYPE_UNKNOWN", "NETWORK_TYPE_WIFI", "OS_NAME", "", "getOS_NAME", "()[B", "TAG", LanConstants.OPERATOR_UNKNOWN, "getUNKNOWN", "WIFI", "getWIFI", "sCarrierStatus", "sLastCarrierStatus", "getNetworkClassByType", "networkType", "getNetworkType", "context", "Landroid/content/Context;", "com.heytap.nearx.cloudconfig"}, k = 1, mv = {1, 1, 16})
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
            if (networkType == DeviceInfo.NETWORK_TYPE_GPRS || networkType == DeviceInfo.NETWORK_TYPE_EDGE || networkType == DeviceInfo.NETWORK_TYPE_CDMA || networkType == DeviceInfo.NETWORK_TYPE_1xRTT || networkType == DeviceInfo.NETWORK_TYPE_IDEN) {
                return DeviceInfo.NETWORK_CLASS_2_G;
            }
            if (networkType == DeviceInfo.NETWORK_TYPE_UMTS || networkType == DeviceInfo.NETWORK_TYPE_EVDO_0 || networkType == DeviceInfo.NETWORK_TYPE_EVDO_A || networkType == DeviceInfo.NETWORK_TYPE_HSDPA || networkType == DeviceInfo.NETWORK_TYPE_HSUPA || networkType == DeviceInfo.NETWORK_TYPE_HSPA || networkType == DeviceInfo.NETWORK_TYPE_EVDO_B || networkType == DeviceInfo.NETWORK_TYPE_EHRPD || networkType == DeviceInfo.NETWORK_TYPE_HSPAP) {
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
            Intrinsics.checkParameterIsNotNull(context, "context");
            int subtype = DeviceInfo.NETWORK_TYPE_UNKNOWN;
            try {
                Object systemService = context.getSystemService("connectivity");
                if (systemService == null) {
                    throw new TypeCastException("null cannot be cast to non-null type android.net.ConnectivityManager");
                }
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
                if (activeNetworkInfo != null && activeNetworkInfo.isAvailable() && activeNetworkInfo.isConnected()) {
                    int type = activeNetworkInfo.getType();
                    if (type == 1) {
                        subtype = DeviceInfo.NETWORK_TYPE_WIFI;
                    } else if (type == 0) {
                        subtype = activeNetworkInfo.getSubtype();
                    }
                } else {
                    subtype = DeviceInfo.NETWORK_TYPE_UNAVAILABLE;
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
            } catch (Throwable th) {
                LogUtils logUtils = LogUtils.INSTANCE;
                String str = DeviceInfo.TAG;
                String message = th.getMessage();
                if (message == null) {
                    message = "getNetworkTypeError";
                }
                logUtils.w(str, message, th, new Object[0]);
            }
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

    static {
        String simpleName = DeviceInfo.class.getSimpleName();
        Intrinsics.checkExpressionValueIsNotNull(simpleName, "DeviceInfo::class.java.simpleName");
        TAG = simpleName;
        CARRIER_CHINA_MOBILE = "cm";
        CARRIER_CHINA_UNION = "cu";
        CARRIER_CHINA_TELCOM = "ct";
        CARRIER_OTHER = "ot";
        CARRIER_BGP = "bgp";
        CARRIER_WIFI = "wifi";
        CARRIER_NONE = SpeechConstant.ENGINE_TYPE_NONE;
        UNKNOWN = "unknown";
        WIFI = "wifi";
        MOBILE = "mobile";
        sCarrierStatus = SpeechConstant.ENGINE_TYPE_NONE;
        sLastCarrierStatus = SpeechConstant.ENGINE_TYPE_NONE;
        NETWORK_TYPE_UNAVAILABLE = -1;
        NETWORK_TYPE_WIFI = -101;
        NETWORK_CLASS_WIFI = -101;
        NETWORK_CLASS_UNAVAILABLE = -1;
        NETWORK_CLASS_2_G = 1;
        NETWORK_CLASS_3_G = 2;
        NETWORK_CLASS_4_G = 3;
        NETWORK_CLASS_5_G = 4;
        NETWORK_TYPE_GPRS = 1;
        NETWORK_TYPE_EDGE = 2;
        NETWORK_TYPE_UMTS = 3;
        NETWORK_TYPE_CDMA = 4;
        NETWORK_TYPE_EVDO_0 = 5;
        NETWORK_TYPE_EVDO_A = 6;
        NETWORK_TYPE_1xRTT = 7;
        NETWORK_TYPE_HSDPA = 8;
        NETWORK_TYPE_HSUPA = 9;
        NETWORK_TYPE_HSPA = 10;
        NETWORK_TYPE_IDEN = 11;
        NETWORK_TYPE_EVDO_B = 12;
        NETWORK_TYPE_LTE = 13;
        NETWORK_TYPE_EHRPD = 14;
        NETWORK_TYPE_HSPAP = 15;
        NETWORK_TYPE_NR = 20;
    }

    public DeviceInfo(@NotNull Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.context = context;
        this.versionCode = LazyKt__LazyJVMKt.lazy(new Function0<Integer>() { // from class: com.heytap.nearx.cloudconfig.device.DeviceInfo$versionCode$2
            {
                super(0);
            }

            @Override // p010kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Integer invoke() {
                return Integer.valueOf(invoke2());
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final int invoke2() {
                try {
                    return this.this$0.context.getPackageManager().getPackageInfo(this.this$0.context.getPackageName(), 0).versionCode;
                } catch (Throwable th) {
                    LogUtils logUtils = LogUtils.INSTANCE;
                    String str = DeviceInfo.TAG;
                    String message = th.getMessage();
                    if (message == null) {
                        message = "getVersionCodeError";
                    }
                    logUtils.w(str, message, th, new Object[0]);
                    return 0;
                }
            }
        });
        this.OBRAND_ROM_VERSION = HeaderInfoHelper.RO_BUILD_ID;
        this.romVersion = LazyKt__LazyJVMKt.lazy(new Function0<String>() { // from class: com.heytap.nearx.cloudconfig.device.DeviceInfo$romVersion$2
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

    private final String buildClientId() {
        StringBuilder sb = new StringBuilder();
        String strDateWithFormat = dateWithFormat();
        if (strDateWithFormat == null) {
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
        String strSubstring = strDateWithFormat.substring(0, 6);
        Intrinsics.checkExpressionValueIsNotNull(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        sb.append(strSubstring);
        sb.append(getUUIDHashCode());
        String string = sb.toString();
        int length = string.length();
        int i = EXTRAS_KEY_CLIENT_ID_LEN;
        if (length < i) {
            String str = string + "123456789012345";
            if (str == null) {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
            string = str.substring(0, i);
            Intrinsics.checkExpressionValueIsNotNull(string, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        }
        return replaceNonHexChar(string);
    }

    private final String getLocalIp4Address() {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                while (inetAddresses.hasMoreElements()) {
                    InetAddress inetAddressNextElement = inetAddresses.nextElement();
                    if (!inetAddressNextElement.isLoopbackAddress() && (inetAddressNextElement instanceof Inet4Address)) {
                        String hostAddress = inetAddressNextElement.getHostAddress();
                        Intrinsics.checkExpressionValueIsNotNull(hostAddress, "inetAddress.getHostAddress()");
                        return hostAddress;
                    }
                }
            }
            return "";
        } catch (Throwable th) {
            LogUtils logUtils = LogUtils.INSTANCE;
            String str = TAG;
            String message = th.getMessage();
            if (message == null) {
                message = "getLocalIp4AddressError";
            }
            logUtils.w(str, message, th, new Object[0]);
            return "";
        }
    }

    private final String intToIp(int i) {
        return String.valueOf(i & 255) + "." + ((i >> 8) & 255) + "." + ((i >> 16) & 255) + "." + ((i >> 24) & 255);
    }

    private final boolean isImeiInvalid(String imei) {
        if (!(imei == null || imei.length() == 0)) {
            String str = EXTRAS_KEY_UNKNOWN;
            if (str == null) {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
            if (!str.contentEquals(imei) && !StringsKt__StringsJVMKt.equals("null", imei, true)) {
                String str2 = EXTRAS_KEY_ZERO;
                if (str2 == null) {
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                }
                if (!str2.contentEquals(imei)) {
                    return false;
                }
            }
        }
        return true;
    }

    @NotNull
    public final String brand() {
        String str = Build.BRAND;
        Intrinsics.checkExpressionValueIsNotNull(str, "android.os.Build.BRAND");
        return str;
    }

    @NotNull
    public final String dateWithFormat() {
        String str = new SimpleDateFormat("yy-MM-dd HH:mm:ss-SSS").format(new Date());
        Intrinsics.checkExpressionValueIsNotNull(str, "format.format(date)");
        return str;
    }

    @NotNull
    public final String getCarrier() {
        try {
            Object systemService = this.context.getSystemService("phone");
            if (systemService == null) {
                throw new TypeCastException("null cannot be cast to non-null type android.telephony.TelephonyManager");
            }
            String networkOperatorName = ((TelephonyManager) systemService).getNetworkOperatorName();
            Intrinsics.checkExpressionValueIsNotNull(networkOperatorName, "tm.networkOperatorName");
            return networkOperatorName;
        } catch (Throwable th) {
            LogUtils logUtils = LogUtils.INSTANCE;
            String str = TAG;
            String message = th.getMessage();
            if (message == null) {
                message = "getCarrierError";
            }
            logUtils.w(str, message, th, new Object[0]);
            return SpeechConstant.ENGINE_TYPE_NONE;
        }
    }

    @SuppressLint({"MissingPermission"})
    @Nullable
    public final String getCarrierName() {
        try {
            Object systemService = this.context.getSystemService("connectivity");
            if (systemService == null) {
                throw new TypeCastException("null cannot be cast to non-null type android.net.ConnectivityManager");
            }
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return UNKNOWN;
            }
            boolean z = true;
            if (activeNetworkInfo.getType() == 1) {
                Object systemService2 = this.context.getApplicationContext().getSystemService("wifi");
                if (systemService2 == null) {
                    throw new TypeCastException("null cannot be cast to non-null type android.net.wifi.WifiManager");
                }
                String ssid = ((WifiManager) systemService2).getConnectionInfo().getSSID();
                if (ssid != null && ssid.length() != 0) {
                    z = false;
                }
                return z ? WIFI : ssid;
            }
            Object systemService3 = this.context.getSystemService("phone");
            if (systemService3 == null) {
                throw new TypeCastException("null cannot be cast to non-null type android.telephony.TelephonyManager");
            }
            String simOperatorName = ((TelephonyManager) systemService3).getSimOperatorName();
            if (simOperatorName != null && simOperatorName.length() != 0) {
                z = false;
            }
            return z ? MOBILE : simOperatorName;
        } catch (Throwable th) {
            LogUtils logUtils = LogUtils.INSTANCE;
            String str = TAG;
            String message = th.getMessage();
            if (message == null) {
                message = "getCarrierNameError";
            }
            logUtils.w(str, message, th, new Object[0]);
            return WIFI;
        }
    }

    @NotNull
    public final String getCarrierStatus() {
        return sCarrierStatus;
    }

    @NotNull
    public final String getLastCarrierStatus() {
        return sLastCarrierStatus;
    }

    @Nullable
    public final String getLocalIp6Address() {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                while (inetAddresses.hasMoreElements()) {
                    InetAddress inetAddressNextElement = inetAddresses.nextElement();
                    if (!inetAddressNextElement.isLoopbackAddress() && (inetAddressNextElement instanceof Inet6Address)) {
                        return inetAddressNextElement.getHostAddress();
                    }
                }
            }
            return null;
        } catch (SocketException e2) {
            LogUtils logUtils = LogUtils.INSTANCE;
            String str = TAG;
            String message = e2.getMessage();
            if (message == null) {
                message = "getLocalIp6AddressError";
            }
            logUtils.w(str, message, e2, new Object[0]);
            return null;
        }
    }

    @NotNull
    public final String getPackageName() {
        try {
            String str = this.context.getPackageManager().getPackageInfo(this.context.getPackageName(), 0).packageName;
            Intrinsics.checkExpressionValueIsNotNull(str, "info.packageName");
            return str;
        } catch (Throwable th) {
            LogUtils logUtils = LogUtils.INSTANCE;
            String str2 = TAG;
            String message = th.getMessage();
            if (message == null) {
                message = "getPackageNameError";
            }
            logUtils.w(str2, message, th, new Object[0]);
            return "0";
        }
    }

    @NotNull
    public final String getRomVersion() {
        return (String) this.romVersion.getValue();
    }

    @NotNull
    public final String getUUIDHashCode() {
        String strValueOf = String.valueOf(Math.abs(UUID.randomUUID().toString().hashCode()));
        if (strValueOf.length() < 9) {
            while (strValueOf.length() < 9) {
                strValueOf = strValueOf + "0";
            }
        }
        String strSubstring = strValueOf.substring(0, 9);
        Intrinsics.checkExpressionValueIsNotNull(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final int getVersionCode() {
        return ((Number) this.versionCode.getValue()).intValue();
    }

    @SuppressLint({"MissingPermission"})
    public final boolean isConnectNet() {
        try {
            Object systemService = this.context.getSystemService("connectivity");
            if (systemService == null) {
                throw new TypeCastException("null cannot be cast to non-null type android.net.ConnectivityManager");
            }
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                return activeNetworkInfo.isAvailable() || activeNetworkInfo.isConnected();
            }
            return false;
        } catch (Exception e2) {
            LogUtils logUtils = LogUtils.INSTANCE;
            String str = TAG;
            String message = e2.getMessage();
            if (message == null) {
                message = "isConnectNetError";
            }
            logUtils.w(str, message, e2, new Object[0]);
            return false;
        }
    }

    public final boolean isExternalStorageMediaMounted() {
        return Intrinsics.areEqual("mounted", Environment.getExternalStorageState());
    }

    public final boolean isHexDigit(byte character) {
        return (character >= ((byte) 48) && character <= ((byte) 57)) || (character >= ((byte) 97) && character <= ((byte) 122)) || (character >= ((byte) 65) && character <= ((byte) 90));
    }

    @SuppressLint({"MissingPermission"})
    public final boolean isWifiConnecting() {
        Object systemService = this.context.getSystemService("connectivity");
        if (systemService == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.net.ConnectivityManager");
        }
        try {
            NetworkInfo.State state = ((ConnectivityManager) systemService).getNetworkInfo(1).getState();
            return state != null && NetworkInfo.State.CONNECTED == state;
        } catch (Throwable th) {
            LogUtils logUtils = LogUtils.INSTANCE;
            String str = TAG;
            String message = th.getMessage();
            if (message == null) {
                message = "isWifiConnectingError";
            }
            logUtils.w(str, message, th, new Object[0]);
        }
    }

    @Nullable
    public final String reflectColorImei() {
        try {
            Class<?> cls = Class.forName("android.telephony." + new String(OS_NAME, Charsets.UTF_8) + "TelephonyManager");
            Intrinsics.checkExpressionValueIsNotNull(cls, "Class.forName(\"android.t…ME) + \"TelephonyManager\")");
            Method method = cls.getMethod("getDefault", Context.class);
            Intrinsics.checkExpressionValueIsNotNull(method, "cx.getMethod(\"getDefault\", Context::class.java)");
            Object objInvoke = method.invoke(cls, this.context);
            Method method2 = cls.getMethod("colorGetImei", Integer.TYPE);
            Intrinsics.checkExpressionValueIsNotNull(method2, "cx.getMethod(\"colorGetIm…:class.javaPrimitiveType)");
            Object objInvoke2 = method2.invoke(objInvoke, 0);
            if (objInvoke2 != null) {
                return (String) objInvoke2;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.String");
        } catch (Throwable unused) {
            return null;
        }
    }

    @NotNull
    public final String replaceNonHexChar(@NotNull String string) {
        Intrinsics.checkParameterIsNotNull(string, "string");
        byte[] bytes = string.getBytes(Charsets.UTF_8);
        Intrinsics.checkExpressionValueIsNotNull(bytes, "(this as java.lang.String).getBytes(charset)");
        int length = bytes.length;
        for (int i = 0; i < length; i++) {
            if (!isHexDigit(bytes[i])) {
                bytes[i] = (byte) 48;
            }
        }
        return new String(bytes, Charsets.UTF_8);
    }

    public final void setCarrierStatus() {
        sLastCarrierStatus = sCarrierStatus;
        if (isWifiConnecting()) {
            sCarrierStatus = CARRIER_WIFI;
            return;
        }
        String carrierName = getCarrierName();
        String str = CARRIER_CHINA_MOBILE;
        if (str.equals(carrierName)) {
            sCarrierStatus = str;
            return;
        }
        String str2 = CARRIER_CHINA_UNION;
        if (str2.equals(carrierName)) {
            sCarrierStatus = str2;
            return;
        }
        String str3 = CARRIER_CHINA_TELCOM;
        if (str3.equals(carrierName)) {
            sCarrierStatus = str3;
        } else {
            sCarrierStatus = CARRIER_NONE;
        }
    }
}
