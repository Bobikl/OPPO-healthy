package com.oplus.aiunit.vision;

import android.util.ArrayMap;
import com.oplus.wearable.linkservice.sdk.Node;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import com.oplus.wearable.linkservice.sdk.common.Module;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes15.dex */
public class a0b {
    public static final Map<Integer, List<did>> b = new ArrayMap();
    public final List<er0> a;

    public static class a {
        public static a0b a = new a0b();
    }

    public static a0b c() {
        return a.a;
    }

    public void a(er0 er0Var) {
        if (this.a.contains(er0Var)) {
            return;
        }
        this.a.add(er0Var);
    }

    public void b(int i, did didVar) {
        Map<Integer, List<did>> map = b;
        synchronized (map) {
            if (!map.containsKey(Integer.valueOf(i)) || map.get(Integer.valueOf(i)) == null) {
                map.put(Integer.valueOf(i), new ArrayList());
            }
            List<did> list = map.get(Integer.valueOf(i));
            if (list != null && !list.contains(didVar)) {
                list.add(didVar);
            }
        }
    }

    public void d(Node node) {
        if (node != null) {
            Module mainModule = node.getMainModule();
            Module stubModule = node.getStubModule();
            hr0 hr0Var = new hr0();
            StringBuilder sb = new StringBuilder();
            sb.append(" onPeerConnected brM: ");
            sb.append(mainModule);
            sb.append(" bleM: ");
            sb.append(stubModule);
            if (mainModule != null && mainModule.getState() == 2) {
                hr0Var.b(mainModule.getMacAddress());
                hr0Var.c(0);
            }
            if (mainModule != null && stubModule != null && stubModule.getState() == 2) {
                hr0Var.b(mainModule.getMacAddress());
                hr0Var.c(2);
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(" onPeerConnected，notify connectionListener ");
            sb2.append(hr0Var.a());
            for (int i = 0; i < this.a.size(); i++) {
                er0 er0Var = this.a.get(i);
                if (er0Var != null) {
                    er0Var.a(hr0Var);
                }
            }
        }
    }

    public void e(Node node) {
        if (node != null) {
            Module mainModule = node.getMainModule();
            Module stubModule = node.getStubModule();
            hr0 hr0Var = new hr0();
            StringBuilder sb = new StringBuilder();
            sb.append(" onPeerDisconnected brM: ");
            sb.append(mainModule);
            sb.append(" bleM: ");
            sb.append(stubModule);
            if (mainModule != null && mainModule.getState() != 2 && stubModule == null) {
                hr0Var.b(mainModule.getMacAddress());
            } else if (mainModule != null && mainModule.getState() != 2 && stubModule != null && stubModule.getState() != 2) {
                hr0Var.b(mainModule.getMacAddress());
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(" NodeListener, onPeerDisconnected ");
            sb2.append(hr0Var.a());
            for (int i = 0; i < this.a.size(); i++) {
                er0 er0Var = this.a.get(i);
                if (er0Var != null) {
                    er0Var.b(hr0Var);
                }
            }
        }
    }

    public void f(MessageEvent messageEvent) {
        Map<Integer, List<did>> map = b;
        synchronized (map) {
            try {
                if (messageEvent == null) {
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("onMessageReceived msg:");
                sb.append(messageEvent);
                byte[] data = messageEvent.getData();
                int serviceId = messageEvent.getServiceId();
                int commandId = messageEvent.getCommandId();
                List<did> list = map.get(Integer.valueOf(serviceId));
                if (list != null && !list.isEmpty()) {
                    for (int i = 0; i < list.size(); i++) {
                        did didVar = list.get(i);
                        if (didVar != null) {
                            didVar.a(serviceId, commandId, data);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void g(MessageEvent messageEvent) {
        Map<Integer, List<did>> map = b;
        synchronized (map) {
            try {
                if (messageEvent == null) {
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("receiveTimeoutMsg msg:");
                sb.append(messageEvent);
                byte[] data = messageEvent.getData();
                int serviceId = messageEvent.getServiceId();
                int commandId = messageEvent.getCommandId();
                List<did> list = map.get(Integer.valueOf(serviceId));
                if (list != null && !list.isEmpty()) {
                    for (int i = 0; i < list.size(); i++) {
                        did didVar = list.get(i);
                        if (didVar != null) {
                            didVar.b(serviceId, commandId, data);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public a0b() {
        this.a = new ArrayList();
    }
}
