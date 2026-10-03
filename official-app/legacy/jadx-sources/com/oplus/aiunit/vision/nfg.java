package com.oplus.aiunit.vision;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.util.Log;
import android.widget.Toast;
import com.client.platform.opensdk.pay.download.resource.LanUtils;
import com.oplus.nearx.track.TrackApi;
import com.oplus.nearx.track.internal.common.content.GlobalConfigHelper;
import com.oplus.nearx.track.internal.storage.sp.SharePreferenceHelper;
import com.oplus.nearx.track.internal.utils.PhoneMsgUtil;
import com.sensorsdata.analytics.android.autotrack.aop.SensorsDataAutoTrackHelper;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public class nfg {
    public static Boolean SAMPLE = Boolean.TRUE;

    public static class a implements DialogInterface.OnClickListener {
        public final /* synthetic */ boolean i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f14504j;
        public final /* synthetic */ String k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f14505l;
        public final /* synthetic */ Activity m;

        public a(boolean z, String str, String str2, String str3, Activity activity) {
            this.i = z;
            this.f14504j = str;
            this.k = str2;
            this.f14505l = str3;
            this.m = activity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        @SensorsDataInstrumented
        public void onClick(DialogInterface dialogInterface, int i) {
            boolean z = !this.i;
            SharePreferenceHelper.h().a("enableScanTestDeviceMode", z);
            nfg.e(this.f14504j, this.k, this.f14505l, z, GlobalConfigHelper.INSTANCE.d());
            nfg.c(5000L, this.m);
            SensorsDataAutoTrackHelper.trackDialog(dialogInterface, i);
        }
    }

    public static class b implements DialogInterface.OnClickListener {
        public final /* synthetic */ Activity i;

        public b(Activity activity) {
            this.i = activity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        @SensorsDataInstrumented
        public void onClick(DialogInterface dialogInterface, int i) {
            this.i.finish();
            SensorsDataAutoTrackHelper.trackDialog(dialogInterface, i);
        }
    }

    public static class c implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            Process.killProcess(Process.myPid());
        }
    }

    public static class d implements Runnable {
        public final /* synthetic */ String i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f14506j;
        public final /* synthetic */ boolean k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ boolean f14507l;
        public final /* synthetic */ String m;

        public d(String str, String str2, boolean z, boolean z2, String str3) {
            this.i = str;
            this.f14506j = str2;
            this.k = z;
            this.f14507l = z2;
            this.m = str3;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                JSONObject jSONObject = new JSONObject();
                long j2 = Long.parseLong(this.i);
                k6k.e().a("SchemeHelper", "appId:" + this.i, null, new Object[0]);
                PhoneMsgUtil phoneMsgUtil = PhoneMsgUtil.INSTANCE;
                jSONObject.put("duid", phoneMsgUtil.h());
                jSONObject.put("ouid", phoneMsgUtil.l());
                jSONObject.put("customClientId", TrackApi.t(j2).q());
                jSONObject.put("featureCode", this.f14506j);
                jSONObject.put("appId", j2);
                int i = 1;
                jSONObject.put("enableScanTestDeviceMode", this.k ? 1 : 0);
                if (!this.f14507l) {
                    i = 0;
                }
                jSONObject.put("enableLocalTestDeviceMode", i);
                TrackResponse trackResponseH = new o25(j2).h(this.m, jSONObject.toString());
                int code = trackResponseH.getCode();
                String message = trackResponseH.getMessage();
                boolean zF = trackResponseH.f();
                String str = new String(trackResponseH.getBody());
                k6k.e().a("SchemeHelper", "appId:" + this.i + ",success:" + zF + ",code:" + code + ",message:" + message + ",body:" + str, null, new Object[0]);
            } catch (Exception e2) {
                k6k.e().c("SchemeHelper", "exception:", e2, new Object[0]);
            }
        }
    }

    public static void c(long j2, Activity activity) {
        Toast.makeText(activity.getApplicationContext(), (j2 / 1000) + "s后退出应用", 1).show();
        new Handler(Looper.getMainLooper()).postDelayed(new c(), j2);
    }

    public static void d(Activity activity, Intent intent) {
        Uri data;
        if (activity == null || intent == null) {
            data = null;
        } else {
            try {
                data = intent.getData();
            } catch (Exception e2) {
                Log.e("SchemeHelper", e2.toString());
                return;
            }
        }
        if (data != null) {
            String host = data.getHost();
            String queryParameter = data.getQueryParameter("feature_code");
            String queryParameter2 = data.getQueryParameter("url");
            if ("debugtest".equals(host)) {
                f(activity, intent, queryParameter, queryParameter2, data.getQueryParameter("appId"));
            } else {
                js5.c(activity);
            }
        }
    }

    public static void e(String str, String str2, String str3, boolean z, boolean z2) {
        new Thread(new d(str, str2, z, z2, str3)).start();
    }

    public static void f(Activity activity, Intent intent, String str, String str2, String str3) {
        String string;
        String str4;
        k6k.e().a("SchemeHelper", "appId=" + str3 + ",featureCode=" + str + ",postUrl=" + str2, null, new Object[0]);
        boolean z = SharePreferenceHelper.h().getBoolean("enableScanTestDeviceMode", false);
        if (z || GlobalConfigHelper.INSTANCE.d()) {
            StringBuilder sb = new StringBuilder();
            sb.append("当前设备的调试模式状态：已开启, (adb调试模式开关：");
            GlobalConfigHelper globalConfigHelper = GlobalConfigHelper.INSTANCE;
            sb.append(globalConfigHelper.d());
            sb.append(",扫码调试模式开关：");
            sb.append(z);
            sb.append(")点击关闭按钮可关闭调试模式");
            string = sb.toString();
            str4 = globalConfigHelper.d() ? "请使用adb命令关闭" : "关闭";
        } else {
            str4 = "开启";
            string = "当前设备的调试模式状态：已关闭, 点击开启按钮可开启调试模式";
        }
        js5.b(activity, "测试环境切换", string, str4, new a(z, str3, str, str2, activity), LanUtils.CN.CANCEL, new b(activity));
        intent.setData(null);
    }
}
