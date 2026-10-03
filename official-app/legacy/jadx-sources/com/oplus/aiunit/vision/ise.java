package com.oplus.aiunit.vision;

import android.text.TextUtils;
import android.util.LruCache;
import androidx.annotation.WorkerThread;
import com.heytap.webpro.preload.res.db.entity.H5OfflineRecord;
import com.heytap.webpro.preload.res.entity.ResourceCache;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes3.dex */
public class ise {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ise f12637c = new ise();
    public final LruCache<String, Map<String, H5OfflineRecord>> a = new LruCache<>(ix3.DEFAULT_MQTT_MAX_SIZE);
    public final ReentrantReadWriteLock b = new ReentrantReadWriteLock();

    public static ise f() {
        return f12637c;
    }

    public void a(String str, List<H5OfflineRecord> list) {
        Map<String, H5OfflineRecord> mapE = e(str);
        if (mapE == null) {
            mapE = new HashMap<>();
        }
        if (list != null) {
            for (H5OfflineRecord h5OfflineRecord : list) {
                String url = h5OfflineRecord.getUrl();
                if (!TextUtils.isEmpty(url)) {
                    mapE.put(url, h5OfflineRecord);
                }
            }
            if (!mapE.isEmpty()) {
                q7b.i("PreloadResCacheManager", "add cache success:  productCode:  " + str + "  map size:  " + mapE.size());
                this.b.writeLock().lock();
                try {
                    this.a.put(str, mapE);
                    return;
                } finally {
                    this.b.writeLock().unlock();
                }
            }
        }
        q7b.i("PreloadResCacheManager", "add cache failed:  productCode:  " + str + "  cache size is zero");
    }

    public void b(String str) {
        q7b.i("PreloadResCacheManager", "clearAllByProductCode, productCode:  " + str);
        this.a.remove(str);
    }

    @WorkerThread
    public void c(String str, List<H5OfflineRecord> list) {
        q7b.i("PreloadResCacheManager", "clearByAppId, productCode:  " + str);
        this.b.readLock().lock();
        try {
            Map<String, H5OfflineRecord> map = this.a.get(str);
            if (map == null) {
                this.b.readLock().unlock();
                return;
            }
            Iterator<H5OfflineRecord> it = list.iterator();
            while (it.hasNext()) {
                map.remove(it.next().getUrl());
            }
            this.b.readLock().unlock();
        } catch (Throwable th) {
            this.b.readLock().unlock();
            throw th;
        }
    }

    public final String d(H5OfflineRecord h5OfflineRecord) {
        return com.heytap.webpro.preload.res.utils.a.c() + h5OfflineRecord.getAppIdInt() + File.separator + h5OfflineRecord.getName();
    }

    public final Map<String, H5OfflineRecord> e(String str) {
        this.b.readLock().lock();
        try {
            return this.a.get(str);
        } finally {
            this.b.readLock().unlock();
        }
    }

    public ResourceCache g(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            q7b.d("PreloadResCacheManager", "get url path, url is null ");
            return null;
        }
        String strB = qse.b(str2);
        Map<String, H5OfflineRecord> map = this.a.get(str);
        if (map == null) {
            q7b.n("PreloadResCacheManager", "get url path, map == null");
            return null;
        }
        H5OfflineRecord h5OfflineRecord = map.get(strB);
        if (h5OfflineRecord == null) {
            q7b.n("PreloadResCacheManager", "get url path, h5OfflineRecord == null, url:  " + strB);
            return null;
        }
        ResourceCache resourceCache = new ResourceCache();
        resourceCache.setPath(d(h5OfflineRecord));
        resourceCache.setType(h5OfflineRecord.getType());
        resourceCache.setMd5(h5OfflineRecord.getMd5());
        resourceCache.setHeaders(qse.a(h5OfflineRecord.getHeaders()));
        return resourceCache;
    }
}
