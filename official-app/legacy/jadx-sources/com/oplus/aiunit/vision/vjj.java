package com.oplus.aiunit.vision;

import android.os.Handler;
import android.os.Looper;
import com.heytap.log.formatter.LogFieldKey;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 /2\u00020\u0001:\u00010B\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0015¢\u0006\u0004\b-\u0010.J\u0019\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u0002H\u0096\u0001J\u0006\u0010\u0007\u001a\u00020\u0005J\b\u0010\b\u001a\u00020\u0005H\u0016J\u0012\u0010\n\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u000b\u001a\u00020\u0005H\u0016J\u001a\u0010\u000f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0010\u001a\u00020\u0005H\u0016J\b\u0010\u0011\u001a\u00020\u0005H\u0002J\b\u0010\u0012\u001a\u00020\u0005H\u0002J\b\u0010\u0013\u001a\u00020\u0005H\u0002J\u0012\u0010\u0014\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0002R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\"\u0010 \u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010(\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010,\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+¨\u00061"}, d2 = {"Lcom/oplus/aiunit/vision/vjj;", "Lcom/oplus/aiunit/vision/ms9;", "", "kotlin.jvm.PlatformType", "p0", "", "l3", "f", "onLoginSuccess", "msg", "h1", "q6", "", "errorCode", "errorMsg", "Q6", "onLogout", MapSchema.FIELD_NAME_ENTRY, "d", "b", "c", "Lcom/oplus/aiunit/vision/x3h;", "i", "Lcom/oplus/aiunit/vision/x3h;", "simpleLoginListener", "", "j", "J", "getNetQueryStartTime", "()J", "setNetQueryStartTime", "(J)V", "netQueryStartTime", "Landroid/os/Handler;", MapSchema.FIELD_NAME_KEY, "Landroid/os/Handler;", "handler", "", LogFieldKey.LEVEL_KEY, "Z", "hasResponded", "Ljava/lang/Runnable;", LogFieldKey.MESSAGE_KEY, "Ljava/lang/Runnable;", "timeoutRunnable", "<init>", "(Lcom/oplus/aiunit/vision/x3h;)V", "Companion", "a", "Health-6.4.4_03460bd_260624_OPlusRelease"}, k = 1, mv = {1, 8, 0})
public final class vjj implements ms9 {

    @NotNull
    public static final String TAG = "SyncUserInfoController";

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final x3h simpleLoginListener;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public long netQueryStartTime;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final Handler handler;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public volatile boolean hasResponded;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final Runnable timeoutRunnable;

    public vjj(@NotNull x3h simpleLoginListener) {
        Intrinsics.checkNotNullParameter(simpleLoginListener, "simpleLoginListener");
        this.simpleLoginListener = simpleLoginListener;
        this.handler = new Handler(Looper.getMainLooper());
        this.timeoutRunnable = new Runnable() { // from class: com.oplus.aiunit.vision.ujj
            @Override // java.lang.Runnable
            public final void run() {
                vjj.g(this.i);
            }
        };
    }

    public static final void g(vjj this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.hasResponded) {
            return;
        }
        this$0.hasResponded = true;
        long jCurrentTimeMillis = System.currentTimeMillis() - this$0.netQueryStartTime;
        a7b.m(TAG, "syncUserInfo timeout after " + jCurrentTimeMillis + "ms, fallback to tourist");
        um.c().o(this$0);
        this$0.simpleLoginListener.h1("Login timeout after " + jCurrentTimeMillis + "ms");
    }

    @Override // com.oplus.aiunit.vision.ms9
    public void Q6(int errorCode, @Nullable String errorMsg) {
        c(errorMsg + "," + errorCode);
    }

    public final void b() {
        this.handler.removeCallbacks(this.timeoutRunnable);
    }

    public final void c(String msg) {
        if (this.hasResponded) {
            return;
        }
        this.hasResponded = true;
        b();
        a7b.f(TAG, "onLoginFailed cost:" + (System.currentTimeMillis() - this.netQueryStartTime));
        um.c().o(this);
        this.simpleLoginListener.h1(msg);
    }

    public final void d() {
        if (this.hasResponded) {
            return;
        }
        this.hasResponded = true;
        b();
        a7b.f(TAG, "onLoginSuccess cost:" + (System.currentTimeMillis() - this.netQueryStartTime));
        um.c().o(this);
        this.simpleLoginListener.onLoginSuccess();
    }

    public final void e() {
        um.c().m();
    }

    public final void f() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        a7b.f(TAG, "syncUserInfo start");
        e();
        a7b.f(TAG, "syncUserInfo account init cost:" + (System.currentTimeMillis() - jCurrentTimeMillis));
        this.netQueryStartTime = System.currentTimeMillis();
        um.c().u(this);
        this.handler.postDelayed(this.timeoutRunnable, 5000L);
        if (um.c().x()) {
            um.c().w();
        } else {
            c("user is not Login, do nothing");
        }
    }

    @Override // com.oplus.aiunit.vision.ms9
    public void h1(@Nullable String msg) {
        c(msg);
    }

    @Override // com.oplus.aiunit.vision.ms9
    public void l3(String p0) {
        this.simpleLoginListener.l3(p0);
    }

    @Override // com.oplus.aiunit.vision.ms9
    public void onLoginSuccess() {
        d();
    }

    @Override // com.oplus.aiunit.vision.ms9
    public void onLogout() {
        c("onLogout");
    }

    @Override // com.oplus.aiunit.vision.ms9
    public void q6() {
        c("account call login cancel");
    }
}
