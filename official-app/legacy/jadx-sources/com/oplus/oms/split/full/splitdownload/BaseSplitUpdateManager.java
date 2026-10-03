package com.oplus.oms.split.full.splitdownload;

import android.content.Context;
import android.text.TextUtils;
import com.oplus.aiunit.vision.a8i;
import com.oplus.aiunit.vision.h7i;
import com.oplus.aiunit.vision.j7i;
import com.oplus.aiunit.vision.p1h;
import com.oplus.aiunit.vision.pd7;
import com.oplus.aiunit.vision.qpc;
import com.oplus.aiunit.vision.w7i;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public abstract class BaseSplitUpdateManager implements ISplitUpdateManager {
    protected static final String KEY_MD5 = "md5";
    protected static final String KEY_NAME = "name";
    protected static final String KEY_SIZE = "size";
    protected static final String KEY_URL = "url";
    protected static final String KEY_VERSION_CODE = "version_code";
    protected static final String KEY_VERSION_NAME = "version_name";
    protected final Context mContext;

    public BaseSplitUpdateManager(Context context) {
        this.mContext = context;
    }

    public final Map<String, Object> a(SplitUpdateInfo splitUpdateInfo) {
        if (splitUpdateInfo == null) {
            return Collections.emptyMap();
        }
        String splitName = splitUpdateInfo.getSplitName();
        HashMap map = new HashMap();
        map.put(splitName + "name", splitUpdateInfo.getSplitName());
        map.put(splitName + "version_name", splitUpdateInfo.getVersionName());
        map.put(splitName + "version_code", Integer.valueOf(splitUpdateInfo.getVersionCode()));
        map.put(splitName + "url", splitUpdateInfo.getUrl());
        map.put(splitName + "md5", splitUpdateInfo.getMd5());
        map.put(splitName + "size", Long.valueOf(splitUpdateInfo.getSize()));
        return map;
    }

    public final boolean b(String str, int i) {
        if (this.mContext == null) {
            w7i.a("UpdateManager", "needDownloadSplit failed mContext is null", new Object[0]);
            return false;
        }
        if (TextUtils.isEmpty(str)) {
            w7i.a("UpdateManager", "needDownloadSplit failed splitName is null", new Object[0]);
            return false;
        }
        h7i h7iVarC = j7i.s().c(this.mContext, str);
        if (h7iVarC != null) {
            return !h7iVarC.w() || h7iVarC.d() || h7iVarC.r() < i;
        }
        w7i.a("UpdateManager", "needDownloadSplit failed SplitInfo is null", new Object[0]);
        return false;
    }

    public final boolean c(String str, int i, String str2) {
        File fileB = a8i.o().b(str, String.valueOf(i), false);
        if (!fileB.exists()) {
            return false;
        }
        String strH = pd7.h(fileB);
        return !TextUtils.isEmpty(strH) && strH.equals(str2);
    }

    public final boolean d(String str, int i, String str2) {
        w7i.a("UpdateManager", "needReplaceInstalledSplit - splitName = " + str + " , downloadVersion = " + i, new Object[0]);
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        int iIntValue = ((Integer) p1h.b(this.mContext).a(str + "_INSTALL_VERSION", -1)).intValue();
        if (iIntValue == -1) {
            w7i.a("UpdateManager", "splitName = " + str + " has not installer", new Object[0]);
            return true;
        }
        File fileD = a8i.o().d(str, iIntValue, false);
        if (!fileD.exists()) {
            w7i.a("UpdateManager", "splitName = " + str + "  apk is delete", new Object[0]);
            return true;
        }
        if (i > iIntValue) {
            w7i.a("UpdateManager", "splitName = " + str + "  download > installed", new Object[0]);
            return true;
        }
        if (i != iIntValue || TextUtils.isEmpty(str2) || str2.equals(pd7.h(fileD))) {
            return false;
        }
        w7i.a("UpdateManager", "splitName = " + str + " md5 not equal, need replace.", new Object[0]);
        return true;
    }

    @Override // com.oplus.oms.split.full.splitdownload.ISplitUpdateManager
    public long getLastUpdateTime() {
        return ((Long) p1h.b(this.mContext).a("CLOUD_TIME", -1L)).longValue();
    }

    @Override // com.oplus.oms.split.full.splitdownload.ISplitUpdateManager
    public SplitUpdateInfo getSplitUpdateInfo(String str) {
        p1h p1hVarB = p1h.b(this.mContext);
        String str2 = (String) p1hVarB.a(str + "name", "");
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        SplitUpdateInfo splitUpdateInfo = new SplitUpdateInfo();
        try {
            splitUpdateInfo.setSplitName(str2);
            splitUpdateInfo.setVersionName((String) p1hVarB.a(str + "version_name", ""));
            splitUpdateInfo.setVersionCode(((Integer) p1hVarB.a(str + "version_code", -1)).intValue());
            splitUpdateInfo.setUrl((String) p1hVarB.a(str + "url", ""));
            splitUpdateInfo.setSize(((Long) p1hVarB.a(str + "size", 0L)).longValue());
            splitUpdateInfo.setMd5((String) p1hVarB.a(str + "md5", ""));
        } catch (Exception e2) {
            w7i.i("UpdateManager", "getSplitUpdateInfo error. split: %s, err: %s", str, e2.getMessage());
        }
        return splitUpdateInfo;
    }

    public long getUpdateTimeByHours() {
        return qpc.b();
    }

    public boolean isAllowUseNet() {
        return qpc.c(this.mContext);
    }

    public void saveSplitUpdateInfo(SplitUpdateInfo splitUpdateInfo) {
        if (splitUpdateInfo == null) {
            return;
        }
        p1h.b(this.mContext).d(a(splitUpdateInfo));
    }

    public void setLastUpdateTime(long j2) {
        p1h.b(this.mContext).c("CLOUD_TIME", Long.valueOf(j2));
    }

    public List<DownloadRequest> updateDownloadRequest(List<DownloadRequest> list) {
        ArrayList arrayList = new ArrayList(list.size());
        a8i a8iVarO = a8i.o();
        for (DownloadRequest downloadRequest : list) {
            String moduleName = downloadRequest.getModuleName();
            SplitUpdateInfo splitUpdateInfo = getSplitUpdateInfo(moduleName);
            if (splitUpdateInfo == null) {
                w7i.i("UpdateManager", moduleName + " update indo is null", new Object[0]);
            } else if (!b(moduleName, splitUpdateInfo.getVersionCode())) {
                w7i.i("UpdateManager", moduleName + " is needDownloadSplit apk", new Object[0]);
            } else if (!d(moduleName, splitUpdateInfo.getVersionCode(), splitUpdateInfo.getMd5())) {
                w7i.i("UpdateManager", moduleName + " is newest apk", new Object[0]);
            } else if (c(moduleName, splitUpdateInfo.getVersionCode(), splitUpdateInfo.getMd5())) {
                w7i.i("UpdateManager", moduleName + " has downloaded", new Object[0]);
            } else {
                DownloadRequest.b bVarH = new DownloadRequest.b().m(moduleName).q(splitUpdateInfo.getUrl()).l(splitUpdateInfo.getMd5()).p(splitUpdateInfo.getSize()).e(splitUpdateInfo.getVersionName() + "@" + splitUpdateInfo.getVersionCode()).h(downloadRequest.getExtra());
                StringBuilder sb = new StringBuilder("");
                sb.append(splitUpdateInfo.getVersionCode());
                arrayList.add(bVarH.o(a8iVarO.h(moduleName, sb.toString(), true).getAbsolutePath()).n(a8iVarO.e(moduleName)).c());
            }
        }
        return arrayList;
    }

    public void saveSplitUpdateInfo(Map<String, Object> map) {
        if (map == null || map.isEmpty()) {
            return;
        }
        p1h.b(this.mContext).d(map);
    }
}
