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
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.speech.engine.constant.EngineConstant;
import com.oplus.aiunit.vision.c8l;
import com.oplus.aiunit.vision.ebe;
import com.oplus.aiunit.vision.gp;
import com.oplus.aiunit.vision.knl;
import com.oplus.aiunit.vision.pca;
import com.oplus.pay.opensdk.taskwall.R$color;
import com.oplus.pay.opensdk.taskwall.R$dimen;
import com.oplus.pay.opensdk.taskwall.R$id;
import com.oplus.pay.opensdk.taskwall.R$layout;
import com.oplus.pay.opensdk.taskwall.R$string;
import com.oplus.pay.opensdk.taskwall.floatwindow.FloatingBallService;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import com.sensorsdata.analytics.android.autotrack.aop.SensorsDataAutoTrackHelper;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;
import com.sensorsdata.analytics.android.sdk.aop.push.PushAutoTrackHelper;
import io.netty.util.internal.StringUtil;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0089\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0006*\u0003FIL\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bO\u0010PJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0002J\b\u0010\b\u001a\u00020\u0002H\u0003J\b\u0010\t\u001a\u00020\u0002H\u0002J\b\u0010\n\u001a\u00020\u0002H\u0002J\b\u0010\u000b\u001a\u00020\u0002H\u0002J\b\u0010\f\u001a\u00020\u0002H\u0002J\b\u0010\r\u001a\u00020\u0002H\u0002J\b\u0010\u000e\u001a\u00020\u0002H\u0003J\b\u0010\u000f\u001a\u00020\u0002H\u0002J\u0014\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016J\"\u0010\u0017\u001a\u00020\u00142\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0016J\b\u0010\u0018\u001a\u00020\u0002H\u0016J\u000e\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0019J\b\u0010\u001c\u001a\u00020\u0002H\u0016J\u0012\u0010\u001e\u001a\u00020\u001d2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016R\u0018\u0010\"\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010&\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010*\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010.\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u00102\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00105\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00104R\u0016\u00108\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u0010;\u001a\u0002098\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001b\u0010:R\u0018\u0010?\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0018\u0010A\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010@R\u0018\u0010B\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010@R\u0018\u0010C\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010@R\u0016\u0010E\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010DR\u0014\u0010H\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010GR\u0014\u0010K\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010JR\u0014\u0010N\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010M¨\u0006Q"}, d2 = {"Lcom/oplus/pay/opensdk/taskwall/floatwindow/FloatingBallService;", "Landroid/app/Service;", "", "z", "Landroid/view/WindowManager$LayoutParams;", "s", "x", "t", "v", "u", "r", "n", c8l.KEY_B, "A", "C", "w", "Landroid/content/Intent;", "intent", "Landroid/os/IBinder;", "onBind", "", UTraceSQLiteHelperKt.COL_FLAGS, "startId", "onStartCommand", "onCreate", "", "failReason", LogFieldKey.PROCESS_NAME_KEY, "onDestroy", "", "onUnbind", "Landroid/app/Application$ActivityLifecycleCallbacks;", "i", "Landroid/app/Application$ActivityLifecycleCallbacks;", "activityLifecycleCallbacks", "Landroid/view/WindowManager;", "j", "Landroid/view/WindowManager;", "windowManager", "Landroid/view/View;", MapSchema.FIELD_NAME_KEY, "Landroid/view/View;", "floatingBallView", "Landroid/widget/TextView;", LogFieldKey.LEVEL_KEY, "Landroid/widget/TextView;", "countdownText", "Landroid/widget/ImageView;", LogFieldKey.MESSAGE_KEY, "Landroid/widget/ImageView;", "backArrow", "Landroid/os/Handler;", "Landroid/os/Handler;", "handler", "o", "I", "remainingTime", "Ljava/lang/Runnable;", "Ljava/lang/Runnable;", "countdownRunnable", "Lcom/oplus/pay/opensdk/taskwall/floatwindow/IFloatBallStateListen;", "q", "Lcom/oplus/pay/opensdk/taskwall/floatwindow/IFloatBallStateListen;", "mStateListener", "Ljava/lang/String;", ebe.KEY_PACKAGE_NAME, "hostActivityPackageName", "hostActivityClassName", "Z", "isViewAdded", "com/oplus/pay/opensdk/taskwall/floatwindow/FloatingBallService$aidlBinder$1", "Lcom/oplus/pay/opensdk/taskwall/floatwindow/FloatingBallService$aidlBinder$1;", "aidlBinder", "com/oplus/pay/opensdk/taskwall/floatwindow/FloatingBallService$appStateReceiver$1", "Lcom/oplus/pay/opensdk/taskwall/floatwindow/FloatingBallService$appStateReceiver$1;", "appStateReceiver", "com/oplus/pay/opensdk/taskwall/floatwindow/FloatingBallService$keyEventReceiver$1", "Lcom/oplus/pay/opensdk/taskwall/floatwindow/FloatingBallService$keyEventReceiver$1;", "keyEventReceiver", "<init>", "()V", "paysdk_taskwall_release"}, k = 1, mv = {1, 8, 0})
public final class FloatingBallService extends Service {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public Application.ActivityLifecycleCallbacks activityLifecycleCallbacks;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public WindowManager windowManager;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    public View floatingBallView;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public TextView countdownText;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    public ImageView backArrow;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public int remainingTime;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public Runnable countdownRunnable;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @Nullable
    public IFloatBallStateListen mStateListener;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @Nullable
    public String mPackageName;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @Nullable
    public String hostActivityPackageName;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @Nullable
    public String hostActivityClassName;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    public boolean isViewAdded;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Handler handler = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @NotNull
    public final FloatingBallService$aidlBinder$1 aidlBinder = new IFloatBallService.Stub() { // from class: com.oplus.pay.opensdk.taskwall.floatwindow.FloatingBallService$aidlBinder$1
        @Override // com.oplus.pay.opensdk.taskwall.floatwindow.IFloatBallService
        public void setActivityInfo(@Nullable String packageName, @Nullable String activityName) {
            knl.a("FloatingBallService AIDL setActivityInfo: package=" + packageName + ", activity=" + activityName);
            this.this$0.hostActivityPackageName = packageName;
            this.this$0.hostActivityClassName = activityName;
        }

        @Override // com.oplus.pay.opensdk.taskwall.floatwindow.IFloatBallService
        public void setStateListener(@Nullable IFloatBallStateListen listener) {
            knl.a("FloatingBallService AIDL setStateListener: " + listener);
            this.this$0.mStateListener = listener;
        }
    };

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    @NotNull
    public final FloatingBallService$appStateReceiver$1 appStateReceiver = new BroadcastReceiver() { // from class: com.oplus.pay.opensdk.taskwall.floatwindow.FloatingBallService$appStateReceiver$1
        @Override // android.content.BroadcastReceiver
        public void onReceive(@Nullable Context context, @Nullable Intent intent) {
            PushAutoTrackHelper.onBroadcastReceiver(this, context, intent);
            String action = intent != null ? intent.getAction() : null;
            if (action != null && action.hashCode() == -2128145023 && action.equals("android.intent.action.SCREEN_OFF")) {
                this.a.p("screen_off");
            }
        }
    };

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @NotNull
    public final FloatingBallService$keyEventReceiver$1 keyEventReceiver = new BroadcastReceiver() { // from class: com.oplus.pay.opensdk.taskwall.floatwindow.FloatingBallService$keyEventReceiver$1
        @Override // android.content.BroadcastReceiver
        public void onReceive(@Nullable Context context, @Nullable Intent intent) {
            PushAutoTrackHelper.onBroadcastReceiver(this, context, intent);
            String action = intent != null ? intent.getAction() : null;
            if (action != null && action.hashCode() == -403228793 && action.equals("android.intent.action.CLOSE_SYSTEM_DIALOGS")) {
                String stringExtra = intent.getStringExtra(EngineConstant.REASON);
                if (Intrinsics.areEqual(stringExtra, "homekey") || Intrinsics.areEqual(stringExtra, "recentapps")) {
                    knl.a("FloatingBallService key press " + stringExtra + StringUtil.SPACE + this.a.getPackageName());
                    this.a.p(stringExtra);
                }
            }
        }
    };

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0002H\u0016J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0004H\u0016J\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0010"}, d2 = {"com/oplus/pay/opensdk/taskwall/floatwindow/FloatingBallService$a", "Landroid/app/Application$ActivityLifecycleCallbacks;", "Landroid/app/Activity;", "p0", "Landroid/os/Bundle;", "p1", "", "onActivityCreated", "onActivityStarted", "onActivityResumed", "activity", "onActivityPaused", "onActivityStopped", "outState", "onActivitySaveInstanceState", "onActivityDestroyed", "paysdk_taskwall_release"}, k = 1, mv = {1, 8, 0})
    public static final class a implements Application.ActivityLifecycleCallbacks {
        public a() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(@NotNull Activity p0, @Nullable Bundle p1) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            knl.g("FloatingBallService onActivityCreated: " + p0);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(@NotNull Activity p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            knl.g("FloatingBallService onActivityPaused: " + activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(@NotNull Activity p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            knl.g("FloatingBallService onActivityResumed: " + p0);
            FloatingBallService.this.p("back_key");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle outState) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(outState, "outState");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(@NotNull Activity p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            knl.b("FloatingBallService onActivityStarted: " + p0);
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
            if (FloatingBallService.this.remainingTime > 0) {
                FloatingBallService.this.remainingTime--;
                FloatingBallService.this.C();
                FloatingBallService.this.handler.postDelayed(this, 1000L);
                return;
            }
            if (FloatingBallService.this.remainingTime == 0) {
                FloatingBallService.this.C();
                try {
                    IFloatBallStateListen iFloatBallStateListen = FloatingBallService.this.mStateListener;
                    if (iFloatBallStateListen != null) {
                        iFloatBallStateListen.onCountDownFinish(FloatingBallService.this.mPackageName);
                    }
                } catch (RemoteException e2) {
                    knl.b("FloatingBallService AIDL回调失败: " + e2.getMessage());
                }
                Handler handler = FloatingBallService.this.handler;
                Runnable runnable = FloatingBallService.this.countdownRunnable;
                if (runnable == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("countdownRunnable");
                    runnable = null;
                }
                handler.removeCallbacks(runnable);
            }
        }
    }

    public static final void o(FloatingBallService this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        String str = this$0.hostActivityPackageName;
        if (!(str == null || str.length() == 0)) {
            String str2 = this$0.hostActivityClassName;
            if (!(str2 == null || str2.length() == 0)) {
                try {
                    knl.a("FloatingBallService 使用Activity引用启动Intent，避免开新栈");
                    Intent intent = new Intent();
                    String str3 = this$0.hostActivityPackageName;
                    Intrinsics.checkNotNull(str3);
                    String str4 = this$0.hostActivityClassName;
                    Intrinsics.checkNotNull(str4);
                    intent.setComponent(new ComponentName(str3, str4));
                    intent.setFlags(537001984);
                    gp gpVar = gp.INSTANCE;
                    Activity activityA = gpVar.a();
                    if (activityA != null) {
                        activityA.startActivity(intent);
                    }
                    knl.a("FloatingBallService 使用Activity引用启动Intent成功 " + gpVar.a());
                    return;
                } catch (Exception e2) {
                    knl.b("FloatingBallService 使用Activity引用启动Intent失败: " + e2.getMessage());
                    this$0.B();
                    return;
                }
            }
        }
        knl.b("FloatingBallService hostActivityPackageName、hostActivityClassName is null");
        this$0.B();
    }

    public static final void q(FloatingBallService this$0, String failReason) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(failReason, "$failReason");
        this$0.w();
        int i = this$0.remainingTime;
        if (i > 0) {
            try {
                IFloatBallStateListen iFloatBallStateListen = this$0.mStateListener;
                if (iFloatBallStateListen != null) {
                    iFloatBallStateListen.onTaskFailed(this$0.mPackageName, failReason, String.valueOf(i));
                }
            } catch (RemoteException e2) {
                knl.b("FloatingBallService AIDL回调失败: " + e2.getMessage());
            }
            this$0.handler.removeCallbacksAndMessages(null);
        }
        knl.a("FloatingBallService dismissFloatBallTaskFail stopSelf " + failReason);
        this$0.stopSelf();
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this$0.activityLifecycleCallbacks;
        if (activityLifecycleCallbacks != null) {
            Application application = this$0.getApplication();
            Intrinsics.checkNotNull(application, "null cannot be cast to non-null type android.app.Application");
            application.unregisterActivityLifecycleCallbacks(activityLifecycleCallbacks);
        }
    }

