package com.heytap.mcssdk;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import com.heytap.mcssdk.constant.MessageConstant$CommandId;
import com.heytap.msp.push.callback.ICallBackResultService;
import com.heytap.msp.push.callback.IGetAppNotificationCallBackService;
import com.heytap.msp.push.callback.INotificationPermissionCallback;
import com.heytap.msp.push.callback.ISetAppNotificationCallBackService;
import com.heytap.msp.push.constant.EventConstant$EventId;
import com.heytap.nearx.tangramconfig.strategy.Fields;
import com.heytap.store.base.core.http.HttpConst;
import com.mcs.aidl.INotifiPermissionCallback;
import com.oplus.aiunit.vision.bpm;
import com.oplus.aiunit.vision.bym;
import com.oplus.aiunit.vision.c4f;
import com.oplus.aiunit.vision.cbm;
import com.oplus.aiunit.vision.cpm;
import com.oplus.aiunit.vision.dbm;
import com.oplus.aiunit.vision.dgm;
import com.oplus.aiunit.vision.f04;
import com.oplus.aiunit.vision.f9m;
import com.oplus.aiunit.vision.ilm;
import com.oplus.aiunit.vision.lhm;
import com.oplus.aiunit.vision.mrk;
import com.oplus.aiunit.vision.zam;
import com.oplus.pantanal.seedling.constants.TraceConstants;
import com.oplus.pantanal.seedling.intent.IntentManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes19.dex */
public class PushService {
    public static final String MINI_PROGRAM_PKG = "miniProgramPkg";
    public static final String m = "PushService";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int[] f7303n = {99, 111, 109, 46, 99, 111, 108, 111, 114, 111, 115, 46, 109, 99, 115};
    public static final int[] o = {99, 111, 109, 46, 99, 111, 108, 111, 114, 111, 115, 46, 109, 99, 115, 115, 100, 107, 46, 97, 99, 116, 105, 111, 110, 46, 82, 69, 67, 69, 73, 86, 69, 95, 83, 68, 75, 95, 77, 69, 83, 83, 65, 71, 69};
    public static final int[] p = {99, 111, 109, 46, 104, 101, 121, 116, 97, 112, 46, 109, 99, 115};
    public static String q = "";
    public static int r = 0;
    public static String s;
    public static boolean t;
    public Context a;
    public List<ilm> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List<bpm> f7304c;
    public String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f7305e;
    public String f;
    public ICallBackResultService g;
    public ISetAppNotificationCallBackService h;
    public IGetAppNotificationCallBackService i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ConcurrentHashMap<Integer, cbm> f7306j;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public PermissionCallbackProxy f7307l;

    public static final class PermissionCallbackProxy extends INotifiPermissionCallback.Stub {
        private static final long a = 2000;
        private INotificationPermissionCallback b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f7308c = 0;

        private boolean b() {
            return SystemClock.elapsedRealtime() - this.f7308c <= 2000;
        }

        private void c() {
            this.f7308c = SystemClock.elapsedRealtime();
        }

        private void d() {
            this.f7308c = 0L;
        }

        public void a() {
            d();
            this.b = null;
        }

        @Override // com.mcs.aidl.INotifiPermissionCallback
        public void onFail(int i, String str) {
            d();
            INotificationPermissionCallback iNotificationPermissionCallback = this.b;
            if (iNotificationPermissionCallback != null) {
                iNotificationPermissionCallback.onFail(i, str);
            }
            this.b = null;
        }

        @Override // com.mcs.aidl.INotifiPermissionCallback
        public void onSuccess() {
            d();
            INotificationPermissionCallback iNotificationPermissionCallback = this.b;
            if (iNotificationPermissionCallback != null) {
                iNotificationPermissionCallback.onSuccess();
            }
            this.b = null;
        }

        public boolean a(INotificationPermissionCallback iNotificationPermissionCallback) {
            if (b()) {
                return false;
            }
            c();
            this.b = iNotificationPermissionCallback;
            return true;
        }
    }

    public static class a {
        public static final PushService a = new PushService(null);
    }

    public PushService() {
        this.b = new ArrayList();
        this.f7304c = new ArrayList();
        this.f = null;
        this.k = true;
        this.f7307l = new PermissionCallbackProxy();
        synchronized (PushService.class) {
            int i = r;
            if (i > 0) {
                throw new RuntimeException("PushService can't create again!");
            }
            r = i + 1;
        }
        b(new lhm());
        b(new dbm());
        c(new dgm());
        c(new f9m());
        this.f7306j = new ConcurrentHashMap<>();
    }

