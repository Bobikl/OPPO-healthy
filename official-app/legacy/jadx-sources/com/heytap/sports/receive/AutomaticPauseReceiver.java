package com.heytap.sports.receive;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.sport.moving.MoveLifecycleManager;
import com.heytap.sports.domain.SportSessionManager;
import com.heytap.sports.move.moving.MovingActivity;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.op;
import com.oplus.aiunit.vision.pgi;
import com.oplus.aiunit.vision.v9i;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\f"}, d2 = {"Lcom/heytap/sports/receive/AutomaticPauseReceiver;", "Landroid/content/BroadcastReceiver;", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "", "onReceive", "<init>", "()V", "Companion", "a", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
public final class AutomaticPauseReceiver extends BroadcastReceiver {
    public static final int $stable = 0;

    @NotNull
    public static final String ACTION_DO_AUTO_FINISH = "action_do_auto_finish";

    @NotNull
    public static final String ACTION_DO_AUTO_PAUSE = "action_do_auto_pause";

    @NotNull
    public static final String ACTION_PAUSE_CHECK = "action_pause_check";

    @NotNull
    public static final String TAG = "AutomaticPauseReceiver";

    @Override // android.content.BroadcastReceiver
    public void onReceive(@NotNull Context context, @NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        try {
            if (!op.n().c(MovingActivity.class)) {
                v9i.a(context);
                return;
            }
            SportSessionManager sportSessionManagerA = pgi.a();
            if (sportSessionManagerA == null) {
                v9i.a(context);
                return;
            }
            String action = intent.getAction();
            if (action != null) {
                int iHashCode = action.hashCode();
                if (iHashCode == -1995724648) {
                    if (action.equals(ACTION_DO_AUTO_FINISH)) {
                        sportSessionManagerA.U();
                    }
                } else {
                    if (iHashCode == -1403528970) {
                        if (action.equals(ACTION_PAUSE_CHECK) && !MoveLifecycleManager.INSTANCE.q()) {
                            sportSessionManagerA.C();
                            return;
                        }
                        return;
                    }
                    if (iHashCode == 1884288337 && action.equals(ACTION_DO_AUTO_PAUSE) && !MoveLifecycleManager.INSTANCE.q()) {
                        sportSessionManagerA.T();
                    }
                }
            }
        } catch (Exception e2) {
            a7b.b(TAG, e2.toString());
        }
    }
}
