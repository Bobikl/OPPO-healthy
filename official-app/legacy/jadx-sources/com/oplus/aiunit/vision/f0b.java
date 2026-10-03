package com.oplus.aiunit.vision;

import android.util.ArrayMap;
import com.oplus.wearable.linkservice.sdk.Node;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import com.oplus.wearable.linkservice.sdk.common.Module;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class f0b {
    public static final Map<Integer, List<cid>> b = new ArrayMap();
    public final List<dr0> a;

    public static class a {
        public static f0b a = new f0b();
    }

    public static f0b b() {
        return a.a;
    }

    public void a(int i, cid cidVar) {
        Map<Integer, List<cid>> map = b;
        synchronized (map) {
            if (!map.containsKey(Integer.valueOf(i)) || map.get(Integer.valueOf(i)) == null) {
                map.put(Integer.valueOf(i), new ArrayList());
            }
            List<cid> list = map.get(Integer.valueOf(i));
            if (list != null && !list.contains(cidVar)) {
                list.add(cidVar);
            }
        }
    }

    public void c(Node node) {
        if (node != null) {
            Module mainModule = node.getMainModule();
            Module stubModule = node.getStubModule();
            gr0 gr0Var = new gr0();
            StringBuilder sb = new StringBuilder();
            sb.append(" onPeerConnected brM: ");
            sb.append(mainModule);
            sb.append(" bleM: ");
            sb.append(stubModule);
            if (mainModule != null && mainModule.getState() == 2) {
                gr0Var.b(mainModule.getMacAddress());
                gr0Var.c(0);
            }
            if (mainModule != null && stubModule != null && stubModule.getState() == 2) {
                gr0Var.b(mainModule.getMacAddress());
                gr0Var.c(2);
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(" onPeerConnected，notify connectionListener ");
            sb2.append(gr0Var.a());
            for (int i = 0; i < this.a.size(); i++) {
                dr0 dr0Var = this.a.get(i);
                if (dr0Var != null) {
                    dr0Var.b(gr0Var);
                }
            }
        }
    }

    public void d(Node node) {
        if (node != null) {
            Module mainModule = node.getMainModule();
            Module stubModule = node.getStubModule();
            gr0 gr0Var = new gr0();
            StringBuilder sb = new StringBuilder();
            sb.append(" onPeerDisconnected brM: ");
            sb.append(mainModule);
            sb.append(" bleM: ");
            sb.append(stubModule);
            if (mainModule != null && mainModule.getState() != 2 && stubModule == null) {
                gr0Var.b(mainModule.getMacAddress());
            } else if (mainModule != null && mainModule.getState() != 2 && stubModule != null && stubModule.getState() != 2) {
                gr0Var.b(mainModule.getMacAddress());
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(" NodeListener, onPeerDisconnected ");
            sb2.append(gr0Var.a());
            for (int i = 0; i < this.a.size(); i++) {
                dr0 dr0Var = this.a.get(i);
                if (dr0Var != null) {
                    dr0Var.a(gr0Var);
                }
            }
        }
    }

    public void e(MessageEvent messageEvent) {
        Map<Integer, List<cid>> map = b;
        synchronized (map) {
            try {
                if (messageEvent == null) {
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("onMessageReceived msg:");
                sb.append(messageEvent.toString());
                byte[] data = messageEvent.getData();
                int serviceId = messageEvent.getServiceId();
                int commandId = messageEvent.getCommandId();
                List<cid> list = map.get(Integer.valueOf(serviceId));
                if (list != null && !list.isEmpty()) {
                    for (int i = 0; i < list.size(); i++) {
                        cid cidVar = list.get(i);
                        if (cidVar != null) {
                            cidVar.a(serviceId, commandId, data);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void f(MessageEvent messageEvent) {
        Map<Integer, List<cid>> map = b;
        synchronized (map) {
            try {
                if (messageEvent == null) {
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("receiTimeoutMsg msg:");
                sb.append(messageEvent.toString());
                byte[] data = messageEvent.getData();
                int serviceId = messageEvent.getServiceId();
                int commandId = messageEvent.getCommandId();
                List<cid> list = map.get(Integer.valueOf(serviceId));
                if (list != null && !list.isEmpty()) {
                    for (int i = 0; i < list.size(); i++) {
                        cid cidVar = list.get(i);
                        if (cidVar != null) {
                            cidVar.b(serviceId, commandId, data);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public f0b() {
        this.a = new ArrayList();
    }
}
