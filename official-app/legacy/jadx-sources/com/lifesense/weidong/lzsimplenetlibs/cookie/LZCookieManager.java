package com.lifesense.weidong.lzsimplenetlibs.cookie;

import android.content.Context;
import android.util.Log;
import com.lifesense.weidong.lzsimplenetlibs.common.ApplicationHolder;
import com.lifesense.weidong.lzsimplenetlibs.net.HttpResponse;
import com.lifesense.weidong.lzsimplenetlibs.util.PreferencesUtils;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.net.HttpCookie;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;

/* JADX INFO: loaded from: classes5.dex */
public class LZCookieManager {
    public static final String SET_COOKIE = "Set-cookie";
    public static final String SET_COOKIE2 = "Set-cookie2";
    public CookieManager mCookieManager;
    public PersistentCookieStore sPersistentCookieStore;

    public static class SingleHolder {
        public static LZCookieManager lzCookieManager = new LZCookieManager();

        public static LZCookieManager getSingleton() {
            return lzCookieManager;
        }
    }

    public LZCookieManager() {
        this.mCookieManager = null;
        this.sPersistentCookieStore = null;
        getCookieManager();
    }

    private void addCookiesToHeads(Map<String, String> map, Map<String, List<String>> map2) {
        for (Map.Entry<String, List<String>> entry : map2.entrySet()) {
            String key = entry.getKey();
            if ("Cookie".equalsIgnoreCase(key) || "Cookie2".equalsIgnoreCase(key)) {
                if (!entry.getValue().isEmpty()) {
                    map.put(key, buildCookieHeader(entry.getValue()));
                }
            }
        }
    }

    private String buildCookieHeader(List<String> list) {
        if (CollectionUtils.isEmpty(list)) {
            return "";
        }
        return list.size() == 1 ? list.get(0) : StringUtils.join(list, "; ");
    }

    public static LZCookieManager getInstance() {
        return SingleHolder.getSingleton();
    }

    private synchronized void initSelfCookieManager(Context context) {
        if (this.sPersistentCookieStore == null) {
            this.sPersistentCookieStore = new PersistentCookieStore(context);
        }
        if (this.mCookieManager == null) {
            this.mCookieManager = new CookieManager(this.sPersistentCookieStore, CookiePolicy.ACCEPT_ALL);
        }
    }

    public void addUriCookiesToHeads(Map<String, String> map, URI uri) {
        if (uri == null) {
            return;
        }
        try {
            Map<String, List<String>> map2 = getCookieManager().get(uri, new HashMap());
            if (map2 != null) {
                addCookiesToHeads(map, map2);
            }
        } catch (Exception e2) {
            Log.e("COOKIE_ERROR", e2.getMessage());
        }
    }

    public void clearCookie() {
        PersistentCookieStore persistentCookieStore = this.sPersistentCookieStore;
        if (persistentCookieStore != null) {
            persistentCookieStore.removeAll();
        }
    }

    public CookieManager getCookieManager() {
        if (this.mCookieManager == null) {
            initSelfCookieManager(ApplicationHolder.getmApplication());
        }
        return this.mCookieManager;
    }

    public String getCookies() {
        return PreferencesUtils.getString(ApplicationHolder.getmApplication(), SET_COOKIE, "");
    }

    public List<HttpCookie> getUriCookie(URI uri) {
        PersistentCookieStore persistentCookieStore = this.sPersistentCookieStore;
        return persistentCookieStore != null ? persistentCookieStore.get(uri) : new ArrayList();
    }

    public void saveCookie(HttpResponse httpResponse) {
        try {
            if (httpResponse.getUrl() == null || httpResponse.getHeaderFields() == null) {
                return;
            }
            getCookieManager().put(httpResponse.getUrl().toURI(), httpResponse.getHeaderFields());
        } catch (Exception e2) {
            Log.e("COOKIE_ERROR", e2.getMessage());
        }
    }
}