    @SensorsDataInstrumented
    public static final void y(FloatingBallService this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        knl.g("FloatingBallService click floating Ball View");
        this$0.n();
        SensorsDataAutoTrackHelper.trackViewOnClick(view);
    }

    public final void A() {
        this.handler.removeCallbacksAndMessages(null);
        b bVar = new b();
        this.countdownRunnable = bVar;
        this.handler.post(bVar);
    }

    public final void B() {
        try {
            String str = this.hostActivityPackageName;
            if (str == null || str.length() == 0) {
                return;
            }
            PackageManager packageManager = getPackageManager();
            String str2 = this.hostActivityPackageName;
            Intrinsics.checkNotNull(str2);
            Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str2);
            if (launchIntentForPackage == null) {
                knl.b("FloatingBallService 无法获取启动Intent");
                return;
            }
            launchIntentForPackage.setFlags(612499456);
            startActivity(launchIntentForPackage);
            knl.a("FloatingBallService 包管理器启动成功");
        } catch (Exception e2) {
            knl.b("FloatingBallService 包管理器启动失败: " + e2.getMessage());
        }
    }

    @SuppressLint({"StringFormatMatches"})
    public final void C() {
        CharSequence string;
        int i = this.remainingTime;
        if (i > 0) {
            string = Html.fromHtml(getString(R$string.opay_pay_sdk_paysub_float_window_browsing_time_for_reward, "<font color='" + getResources().getColor(R$color.opay_pay_sdk_task_wall_primary_text_red) + "'>" + this.remainingTime + "</font>"), 0);
        } else {
            string = i == 0 ? getString(R$string.opay_pay_sdk_paysub_float_window_task_complete) : getString(R$string.opay_pay_sdk_paysub_float_window_task_complete);
        }
        TextView textView = this.countdownText;
        if (textView == null) {
            return;
        }
        textView.setText(string);
    }

