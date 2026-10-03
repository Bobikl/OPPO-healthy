package com.heytap.nearx.tangramconfig.util;

import android.app.Application;
import android.content.Context;
import com.heytap.nearx.tangramconfig.BuildConfig;
import com.heytap.nearx.tangramconfig.device.SystemPropertyReflect;
import com.oplus.aiunit.vision.r7b;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.Charsets;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u000f\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u001c\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007J\u0012\u0010\f\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0010\u0010\f\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\r\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u000e\u001a\u0004\b\u0016\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0017\u0010\u000eR\u0014\u0010\u0018\u001a\u00020\b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0018\u0010\u000eR\u0014\u0010\u0019\u001a\u00020\b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0019\u0010\u000eR\u0014\u0010\u001a\u001a\u00020\b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001a\u0010\u000eR\u0014\u0010\u001b\u001a\u00020\b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001b\u0010\u000e¨\u0006\u001e"}, d2 = {"Lcom/heytap/nearx/tangramconfig/util/ProcessProperties;", "", "Landroid/content/Context;", "context", "", "isForeign", "Lcom/oplus/aiunit/vision/r7b;", "logger", "", "getCountryCode", "", "pid", "getProcessName", "TAG", "Ljava/lang/String;", "", "WHO_IS_YOUR_LOWER", "[B", "USER_REGION", "getUSER_REGION$com_heytap_nearx_tangramconfig", "()Ljava/lang/String;", "TRACK_REGION", "getTRACK_REGION$com_heytap_nearx_tangramconfig", "TRACK_OP_REGION", "TRACK_BOOT_REGION", "USER_PI_REGION", "USER_OPLUS_REGION", "USER_OPPO_REGION", "<init>", "()V", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 7, 1})
public final class ProcessProperties {

    @NotNull
    public static final ProcessProperties INSTANCE = new ProcessProperties();

    @NotNull
    public static final String TAG = "ProcessProperties";

    @NotNull
    public static final String TRACK_BOOT_REGION = "ro.boot.regionmark";

    @NotNull
    public static final String TRACK_OP_REGION = "ro.vendor.oplus.regionmark";

    @NotNull
    private static final String TRACK_REGION;

    @NotNull
    public static final String USER_OPLUS_REGION = "persist.sys.oplus.region";

    @NotNull
    public static final String USER_OPPO_REGION = "persist.sys.oppo.region";

    @NotNull
    public static final String USER_PI_REGION = "ro.oplus.pipeline.region";

    @NotNull
    private static final String USER_REGION;

    @NotNull
    private static final byte[] WHO_IS_YOUR_LOWER;

    static {
        byte[] bArr = {111, 112, 112, 111};
        WHO_IS_YOUR_LOWER = bArr;
        StringBuilder sb = new StringBuilder();
        sb.append("persist.sys.");
        Charset charset = Charsets.UTF_8;
        sb.append(new String(bArr, charset));
        sb.append(".region");
        USER_REGION = sb.toString();
        TRACK_REGION = "ro." + new String(bArr, charset) + ".regionmark";
    }

    private ProcessProperties() {
    }

    @JvmStatic
    @NotNull
    public static final String getCountryCode(@NotNull Context context, @Nullable r7b logger) {
        Intrinsics.checkNotNullParameter(context, "context");
        boolean z = true;
        try {
            SystemPropertyReflect systemPropertyReflect = SystemPropertyReflect.INSTANCE;
            String str = systemPropertyReflect.get("persist.sys.oplus.region", "");
            if (str.length() > 0) {
                if (logger == null) {
                    return str;
                }
                r7b.l(logger, TAG, "==== getOplusCountryCode【" + str + "】 from UserRegionCode", null, null, 12, null);
                return str;
            }
            String str2 = systemPropertyReflect.get("persist.sys.oppo.region", "");
            if (str2.length() > 0) {
                if (logger != null) {
                    r7b.l(logger, TAG, "==== getOplusCountryCode【" + str2 + "】 from UserRegionCode", null, null, 12, null);
                }
                return str2;
            }
            try {
                String str3 = SystemPropertyReflect.INSTANCE.get(USER_REGION, "");
                if (!(str3 == null || str3.length() == 0)) {
                    if (logger != null) {
                        r7b.l(logger, TAG, "==== getCountryCode【" + str3 + "】 from UserRegionCode", null, null, 12, null);
                    }
                    return str3;
                }
            } catch (Exception e2) {
                if (logger != null) {
                    String message = e2.getMessage();
                    r7b.d(logger, TAG, message == null ? "getUserRegionError" : message, e2, null, 8, null);
                }
            }
            try {
                String str4 = SystemPropertyReflect.INSTANCE.get("ro.oplus.pipeline.region", "");
                if (str4.length() > 0) {
                    if (logger != null) {
                        r7b.l(logger, TAG, "==== getPICountryCode【" + str4 + "】 from TrackRegionCode", null, null, 12, null);
                    }
                    return str4;
                }
            } catch (Exception e3) {
                if (logger != null) {
                    String message2 = e3.getMessage();
                    r7b.d(logger, TAG, message2 == null ? "getTrackRegionError" : message2, e3, null, 8, null);
                }
            }
            try {
                String str5 = SystemPropertyReflect.INSTANCE.get(TRACK_REGION, "");
                if (!(str5 == null || str5.length() == 0)) {
                    if (logger != null) {
                        r7b.l(logger, TAG, "==== getCountryCode【" + str5 + "】 from TrackRegionCode", null, null, 12, null);
                    }
                    return str5;
                }
            } catch (Exception e4) {
                if (logger != null) {
                    String message3 = e4.getMessage();
                    r7b.d(logger, TAG, message3 == null ? "getTrackRegionError" : message3, e4, null, 8, null);
                }
            }
            try {
                SystemPropertyReflect systemPropertyReflect2 = SystemPropertyReflect.INSTANCE;
                String str6 = systemPropertyReflect2.get("ro.vendor.oplus.regionmark", "");
                if (!(str6 == null || str6.length() == 0)) {
                    if (logger != null) {
                        r7b.l(logger, TAG, "==== getCountryCode【" + str6 + "】 from TrackRegionCode", null, null, 12, null);
                    }
                    return str6;
                }
                String str7 = systemPropertyReflect2.get("ro.boot.regionmark", "");
                if (!(str7 == null || str7.length() == 0)) {
                    if (logger != null) {
                        r7b.l(logger, TAG, "==== getCountryCode【" + str7 + "】 from TrackRegionCode", null, null, 12, null);
                    }
                    return str7;
                }
                try {
                    String settingCountryCode = context.getResources().getConfiguration().locale.getCountry();
                    if (settingCountryCode != null && settingCountryCode.length() != 0) {
                        z = false;
                    }
                    if (!z) {
                        if (logger != null) {
                            r7b.l(logger, TAG, "==== getCountryCode【" + settingCountryCode + "】 from SettingRegionCode", null, null, 12, null);
                        }
                        Intrinsics.checkNotNullExpressionValue(settingCountryCode, "settingCountryCode");
                        return settingCountryCode;
                    }
                } catch (Exception e5) {
                    if (logger != null) {
                        String message4 = e5.getMessage();
                        if (message4 == null) {
                            message4 = "getSettingRegionError";
                        }
                        r7b.d(logger, TAG, message4, e5, null, 8, null);
                    }
                }
                return "";
            } catch (Exception e6) {
                if (logger != null) {
                    String message5 = e6.getMessage();
                    r7b.d(logger, TAG, message5 == null ? "getTrackRegionError" : message5, e6, null, 8, null);
                }
            }
        } catch (Exception e7) {
            if (logger != null) {
                String message6 = e7.getMessage();
                r7b.d(logger, TAG, message6 == null ? "getUserRegionError" : message6, e7, null, 8, null);
            }
        }
    }

    public static /* synthetic */ String getCountryCode$default(Context context, r7b r7bVar, int i, Object obj) {
        if ((i & 2) != 0) {
            r7bVar = null;
        }
        return getCountryCode(context, r7bVar);
    }

    @JvmStatic
    public static final boolean isForeign(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String countryCode$default = getCountryCode$default(context, null, 2, null);
        return (Intrinsics.areEqual("CN", countryCode$default) || Intrinsics.areEqual("OC", countryCode$default)) ? false : true;
    }

    @Nullable
    public final String getProcessName(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            return Application.getProcessName();
        } catch (Throwable unused) {
            LogUtils.e$default(LogUtils.INSTANCE, "CloudConfig", "无法获取信息", null, new Object[0], 4, null);
            return null;
        }
    }

    @NotNull
    public final String getTRACK_REGION$com_heytap_nearx_tangramconfig() {
        return TRACK_REGION;
    }

    @NotNull
    public final String getUSER_REGION$com_heytap_nearx_tangramconfig() {
        return USER_REGION;
    }

    private final String getProcessName(int pid) throws Throwable {
        BufferedReader bufferedReader;
        Throwable th;
        try {
            bufferedReader = new BufferedReader(new FileReader("/proc/" + pid + "/cmdline"));
            try {
                String processName = bufferedReader.readLine();
                if (!(processName == null || processName.length() == 0)) {
                    Intrinsics.checkNotNullExpressionValue(processName, "processName");
                    int length = processName.length() - 1;
                    int i = 0;
                    boolean z = false;
                    while (i <= length) {
                        boolean z2 = Intrinsics.compare((int) processName.charAt(!z ? i : length), 32) <= 0;
                        if (z) {
                            if (!z2) {
                                break;
                            }
                            length--;
                        } else if (z2) {
                            i++;
                        } else {
                            z = true;
                        }
                    }
                    processName = processName.subSequence(i, length + 1).toString();
                }
                try {
                    bufferedReader.close();
                } catch (IOException unused) {
                }
                return processName;
            } catch (Exception unused2) {
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (IOException unused3) {
                    }
                }
                return null;
            } catch (Throwable th2) {
                th = th2;
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (IOException unused4) {
                    }
                }
                throw th;
            }
        } catch (Exception unused5) {
            bufferedReader = null;
        } catch (Throwable th3) {
            bufferedReader = null;
            th = th3;
        }
    }
}
