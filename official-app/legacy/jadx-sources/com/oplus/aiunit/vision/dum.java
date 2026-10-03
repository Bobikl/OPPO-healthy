package com.oplus.aiunit.vision;

import android.os.HandlerThread;
import org.hapjs.features.channel.ChannelMessage;
import org.hapjs.features.channel.HapChannelManager;
import org.hapjs.features.channel.IHapChannel;
import org.hapjs.features.channel.appinfo.AndroidApplication;
import org.hapjs.features.channel.appinfo.HapApplication;
import org.hapjs.features.channel.listener.EventCallBack;

/* JADX INFO: loaded from: classes.dex */
public class dum extends g9m implements IHapChannel {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f10697n;

    public class a implements pam {
        public a() {
        }

        @Override // com.oplus.aiunit.vision.pam
        public void a(vsm vsmVar, int i, String str) {
            HapChannelManager.ChannelHandler channelHandler = HapChannelManager.get().getChannelHandler(((g9m) vsmVar).a);
            if (channelHandler != null) {
                channelHandler.onClose(dum.this, i, str);
            }
        }

        @Override // com.oplus.aiunit.vision.pam
        public void b(vsm vsmVar, ChannelMessage channelMessage) {
            HapChannelManager.ChannelHandler channelHandler = HapChannelManager.get().getChannelHandler(((g9m) vsmVar).a);
            if (channelHandler != null) {
                channelHandler.onReceiveMessage(dum.this, channelMessage);
            }
        }

        @Override // com.oplus.aiunit.vision.pam
        public void c(vsm vsmVar) {
            HapChannelManager.ChannelHandler channelHandler = HapChannelManager.get().getChannelHandler(((g9m) vsmVar).a);
            if (channelHandler != null) {
                channelHandler.onOpen(dum.this);
            }
        }

        @Override // com.oplus.aiunit.vision.pam
        public void d(vsm vsmVar, int i, String str) {
            HapChannelManager.ChannelHandler channelHandler = HapChannelManager.get().getChannelHandler(((g9m) vsmVar).a);
            if (channelHandler != null) {
                channelHandler.onError(dum.this, i, str);
            }
        }
    }

    public dum(String str, AndroidApplication androidApplication, HapApplication hapApplication, HandlerThread handlerThread, boolean z, String str2) {
        super(androidApplication, hapApplication, handlerThread, str2);
        this.f10697n = z;
        e(str);
        j(g9m.a());
        i(new a());
    }

    @Override // org.hapjs.features.channel.IHapChannel
    public void close(String str, EventCallBack eventCallBack) {
        d(0, str, true, eventCallBack);
    }
}
