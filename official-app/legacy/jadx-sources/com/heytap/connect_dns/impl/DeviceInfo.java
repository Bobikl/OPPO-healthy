package com.heytap.connect_dns.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Environment;
import android.telephony.TelephonyManager;
import android.util.Log;
import com.heytap.connect.api.IDevice;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import com.heytap.webview.extension.protocol.Const;
import com.oplus.aiunit.vision.crj;
import com.oplus.aiunit.vision.r7b;
import com.oplus.aiunit.vision.rsk;
import com.oplus.nearx.track.internal.remoteconfig.cloudconfig.entity.EventRuleEntity;
import com.oplus.pantaconnect.sdk.connectionservice.lan.LanConstants;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0002\b\f\u0018\u0000 22\u00020\u0001:\u00012B\u001d\b\u0007\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b0\u00101J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00042\u0006\u0010\r\u001a\u00020\fH\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\bJ\r\u0010\u0019\u001a\u00020\u0004¢\u0006\u0004\b\u0019\u0010\bJ\r\u0010\u001a\u001a\u00020\u0004¢\u0006\u0004\b\u001a\u0010\bJ\r\u0010\u001b\u001a\u00020\u0012¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0015H\u0017¢\u0006\u0004\b\u001d\u0010\u0017J\u000f\u0010\u001e\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u001e\u0010\u0017J\u000f\u0010\u001f\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u001f\u0010\bJ\u000f\u0010 \u001a\u00020\u0004H\u0007¢\u0006\u0004\b \u0010\bJ\u000f\u0010!\u001a\u00020\u0004H\u0016¢\u0006\u0004\b!\u0010\bJ\u000f\u0010\"\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\"\u0010\bJ\u000f\u0010#\u001a\u00020\u0004H\u0016¢\u0006\u0004\b#\u0010\bJ\u0011\u0010$\u001a\u0004\u0018\u00010\u0004H\u0017¢\u0006\u0004\b$\u0010\bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010%R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010*\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u001b\u0010/\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010\b¨\u00063"}, d2 = {"Lcom/heytap/connect_dns/impl/DeviceInfo;", "Lcom/heytap/connect/api/IDevice;", "", "i", "", "intToIp", "(I)Ljava/lang/String;", "getLocalIp4Address", "()Ljava/lang/String;", "networkType", "getNetworkClassByType", "(I)I", "Landroid/content/Context;", "context", "getSSID", "(Landroid/content/Context;)Ljava/lang/String;", "Lcom/oplus/aiunit/vision/r7b;", "logger", "", "setLogger", "(Lcom/oplus/aiunit/vision/r7b;)V", "", "isExternalStorageMediaMounted", "()Z", "getUUIDHashCode", "getCarrierStatus", "getLastCarrierStatus", "setCarrierStatus", "()V", "isConnectNet", "isWifiConnecting", "getLocalIp6Address", "getNetworkType", "brand", "model", "packageName", "getCarrierName", "Landroid/content/Context;", "Lcom/oplus/aiunit/vision/r7b;", "", "adgLock", "Ljava/lang/Object;", "adgValid", "Ljava/lang/String;", "appPackageName$delegate", "Lkotlin/Lazy;", "getAppPackageName", "appPackageName", "<init>", "(Landroid/content/Context;Lcom/oplus/aiunit/vision/r7b;)V", "Companion", "connect_release"}, k = 1, mv = {1, 5, 1})
public final class DeviceInfo implements IDevice {
    private static final int NETWORK_CLASS_UNKNOWN = 0;
    private static final int NETWORK_TYPE_UNKNOWN = 0;

    @NotNull
    private final Object adgLock;

    @NotNull
    private String adgValid;

