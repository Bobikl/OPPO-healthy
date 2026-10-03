package com.heytap.store.base.core.util.statistics;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class PagePathMap {
    static Map<String, PathInfo> pageMap = new HashMap();

    public static class PathInfo {
        public String fistPath;
        public String secondPath;

        public PathInfo(String str, String str2) {
            this.fistPath = str;
            this.secondPath = str2;
        }
    }

    public static PathInfo getPathInfo(String str) {
        return pageMap.get(str);
    }

    public static void putPath(String str, String str2, String str3) {
        pageMap.put(str, new PathInfo(str2, str3));
    }
}
