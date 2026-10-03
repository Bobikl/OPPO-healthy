package com.coloros.sceneservice.m;

import android.net.Uri;

/* JADX INFO: loaded from: classes13.dex */
public class i {
    public static final String AUTHORITY = "com.coloros.sceneservice.scenesprovider";
    public static final String TAG = "ScenesProviderUtils";
    public static final String URI_STRING = "content://com.coloros.sceneservice.scenesprovider";
    public static final String da = "notify";
    public static final String ha = "?notify=false";
    public static final String ia = "?notify=true";

    public static Uri a(String str, boolean z) {
        StringBuilder sb;
        if (z) {
            sb = new StringBuilder();
            sb.append("content://com.coloros.sceneservice.scenesprovider/");
        } else {
            sb = new StringBuilder();
            sb.append("content://com.coloros.sceneservice.scenesprovider/");
            sb.append(str);
            str = "?notify=false";
        }
        sb.append(str);
        return Uri.parse(sb.toString());
    }
}
