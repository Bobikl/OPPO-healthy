package com.heytap.accessory.file;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.ResultReceiver;
import android.util.Log;
import android.util.SparseArray;
import com.heytap.accessory.BaseJobAgent;
import com.heytap.accessory.base.AccessoryManager;
import com.heytap.accessory.file.model.CancelRequest;
import com.heytap.accessory.file.model.Constant;
import com.heytap.accessory.file.model.CtrlResponse;
import com.heytap.accessory.file.model.MultiTransferErrorMsg;
import com.heytap.accessory.file.model.SetupRequest;
import com.heytap.accessory.file.model.TransferCompleteMsg;
import com.heytap.accessory.file.model.TransferErrorMsg;
import com.heytap.accessory.file.model.TransferProgress;
import com.heytap.accessory.file.receiver.FileConsumerImpl;
import com.heytap.accessory.file.sender.FileProviderImpl;
import com.heytap.accessory.utils.statis.StatisticsTpForStandard;
import java.io.File;
import java.io.IOException;
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
public class e implements com.heytap.accessory.file.d {
    public static final String l = "e";
    public static final Object m;
    public static Random n;
    public static e o;
    public static CopyOnWriteArrayList<c> p;
    public static CopyOnWriteArrayList<c> q;
    public static String r;
    public static Set<Integer> s;
    public Context a;
    public Map<Long, Map<Integer, c>> b = new HashMap();
    public Map<Integer, c> c = new HashMap();
    public com.heytap.accessory.file.receiver.b d = null;
    public com.heytap.accessory.file.sender.b e = null;
    public SparseArray<Long> f = new SparseArray<>();
    public SparseArray<Long> g = new SparseArray<>();
    public BaseJobAgent.RequestAgentCallback h = new a();
    public BaseJobAgent.RequestAgentCallback i = new b();
    public d j;
    public e k;

    public class a implements BaseJobAgent.RequestAgentCallback {
        public a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.heytap.accessory.BaseJobAgent.RequestAgentCallback
        public void onAgentAvailable(BaseJobAgent baseJobAgent) {
            com.heytap.accessory.base.logging.a.a(e.l, "Connected to consumer FT service");
            synchronized (e.o) {
                e.this.d = (com.heytap.accessory.file.receiver.b) baseJobAgent;
                if (com.heytap.accessory.file.utils.b.a() != null) {
                    e.this.j = e.this.new d(com.heytap.accessory.file.utils.b.a());
                }
                e.o.notifyAll();
            }
        }

        @Override // com.heytap.accessory.BaseJobAgent.RequestAgentCallback
        public void onError(int i, String str) {
            com.heytap.accessory.base.logging.a.a(e.l, "File transfer connection closed");
            e.this.d = null;
        }
    }

    public class b implements BaseJobAgent.RequestAgentCallback {
        public b() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.heytap.accessory.BaseJobAgent.RequestAgentCallback
        public void onAgentAvailable(BaseJobAgent baseJobAgent) {
            com.heytap.accessory.base.logging.a.a(e.l, "Connected to provider FT service");
            synchronized (e.o) {
                e.this.e = (com.heytap.accessory.file.sender.b) baseJobAgent;
                e.this.e.a(e.this);
                if (com.heytap.accessory.file.utils.b.b() != null) {
                    e.this.k = e.this.new e(com.heytap.accessory.file.utils.b.b());
                }
                e.o.notifyAll();
            }
        }

        @Override // com.heytap.accessory.BaseJobAgent.RequestAgentCallback
        public void onError(int i, String str) {
            com.heytap.accessory.base.logging.a.a(e.l, "File transfer connection closed");
            e.this.e = null;
        }
    }

    public static class c {
        public com.heytap.accessory.file.model.b a;
        public String b;
        public ResultReceiver c;
        public String d;
        public String e;
        public long f;
        public String g;
        public String h;
        public int i = 1;
        public int j;
        public long k;

        public c(int i, String str, String str2, String str3, String str4, long j, com.heytap.accessory.file.model.b bVar, String str5, long j2) {
            this.j = i;
            this.d = str;
            this.g = str2;
            this.b = str3;
            this.h = str4;
            this.f = j;
            this.a = bVar;
            this.e = str5;
            this.k = j2;
        }

        public com.heytap.accessory.file.model.b a() {
            return this.a;
        }

        public void b(String str) {
            this.b = str;
        }

        public long c() {
            return this.k;
        }

        public String d() {
            return this.b;
        }

        public String e() {
            return this.h;
        }

        public String f() {
            return this.e;
        }

        public int g() {
            return this.j;
        }

        public String h() {
            return this.d;
        }

        public long i() {
            return this.f;
        }

        public String j() {
            return this.g;
        }

        public int k() {
            return this.i;
        }

        public void a(ResultReceiver resultReceiver) {
            this.c = resultReceiver;
        }

        public ResultReceiver b() {
            return this.c;
        }

        public void a(int i) {
            this.i = i;
        }

        public void a(String str) {
            this.e = str;
        }
    }

