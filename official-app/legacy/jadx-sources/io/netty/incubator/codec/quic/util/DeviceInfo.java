package io.netty.incubator.codec.quic.util;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Environment;
import android.telephony.TelephonyManager;
import com.oplus.aiunit.vision.pf3;
import io.netty.util.internal.logging.InternalLogger;
import io.netty.util.internal.logging.InternalLoggerFactory;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmField;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u000e\u001a\u00020\u0005H\u0016J\b\u0010\u000f\u001a\u00020\u0005H\u0016J\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0003J\b\u0010\u0012\u001a\u00020\u0005H\u0017J\u0006\u0010\u0013\u001a\u00020\u0005J\u0010\u0010\u0014\u001a\u00020\u00052\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003J\b\u0010\u0015\u001a\u00020\u0005H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0017J\b\u0010\u0018\u001a\u00020\u0017H\u0016J\b\u0010\u0019\u001a\u00020\u0017H\u0007J\b\u0010\u001a\u001a\u00020\u0005H\u0016J\u0006\u0010\u001b\u001a\u00020\u001cR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\t\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b¨\u0006\u001e"}, d2 = {"Lio/netty/incubator/codec/quic/util/DeviceInfo;", "Lio/netty/incubator/codec/quic/util/IDevice;", "context", "Landroid/content/Context;", "adgValid", "", "(Landroid/content/Context;Ljava/lang/String;)V", "adgLock", "", "heyTapId", "getHeyTapId", "()Ljava/lang/String;", "heyTapId$delegate", "Lkotlin/Lazy;", "adg", "brand", "getActiveNetworkInfo", "Landroid/net/NetworkInfo;", "getCarrierName", "getLastCarrierStatus", "getNetworkType", "getUUIDHashCode", "isConnectNet", "", "isExternalStorageMediaMounted", "isWifiConnecting", "model", "setCarrierStatus", "", "Companion", "netty-quic_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class DeviceInfo implements IDevice {

    @NotNull
    private static final String CARRIER_CHINA_MOBILE = "cm";

    @NotNull
    public static final String CARRIER_CHINA_TELECOM = "ct";

    @NotNull
    private static final String CARRIER_CHINA_UNION = "cu";

    @NotNull
    private static final String CARRIER_NONE = "none";

    @NotNull
    public static final String CARRIER_WIFI = "wifi";

    @NotNull
    public static final String MOBILE = "mobile";

    @NotNull
    private static final String NETWORK_TYPE_2G = "2G";

    @NotNull
    private static final String NETWORK_TYPE_3G = "3G";

    @NotNull
    private static final String NETWORK_TYPE_4G = "4G";

    @NotNull
    private static final String NETWORK_TYPE_5G = "5G";

    @NotNull
    private static final String NETWORK_TYPE_UNKNOWN = "UNKNOWN";

    @NotNull
    private static final String NETWORK_TYPE_WIFI = "WIFI";

    @NotNull
    public static final String UNKNOWN = "unknown";

    @NotNull
    public static final String WIFI = "wifi";

    @NotNull
    private final Object adgLock;

    @NotNull
    private volatile String adgValid;

    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: heyTapId$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy heyTapId;

    @JvmField
    public static final InternalLogger logger = InternalLoggerFactory.getInstance((Class<?>) DeviceInfo.class);

    @NotNull
    private static String sCarrierStatus = "none";

    @NotNull
    private static String sLastCarrierStatus = "none";

    public DeviceInfo(@NotNull Context context, @NotNull String adgValid) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adgValid, "adgValid");
        this.context = context;
        this.adgValid = adgValid;
        this.adgLock = new Object();
        this.heyTapId = LazyKt__LazyJVMKt.lazy(new Function0<String>() { // from class: io.netty.incubator.codec.quic.util.DeviceInfo$heyTapId$2
            {
                super(0);
            }

            @Override // p010kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                try {
                    if (Intrinsics.areEqual(this.this$0.context.getPackageName(), "com.heytap.openid")) {
                        return "";
                    }
                    return null;
                } catch (Throwable th) {
                    DeviceInfo.logger.error("heytap openid error", th);
                }
            }
        });
    }

    @SuppressLint({"MissingPermission"})
    private final NetworkInfo getActiveNetworkInfo(Context context) {
        Object systemService = context == null ? null : context.getSystemService("connectivity");
        if (systemService == null) {
            return null;
        }
        return ((ConnectivityManager) systemService).getActiveNetworkInfo();
    }

    private final String getHeyTapId() {
        return (String) this.heyTapId.getValue();
    }

    @Override // io.netty.incubator.codec.quic.util.IDevice
    @NotNull
    public String adg() {
        String strValueOf;
        boolean z = true;
        int iHashCode = 0;
        if (this.adgValid.length() > 0) {
            logger.info(Intrinsics.stringPlus("adgSource is ", this.adgValid));
            return String.valueOf(Math.abs(this.adgValid.hashCode()) % 100000);
        }
        synchronized (this.adgLock) {
            String heyTapId = getHeyTapId();
            if (heyTapId == null || heyTapId.length() == 0) {
                try {
                    heyTapId = pf3.INSTANCE.a(this.context);
                    logger.info(Intrinsics.stringPlus("get adg from clientIdUtils ", heyTapId));
                } catch (Throwable unused) {
                }
            } else {
                logger.info(Intrinsics.stringPlus("get adg from  openid duid ", heyTapId));
            }
            if (heyTapId != null && heyTapId.length() != 0) {
                z = false;
            }
            if (!z) {
                this.adgValid = heyTapId;
            }
            if (heyTapId != null) {
                iHashCode = heyTapId.hashCode();
            }
            strValueOf = String.valueOf(Math.abs(iHashCode) % 100000);
        }
        return strValueOf;
    }

    @Override // io.netty.incubator.codec.quic.util.IDevice
    @NotNull
    public String brand() {
        String BRAND = Build.BRAND;
        Intrinsics.checkNotNullExpressionValue(BRAND, "BRAND");
        return BRAND;
    }

    @Override // io.netty.incubator.codec.quic.util.IDevice
    @SuppressLint({"MissingPermission"})
    @NotNull
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
            logger.error("getCarrierName--Exception", th);
            return "unknown";
        }
    }

    @NotNull
    public final String getLastCarrierStatus() {
        return sLastCarrierStatus;
    }

    @NotNull
    public final String getNetworkType(@Nullable Context context) {
        String str;
        NetworkInfo activeNetworkInfo = getActiveNetworkInfo(context);
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            return "UNKNOWN";
        }
        int type = activeNetworkInfo.getType();
        if (type == 0) {
            switch (activeNetworkInfo.getSubtype()) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                case 16:
                    str = NETWORK_TYPE_2G;
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
                    return NETWORK_TYPE_3G;
                case 13:
                case 18:
                    str = "4G";
                    break;
                case 19:
                default:
                    String subtypeName = activeNetworkInfo.getSubtypeName();
                    if (subtypeName == null) {
                        return "UNKNOWN";
                    }
                    int iHashCode = subtypeName.hashCode();
                    if (iHashCode == -1004072973) {
                        return !subtypeName.equals("CDMA2000") ? "UNKNOWN" : NETWORK_TYPE_3G;
                    }
                    if (iHashCode != 82410124) {
                        return (iHashCode == 1954916075 && subtypeName.equals("TD-SCDMA")) ? NETWORK_TYPE_3G : "UNKNOWN";
                    }
                    return !subtypeName.equals("WCDMA") ? "UNKNOWN" : NETWORK_TYPE_3G;
                case 20:
                    str = "5G";
                    break;
            }
        } else {
            if (type != 1) {
                return "UNKNOWN";
            }
            str = "WIFI";
        }
        return str;
    }

    @Override // io.netty.incubator.codec.quic.util.IDevice
    @NotNull
    public String getUUIDHashCode() {
        String strValueOf = String.valueOf(Math.abs(UUID.randomUUID().toString().hashCode()));
        if (strValueOf.length() < 9) {
            while (strValueOf.length() < 9) {
                strValueOf = Intrinsics.stringPlus(strValueOf, "0");
            }
        }
        String strSubstring = strValueOf.substring(0, 9);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    @Override // io.netty.incubator.codec.quic.util.IDevice
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
            logger.error("isConnectNet", (Throwable) e2);
            return false;
        }
    }

    @Override // io.netty.incubator.codec.quic.util.IDevice
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
            logger.error("isWifiConnecting--Exception", th);
            return false;
        }
    }

    @Override // io.netty.incubator.codec.quic.util.IDevice
    @NotNull
    public String model() {
        String MODEL = Build.MODEL;
        Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
        return MODEL;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003e  */
    public final void setCarrierStatus() {
        String str;
        sLastCarrierStatus = sCarrierStatus;
        if (isWifiConnecting()) {
            sCarrierStatus = "wifi";
        } else {
            String carrierName = getCarrierName();
            int iHashCode = carrierName.hashCode();
            if (iHashCode == 3178) {
                str = CARRIER_CHINA_MOBILE;
                if (!carrierName.equals(CARRIER_CHINA_MOBILE)) {
                    str = "none";
                }
            } else if (iHashCode == 3185) {
                str = "ct";
                if (!carrierName.equals("ct")) {
                    str = "none";
                }
            } else if (iHashCode != 3186) {
                str = "none";
            } else {
                str = CARRIER_CHINA_UNION;
                if (!carrierName.equals(CARRIER_CHINA_UNION)) {
                    str = "none";
                }
            }
            sCarrierStatus = str;
        }
        logger.info("setCarrierStatus--:" + sLastCarrierStatus + "-->" + sCarrierStatus);
    }

    public /* synthetic */ DeviceInfo(Context context, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? "" : str);
    }
}
