package com.oplus.aiunit.vision;

import android.os.IBinder;
import android.os.Messenger;
import org.hapjs.features.channel.ChannelService;

/* JADX INFO: loaded from: classes.dex */
public class nqm extends ehm {
    public final /* synthetic */ dum a;
    public final /* synthetic */ Messenger b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ IBinder.DeathRecipient f14599c;

    public nqm(ChannelService channelService, dum dumVar, Messenger messenger, IBinder.DeathRecipient deathRecipient) {
        this.a = dumVar;
        this.b = messenger;
        this.f14599c = deathRecipient;
    }

    @Override // com.oplus.aiunit.vision.pam
    public void a(vsm vsmVar, int i, String str) {
        this.a.f11682j.remove(this);
        this.b.getBinder().unlinkToDeath(this.f14599c, 0);
    }
}
