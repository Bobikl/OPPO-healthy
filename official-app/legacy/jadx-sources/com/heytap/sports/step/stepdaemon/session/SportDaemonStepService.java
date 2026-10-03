package com.heytap.sports.step.stepdaemon.session;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.Process;
import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.sports.step.daemon.ISportDaemonStepService;
import com.heytap.sports.step.daemon.ISportSessionCallback;
import com.oplus.aiunit.vision.a7b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000#\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\t*\u0001\t\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010\b\u001a\u00020\u0002H\u0016R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u0011"}, d2 = {"Lcom/heytap/sports/step/stepdaemon/session/SportDaemonStepService;", "Landroid/app/Service;", "", "onCreate", "Landroid/content/Intent;", "intent", "Landroid/os/IBinder;", "onBind", "onDestroy", "com/heytap/sports/step/stepdaemon/session/SportDaemonStepService$stub$1", "i", "Lcom/heytap/sports/step/stepdaemon/session/SportDaemonStepService$stub$1;", "stub", "<init>", "()V", "Companion", "a", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
public final class SportDaemonStepService extends Service {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final SportDaemonStepService$stub$1 stub = new ISportDaemonStepService.Stub() { // from class: com.heytap.sports.step.stepdaemon.session.SportDaemonStepService$stub$1
        @Override // com.heytap.sports.step.daemon.ISportDaemonStepService
        public void registerSessionCallback(int sportMode, @Nullable ISportSessionCallback cb) {
            if (cb == null) {
                a7b.m("SportDaemonStepService", "registerSessionCallback: null cb ignored");
            } else {
                SportSessionCallbackRegistry.INSTANCE.e(sportMode, cb);
            }
        }

        @Override // com.heytap.sports.step.daemon.ISportDaemonStepService
        public void unregisterSessionCallback() {
            SportSessionCallbackRegistry.INSTANCE.h();
        }
    };

    @Override // android.app.Service
    @NotNull
    public IBinder onBind(@Nullable Intent intent) {
        return this.stub;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        a7b.f("SportDaemonStepService", "onCreate pid=" + Process.myPid());
    }

    @Override // android.app.Service
    public void onDestroy() {
        a7b.f("SportDaemonStepService", "onDestroy pid=" + Process.myPid());
        super.onDestroy();
    }
}
