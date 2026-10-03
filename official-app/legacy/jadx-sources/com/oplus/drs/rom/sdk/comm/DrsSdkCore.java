package com.oplus.drs.rom.sdk.comm;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.oplus.aiunit.vision.af3;
import com.oplus.aiunit.vision.alf;
import com.oplus.aiunit.vision.c90;
import com.oplus.aiunit.vision.dui;
import com.oplus.aiunit.vision.s56;
import com.oplus.drs.rom.sdk.comm.log.TrackLogger;
import com.oplus.drs.rom.sdk.comm.util.OpenIdUtils;

/* JADX INFO: loaded from: classes19.dex */
public class DrsSdkCore {
    static final String TAG = "DrsSdkCore";
    public static final /* synthetic */ int a = 0;
    private static volatile boolean isInit = false;
    private static volatile af3 sAppConfig = null;
    private static volatile boolean sEnableNetRequest = false;
    private static volatile String sFeedbackRegion = "";
    private static volatile boolean sNetRequestExplicitlySet = false;
    private static volatile String sRegion = "";

    public static void enableNetRequest(boolean z) {
        TrackLogger.h(TAG, "enableNetRequest called: " + z + ", before=" + sEnableNetRequest, new Object[0]);
        sNetRequestExplicitlySet = true;
        sEnableNetRequest = z;
        TrackLogger.h(TAG, "enableNetRequest set: sEnableNetRequest=" + sEnableNetRequest + ", sNetRequestExplicitlySet=" + sNetRequestExplicitlySet, new Object[0]);
    }

    @Nullable
    public static af3 getAppConfig() {
        return sAppConfig;
    }

    @NonNull
    public static String getFeedbackRegion() {
        return sFeedbackRegion == null ? "" : sFeedbackRegion;
    }

    @NonNull
    public static String getRegion() {
        return sRegion == null ? "" : sRegion;
    }

    public static void init(@NonNull Context context, @NonNull af3 af3Var) {
        if (isInit) {
            TrackLogger.o(TAG, "already init", new Object[0]);
            return;
        }
        TrackLogger.m(TAG, "config = " + af3Var, new Object[0]);
        sAppConfig = af3Var;
        sRegion = af3Var.d() == null ? "" : af3Var.d();
        String strA = af3Var.a() != null ? af3Var.a() : "";
        if (strA.isEmpty()) {
            strA = sRegion;
        }
        sFeedbackRegion = strA;
        alf.i(sFeedbackRegion);
        TrackLogger.h(TAG, "init: sNetRequestExplicitlySet=" + sNetRequestExplicitlySet + ", sEnableNetRequest(before)=" + sEnableNetRequest + ", config.isEnableNetRequest()=" + af3Var.k(), new Object[0]);
        if (sNetRequestExplicitlySet) {
            TrackLogger.h(TAG, "init: keeping explicitly set sEnableNetRequest: " + sEnableNetRequest, new Object[0]);
        } else {
            sEnableNetRequest = af3Var.k();
            TrackLogger.h(TAG, "init: updated sEnableNetRequest from config: " + sEnableNetRequest, new Object[0]);
        }
        TrackLogger.i(af3Var.j());
        if (!c90.g()) {
            if (af3Var.g()) {
                c90.d(dui.a(context));
            } else {
                c90.d(context);
            }
        }
        s56.f(context.getApplicationContext(), af3Var.f(), af3Var.b());
        OpenIdUtils.o(context.getApplicationContext());
        isInit = true;
    }

    public static boolean isEnableNetRequest() {
        TrackLogger.m(TAG, "isEnableNetRequest called: returning " + sEnableNetRequest, new Object[0]);
        return sEnableNetRequest;
    }

    public static void setFeedbackRegion(@Nullable String str) {
        if (str == null || str.isEmpty()) {
            return;
        }
        sFeedbackRegion = str;
        alf.i(str);
        TrackLogger.m(TAG, "setFeedbackRegion feedbackRegion " + str, new Object[0]);
    }
}
