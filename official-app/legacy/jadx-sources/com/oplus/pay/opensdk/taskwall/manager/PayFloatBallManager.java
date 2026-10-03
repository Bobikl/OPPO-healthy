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
import com.heytap.health.watch.netnumber.callinterception.AbsCallInterceptionHandlerKt;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.gp;
import com.oplus.aiunit.vision.lr9;
import com.oplus.aiunit.vision.or9;
import com.oplus.aiunit.vision.qae;
import com.oplus.aiunit.vision.y70;
import com.oplus.instant.router.Instant;
import com.oplus.instant.router.callback.Callback;
import com.oplus.pay.opensdk.taskwall.floatwindow.FloatingBallService;
import com.oplus.pay.opensdk.taskwall.floatwindow.IFloatBallService;
import com.oplus.pay.opensdk.taskwall.manager.PayFloatBallManager;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000U\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\b\u0007*\u0001)\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0016B\t\b\u0002¢\u0006\u0004\b-\u0010.J8\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bJ\u000e\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fJ\u000e\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010J\"\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002J\b\u0010\u0014\u001a\u00020\u000eH\u0002R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010&\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010(\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010%R\u0014\u0010,\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006/"}, d2 = {"Lcom/oplus/pay/opensdk/taskwall/manager/PayFloatBallManager;", "", "Landroidx/fragment/app/FragmentActivity;", "activity", "", "packageName", "remainingTime", "url", "Lcom/oplus/aiunit/vision/lr9;", "callback", "Lcom/oplus/pay/opensdk/taskwall/manager/PayFloatBallManager$a;", "n", "Lcom/oplus/aiunit/vision/or9;", "fragment", "", LogFieldKey.PROCESS_NAME_KEY, "Landroid/content/Context;", "context", MapSchema.FIELD_NAME_KEY, "q", LogFieldKey.LEVEL_KEY, "Lcom/oplus/pay/opensdk/taskwall/floatwindow/IFloatBallService;", "a", "Lcom/oplus/pay/opensdk/taskwall/floatwindow/IFloatBallService;", "floatingBallService", "Landroid/content/ServiceConnection;", "b", "Landroid/content/ServiceConnection;", "serviceConnection", "c", "Lcom/oplus/aiunit/vision/or9;", "mFragment", "", "d", "Z", "isServiceBound", MapSchema.FIELD_NAME_ENTRY, "Ljava/lang/String;", "currentActivityPackageName", "f", "currentActivityClassName", "com/oplus/pay/opensdk/taskwall/manager/PayFloatBallManager$defaultListener$1", b2n.f, "Lcom/oplus/pay/opensdk/taskwall/manager/PayFloatBallManager$defaultListener$1;", "defaultListener", "<init>", "()V", "paysdk_taskwall_release"}, k = 1, mv = {1, 8, 0})
public final class PayFloatBallManager {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public static IFloatBallService floatingBallService;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public static ServiceConnection serviceConnection;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public static or9 mFragment;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public static boolean isServiceBound;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public static String currentActivityPackageName;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public static String currentActivityClassName;

    @NotNull
    public static final PayFloatBallManager INSTANCE = new PayFloatBallManager();

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public static final PayFloatBallManager$defaultListener$1 defaultListener = new PayFloatBallManager$defaultListener$1();

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/oplus/pay/opensdk/taskwall/manager/PayFloatBallManager$a;", "", "<init>", "()V", "a", "b", "Lcom/oplus/pay/opensdk/taskwall/manager/PayFloatBallManager$a$a;", "Lcom/oplus/pay/opensdk/taskwall/manager/PayFloatBallManager$a$b;", "paysdk_taskwall_release"}, k = 1, mv = {1, 8, 0})
    public static abstract class a {

