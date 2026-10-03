package com.oplus.pay.opensdk.taskwall.manager;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.provider.Settings;
import androidx.fragment.app.FragmentActivity;
import com.oplus.aiunit.vision.i80;
import com.oplus.aiunit.vision.op;
import com.oplus.aiunit.vision.pce;
import com.oplus.aiunit.vision.qmm;
import com.oplus.aiunit.vision.rs9;
import com.oplus.aiunit.vision.us9;
import com.oplus.instant.router.Instant;
import com.oplus.instant.router.callback.Callback;
import com.oplus.pay.opensdk.taskwall.floatwindow.FloatingBallService;
import com.oplus.pay.opensdk.taskwall.floatwindow.IFloatBallService;
import com.oplus.pay.opensdk.taskwall.manager.PayFloatBallManager;
import com.oplus.smartenginehelper.ParserTag;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000U\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\b\u0007*\u0001)\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0016B\t\b\u0002¢\u0006\u0004\b-\u0010.J8\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bJ\u000e\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fJ\u000e\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010J\"\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002J\b\u0010\u0014\u001a\u00020\u000eH\u0002R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010&\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010(\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010%R\u0014\u0010,\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006/"}, d2 = {"Lcom/oplus/pay/opensdk/taskwall/manager/PayFloatBallManager;", "", "Landroidx/fragment/app/FragmentActivity;", ParserTag.TAG_ACTIVITY, "", "packageName", "remainingTime", qmm.a.l, "Lcom/oplus/aiunit/vision/rs9;", "callback", "Lcom/oplus/pay/opensdk/taskwall/manager/PayFloatBallManager$a;", "n", "Lcom/oplus/aiunit/vision/us9;", "fragment", "", "p", "Landroid/content/Context;", "context", "k", "q", "l", "Lcom/oplus/pay/opensdk/taskwall/floatwindow/IFloatBallService;", "a", "Lcom/oplus/pay/opensdk/taskwall/floatwindow/IFloatBallService;", "floatingBallService", "Landroid/content/ServiceConnection;", "b", "Landroid/content/ServiceConnection;", "serviceConnection", "c", "Lcom/oplus/aiunit/vision/us9;", "mFragment", "", "d", "Z", "isServiceBound", "e", "Ljava/lang/String;", "currentActivityPackageName", "f", "currentActivityClassName", "com/oplus/pay/opensdk/taskwall/manager/PayFloatBallManager$defaultListener$1", "g", "Lcom/oplus/pay/opensdk/taskwall/manager/PayFloatBallManager$defaultListener$1;", "defaultListener", "<init>", "()V", "paysdk_taskwall_release"}, k = 1, mv = {1, 8, 0})
public final class PayFloatBallManager {

    @Nullable
    public static IFloatBallService a;

    @Nullable
    public static ServiceConnection b;

    @Nullable
    public static us9 c;
    public static boolean d;

    @Nullable
    public static String e;

    @Nullable
    public static String f;

    @NotNull
    public static final PayFloatBallManager INSTANCE = new PayFloatBallManager();

    @NotNull
    public static final PayFloatBallManager$defaultListener$1 g = new PayFloatBallManager$defaultListener$1();

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/oplus/pay/opensdk/taskwall/manager/PayFloatBallManager$a;", "", "<init>", "()V", "a", "b", "Lcom/oplus/pay/opensdk/taskwall/manager/PayFloatBallManager$a$a;", "Lcom/oplus/pay/opensdk/taskwall/manager/PayFloatBallManager$a$b;", "paysdk_taskwall_release"}, k = 1, mv = {1, 8, 0})
    public static abstract class a {

