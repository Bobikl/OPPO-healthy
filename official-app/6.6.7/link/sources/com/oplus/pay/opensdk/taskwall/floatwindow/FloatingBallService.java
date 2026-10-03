package com.oplus.pay.opensdk.taskwall.floatwindow;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.provider.Settings;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import com.oplus.aiunit.vision.dde;
import com.oplus.aiunit.vision.irl;
import com.oplus.aiunit.vision.op;
import com.oplus.aiunit.vision.xda;
import com.oplus.pantanal.seedling.constants.TraceConstants;
import com.oplus.pay.opensdk.taskwall.R$color;
import com.oplus.pay.opensdk.taskwall.R$dimen;
import com.oplus.pay.opensdk.taskwall.R$id;
import com.oplus.pay.opensdk.taskwall.R$layout;
import com.oplus.pay.opensdk.taskwall.R$string;
import com.oplus.pay.opensdk.taskwall.floatwindow.FloatingBallService;
import com.oplus.smartenginehelper.ParserTag;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import com.sensorsdata.analytics.android.autotrack.aop.SensorsDataAutoTrackHelper;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;
import com.sensorsdata.analytics.android.sdk.aop.push.PushAutoTrackHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000\u0089\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0006*\u0003FIL\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bO\u0010PJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0002J\b\u0010\b\u001a\u00020\u0002H\u0003J\b\u0010\t\u001a\u00020\u0002H\u0002J\b\u0010\n\u001a\u00020\u0002H\u0002J\b\u0010\u000b\u001a\u00020\u0002H\u0002J\b\u0010\f\u001a\u00020\u0002H\u0002J\b\u0010\r\u001a\u00020\u0002H\u0002J\b\u0010\u000e\u001a\u00020\u0002H\u0003J\b\u0010\u000f\u001a\u00020\u0002H\u0002J\u0014\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016J\"\u0010\u0017\u001a\u00020\u00142\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0016J\b\u0010\u0018\u001a\u00020\u0002H\u0016J\u000e\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0019J\b\u0010\u001c\u001a\u00020\u0002H\u0016J\u0012\u0010\u001e\u001a\u00020\u001d2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016R\u0018\u0010\"\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010&\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010*\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010.\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u00102\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00105\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00104R\u0016\u00108\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u0010;\u001a\u0002098\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001b\u0010:R\u0018\u0010?\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0018\u0010A\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010@R\u0018\u0010B\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010@R\u0018\u0010C\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010@R\u0016\u0010E\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010DR\u0014\u0010H\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010GR\u0014\u0010K\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010JR\u0014\u0010N\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010M¨\u0006Q"}, d2 = {"Lcom/oplus/pay/opensdk/taskwall/floatwindow/FloatingBallService;", "Landroid/app/Service;", "", "z", "Landroid/view/WindowManager$LayoutParams;", "s", "x", "t", "v", "u", "r", "n", "B", "A", "C", "w", "Landroid/content/Intent;", TraceConstants.KEY_ACTION, "Landroid/os/IBinder;", "onBind", "", UTraceSQLiteHelperKt.COL_FLAGS, "startId", "onStartCommand", "onCreate", "", "failReason", "p", "onDestroy", "", "onUnbind", "Landroid/app/Application$ActivityLifecycleCallbacks;", "i", "Landroid/app/Application$ActivityLifecycleCallbacks;", "activityLifecycleCallbacks", "Landroid/view/WindowManager;", "j", "Landroid/view/WindowManager;", "windowManager", "Landroid/view/View;", "k", "Landroid/view/View;", "floatingBallView", "Landroid/widget/TextView;", "l", "Landroid/widget/TextView;", "countdownText", "Landroid/widget/ImageView;", "m", "Landroid/widget/ImageView;", "backArrow", "Landroid/os/Handler;", "Landroid/os/Handler;", "handler", "o", "I", "remainingTime", "Ljava/lang/Runnable;", "Ljava/lang/Runnable;", "countdownRunnable", "Lcom/oplus/pay/opensdk/taskwall/floatwindow/IFloatBallStateListen;", "q", "Lcom/oplus/pay/opensdk/taskwall/floatwindow/IFloatBallStateListen;", "mStateListener", "Ljava/lang/String;", dde.KEY_PACKAGE_NAME, "hostActivityPackageName", "hostActivityClassName", "Z", "isViewAdded", "com/oplus/pay/opensdk/taskwall/floatwindow/FloatingBallService$aidlBinder$1", "Lcom/oplus/pay/opensdk/taskwall/floatwindow/FloatingBallService$aidlBinder$1;", "aidlBinder", "com/oplus/pay/opensdk/taskwall/floatwindow/FloatingBallService$appStateReceiver$1", "Lcom/oplus/pay/opensdk/taskwall/floatwindow/FloatingBallService$appStateReceiver$1;", "appStateReceiver", "com/oplus/pay/opensdk/taskwall/floatwindow/FloatingBallService$keyEventReceiver$1", "Lcom/oplus/pay/opensdk/taskwall/floatwindow/FloatingBallService$keyEventReceiver$1;", "keyEventReceiver", "<init>", "()V", "paysdk_taskwall_release"}, k = 1, mv = {1, 8, 0})
public final class FloatingBallService extends Service {