    public final void n() {
        this.handler.post(new Runnable() { // from class: com.oplus.aiunit.vision.ut7
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
        return this.aidlBinder;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        knl.a("FloatingBallService onCreate");
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        knl.a("FloatingBallService onDestroy");
        w();
        this.handler.removeCallbacksAndMessages(null);
        this.mStateListener = null;
        unregisterReceiver(this.appStateReceiver);
        unregisterReceiver(this.keyEventReceiver);
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.activityLifecycleCallbacks;
        if (activityLifecycleCallbacks != null) {
            Application application = getApplication();
            Intrinsics.checkNotNull(application, "null cannot be cast to non-null type android.app.Application");
            application.unregisterActivityLifecycleCallbacks(activityLifecycleCallbacks);
        }
        this.isViewAdded = false;
    }

    @Override // android.app.Service
    public int onStartCommand(@Nullable Intent intent, int flags, int startId) {
        String stringExtra;
        PushAutoTrackHelper.onServiceStartCommand(this, intent, flags, startId);
        knl.a("FloatingBallService onStartCommand");
        boolean z = false;
        if (intent != null) {
            this.remainingTime = intent.getIntExtra("remaining_time", 0);
            C();
        }
        if (intent == null || (stringExtra = intent.getStringExtra("target_packageName")) == null) {
            stringExtra = "";
        }
        this.mPackageName = stringExtra;
        if (!Settings.canDrawOverlays(this)) {
            knl.a("FloatingBallService do not have SYSTEM_ALERT_WINDOW permission");
            return 2;
        }
        if (this.isViewAdded) {
            View view = this.floatingBallView;
            if (view != null && view.isAttachedToWindow()) {
                z = true;
            }
            if (z) {
                knl.g("FloatingBallService View already added, updating countdown only");
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
        knl.a("FloatingBallService onUnbind");
        return super.onUnbind(intent);
    }

    public final void p(@NotNull final String failReason) {
        Intrinsics.checkNotNullParameter(failReason, "failReason");
        this.handler.post(new Runnable() { // from class: com.oplus.aiunit.vision.st7
            @Override // java.lang.Runnable
            public final void run() {
                FloatingBallService.q(this.i, failReason);
            }
        });
    }

    public final void r() {
        if (this.floatingBallView == null) {
            Object systemService = getSystemService("window");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            this.windowManager = (WindowManager) systemService;
            View viewInflate = LayoutInflater.from(this).inflate(R$layout.opay_pay_sdk_task_wall_web_container_floating_ball_layout, (ViewGroup) null);
            viewInflate.setImportantForAutofill(2);
            viewInflate.setAutofillHints(null);
            viewInflate.setFocusableInTouchMode(true);
            this.floatingBallView = viewInflate;
            this.countdownText = viewInflate != null ? (TextView) viewInflate.findViewById(R$id.countdown_text) : null;
            View view = this.floatingBallView;
            this.backArrow = view != null ? (ImageView) view.findViewById(R$id.icon_back) : null;
        }
    }

    public final WindowManager.LayoutParams s() {
        return new WindowManager.LayoutParams(-2, -2, 2038, 262152, -3);
    }

    public final void t() {
        this.activityLifecycleCallbacks = new a();
        Application application = getApplication();
        Intrinsics.checkNotNull(application, "null cannot be cast to non-null type android.app.Application");
        application.registerActivityLifecycleCallbacks(this.activityLifecycleCallbacks);
    }

    public final void u() {
        IntentFilter intentFilter = new IntentFilter();
        pca.a(intentFilter, "android.intent.action.SCREEN_OFF");
        registerReceiver(this.appStateReceiver, intentFilter);
    }

    @SuppressLint({"UnspecifiedRegisterReceiverFlag"})
    public final void v() {
        IntentFilter intentFilter = new IntentFilter();
        pca.a(intentFilter, "android.intent.action.CLOSE_SYSTEM_DIALOGS");
        if (Build.VERSION.SDK_INT >= 33) {
            registerReceiver(this.keyEventReceiver, intentFilter, 4);
        } else {
            registerReceiver(this.keyEventReceiver, intentFilter, 4);
        }
    }

    public final void w() {
        View view;
        WindowManager windowManager;
        try {
            boolean z = true;
            if (!this.isViewAdded) {
                View view2 = this.floatingBallView;
                if (!(view2 != null && view2.isAttachedToWindow())) {
                    z = false;
                }
            }
            if (!z || (view = this.floatingBallView) == null || (windowManager = this.windowManager) == null) {
                return;
            }
            if (windowManager != null) {
                windowManager.removeView(view);
            }
            this.isViewAdded = false;
            try {
                knl.g("FloatingBallService removeView: " + this.mPackageName);
                IFloatBallStateListen iFloatBallStateListen = this.mStateListener;
                if (iFloatBallStateListen != null) {
                    iFloatBallStateListen.onFloatBallHide(this.mPackageName);
                    return;
                }
                return;
            } catch (RemoteException e2) {
                knl.b("FloatingBallService AIDL回调失败: " + e2.getMessage());
                return;
            }
            knl.b("FloatingBallService removeView error: " + e.getMessage());
        } catch (Exception e3) {
            knl.b("FloatingBallService removeView error: " + e3.getMessage());
        }
    }

    public final void x() {
        View view = this.floatingBallView;
        if (view != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.tt7
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    FloatingBallService.y(this.i, view2);
                }
            });
        }
    }

    public final void z() {
        View view;
        if (this.isViewAdded) {
            knl.g("FloatingBallService View already added, skipping showView");
            return;
        }
        View view2 = this.floatingBallView;
        if (view2 != null && view2.isAttachedToWindow()) {
            knl.g("FloatingBallService View is already attached, skipping showView");
            this.isViewAdded = true;
            return;
        }
        try {
            WindowManager.LayoutParams layoutParamsS = s();
            layoutParamsS.gravity = 8388659;
            layoutParamsS.x = 0;
            layoutParamsS.y = getResources().getDimensionPixelOffset(R$dimen.opay_pay_sdk_task_wall_lib_ui_dp_90);
            WindowManager windowManager = this.windowManager;
            if (windowManager == null || (view = this.floatingBallView) == null) {
                knl.b("FloatingBallService WindowManager or FloatingBallView is null, cannot add view");
                return;
            }
            if (windowManager != null) {
                windowManager.addView(view, layoutParamsS);
            }
            this.isViewAdded = true;
            knl.a("FloatingBallService View added successfully");
            try {
                IFloatBallStateListen iFloatBallStateListen = this.mStateListener;
                if (iFloatBallStateListen != null) {
                    iFloatBallStateListen.onFloatBallShow(this.mPackageName);
                }
            } catch (RemoteException e2) {
                knl.b("FloatingBallService AIDL fail: " + e2.getMessage());
            }
        } catch (Exception e3) {
            this.isViewAdded = false;
            knl.b("FloatingBallService Failed to add view: " + e3.getMessage());
        }
    }
}