        /* JADX INFO: renamed from: com.oplus.pay.opensdk.taskwall.manager.PayFloatBallManager$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/oplus/pay/opensdk/taskwall/manager/PayFloatBallManager$a$a;", "Lcom/oplus/pay/opensdk/taskwall/manager/PayFloatBallManager$a;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "message", "<init>", "(Ljava/lang/String;)V", "paysdk_taskwall_release"}, k = 1, mv = {1, 8, 0})
        public static final /* data */ class Failure extends a {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
            @NotNull
            public final String message;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Failure(@NotNull String message) {
                super(null);
                Intrinsics.checkNotNullParameter(message, "message");
                this.message = message;
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

            /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
            @NotNull
            public final String message;

            /* JADX WARN: Multi-variable type inference failed */
            public Success() {
                this(null, 1, 0 == true ? 1 : 0);
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
            public Success(@NotNull String message) {
                super(null);
                Intrinsics.checkNotNullParameter(message, "message");
                this.message = message;
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

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010\b\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/oplus/pay/opensdk/taskwall/manager/PayFloatBallManager$b", "Landroid/content/ServiceConnection;", "Landroid/content/ComponentName;", "name", "Landroid/os/IBinder;", "service", "", "onServiceConnected", "onServiceDisconnected", "paysdk_taskwall_release"}, k = 1, mv = {1, 8, 0})
    public static final class b implements ServiceConnection {
        @Override // android.content.ServiceConnection
        public void onServiceConnected(@Nullable ComponentName name, @Nullable IBinder service) {
            qae.b("PayFloatBallManager onServiceConnected: service = " + service);
            try {
                PayFloatBallManager payFloatBallManager = PayFloatBallManager.INSTANCE;
                PayFloatBallManager.floatingBallService = IFloatBallService.Stub.asInterface(service);
                if (PayFloatBallManager.floatingBallService == null) {
                    qae.c("PayFloatBallManager AIDL interface creation failed");
                    return;
                }
                IFloatBallService iFloatBallService = PayFloatBallManager.floatingBallService;
                if (iFloatBallService != null) {
                    iFloatBallService.setStateListener(PayFloatBallManager.defaultListener);
                }
                IFloatBallService iFloatBallService2 = PayFloatBallManager.floatingBallService;
                if (iFloatBallService2 != null) {
                    String str = PayFloatBallManager.currentActivityPackageName;
                    String str2 = "";
                    if (str == null) {
                        str = "";
                    }
                    String str3 = PayFloatBallManager.currentActivityClassName;
                    if (str3 != null) {
                        str2 = str3;
                    }
                    iFloatBallService2.setActivityInfo(str, str2);
                }
                qae.b("PayFloatBallManager AIDL服务绑定成功，已设置监听器和Activity信息");
            } catch (Exception e2) {
                qae.c("PayFloatBallManager Binding error: " + e2.getMessage());
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(@Nullable ComponentName name) {
            qae.b("PayFloatBallManager onServiceDisconnected");
            PayFloatBallManager.floatingBallService = null;
            PayFloatBallManager.mFragment = null;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/oplus/pay/opensdk/taskwall/manager/PayFloatBallManager$c", "Lcom/oplus/instant/router/callback/Callback;", "Lcom/oplus/instant/router/callback/Callback$Response;", AbsCallInterceptionHandlerKt.GSON_KEY_RESPONSE, "", "onResponse", "paysdk_taskwall_release"}, k = 1, mv = {1, 8, 0})
    public static final class c extends Callback {
        public final /* synthetic */ lr9 a;

        public c(lr9 lr9Var) {
            this.a = lr9Var;
        }

        @Override // com.oplus.instant.router.callback.Callback
        public void onResponse(@Nullable Callback.Response response) {
            if (response == null) {
                qae.c("PayFloatBallManager onResponse is null");
                lr9 lr9Var = this.a;
                if (lr9Var != null) {
                    lr9Var.fail(-1, "onResponse is null");
                    return;
                }
                return;
            }
            qae.f("PayFloatBallManager onResponse: " + response + ", code: " + response.getCode());
            if (response.getCode() == 1) {
                qae.f("PayFloatBallManager run game url success");
                lr9 lr9Var2 = this.a;
                if (lr9Var2 != null) {
                    lr9Var2.success();
                    return;
                }
                return;
            }
            qae.i("PayFloatBallManager run game fail code: " + response.getCode());
            lr9 lr9Var3 = this.a;
            if (lr9Var3 != null) {
                lr9Var3.fail(Integer.valueOf(response.getCode()), "fail launch status: " + response.getCode());
            }
        }
    }

    public static final void m() {
        FragmentActivity activity;
        try {
            IFloatBallService iFloatBallService = floatingBallService;
            if (iFloatBallService != null) {
                iFloatBallService.setStateListener(null);
            }
        } catch (Exception e2) {
            qae.c("PayFloatBallManager 清理AIDL监听器失败: " + e2.getMessage());
        }
        if (isServiceBound && serviceConnection != null) {
            try {
                or9 or9Var = mFragment;
                if (or9Var != null && (activity = or9Var.getActivity()) != null) {
                    ServiceConnection serviceConnection2 = serviceConnection;
                    Intrinsics.checkNotNull(serviceConnection2);
                    activity.unbindService(serviceConnection2);
                }
                isServiceBound = false;
            } catch (IllegalArgumentException e3) {
                qae.c("PayFloatBallManager Service unregister error: " + e3.getMessage());
            }
        }
        floatingBallService = null;
        mFragment = null;
        currentActivityPackageName = null;
        currentActivityClassName = null;
    }

    public static final void o(Context context, Intent serviceIntent) {
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(serviceIntent, "$serviceIntent");
        try {
            ServiceConnection serviceConnection2 = serviceConnection;
            Intrinsics.checkNotNull(serviceConnection2);
            qae.b("PayFloatBallManager Binding attempted, result: " + context.bindService(serviceIntent, serviceConnection2, 1));
        } catch (Exception e2) {
            qae.c("PayFloatBallManager Binding failed: " + e2.getMessage());
        }
    }

    @NotNull
    public final a k(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return !Settings.canDrawOverlays(context) ? new a.Failure("Do not have SYSTEM_ALERT_WINDOW permission") : new a.Success("has permission");
    }

    public final void l() {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.oplus.aiunit.vision.eae
            @Override // java.lang.Runnable
            public final void run() {
                PayFloatBallManager.m();
            }
        });
    }

    @NotNull
    public final a n(@NotNull FragmentActivity activity, @Nullable String packageName, @Nullable String remainingTime, @Nullable String url, @Nullable lr9 callback) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (packageName == null || remainingTime == null) {
            return new a.Failure("Invalid arguments");
        }
        final Context applicationContext = activity.getApplicationContext();
        if (applicationContext == null) {
            return new a.Failure("Context is null");
        }
        currentActivityPackageName = activity.getPackageName();
        currentActivityClassName = activity.getClass().getName();
        gp.INSTANCE.b(activity);
        qae.b("PayFloatBallManager save activity info: package=" + currentActivityPackageName + ", class=" + currentActivityClassName);
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
            qae.b("PayFloatBallManager startInstantGame");
            q(applicationContext, url, callback);
        }
        final Intent intent = new Intent(applicationContext, (Class<?>) FloatingBallService.class);
        intent.putExtra("remaining_time", Integer.parseInt(remainingTime));
        intent.putExtra("target_packageName", packageName);
        try {
            applicationContext.startService(intent);
            qae.b("PayFloatBallManager Service started successfully");
            serviceConnection = new b();
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.oplus.aiunit.vision.dae
                @Override // java.lang.Runnable
                public final void run() {
                    PayFloatBallManager.o(applicationContext, intent);
                }
            }, 500L);
            return !(url == null || url.length() == 0) ? new a.Success("Instant game and floating ball service started successfully") : new a.Success("APP and Floating ball service started successfully");
        } catch (Exception e2) {
            qae.c("PayFloatBallManager Failed to start service: " + e2.getMessage());
            return new a.Failure("Failed to start service");
        }
    }

    public final void p(@NotNull or9 fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        mFragment = fragment;
    }

    public final void q(Context context, String url, lr9 callback) {
        qae.b("PayFloatBallManager startInstantGame URL: " + url);
        c cVar = new c(callback);
        try {
            y70 y70Var = y70.INSTANCE;
            String strValueOf = String.valueOf(y70Var.c(context, "route_id"));
            String strValueOf2 = String.valueOf(y70Var.c(context, "route_sign"));
            qae.b("PayFloatBallManager route_id: " + strValueOf + ";route_sign:" + strValueOf2);
            Instant.createBuilder(strValueOf, strValueOf2).setRequestUrl(url).setCallback(cVar).build().request(context);
            qae.b("PayFloatBallManager send request");
        } catch (Exception e2) {
            qae.c("PayFloatBallManager send request fail: " + e2.getMessage());
            if (callback != null) {
                callback.fail(-1, "Failed to call instant game SDK: " + e2.getMessage());
            }
        }
    }
}
