package com.oplus.aiunit.vision;

import android.text.TextUtils;
import com.oplus.wearable.linkservice.sdk.Node;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public class fd7 implements el4.b {
    public static final int ERROR_FT_USER_LOCKED = 14;
    public static final String TAG = "FileTransmitManager";
    public static final String TAG_ERROR_FT_USER_CANCEL = "ERROR_FT_USER_CANCEL";
    public static final String TAG_ERROR_FT_USER_LOCKED = "ERROR_FT_USER_LOCKED";
    public Map<String, rsg> i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Map<String, nid> f11299j;

    public class a implements gq9 {
        public a() {
        }

        @Override // com.oplus.aiunit.vision.gq9
        public void a(String str, mc7 mc7Var) {
            fd7.this.m(str, mc7Var);
        }

        @Override // com.oplus.aiunit.vision.gq9
        public void b(String str, mc7 mc7Var) {
        }
    }

    public class b implements gq9 {
        public b() {
        }

        @Override // com.oplus.aiunit.vision.gq9
        public void a(String str, mc7 mc7Var) {
            fd7.this.s(str, mc7Var);
        }

        @Override // com.oplus.aiunit.vision.gq9
        public void b(String str, mc7 mc7Var) {
            fd7.this.u(str, mc7Var);
        }
    }

    public class c implements gq9 {
        public c() {
        }

        @Override // com.oplus.aiunit.vision.gq9
        public void a(String str, mc7 mc7Var) {
            fd7.this.r(str, mc7Var);
        }

        @Override // com.oplus.aiunit.vision.gq9
        public void b(String str, mc7 mc7Var) {
            fd7.this.t(str, mc7Var);
        }
    }

    public static class d {
        public static final fd7 a = new fd7();
    }

    public static fd7 n() {
        return d.a;
    }

    @Override // com.oplus.aiunit.vision.el4.b
    public synchronized void a(String str, mc7 mc7Var) {
        q("onProgressChanged", str, mc7Var, new b());
    }

    @Override // com.oplus.aiunit.vision.el4.b
    public synchronized void b(String str, mc7 mc7Var) {
        q("onTransferCompleted", str, mc7Var, new c());
    }

    @Override // com.oplus.aiunit.vision.el4.b
    public synchronized void c(String str, mc7 mc7Var) {
        q("onTransferRequested", str, mc7Var, new a());
    }

    public final void i(String str, String str2, String str3, String str4, aed<oc7> aedVar) {
        rsg rsgVar = new rsg();
        rsgVar.e(str4);
        rsgVar.f(str2);
        rsgVar.d(str3);
        rsgVar.c(aedVar);
        j(str4, rsgVar);
        y(str2, str4, str3, str);
    }

    public final void j(String str, rsg rsgVar) {
        ltl.a(TAG, "[addPendTask] --> sendRecordInfo " + rsgVar);
        this.i.put(str, rsgVar);
    }

    public synchronized void k(String str, String str2, aed<oc7> aedVar) {
        try {
            if (str2 == null || str == null) {
                ltl.b(TAG, "[sendFile] -->failed: apiClient == null) || (filePath == null");
                w(aedVar, "apiClient == null");
                return;
            }
            List<Node> connectedNodes = gl4.managerApi.getConnectedNodes();
            if (connectedNodes != null && connectedNodes.size() != 0 && connectedNodes.get(0) != null) {
                ltl.a(TAG, "[sendFile] --> start send file: uri=" + str + ",filePath=" + str2);
                Node node = connectedNodes.get(0);
                String strA = gl4.devicePrimary.fileApi.a(node.getMainModule().getMacAddress(), str, 13, str2);
                if (TextUtils.isEmpty(strA)) {
                    w(aedVar, "task id is empty");
                    return;
                }
                ltl.a(TAG, "[sendFile] --> mCurrentTaskId=" + strA);
                i(node.getNodeId(), str, str2, strA, aedVar);
                return;
            }
            ltl.b(TAG, "[sendFile] --> nodeList size error");
            w(aedVar, "No Connected Watch");
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void l(String str, aed<String> aedVar) {
        ltl.a(TAG, "[cancelSendAddWf] --> cancel success taskId=" + str);
        gl4.devicePrimary.fileApi.cancelFile(str);
        x(aedVar, str);
    }

    public final void m(String str, mc7 mc7Var) {
        nid value;
        for (Map.Entry<String, nid> entry : this.f11299j.entrySet()) {
            if (TextUtils.equals(entry.getKey(), mc7Var.i()) && (value = entry.getValue()) != null) {
                gl4.devicePrimary.fileApi.receiveFile(mc7Var.h(), value.b(str));
            }
        }
    }

    public final synchronized List<String> o() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator<Map.Entry<String, rsg>> it = this.i.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getKey());
        }
        return arrayList;
    }

    public List<rsg> p() {
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<String, rsg>> it = this.i.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getValue());
        }
        return arrayList;
    }

    public final void q(String str, String str2, mc7 mc7Var, @NotNull gq9 gq9Var) {
        ltl.a(TAG, "[" + str + "] nodeId = " + str2);
        if (mc7Var == null) {
            ltl.a(TAG, "[filter] fileTaskInfo = null.");
            return;
        }
        ltl.a(TAG, "[" + str + "] -->  taskId  = " + mc7Var.h() + " uri  = " + mc7Var.i() + " nodeId  = " + str2 + " fileName  = " + mc7Var.b() + " progress  = " + mc7Var.f() + " errorCode  = " + mc7Var.a());
        String strI = mc7Var.i();
        if (strI == null) {
            ltl.a(TAG, "[" + str + "] fileTaskInfo Uri = null.");
            return;
        }
        List<String> listO = o();
        ltl.a(TAG, "[" + str + "] fileTaskInfo uri list" + listO);
        if (listO.contains(mc7Var.h())) {
            gq9Var.b(str2, mc7Var);
            return;
        }
        if (this.f11299j.containsKey(strI)) {
            gq9Var.a(str2, mc7Var);
            return;
        }
        ltl.i(TAG, "[" + str + "] Not register send and receiver task,and return");
    }

    public final void r(String str, mc7 mc7Var) {
        nid nidVar = this.f11299j.get(mc7Var.i());
        if (nidVar != null) {
            nidVar.c(str, mc7Var);
        }
    }

    public final void s(String str, mc7 mc7Var) {
        nid nidVar = this.f11299j.get(mc7Var.i());
        if (nidVar != null) {
            nidVar.a(str, mc7Var);
        }
    }

    public final void t(String str, mc7 mc7Var) {
        String strH = mc7Var.h();
        int iA = mc7Var.a();
        String strI = mc7Var.i();
        rsg rsgVar = this.i.get(strH);
        if (rsgVar == null) {
            ltl.i(TAG, "[onTransferCompleted] --> task uri = " + strI + " is not in task,and no handle.");
            return;
        }
        ltl.a(TAG, "[onTransferCompleted] --> sendRecordInfo " + rsgVar);
        aed<oc7> aedVarA = rsgVar.a();
        if (iA == 0) {
            v(aedVarA);
        } else if (iA == 509) {
            ltl.i(TAG, "[onTransferCompleted] --> send " + strI + ", cancel file send.");
            w(aedVarA, "file send cancel ");
        } else if (iA == 9) {
            ltl.a(TAG, "[onTransferCompleted] --> user cancel file,and not need callback. ");
        } else if (grl.a(gl4.managerApi.getCurrentConnectId()).v1(iA)) {
            ltl.a(TAG, "[onTransferCompleted] --> rx user cancle file and not need handle.");
        } else if (iA == 14) {
            ltl.a(TAG, "[onTransferCompleted] --> ERROR_FT_USER_LOCKED");
            w(aedVarA, TAG_ERROR_FT_USER_LOCKED);
        } else {
            w(aedVarA, "ErrorCode = " + mc7Var.a());
        }
        z(strH);
    }

    public final void u(String str, mc7 mc7Var) {
        String strH = mc7Var.h();
        rsg rsgVar = this.i.get(strH);
        ltl.a(TAG, "[onProgressChanged] --> sendRecordInfo " + rsgVar);
        x(rsgVar.a(), new oc7(strH, mc7Var.b(), mc7Var.f()));
    }

    public final <T> void v(aed<T> aedVar) {
        if (aedVar != null) {
            aedVar.onComplete();
        }
    }

    public final <T> void w(aed<T> aedVar, String str) {
        if (aedVar != null) {
            aedVar.onError(new Throwable(str));
        }
    }

    public final <T> void x(aed<T> aedVar, T t) {
        if (aedVar != null) {
            aedVar.onNext(t);
        }
    }

    public final void y(String str, String str2, String str3, String str4) {
        mc7 mc7Var = new mc7();
        mc7Var.l(qd7.a(str3));
        mc7Var.o(0);
        mc7Var.s(str);
        mc7Var.r(str2);
        u(str4, mc7Var);
    }

    public final void z(String str) {
        ltl.a(TAG, "[removePendTask] --> taskId " + str);
        this.i.remove(str);
    }

    public fd7() {
        this.i = new HashMap();
        this.f11299j = new HashMap();
        uk3.a().b(this);
    }
}