    @Nullable
    public Application.ActivityLifecycleCallbacks i;

    @Nullable
    public WindowManager j;

    @Nullable
    public View k;

    @Nullable
    public TextView l;

    @Nullable
    public ImageView m;
    public int o;
    public Runnable p;

    @Nullable
    public IFloatBallStateListen q;

    @Nullable
    public String r;

    @Nullable
    public String s;

    @Nullable
    public String t;
    public boolean u;

    @NotNull
    public final Handler n = new Handler(Looper.getMainLooper());

    @NotNull
    public final FloatingBallService$aidlBinder$1 v = new IFloatBallService.Stub() { // from class: com.oplus.pay.opensdk.taskwall.floatwindow.FloatingBallService$aidlBinder$1
        @Override // com.oplus.pay.opensdk.taskwall.floatwindow.IFloatBallService
        public void setActivityInfo(@Nullable String packageName, @Nullable String activityName) {
            irl.a("FloatingBallService AIDL setActivityInfo: package=" + packageName + ", activity=" + activityName);
            this.this$0.s = packageName;
            this.this$0.t = activityName;
        }

        @Override // com.oplus.pay.opensdk.taskwall.floatwindow.IFloatBallService
        public void setStateListener(@Nullable IFloatBallStateListen listener) {
            irl.a("FloatingBallService AIDL setStateListener: " + listener);
            this.this$0.q = listener;
        }
    };

    @NotNull
    public final FloatingBallService$appStateReceiver$1 w = new BroadcastReceiver() { // from class: com.oplus.pay.opensdk.taskwall.floatwindow.FloatingBallService$appStateReceiver$1
        @Override // android.content.BroadcastReceiver
        public void onReceive(@Nullable Context context, @Nullable Intent intent) {
            PushAutoTrackHelper.onBroadcastReceiver(this, context, intent);
            String action = intent != null ? intent.getAction() : null;
            if (action != null && action.hashCode() == -2128145023 && action.equals("android.intent.action.SCREEN_OFF")) {
                this.a.p("screen_off");
            }
        }
    };

