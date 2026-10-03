package com.coloros.sceneservice.sceneprovider.service;

import android.text.TextUtils;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.coloros.sceneservice.i.e;
import com.coloros.sceneservice.j.c;
import com.coloros.sceneservice.m.f;
import com.coloros.sceneservice.sceneprovider.SceneObjectFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes13.dex */
public class ServiceManager {
    public static final String TAG = "ServiceManager";
    public final ConcurrentHashMap zc;

    public static class a {
        public static ServiceManager sInstance = new ServiceManager();
    }

    public static ServiceManager getInstance() {
        return a.sInstance;
    }

    public BaseSceneService a(List list, String str) {
        f.d("ServiceManager", "removeService serviceId:" + str);
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Integer) it.next()).intValue();
            c.getInstance().c(iIntValue, str);
            e.getInstance().b(iIntValue, str);
        }
        return (BaseSceneService) this.zc.remove(str);
    }

    @Keep
    public BaseSceneService createService(int i, String str) {
        f.i("ServiceManager", "createService:sceneId=" + i + ",serviceId=" + str);
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (SceneObjectFactory.getObjectFactory() == null) {
            f.d("ServiceManager", "SceneObjectFactory is null, return null");
            return null;
        }
        BaseSceneService baseSceneServiceCreateService = SceneObjectFactory.getObjectFactory().createService(i, str);
        if (baseSceneServiceCreateService != null) {
            if (!str.equals(baseSceneServiceCreateService.getServiceId())) {
                baseSceneServiceCreateService.setServiceId(str);
            }
            this.zc.put(str, baseSceneServiceCreateService);
            return baseSceneServiceCreateService;
        }
        f.w("ServiceManager", "getService:" + str + " return null!");
        return null;
    }

    @NonNull
    @Keep
    public List getAllServices() {
        ArrayList arrayList = new ArrayList(this.zc.values());
        f.d("ServiceManager", "getAllServices size:" + arrayList.size());
        return arrayList;
    }

    @Keep
    public BaseSceneService getService(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (BaseSceneService) this.zc.get(str);
    }

    public ServiceManager() {
        this.zc = new ConcurrentHashMap();
    }
}