    /* JADX INFO: renamed from: appPackageName$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy appPackageName;

    @NotNull
    private final Context context;

    @Nullable
    private r7b logger;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b \b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b4\u00105R\u001c\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u001c\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006R\u001c\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R\u001c\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\r\u0010\u0004\u001a\u0004\b\u000e\u0010\u0006R\u001c\u0010\u000f\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\u000f\u0010\u0004\u001a\u0004\b\u0010\u0010\u0006R\u001c\u0010\u0011\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\u0011\u0010\u0004\u001a\u0004\b\u0012\u0010\u0006R\u0016\u0010\u0013\u001a\u00020\u00028\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0013\u0010\u0004R\u0016\u0010\u0014\u001a\u00020\u00028\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0014\u0010\u0004R\u0016\u0010\u0015\u001a\u00020\u00028\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0015\u0010\u0004R\u0016\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u00168\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u0016\u0010\u001b\u001a\u00020\u00168\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R\u0016\u0010\u001c\u001a\u00020\u00168\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u00168\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018R\u0016\u0010\u001e\u001a\u00020\u00168\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001e\u0010\u0018R\u0016\u0010\u001f\u001a\u00020\u00168\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001f\u0010\u0018R\u0016\u0010 \u001a\u00020\u00168\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b \u0010\u0018R\u0016\u0010!\u001a\u00020\u00168\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b!\u0010\u0018R\u0016\u0010\"\u001a\u00020\u00168\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\"\u0010\u0018R\u0016\u0010#\u001a\u00020\u00168\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b#\u0010\u0018R\u0016\u0010$\u001a\u00020\u00168\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b$\u0010\u0018R\u0016\u0010%\u001a\u00020\u00168\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b%\u0010\u0018R\u0016\u0010&\u001a\u00020\u00168\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b&\u0010\u0018R\u0016\u0010'\u001a\u00020\u00168\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b'\u0010\u0018R\u0016\u0010(\u001a\u00020\u00168\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b(\u0010\u0018R\u0016\u0010)\u001a\u00020\u00168\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b)\u0010\u0018R\u0016\u0010*\u001a\u00020\u00168\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b*\u0010\u0018R\u0016\u0010+\u001a\u00020\u00168\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b+\u0010\u0018R\u0016\u0010,\u001a\u00020\u00168\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b,\u0010\u0018R\u0016\u0010-\u001a\u00020\u00168\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b-\u0010\u0018R\u0016\u0010.\u001a\u00020\u00168\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b.\u0010\u0018R\u0016\u0010/\u001a\u00020\u00168\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b/\u0010\u0018R\u001e\u00101\u001a\n 0*\u0004\u0018\u00010\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010\u0004R\u0016\u00102\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010\u0004R\u0016\u00103\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010\u0004¨\u00066"}, d2 = {"Lcom/heytap/connect_dns/impl/DeviceInfo$Companion;", "", "", "WIFI", "Ljava/lang/String;", "getWIFI", "()Ljava/lang/String;", Const.Callback.NetworkState.NetworkType.NETWORK_MOBILE, "getMOBILE", "CARRIER_CHINA_TELCOM", "getCARRIER_CHINA_TELCOM", "CARRIER_OTHER", "getCARRIER_OTHER", "CARRIER_WIFI", "getCARRIER_WIFI", LanConstants.OPERATOR_UNKNOWN, "getUNKNOWN", "CARRIER_BGP", "getCARRIER_BGP", "CARRIER_CHINA_MOBILE", "CARRIER_CHINA_UNION", "CARRIER_NONE", "", "NETWORK_CLASS_2_G", "I", "NETWORK_CLASS_3_G", "NETWORK_CLASS_4_G", "NETWORK_CLASS_UNAVAILABLE", "NETWORK_CLASS_UNKNOWN", "NETWORK_CLASS_WIFI", "NETWORK_TYPE_1xRTT", "NETWORK_TYPE_CDMA", "NETWORK_TYPE_EDGE", "NETWORK_TYPE_EHRPD", "NETWORK_TYPE_EVDO_0", "NETWORK_TYPE_EVDO_A", "NETWORK_TYPE_EVDO_B", "NETWORK_TYPE_GPRS", "NETWORK_TYPE_HSDPA", "NETWORK_TYPE_HSPA", "NETWORK_TYPE_HSPAP", "NETWORK_TYPE_HSUPA", "NETWORK_TYPE_IDEN", "NETWORK_TYPE_LTE", "NETWORK_TYPE_UMTS", "NETWORK_TYPE_UNAVAILABLE", "NETWORK_TYPE_UNKNOWN", "NETWORK_TYPE_WIFI", "kotlin.jvm.PlatformType", "TAG", "sCarrierStatus", "sLastCarrierStatus", "<init>", "()V", "connect_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
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

        @NotNull
        public final String getUNKNOWN() {
            return DeviceInfo.UNKNOWN;
        }

        @NotNull
        public final String getWIFI() {
            return DeviceInfo.WIFI;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public DeviceInfo(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final String getAppPackageName() {
        return (String) this.appPackageName.getValue();
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
                        Intrinsics.checkNotNullExpressionValue(hostAddress, "inetAddress.getHostAddress()");
                        return hostAddress;
                    }
                }
            }
        } catch (Throwable th) {
            r7b r7bVar = this.logger;
            if (r7bVar != null) {
                String TAG2 = TAG;
                Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                String message = th.getMessage();
                r7b.d(r7bVar, TAG2, message == null ? "" : message, null, null, 12, null);
            }
        }
        return "";
    }

    private final int getNetworkClassByType(int networkType) {
        if (networkType == NETWORK_TYPE_UNAVAILABLE) {
            return NETWORK_CLASS_UNAVAILABLE;
        }
        if (networkType == NETWORK_TYPE_WIFI) {
            return NETWORK_CLASS_WIFI;
        }
        if ((((networkType == NETWORK_TYPE_GPRS || networkType == NETWORK_TYPE_EDGE) || networkType == NETWORK_TYPE_CDMA) || networkType == NETWORK_TYPE_1xRTT) || networkType == NETWORK_TYPE_IDEN) {
            return NETWORK_CLASS_2_G;
        }
        if ((((((((networkType == NETWORK_TYPE_UMTS || networkType == NETWORK_TYPE_EVDO_0) || networkType == NETWORK_TYPE_EVDO_A) || networkType == NETWORK_TYPE_HSDPA) || networkType == NETWORK_TYPE_HSUPA) || networkType == NETWORK_TYPE_HSPA) || networkType == NETWORK_TYPE_EVDO_B) || networkType == NETWORK_TYPE_EHRPD) || networkType == NETWORK_TYPE_HSPAP) {
            return NETWORK_CLASS_3_G;
        }
        return networkType == NETWORK_TYPE_LTE ? NETWORK_CLASS_4_G : NETWORK_CLASS_UNKNOWN;
    }

    @SuppressLint({"MissingPermission"})
    private final String getSSID(Context context) {
        return "";
    }

    private final String intToIp(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(i & 255);
        sb.append('.');
        sb.append((i >> 8) & 255);
        sb.append('.');
        sb.append((i >> 16) & 255);
        sb.append('.');
        sb.append((i >> 24) & 255);
        return sb.toString();
    }

    @Override // com.heytap.connect.api.IDevice
    @NotNull
    public String brand() {
        String BRAND = Build.BRAND;
        Intrinsics.checkNotNullExpressionValue(BRAND, "BRAND");
        return BRAND;
    }

    @Override // com.heytap.connect.api.IDevice
    @SuppressLint({"MissingPermission"})
    @Nullable
    public String getCarrierName() {
        String ssid;
        try {
            Object systemService = this.context.getSystemService("connectivity");
            if (systemService == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.net.ConnectivityManager");
            }
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return UNKNOWN;
            }
            if (activeNetworkInfo.getType() != 1) {
                Object systemService2 = this.context.getSystemService("phone");
                if (systemService2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.telephony.TelephonyManager");
                }
                String simOperatorName = ((TelephonyManager) systemService2).getSimOperatorName();
                return simOperatorName == null || simOperatorName.length() == 0 ? MOBILE : simOperatorName;
            }
            try {
                ssid = getSSID(this.context);
            } catch (Throwable th) {
                r7b r7bVar = this.logger;
                if (r7bVar != null) {
                    String TAG2 = TAG;
                    Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                    r7b.b(r7bVar, TAG2, "get ssid error", th, null, 8, null);
                }
                ssid = "";
            }
            return ssid == null || ssid.length() == 0 ? WIFI : ssid;
        } catch (Throwable th2) {
            r7b r7bVar2 = this.logger;
            if (r7bVar2 != null) {
                String TAG3 = TAG;
                Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
                r7b.d(r7bVar2, TAG3, "getCarrierName--Exception", th2, null, 8, null);
            }
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
            r7b r7bVar = this.logger;
            if (r7bVar == null) {
                return null;
            }
            String TAG2 = TAG;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            r7b.d(r7bVar, TAG2, "WifiPreference IpAddress", e2, null, 8, null);
            return null;
        }
    }

    @SuppressLint({"MissingPermission"})
    @NotNull
    public final String getNetworkType() {
        int iB = NETWORK_TYPE_UNKNOWN;
        try {
            Object systemService = this.context.getSystemService("connectivity");
            if (systemService == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.net.ConnectivityManager");
            }
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isAvailable() && activeNetworkInfo.isConnected()) {
                int type = activeNetworkInfo.getType();
                if (type == 0) {
                    Object systemService2 = this.context.getSystemService("phone");
                    if (systemService2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.telephony.TelephonyManager");
                    }
                    iB = crj.b((TelephonyManager) systemService2);
                } else if (type == 1) {
                    iB = NETWORK_TYPE_WIFI;
                }
            } else {
                iB = NETWORK_TYPE_UNAVAILABLE;
            }
            int networkClassByType = getNetworkClassByType(iB);
            if (networkClassByType == NETWORK_CLASS_WIFI) {
                return "WIFI";
            }
            if (networkClassByType == NETWORK_CLASS_2_G) {
                return "2G";
            }
            if (networkClassByType == NETWORK_CLASS_3_G) {
                return "3G";
            }
            return networkClassByType == NETWORK_CLASS_4_G ? EventRuleEntity.ACCEPT_NET_4G : LanConstants.OPERATOR_UNKNOWN;
        } catch (Throwable th) {
            r7b r7bVar = this.logger;
            if (r7bVar != null) {
                String TAG2 = TAG;
                Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                r7b.d(r7bVar, TAG2, "getNetworkType", th, null, 8, null);
            }
        }
    }

    @Override // com.heytap.connect.api.IDevice
    @NotNull
    public String getUUIDHashCode() {
        String strValueOf = String.valueOf(Math.abs(UUID.randomUUID().toString().hashCode()));
        if (strValueOf.length() < 9) {
            while (strValueOf.length() < 9) {
                strValueOf = Intrinsics.stringPlus(strValueOf, "0");
            }
        }
        String strSubstring = strValueOf.substring(0, 9);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return strSubstring;
    }

    @Override // com.heytap.connect.api.IDevice
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
            r7b r7bVar = this.logger;
            if (r7bVar == null) {
                return false;
            }
            String TAG2 = TAG;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            r7b.d(r7bVar, TAG2, "isConnectNet", e2, null, 8, null);
            return false;
        }
    }

    @Override // com.heytap.connect.api.IDevice
    public boolean isExternalStorageMediaMounted() {
        return Intrinsics.areEqual("mounted", Environment.getExternalStorageState());
    }

    @SuppressLint({"MissingPermission"})
    public final boolean isWifiConnecting() {
        Object systemService = this.context.getSystemService("connectivity");
        if (systemService == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.net.ConnectivityManager");
        }
        try {
            NetworkInfo networkInfo = ((ConnectivityManager) systemService).getNetworkInfo(1);
            NetworkInfo.State state = networkInfo == null ? null : networkInfo.getState();
            return state != null && NetworkInfo.State.CONNECTED == state;
        } catch (Throwable th) {
            r7b r7bVar = this.logger;
            if (r7bVar == null) {
                return false;
            }
            String TAG2 = TAG;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            r7b.d(r7bVar, TAG2, "isWifiConnecting--Exception", th, null, 8, null);
            return false;
        }
    }

    @Override // com.heytap.connect.api.IDevice
    @NotNull
    public String model() {
        String MODEL = Build.MODEL;
        Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
        return MODEL;
    }

    @Override // com.heytap.connect.api.IDevice
    @NotNull
    public String packageName() {
        return rsk.VAD_TYPE_BREENO;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0038  */
    /* JADX WARN: Code duplicated, block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:19:0x0038, please report this as an issue */
    public final void setCarrierStatus() {
        String str;
        r7b r7bVar;
        sLastCarrierStatus = sCarrierStatus;
        if (!isWifiConnecting()) {
            String carrierName = getCarrierName();
            String str2 = CARRIER_CHINA_MOBILE;
            if (!str2.equals(carrierName)) {
                str2 = CARRIER_CHINA_UNION;
                if (!str2.equals(carrierName)) {
                    str2 = CARRIER_CHINA_TELCOM;
                    if (!str2.equals(carrierName)) {
                        str = CARRIER_NONE;
                    }
                    r7bVar = this.logger;
                    if (r7bVar == null) {
                        return;
                    }
                    String TAG2 = TAG;
                    Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                    r7b.b(r7bVar, TAG2, "setCarrierStatus--:" + sLastCarrierStatus + "-->" + sCarrierStatus, null, null, 12, null);
                }
            }
            sCarrierStatus = str2;
            r7bVar = this.logger;
            if (r7bVar == null) {
                return;
            }
            String TAG3 = TAG;
            Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
            r7b.b(r7bVar, TAG3, "setCarrierStatus--:" + sLastCarrierStatus + "-->" + sCarrierStatus, null, null, 12, null);
        }
        str = CARRIER_WIFI;
        sCarrierStatus = str;
        r7bVar = this.logger;
        if (r7bVar == null) {
            return;
        }
        String TAG4 = TAG;
        Intrinsics.checkNotNullExpressionValue(TAG4, "TAG");
        r7b.b(r7bVar, TAG4, "setCarrierStatus--:" + sLastCarrierStatus + "-->" + sCarrierStatus, null, null, 12, null);
    }

    public final void setLogger(@NotNull r7b logger) {
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.logger = logger;
    }

    @JvmOverloads
    public DeviceInfo(@NotNull Context context, @Nullable r7b r7bVar) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.logger = r7bVar;
        this.adgLock = new Object();
        this.adgValid = "";
        this.appPackageName = LazyKt__LazyJVMKt.lazy(new Function0<String>() { // from class: com.heytap.connect_dns.impl.DeviceInfo$appPackageName$2
            {
                super(0);
            }

            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final String invoke() {
                try {
                    String str = this.this$0.context.getPackageManager().getPackageInfo(this.this$0.context.getPackageName(), 0).packageName;
                    Intrinsics.checkNotNullExpressionValue(str, "info.packageName");
                    return str;
                } catch (Throwable th) {
                    Log.e(DeviceInfo.TAG, Intrinsics.stringPlus("getPackageName:", th));
                    return "0";
                }
            }
        });
    }

    public /* synthetic */ DeviceInfo(Context context, r7b r7bVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : r7bVar);
    }
}