    @NotNull
    public final FloatingBallService$keyEventReceiver$1 x = new BroadcastReceiver() { // from class: com.oplus.pay.opensdk.taskwall.floatwindow.FloatingBallService$keyEventReceiver$1
        @Override // android.content.BroadcastReceiver
        public void onReceive(@Nullable Context context, @Nullable Intent intent) {
            PushAutoTrackHelper.onBroadcastReceiver(this, context, intent);
            String action = intent != null ? intent.getAction() : null;
            if (action != null && action.hashCode() == -403228793 && action.equals("android.intent.action.CLOSE_SYSTEM_DIALOGS")) {
                String stringExtra = intent.getStringExtra("reason");
                if (Intrinsics.areEqual(stringExtra, "homekey") || Intrinsics.areEqual(stringExtra, "recentapps")) {
                    irl.a("FloatingBallService key press " + stringExtra + ' ' + this.a.getPackageName());
                    this.a.p(stringExtra);
                }
            }
        }
    };

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0002H\u0016J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0004H\u0016J\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0010"}, d2 = {"com/oplus/pay/opensdk/taskwall/floatwindow/FloatingBallService$a", "Landroid/app/Application$ActivityLifecycleCallbacks;", "Landroid/app/Activity;", "p0", "Landroid/os/Bundle;", "p1", "", "onActivityCreated", "onActivityStarted", "onActivityResumed", ParserTag.TAG_ACTIVITY, "onActivityPaused", "onActivityStopped", "outState", "onActivitySaveInstanceState", "onActivityDestroyed", "paysdk_taskwall_release"}, k = 1, mv = {1, 8, 0})
    public static final class a implements Application.ActivityLifecycleCallbacks {
        public a() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(@NotNull Activity p0, @Nullable Bundle p1) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            irl.g("FloatingBallService onActivityCreated: " + p0);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(@NotNull Activity p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, ParserTag.TAG_ACTIVITY);
            irl.g("FloatingBallService onActivityPaused: " + activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(@NotNull Activity p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            irl.g("FloatingBallService onActivityResumed: " + p0);
            FloatingBallService.this.p("back_key");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle outState) {
            Intrinsics.checkNotNullParameter(activity, ParserTag.TAG_ACTIVITY);
            Intrinsics.checkNotNullParameter(outState, "outState");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(@NotNull Activity p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            irl.b("FloatingBallService onActivityStarted: " + p0);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(@NotNull Activity p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"com/oplus/pay/opensdk/taskwall/floatwindow/FloatingBallService$b", "Ljava/lang/Runnable;", "", "run", "paysdk_taskwall_release"}, k = 1, mv = {1, 8, 0})
    public static final class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (FloatingBallService.this.o > 0) {
                FloatingBallService.this.o--;
                FloatingBallService.this.C();
                FloatingBallService.this.n.postDelayed(this, 1000L);
                return;
            }
            if (FloatingBallService.this.o == 0) {
                FloatingBallService.this.C();
                try {
                    IFloatBallStateListen iFloatBallStateListen = FloatingBallService.this.q;
                    if (iFloatBallStateListen != null) {
                        iFloatBallStateListen.onCountDownFinish(FloatingBallService.this.r);
                    }
                } catch (RemoteException e) {
                    irl.b("FloatingBallService AIDL回调失败: " + e.getMessage());
                }
                Handler handler = FloatingBallService.this.n;
                Runnable runnable = FloatingBallService.this.p;
                if (runnable == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("countdownRunnable");
                    runnable = null;
                }
                handler.removeCallbacks(runnable);
            }
        }
    }

    public static final void o(FloatingBallService floatingBallService) {
        Intrinsics.checkNotNullParameter(floatingBallService, "this$0");
        String str = floatingBallService.s;
        if (!(str == null || str.length() == 0)) {
            String str2 = floatingBallService.t;
            if (!(str2 == null || str2.length() == 0)) {
                try {
                    irl.a("FloatingBallService 使用Activity引用启动Intent，避免开新栈");
                    Intent intent = new Intent();
                    String str3 = floatingBallService.s;
                    Intrinsics.checkNotNull(str3);
                    String str4 = floatingBallService.t;
                    Intrinsics.checkNotNull(str4);
                    intent.setComponent(new ComponentName(str3, str4));
                    intent.setFlags(537001984);
                    op opVar = op.INSTANCE;
                    Activity activityA = opVar.a();
                    if (activityA != null) {
                        activityA.startActivity(intent);
                    }
                    irl.a("FloatingBallService 使用Activity引用启动Intent成功 " + opVar.a());
                    return;
                } catch (Exception e) {
                    irl.b("FloatingBallService 使用Activity引用启动Intent失败: " + e.getMessage());
                    floatingBallService.B();
                    return;
                }
            }
        }
        irl.b("FloatingBallService hostActivityPackageName、hostActivityClassName is null");
        floatingBallService.B();
    }

    public static final void q(FloatingBallService floatingBallService, String str) {
        Intrinsics.checkNotNullParameter(floatingBallService, "this$0");
        Intrinsics.checkNotNullParameter(str, "$failReason");
        floatingBallService.w();
        int i = floatingBallService.o;
        if (i > 0) {
            try {
                IFloatBallStateListen iFloatBallStateListen = floatingBallService.q;
                if (iFloatBallStateListen != null) {
                    iFloatBallStateListen.onTaskFailed(floatingBallService.r, str, String.valueOf(i));
                }
            } catch (RemoteException e) {
                irl.b("FloatingBallService AIDL回调失败: " + e.getMessage());
            }
            floatingBallService.n.removeCallbacksAndMessages(null);
        }
        irl.a("FloatingBallService dismissFloatBallTaskFail stopSelf " + str);
        floatingBallService.stopSelf();
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = floatingBallService.i;
        if (activityLifecycleCallbacks != null) {
            Application application = floatingBallService.getApplication();
            Intrinsics.checkNotNull(application, "null cannot be cast to non-null type android.app.Application");
            application.unregisterActivityLifecycleCallbacks(activityLifecycleCallbacks);
        }
    }

