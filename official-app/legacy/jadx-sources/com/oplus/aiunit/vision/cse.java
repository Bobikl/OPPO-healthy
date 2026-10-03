package com.oplus.aiunit.vision;

import android.text.TextUtils;
import android.util.LruCache;
import androidx.annotation.NonNull;
import com.heytap.webpro.preload.parallel.entity.Limit;
import com.heytap.webpro.preload.parallel.entity.PreloadConfig;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes3.dex */
public class cse {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final cse f10226c = new cse();
    public static final Map<String, String> d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Map<String, bv9> f10227e = new HashMap();
    public final LruCache<String, Map<String, PreloadConfig.PreloadConfigData>> a = new LruCache<>(ix3.DEFAULT_MQTT_MAX_SIZE);
    public final ReentrantReadWriteLock b = new ReentrantReadWriteLock();

    public static cse f() {
        return f10226c;
    }

    public final boolean a(PreloadConfig.PreloadConfigData preloadConfigData, Map<String, PreloadConfig.PreloadConfigData> map) {
        List<Limit> list = preloadConfigData.limit;
        if (list == null || list.isEmpty()) {
            q7b.i("PreloadDataCacheManager", "no limit:  data.page:  " + preloadConfigData.page);
            map.put(preloadConfigData.page, preloadConfigData);
            return true;
        }
        if (!j(list)) {
            q7b.i("PreloadDataCacheManager", "it is limit，page：  " + preloadConfigData.page + "  api:  " + preloadConfigData.api);
            return false;
        }
        q7b.i("PreloadDataCacheManager", "it is add interface，page：  " + preloadConfigData.page + "  api:  " + preloadConfigData.api);
        map.put(preloadConfigData.page, preloadConfigData);
        return true;
    }

    public void b(String str, bv9 bv9Var) {
        f10227e.put(str, bv9Var);
    }

    public void c(String str, List<PreloadConfig.PreloadConfigData> list) {
        if (list == null || list.isEmpty()) {
            q7b.n("PreloadDataCacheManager", "addPreloadConfigData is null");
            return;
        }
        Map<String, PreloadConfig.PreloadConfigData> mapH = h(str);
        if (mapH == null) {
            mapH = new HashMap<>();
        }
        for (PreloadConfig.PreloadConfigData preloadConfigData : list) {
            if (a(preloadConfigData, mapH)) {
                d.put(preloadConfigData.page, str);
            }
        }
        if (mapH.size() > 0) {
            this.b.writeLock().lock();
            try {
                this.a.put(str, mapH);
            } finally {
                this.b.writeLock().unlock();
            }
        }
    }

    public void d() {
        q7b.i("PreloadDataCacheManager", "clearInterfaceData");
        this.a.evictAll();
    }

    public String e(@NonNull String str) {
        return d.get(qse.b(str));
    }

    public bv9 g(String str) {
        return f10227e.get(str);
    }

    public final Map<String, PreloadConfig.PreloadConfigData> h(String str) {
        this.b.readLock().lock();
        try {
            return this.a.get(str);
        } finally {
            this.b.readLock().unlock();
        }
    }

    public PreloadConfig.PreloadConfigData i(String str) {
        if (TextUtils.isEmpty(str)) {
            q7b.d("PreloadDataCacheManager", "page is null, page:  " + str);
            return null;
        }
        String strB = qse.b(str);
        String str2 = d.get(strB);
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        Map<String, PreloadConfig.PreloadConfigData> mapH = h(str2);
        if (mapH != null) {
            return mapH.get(strB);
        }
        q7b.d("PreloadDataCacheManager", "map is null, page:  " + strB);
        return null;
    }

    public final boolean j(List<Limit> list) {
        Iterator<Limit> it = list.iterator();
        while (it.hasNext()) {
            if (!Limit.checkLimit(it.next())) {
                return false;
            }
        }
        return true;
    }
}
