package com.platform.usercenter.bizuws.utils;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.heytap.webview.extension.protocol.Const;
import com.oplus.aiunit.vision.bia;
import com.platform.usercenter.BaseApp;
import com.platform.usercenter.tools.datastructure.Sets;
import com.platform.usercenter.tools.io.FileUtils;
import com.platform.usercenter.tools.log.UCLogUtil;
import com.platform.usercenter.tools.storage.SPreferenceCommonHelper;
import java.net.URI;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public class BizUwsJSSecurityChecker {
    public static final String KEY_DEEPLINE_PKG_WHITELIST = "key_deeplink_pkg_whitelist";
    private Set<String> availableList = Sets.newHashSet();
    private Set<String> jsDomainsScanWhitelist;
    private Set<String> jsDomainsWhitelist;
    private Set<String> mDeepLinkWhitePkgs;

    public static class LazyHolder {
        static final BizUwsJSSecurityChecker INSTANCE = new BizUwsJSSecurityChecker();

        private LazyHolder() {
        }
    }

    public class WhitePkgBean {
        private Set<String> deepLinkWhitePkgs;

        public WhitePkgBean() {
        }
    }

    public static BizUwsJSSecurityChecker getInstance() {
        return LazyHolder.INSTANCE;
    }

    private void initDeepLinkWhiteList() {
        if (this.mDeepLinkWhitePkgs == null) {
            this.mDeepLinkWhitePkgs = loadFromCache();
        }
    }

    private void initWhiteList() {
    }

    private final boolean isWhiteList(String str) {
        if (isInnerWhiteList(str)) {
            return true;
        }
        Set<String> set = this.jsDomainsWhitelist;
        if (set != null && !set.isEmpty() && this.jsDomainsWhitelist.contains(str)) {
            return true;
        }
        Set<String> set2 = this.jsDomainsScanWhitelist;
        return (set2 == null || set2.isEmpty() || !this.jsDomainsScanWhitelist.contains(str)) ? false : true;
    }

    private static Set<String> loadFromCache() {
        HashSet<String> stringSet = SPreferenceCommonHelper.getStringSet(BaseApp.mContext, KEY_DEEPLINE_PKG_WHITELIST, null);
        if (stringSet != null && !stringSet.isEmpty()) {
            return stringSet;
        }
        try {
            WhitePkgBean whitePkgBean = (WhitePkgBean) new Gson().fromJson(FileUtils.readStringFromAssert(BaseApp.mContext, "jswpkg.json"), WhitePkgBean.class);
            return whitePkgBean != null ? whitePkgBean.deepLinkWhitePkgs : stringSet;
        } catch (Exception e2) {
            UCLogUtil.e(e2);
            UCLogUtil.e("loadFromCache--->" + e2.getLocalizedMessage());
            return stringSet;
        }
    }

    public boolean isAvailableDomain(String str) {
        URI uriCreate;
        initWhiteList();
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            uriCreate = URI.create(str);
        } catch (IllegalArgumentException e2) {
            UCLogUtil.e(e2);
            uriCreate = null;
        }
        if (uriCreate == null || uriCreate.getUserInfo() != null) {
            return false;
        }
        String host = uriCreate.getHost();
        if (TextUtils.isEmpty(host)) {
            return false;
        }
        if (this.availableList.contains(host)) {
            return true;
        }
        boolean zIsWhiteList = isWhiteList(host);
        if (zIsWhiteList) {
            this.availableList.add(host);
        } else {
            UCLogUtil.e("isAvailableDomain unAvailable url = " + str);
        }
        return zIsWhiteList;
    }

    public boolean isAvailableDomainForScan(String str) {
        URI uriCreate;
        initWhiteList();
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            uriCreate = URI.create(str);
            try {
                String scheme = uriCreate.getScheme();
                if (!"http".equals(scheme) && !Const.Scheme.SCHEME_HTTPS.equals(scheme)) {
                    return false;
                }
            } catch (IllegalArgumentException e2) {
                e = e2;
                UCLogUtil.e(e);
            }
        } catch (IllegalArgumentException e3) {
            e = e3;
            uriCreate = null;
        }
        if (uriCreate == null || uriCreate.getUserInfo() != null) {
            return false;
        }
        String host = uriCreate.getHost();
        if (this.jsDomainsScanWhitelist == null || TextUtils.isEmpty(host)) {
            return false;
        }
        return this.jsDomainsScanWhitelist.contains(host);
    }

    public boolean isDeepLinkWhiteList(String str) {
        if (TextUtils.isEmpty(str)) {
            UCLogUtil.i("isDeepLinkWhiteList false");
            return false;
        }
        if (str.equalsIgnoreCase(BaseApp.mContext.getPackageName())) {
            return true;
        }
        initDeepLinkWhiteList();
        Set<String> set = this.mDeepLinkWhitePkgs;
        if (set != null && set.contains(str)) {
            return true;
        }
        UCLogUtil.i("isDeepLinkWhiteList false");
        return false;
    }

    public final boolean isInnerWhiteList(String str) {
        return bia.a(str);
    }

    public void refreshWhiteList() {
    }

    public void setDeepLinkWhitePkgs(Set<String> set) {
        StringBuilder sb = new StringBuilder();
        sb.append("setDeepLinkWhitePkgs:");
        sb.append(set == null);
        UCLogUtil.i(sb.toString());
        this.mDeepLinkWhitePkgs = set;
    }

    public void setJsDomainsScanWhitelist(Set<String> set) {
        this.jsDomainsScanWhitelist = set;
    }

    public void setJsDomainsWhitelist(Set<String> set) {
        this.jsDomainsWhitelist = set;
    }
}