    public static PushService j() {
        return a.a;
    }

    public static String u() {
        return "3.5.3";
    }

    public void A(Context context, String str, String str2, JSONObject jSONObject, ICallBackResultService iCallBackResultService) {
        if (context == null) {
            if (iCallBackResultService != null) {
                iCallBackResultService.onRegister(-2, null, null, null);
                return;
            }
            return;
        }
        if (this.a == null) {
            this.a = context.getApplicationContext();
        }
        if (!mrk.h(this.a)) {
            if (iCallBackResultService != null) {
                iCallBackResultService.onRegister(-2, null, null, null);
                return;
            }
            return;
        }
        if (this.k) {
            cpm.b("registerAction:", "Will static push_register event :");
            com.heytap.msp.push.statis.a.a(this.a, EventConstant$EventId.EVENT_ID_PUSH_REGISTER);
            this.k = false;
        }
        this.d = str;
        this.f7305e = str2;
        this.g = iCallBackResultService;
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            jSONObject.putOpt("appVersionCode", Integer.valueOf(mrk.b(context)));
            jSONObject.putOpt(TraceConstants.KEY_APP_VERSION_NAME, mrk.d(context));
        } catch (JSONException e2) {
            cpm.c("register-Exception:" + e2.getMessage());
        }
        E(MessageConstant$CommandId.COMMAND_REGISTER, jSONObject);
    }

    public void B(Activity activity, INotificationPermissionCallback iNotificationPermissionCallback, int i) {
        if (activity == null) {
            if (iNotificationPermissionCallback != null) {
                iNotificationPermissionCallback.onFail(2000, null);
                return;
            }
            return;
        }
        if (d(MessageConstant$CommandId.COMMAND_NOTIFICATION_ADVANCE)) {
            if (iNotificationPermissionCallback != null) {
                iNotificationPermissionCallback.onFail(2004, null);
                return;
            }
            return;
        }
        if (!f(activity)) {
            if (iNotificationPermissionCallback != null) {
                iNotificationPermissionCallback.onFail(2001, null);
                return;
            }
            return;
        }
        if (activity.checkPermission("android.permission.POST_NOTIFICATIONS", Process.myPid(), Process.myUid()) == 0) {
            if (iNotificationPermissionCallback != null) {
                iNotificationPermissionCallback.onFail(2002, null);
                return;
            }
            return;
        }
        if (!this.f7307l.a(iNotificationPermissionCallback)) {
            if (iNotificationPermissionCallback != null) {
                iNotificationPermissionCallback.onFail(2003, null);
                return;
            }
            return;
        }
        Intent intent = new Intent();
        intent.setAction("com.heytap.mcs.action.NOTIFICATION_ADVANCE");
        intent.setPackage(l(activity));
        Bundle bundle = new Bundle();
        bundle.putBinder(IntentManager.KEY_RESULT_CALLBACK_INTENT, this.f7307l);
        intent.putExtras(bundle);
        intent.putExtra("userIdentifier", v(this.a));
        try {
            activity.startActivityForResult(intent, i);
        } catch (ActivityNotFoundException unused) {
            if (iNotificationPermissionCallback != null) {
                iNotificationPermissionCallback.onFail(2005, null);
            }
        }
    }

    public void C(String str) {
        this.f = str;
    }

    public final void D(int i, String str, JSONObject jSONObject) {
        if (d(i)) {
            if (this.g != null) {
                this.g.onError(i(i), "api_call_too_frequently", this.a.getPackageName(), n(jSONObject));
                return;
            }
            return;
        }
        try {
            this.a.startService(k(i, str, jSONObject));
        } catch (Exception e2) {
            cpm.c("startMcsService--Exception" + e2.getMessage());
        }
    }

    public final void E(int i, JSONObject jSONObject) {
        D(i, "", jSONObject);
    }

    public final cbm a(int i) {
        String str;
        if (!this.f7306j.containsKey(Integer.valueOf(i))) {
            cbm cbmVar = new cbm(System.currentTimeMillis(), 1);
            this.f7306j.put(Integer.valueOf(i), cbmVar);
            cpm.a("addCommandToMap :appBean is null");
            return cbmVar;
        }
        cbm cbmVar2 = this.f7306j.get(Integer.valueOf(i));
        if (e(cbmVar2)) {
            cbmVar2.b(1);
            cbmVar2.c(System.currentTimeMillis());
            str = "addCommandToMap : appLimitBean.setCount(1)";
        } else {
            cbmVar2.b(cbmVar2.d() + 1);
            str = "addCommandToMap :appLimitBean.getCount() + 1";
        }
        cpm.a(str);
        return cbmVar2;
    }

    public final synchronized void b(bpm bpmVar) {
        if (bpmVar != null) {
            this.f7304c.add(bpmVar);
        }
    }

    public final synchronized void c(ilm ilmVar) {
        if (ilmVar != null) {
            this.b.add(ilmVar);
        }
    }

    public boolean d(int i) {
        return (i == 12291 || i == 12312 || a(i).d() <= 2) ? false : true;
    }

    public final boolean e(cbm cbmVar) {
        long jA = cbmVar.a();
        long jCurrentTimeMillis = System.currentTimeMillis();
        cpm.a("checkTimeNeedUpdate : lastedTime " + jA + " currentTime:" + jCurrentTimeMillis);
        return jCurrentTimeMillis - jA > 1000;
    }

    public final boolean f(Activity activity) {
        ActivityManager activityManager = (ActivityManager) activity.getSystemService("activity");
        List<ActivityManager.AppTask> appTasks = activityManager.getAppTasks();
        if (appTasks != null && appTasks.size() > 0) {
            ActivityManager.AppTask appTask = appTasks.get(0);
            if (appTask.getTaskInfo().topActivity != null) {
                return activity.getClass().getName().equals(appTask.getTaskInfo().topActivity.getClassName());
            }
        }
        List<ActivityManager.RunningTaskInfo> runningTasks = activityManager.getRunningTasks(1);
        if (runningTasks == null || runningTasks.size() <= 0) {
            return false;
        }
        return activity.getClass().getName().equals(runningTasks.get(0).topActivity.getClassName());
    }

    public void g() {
        this.f7307l.a();
    }

    public Context h() {
        return this.a;
    }

    public int i(int i) {
        switch (i) {
            case MessageConstant$CommandId.COMMAND_REGISTER /* 12289 */:
                return -1;
            case MessageConstant$CommandId.COMMAND_UNREGISTER /* 12290 */:
                return -2;
            case MessageConstant$CommandId.COMMAND_STATISTIC /* 12291 */:
                return -14;
            default:
                switch (i) {
                    case MessageConstant$CommandId.COMMAND_SET_PUSH_TIME /* 12298 */:
                        return -11;
                    case MessageConstant$CommandId.COMMAND_PAUSE_PUSH /* 12299 */:
                        return -3;
                    case MessageConstant$CommandId.COMMAND_RESUME_PUSH /* 12300 */:
                        return -4;
                    default:
                        switch (i) {
                            case MessageConstant$CommandId.COMMAND_GET_PUSH_STATUS /* 12306 */:
                                return -10;
                            case MessageConstant$CommandId.COMMAND_SET_NOTIFICATION_TYPE /* 12307 */:
                                return -6;
                            case MessageConstant$CommandId.COMMAND_CLEAR_NOTIFICATION_TYPE /* 12308 */:
                                return -7;
                            case MessageConstant$CommandId.COMMAND_GET_NOTIFICATION_STATUS /* 12309 */:
                                return -5;
                            case MessageConstant$CommandId.COMMAND_SET_NOTIFICATION_SETTINGS /* 12310 */:
                                return -8;
                            case MessageConstant$CommandId.COMMAND_CLEAR_PKG_NOTIFICATION /* 12311 */:
                                return -9;
                            case MessageConstant$CommandId.COMMAND_SEND_INSTANT_ACK /* 12312 */:
                                return -13;
                            case MessageConstant$CommandId.COMMAND_NOTIFICATION_ALLOWANCE /* 12313 */:
                                return -12;
                            default:
                                switch (i) {
                                    case MessageConstant$CommandId.COMMAND_APP_NOTIFICATION_OPEN /* 12316 */:
                                        return -15;
                                    case MessageConstant$CommandId.COMMAND_APP_NOTIFICATION_CLOSE /* 12317 */:
                                        return -16;
                                    case MessageConstant$CommandId.COMMAND_APP_NOTIFICATION_GET /* 12318 */:
                                        return -17;
                                    default:
                                        return 0;
                                }
                        }
                }
        }
    }

    public final Intent k(int i, String str, JSONObject jSONObject) {
        Intent intent = new Intent();
        intent.setAction(t(this.a));
        intent.setPackage(l(this.a));
        intent.putExtra("type", i);
        JSONObject jSONObject2 = new JSONObject();
        try {
            Context context = this.a;
            jSONObject2.putOpt("versionName", mrk.e(context, context.getPackageName()));
            Context context2 = this.a;
            jSONObject2.putOpt("versionCode", Integer.valueOf(mrk.c(context2, context2.getPackageName())));
            if (jSONObject != null) {
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    jSONObject2.putOpt(next, jSONObject.get(next));
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            intent.putExtra("extra", jSONObject2.toString());
            throw th;
        }
        intent.putExtra("extra", jSONObject2.toString());
        intent.putExtra("params", str);
        intent.putExtra("appPackage", this.a.getPackageName());
        intent.putExtra(HttpConst.APP_KEY, this.d);
        intent.putExtra(f04.JSON_KEY_APP_SECRET, this.f7305e);
        intent.putExtra("registerID", this.f);
        intent.putExtra(Fields.SDK_VERSION, u());
        intent.putExtra("userIdentifier", v(this.a));
        return intent;
    }

    public String l(Context context) {
        boolean z;
        if (s == null) {
            String strM = m(context);
            if (strM == null) {
                s = mrk.a(f7303n);
                z = false;
            } else {
                s = strM;
                z = true;
            }
            t = z;
        }
        return s;
    }

    public final String m(Context context) {
        String str = m;
        cpm.b(str, "getMcsPackageNameInner -- ");
        PackageManager packageManager = context.getPackageManager();
        String str2 = null;
        try {
            try {
                String strA = mrk.a(p);
                ApplicationInfo applicationInfo = packageManager.getApplicationInfo(strA, 0);
                if (applicationInfo != null) {
                    boolean z = (applicationInfo.flags & 1) == 1;
                    int packageUid = packageManager.getPackageUid("android", 0);
                    int i = applicationInfo.uid;
                    int iA = bym.a();
                    str2 = (z || (bym.b(i, iA) == packageUid)) ? strA : null;
                    cpm.b(str, "getMcsPackageNameInner packageUid = " + i + ", systemUid = " + packageUid + ", userId = " + iA);
                }
                return str2;
            } catch (PackageManager.NameNotFoundException e2) {
                cpm.d(m, "NameNotFoundException in get mcs package name:" + e2.getMessage());
                return str2;
            } catch (Exception e3) {
                cpm.d(m, "Error in get mcs package name:" + e3.getMessage());
                return str2;
            }
        } catch (Throwable unused) {
            return str2;
        }
    }

    public String n(JSONObject jSONObject) {
        if (jSONObject == null) {
            return "";
        }
        try {
            try {
                return jSONObject.optString(MINI_PROGRAM_PKG);
            } catch (Exception e2) {
                cpm.a("Error happened in getMiniProgramPkgFromJSON() :" + e2.getMessage());
                return "";
            }
        } catch (Throwable unused) {
            return "";
        }
    }

    public List<bpm> o() {
        return this.f7304c;
    }

    public List<ilm> p() {
        return this.b;
    }

    public ICallBackResultService q() {
        return this.g;
    }

    public IGetAppNotificationCallBackService r() {
        return this.i;
    }

    public ISetAppNotificationCallBackService s() {
        return this.h;
    }

    public String t(Context context) {
        if (s == null) {
            m(context);
        }
        if (!t) {
            return mrk.a(o);
        }
        if (TextUtils.isEmpty(q)) {
            q = new String(zam.l("Y29tLm1jcy5hY3Rpb24uUkVDRUlWRV9TREtfTUVTU0FHRQ=="));
        }
        return q;
    }

    public final int v(Context context) {
        try {
            return ((Integer) Context.class.getMethod("getUserId", new Class[0]).invoke(context, new Object[0])).intValue();
        } catch (Exception unused) {
            return 0;
        }
    }

    public PushService w(Context context, boolean z) {
        if (context == null) {
            throw new IllegalArgumentException("context can't be null");
        }
        x(context);
        cpm.e(z);
        return this;
    }

    public void x(Context context) {
        boolean z;
        this.a = context.getApplicationContext();
        if (s == null) {
            String strM = m(context);
            if (strM == null) {
                s = mrk.a(f7303n);
                z = false;
            } else {
                s = strM;
                z = true;
            }
            t = z;
        }
    }

    public boolean y(Context context) {
        return z(context);
    }

    public final boolean z(Context context) {
        if (this.a == null) {
            this.a = context.getApplicationContext();
        }
        String strL = l(this.a);
        boolean z = mrk.f(this.a, strL) && mrk.c(this.a, strL) >= 1019 && mrk.g(this.a, strL, "supportOpenPush");
        cpm.b(m, "isSupportPushInner -- " + z);
        return z;
    }

    public /* synthetic */ PushService(c4f c4fVar) {
        this();
    }
}
