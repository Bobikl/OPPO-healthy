package com.oplus.aiunit.vision;

import android.content.Context;
import android.text.TextUtils;
import com.oplus.oms.split.full.common.ProcessInfoData;
import com.oplus.oms.split.full.common.SplitProcessUtils;
import com.oplus.oms.split.full.splitdownload.SplitUpdateInfo;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class mpm extends eym {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f14158l = "InstalledProcessSplitInfo";

    public mpm(Context context) {
        d(context);
    }

    @Override // com.oplus.aiunit.vision.eym
    public v5n c(v5n v5nVar) {
        if (v5nVar == null) {
            w7i.c(f14158l, "prv SplitVersionInfo is null", new Object[0]);
            return null;
        }
        if (this.a == null) {
            w7i.c(f14158l, "context is null", new Object[0]);
            return f(v5nVar);
        }
        String strQ = v5nVar.j().q();
        int iE = o7i.e(this.a, strQ);
        if (iE == -1) {
            return f(v5nVar);
        }
        File fileD = a8i.o().d(strQ, iE, false);
        if (!fileD.exists()) {
            o7i.h(this.a, strQ, -1);
            return f(v5nVar);
        }
        if (t7i.F() && t7i.E().h().contains(strQ)) {
            w7i.a(f14158l, "SplitLoadManagerImpl the split has loaded", new Object[0]);
            return f(b(0, iE, null, v5nVar));
        }
        if (h(this.a, strQ)) {
            w7i.a(f14158l, "the split has loaded = " + strQ, new Object[0]);
            return f(b(0, iE, null, v5nVar));
        }
        int iG = v5nVar.g();
        if (iG <= iE) {
            return iG == iE ? f(g(v5nVar, iE, fileD)) : f(b(0, iE, null, v5nVar));
        }
        if (iE >= (v5nVar.b() != null ? v5nVar.b().g() : -1)) {
            v5n v5nVar2 = new v5n(v5nVar.j());
            v5nVar2.i = 0;
            v5nVar2.k = iE;
            v5nVar.c(v5nVar2);
        }
        return f(v5nVar);
    }

    public final v5n g(v5n v5nVar, int i, File file) {
        if (v5nVar.e() == 4 || v5nVar.e() == 3 || v5nVar.e() == 5) {
            return b(0, i, null, v5nVar);
        }
        String strQ = v5nVar.j().q();
        String strE = v5nVar.j().e();
        SplitUpdateInfo splitUpdateInfoI = v5nVar.i();
        if (v5nVar.e() == 2 && splitUpdateInfoI != null) {
            strE = splitUpdateInfoI.getMd5();
        }
        if (TextUtils.isEmpty(strE) || TextUtils.isEmpty(strQ)) {
            return b(0, i, null, v5nVar);
        }
        if (strE.equals(pd7.h(file))) {
            return b(0, i, null, v5nVar);
        }
        o7i.l(v5nVar.j(), i, this.a);
        o7i.h(this.a, strQ, -1);
        return v5nVar;
    }

    public final boolean h(Context context, String str) {
        List<ProcessInfoData> subProcessInfoData = SplitProcessUtils.getSubProcessInfoData(str);
        ArrayList arrayList = new ArrayList();
        Iterator<ProcessInfoData> it = subProcessInfoData.iterator();
        while (it.hasNext()) {
            String processName = it.next().getProcessName();
            if (!TextUtils.isEmpty(processName) && !arrayList.contains(processName)) {
                arrayList.add(processName);
            }
        }
        ProcessInfoData mainProcessInfoData = SplitProcessUtils.getMainProcessInfoData(str);
        if (mainProcessInfoData != null) {
            String processName2 = mainProcessInfoData.getProcessName();
            if (!TextUtils.isEmpty(processName2) && !arrayList.contains(processName2)) {
                arrayList.add(processName2);
            }
        }
        w7i.a(f14158l, "isSplitHasLoaded - processList = " + arrayList, new Object[0]);
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            if (exe.e(context, (String) it2.next())) {
                return true;
            }
        }
        return false;
    }
}
