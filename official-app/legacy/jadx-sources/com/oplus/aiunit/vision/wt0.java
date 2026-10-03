package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;
import com.heytap.health.devicemanager.deviceability.DeviceInfo;
import com.oplus.wearable.linkservice.sdk.Node;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import p010kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public class wt0 implements ft0, ul4.a, m6c {
    public static final String TAG = "BandBtClientImpl";
    public final zq0 i;

    public static class a {
        public static final wt0 a = new wt0();
    }

    public static wt0 g() {
        return a.a;
    }

    public static /* synthetic */ void h(String str, MessageEvent messageEvent) {
        StringBuilder sb = new StringBuilder();
        sb.append("onMessageReceived:");
        sb.append(messageEvent.toString());
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("onMessageReceived ==");
            sb2.append(c1f.g(messageEvent));
            f0b.b().e(messageEvent);
        } catch (Exception e2) {
            a7b.b("BandBtClientImpl", "onMessageReceived error " + e2.getMessage());
        }
    }

    public static /* synthetic */ Boolean i(DeviceInfo deviceInfo) {
        return Boolean.valueOf(deviceInfo.A9());
    }

    public static /* synthetic */ Boolean j(DeviceInfo deviceInfo) {
        return Boolean.valueOf(deviceInfo.A9());
    }

    @Override // com.oplus.aiunit.vision.ft0
    public boolean a(MessageEvent messageEvent) {
        if (messageEvent == null) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("sendBtMessage --> ");
        sb.append(messageEvent.toString());
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Band sendBtMessage() --> ");
            sb2.append(c1f.c(messageEvent));
        } catch (Exception e2) {
            a7b.b("BandBtClientImpl", "Band sendBtMessage() -->  ProtoPrintUtils.msgEventStr() ,error=" + e2.getMessage());
        }
        yw2 yw2VarT = this.i.T(messageEvent, this);
        if (yw2VarT == null) {
            a7b.b("BandBtClientImpl", "Band sendBtMessage() -->  failed");
        }
        return yw2VarT != null;
    }

    @Override // com.oplus.aiunit.vision.ft0
    public void b(int i, cid cidVar) {
        f0b.b().a(i, cidVar);
    }

    @Override // com.oplus.aiunit.vision.m6c
    public void f(m6c.a aVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("onResult：");
        sb.append(aVar.toString());
        if (aVar.f()) {
            return;
        }
        f0b.b().f(aVar.d());
    }

    @Override // com.oplus.aiunit.vision.ul4.a
    public void onPeerConnected(@NonNull Node node) {
        if (((Boolean) lc5.c(node.getNodeId()).a(new Function1() { // from class: com.oplus.aiunit.vision.qt0
            @Override // p010kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return wt0.i((DeviceInfo) obj);
            }
        })).booleanValue()) {
            f0b.b().c(node);
        }
    }

    @Override // com.oplus.aiunit.vision.ul4.a
    public void onPeerDisconnected(@NonNull Node node) {
        if (((Boolean) lc5.c(node.getNodeId()).a(new Function1() { // from class: com.oplus.aiunit.vision.nt0
            @Override // p010kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return wt0.j((DeviceInfo) obj);
            }
        })).booleanValue()) {
            f0b.b().d(node);
        }
    }

    public wt0() {
        zq0 zq0VarW = zq0.w();
        this.i = zq0VarW;
        zq0VarW.o(this);
        zq0VarW.n(new rl4.b() { // from class: com.oplus.aiunit.vision.pt0
            @Override // com.oplus.aiunit.vision.rl4.b
            public final void onMessageReceived(String str, MessageEvent messageEvent) {
                wt0.h(str, messageEvent);
            }
        });
    }
}
