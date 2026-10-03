package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.ArraySet;
import com.oplus.oms.split.full.common.ProcessInfoData;
import com.oplus.oms.split.full.common.SplitProcessUtils;
import com.oplus.oms.split.full.splitdownload.DownloadRequest;
import com.oplus.oms.split.full.splitdownload.DownloadUtil;
import com.oplus.oms.split.full.splitdownload.ISplitUpdateManager;
import com.oplus.oms.split.full.splitload.SplitBroadcastReceiver;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class xhm implements qlm {
    public static final String a = "SplitManagerExt";

    public static class a {
        public static final xhm a = new xhm(null);
    }

    public xhm(hgm hgmVar) {
    }

    @Override // com.oplus.aiunit.vision.qlm
    public void a(int i) {
        qpc.g(i);
    }

    @Override // com.oplus.aiunit.vision.qlm
    public boolean b(Context context, List<String> list) {
        if (context == null || list == null || list.size() == 0) {
            w7i.i(a, "scheduledDownload context is null or splitNames is null", new Object[0]);
            return false;
        }
        List<DownloadRequest> listBuildDownloadRequests = DownloadUtil.buildDownloadRequests(context, list);
        if (listBuildDownloadRequests == null || listBuildDownloadRequests.size() == 0) {
            w7i.i(a, "There are no plugins that need to be downloaded from the cloud", new Object[0]);
            return false;
        }
        ISplitUpdateManager updateManager = vbm.a.a.a().getUpdateManager();
        if (updateManager != null) {
            return updateManager.queryVersionFromCloud(context, listBuildDownloadRequests, true);
        }
        w7i.i(a, "the downloader is null. it can not execute scheduledDownload", new Object[0]);
        return false;
    }

    @Override // com.oplus.aiunit.vision.qlm
    public int getSplitVersionCode(Context context, String str) {
        return o7i.e(context, str);
    }

    @Override // com.oplus.aiunit.vision.qlm
    public void a(Context context, String str) {
        String actionName;
        if (context == null || str == null) {
            w7i.i(a, "unloadSplit context is null or splitNames is null", new Object[0]);
            return;
        }
        List<ProcessInfoData> subProcessInfoData = SplitProcessUtils.getSubProcessInfoData(str);
        if (subProcessInfoData != null && !subProcessInfoData.isEmpty()) {
            ArraySet arraySet = new ArraySet(subProcessInfoData.size());
            Iterator<ProcessInfoData> it = subProcessInfoData.iterator();
            while (it.hasNext()) {
                arraySet.add(it.next().getProcessName());
            }
            exe.g(context, arraySet);
        }
        ProcessInfoData mainProcessInfoData = SplitProcessUtils.getMainProcessInfoData(str);
        if (mainProcessInfoData != null) {
            exe.f(context, mainProcessInfoData.getProcessName());
        }
        if (mainProcessInfoData == null) {
            actionName = "main_process";
        } else {
            actionName = exe.e(context, mainProcessInfoData.getProcessName()) ? mainProcessInfoData.getActionName() : null;
        }
        if (TextUtils.isEmpty(actionName)) {
            w7i.i(a, "unloadSplit action is null, split: %s", str);
            return;
        }
        Intent intent = new Intent();
        intent.setAction(actionName);
        intent.setPackage(context.getPackageName());
        intent.putExtra("split_name", str);
        intent.putExtra("load_type", 1);
        SplitBroadcastReceiver.d(context, intent);
    }

    @Override // com.oplus.aiunit.vision.qlm
    public ClassLoader a(String str) {
        return a7i.f().e(str);
    }
}
