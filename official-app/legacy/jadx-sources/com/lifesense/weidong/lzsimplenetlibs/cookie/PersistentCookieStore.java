package com.lifesense.weidong.lzsimplenetlibs.cookie;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.net.CookieStore;
import java.net.HttpCookie;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public class PersistentCookieStore implements CookieStore {
    public static final String SP_COOKIE_STORE = "lifesense_cookieStore";
    public static final String SP_KEY_DELIMITER = "|";
    public static final String SP_KEY_DELIMITER_REGEX = "\\|";
    public static final String TAG = "PersistentCookieStore";
    public Map<URI, Set<HttpCookie>> allCookies;
    public SharedPreferences sharedPreferences;

    public PersistentCookieStore(Context context) {
        this.sharedPreferences = context.getSharedPreferences(SP_COOKIE_STORE, 0);
        loadAllFromPersistence();
    }

    private boolean checkDomainsMatch(String str, String str2) {
        if (!str2.equals(str)) {
            if (!str2.endsWith("." + str)) {
                return false;
            }
        }
        return true;
    }

    private boolean checkPathsMatch(String str, String str2) {
        if (str2.equals(str)) {
            return true;
        }
        if (str2.startsWith(str) && str.charAt(str.length() - 1) == '/') {
            return true;
        }
        return str2.startsWith(str) && str2.substring(str.length()).charAt(0) == '/';
    }

    public static URI cookieUri(URI uri, HttpCookie httpCookie) {
        if (httpCookie.getDomain() == null) {
            return uri;
        }
        String domain = httpCookie.getDomain();
        if (domain.charAt(0) == '.') {
            domain = domain.substring(1);
        }
        try {
            return new URI(uri.getScheme() == null ? "http" : uri.getScheme(), domain, httpCookie.getPath() == null ? "/" : httpCookie.getPath(), null);
        } catch (URISyntaxException e2) {
            Log.w(TAG, e2);
            return uri;
        }
    }

    private List<HttpCookie> getValidCookies(URI uri) {
        ArrayList arrayList = new ArrayList();
        for (URI uri2 : this.allCookies.keySet()) {
            if (checkDomainsMatch(uri2.getHost(), uri.getHost()) && checkPathsMatch(uri2.getPath(), uri.getPath())) {
                arrayList.addAll(this.allCookies.get(uri2));
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            HttpCookie httpCookie = (HttpCookie) it.next();
            if (httpCookie.hasExpired()) {
                removeFromPersistence(uri, httpCookie);
                it.remove();
            }
        }
        return arrayList;
    }

    private void loadAllFromPersistence() {
        this.allCookies = new HashMap();
        for (Map.Entry<String, ?> entry : this.sharedPreferences.getAll().entrySet()) {
            try {
                URI uri = new URI(entry.getKey().split("\\|", 2)[0]);
                HttpCookie httpCookieDecode = new SerializableHttpCookie().decode((String) entry.getValue());
                Set<HttpCookie> hashSet = this.allCookies.get(uri);
                if (hashSet == null) {
                    hashSet = new HashSet<>();
                    this.allCookies.put(uri, hashSet);
                }
                if (httpCookieDecode != null) {
                    hashSet.add(httpCookieDecode);
                }
            } catch (URISyntaxException e2) {
                Log.e(TAG, e2.getLocalizedMessage());
            }
        }
        Log.d(TAG, "loadAllCookie size: " + this.allCookies.size());
    }

    private void removeAllFromPersistence() {
        this.sharedPreferences.edit().clear().apply();
    }

    private void removeFromPersistence(URI uri, HttpCookie httpCookie) {
        this.sharedPreferences.edit().remove(uri.toString() + "|" + httpCookie.getName()).apply();
    }

    private void saveToPersistence(URI uri, HttpCookie httpCookie) {
        this.sharedPreferences.edit().putString(uri.toString() + "|" + httpCookie.getName(), new SerializableHttpCookie().encode(httpCookie)).apply();
    }

    @Override // java.net.CookieStore
    public synchronized void add(URI uri, HttpCookie httpCookie) {
        URI uriCookieUri = cookieUri(uri, httpCookie);
        Set<HttpCookie> hashSet = this.allCookies.get(uriCookieUri);
        if (hashSet == null) {
            hashSet = new HashSet<>();
            this.allCookies.put(uriCookieUri, hashSet);
        }
        hashSet.remove(httpCookie);
        hashSet.add(httpCookie);
        saveToPersistence(uriCookieUri, httpCookie);
        if (uriCookieUri != null && httpCookie != null) {
            Log.d(TAG, "uri: " + uriCookieUri.toString() + " cookie: " + httpCookie.getName());
        }
    }

    @Override // java.net.CookieStore
    public synchronized List<HttpCookie> get(URI uri) {
        try {
            if (uri == null) {
                return Collections.emptyList();
            }
            List<HttpCookie> validCookies = getValidCookies(uri);
            if (validCookies == null) {
                Log.d(TAG, "uri: " + uri.toString() + " getValidCookie null");
            }
            return validCookies;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.net.CookieStore
    public synchronized List<HttpCookie> getCookies() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator<URI> it = this.allCookies.keySet().iterator();
        while (it.hasNext()) {
            arrayList.addAll(getValidCookies(it.next()));
        }
        return arrayList;
    }

    @Override // java.net.CookieStore
    public synchronized List<URI> getURIs() {
        return new ArrayList(this.allCookies.keySet());
    }

    @Override // java.net.CookieStore
    public synchronized boolean remove(URI uri, HttpCookie httpCookie) {
        boolean z;
        Set<HttpCookie> set = this.allCookies.get(uri);
        z = set != null && set.remove(httpCookie);
        if (z) {
            removeFromPersistence(uri, httpCookie);
        }
        if (uri != null) {
            Log.d(TAG, "remove cookie uri: " + uri + " cooieRemoved: " + z);
        }
        return z;
    }

    @Override // java.net.CookieStore
    public synchronized boolean removeAll() {
        removeAllFromPersistence();
        this.allCookies.clear();
        Log.e(TAG, "remove all cookie");
        return true;
    }
}
