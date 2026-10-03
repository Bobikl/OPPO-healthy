package com.oplus.aiunit.vision;

import android.util.ArraySet;
import androidx.annotation.NonNull;
import com.heytap.health.watch.thirdparty.WEExtensionKt;
import com.heytap.wearable.oms.base.node.NodeManager;
import com.heytap.wearable.oms.common.Status;
import com.oplus.ocs.wearengine.nodeclient.WENodeManager;
import com.oplus.wearable.linkservice.sdk.Node;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes19.dex */
public class ovj {
    public Set<String> a;

    public class a implements ul4.b {
        public a() {
        }

        @Override // com.oplus.aiunit.vision.ul4.b
        public void d(@NonNull Node node, @NonNull auc aucVar) {
            if (aucVar == auc.f.INSTANCE) {
                nvj.c("ThirdPartyManager", "onPeerDisconnected", new Object[0]);
                ovj.this.e();
            } else if (aucVar == auc.a.INSTANCE) {
                nvj.c("ThirdPartyManager", "onPeerConnected", new Object[0]);
                ovj.this.e();
                LinkedHashSet linkedHashSet = new LinkedHashSet(WEExtensionKt.d());
                if (Objects.equals(ovj.this.a, linkedHashSet)) {
                    return;
                }
                ovj.this.a = linkedHashSet;
                WEExtensionKt.j();
            }
        }

        @Override // com.oplus.aiunit.vision.ul4.b
        public void getInterestingStatus(@NonNull ArraySet<auc> arraySet) {
            arraySet.add(auc.f.INSTANCE);
            arraySet.add(auc.a.INSTANCE);
        }
    }

    public static class b {
        public static final ovj a = new ovj();
    }

    public static ovj d() {
        return b.a;
    }

    public final void e() {
        NodeManager nodeManagerD = NodeManager.d();
        ol4 ol4Var = gl4.managerApi;
        nodeManagerD.g(ol4Var.getCurrentConnectId());
        WENodeManager.d().h(ol4Var.getCurrentConnectId());
    }

    public Status f(MessageEvent messageEvent) {
        Status status;
        nvj.c("ThirdPartyManager", "sendMessage cid = " + messageEvent.getCommandId(), new Object[0]);
        if (messageEvent.getData() != null && messageEvent.getData().length > 102400) {
            status = new Status(26);
        } else if (gl4.managerApi.isCurrentConnected()) {
            try {
                gl4.devicePrimary.messageApi.b(messageEvent);
                status = Status.SUCCESS;
            } catch (Exception e2) {
                status = new Status(8, e2.getMessage());
            }
        } else {
            status = Status.STATUS_NOT_CONNECTED;
        }
        nvj.c("ThirdPartyManager", "sendMessage result = " + status.getStatusCode(), new Object[0]);
        return status;
    }

    public ovj() {
        this.a = new LinkedHashSet();
        gl4.devicePrimary.nodeApi.l(new a());
    }
}
