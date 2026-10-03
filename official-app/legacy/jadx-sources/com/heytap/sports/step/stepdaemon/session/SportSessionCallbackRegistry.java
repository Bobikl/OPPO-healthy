package com.heytap.sports.step.stepdaemon.session;

import android.os.IBinder;
import android.os.RemoteException;
import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.sports.record.details.RecordDetailsInstructionActivity;
import com.heytap.sports.step.daemon.ISportSessionCallback;
import com.heytap.sports.step.stepdaemon.session.SportSessionCallbackRegistry;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.oea;
import io.protostuff.MapSchema;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001e\u0010\u0015J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\b\u001a\u00020\u0006J\u0006\u0010\n\u001a\u00020\tJ\u0016\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fJ\u0006\u0010\u000f\u001a\u00020\u0006J\b\u0010\u0010\u001a\u00020\u0006H\u0002R\u001a\u0010\u0016\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u0012\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0019R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/heytap/sports/step/stepdaemon/session/SportSessionCallbackRegistry;", "", "", RecordDetailsInstructionActivity.KEY_SPORT_MODE, "Lcom/heytap/sports/step/daemon/ISportSessionCallback;", oea.CALLBACK, "", MapSchema.FIELD_NAME_ENTRY, b2n.g, "", "d", "step", "", "sensorTimeNs", "c", "b", b2n.f, "Lkotlinx/coroutines/CoroutineScope;", "a", "Lkotlinx/coroutines/CoroutineScope;", "getStepWorkerScope$annotations", "()V", "stepWorkerScope", "Lcom/heytap/sports/step/daemon/ISportSessionCallback;", "activeCallback", "I", "activeSportMode", "Landroid/os/IBinder$DeathRecipient;", "Landroid/os/IBinder$DeathRecipient;", "deathRecipient", "<init>", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
public final class SportSessionCallbackRegistry {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public static volatile ISportSessionCallback activeCallback;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public static IBinder.DeathRecipient deathRecipient;

    @NotNull
    public static final SportSessionCallbackRegistry INSTANCE = new SportSessionCallbackRegistry();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final CoroutineScope stepWorkerScope = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getIO().limitedParallelism(1)).plus(new CoroutineName("SportStepWorker")));

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static volatile int activeSportMode = -1;
    public static final int $stable = 8;

    public static final void f(SportSessionCallbackRegistry this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        a7b.m("SportSessionCbRegistry", "binderDied: main process callback lost (sportMode=" + activeSportMode + ")");
        synchronized (this$0) {
            activeCallback = null;
            activeSportMode = -1;
            deathRecipient = null;
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void b() {
        ISportSessionCallback iSportSessionCallback = activeCallback;
        if (iSportSessionCallback == null) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(stepWorkerScope, null, null, new SportSessionCallbackRegistry$dispatchStepClean$1(iSportSessionCallback, null), 3, null);
    }

    public final void c(int step, long sensorTimeNs) {
        ISportSessionCallback iSportSessionCallback = activeCallback;
        if (iSportSessionCallback == null) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(stepWorkerScope, null, null, new SportSessionCallbackRegistry$dispatchStepUpdate$1(iSportSessionCallback, step, sensorTimeNs, null), 3, null);
    }

    public final boolean d() {
        return activeCallback != null;
    }

    public final synchronized void e(int sportMode, @NotNull ISportSessionCallback cb) {
        Intrinsics.checkNotNullParameter(cb, "cb");
        if (activeCallback != null) {
            a7b.m("SportSessionCbRegistry", "register: replacing previous callback (was sportMode=" + activeSportMode + ")");
            g();
            activeCallback = null;
        }
        IBinder iBinderAsBinder = cb.asBinder();
        IBinder.DeathRecipient deathRecipient2 = new IBinder.DeathRecipient() { // from class: com.oplus.aiunit.vision.ngi
            @Override // android.os.IBinder.DeathRecipient
            public final void binderDied() {
                SportSessionCallbackRegistry.f(this.a);
            }
        };
        try {
            iBinderAsBinder.linkToDeath(deathRecipient2, 0);
            activeCallback = cb;
            activeSportMode = sportMode;
            deathRecipient = deathRecipient2;
            a7b.f("SportSessionCbRegistry", "register: sportMode=" + sportMode + " binder=" + iBinderAsBinder);
        } catch (RemoteException e2) {
            a7b.b("SportSessionCbRegistry", "register: linkToDeath failed: " + e2.getMessage());
        }
    }

    public final synchronized void g() {
        ISportSessionCallback iSportSessionCallback = activeCallback;
        if (iSportSessionCallback == null) {
            return;
        }
        IBinder.DeathRecipient deathRecipient2 = deathRecipient;
        if (deathRecipient2 == null) {
            return;
        }
        try {
            iSportSessionCallback.asBinder().unlinkToDeath(deathRecipient2, 0);
        } catch (Throwable unused) {
        }
        deathRecipient = null;
    }

    public final synchronized void h() {
        if (activeCallback == null) {
            return;
        }
        g();
        a7b.f("SportSessionCbRegistry", "unregister: sportMode=" + activeSportMode);
        activeCallback = null;
        activeSportMode = -1;
    }
}
