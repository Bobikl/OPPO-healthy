package com.heytap.accessory.stream;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.ParcelFileDescriptor;
import android.os.ResultReceiver;
import com.google.mlkit.common.MlKitException;
import com.heytap.accessory.BaseJobAgent;
import com.heytap.accessory.base.AccessoryManager;
import com.heytap.accessory.file.model.TransferProgress;
import com.heytap.accessory.stream.model.CancelRequest;
import com.heytap.accessory.stream.model.CtrlResponse;
import com.heytap.accessory.stream.model.MultiTransferErrorMsg;
import com.heytap.accessory.stream.model.SetupRequest;
import com.heytap.accessory.stream.model.TransferErrorMsg;
import com.heytap.accessory.stream.receiver.StreamConsumerImpl;
import com.heytap.accessory.stream.sender.StreamProviderImpl;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class d implements com.heytap.accessory.stream.c {
    public static final String j;
    public static final Object k;
    public static Random l;
    public static d m;
    public static CopyOnWriteArrayList<e> n;
    public static CopyOnWriteArrayList<e> o;
    public static String p;
    public static Set<Integer> q;
    public Context a;
    public Map<Long, Map<Integer, e>> b = new HashMap();
    public Map<Integer, e> c = new HashMap();
    public com.heytap.accessory.stream.receiver.b d = null;
    public com.heytap.accessory.stream.sender.a e = null;
    public BaseJobAgent.RequestAgentCallback f = new a();
    public BaseJobAgent.RequestAgentCallback g = new b();
    public c h;
    public d i;

    public class a implements BaseJobAgent.RequestAgentCallback {
        public a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.heytap.accessory.BaseJobAgent.RequestAgentCallback
        public void onAgentAvailable(BaseJobAgent baseJobAgent) {
            com.heytap.accessory.base.logging.a.a(d.j, "Connected to consumer stream service");
            synchronized (d.m) {
                d.this.d = (com.heytap.accessory.stream.receiver.b) baseJobAgent;
                d.this.d.a(0L, d.this);
                if (com.heytap.accessory.stream.utils.a.a() != null) {
                    d.this.h = d.this.new c(com.heytap.accessory.stream.utils.a.a());
                }
                d.m.notifyAll();
            }
        }

        @Override // com.heytap.accessory.BaseJobAgent.RequestAgentCallback
        public void onError(int i, String str) {
            com.heytap.accessory.base.logging.a.b(d.j, "stream connection error:" + str);
        }
    }

    public class b implements BaseJobAgent.RequestAgentCallback {
        public b() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.heytap.accessory.BaseJobAgent.RequestAgentCallback
        public void onAgentAvailable(BaseJobAgent baseJobAgent) {
            com.heytap.accessory.base.logging.a.a(d.j, "Connected to provider FT service");
            synchronized (d.m) {
                d.this.e = (com.heytap.accessory.stream.sender.a) baseJobAgent;
                d.this.e.a(d.this);
                if (com.heytap.accessory.stream.utils.a.b() != null) {
                    d.this.i = d.this.new d(com.heytap.accessory.stream.utils.a.b());
                }
                d.m.notifyAll();
            }
        }

        @Override // com.heytap.accessory.BaseJobAgent.RequestAgentCallback
        public void onError(int i, String str) {
            com.heytap.accessory.base.logging.a.b(d.j, "stream connection error:" + str);
        }
    }

    public class c extends Handler {
        public c(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 1) {
                com.heytap.accessory.base.logging.a.e(d.j, "Invalid msg type received in ReceiverHandler : " + message.what);
                return;
            }
            Bundle bundle = (Bundle) message.obj;
            if (bundle == null) {
                com.heytap.accessory.base.logging.a.e(d.j, "bundle is null!");
                return;
            }
            e eVarC = d.this.c(bundle.getLong("EXTRA_KEY_CONNECTION_KEY"), message.arg1);
            if (eVarC == null) {
                com.heytap.accessory.base.logging.a.e(d.j, "Current receive locker task is null!");
                return;
            }
            eVarC.a(6);
            CancelRequest cancelRequest = new CancelRequest(eVarC.d, 9);
            cancelRequest.a(eVarC.c());
            if (d.this.d != null) {
                d.this.d.a(cancelRequest);
            }
            com.heytap.accessory.base.logging.a.d(d.j, "sReceiveQueue size = " + d.n.size());
        }
    }

    public class d extends Handler {
        public d(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 1) {
                com.heytap.accessory.base.logging.a.e(d.j, "Invalid msg type received in SenderHandler : " + message.what);
                return;
            }
            int i = message.getData().getInt("transId", -1);
            if (i == -1) {
                return;
            }
            e eVar = (e) d.this.c.get(Integer.valueOf(i));
            eVar.a(6);
            CancelRequest cancelRequest = new CancelRequest(eVar.d, 9);
            if (d.this.e != null) {
                d.this.e.a(cancelRequest);
            }
            com.heytap.accessory.base.logging.a.d(d.j, "sSendQueue size = " + d.o.size());
        }
    }

    public static class e {
        public com.heytap.accessory.stream.model.b a;
        public ResultReceiver b;
        public int c = 1;
        public int d;
        public long e;
        public ParcelFileDescriptor f;

        public e(int i, com.heytap.accessory.stream.model.b bVar, long j, ParcelFileDescriptor parcelFileDescriptor) {
            this.d = i;
            this.a = bVar;
            this.e = j;
            this.f = parcelFileDescriptor;
        }

        public com.heytap.accessory.stream.model.b a() {
            return this.a;
        }

        public ResultReceiver b() {
            return this.b;
        }

        public long c() {
            return this.e;
        }

        public int d() {
            return this.d;
        }

        public int e() {
            return this.c;
        }

        public void a(ResultReceiver resultReceiver) {
            this.b = resultReceiver;
        }

        public void a(int i) {
            this.c = i;
        }
    }

    static {
        Arrays.asList(201, 202, 203, 204, 205, Integer.valueOf(MlKitException.CODE_SCANNER_PIPELINE_INFERENCE_ERROR), Integer.valueOf(MlKitException.CODE_SCANNER_GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD), 208, 209, 210);
        j = d.class.getSimpleName();
        k = new Object();
        l = new SecureRandom();
        m = null;
        n = new CopyOnWriteArrayList<>();
        o = new CopyOnWriteArrayList<>();
        p = "Idle";
        q = new HashSet();
    }

    public d(Context context) {
        this.a = context;
    }

    public static synchronized int e() {
        int iNextInt;
        synchronized (q) {
            do {
                iNextInt = l.nextInt();
            } while (q.contains(Integer.valueOf(iNextInt)));
            q.add(Integer.valueOf(iNextInt));
        }
        return iNextInt;
    }

    public boolean d(long j2) {
        return false;
    }

    public final void f() {
        int iB;
        if (!o.isEmpty()) {
            synchronized (k) {
                if ("Idle".equals(p)) {
                    p = "busy";
                }
            }
        }
        if (o.isEmpty()) {
            com.heytap.accessory.base.logging.a.a(j, "Stream Send Queue isEmpty");
            return;
        }
        Object obj = k;
        synchronized (obj) {
            if ("Idle".equals(p)) {
                p = "busy";
            }
        }
        e eVar = o.get(0);
        if (eVar == null || eVar.a() == null) {
            com.heytap.accessory.base.logging.a.b(j, "Current locker task or agent is null!");
            return;
        }
        long jA = eVar.a().a();
        if (AccessoryManager.h().a(jA) == null) {
            com.heytap.accessory.base.logging.a.e(j, "current accessory not exist,clearTransferQueue,accId:" + jA);
            o.remove(eVar);
            f();
            return;
        }
        if (this.e.a(jA) || (iB = this.e.b(eVar.a().a())) == -1) {
            return;
        }
        o.remove(eVar);
        String str = j;
        com.heytap.accessory.base.logging.a.a(str, "[sendStream] process task from queue: " + eVar.d);
        this.c.put(Integer.valueOf(eVar.d), eVar);
        if (eVar.b() == null) {
            com.heytap.accessory.base.logging.a.b(str, "Callback is null! Skip sending the stream!");
            b(eVar.a.a(), eVar.d);
            synchronized (obj) {
                p = "Idle";
            }
        } else {
            SetupRequest setupRequest = new SetupRequest(eVar.d(), eVar.a().a(), eVar.a().b(), eVar.a().c(), iB);
            com.heytap.accessory.base.logging.a.a(str, "push " + eVar.e() + " , " + setupRequest.f());
            if (this.e != null && eVar.e() == 1) {
                eVar.a(2);
                ParcelFileDescriptor parcelFileDescriptor = eVar.f;
                if (parcelFileDescriptor == null) {
                    com.heytap.accessory.base.logging.a.b(str, "mParcelFileDescriptor==null");
                }
                this.e.a(parcelFileDescriptor, setupRequest);
                return;
            }
            com.heytap.accessory.base.logging.a.d(str, "FTProvider service not connected/send task is null");
        }
        f();
    }

    @Override // com.heytap.accessory.stream.c
    public void b(SetupRequest setupRequest) {
        int iF = setupRequest.f();
        long jC = setupRequest.c();
        e eVar = this.c.get(Integer.valueOf(iF));
        if (eVar == null || eVar.d() != iF) {
            return;
        }
        ResultReceiver resultReceiverB = eVar.b();
        Bundle bundle = new Bundle();
        try {
            bundle.putString("CallBackJson", new TransferProgress(jC, iF, 0L).toJSON().toString());
        } catch (JSONException unused) {
            com.heytap.accessory.base.logging.a.d(j, "json marshaling failed");
        }
        String str = j;
        com.heytap.accessory.base.logging.a.a(str, "onSetupResp send:" + resultReceiverB);
        if (resultReceiverB != null) {
            resultReceiverB.send(99, bundle);
            return;
        }
        com.heytap.accessory.base.logging.a.b(str, "onProgressChanged Sender: Callback not yet registered for transaction id: " + iF);
    }

    public final Map<Integer, e> c(long j2) {
        Map<Integer, e> map;
        synchronized (this.b) {
            map = this.b.get(Long.valueOf(j2));
        }
        return map;
    }

    public final void d(long j2, int i) {
        synchronized (this.b) {
            Map<Integer, e> map = this.b.get(Long.valueOf(j2));
            if (map != null) {
                map.remove(Integer.valueOf(i));
            }
        }
    }

    public final e c(long j2, int i) {
        e eVar;
        synchronized (this.b) {
            Map<Integer, e> map = this.b.get(Long.valueOf(j2));
            eVar = map != null ? map.get(Integer.valueOf(i)) : null;
        }
        return eVar;
    }

    @Override // com.heytap.accessory.stream.c
    public void a(SetupRequest setupRequest, CtrlResponse ctrlResponse) {
        long jA;
        int iF = setupRequest.f();
        long jC = setupRequest.c();
        e eVarC = c(jC, iF);
        String str = j;
        com.heytap.accessory.base.logging.a.b(str, "onError reason :" + ctrlResponse.b());
        String strA = com.heytap.accessory.stream.utils.b.a(ctrlResponse);
        e eVar = this.c.get(Integer.valueOf(iF));
        int i = 1;
        if (ctrlResponse.b() != 5 && ctrlResponse.b() != -1) {
            if (eVar != null && eVar.d() == iF) {
                com.heytap.accessory.base.logging.a.d(str, "TransactionId : " + iF + " error: " + strA + " state " + eVar.e());
                if (eVar.e() == 9) {
                    a(eVar.a().b(), eVar);
                    return;
                }
                eVar.a(1);
                ResultReceiver resultReceiverB = eVar.b();
                o.remove(eVar);
                b(eVar.a.a(), iF);
                com.heytap.accessory.base.logging.a.d(str, "onError: TRANSFER Cancelled!:SendQueue Size:" + o.size());
                Bundle bundle = new Bundle();
                try {
                    bundle.putString("CallBackJson", new TransferErrorMsg(jC, iF, ctrlResponse.b(), strA).toJSON().toString());
                } catch (JSONException unused) {
                    com.heytap.accessory.base.logging.a.d(j, "json marshaling failed");
                }
                if (resultReceiverB != null) {
                    resultReceiverB.send(102, bundle);
                } else {
                    com.heytap.accessory.base.logging.a.b(j, "onError Sender error: Callback not yet registered for transaction id: " + iF);
                }
                synchronized (k) {
                    p = "Idle";
                }
                f();
                return;
            }
            if (eVarC != null && eVarC.d() == iF) {
                com.heytap.accessory.base.logging.a.a(str, "Cleared current receive task:" + iF + " After error");
                com.heytap.accessory.base.logging.a.d(str, "TransactionId : " + iF + "error$ " + strA);
                eVarC.a(1);
                ResultReceiver resultReceiverB2 = eVarC.b();
                n.remove(eVarC);
                com.heytap.accessory.base.logging.a.d(str, "onError: TRANSFER Cancelled!:ReceiveQueue Size:" + n.size());
                Bundle bundle2 = new Bundle();
                try {
                    bundle2.putString("CallBackJson", new TransferErrorMsg(jC, iF, ctrlResponse.b(), strA).toJSON().toString());
                } catch (JSONException unused2) {
                    com.heytap.accessory.base.logging.a.d(j, "json marshaling failed");
                }
                if (resultReceiverB2 != null) {
                    resultReceiverB2.send(102, bundle2);
                    return;
                }
                com.heytap.accessory.base.logging.a.d(j, "onError Receiver error: Callback not yet registered for transaction id: " + iF);
                return;
            }
            com.heytap.accessory.base.logging.a.d(str, "onError: No request, yet on Error, plz check");
            return;
        }
        if (eVar != null && eVar.d() == iF) {
            jA = eVar.a().a();
        } else {
            jA = (eVarC == null || eVarC.d() != iF) ? -1L : eVarC.a().a();
        }
        long j2 = jA;
        Iterator<e> it = o.iterator();
        while (it.hasNext()) {
            e next = it.next();
            if (j2 == next.a().a()) {
                ResultReceiver resultReceiverB3 = next.b();
                next.a(i);
                Bundle bundle3 = new Bundle();
                Iterator<e> it2 = it;
                long j3 = jC;
                int i2 = iF;
                long j4 = j2;
                try {
                    bundle3.putString("CallBackJson", new TransferErrorMsg(jC, next.d, ctrlResponse.b(), strA).toJSON().toString());
                } catch (JSONException unused3) {
                    com.heytap.accessory.base.logging.a.d(j, "json marshaling failed");
                }
                if (resultReceiverB3 != null) {
                    resultReceiverB3.send(102, bundle3);
                } else {
                    com.heytap.accessory.base.logging.a.b(j, "onError Sender Service Conn failed: Callback not yet registered for transaction id: " + next.d);
                }
                o.remove(next);
                b(next.d);
                j2 = j4;
                iF = i2;
                it = it2;
                jC = j3;
                i = 1;
            }
        }
        long j5 = jC;
        int i3 = iF;
        long j6 = j2;
        com.heytap.accessory.base.logging.a.c(j, "Queue Size :" + o.size());
        Iterator<e> it3 = n.iterator();
        while (it3.hasNext()) {
            e next2 = it3.next();
            if (eVarC != null && next2.d() == eVarC.d() && eVarC.e() == 8) {
                com.heytap.accessory.base.logging.a.d(j, "On error  called  for  reciever  after  on successful on transfer complete happened lets ignore");
            } else if (j6 == next2.a().a()) {
                ResultReceiver resultReceiverB4 = next2.b();
                next2.a(1);
                Bundle bundle4 = new Bundle();
                Iterator<e> it4 = it3;
                try {
                    bundle4.putString("CallBackJson", new TransferErrorMsg(j5, next2.d, ctrlResponse.b(), strA).toJSON().toString());
                } catch (JSONException unused4) {
                    com.heytap.accessory.base.logging.a.d(j, "json marshaling failed");
                }
                if (resultReceiverB4 != null) {
                    resultReceiverB4.send(102, bundle4);
                } else {
                    com.heytap.accessory.base.logging.a.b(j, "onError Receiver Service Conn failed: Callback not yet registered for transaction id: " + next2.d);
                }
                n.remove(next2);
                it3 = it4;
            }
        }
        com.heytap.accessory.base.logging.a.d(j, "Cleared Send list on Service Connection Lost : SendQueue Size:" + o.size() + " ReceiveQueue size: " + n.size());
        if (eVarC != null) {
            eVarC.a().a();
        }
        if (eVar != null && eVar.a().a() == j6) {
            b(j6, i3);
        }
        synchronized (k) {
            p = "Idle";
        }
        f();
    }

    public static void b(long j2) {
        for (e eVar : o) {
            if (eVar.a().a() == j2) {
                o.remove(eVar);
            }
        }
        for (e eVar2 : n) {
            if (eVar2.a().a() == j2) {
                n.remove(eVar2);
            }
        }
        com.heytap.accessory.base.logging.a.a(j, "accessoryId:" + j2 + " clearTransferQueue, SendQueue leftCount:" + o.size());
    }

    public final void b(int i) {
        synchronized (q) {
            q.remove(Integer.valueOf(i));
        }
    }

    public final List<e> b(String str) {
        ArrayList arrayList = new ArrayList();
        synchronized (this.c) {
            for (Map.Entry<Integer, e> entry : this.c.entrySet()) {
                if (entry.getValue().a().b().equals(str)) {
                    arrayList.add(entry.getValue());
                }
            }
        }
        return arrayList;
    }

    public void b(long j2, int i) {
        b(i);
        this.c.remove(Integer.valueOf(i));
    }

    public void a(SetupRequest setupRequest, String str, String str2) {
        String str3 = j;
        com.heytap.accessory.base.logging.a.d(str3, "onSetupRequest connId:" + setupRequest.c());
        if (!com.heytap.accessory.base.a.a(3, setupRequest.a(), setupRequest.e(), setupRequest.d())) {
            com.heytap.accessory.base.logging.a.e(str3, "onStreamRequest accId:" + setupRequest.a() + " agentId:" + setupRequest.d() + " is dormant, ignore request!");
            return;
        }
        e eVar = new e(setupRequest.f(), new com.heytap.accessory.stream.model.b(setupRequest.e(), setupRequest.d(), setupRequest.a()), setupRequest.c(), null);
        eVar.a(5);
        a(setupRequest.c(), setupRequest.f(), eVar);
        n.add(eVar);
        com.heytap.accessory.stream.receiver.b bVar = this.d;
        if (bVar == null) {
            BaseJobAgent.requestAgent(this.a, StreamConsumerImpl.class.getName(), this.f);
            synchronized (m) {
                while (this.d == null) {
                    try {
                        m.wait();
                    } catch (InterruptedException unused) {
                        com.heytap.accessory.base.logging.a.d(j, "Consumer service binding interrupted");
                    }
                }
            }
        } else {
            bVar.a(setupRequest.c(), this);
        }
        Intent intent = new Intent(StreamTransfer.ACTION_STREAM_TRANSFER_REQUESTED);
        intent.putExtra("accId", setupRequest.a());
        intent.putExtra("contId", setupRequest.d());
        intent.putExtra("peerId", setupRequest.e());
        intent.putExtra("transId", setupRequest.f());
        intent.putExtra("connectionId", setupRequest.c());
        intent.putExtra("agentClass", str2);
        if (str.length() != 0) {
            intent.setPackage(str);
        }
        this.a.sendBroadcast(intent);
    }

    @Override // com.heytap.accessory.stream.c
    public void a(SetupRequest setupRequest) {
        e eVar = this.c.get(Integer.valueOf(setupRequest.f()));
        if (eVar != null && eVar.d() == setupRequest.f()) {
            eVar.a(8);
            ResultReceiver resultReceiverB = eVar.b();
            Bundle bundle = new Bundle();
            bundle.putInt("transactionId", setupRequest.f());
            bundle.putLong("connectionId", setupRequest.c());
            if (resultReceiverB != null) {
                resultReceiverB.send(101, bundle);
            } else {
                com.heytap.accessory.base.logging.a.b(j, "onTransfercomplete Sender: Callback not yet registered for transaction id: " + setupRequest.f());
            }
            b(eVar.a.a(), setupRequest.f());
            return;
        }
        if (c(setupRequest.c(), setupRequest.f()) == null) {
            com.heytap.accessory.base.logging.a.b(j, "onTransferComplete: Called when no request queued on either side, plz check");
            return;
        }
        String str = j;
        com.heytap.accessory.base.logging.a.d(str, "onTransferComplete: Cleared current receive task:" + setupRequest.f() + " After completion");
        c(setupRequest.c(), setupRequest.f()).a(8);
        ResultReceiver resultReceiverB2 = c(setupRequest.c(), setupRequest.f()).b();
        Bundle bundle2 = new Bundle();
        bundle2.putInt("transactionId", setupRequest.f());
        bundle2.putLong("connectionId", setupRequest.c());
        if (resultReceiverB2 != null) {
            resultReceiverB2.send(101, bundle2);
        } else {
            com.heytap.accessory.base.logging.a.b(str, "onTransferComplete Receiver: Callback not yet registered for transaction id: " + setupRequest.f());
        }
        n.remove(c(setupRequest.c(), setupRequest.f()));
        d(setupRequest.c(), setupRequest.f());
        com.heytap.accessory.base.logging.a.d(str, "onTransferComplete:ReceiveQueue Size:" + n.size());
        com.heytap.accessory.base.logging.a.d(str, "onTransferComplete:SendQueue Size:" + o.size());
    }

    @Override // com.heytap.accessory.stream.c
    public void a(int i) {
        e eVar = this.c.get(Integer.valueOf(i));
        if (eVar != null) {
            o.remove(eVar);
            b(eVar.a().a(), i);
        }
        com.heytap.accessory.base.logging.a.c(j, "[onTransferCompleted] requestProcessQueue:SendQueue Size:" + o.size());
        synchronized (k) {
            p = "Idle";
        }
        f();
    }

    public static synchronized d a(Context context) {
        d dVar;
        synchronized (d.class) {
            if (m == null) {
                m = new d(context);
            }
            dVar = m;
        }
        return dVar;
        return dVar;
    }

    public boolean a(int i, ResultReceiver resultReceiver) {
        for (e eVar : o) {
            if (i == eVar.d()) {
                eVar.a(resultReceiver);
                f();
                return true;
            }
        }
        for (e eVar2 : n) {
            if (i == eVar2.d()) {
                eVar2.a(resultReceiver);
                return true;
            }
        }
        com.heytap.accessory.base.logging.a.e(j, "RegisterCallback- transaction id: " + i + " not found!");
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x007e  */
    /* JADX WARN: Code duplicated, block: B:24:0x0087 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x0089  */
    /* JADX WARN: Code duplicated, block: B:26:0x00ac  */
    /* JADX WARN: Instruction removed from duplicated block: B:25:0x0089, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:26:0x00ac, please report this as an issue */
    public Bundle a(com.heytap.accessory.stream.model.b bVar, String str, String str2, ParcelFileDescriptor parcelFileDescriptor) {
        com.heytap.accessory.stream.sender.a aVar;
        Bundle bundle = new Bundle();
        if (!com.heytap.accessory.base.a.a(3, bVar.a(), bVar.b(), bVar.c())) {
            com.heytap.accessory.base.logging.a.e(j, "sendStream accId:" + bVar.a() + " agentId:" + bVar.c() + " is dormant, ignore request!");
            bundle.putInt("ID", -2);
            bundle.putBoolean("STATUS", false);
            return bundle;
        }
        if (this.e == null) {
            BaseJobAgent.requestAgent(this.a, StreamProviderImpl.class.getName(), this.g);
            synchronized (m) {
                while (this.e == null) {
                    try {
                        m.wait();
                    } catch (InterruptedException unused) {
                        com.heytap.accessory.base.logging.a.d(j, "Provider service binding interrupted");
                        aVar = this.e;
                        if (aVar == null) {
                            com.heytap.accessory.base.logging.a.d(j, "Provider service binding failed");
                            return null;
                        }
                        if (str == null) {
                            str = aVar.getAgentPackagename(bVar.b());
                            com.heytap.accessory.base.logging.a.d(j, "Fetching package name for agent : " + bVar.b());
                        } else {
                            String agentId = aVar.getAgentId(str, str2);
                            com.heytap.accessory.base.logging.a.d(j, "AgentId fetched for " + str2 + " : " + agentId);
                            bVar.a(agentId);
                        }
                        String str3 = j;
                        com.heytap.accessory.base.logging.a.d(str3, "Validating Package Name: " + str);
                        int iE = e();
                        e eVar = new e(iE, bVar, 0L, parcelFileDescriptor);
                        eVar.a(1);
                        o.add(eVar);
                        com.heytap.accessory.base.logging.a.d(str3, "sendInputStream: SendQueue Size:" + o.size() + " id generated = " + iE);
                        bundle.putInt("ID", iE);
                        bundle.putBoolean("STATUS", true);
                        return bundle;
                    }
                }
            }
        }
        aVar = this.e;
        if (aVar == null) {
            com.heytap.accessory.base.logging.a.d(j, "Provider service binding failed");
            return null;
        }
        if (str == null) {
            str = aVar.getAgentPackagename(bVar.b());
            com.heytap.accessory.base.logging.a.d(j, "Fetching package name for agent : " + bVar.b());
        } else {
            String agentId2 = aVar.getAgentId(str, str2);
            com.heytap.accessory.base.logging.a.d(j, "AgentId fetched for " + str2 + " : " + agentId2);
            bVar.a(agentId2);
        }
        String str4 = j;
        com.heytap.accessory.base.logging.a.d(str4, "Validating Package Name: " + str);
        int iE2 = e();
        e eVar2 = new e(iE2, bVar, 0L, parcelFileDescriptor);
        eVar2.a(1);
        o.add(eVar2);
        com.heytap.accessory.base.logging.a.d(str4, "sendInputStream: SendQueue Size:" + o.size() + " id generated = " + iE2);
        bundle.putInt("ID", iE2);
        bundle.putBoolean("STATUS", true);
        return bundle;
    }

    public void a(long j2, int i) {
        e eVar;
        e eVarC = c(j2, i);
        e eVar2 = this.c.get(Integer.valueOf(i));
        String str = j;
        com.heytap.accessory.base.logging.a.d(str, "cancelStream-Id: " + i);
        if (eVarC != null && eVarC.d() == i) {
            Bundle bundle = new Bundle();
            bundle.putLong("EXTRA_KEY_CONNECTION_KEY", j2);
            Message messageObtainMessage = this.h.obtainMessage(1, bundle);
            messageObtainMessage.arg1 = i;
            messageObtainMessage.sendToTarget();
            return;
        }
        if (eVar2 != null && eVar2.d() == i) {
            com.heytap.accessory.stream.sender.a aVar = this.e;
            if (aVar != null && aVar.a(j2, i)) {
                com.heytap.accessory.base.logging.a.e(str, "Cancel request has already been received from remote for transaction: " + i + ". Returning..");
                return;
            }
            Message messageObtainMessage2 = this.i.obtainMessage(1);
            messageObtainMessage2.arg1 = i;
            Bundle data = messageObtainMessage2.getData();
            data.putInt("transId", i);
            messageObtainMessage2.setData(data);
            messageObtainMessage2.sendToTarget();
            return;
        }
        Iterator<e> it = o.iterator();
        while (true) {
            if (!it.hasNext()) {
                eVar = null;
                break;
            }
            e next = it.next();
            if (next.d() == i) {
                eVar = next;
                break;
            }
        }
        if (eVar != null) {
            ResultReceiver resultReceiverB = eVar.b();
            int iD = eVar.d();
            eVar.a(6);
            Bundle bundle2 = new Bundle();
            try {
                bundle2.putString("CallBackJson", new TransferErrorMsg(j2, iD, 9, "User Cancelled Error").toJSON().toString());
            } catch (JSONException unused) {
                com.heytap.accessory.base.logging.a.d(j, "json marshaling failed");
            }
            if (resultReceiverB != null) {
                resultReceiverB.send(102, bundle2);
            } else {
                com.heytap.accessory.base.logging.a.b(j, "cancelStream: Callback not yet registered for transaction id: " + iD);
            }
            o.remove(eVar);
            b(eVar.d());
            return;
        }
        com.heytap.accessory.base.logging.a.d(j, "cancelStream: wrong transactionId");
    }

    public int a(String str) {
        String str2 = j;
        com.heytap.accessory.base.logging.a.a(str2, "[cancelAll] - agentId: " + str);
        List<e> listB = b(str);
        if (listB.isEmpty()) {
            com.heytap.accessory.base.logging.a.a(str2, "sendingTask.isEmpty()");
            return a(str, (e) null);
        }
        for (e eVar : listB) {
            eVar.a(9);
            CancelRequest cancelRequest = new CancelRequest(eVar.d, 9);
            com.heytap.accessory.stream.sender.a aVar = this.e;
            if (aVar != null) {
                aVar.a(cancelRequest);
            }
        }
        com.heytap.accessory.base.logging.a.d(j, "sSendQueue size = " + o.size());
        return 1;
    }

    public int a(long j2) {
        com.heytap.accessory.base.logging.a.a(j, "cancelAll connectionId:" + j2);
        Map<Integer, e> mapC = c(j2);
        if (mapC == null) {
            return 1;
        }
        Iterator<Integer> it = mapC.keySet().iterator();
        while (it.hasNext()) {
            int iIntValue = it.next().intValue();
            Bundle bundle = new Bundle();
            bundle.putLong("EXTRA_KEY_CONNECTION_KEY", j2);
            Message messageObtainMessage = this.h.obtainMessage(1, bundle);
            messageObtainMessage.arg1 = iIntValue;
            messageObtainMessage.sendToTarget();
        }
        return 1;
    }

    public final int a(String str, e eVar) {
        ResultReceiver resultReceiverB;
        com.heytap.accessory.base.logging.a.d(j, "cancelAllforAgent " + str);
        ArrayList arrayList = new ArrayList();
        if (eVar != null) {
            arrayList.add(Integer.valueOf(eVar.d()));
            resultReceiverB = eVar.b();
            o.remove(eVar);
            b(eVar.d());
            b(eVar.a().a(), eVar.d());
        } else {
            resultReceiverB = null;
        }
        for (e eVar2 : o) {
            if (str.equals(eVar2.a().b())) {
                eVar2.a(6);
                arrayList.add(Integer.valueOf(eVar2.d()));
                resultReceiverB = eVar2.b();
                o.remove(eVar2);
                b(eVar2.d());
                b(eVar2.a().a(), eVar2.d());
            }
        }
        Bundle bundle = new Bundle();
        int size = arrayList.size();
        int[] iArr = new int[size];
        int size2 = arrayList.size();
        for (int i = 0; i < size2; i++) {
            iArr[i] = ((Integer) arrayList.get(i)).intValue();
        }
        if (resultReceiverB != null) {
            try {
                bundle.putString("CallBackJson", new MultiTransferErrorMsg(iArr, 0, "User Cancelled Error").toJSON().toString());
            } catch (JSONException unused) {
                com.heytap.accessory.base.logging.a.d(j, "json marshaling failed");
            }
            resultReceiverB.send(103, bundle);
            if (eVar == null) {
                return 1;
            }
            synchronized (k) {
                p = "Idle";
            }
            f();
            return 1;
        }
        com.heytap.accessory.base.logging.a.d(j, "Cannot find transactions for AgentId " + str + " array " + size);
        return 13;
    }

    public Bundle a(long j2, int i, boolean z) {
        String str = j;
        com.heytap.accessory.base.logging.a.c(str, "receiveStream connectionId=" + j2 + " transactionId=" + i);
        e eVarC = c(j2, i);
        if (eVarC != null && this.d != null) {
            if (i != eVarC.d()) {
                com.heytap.accessory.base.logging.a.b(str, "receiveStream: invalid value RcvTrId:" + i + " CurTrID:" + eVarC.d());
                return this.d.a(j2, i, 3, false);
            }
            if (5 != eVarC.e()) {
                com.heytap.accessory.base.logging.a.b(str, "receiveStream: receive request in wrong state");
                return null;
            }
            if (z) {
                return this.d.a(j2, i, -1, true);
            }
            com.heytap.accessory.base.logging.a.e(str, "receiveStream: Reject Received");
            eVarC.a(4);
            return this.d.a(j2, i, 9, false);
        }
        com.heytap.accessory.base.logging.a.b(str, "(currentReceiveLockerTask == null) || (this.mStreamConsumerAction == null)");
        return null;
    }

    public final void a(long j2, int i, e eVar) {
        synchronized (this.b) {
            Map<Integer, e> map = this.b.get(Long.valueOf(j2));
            if (map == null) {
                map = new HashMap<>();
                this.b.put(Long.valueOf(j2), map);
            }
            map.put(Integer.valueOf(i), eVar);
        }
    }
}
