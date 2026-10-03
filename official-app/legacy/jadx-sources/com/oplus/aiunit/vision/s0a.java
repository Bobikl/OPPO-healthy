package com.oplus.aiunit.vision;

import com.heytap.health.watch.notification.CacheIcons;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bR8\u0010\u000f\u001a&\u0012\f\u0012\n \f*\u0004\u0018\u00010\b0\b \f*\u0012\u0012\f\u0012\n \f*\u0004\u0018\u00010\b0\b\u0018\u00010\r0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000eR8\u0010\u0010\u001a&\u0012\f\u0012\n \f*\u0004\u0018\u00010\b0\b \f*\u0012\u0012\f\u0012\n \f*\u0004\u0018\u00010\b0\b\u0018\u00010\r0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000e¨\u0006\u0013"}, d2 = {"Lcom/oplus/aiunit/vision/s0a;", "", "Lcom/heytap/health/watch/notification/CacheIcons;", "cacheIcons", "", "b", "", "isNotification", "", "packageName", "a", "", "kotlin.jvm.PlatformType", "", "Ljava/util/List;", "notificationApps", "fluidApps", "<init>", "()V", "device_notification_impl2_release"}, k = 1, mv = {1, 8, 0})
public final class s0a {

    @NotNull
    public static final s0a INSTANCE = new s0a();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final List<String> notificationApps = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final List<String> fluidApps = Collections.synchronizedList(new ArrayList());

    public final boolean a(boolean isNotification, @NotNull String packageName) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        return isNotification ? notificationApps.contains(packageName) : fluidApps.contains(packageName);
    }

    public final void b(@NotNull CacheIcons cacheIcons) {
        Intrinsics.checkNotNullParameter(cacheIcons, "cacheIcons");
        a7b.f("NTF_CacheIcon", "onCacheIconsSync: " + cacheIcons);
        int syncType = cacheIcons.getSyncType();
        if (syncType == 0) {
            List<String> list = notificationApps;
            list.clear();
            List<String> notificationAppsList = cacheIcons.getNotificationAppsList();
            Intrinsics.checkNotNullExpressionValue(notificationAppsList, "cacheIcons.notificationAppsList");
            list.addAll(notificationAppsList);
            List<String> list2 = fluidApps;
            list2.clear();
            List<String> fluidAppsList = cacheIcons.getFluidAppsList();
            Intrinsics.checkNotNullExpressionValue(fluidAppsList, "cacheIcons.fluidAppsList");
            list2.addAll(fluidAppsList);
            return;
        }
        if (syncType != 1) {
            return;
        }
        List<String> list3 = notificationApps;
        List<String> notificationAppsList2 = cacheIcons.getNotificationAppsList();
        Intrinsics.checkNotNullExpressionValue(notificationAppsList2, "cacheIcons.notificationAppsList");
        list3.removeAll(notificationAppsList2);
        List<String> notificationAppsList3 = cacheIcons.getNotificationAppsList();
        Intrinsics.checkNotNullExpressionValue(notificationAppsList3, "cacheIcons.notificationAppsList");
        list3.addAll(notificationAppsList3);
        List<String> list4 = fluidApps;
        List<String> fluidAppsList2 = cacheIcons.getFluidAppsList();
        Intrinsics.checkNotNullExpressionValue(fluidAppsList2, "cacheIcons.fluidAppsList");
        list4.removeAll(fluidAppsList2);
        List<String> fluidAppsList3 = cacheIcons.getFluidAppsList();
        Intrinsics.checkNotNullExpressionValue(fluidAppsList3, "cacheIcons.fluidAppsList");
        list4.addAll(fluidAppsList3);
    }
}
