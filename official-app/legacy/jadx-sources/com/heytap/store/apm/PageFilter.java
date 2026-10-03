package com.heytap.store.apm;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class PageFilter {
    static final List<String> apiFilterList;
    static final List<String> exceptionFilterList;
    static final List<String> pageFilterList;

    static {
        ArrayList arrayList = new ArrayList();
        pageFilterList = arrayList;
        ArrayList arrayList2 = new ArrayList();
        apiFilterList = arrayList2;
        exceptionFilterList = new ArrayList();
        arrayList.add("MainActivity");
        arrayList.add("SplashActivity");
        arrayList.add("InitActivity");
        arrayList.add("HomeEventsActivity");
        arrayList.add("TCAudienceActivity");
        arrayList.add("NoBgWindowInitActivity");
        arrayList.add("DeepLinkInterpreterActivity");
        arrayList.add("WebBrowserActivity");
        arrayList.add("EasygoWebBrowserActivity");
        arrayList.add("PostEditActivity");
        arrayList.add("imagepicker");
        arrayList.add("business.rn");
        arrayList.add("GlobalCouponActivity");
        arrayList.add("CommentImageGalleryActivity");
        arrayList.add("FinShellApiActivity");
        arrayList.add("WXPayEntryActivity");
        arrayList2.add("getCount");
        arrayList2.add("getOldSkuInfo");
        arrayList2.add("birthdayIcons");
    }

    public static boolean isAPPStartFiltered(String str) {
        return str.contains("InitActivity") || str.equals("DeepLinkInterpreterActivity");
    }

    public static boolean isApiFiltered(String str) {
        return strContainFilter(str, apiFilterList);
    }

    public static boolean isExceptionFiltered(String str) {
        return strContainFilter(str, exceptionFilterList);
    }

    public static boolean isPageFiltered(String str) {
        return strContainFilter(str, pageFilterList);
    }

    private static boolean strContainFilter(String str, List<String> list) {
        try {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                if (str.contains(it.next())) {
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }
}