    @SensorsDataInstrumented
    public static final void y(FloatingBallService floatingBallService, View view) {
        Intrinsics.checkNotNullParameter(floatingBallService, "this$0");
        irl.g("FloatingBallService click floating Ball View");
        floatingBallService.n();
        SensorsDataAutoTrackHelper.trackViewOnClick(view);
    }

    public final void A() {
        this.n.removeCallbacksAndMessages(null);
        b bVar = new b();
        this.p = bVar;
        this.n.post(bVar);
    }

    public final void B() {
        try {
            String str = this.s;
            if (str == null || str.length() == 0) {
                return;
            }
            PackageManager packageManager = getPackageManager();
            String str2 = this.s;
            Intrinsics.checkNotNull(str2);
            Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str2);
            if (launchIntentForPackage == null) {
                irl.b("FloatingBallService 无法获取启动Intent");
                return;
            }
            launchIntentForPackage.setFlags(612499456);
            startActivity(launchIntentForPackage);
            irl.a("FloatingBallService 包管理器启动成功");
        } catch (Exception e) {
            irl.b("FloatingBallService 包管理器启动失败: " + e.getMessage());
        }
    }

    @SuppressLint({"StringFormatMatches"})
    public final void C() {
        CharSequence string;
        int i = this.o;
        if (i > 0) {
            string = Html.fromHtml(getString(R$string.opay_pay_sdk_paysub_float_window_browsing_time_for_reward, "<font color='" + getResources().getColor(R$color.opay_pay_sdk_task_wall_primary_text_red) + "'>" + this.o + "</font>"), 0);
        } else {
            string = i == 0 ? getString(R$string.opay_pay_sdk_paysub_float_window_task_complete) : getString(R$string.opay_pay_sdk_paysub_float_window_task_complete);
        }
        TextView textView = this.l;
        if (textView == null) {
            return;
        }
        textView.setText(string);
    }

    public final void n() {
        this.n.post(new Runnable() { // from class: com.oplus.aiunit.vision.wu7
            @Override // java.lang.Runnable
            public final void run() {
                FloatingBallService.o(this.i);
            }
        });
        p("float ball back icon click");
    }

    @Override // android.app.Service
    @Nullable
    public IBinder onBind(@Nullable Intent intent) {
        return this.v;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        irl.a("FloatingBallService onCreate");
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        irl.a("FloatingBallService onDestroy");
        w();
        this.n.removeCallbacksAndMessages(null);
        this.q = null;
        unregisterReceiver(this.w);
        unregisterReceiver(this.x);
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.i;
        if (activityLifecycleCallbacks != null) {
            Application application = getApplication();
            Intrinsics.checkNotNull(application, "null cannot be cast to non-null type android.app.Application");
            application.unregisterActivityLifecycleCallbacks(activityLifecycleCallbacks);
        }
        this.u = false;
    }

    @Override // android.app.Service
    public int onStartCommand(@Nullable Intent intent, int flags, int startId) {
        String stringExtra;
        PushAutoTrackHelper.onServiceStartCommand(this, intent, flags, startId);
        irl.a("FloatingBallService onStartCommand");
        boolean z = false;
        if (intent != null) {
            this.o = intent.getIntExtra("remaining_time", 0);
            C();
        }
        if (intent == null || (stringExtra = intent.getStringExtra("target_packageName")) == null) {
            stringExtra = "";
        }
        this.r = stringExtra;
        if (!Settings.canDrawOverlays(this)) {
            irl.a("FloatingBallService do not have SYSTEM_ALERT_WINDOW permission");
            return 2;
        }
        if (this.u) {
            View view = this.k;
            if (view != null && view.isAttachedToWindow()) {
                z = true;
            }
            if (z) {
                irl.g("FloatingBallService View already added, updating countdown only");
                C();
                return 2;
            }
        }
        t();
        r();
        z();
        x();
        A();
        v();
        u();
        return 2;
    }

    @Override // android.app.Service
    public boolean onUnbind(@Nullable Intent intent) {
        irl.a("FloatingBallService onUnbind");
        return super.onUnbind(intent);
    }

    public final void p(@NotNull final String failReason) {
        Intrinsics.checkNotNullParameter(failReason, "failReason");
        this.n.post(new Runnable() { // from class: com.oplus.aiunit.vision.uu7
            @Override // java.lang.Runnable
            public final void run() {
                FloatingBallService.q(this.i, failReason);
            }
        });
    }

