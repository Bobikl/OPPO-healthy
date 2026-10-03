package com.heytap.connect.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import com.heytap.connect.api.logger.Logger;
import com.heytap.store.base.core.http.HttpConst;
import com.oplus.aiunit.vision.crj;
import com.oplus.pantaconnect.sdk.connectionservice.lan.LanConstants;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u000fB\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/heytap/connect/util/NetworkUtils;", "", "Landroid/content/Context;", "context", "", "getNetType", "(Landroid/content/Context;)Ljava/lang/String;", "", "type", "formatNetworkType", "(Landroid/content/Context;I)Ljava/lang/String;", "TAG", "Ljava/lang/String;", "<init>", "()V", "NetworkType", "connect_release"}, k = 1, mv = {1, 5, 1})
public final class NetworkUtils {

    @NotNull
    public static final NetworkUtils INSTANCE = new NetworkUtils();

    @NotNull
    public static final String TAG = "ColorNetworkUtil";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bj\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, d2 = {"Lcom/heytap/connect/util/NetworkUtils$NetworkType;", "", "", HttpConst.OPERATOR, "Ljava/lang/String;", "getOperator", "()Ljava/lang/String;", "setOperator", "(Ljava/lang/String;)V", "extra", "getExtra", "setExtra", "name", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "UNAVAILABLE", LanConstants.OPERATOR_UNKNOWN, "NET_2G", "NET_3G", "NET_4G", "NET_5G", "WIFI", "connect_release"}, k = 1, mv = {1, 5, 1})
    public enum NetworkType {
        UNAVAILABLE("unavailable"),
        UNKNOWN("unknown"),
        NET_2G("2g"),
        NET_3G("3g"),
        NET_4G("4g"),
        NET_5G("5g"),
        WIFI("wifi");


        @Nullable
        private String extra;

        @Nullable
        private String operator;

        NetworkType(String str) {
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static NetworkType[] valuesCustom() {
            NetworkType[] networkTypeArrValuesCustom = values();
            return (NetworkType[]) Arrays.copyOf(networkTypeArrValuesCustom, networkTypeArrValuesCustom.length);
        }

        @Nullable
        public final String getExtra() {
            return this.extra;
        }

        @Nullable
        public final String getOperator() {
            return this.operator;
        }

        public final void setExtra(@Nullable String str) {
            this.extra = str;
        }

        public final void setOperator(@Nullable String str) {
            this.operator = str;
        }
    }

    private NetworkUtils() {
    }

    @NotNull
    public final String formatNetworkType(@NotNull Context context, int type) {
        NetworkType networkType;
        Intrinsics.checkNotNullParameter(context, "context");
        if (type != 0) {
            return (type != 1 ? NetworkType.UNKNOWN : NetworkType.WIFI).name();
        }
        Object systemService = context.getSystemService("phone");
        if (systemService == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.telephony.TelephonyManager");
        }
        switch (crj.b((TelephonyManager) systemService)) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
            case 16:
                networkType = NetworkType.NET_2G;
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
                networkType = NetworkType.NET_3G;
                break;
            case 13:
            case 18:
                networkType = NetworkType.NET_4G;
                break;
            case 19:
            default:
                networkType = NetworkType.UNKNOWN;
                break;
            case 20:
                networkType = NetworkType.NET_5G;
                break;
        }
        return networkType.name();
    }

    @NotNull
    public final String getNetType(@Nullable Context context) {
        NetworkType networkType = NetworkType.UNAVAILABLE;
        if (context == null) {
            Logger.d$default(Logger.INSTANCE, TAG, "context is null", null, null, 12, null);
            return networkType.name();
        }
        Object systemService = context.getSystemService("connectivity");
        if (systemService == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.net.ConnectivityManager");
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isAvailable()) {
            int type = activeNetworkInfo.getType();
            if (type == 0) {
                Object systemService2 = context.getSystemService("phone");
                if (systemService2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.telephony.TelephonyManager");
                }
                switch (crj.b((TelephonyManager) systemService2)) {
                    case 1:
                    case 2:
                    case 4:
                    case 7:
                    case 11:
                    case 16:
                        networkType = NetworkType.NET_2G;
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
                        networkType = NetworkType.NET_3G;
                        break;
                    case 13:
                    case 18:
                        networkType = NetworkType.NET_4G;
                        break;
                    case 19:
                    default:
                        networkType = NetworkType.UNKNOWN;
                        break;
                    case 20:
                        networkType = NetworkType.NET_5G;
                        break;
                }
            } else if (type == 1) {
                networkType = NetworkType.WIFI;
            }
        }
        return networkType.name();
    }
}
