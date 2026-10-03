package com.oplus.aiunit.vision;

import android.os.IBinder;
import org.hapjs.features.channel.ChannelService;

/* JADX INFO: loaded from: classes.dex */
public class zkm implements IBinder.DeathRecipient {
    public final /* synthetic */ dum a;
    public final /* synthetic */ ChannelService b;

    public zkm(ChannelService channelService, dum dumVar) {
        this.b = channelService;
        this.a = dumVar;
    }

    @Override // android.os.IBinder.DeathRecipient
    public void binderDied() {
        if (this.b.f20755c.hasMessages(-2) || this.b.f20755c.hasMessages(-3)) {
            return;
        }
        this.b.f20755c.obtainMessage(-1, this.a.f11683l).sendToTarget();
    }
}
