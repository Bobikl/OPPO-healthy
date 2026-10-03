package com.oplus.aiunit.vision;

import android.net.Uri;
import android.os.Bundle;
import com.heytap.health.base.task.ThreadUtils;

/* JADX INFO: loaded from: classes16.dex */
public final class k80 {
    public static final int TIME_INTERVAL = 300000;
    public static volatile int mCurrentTotalCount = -1;
    public static long queryTime;

    public static void c(final int i) {
        a7b.f("AppBadgeUtil", "forceUpdateAppBadgeCount, badgeCount:" + i);
        ThreadUtils.doInBackground("BadgeCount", new Runnable() { // from class: com.oplus.aiunit.vision.i80
            @Override // java.lang.Runnable
            public final void run() {
                k80.d(i);
            }
        });
    }

    public static /* synthetic */ void d(int i) {
        synchronized (k80.class) {
            h(i);
        }
    }

    public static /* synthetic */ void e(int i) {
        synchronized (k80.class) {
            if (mCurrentTotalCount != i) {
                h(i);
            } else {
                a7b.f("AppBadgeUtil", "setOrUpdateAppBadgeCount, badge count no changed");
                f();
            }
        }
    }

    public static void f() {
        if (System.currentTimeMillis() - queryTime < 300000) {
            return;
        }
        queryTime = System.currentTimeMillis();
        try {
            Bundle bundleCall = b78.a().getContentResolver().call(Uri.parse("content://com.android.badge/badge"), "getAppBadgeCount", (String) null, new Bundle());
            if (bundleCall != null) {
                mCurrentTotalCount = bundleCall.getInt("app_badge_count");
            }
        } catch (Exception e2) {
            a7b.c("AppBadgeUtil", "queryBadge exception, message:" + e2.getMessage(), e2);
        }
    }

    public static void g(final int i) {
        a7b.f("AppBadgeUtil", "setOrUpdateAppBadgeCount, mCurrentTotalCount: " + mCurrentTotalCount + ", badgeCount:" + i);
        ThreadUtils.doInBackground("BadgeCount", new Runnable() { // from class: com.oplus.aiunit.vision.j80
            @Override // java.lang.Runnable
            public final void run() {
                k80.e(i);
            }
        });
    }

    public static void h(int i) {
        try {
            Bundle bundle = new Bundle();
            bundle.putInt("app_badge_count", i);
            Bundle bundleCall = b78.a().getContentResolver().call(Uri.parse("content://com.android.badge/badge"), "setAppBadgeCount", (String) null, bundle);
            if (bundleCall != null) {
                mCurrentTotalCount = bundleCall.getInt("app_badge_count");
            }
            com.heytap.health.base.track.a.A().a("redid", 1).b();
        } catch (Exception e2) {
            a7b.c("AppBadgeUtil", "setOrUpdateAppBadgeCount exception, message:" + e2.getMessage(), e2);
        }
    }
}
