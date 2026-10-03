package com.platform.usercenter.oauth.util;

import androidx.annotation.Keep;
import com.platform.usercenter.account.ams.bean.AcOauthMaskInfoRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes9.dex */
public class AcOauthCacheUtil {
    private static final long CACHE_EXPIRE_TIME = 300000;
    private static final String TAG = "AcOauthCacheUtil";
    private static Map<String, MaskInfoCacheEntry> maskInfoCache = new ConcurrentHashMap();

    @Keep
    public static class MaskInfoCacheEntry {
        final long createTime;
        final Map<String, String> data;
        final long expireTime;

        public MaskInfoCacheEntry(Map<String, String> map, long j2, long j3) {
            this.data = map;
            this.createTime = j2;
            this.expireTime = j3;
        }

        public boolean isExpired() {
            long jCurrentTimeMillis = System.currentTimeMillis();
            return jCurrentTimeMillis > this.expireTime || jCurrentTimeMillis < this.createTime;
        }
    }

    private static String getCacheKeyByRequest(AcOauthMaskInfoRequest acOauthMaskInfoRequest) {
        StringBuilder sb = new StringBuilder();
        sb.append(acOauthMaskInfoRequest.getAppId());
        sb.append("_");
        sb.append(acOauthMaskInfoRequest.getAppKey());
        sb.append("_");
        ArrayList arrayList = new ArrayList(acOauthMaskInfoRequest.getScopeList());
        Collections.sort(arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
            sb.append(",");
        }
        return sb.toString();
    }

    public static Map<String, String> getMaskInfoFromCache(AcOauthMaskInfoRequest acOauthMaskInfoRequest) {
        String cacheKeyByRequest = getCacheKeyByRequest(acOauthMaskInfoRequest);
        MaskInfoCacheEntry maskInfoCacheEntry = maskInfoCache.get(cacheKeyByRequest);
        if (maskInfoCacheEntry == null) {
            AcOauthLogUtil.i(TAG, "cache miss");
            return null;
        }
        if (!maskInfoCacheEntry.isExpired()) {
            AcOauthLogUtil.i(TAG, "cache hit");
            return maskInfoCacheEntry.data;
        }
        AcOauthLogUtil.i(TAG, "cache expired ");
        maskInfoCache.remove(cacheKeyByRequest);
        return null;
    }

    public static void putMaskInfoToCache(AcOauthMaskInfoRequest acOauthMaskInfoRequest, Map<String, String> map) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        maskInfoCache.put(getCacheKeyByRequest(acOauthMaskInfoRequest), new MaskInfoCacheEntry(map, jCurrentTimeMillis, jCurrentTimeMillis + 300000));
        AcOauthLogUtil.i(TAG, "putMaskInfoToCache " + jCurrentTimeMillis);
    }
}
