package pantanal.decision;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import com.oplus.aiunit.vision.bs9;
import com.oplus.aiunit.vision.t6e;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import pantanal.decision.BindClientHelper$connection$1;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\t"}, d2 = {"pantanal/decision/BindClientHelper$connection$1", "Landroid/content/ServiceConnection;", "onServiceConnected", "", "name", "Landroid/content/ComponentName;", "service", "Landroid/os/IBinder;", "onServiceDisconnected", "service-decision_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class BindClientHelper$connection$1 implements ServiceConnection {
    final /* synthetic */ BindClientHelper this$0;

    public BindClientHelper$connection$1(BindClientHelper bindClientHelper) {
        this.this$0 = bindClientHelper;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onServiceDisconnected$lambda$0(BindClientHelper this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        bs9.a.c(t6e.INSTANCE, "UmsClientHelper", "onServiceDisconnected: retry bind ums client, rebindCount=" + this$0.rebindCount, false, null, false, 0, false, null, 252, null);
        this$0.bindUmsClient(this$0.context);
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(@Nullable ComponentName name, @Nullable IBinder service) {
        bs9.a.c(t6e.INSTANCE, "UmsClientHelper", "onServiceConnected name=[" + name + "], service=[" + service + "], rebindCount=" + this.this$0.rebindCount, false, null, false, 0, false, null, 252, null);
        this.this$0.setBound(true);
        this.this$0.rebindCount = 0;
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(@Nullable ComponentName name) {
        t6e t6eVar = t6e.INSTANCE;
        bs9.a.c(t6eVar, "UmsClientHelper", "onServiceDisconnected rebindCount=" + this.this$0.rebindCount + ", isDestroyed=" + this.this$0.isDestroyed + ", listSize=" + this.this$0.getListSize() + ", name=[" + name + "]", false, null, false, 0, false, null, 252, null);
        if (this.this$0.rebindCount > 3) {
            this.this$0.setBound(false);
            bs9.a.c(t6eVar, "UmsClientHelper", "onServiceDisconnected: reach the max rebind count, return", false, null, false, 0, false, null, 252, null);
            return;
        }
        if (!this.this$0.isDestroyed && this.this$0.getListSize() > 0) {
            Handler retryHandler = this.this$0.getRetryHandler();
            final BindClientHelper bindClientHelper = this.this$0;
            retryHandler.postDelayed(new Runnable() { // from class: com.oplus.aiunit.vision.ce1
                @Override // java.lang.Runnable
                public final void run() {
                    BindClientHelper$connection$1.onServiceDisconnected$lambda$0(bindClientHelper);
                }
            }, ((long) this.this$0.rebindCount) * 2000);
            this.this$0.rebindCount++;
        }
        this.this$0.setBound(false);
    }
}