    public final void r() {
        if (this.k == null) {
            Object systemService = getSystemService("window");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            this.j = (WindowManager) systemService;
            View viewInflate = LayoutInflater.from(this).inflate(R$layout.opay_pay_sdk_task_wall_web_container_floating_ball_layout, (ViewGroup) null);
            viewInflate.setImportantForAutofill(2);
            viewInflate.setAutofillHints(null);
            viewInflate.setFocusableInTouchMode(true);
            this.k = viewInflate;
            this.l = viewInflate != null ? (TextView) viewInflate.findViewById(R$id.countdown_text) : null;
            View view = this.k;
            this.m = view != null ? (ImageView) view.findViewById(R$id.icon_back) : null;
        }
    }

    public final WindowManager.LayoutParams s() {
        return new WindowManager.LayoutParams(-2, -2, 2038, 262152, -3);
    }

    public final void t() {
        this.i = new a();
        Application application = getApplication();
        Intrinsics.checkNotNull(application, "null cannot be cast to non-null type android.app.Application");
        application.registerActivityLifecycleCallbacks(this.i);
    }

    public final void u() {
        IntentFilter intentFilter = new IntentFilter();
        xda.a(intentFilter, "android.intent.action.SCREEN_OFF");
        registerReceiver(this.w, intentFilter);
    }

    @SuppressLint({"UnspecifiedRegisterReceiverFlag"})
    public final void v() {
        IntentFilter intentFilter = new IntentFilter();
        xda.a(intentFilter, "android.intent.action.CLOSE_SYSTEM_DIALOGS");
        if (Build.VERSION.SDK_INT >= 33) {
            registerReceiver(this.x, intentFilter, 4);
        } else {
            registerReceiver(this.x, intentFilter, 4);
        }
    }

    public final void w() {
        View view;
        WindowManager windowManager;
        try {
            boolean z = true;
            if (!this.u) {
                View view2 = this.k;
                if (!(view2 != null && view2.isAttachedToWindow())) {
                    z = false;
                }
            }
            if (!z || (view = this.k) == null || (windowManager = this.j) == null) {
                return;
            }
            if (windowManager != null) {
                windowManager.removeView(view);
            }
            this.u = false;
            try {
                irl.g("FloatingBallService removeView: " + this.r);
                IFloatBallStateListen iFloatBallStateListen = this.q;
                if (iFloatBallStateListen != null) {
                    iFloatBallStateListen.onFloatBallHide(this.r);
                    return;
                }
                return;
            } catch (RemoteException e) {
                irl.b("FloatingBallService AIDL回调失败: " + e.getMessage());
                return;
            }
            irl.b("FloatingBallService removeView error: " + e.getMessage());
        } catch (Exception e2) {
            irl.b("FloatingBallService removeView error: " + e2.getMessage());
        }
    }

    public final void x() {
        View view = this.k;
        if (view != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.vu7
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    FloatingBallService.y(this.i, view2);
                }
            });
        }
    }

    public final void z() {
        View view;
        if (this.u) {
            irl.g("FloatingBallService View already added, skipping showView");
            return;
        }
        View view2 = this.k;
        if (view2 != null && view2.isAttachedToWindow()) {
            irl.g("FloatingBallService View is already attached, skipping showView");
            this.u = true;
            return;
        }
        try {
            WindowManager.LayoutParams layoutParamsS = s();
            layoutParamsS.gravity = 8388659;
            layoutParamsS.x = 0;
            layoutParamsS.y = getResources().getDimensionPixelOffset(R$dimen.opay_pay_sdk_task_wall_lib_ui_dp_90);
            WindowManager windowManager = this.j;
            if (windowManager == null || (view = this.k) == null) {
                irl.b("FloatingBallService WindowManager or FloatingBallView is null, cannot add view");
                return;
            }
            if (windowManager != null) {
                windowManager.addView(view, layoutParamsS);
            }
            this.u = true;
            irl.a("FloatingBallService View added successfully");
            try {
                IFloatBallStateListen iFloatBallStateListen = this.q;
                if (iFloatBallStateListen != null) {
                    iFloatBallStateListen.onFloatBallShow(this.r);
                }
            } catch (RemoteException e) {
                irl.b("FloatingBallService AIDL fail: " + e.getMessage());
            }
        } catch (Exception e2) {
            this.u = false;
            irl.b("FloatingBallService Failed to add view: " + e2.getMessage());
        }
    }
}
