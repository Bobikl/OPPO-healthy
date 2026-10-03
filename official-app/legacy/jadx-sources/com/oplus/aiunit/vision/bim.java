package com.oplus.aiunit.vision;

import com.oplus.oms.split.full.splitdownload.ISplitUpdateManager;
import com.oplus.oms.split.full.splitdownload.SplitUpdateInfo;
import java.io.File;

/* JADX INFO: loaded from: classes8.dex */
public class bim extends eym {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f9772n = "CloudProcessSplitInfo";
    public ISplitUpdateManager m;
    public boolean o;

    public bim(ISplitUpdateManager iSplitUpdateManager, boolean z) {
        this.m = iSplitUpdateManager;
        this.o = z;
    }

    @Override // com.oplus.aiunit.vision.eym
    public v5n c(v5n v5nVar) {
        if (v5nVar == null) {
            w7i.c(f9772n, "prv SplitVersionInfo is null", new Object[0]);
            return null;
        }
        if (this.m == null) {
            w7i.i(f9772n, "updateManager is null", new Object[0]);
            return f(v5nVar);
        }
        if (!this.o) {
            w7i.i(f9772n, "network is unavailable", new Object[0]);
            return f(v5nVar);
        }
        h7i h7iVarJ = v5nVar.j();
        SplitUpdateInfo splitUpdateInfo = this.m.getSplitUpdateInfo(h7iVarJ.q());
        if (splitUpdateInfo == null) {
            w7i.c(f9772n, "updateInfo is null", new Object[0]);
            return f(v5nVar);
        }
        int versionCode = splitUpdateInfo.getVersionCode();
        if (e(h7iVarJ.r(), versionCode) && v5nVar.g() < versionCode && g(h7iVarJ.q(), splitUpdateInfo.getMd5(), versionCode)) {
            v5n v5nVarB = b(2, versionCode, splitUpdateInfo.getVersionName(), v5nVar);
            v5nVarB.d(splitUpdateInfo);
            return f(v5nVarB);
        }
        return f(v5nVar);
    }

    public final boolean g(String str, String str2, int i) {
        if (!z6i.b().c()) {
            return true;
        }
        File fileB = a8i.o().b(str, String.valueOf(i), false);
        String strH = pd7.h(fileB);
        if (fileB.exists() && strH != null && strH.equals(str2)) {
            return true;
        }
        w7i.e(f9772n, "downloadFile is null or split apk md5 not match", new Object[0]);
        return false;
    }
}
