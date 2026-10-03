package com.heytap.device.data.utils;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.IntentFilter;
import android.os.PowerManager;
import com.heytap.health.protocol.fitness.FitnessProto$ScreenState;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.ap6;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.b78;
import com.oplus.aiunit.vision.gl4;
import com.oplus.aiunit.vision.rdf;
import com.oplus.aiunit.vision.ys;
import com.oplus.aiunit.vision.zq0;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/heytap/device/data/utils/a;", "", "Companion", "a", "b", "device_data_sync_impl_release"}, k = 1, mv = {1, 8, 0})
public final class a {

    @NotNull
    public static final String TAG = "PhoneScreenStateHelper";
    public static volatile boolean b = false;
    public static final int screenOff = 3;
    public static final int screenOnAndLocked = 1;
    public static final int screenOnAndUnlocked = 2;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static ScreenBroadcastReceiver a = new ScreenBroadcastReceiver();

    /* JADX INFO: renamed from: com.heytap.device.data.utils.a$a, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0006\u001a\u00020\u0004H\u0007J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0007J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0007J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010\r\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\u0010\u001a\u00020\u0004H\u0002J\b\u0010\u0011\u001a\u00020\u0004H\u0002R\u0014\u0010\u0013\u001a\u00020\u00128\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001b¨\u0006 "}, d2 = {"Lcom/heytap/device/data/utils/a$a;", "", "", "state", "", b2n.f, "f", "Landroid/content/Context;", "context", MapSchema.FIELD_NAME_ENTRY, "j", "", "a", "b", "d", "c", b2n.g, "i", "", "TAG", "Ljava/lang/String;", "isRegistered", "Z", "Lcom/heytap/device/data/utils/ScreenBroadcastReceiver;", "mScreenReceiver", "Lcom/heytap/device/data/utils/ScreenBroadcastReceiver;", "screenOff", "I", "screenOnAndLocked", "screenOnAndUnlocked", "<init>", "()V", "device_data_sync_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a(Context context) {
            Object systemService = context.getSystemService("keyguard");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.KeyguardManager");
            return ((KeyguardManager) systemService).isKeyguardLocked();
        }

        public final boolean b(Context context) {
            Object systemService = context.getSystemService("power");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.os.PowerManager");
            return ((PowerManager) systemService).isInteractive();
        }

        public final boolean c(Context context) {
            return a(context) && b(context);
        }

        public final boolean d(Context context) {
            return !a(context) && b(context);
        }

        @JvmStatic
        public final void e(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            rdf.a(context, a.a, intentFilter, 4);
            a.b = true;
            h();
            a7b.f(a.TAG, "register screen broadcast");
        }

        @JvmStatic
        public final void f() {
            int i;
            Context context = b78.a();
            Intrinsics.checkNotNullExpressionValue(context, "context");
            if (d(context)) {
                i = 2;
            } else {
                i = c(context) ? 1 : 3;
            }
            g(i);
        }

        @JvmStatic
        public final void g(int state) {
            a7b.f(a.TAG, "send phone screen state to device = " + state);
            if (!gl4.managerApi.isCurrentConnected()) {
                a7b.f(a.TAG, "device disConnected");
            } else {
                zq0.w().R(new MessageEvent(5, 165, FitnessProto$ScreenState.newBuilder().setState(state).build().toByteArray()));
            }
        }

        public final void h() {
            b.INSTANCE.a();
        }

        public final void i() {
            b.INSTANCE.b();
        }

        @JvmStatic
        public final void j(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            i();
            if (a.b) {
                rdf.c(context, a.a);
                a.b = false;
                a7b.f(a.TAG, "unRegister screen broadcast");
            }
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0016R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/heytap/device/data/utils/a$b;", "Ljava/lang/Runnable;", "", "a", "b", "run", "Lcom/oplus/aiunit/vision/ys;", "i", "Lcom/oplus/aiunit/vision/ys;", "alarmScheduler", "", "j", "J", "PHONE_STATE_INTERVAL", "<init>", "()V", "device_data_sync_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class b implements Runnable {

        @NotNull
        public static final b INSTANCE;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        @Nullable
        public static ys alarmScheduler;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        public static final long PHONE_STATE_INTERVAL;

        static {
            b bVar = new b();
            INSTANCE = bVar;
            PHONE_STATE_INTERVAL = ap6.CDP_MIN_MANUAL_SYNC_TIME_INTERVAL;
            ys ysVar = new ys(b78.a(), a.TAG, ap6.CDP_MIN_MANUAL_SYNC_TIME_INTERVAL);
            alarmScheduler = ysVar;
            ysVar.j(bVar);
        }

        public final synchronized void a() {
            a7b.f(a.TAG, "start to unregister screen broadcast alarm");
            ys ysVar = alarmScheduler;
            if (ysVar != null) {
                ysVar.m();
            }
            ys ysVar2 = alarmScheduler;
            if (ysVar2 != null) {
                ysVar2.l();
            }
        }

        public final synchronized void b() {
            ys ysVar = alarmScheduler;
            if (ysVar != null) {
                ysVar.m();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            a7b.f(a.TAG, "Alarm stop unregister screen broadcast");
            Companion companion = a.INSTANCE;
            Context contextA = b78.a();
            Intrinsics.checkNotNullExpressionValue(contextA, "getAppContext()");
            companion.j(contextA);
        }
    }

    @JvmStatic
    public static final void d(@NotNull Context context) {
        INSTANCE.e(context);
    }

    @JvmStatic
    public static final void e() {
        INSTANCE.f();
    }

    @JvmStatic
    public static final void f(@NotNull Context context) {
        INSTANCE.j(context);
    }
}