    public class d extends Handler {
        public d(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 1) {
                com.heytap.accessory.base.logging.a.e(e.l, "Invalid msg type received in ReceiverHandler : " + message.what);
                return;
            }
            Bundle bundle = (Bundle) message.obj;
            if (bundle == null) {
                com.heytap.accessory.base.logging.a.e(e.l, "bundle is null!");
                return;
            }
            c cVarC = e.this.c(bundle.getLong("EXTRA_KEY_CONNECTION_KEY"), message.arg1);
            if (cVarC == null) {
                com.heytap.accessory.base.logging.a.e(e.l, "Current receive locker task is null!");
                return;
            }
            String strH = cVarC.h();
            String str = e.l;
            com.heytap.accessory.base.logging.a.d(str, "fileName requesting cancel for:" + strH);
            cVarC.a(6);
            CancelRequest cancelRequest = new CancelRequest(cVarC.j, 9, strH);
            cancelRequest.a(cVarC.c());
            com.heytap.accessory.base.logging.a.d(str, "sReceiveQueue size = " + e.p.size());
            if (e.this.d == null || e.p.isEmpty()) {
                return;
            }
            e.this.d.a(cancelRequest);
        }
    }

    public class e extends Handler {
        public e(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 1) {
                com.heytap.accessory.base.logging.a.e(e.l, "Invalid msg type received in SenderHandler : " + message.what);
                return;
            }
            int i = message.getData().getInt("transId", -1);
            if (i == -1) {
                return;
            }
            c cVar = (c) e.this.c.get(Integer.valueOf(i));
            if (cVar == null) {
                com.heytap.accessory.base.logging.a.e(e.l, "Current send locker task is null!");
                return;
            }
            String strH = cVar.h();
            String str = e.l;
            com.heytap.accessory.base.logging.a.d(str, "fileName requesting cancel for:" + strH);
            cVar.a(6);
            CancelRequest cancelRequest = new CancelRequest(cVar.j, 9, strH);
            if (e.this.e != null) {
                e.this.e.a(cancelRequest);
            }
            com.heytap.accessory.base.logging.a.d(str, "sSendQueue size = " + e.q.size());
        }
    }

    static {
        Arrays.asList(101, 102, 103, 104, 105);
        m = new Object();
        n = new SecureRandom();
        o = null;
        p = new CopyOnWriteArrayList<>();
        q = new CopyOnWriteArrayList<>();
        r = "Idle";
        s = new HashSet();
    }

    public e(Context context) {
        this.a = context;
    }

    public static synchronized int d() {
        int iNextInt;
        synchronized (s) {
            do {
                iNextInt = n.nextInt();
            } while (s.contains(Integer.valueOf(iNextInt)));
            s.add(Integer.valueOf(iNextInt));
        }
        return iNextInt;
    }

    public final boolean c(String str) {
        return str != null;
    }

    public final void e() {
        int iB;
        if (q.isEmpty()) {
            return;
        }
        Object obj = m;
        synchronized (obj) {
            if ("Idle".equals(r)) {
                r = "busy";
            }
        }
        c cVar = q.get(0);
        if (cVar == null || cVar.a() == null) {
            com.heytap.accessory.base.logging.a.b(l, "Current locker task or agent is null!");
            return;
        }
        long jA = cVar.a().a();
        if (AccessoryManager.h().a(jA) == null) {
            com.heytap.accessory.base.logging.a.e(l, "current accessory not exist,clearTransferQueue,accId:" + jA);
            q.remove(cVar);
            e();
            return;
        }
        if (this.e.a(jA) || (iB = this.e.b(cVar.a().a())) == -1) {
            return;
        }
        q.remove(cVar);
        String str = l;
        com.heytap.accessory.base.logging.a.a(str, "[SFTrack] process task from queue: " + cVar.j + ", channelId:" + iB);
        this.c.put(Integer.valueOf(cVar.j), cVar);
        if (cVar.b() == null) {
            com.heytap.accessory.base.logging.a.b(str, "Callback is null! Skip sending the file!");
            b(cVar.a.a(), cVar.j);
            synchronized (obj) {
                r = "Idle";
            }
        } else {
            String strF = cVar.f();
            SetupRequest setupRequest = new SetupRequest(cVar.g(), cVar.h(), cVar.j(), cVar.d(), cVar.e(), cVar.i(), cVar.a().a(), cVar.a().b(), cVar.a().c(), iB, com.heytap.accessory.misc.utils.c.a(this.a, cVar.h(), strF));
            com.heytap.accessory.base.logging.a.a(str, "FTProvider push " + cVar.k() + " , " + setupRequest.l());
            if (this.e != null && cVar.k() == 1) {
                cVar.a(2);
                this.e.a(strF, setupRequest);
                return;
            }
            com.heytap.accessory.base.logging.a.d(str, "FTProvider service not connected/send task is null");
        }
        e();
    }

    public static void b(long j) {
        for (c cVar : q) {
            if (cVar.a().a() == j) {
                q.remove(cVar);
            }
        }
        for (c cVar2 : p) {
            if (cVar2.a().a() == j) {
                p.remove(cVar2);
            }
        }
        com.heytap.accessory.base.logging.a.a(l, "accessoryId:" + j + " clearTransferQueue, SendQueue leftCount:" + q.size());
    }

    public final c c(long j, int i) {
        c cVar;
        synchronized (this.b) {
            Map<Integer, c> map = this.b.get(Long.valueOf(j));
            cVar = map != null ? map.get(Integer.valueOf(i)) : null;
        }
        return cVar;
    }

    public final List<c> d(long j) {
        ArrayList arrayList = new ArrayList();
        for (c cVar : q) {
            if (cVar.a.a() == j) {
                arrayList.add(cVar);
            }
        }
        return arrayList;
    }

    public static synchronized e a(Context context) {
        e eVar;
        synchronized (e.class) {
            if (o == null) {
                o = new e(context);
            }
            eVar = o;
        }
        return eVar;
        return eVar;
    }

    public final Map<Integer, c> c(long j) {
        Map<Integer, c> map;
        synchronized (this.b) {
            map = this.b.get(Long.valueOf(j));
        }
        return map;
    }

    @Override // com.heytap.accessory.file.d
    public void b(SetupRequest setupRequest) {
        int iL = setupRequest.l();
        long jC = setupRequest.c();
        c cVar = this.c.get(Integer.valueOf(iL));
        if (cVar == null || cVar.g() != iL) {
            return;
        }
        ResultReceiver resultReceiverB = cVar.b();
        Bundle bundle = new Bundle();
        try {
            bundle.putString("CallBackJson", new TransferProgress(jC, iL, 0L).toJSON().toString());
        } catch (JSONException unused) {
            com.heytap.accessory.base.logging.a.d(l, "json marshaling failed");
        }
        String str = l;
        com.heytap.accessory.base.logging.a.a(str, "onSetupResp send:" + resultReceiverB);
        if (resultReceiverB != null) {
            resultReceiverB.send(99, bundle);
            return;
        }
        com.heytap.accessory.base.logging.a.b(str, "onProgressChanged Sender: Callback not yet registered for transaction id: " + iL);
    }

    public boolean a(int i, ResultReceiver resultReceiver) {
        for (c cVar : q) {
            if (i == cVar.g()) {
                cVar.a(resultReceiver);
                e();
                return true;
            }
        }
        for (c cVar2 : p) {
            if (i == cVar2.g()) {
                cVar2.a(resultReceiver);
                return true;
            }
        }
        com.heytap.accessory.base.logging.a.e(l, "RegisterCallback- transaction id: " + i + " not found!");
        return false;
    }

    public final void b(int i) {
        synchronized (s) {
            s.remove(Integer.valueOf(i));
        }
    }

    public final boolean a(String str, String str2) {
        try {
            String canonicalPath = new File(str2).getCanonicalPath();
            if (!canonicalPath.contains("/data/data/")) {
                return true;
            }
            com.heytap.accessory.base.logging.a.b(l, "validateFileSource wrong file path  " + canonicalPath);
            return false;
        } catch (IOException unused) {
            com.heytap.accessory.base.logging.a.b(l, "validateFileSource Exception occured for file path  " + str2);
            return false;
        }
    }

    public final List<c> b(String str) {
        ArrayList arrayList = new ArrayList();
        synchronized (this.c) {
            for (Map.Entry<Integer, c> entry : this.c.entrySet()) {
                if (entry.getValue().a().b().equals(str)) {
                    arrayList.add(entry.getValue());
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x008b  */
    /* JADX WARN: Code duplicated, block: B:24:0x0093 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x0095  */
    /* JADX WARN: Code duplicated, block: B:26:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:45:0x0165 A[Catch: all -> 0x01c2, Exception -> 0x01c5, TryCatch #2 {Exception -> 0x01c5, blocks: (B:43:0x014b, B:45:0x0165, B:47:0x0183, B:48:0x01b4, B:49:0x01ba), top: B:67:0x014b, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x0183 A[Catch: all -> 0x01c2, Exception -> 0x01c5, TryCatch #2 {Exception -> 0x01c5, blocks: (B:43:0x014b, B:45:0x0165, B:47:0x0183, B:48:0x01b4, B:49:0x01ba), top: B:67:0x014b, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x01b4 A[Catch: all -> 0x01c2, Exception -> 0x01c5, TryCatch #2 {Exception -> 0x01c5, blocks: (B:43:0x014b, B:45:0x0165, B:47:0x0183, B:48:0x01b4, B:49:0x01ba), top: B:67:0x014b, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x01ba A[Catch: all -> 0x01c2, Exception -> 0x01c5, TRY_LEAVE, TryCatch #2 {Exception -> 0x01c5, blocks: (B:43:0x014b, B:45:0x0165, B:47:0x0183, B:48:0x01b4, B:49:0x01ba), top: B:67:0x014b, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x01cf A[PHI: r2 r4 r8
  0x01cf: PHI (r2v1 long) = (r2v0 long), (r2v2 long) binds: [B:56:0x01cd, B:50:0x01bf] A[DONT_GENERATE, DONT_INLINE]
  0x01cf: PHI (r4v1 java.lang.String) = (r4v0 java.lang.String), (r4v2 java.lang.String) binds: [B:56:0x01cd, B:50:0x01bf] A[DONT_GENERATE, DONT_INLINE]
  0x01cf: PHI (r8v1 android.database.Cursor) = (r8v0 android.database.Cursor), (r8v2 android.database.Cursor) binds: [B:56:0x01cd, B:50:0x01bf] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:61:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:67:0x014b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:25:0x0095, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:26:0x00ba, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:45:0x0165, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:47:0x0183, please report this as an issue */
    public Bundle a(String str, String str2, String str3, com.heytap.accessory.file.model.b bVar, long j, String str4, String str5, String str6, String str7) {
        com.heytap.accessory.file.sender.b bVar2;
        Cursor cursorQuery;
        String str8;
        int iD;
        long j2;
        long j3 = j;
        String string = str4;
        String agentPackagename = str6;
        Bundle bundle = new Bundle();
        if (!com.heytap.accessory.base.a.a(3, bVar.a(), bVar.b(), bVar.c())) {
            com.heytap.accessory.base.logging.a.e(l, "sendFile accId:" + bVar.a() + " agentId:" + bVar.c() + " is dormant, ignore request!");
            bundle.putInt("ID", -2);
            bundle.putBoolean("STATUS", false);
            return bundle;
        }
        if (this.e == null) {
            BaseJobAgent.requestAgent(this.a, FileProviderImpl.class.getName(), this.i);
            synchronized (o) {
                while (this.e == null) {
                    try {
                        o.wait();
                    } catch (InterruptedException unused) {
                        com.heytap.accessory.base.logging.a.d(l, "Provider service binding interrupted");
                        bVar2 = this.e;
                        cursorQuery = null;
                        if (bVar2 == null) {
                            com.heytap.accessory.base.logging.a.d(l, "Provider service binding failed");
                            return null;
                        }
                        if (agentPackagename == null) {
                            agentPackagename = bVar2.getAgentPackagename(bVar.b());
                            com.heytap.accessory.base.logging.a.d(l, "Fetching package name for agent : " + bVar.b());
                        } else {
                            String agentId = bVar2.getAgentId(agentPackagename, str7);
                            com.heytap.accessory.base.logging.a.d(l, "AgentId fetched for " + str7 + " : " + agentId);
                            bVar.a(agentId);
                        }
                        str8 = l;
                        com.heytap.accessory.base.logging.a.d(str8, "Validating Package Name: " + agentPackagename);
                        if (str5 != null) {
                        }
                        iD = d();
                        com.heytap.accessory.base.logging.a.d(str8, "Source: " + str + " Size:" + j3 + " , name " + string);
                        if (j3 != 0) {
                            try {
                                try {
                                    cursorQuery = this.a.getContentResolver().query(Uri.parse(str5), null, null, null, null, null);
                                    if (cursorQuery != null) {
                                        com.heytap.accessory.base.logging.a.a(str8, "item size : " + cursorQuery.getCount());
                                        if (cursorQuery.moveToFirst()) {
                                            j3 = cursorQuery.getLong(cursorQuery.getColumnIndex("_size"));
                                            string = cursorQuery.getString(cursorQuery.getColumnIndex("_display_name"));
                                            com.heytap.accessory.base.logging.a.c(str8, "send File: fileSize = " + j3 + " fileName = " + string);
                                        } else {
                                            com.heytap.accessory.base.logging.a.e(str8, "send File: empty");
                                        }
                                    } else {
                                        com.heytap.accessory.base.logging.a.b(str8, "send File: null");
                                    }
                                    if (cursorQuery != null) {
                                        cursorQuery.close();
                                    }
                                } catch (Exception e2) {
                                    com.heytap.accessory.base.logging.a.a(l, "send File error", e2);
                                    if (0 != 0) {
                                        cursorQuery.close();
                                    }
                                }
                            } catch (Throwable th) {
                                if (0 != 0) {
                                    cursorQuery.close();
                                }
                                throw th;
                            }
                        } else {
                            cursorQuery = this.a.getContentResolver().query(Uri.parse(str5), null, null, null, null, null);
                            if (cursorQuery != null) {
                                com.heytap.accessory.base.logging.a.a(str8, "item size : " + cursorQuery.getCount());
                                if (cursorQuery.moveToFirst()) {
                                    j3 = cursorQuery.getLong(cursorQuery.getColumnIndex("_size"));
                                    string = cursorQuery.getString(cursorQuery.getColumnIndex("_display_name"));
                                    com.heytap.accessory.base.logging.a.c(str8, "send File: fileSize = " + j3 + " fileName = " + string);
                                } else {
                                    com.heytap.accessory.base.logging.a.e(str8, "send File: empty");
                                }
                            } else {
                                com.heytap.accessory.base.logging.a.b(str8, "send File: null");
                            }
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                        }
                        j2 = j3;
                        if (str5 != null) {
                            c cVar = new c(iD, string, str, str2, str3, j2, bVar, str5, 0L);
                            cVar.a(1);
                            q.add(cVar);
                        } else {
                            File file = new File(str);
                            c cVar2 = new c(iD, file.getName(), str, str2, str3, file.length(), bVar, null, 0L);
                            cVar2.a(1);
                            q.add(cVar2);
                        }
                        StatisticsTpForStandard.onFileStart();
                        this.f.put(iD, Long.valueOf(System.currentTimeMillis()));
                        this.g.put(iD, Long.valueOf(j2));
                        com.heytap.accessory.base.logging.a.d(l, "sendFile: SendQueue Size:" + q.size() + " id generated = " + iD);
                        bundle.putInt("ID", iD);
                        bundle.putBoolean("STATUS", true);
                        return bundle;
                    }
                }
            }
        }
        bVar2 = this.e;
        cursorQuery = null;
        if (bVar2 == null) {
            com.heytap.accessory.base.logging.a.d(l, "Provider service binding failed");
            return null;
        }
        if (agentPackagename == null) {
            agentPackagename = bVar2.getAgentPackagename(bVar.b());
            com.heytap.accessory.base.logging.a.d(l, "Fetching package name for agent : " + bVar.b());
        } else {
            String agentId2 = bVar2.getAgentId(agentPackagename, str7);
            com.heytap.accessory.base.logging.a.d(l, "AgentId fetched for " + str7 + " : " + agentId2);
            bVar.a(agentId2);
        }
        str8 = l;
        com.heytap.accessory.base.logging.a.d(str8, "Validating Package Name: " + agentPackagename);
        if (str5 != null && !a(agentPackagename, str)) {
            throw new IllegalArgumentException("Wrong file path!");
        }
        iD = d();
        com.heytap.accessory.base.logging.a.d(str8, "Source: " + str + " Size:" + j3 + " , name " + string);
        if (j3 != 0 || "null".equals(string) || string == null || str4.isEmpty()) {
            cursorQuery = this.a.getContentResolver().query(Uri.parse(str5), null, null, null, null, null);
            if (cursorQuery != null) {
                com.heytap.accessory.base.logging.a.a(str8, "item size : " + cursorQuery.getCount());
                if (cursorQuery.moveToFirst()) {
                    j3 = cursorQuery.getLong(cursorQuery.getColumnIndex("_size"));
                    string = cursorQuery.getString(cursorQuery.getColumnIndex("_display_name"));
                    com.heytap.accessory.base.logging.a.c(str8, "send File: fileSize = " + j3 + " fileName = " + string);
                } else {
                    com.heytap.accessory.base.logging.a.e(str8, "send File: empty");
                }
            } else {
                com.heytap.accessory.base.logging.a.b(str8, "send File: null");
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
        j2 = j3;
        if (str5 != null) {
            c cVar3 = new c(iD, string, str, str2, str3, j2, bVar, str5, 0L);
            cVar3.a(1);
            q.add(cVar3);
        } else {
            File file2 = new File(str);
            c cVar4 = new c(iD, file2.getName(), str, str2, str3, file2.length(), bVar, null, 0L);
            cVar4.a(1);
            q.add(cVar4);
        }
        StatisticsTpForStandard.onFileStart();
        this.f.put(iD, Long.valueOf(System.currentTimeMillis()));
        this.g.put(iD, Long.valueOf(j2));
        com.heytap.accessory.base.logging.a.d(l, "sendFile: SendQueue Size:" + q.size() + " id generated = " + iD);
        bundle.putInt("ID", iD);
        bundle.putBoolean("STATUS", true);
        return bundle;
    }

    public void b(long j, int i) {
        b(i);
        this.c.remove(Integer.valueOf(i));
    }

    public boolean e(long j) {
        com.heytap.accessory.base.logging.a.a(l, "CCR : " + d(j).size());
        if (d(j).size() > 0) {
            return false;
        }
        this.e.c(j);
        return false;
    }

    public void a(long j, int i) {
        c cVar;
        c cVarC = c(j, i);
        String str = l;
        com.heytap.accessory.base.logging.a.d(str, "[SFTrack] cancelFile-Id: " + i);
        if (cVarC != null && cVarC.g() == i) {
            Bundle bundle = new Bundle();
            bundle.putLong("EXTRA_KEY_CONNECTION_KEY", j);
            Message messageObtainMessage = this.j.obtainMessage(1, bundle);
            messageObtainMessage.arg1 = i;
            messageObtainMessage.sendToTarget();
            return;
        }
        if (!this.c.isEmpty() && this.c.containsKey(Integer.valueOf(i))) {
            com.heytap.accessory.file.sender.b bVar = this.e;
            if (bVar != null && bVar.a(j, i)) {
                com.heytap.accessory.base.logging.a.e(str, "[SFTrack] Cancel request has already been received from remote for transaction: " + i + ". Returning..");
                return;
            }
            Message messageObtainMessage2 = this.k.obtainMessage(1);
            messageObtainMessage2.arg1 = i;
            Bundle data = messageObtainMessage2.getData();
            data.putInt("transId", i);
            messageObtainMessage2.setData(data);
            messageObtainMessage2.sendToTarget();
            return;
        }
        Iterator<c> it = q.iterator();
        while (true) {
            if (!it.hasNext()) {
                cVar = null;
                break;
            }
            c next = it.next();
            if (next.g() == i) {
                cVar = next;
                break;
            }
        }
        if (cVar != null) {
            ResultReceiver resultReceiverB = cVar.b();
            int iG = cVar.g();
            cVar.a(6);
            Bundle bundle2 = new Bundle();
            try {
                bundle2.putString("CallBackJson", new TransferErrorMsg(j, iG, 9, "User Cancelled Error").toJSON().toString());
            } catch (JSONException unused) {
                com.heytap.accessory.base.logging.a.d(l, "json marshaling failed");
            }
            if (resultReceiverB != null) {
                resultReceiverB.send(102, bundle2);
            } else {
                com.heytap.accessory.base.logging.a.b(l, "[SFTrack] cancelFile: Callback not yet registered for transaction id: " + iG);
            }
            q.remove(cVar);
            b(cVar.g());
            return;
        }
        com.heytap.accessory.base.logging.a.e(l, "[SFTrack] cancelFile: wrong transactionId");
    }

    public int a(String str) {
        List<c> listB = b(str);
        String str2 = l;
        StringBuilder sb = new StringBuilder();
        sb.append("Cancel all -agentId: ");
        sb.append(str);
        sb.append(" , ");
        sb.append(listB == null);
        com.heytap.accessory.base.logging.a.d(str2, sb.toString());
        if (listB.isEmpty()) {
            return a(str, (c) null);
        }
        for (c cVar : listB) {
            String strH = cVar.h();
            com.heytap.accessory.base.logging.a.d(l, "fileName requesting cancel for:" + strH);
            cVar.a(9);
            CancelRequest cancelRequest = new CancelRequest(cVar.j, 9, strH);
            com.heytap.accessory.file.sender.b bVar = this.e;
            if (bVar != null) {
                bVar.a(cancelRequest);
            }
        }
        com.heytap.accessory.base.logging.a.d(l, "sSendQueue size = " + q.size());
        return 1;
    }

    public int a(long j) {
        Iterator<Integer> it = c(j).keySet().iterator();
        while (it.hasNext()) {
            int iIntValue = it.next().intValue();
            Bundle bundle = new Bundle();
            bundle.putLong("EXTRA_KEY_CONNECTION_KEY", j);
            Message messageObtainMessage = this.j.obtainMessage(1, bundle);
            messageObtainMessage.arg1 = iIntValue;
            messageObtainMessage.sendToTarget();
        }
        return 1;
    }

    public final int a(String str, c cVar) {
        ResultReceiver resultReceiverB;
        com.heytap.accessory.base.logging.a.d(l, "cancelAllforAgent " + str);
        ArrayList arrayList = new ArrayList();
        if (cVar != null) {
            arrayList.add(Integer.valueOf(cVar.g()));
            resultReceiverB = cVar.b();
            q.remove(cVar);
            b(cVar.g());
            b(cVar.a().a(), cVar.g());
        } else {
            resultReceiverB = null;
        }
        for (c cVar2 : q) {
            if (str.equals(cVar2.a().b())) {
                cVar2.a(6);
                arrayList.add(Integer.valueOf(cVar2.g()));
                resultReceiverB = cVar2.b();
                q.remove(cVar2);
                b(cVar2.g());
                b(cVar2.a().a(), cVar2.g());
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
                com.heytap.accessory.base.logging.a.d(l, "json marshaling failed");
            }
            resultReceiverB.send(103, bundle);
            if (cVar == null) {
                return 1;
            }
            synchronized (m) {
                r = "Idle";
            }
            e();
            return 1;
        }
        com.heytap.accessory.base.logging.a.d(l, "Cannot find transactions for AgentId " + str + " array " + size);
        return 13;
    }

    public int a(long j, int i, String str, String str2, boolean z) {
        c cVarC = c(j, i);
        String str3 = l;
        com.heytap.accessory.base.logging.a.a(str3, "receiveFile " + j + " , " + i + " , " + str + " , " + z);
        if (cVarC != null && this.d != null) {
            if (i == cVarC.g() && c(str)) {
                if (5 != cVarC.k()) {
                    com.heytap.accessory.base.logging.a.b(str3, "receiveFile: receive file request in wrong state");
                    return -1;
                }
                if (z) {
                    com.heytap.accessory.base.logging.a.d(str3, "receiveFile: Accept Received " + str2);
                    cVarC.a(str2);
                    cVarC.b(str);
                    cVarC.a(3);
                    String strF = cVarC.f() == null ? str : cVarC.f();
                    com.heytap.accessory.base.logging.a.a(str3, "receiveFile connectionId=" + j);
                    this.d.a(j, i, -1, str, strF, true);
                } else {
                    com.heytap.accessory.base.logging.a.e(str3, "receiveFile: Reject Received");
                    cVarC.a(4);
                    this.d.a(j, i, 9, str, str, false);
                }
                return 0;
            }
            com.heytap.accessory.base.logging.a.b(str3, "receiveFile: invalid value RcvTrId:" + i + " CurTrID:" + cVarC.g() + " Path:" + str);
            this.d.a(j, i, 3, "", "", false);
            return -1;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("receiveFile failed. task null?: ");
        sb.append(cVarC == null);
        sb.append(", action null?: ");
        sb.append(this.d == null);
        com.heytap.accessory.base.logging.a.a(str3, new IllegalArgumentException(sb.toString()));
        return -1;
    }

    public void a(SetupRequest setupRequest, String str, String str2) {
        String str3 = l;
        com.heytap.accessory.base.logging.a.d(str3, "onFileRequest [" + str + "] connId:" + setupRequest.c());
        if (!com.heytap.accessory.base.a.a(3, setupRequest.a(), setupRequest.j(), setupRequest.d())) {
            com.heytap.accessory.base.logging.a.e(str3, "onFileRequest accId:" + setupRequest.a() + " local agentId:" + setupRequest.j() + " remote agentId:" + setupRequest.d() + " is dormant, ignore request!");
            return;
        }
        c cVar = new c(setupRequest.l(), setupRequest.g(), setupRequest.k(), setupRequest.e(), setupRequest.f(), setupRequest.h(), new com.heytap.accessory.file.model.b(setupRequest.j(), setupRequest.d(), setupRequest.a()), null, setupRequest.c());
        cVar.a(5);
        a(setupRequest.c(), setupRequest.l(), cVar);
        p.add(cVar);
        if (this.d == null) {
            BaseJobAgent.requestAgent(this.a, FileConsumerImpl.class.getName(), this.h);
            synchronized (o) {
                while (this.d == null) {
                    try {
                        o.wait();
                    } catch (InterruptedException unused) {
                        com.heytap.accessory.base.logging.a.d(l, "Consumer service binding interrupted");
                    }
                }
            }
        }
        this.d.a(setupRequest.c(), this);
        Intent intent = new Intent(FileTransfer.ACTION_AFP_FILE_TRANSFER_REQUESTED);
        intent.putExtra("accId", setupRequest.a());
        intent.putExtra("contId", setupRequest.d());
        intent.putExtra("peerId", setupRequest.j());
        intent.putExtra("transId", setupRequest.l());
        if (setupRequest.f() != null) {
            intent.putExtra("filePath", setupRequest.f());
        } else {
            intent.putExtra("filePath", setupRequest.e());
        }
        intent.putExtra("fileName", setupRequest.g());
        intent.putExtra("connectionId", setupRequest.c());
        intent.putExtra("agentClass", str2);
        intent.putExtra(Constant.FILE_SIZE, setupRequest.h());
        if (str.length() != 0) {
            intent.setPackage(str);
        }
        this.a.sendBroadcast(intent);
    }

    @Override // com.heytap.accessory.file.d
    public void a(SetupRequest setupRequest, CtrlResponse ctrlResponse) {
        long jA;
        int iL = setupRequest.l();
        long jC = setupRequest.c();
        c cVarC = c(jC, iL);
        String str = l;
        com.heytap.accessory.base.logging.a.b(str, "onError reason :" + ctrlResponse.c());
        String strA = com.heytap.accessory.file.utils.a.a(ctrlResponse);
        c cVar = this.c.get(Integer.valueOf(iL));
        int i = 1;
        int i2 = 102;
        if (ctrlResponse.c() != 5 && ctrlResponse.c() != -1) {
            if (cVar != null && cVar.g() == iL) {
                com.heytap.accessory.base.logging.a.d(str, "TransactionId : " + iL + " error: " + strA + " state " + cVar.k());
                if (cVar.k() == 9) {
                    a(cVar.a().b(), cVar);
                    return;
                }
                cVar.a(1);
                ResultReceiver resultReceiverB = cVar.b();
                q.remove(cVar);
                b(cVar.a.a(), iL);
                com.heytap.accessory.base.logging.a.d(str, "onError: TRANSFER Cancelled!:SendQueue Size:" + q.size());
                Bundle bundle = new Bundle();
                try {
                    bundle.putString("CallBackJson", new TransferErrorMsg(jC, iL, ctrlResponse.c(), strA).toJSON().toString());
                } catch (JSONException unused) {
                    com.heytap.accessory.base.logging.a.d(l, "json marshaling failed");
                }
                if (resultReceiverB != null) {
                    resultReceiverB.send(102, bundle);
                } else {
                    com.heytap.accessory.base.logging.a.b(l, "onError Sender error: Callback not yet registered for transaction id: " + iL);
                }
                synchronized (m) {
                    r = "Idle";
                }
                e();
                return;
            }
            if (cVarC != null && cVarC.g() == iL) {
                com.heytap.accessory.base.logging.a.a(str, "Cleared current receive task:" + iL + " After error");
                com.heytap.accessory.base.logging.a.d(str, "TransactionId : " + iL + "error$ " + strA);
                cVarC.a(1);
                ResultReceiver resultReceiverB2 = cVarC.b();
                p.remove(cVarC);
                com.heytap.accessory.base.logging.a.d(str, "onError: TRANSFER Cancelled!:ReceiveQueue Size:" + p.size());
                Bundle bundle2 = new Bundle();
                try {
                    bundle2.putString("CallBackJson", new TransferErrorMsg(jC, iL, ctrlResponse.c(), strA).toJSON().toString());
                } catch (JSONException unused2) {
                    com.heytap.accessory.base.logging.a.d(l, "json marshaling failed");
                }
                if (resultReceiverB2 != null) {
                    resultReceiverB2.send(102, bundle2);
                    return;
                }
                com.heytap.accessory.base.logging.a.d(l, "onError Receiver error: Callback not yet registered for transaction id: " + iL);
                return;
            }
            com.heytap.accessory.base.logging.a.d(str, "onError: No request, yet on Error, plz check");
            return;
        }
        if (cVar != null && cVar.g() == iL) {
            jA = cVar.a().a();
            Bundle bundle3 = new Bundle();
            try {
                bundle3.putString("CallBackJson", new TransferErrorMsg(jC, iL, ctrlResponse.c(), strA).toJSON().toString());
                cVar.b().send(102, bundle3);
            } catch (Exception e2) {
                com.heytap.accessory.base.logging.a.e(l, "send callback error," + e2);
            }
        } else {
            jA = (cVarC == null || cVarC.g() != iL) ? -1L : cVarC.a().a();
        }
        long j = jA;
        com.heytap.accessory.base.logging.a.c(l, "before sSendQueue Size :" + q.size());
        for (c cVar2 : q) {
            if (j == cVar2.a().a()) {
                ResultReceiver resultReceiverB3 = cVar2.b();
                cVar2.a(i);
                Bundle bundle4 = new Bundle();
                int i3 = iL;
                int i4 = i2;
                c cVar3 = cVar;
                String str2 = strA;
                try {
                    bundle4.putString("CallBackJson", new TransferErrorMsg(cVar2.c(), cVar2.j, ctrlResponse.c(), strA).toJSON().toString());
                } catch (JSONException unused3) {
                    com.heytap.accessory.base.logging.a.d(l, "json marshaling failed");
                }
                if (resultReceiverB3 != null) {
                    resultReceiverB3.send(i4, bundle4);
                } else {
                    com.heytap.accessory.base.logging.a.b(l, "onError Sender Service Conn failed: Callback not yet registered for transaction id: " + cVar2.j);
                }
                q.remove(cVar2);
                b(cVar2.g());
                i2 = i4;
                cVar = cVar3;
                strA = str2;
                iL = i3;
                i = 1;
            }
        }
        int i5 = iL;
        int i6 = i2;
        c cVar4 = cVar;
        String str3 = strA;
        com.heytap.accessory.base.logging.a.c(l, "Queue Size :" + q.size());
        for (c cVar5 : p) {
            if (cVarC != null && cVar5.g() == cVarC.g() && cVarC.k() == 8) {
                com.heytap.accessory.base.logging.a.d(l, "On error  called  for  reciever  after  on successful on transfer complete happened lets ignore");
            } else if (j == cVar5.a().a()) {
                ResultReceiver resultReceiverB4 = cVar5.b();
                cVar5.a(1);
                Bundle bundle5 = new Bundle();
                try {
                    bundle5.putString("CallBackJson", new TransferErrorMsg(cVar5.c(), cVar5.j, ctrlResponse.c(), str3).toJSON().toString());
                } catch (JSONException unused4) {
                    com.heytap.accessory.base.logging.a.d(l, "json marshaling failed");
                }
                if (resultReceiverB4 != null) {
                    resultReceiverB4.send(i6, bundle5);
                } else {
                    com.heytap.accessory.base.logging.a.b(l, "onError Receiver Service Conn failed: Callback not yet registered for transaction id: " + cVar5.j);
                }
                p.remove(cVar5);
            }
        }
        com.heytap.accessory.base.logging.a.d(l, "Cleared Send list on Service Connection Lost : SendQueue Size:" + q.size() + " ReceiveQueue size: " + p.size());
        if (cVarC != null) {
            cVarC.a().a();
        }
        if (cVar4 != null && cVar4.a().a() == j) {
            b(j, i5);
        }
        synchronized (m) {
            r = "Idle";
        }
        e();
    }

    @Override // com.heytap.accessory.file.d
    public void a(SetupRequest setupRequest, long j) {
        int iL = setupRequest.l();
        long jC = setupRequest.c();
        c cVarC = c(jC, iL);
        c cVar = this.c.get(Integer.valueOf(iL));
        if (cVar != null && cVar.g() == iL && cVar.k() != 9 && cVar.k() != 6) {
            cVar.a(7);
            ResultReceiver resultReceiverB = cVar.b();
            Bundle bundle = new Bundle();
            try {
                bundle.putString("CallBackJson", new TransferProgress(jC, iL, (int) ((j / cVar.i()) * 100.0f)).toJSON().toString());
            } catch (JSONException unused) {
                com.heytap.accessory.base.logging.a.d(l, "json marshaling failed");
            }
            if (resultReceiverB != null) {
                resultReceiverB.send(100, bundle);
                return;
            }
            com.heytap.accessory.base.logging.a.b(l, "onProgressChanged Sender: Callback not yet registered for transaction id: " + iL);
            return;
        }
        if (cVarC != null && cVarC.g() == iL && cVarC.k() != 9 && cVarC.k() != 6) {
            cVarC.a(7);
            ResultReceiver resultReceiverB2 = cVarC.b();
            Bundle bundle2 = new Bundle();
            try {
                bundle2.putString("CallBackJson", new TransferProgress(jC, iL, (int) ((j / cVarC.i()) * 100.0f)).toJSON().toString());
            } catch (JSONException unused2) {
                com.heytap.accessory.base.logging.a.d(l, "json marshaling failed");
            }
            if (resultReceiverB2 != null) {
                resultReceiverB2.send(100, bundle2);
                return;
            }
            com.heytap.accessory.base.logging.a.b(l, "onProgressChanged Receiver: Callback not yet registered for transaction id: " + iL);
            return;
        }
        com.heytap.accessory.base.logging.a.d(l, "onProgressChanged id does not match any of the tasks being served");
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0194 A[Catch: all -> 0x019b, TRY_LEAVE, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x0018, B:7:0x001e, B:8:0x003f, B:12:0x0056, B:14:0x0070, B:26:0x0136, B:29:0x0168, B:31:0x0172, B:33:0x017a, B:34:0x0194, B:13:0x005a, B:10:0x004d, B:15:0x007b, B:17:0x0085, B:18:0x008e, B:19:0x00dc, B:23:0x00f3, B:25:0x010d, B:24:0x00f7, B:21:0x00ea), top: B:42:0x0001, inners: #0, #2 }] */
    @Override // com.heytap.accessory.file.d
    public synchronized void a(SetupRequest setupRequest) {
        Long l2;
        String str;
        int iL = setupRequest.l();
        c cVar = this.c.get(Integer.valueOf(iL));
        if (cVar != null && cVar.g() == iL) {
            cVar.a(8);
            ResultReceiver resultReceiverB = cVar.b();
            Bundle bundle = new Bundle();
            try {
                bundle.putString("CallBackJson", new TransferCompleteMsg(setupRequest.c(), iL, cVar.j(), "", setupRequest.h()).toJSON().toString());
            } catch (JSONException unused) {
                com.heytap.accessory.base.logging.a.d(l, "json marshaling failed");
            }
            if (resultReceiverB != null) {
                resultReceiverB.send(101, bundle);
            } else {
                com.heytap.accessory.base.logging.a.b(l, "onTransfercomplete Sender: Callback not yet registered for transaction id: " + iL);
            }
            b(cVar.a.a(), iL);
            l2 = this.f.get(iL);
            Long l3 = this.g.get(iL);
            str = l;
            Log.i(str, "statistics, startTime:" + l2 + ", fileSize:" + l3);
            if (l2 == null) {
                Log.e(str, "statistics error");
            } else {
                Log.e(str, "statistics error");
            }
        } else {
            if (c(setupRequest.c(), iL) == null) {
                com.heytap.accessory.base.logging.a.b(l, "onTransferComplete: Called when no request queued on either side, plz check");
            } else {
                com.heytap.accessory.base.logging.a.d(l, "onTransferComplete: Cleared current receive task:" + iL + " After completion");
                c(setupRequest.c(), iL).a(8);
                ResultReceiver resultReceiverB2 = c(setupRequest.c(), iL).b();
                Bundle bundle2 = new Bundle();
                try {
                    bundle2.putString("CallBackJson", new TransferCompleteMsg(setupRequest.c(), iL, setupRequest.k(), setupRequest.e(), setupRequest.h()).toJSON().toString());
                } catch (JSONException unused2) {
                    com.heytap.accessory.base.logging.a.d(l, "json marshaling failed");
                }
                if (resultReceiverB2 != null) {
                    resultReceiverB2.send(101, bundle2);
                } else {
                    com.heytap.accessory.base.logging.a.b(l, "onTransferComplete Receiver: Callback not yet registered for transaction id: " + iL);
                }
                p.remove(c(setupRequest.c(), iL));
                com.heytap.accessory.base.logging.a.d(l, "onTransferComplete:ReceiveQueue Size:" + p.size());
            }
            l2 = this.f.get(iL);
            Long l4 = this.g.get(iL);
            str = l;
            Log.i(str, "statistics, startTime:" + l2 + ", fileSize:" + l4);
            if (l2 == null && l4 != null && l2.longValue() != 0 && l4.longValue() != 0) {
                StatisticsTpForStandard.onFileSuccess((l4.longValue() / 1024.0f) / ((System.currentTimeMillis() - l2.longValue()) / 1000.0f));
            } else {
                Log.e(str, "statistics error");
            }
        }
    }

    @Override // com.heytap.accessory.file.d
    public void a(int i) {
        c cVar = this.c.get(Integer.valueOf(i));
        if (cVar != null) {
            q.remove(cVar);
            b(cVar.a().a(), i);
        }
        com.heytap.accessory.base.logging.a.c(l, "[SFTrack] requestProcessQueue:SendQueue Size:" + q.size());
        synchronized (m) {
            r = "Idle";
        }
        e();
    }

    public final void a(long j, int i, c cVar) {
        synchronized (this.b) {
            Map<Integer, c> map = this.b.get(Long.valueOf(j));
            if (map == null) {
                map = new HashMap<>();
                this.b.put(Long.valueOf(j), map);
            }
            map.put(Integer.valueOf(i), cVar);
        }
    }
}
