package com.oplus.oms.split.full.splitdownload;

import android.content.Context;
import com.oplus.aiunit.vision.h7i;
import com.oplus.aiunit.vision.j7i;
import com.oplus.aiunit.vision.w7i;
import com.oplus.oms.split.full.splitrequest.SplitOmsJsonLoadStrategy;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class DownloadUtil {
    public static List<DownloadRequest> buildDownloadRequests(Context context, Collection<String> collection) {
        if (collection == null) {
            w7i.i("DownloadUtil", "splitNames is null, ignore", new Object[0]);
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : collection) {
            h7i h7iVarC = j7i.s().c(context, str);
            if (h7iVarC == null) {
                w7i.i("DownloadUtil", "wrong split name: %s, ignore", str);
            } else {
                arrayList.add(DownloadRequest.newBuilder().q(h7iVarC.i()).e(h7iVarC.t()).m(h7iVarC.q()).h(h7iVarC.c()).c());
                w7i.e("DownloadUtil", h7iVarC.t() + ",queryRequests:" + h7iVarC.q(), new Object[0]);
            }
        }
        return arrayList;
    }

    public static List<DownloadRequest> queryAllRequests(Context context) {
        String[] dynamicFeatures = SplitOmsJsonLoadStrategy.getInstance().getDynamicFeatures();
        if (dynamicFeatures == null) {
            w7i.i("DownloadUtil", "dynamic feature is null, ignore", new Object[0]);
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : dynamicFeatures) {
            h7i h7iVarC = j7i.s().c(context, str);
            if (h7iVarC == null) {
                w7i.i("DownloadUtil", "wrong split name: %s, ignore", str);
            } else {
                arrayList.add(DownloadRequest.newBuilder().q(h7iVarC.i()).e(h7iVarC.t()).m(h7iVarC.q()).h(h7iVarC.c()).c());
                w7i.e("DownloadUtil", h7iVarC.t() + ",queryRequests:" + h7iVarC.q(), new Object[0]);
            }
        }
        return arrayList;
    }
}
