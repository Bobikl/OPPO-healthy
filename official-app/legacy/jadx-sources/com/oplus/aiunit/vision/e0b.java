package com.oplus.aiunit.vision;

import android.os.Message;
import android.util.ArrayMap;
import com.oplus.wearable.linkservice.sdk.Node;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import com.oplus.wearable.linkservice.sdk.common.Module;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes17.dex */
public class e0b {
    public static final Map<Integer, List<bid>> b = new ArrayMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ArrayList<Message> f10745c = new ArrayList<>();
    public List<cr0> a;

    public static class a {
        public static e0b a = new e0b();
    }

    public static e0b c() {
        return a.a;
    }

    public void a(cr0 cr0Var) {
        if (this.a.contains(cr0Var)) {
            return;
        }
        this.a.add(cr0Var);
    }

    public void b(int i, bid bidVar) {
        Map<Integer, List<bid>> map = b;
        synchronized (map) {
            if (!map.containsKey(Integer.valueOf(i)) || map.get(Integer.valueOf(i)) == null) {
                map.put(Integer.valueOf(i), new ArrayList());
            }
            List<bid> list = map.get(Integer.valueOf(i));
            if (list != null && !list.contains(bidVar)) {
                list.add(bidVar);
            }
        }
    }

    public void d(Node node) {
        if (node != null) {
            Module mainModule = node.getMainModule();
            Module stubModule = node.getStubModule();
            fr0 fr0Var = new fr0();
            StringBuilder sb = new StringBuilder();
            sb.append(" onPeerConnected brM: ");
            sb.append(mainModule);
            sb.append(" bleM: ");
            sb.append(stubModule);
            if (mainModule != null && mainModule.getState() == 2) {
                fr0Var.b(mainModule.getMacAddress());
                fr0Var.c(0);
            }
            if (mainModule != null && stubModule != null && stubModule.getState() == 2) {
                fr0Var.b(mainModule.getMacAddress());
                fr0Var.c(2);
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(" onPeerConnected，notify connectionListener ");
            sb2.append(fr0Var.a());
            for (int i = 0; i < this.a.size(); i++) {
                cr0 cr0Var = this.a.get(i);
                if (cr0Var != null) {
                    cr0Var.b(fr0Var);
                }
            }
        }
    }

    public void e(Node node) {
        if (node != null) {
            Module mainModule = node.getMainModule();
            Module stubModule = node.getStubModule();
            fr0 fr0Var = new fr0();
            StringBuilder sb = new StringBuilder();
            sb.append(" onPeerDisconnected brM: ");
            sb.append(mainModule);
            sb.append(" bleM: ");
            sb.append(stubModule);
            if (mainModule != null && mainModule.getState() != 2 && stubModule == null) {
                fr0Var.b(mainModule.getMacAddress());
            } else if (mainModule != null && mainModule.getState() != 2 && stubModule != null && stubModule.getState() != 2) {
                fr0Var.b(mainModule.getMacAddress());
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(" NodeListener, onPeerDisconnected ");
            sb2.append(fr0Var.a());
            for (int i = 0; i < this.a.size(); i++) {
                cr0 cr0Var = this.a.get(i);
                if (cr0Var != null) {
                    cr0Var.a(fr0Var);
                }
            }
        }
    }

    public void f(MessageEvent messageEvent) {
        Map<Integer, List<bid>> map = b;
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
                List<bid> list = map.get(Integer.valueOf(serviceId));
                if (list != null && !list.isEmpty()) {
                    for (int i = 0; i < list.size(); i++) {
                        bid bidVar = list.get(i);
                        if (bidVar != null) {
                            bidVar.a(serviceId, commandId, data);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void g(MessageEvent messageEvent) {
        Map<Integer, List<bid>> map = b;
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
                List<bid> list = map.get(Integer.valueOf(serviceId));
                if (list != null && !list.isEmpty()) {
                    for (int i = 0; i < list.size(); i++) {
                        bid bidVar = list.get(i);
                        if (bidVar != null) {
                            bidVar.b(serviceId, commandId, data);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void h(cr0 cr0Var) {
        List<cr0> list = this.a;
        if (list != null) {
            list.remove(cr0Var);
        }
    }

    public void i(int i, bid bidVar) {
        Map<Integer, List<bid>> map = b;
        synchronized (map) {
            if (map.containsKey(Integer.valueOf(i)) && map.get(Integer.valueOf(i)) != null) {
                map.get(Integer.valueOf(i)).remove(bidVar);
            }
        }
    }

    public e0b() {
        this.a = new ArrayList();
    }
}
