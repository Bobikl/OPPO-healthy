package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;
import com.oplus.wearable.linkservice.sdk.Node;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import com.oplus.wearable.linkservice.sdk.common.Module;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public class rt0 implements gt0, ul4.a, m6c {
    public static final String TAG = "BandBtClientImpl";
    public final zq0 i;

    public static class a {
        public static final rt0 a = new rt0();
    }

    public static rt0 j() {
        return a.a;
    }

    public static /* synthetic */ void k(String str, MessageEvent messageEvent) {
        StringBuilder sb = new StringBuilder();
        sb.append("onMessageReceived:");
        sb.append(messageEvent);
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("onMessageReceived ==");
            sb2.append(d1f.f(messageEvent));
            a0b.c().f(messageEvent);
        } catch (Exception e2) {
            a7b.b("BandBtClientImpl", "[btMsgListener] --> " + e2.getMessage());
        }
    }

    @Override // com.oplus.aiunit.vision.gt0
    public void a(MessageEvent messageEvent) {
        if (messageEvent == null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("sendBtMessage --> ");
        sb.append(messageEvent);
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Band sendBtMessage() --> ");
            sb2.append(d1f.c(messageEvent));
        } catch (Exception e2) {
            a7b.b("BandBtClientImpl", "Band sendBtMessage() -->  ProtoPrintUtils.msgEventStr() ,error=" + e2.getMessage());
        }
        if (this.i.T(messageEvent, this) == null) {
            a7b.b("BandBtClientImpl", "Band sendBtMessage() -->  failed");
        }
    }

    @Override // com.oplus.aiunit.vision.gt0
    public void b(MessageEvent messageEvent) {
        a(messageEvent);
    }

    @Override // com.oplus.aiunit.vision.gt0
    public void c(int i, did didVar) {
        a0b.c().b(i, didVar);
    }

    @Override // com.oplus.aiunit.vision.gt0
    public void cancelFile(String str) {
        this.i.q(str);
    }

    @Override // com.oplus.aiunit.vision.gt0
    public String d() {
        hr0 hr0Var;
        List<hr0> listI = i();
        return (listI == null || listI.isEmpty() || (hr0Var = listI.get(0)) == null) ? "" : hr0Var.a();
    }

    @Override // com.oplus.aiunit.vision.gt0
    public String e(String str, String str2, int i, psg psgVar) {
        return this.i.P(str, str2, i, psgVar);
    }

    @Override // com.oplus.aiunit.vision.m6c
    public void f(m6c.a aVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("onResult：");
        sb.append(aVar.toString());
        if (aVar.f()) {
            return;
        }
        a0b.c().g(aVar.d());
    }

    @Override // com.oplus.aiunit.vision.gt0
    public void g(er0 er0Var) {
        a0b.c().a(er0Var);
    }

    public List<hr0> i() {
        ArrayList arrayList = new ArrayList();
        List<Node> connectedNodes = gl4.managerApi.getConnectedNodes();
        if (connectedNodes.size() == 0) {
            return arrayList;
        }
        for (Node node : connectedNodes) {
            Module mainModule = node.getMainModule();
            Module stubModule = node.getStubModule();
            hr0 hr0Var = new hr0();
            if (mainModule != null && mainModule.getState() == 2) {
                StringBuilder sb = new StringBuilder();
                sb.append(" getConnectedDevicesDefferentiateBrBle,brModule:");
                sb.append(mainModule);
                hr0Var.b(mainModule.getMacAddress());
                hr0Var.c(0);
            } else if (stubModule != null && stubModule.getState() == 2) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(" getConnectedDevicesDefferentiateBrBle,bleModule:");
                sb2.append(stubModule);
                hr0Var.c(2);
                hr0Var.b(stubModule.getNodeId());
            }
            arrayList.add(hr0Var);
        }
        return arrayList;
    }

    @Override // com.oplus.aiunit.vision.ul4.a
    public void onPeerConnected(@NonNull Node node) {
        if (((Boolean) lc5.c(node.getNodeId()).a(new uv0())).booleanValue()) {
            a0b.c().d(node);
        }
    }

    @Override // com.oplus.aiunit.vision.ul4.a
    public void onPeerDisconnected(@NonNull Node node) {
        if (((Boolean) lc5.c(node.getNodeId()).a(new uv0())).booleanValue()) {
            a0b.c().e(node);
        }
    }

    public rt0() {
        zq0 zq0VarW = zq0.w();
        this.i = zq0VarW;
        zq0VarW.o(this);
        zq0VarW.n(new rl4.b() { // from class: com.oplus.aiunit.vision.ot0
            @Override // com.oplus.aiunit.vision.rl4.b
            public final void onMessageReceived(String str, MessageEvent messageEvent) {
                rt0.k(str, messageEvent);
            }
        });
    }
}
