package com.oplus.aiunit.vision;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.ArrayMap;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public class ek5 implements rl4.b {
    public static Map<Integer, List<aid>> i = new ArrayMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final ArrayList<Message> f10965j = new ArrayList<>();
    public static volatile ek5 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static a f10966l;

    public static class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            try {
                MessageEvent messageEvent = (MessageEvent) message.obj;
                if (ek5.k != null) {
                    ek5.k.h(messageEvent);
                }
            } catch (Exception e2) {
                a7b.b("DeviceMessageManager", "BtTimeoutMessageHandler error" + e2.getMessage());
            }
        }
    }

    public ek5() {
        g();
    }

    public static ek5 e() {
        if (k == null) {
            synchronized (ek5.class) {
                if (k == null) {
                    k = new ek5();
                }
            }
        }
        return k;
    }

    public void c(MessageEvent messageEvent) {
        ArrayList<Message> arrayList = f10965j;
        synchronized (arrayList) {
            k(messageEvent);
            arrayList.notifyAll();
        }
    }

    public void d(int i2, aid aidVar) {
        if (!i.containsKey(Integer.valueOf(i2)) || i.get(Integer.valueOf(i2)) == null) {
            i.put(Integer.valueOf(i2), new ArrayList());
        }
        List<aid> list = i.get(Integer.valueOf(i2));
        if (list == null || list.contains(aidVar)) {
            return;
        }
        list.add(aidVar);
    }

    public final int f(MessageEvent messageEvent) {
        return Integer.parseInt(Math.abs(messageEvent.getServiceId()) + String.valueOf(Math.abs(messageEvent.getCommandId())));
    }

    public void g() {
        HandlerThread handlerThread = new HandlerThread("messageHandler");
        handlerThread.start();
        f10966l = new a(handlerThread.getLooper());
    }

    public final void h(MessageEvent messageEvent) {
        if (messageEvent == null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("time out :");
        sb.append(messageEvent.toString());
        byte[] data = messageEvent.getData();
        int serviceId = messageEvent.getServiceId();
        int commandId = messageEvent.getCommandId();
        j(serviceId, commandId);
        List<aid> list = i.get(Integer.valueOf(serviceId));
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            aid aidVar = list.get(i2);
            if (aidVar != null) {
                aidVar.b(serviceId, commandId, data);
            }
        }
    }

    public void i(int i2, aid aidVar) {
        if (!i.containsKey(Integer.valueOf(i2)) || i.get(Integer.valueOf(i2)) == null) {
            return;
        }
        i.get(Integer.valueOf(i2)).remove(aidVar);
    }

    public final void j(int i2, int i3) {
        ArrayList<Message> arrayList;
        int i4 = 0;
        while (true) {
            arrayList = f10965j;
            if (i4 >= arrayList.size()) {
                i4 = -1;
                break;
            }
            Object obj = arrayList.get(i4).obj;
            if (obj instanceof MessageEvent) {
                MessageEvent messageEvent = (MessageEvent) obj;
                if (messageEvent.getServiceId() == i2 && messageEvent.getCommandId() == i3) {
                    a aVar = f10966l;
                    if (aVar == null) {
                        break;
                    }
                    aVar.removeMessages(f(messageEvent));
                    break;
                }
            }
            i4++;
        }
        if (i4 != -1) {
            arrayList.remove(i4);
        }
    }

    public final void k(MessageEvent messageEvent) {
        if (f10966l != null) {
            Message messageObtain = Message.obtain();
            messageObtain.obj = messageEvent;
            messageObtain.what = f(messageEvent);
            if (messageEvent.getServiceId() == 1 && messageEvent.getCommandId() == 26) {
                f10966l.sendMessageDelayed(messageObtain, 30000L);
            } else {
                f10966l.sendMessageDelayed(messageObtain, 10000L);
            }
            f10965j.add(messageObtain);
        }
    }

    @Override // com.oplus.aiunit.vision.rl4.b
    public void onMessageReceived(String str, MessageEvent messageEvent) {
        if (messageEvent == null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("onMessageReceived msg:");
        sb.append(messageEvent.toString());
        byte[] data = messageEvent.getData();
        int serviceId = messageEvent.getServiceId();
        int commandId = messageEvent.getCommandId();
        j(serviceId, commandId);
        List<aid> list = i.get(Integer.valueOf(serviceId));
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            aid aidVar = list.get(i2);
            if (aidVar != null) {
                aidVar.a(serviceId, commandId, data);
            }
        }
    }
}
