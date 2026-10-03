package com.oplus.channel.server.factory;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import com.oplus.channel.server.factory.AlwaysPuller$connection$1;
import com.oplus.channel.server.utils.LogUtil;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\t"}, d2 = {"com/oplus/channel/server/factory/AlwaysPuller$connection$1", "Landroid/content/ServiceConnection;", "onServiceConnected", "", "name", "Landroid/content/ComponentName;", "service", "Landroid/os/IBinder;", "onServiceDisconnected", "server_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class AlwaysPuller$connection$1 implements ServiceConnection {
    final /* synthetic */ AlwaysPuller this$0;

    public AlwaysPuller$connection$1(AlwaysPuller alwaysPuller) {
        this.this$0 = alwaysPuller;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onServiceDisconnected$lambda-0, reason: not valid java name */
    public static final void m5170onServiceDisconnected$lambda0(AlwaysPuller this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.isDestroyed || !this$0.getClientConfig().getNeedKeepAlive()) {
            return;
        }
        this$0.rebindClient();
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(@Nullable ComponentName name, @Nullable IBinder service) {
        LogUtil.i(AlwaysPuller.TAG, "onServiceConnected name=[" + name + "], clientName=" + this.this$0.getClientName() + ", service=[" + service + "], rebindCount=" + this.this$0.rebindCount);
        this.this$0.rebindCount = 0;
        this.this$0.checkRebindCount = 0;
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(@Nullable ComponentName name) {
        LogUtil.i(AlwaysPuller.TAG, "onServiceDisconnected name=[" + name + "], clientName=" + this.this$0.getClientName() + ", rebindCount=" + this.this$0.rebindCount);
        if (this.this$0.rebindCount > 5) {
            LogUtil.d(AlwaysPuller.TAG, "onServiceDisconnected: reach the max rebind count, return");
            return;
        }
        Handler handler = this.this$0.handler;
        if (handler != null) {
            final AlwaysPuller alwaysPuller = this.this$0;
            handler.postDelayed(new Runnable() { // from class: com.oplus.aiunit.vision.g10
                @Override // java.lang.Runnable
                public final void run() {
                    AlwaysPuller$connection$1.m5170onServiceDisconnected$lambda0(alwaysPuller);
                }
            }, ((long) this.this$0.rebindCount) * 2000);
        }
        this.this$0.rebindCount++;
        this.this$0.checkRebindCount = 0;
        this.this$0.checkRebindClient();
    }
}
