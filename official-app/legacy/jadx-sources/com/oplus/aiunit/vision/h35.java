package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.oplus.instant.router.Instant;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes19.dex */
public class h35 {
    public static final String DEEPLINK_BACKUP_STORE_URL = "oaps://theme/home";
    public static final String DEEPLINK_DEVICE_PAGE = "healthap://app/path=100?tab=3";
    public static final String DEEPLINK_PANTA_CONNECT_WATCH = "pantaconnect://share/touch?carousel_page_index=4";
    public static final String DEEPLINK_PERMISSION_URL = "health://permission/dialog";
    public static final String DEEPLINK_WATCH_FACE_ALBUM = "healthap://app/path=403";
    public static final String DEEPLINK_WATCH_FACE_ALBUM_V2 = "healthap://app/path=415";
    public static final String DEEPLINK_WATCH_FACE_ALBUM_V2_MANAGER = "healthap://app/path=430";
    public static final String DEEPLINK_WATCH_FACE_CLASSIC = "healthap://app/path=405";
    public static final String DEEPLINK_WATCH_FACE_DOF = "healthap://app/path=425";
    public static final String DEEPLINK_WATCH_FACE_LIVEPHOTO = "healthap://app/path=416";
    public static final String DEEPLINK_WATCH_FACE_OMOJI = "healthap://app/path=410";
    public static final String DEEPLINK_WATCH_FACE_OUTFITS = "healthap://app/path=404";
    public static final String DEEPLINK_WATCH_FACE_PAINT = "healthap://app/path=406";
    public static final String DEEPLINK_WATCH_FACE_STORE = "healthap://app/path=407";
    public static final String DEEPLINK_WATCH_FACE_VIDEO = "healthap://app/path=411";
    public static final String TAG = "DeepLinkUtil";
    public static final String[] a = {Instant.SCHEME_OAPS};

    public static boolean a(Context context, Intent intent) {
        boolean z = false;
        if (context != null && intent != null) {
            try {
                if (context.getApplicationContext().getPackageManager().resolveActivity(intent, 65536) != null) {
                    z = true;
                }
            } catch (Exception e2) {
                ltl.b(TAG, "[isActivityExist] activity is not exist1" + e2);
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[isActivityExist] intent=");
        sb.append(intent != null ? intent.toString() : "null");
        sb.append(",result=");
        sb.append(z);
        ltl.a(TAG, sb.toString());
        return z;
    }

    public static boolean b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Iterator it = Arrays.asList(a).iterator();
        while (it.hasNext()) {
            if (str.startsWith((String) it.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean c() {
        return ilj.l() >= 11;
    }

    public static void d(Context context, String str) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.addFlags(268435456);
            context.startActivity(intent);
        } catch (Exception unused) {
            ltl.b(TAG, "[linkTo] uri " + str);
        }
    }

    public static void e(Context context) {
        d(context, DEEPLINK_BACKUP_STORE_URL);
    }

    public static void f(String str) {
        mmd.c().a(Uri.parse(str), null);
    }
}
