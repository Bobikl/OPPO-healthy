package com.oplus.aiunit.vision;

import android.content.Context;
import android.text.TextUtils;
import com.oplus.navi.oms.OmsPluginInfo;
import com.oplus.oms.split.full.splitinstall.LoadComponentRemote;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public class nfc extends n81 {
    public nfc(Context context, k6f k6fVar) {
        super(context, k6fVar);
    }

    @Override // com.oplus.aiunit.vision.n81
    public void d() {
        i7i i7iVarS = j7i.s();
        if (i7iVarS == null) {
            w7i.i("NaviQuery", "Failed to fetch SplitInfoManager instance!", new Object[0]);
            c(3);
            return;
        }
        Collection<h7i> collectionE = i7iVarS.e(this.f14390j);
        if (collectionE == null || collectionE.isEmpty()) {
            w7i.i("NaviQuery", "Failed to parse json file of split info!", new Object[0]);
            c(3);
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<h7i> it = collectionE.iterator();
        while (it.hasNext()) {
            HashMap<String, String> mapC = it.next().c();
            if (mapC != null && !mapC.isEmpty()) {
                String str = mapC.get("componentAction");
                if (!TextUtils.isEmpty(str)) {
                    arrayList.add(str);
                }
            }
        }
        if (arrayList.isEmpty()) {
            w7i.e("NaviQuery", "no componentList", new Object[0]);
            c(3);
        } else {
            e();
            f(this.f14390j, arrayList);
        }
    }

    public final void f(Context context, List<String> list) {
        w7i.a("NaviQuery", "getComponentFeatureApkPath - action = " + list, new Object[0]);
        Map<String, OmsPluginInfo> mapC = new LoadComponentRemote(context).c(list);
        w7i.a("NaviQuery", "after query component plugin.", new Object[0]);
        HashMap map = new HashMap();
        for (String str : list) {
            map.put(str + "_COMPONENT_VERSION", "");
            map.put(str + "_COMPONENT_PATH", "");
        }
        if (mapC == null || mapC.isEmpty()) {
            c(3);
            return;
        }
        for (String str2 : mapC.keySet()) {
            OmsPluginInfo omsPluginInfo = mapC.get(str2);
            int versionCode = (int) omsPluginInfo.getVersionCode();
            String versionName = omsPluginInfo.getVersionName();
            File file = new File(new File(omsPluginInfo.getApkPath()), omsPluginInfo.getApkName());
            if (file.exists()) {
                String absolutePath = file.getAbsolutePath();
                map.put(str2 + "_COMPONENT_VERSION", versionName + "@" + versionCode);
                map.put(str2 + "_COMPONENT_PATH", absolutePath);
            } else {
                w7i.i("NaviQuery", "getComponentFeatureApkPath - apk is not existed", new Object[0]);
            }
        }
        p1h.b(context).d(map);
        c(2);
    }
}
