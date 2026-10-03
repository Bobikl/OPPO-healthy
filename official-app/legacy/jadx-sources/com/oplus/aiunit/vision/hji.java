package com.oplus.aiunit.vision;

import android.text.TextUtils;
import android.util.SparseArray;
import com.google.protobuf.InvalidProtocolBufferException;
import com.heytap.health.protocol.workout.WorkoutProto$DataChangedResponse;
import com.oplus.wearable.linkservice.sdk.Node;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class hji implements ul4.a {
    public final SparseArray<r3> i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final SparseArray<r3> f12182j;
    public final List<Runnable> k;

    public static class a {
        public static hji a = new hji();
    }

    public static hji c() {
        return a.a;
    }

    public void a(MessageEvent messageEvent) {
        r3 r3Var;
        synchronized (this.i) {
            int serviceId = (messageEvent.getServiceId() << 8) | messageEvent.getCommandId();
            r3Var = this.i.get(serviceId);
            if (r3Var == null) {
                r3Var = this.f12182j.get(serviceId);
            }
        }
        if (r3Var != null) {
            zlj.a(this.i.size() + " DMMessageApi.MessageListener ======onMessageReceived===>" + r3Var);
            r3Var.r(messageEvent);
            return;
        }
        if (e(messageEvent.getServiceId(), messageEvent.getCommandId())) {
            try {
                String extra = WorkoutProto$DataChangedResponse.parseFrom(messageEvent.getData()).getExtra();
                if (TextUtils.isEmpty(extra) || !TextUtils.isDigitsOnly(extra)) {
                    return;
                }
                int i = Integer.parseInt(extra);
                r3 r3Var2 = this.i.get((messageEvent.getServiceId() << 16) | (messageEvent.getCommandId() << 8) | i);
                if (r3Var2 != null) {
                    zlj.a("DataChangeNotify Rsp ======>" + r3Var2 + " ==>dataType: " + i);
                    r3Var2.r(messageEvent);
                }
            } catch (InvalidProtocolBufferException e2) {
                zlj.a("SportWatchManager", "dispatchMessage: ex " + e2);
            }
        }
    }

    public r3 b(int i) {
        r3 r3Var;
        synchronized (this.i) {
            r3Var = this.i.get(i);
        }
        return r3Var;
    }

    public synchronized void d() {
        gl4.devicePrimary.nodeApi.g(this);
    }

    public final boolean e(int i, int i2) {
        return i == 4 && i2 == 37;
    }

    public void f(r3 r3Var) {
        synchronized (this.i) {
            if (r3Var.i() == null) {
                zlj.c("unRegestCourier -> courier.getTypes() == null");
                return;
            }
            for (int i : r3Var.i()) {
                this.i.put(i, r3Var);
            }
            zlj.d("regestCourier " + r3Var, Integer.valueOf(this.i.size()));
        }
    }

    public void g(r3 r3Var) {
        synchronized (this.i) {
            if (r3Var.i() == null) {
                zlj.c("unRegestCourier -> courier.getTypes() == null");
                return;
            }
            zlj.a("unRegestCourier " + r3Var);
            for (int i : r3Var.i()) {
                this.i.remove(i);
            }
        }
    }

    @Override // com.oplus.aiunit.vision.ul4.a
    public void onPeerConnected(Node node) {
        zlj.a("onConnect ----> SportWatchManager " + gdb.a(node.getNodeId()));
        for (Runnable runnable : this.k) {
            try {
                zlj.a("onConnect ----> ", runnable);
                runnable.run();
            } catch (Exception e2) {
                zlj.e(e2);
            }
        }
    }

    @Override // com.oplus.aiunit.vision.ul4.a
    public void onPeerDisconnected(Node node) {
        if (node == null) {
            zlj.d("onPeerDisconnected: error node is null");
            return;
        }
        zlj.c("onPeerDisconnected ----> SportWatchManager " + gdb.a(node.getNodeId()));
        int size = this.i.size();
        for (int i = 0; i < size; i++) {
            r3 r3VarValueAt = this.i.valueAt(i);
            if (r3VarValueAt != null) {
                zlj.c("onPeerDisconnected: notify courier:" + r3VarValueAt.toString());
                r3VarValueAt.s(null);
            }
        }
    }

    public hji() {
        this.i = new SparseArray<>();
        this.f12182j = new SparseArray<>();
        this.k = new ArrayList();
        d();
    }
}
