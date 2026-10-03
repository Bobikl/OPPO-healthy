package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.oplus.wearable.linkservice.sdk.Node;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import com.oplus.wearable.linkservice.sdk.common.Module;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public class vt0 implements et0, ul4.a, m6c {
    public static final String TAG = "BandBtClientImpl";
    public zq0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public rl4.b f17979j;

    public static class a {
        public static final vt0 a = new vt0();
    }

    public static vt0 n() {
        return a.a;
    }

    public static /* synthetic */ void o(String str, MessageEvent messageEvent) {
        StringBuilder sb = new StringBuilder();
        sb.append("onMessageReceived:");
        sb.append(messageEvent.toString());
        try {
            e0b.c().f(messageEvent);
        } catch (Exception unused) {
        }
    }

    @Override // com.oplus.aiunit.vision.et0
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
            sb2.append(b1f.c(messageEvent));
        } catch (Exception e2) {
            a7b.b("BandBtClientImpl", "Band sendBtMessage() -->  ProtoPrintUtils.msgEventStr() ,error=" + e2.getMessage());
        }
        yw2 yw2VarT = this.i.T(messageEvent, this);
        if (yw2VarT == null) {
            a7b.b("BandBtClientImpl", "Band sendBtMessage() -->  failed");
        }
        return yw2VarT != null;
    }

    @Override // com.oplus.aiunit.vision.et0
    public boolean b(MessageEvent messageEvent) {
        return a(messageEvent);
    }

    @Override // com.oplus.aiunit.vision.et0
    public void c(cr0 cr0Var) {
        e0b.c().a(cr0Var);
    }

    @Override // com.oplus.aiunit.vision.et0
    public String d() {
        fr0 fr0Var;
        List<fr0> listM = m();
        return (listM == null || listM.isEmpty() || (fr0Var = listM.get(0)) == null) ? "" : fr0Var.a();
    }

    @Override // com.oplus.aiunit.vision.et0
    public yw2 e(MessageEvent messageEvent, m6c m6cVar) {
        return this.i.T(messageEvent, m6cVar);
    }

    @Override // com.oplus.aiunit.vision.m6c
    public void f(m6c.a aVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("onResult：");
        sb.append(aVar.toString());
        if (aVar.f()) {
            return;
        }
        e0b.c().g(aVar.d());
    }

    @Override // com.oplus.aiunit.vision.et0
    public void g(cr0 cr0Var) {
        e0b.c().h(cr0Var);
    }

    @Override // com.oplus.aiunit.vision.et0
    public void h(int i, bid bidVar) {
        e0b.c().b(i, bidVar);
    }

    @Override // com.oplus.aiunit.vision.et0
    public void i(Context context, String str) {
        Intent intent = new Intent("com.op.smartwear.native.unbind.UNBIND_DEVICE");
        intent.putExtra("msg_bt_address", str);
        if (qe0.w()) {
            intent.addFlags(8);
        }
        LocalBroadcastManager.getInstance(context).sendBroadcast(intent);
    }

    @Override // com.oplus.aiunit.vision.et0
    public void j(String str) {
        this.i.s(str);
    }

    @Override // com.oplus.aiunit.vision.et0
    public void k(int i, bid bidVar) {
        e0b.c().i(i, bidVar);
    }

    public List<fr0> m() {
        ArrayList arrayList = new ArrayList();
        List<Node> connectedNodes = gl4.managerApi.getConnectedNodes();
        if (connectedNodes.size() == 0) {
            return arrayList;
        }
        for (Node node : connectedNodes) {
            Module mainModule = node.getMainModule();
            Module stubModule = node.getStubModule();
            fr0 fr0Var = new fr0();
            if (mainModule != null && mainModule.getState() == 2) {
                StringBuilder sb = new StringBuilder();
                sb.append(" getConnectedDevicesDefferentiateBrBle,brModule:");
                sb.append(mainModule.toString());
                fr0Var.b(mainModule.getMacAddress());
                fr0Var.c(0);
            } else if (stubModule != null && stubModule.getState() == 2) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(" getConnectedDevicesDefferentiateBrBle,bleModule:");
                sb2.append(stubModule.toString());
                fr0Var.c(2);
                fr0Var.b(stubModule.getNodeId());
            }
            arrayList.add(fr0Var);
        }
        return arrayList;
    }

    @Override // com.oplus.aiunit.vision.ul4.a
    public void onPeerConnected(@NotNull Node node) {
        if (((Boolean) lc5.c(node.getNodeId()).a(new uv0())).booleanValue()) {
            e0b.c().d(node);
        }
    }

    @Override // com.oplus.aiunit.vision.ul4.a
    public void onPeerDisconnected(@NonNull Node node) {
        if (((Boolean) lc5.c(node.getNodeId()).a(new uv0())).booleanValue()) {
            e0b.c().e(node);
        }
    }

    public vt0() {
        this.f17979j = new rl4.b() { // from class: com.oplus.aiunit.vision.mt0
            @Override // com.oplus.aiunit.vision.rl4.b
            public final void onMessageReceived(String str, MessageEvent messageEvent) {
                vt0.o(str, messageEvent);
            }
        };
        zq0 zq0VarW = zq0.w();
        this.i = zq0VarW;
        zq0VarW.o(this);
        this.i.n(this.f17979j);
    }
}
