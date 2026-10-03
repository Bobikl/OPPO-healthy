package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes16.dex */
public interface rc0 {
    public static final String COLUMBUS_STORE;
    public static final String DEV_HOST;
    public static final String DOMAIN_SAFE_URL_NEW_STORE;
    public static final String DOMAIN_SAFE_URL_OLD_STORE;
    public static final String PRODUCT_HOST;
    public static final String URL_NEW_STORE;
    public static final String URL_OLD_STORE;

    static {
        String str = qe0.F() ? "http://cdo-test-store.s3v2-qos.storage.wanyol.com/" : "https://activity-cdo.heytapimage.com/";
        DOMAIN_SAFE_URL_NEW_STORE = str;
        String str2 = str + "openplat/cdoActivity/staticActivity/XyGqqM/htmls/XyGqqM.html?actId=9409&c=0&preload=1";
        DEV_HOST = str2;
        String str3 = str + "cdo-activity/staticActivity/Xa7pqM/htmls/Xa7pqM.html?actId=38365&maxage=0&c=0&preload=1";
        PRODUCT_HOST = str3;
        if (!qe0.F()) {
            str2 = str3;
        }
        URL_NEW_STORE = str2;
        String str4 = zv8.H5_PATH;
        DOMAIN_SAFE_URL_OLD_STORE = str4;
        URL_OLD_STORE = str4 + "OpenWatchStoreGuide/index.html#/?hasNav=1";
        COLUMBUS_STORE = str4 + "rtos-soft-store/index.html";
    }
}
