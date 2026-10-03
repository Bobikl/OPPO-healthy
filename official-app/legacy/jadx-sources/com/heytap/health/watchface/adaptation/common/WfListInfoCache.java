package com.heytap.health.watchface.adaptation.common;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.heytap.health.watchface.adaptation.base.BaseWatchFaceBean;
import com.oplus.aiunit.vision.ltl;
import com.oplus.aiunit.vision.v9g;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public class WfListInfoCache {
    public Map<String, List<BaseWatchFaceBean>> a;

    public static class a {
        public static final WfListInfoCache a = new WfListInfoCache();
    }

    public static WfListInfoCache b() {
        return a.a;
    }

    public void a(String str) {
        this.a.remove(str);
    }

    public final List<BaseWatchFaceBean> c(String str) {
        String strD = v9g.w().D("watch_face_list_info" + str);
        ltl.a("WfPreviewCache", "getPreviewCache list " + strD);
        try {
            return (List) new Gson().fromJson(strD, new TypeToken<List<BaseWatchFaceBean>>() { // from class: com.heytap.health.watchface.adaptation.common.WfListInfoCache.1
            }.getType());
        } catch (Exception e2) {
            ltl.a("WfPreviewCache", "getPreviewFromLocalCache Exception " + e2.toString());
            return null;
        }
    }

    public synchronized List<BaseWatchFaceBean> d(String str) {
        List<BaseWatchFaceBean> listC;
        listC = this.a.get(str);
        if (listC == null) {
            listC = c(str);
        }
        this.a.put(str, listC);
        return listC;
    }

    public synchronized void e(String str, List<BaseWatchFaceBean> list) {
        this.a.put(str, list);
        String json = new Gson().toJson(list);
        ltl.a("WfPreviewCache", "updateWfPreview s " + json);
        v9g.w().U("watch_face_list_info" + str, json);
    }

    public WfListInfoCache() {
        this.a = new HashMap();
    }
}