        /* JADX INFO: renamed from: com.oplus.pay.opensdk.taskwall.manager.PayFloatBallManager$a$a, reason: from toString */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/oplus/pay/opensdk/taskwall/manager/PayFloatBallManager$a$a;", "Lcom/oplus/pay/opensdk/taskwall/manager/PayFloatBallManager$a;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "message", "<init>", "(Ljava/lang/String;)V", "paysdk_taskwall_release"}, k = 1, mv = {1, 8, 0})
        public static final /* data */ class Failure extends a {

            /* JADX INFO: renamed from: a, reason: from toString */
            @NotNull
            public final String message;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Failure(@NotNull String str) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "message");
                this.message = str;
            }

            @NotNull
            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getMessage() {
                return this.message;
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Failure) && Intrinsics.areEqual(this.message, ((Failure) other).message);
            }

            public int hashCode() {
                return this.message.hashCode();
            }

            @NotNull
            public String toString() {
                return "Failure(message=" + this.message + ')';
            }
        }

        /* JADX INFO: renamed from: com.oplus.pay.opensdk.taskwall.manager.PayFloatBallManager$a$b, reason: from toString */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/oplus/pay/opensdk/taskwall/manager/PayFloatBallManager$a$b;", "Lcom/oplus/pay/opensdk/taskwall/manager/PayFloatBallManager$a;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "message", "<init>", "(Ljava/lang/String;)V", "paysdk_taskwall_release"}, k = 1, mv = {1, 8, 0})
        public static final /* data */ class Success extends a {

            /* JADX INFO: renamed from: a, reason: from toString */
            @NotNull
            public final String message;

            /* JADX WARN: Illegal instructions before constructor call */
            public Success() {
                String str = null;
                this(str, 1, str);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Success) && Intrinsics.areEqual(this.message, ((Success) other).message);
            }

            public int hashCode() {
                return this.message.hashCode();
            }

            @NotNull
            public String toString() {
                return "Success(message=" + this.message + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Success(@NotNull String str) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "message");
                this.message = str;
            }

            public /* synthetic */ Success(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "Operation successful" : str);
            }
        }

        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010\b\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/oplus/pay/opensdk/taskwall/manager/PayFloatBallManager$b", "Landroid/content/ServiceConnection;", "Landroid/content/ComponentName;", "name", "Landroid/os/IBinder;", ParserTag.TAG_SERVICE, "", "onServiceConnected", "onServiceDisconnected", "paysdk_taskwall_release"}, k = 1, mv = {1, 8, 0})
    public static final class b implements ServiceConnection {
        @Override // android.content.ServiceConnection
        public void onServiceConnected(@Nullable ComponentName name, @Nullable IBinder service) {
            pce.b("PayFloatBallManager onServiceConnected: service = " + service);
            try {
                PayFloatBallManager payFloatBallManager = PayFloatBallManager.INSTANCE;
                PayFloatBallManager.a = IFloatBallService.Stub.asInterface(service);
                if (PayFloatBallManager.a == null) {
                    pce.c("PayFloatBallManager AIDL interface creation failed");
                    return;
                }
                IFloatBallService iFloatBallService = PayFloatBallManager.a;
                if (iFloatBallService != null) {
                    iFloatBallService.setStateListener(PayFloatBallManager.g);
                }
                IFloatBallService iFloatBallService2 = PayFloatBallManager.a;
                if (iFloatBallService2 != null) {
                    String str = PayFloatBallManager.e;
                    String str2 = "";
                    if (str == null) {
                        str = "";
                    }
                    String str3 = PayFloatBallManager.f;
                    if (str3 != null) {
                        str2 = str3;
                    }
                    iFloatBallService2.setActivityInfo(str, str2);
                }
                pce.b("PayFloatBallManager AIDL服务绑定成功，已设置监听器和Activity信息");
            } catch (Exception e) {
                pce.c("PayFloatBallManager Binding error: " + e.getMessage());
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(@Nullable ComponentName name) {
            pce.b("PayFloatBallManager onServiceDisconnected");
            PayFloatBallManager.a = null;
            PayFloatBallManager.c = null;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/oplus/pay/opensdk/taskwall/manager/PayFloatBallManager$c", "Lcom/oplus/instant/router/callback/Callback;", "Lcom/oplus/instant/router/callback/Callback$Response;", "response", "", "onResponse", "paysdk_taskwall_release"}, k = 1, mv = {1, 8, 0})
    public static final class c extends Callback {
        public final /* synthetic */ rs9 a;

        public c(rs9 rs9Var) {
            this.a = rs9Var;
        }

        public void onResponse(@Nullable Callback.Response response) {
            if (response == null) {
                pce.c("PayFloatBallManager onResponse is null");
                rs9 rs9Var = this.a;
                if (rs9Var != null) {
                    rs9Var.fail(-1, "onResponse is null");
                    return;
                }
                return;
            }
            pce.f("PayFloatBallManager onResponse: " + response + ", code: " + response.getCode());
            if (response.getCode() == 1) {
                pce.f("PayFloatBallManager run game url success");
                rs9 rs9Var2 = this.a;
                if (rs9Var2 != null) {
                    rs9Var2.success();
                    return;
                }
                return;
            }
            pce.i("PayFloatBallManager run game fail code: " + response.getCode());
            rs9 rs9Var3 = this.a;
            if (rs9Var3 != null) {
                rs9Var3.fail(Integer.valueOf(response.getCode()), "fail launch status: " + response.getCode());
            }
        }
    }

    public static final void m() {
        FragmentActivity activity;
        try {
            IFloatBallService iFloatBallService = a;
            if (iFloatBallService != null) {
                iFloatBallService.setStateListener(null);
            }
        } catch (Exception e2) {
            pce.c("PayFloatBallManager 清理AIDL监听器失败: " + e2.getMessage());
        }
        if (d && b != null) {
            try {
                us9 us9Var = c;
                if (us9Var != null && (activity = us9Var.getActivity()) != null) {
                    ServiceConnection serviceConnection = b;
                    Intrinsics.checkNotNull(serviceConnection);
                    activity.unbindService(serviceConnection);
                }
                d = false;
            } catch (IllegalArgumentException e3) {
                pce.c("PayFloatBallManager Service unregister error: " + e3.getMessage());
            }
        }
        a = null;
        c = null;
        e = null;
        f = null;
    }

    public static final void o(Context context, Intent intent) {
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(intent, "$serviceIntent");
        try {
            ServiceConnection serviceConnection = b;
            Intrinsics.checkNotNull(serviceConnection);
            pce.b("PayFloatBallManager Binding attempted, result: " + context.bindService(intent, serviceConnection, 1));
        } catch (Exception e2) {
            pce.c("PayFloatBallManager Binding failed: " + e2.getMessage());
        }
    }

    @NotNull
    public final a k(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return !Settings.canDrawOverlays(context) ? new a.Failure("Do not have SYSTEM_ALERT_WINDOW permission") : new a.Success("has permission");
    }

    public final void l() {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.oplus.aiunit.vision.dce
            @Override // java.lang.Runnable
            public final void run() {
                PayFloatBallManager.m();
            }
        });
    }

    @NotNull
    public final a n(@NotNull FragmentActivity activity, @Nullable String packageName, @Nullable String remainingTime, @Nullable String url, @Nullable rs9 callback) {
        Intrinsics.checkNotNullParameter(activity, ParserTag.TAG_ACTIVITY);
        if (packageName == null || remainingTime == null) {
            return new a.Failure("Invalid arguments");
        }
        final Context applicationContext = activity.getApplicationContext();
        if (applicationContext == null) {
            return new a.Failure("Context is null");
        }
        e = activity.getPackageName();
        f = activity.getClass().getName();
        op.INSTANCE.b(activity);
        pce.b("PayFloatBallManager save activity info: package=" + e + ", class=" + f);
        if (k(applicationContext) instanceof a.Failure) {
            return new a.Failure("checkFloatBallPermission, Do not have permission or api is low");
        }
        if (url == null || url.length() == 0) {
            Intent launchIntentForPackage = applicationContext.getPackageManager().getLaunchIntentForPackage(packageName);
            if (launchIntentForPackage == null) {
                return new a.Failure("App not installed");
            }
            try {
                applicationContext.startActivity(launchIntentForPackage);
            } catch (Exception unused) {
                return new a.Failure("Failed to launch app");
            }
        } else {
            pce.b("PayFloatBallManager startInstantGame");
            q(applicationContext, url, callback);
        }
        final Intent intent = new Intent(applicationContext, (Class<?>) FloatingBallService.class);
        intent.putExtra("remaining_time", Integer.parseInt(remainingTime));
        intent.putExtra("target_packageName", packageName);
        try {
            applicationContext.startService(intent);
            pce.b("PayFloatBallManager Service started successfully");
            b = new b();
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.oplus.aiunit.vision.cce
                @Override // java.lang.Runnable
                public final void run() {
                    PayFloatBallManager.o(applicationContext, intent);
                }
            }, 500L);
            return !(url == null || url.length() == 0) ? new a.Success("Instant game and floating ball service started successfully") : new a.Success("APP and Floating ball service started successfully");
        } catch (Exception e2) {
            pce.c("PayFloatBallManager Failed to start service: " + e2.getMessage());
            return new a.Failure("Failed to start service");
        }
    }

    public final void p(@NotNull us9 fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        c = fragment;
    }

    public final void q(Context context, String url, rs9 callback) {
        pce.b("PayFloatBallManager startInstantGame URL: " + url);
        c cVar = new c(callback);
        try {
            i80 i80Var = i80.INSTANCE;
            String strValueOf = String.valueOf(i80Var.c(context, "route_id"));
            String strValueOf2 = String.valueOf(i80Var.c(context, "route_sign"));
            pce.b("PayFloatBallManager route_id: " + strValueOf + ";route_sign:" + strValueOf2);
            Instant.createBuilder(strValueOf, strValueOf2).setRequestUrl(url).setCallback(cVar).build().request(context);
            pce.b("PayFloatBallManager send request");
        } catch (Exception e2) {
            pce.c("PayFloatBallManager send request fail: " + e2.getMessage());
            if (callback != null) {
                callback.fail(-1, "Failed to call instant game SDK: " + e2.getMessage());
            }
        }
    }
}
