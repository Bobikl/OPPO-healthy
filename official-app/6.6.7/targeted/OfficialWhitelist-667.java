package com.heytap.health.watch.notification.impl.whitelist;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import com.heytap.health.watch.notification.NotificationRoomBean;
import com.heytap.health.watch.notification.NotificationSwitches$NotificationSwitchData;
import com.heytap.health.watch.notification.impl.R$string;
import com.heytap.health.watch.notification.impl.module.NotificationHolder;
import com.heytap.health.watch.notification.impl.ui.j;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.log.nx.obus.Constants;
import com.oplus.aiunit.p007vision.NotificationRoomBeanStatus;
import com.oplus.aiunit.p007vision.cb4;
import com.oplus.aiunit.p007vision.czc;
import com.oplus.aiunit.p007vision.lyc;
import com.oplus.aiunit.p007vision.mzc;
import com.oplus.aiunit.p007vision.r54;
import com.oplus.aiunit.p007vision.xyc;
import com.oplus.aiunit.p007vision.y51;
import com.oplus.aiunit.vision.a5k;
import com.oplus.aiunit.vision.e88;
import com.oplus.aiunit.vision.gpj;
import com.oplus.aiunit.vision.hm4;
import com.oplus.aiunit.vision.m8b;
import com.oplus.aiunit.vision.wl4;
import com.oplus.aiunit.vision.xg5;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes19.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0010\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b3\u00104J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\b\u001a\u00020\u0006J\u0016\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0004J\u001c\u0010\u000e\u001a\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\u0006\u0010\t\u001a\u00020\u0004J\u0016\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0004J\u001c\u0010\u0010\u001a\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\u0006\u0010\t\u001a\u00020\u0004J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u0014J\u000e\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0017\u001a\u00020\u0006J\b\u0010\u0018\u001a\u00020\nH\u0003J\b\u0010\u0019\u001a\u00020\u0006H\u0002J\b\u0010\u001a\u001a\u00020\u0006H\u0002J\b\u0010\u001b\u001a\u00020\u0006H\u0002J\b\u0010\u001c\u001a\u00020\u0006H\u0002J\u000e\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00110\u0014H\u0002J\u0016\u0010\u001f\u001a\u00020\u00062\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00110\u0014H\u0002J\u0018\u0010\"\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u0004H\u0002J\b\u0010#\u001a\u00020\nH\u0002J\u0010\u0010&\u001a\u00020%2\u0006\u0010$\u001a\u00020\u0011H\u0002J\u001c\u0010(\u001a\b\u0012\u0004\u0012\u00020%0\u00142\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00110\u0014H\u0002R\u0014\u0010)\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010+\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b+\u0010*R \u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010-R \u00101\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n0/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u00100R \u00102\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n0/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u00100¨\u00065"}, d2 = {"Lcom/heytap/health/watch/notification/impl/whitelist/a;", "", "", "packageName", "", "k", "", "u", "s", Constants.EVENT_STATUS_FIELD, "", "w", "", "packageNames", "b", LogFieldKey.TAG_KEY, "a", "Lcom/heytap/health/watch/notification/NotificationRoomBean;", LogFieldKey.PROCESS_NAME_KEY, "i", "", "q", "d", "v", "o", "c", "e", "g", "f", "j", "packages", "n", "feature", "newStatus", "r", "h", "item", "", LogFieldKey.LEVEL_KEY, "items", LogFieldKey.MESSAGE_KEY, "PACKAGE_MMS", "Ljava/lang/String;", "NEW_DATABASE_NAME", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/util/concurrent/ConcurrentHashMap;", "mPackageSwitchCache", "", "Ljava/util/Map;", "onSwitch", "offSwitch", "<init>", "()V", "device_notification_impl2_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nNotificationRoomHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotificationRoomHolder.kt\ncom/heytap/health/watch/notification/impl/whitelist/NotificationRoomHolder\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,729:1\n1855#2,2:730\n1855#2,2:732\n1855#2,2:734\n1855#2,2:736\n1855#2,2:738\n1855#2,2:740\n1855#2,2:742\n1855#2,2:744\n*S KotlinDebug\n*F\n+ 1 NotificationRoomHolder.kt\ncom/heytap/health/watch/notification/impl/whitelist/NotificationRoomHolder\n*L\n87#1:730,2\n94#1:732,2\n277#1:734,2\n588#1:736,2\n594#1:738,2\n619#1:740,2\n625#1:742,2\n654#1:744,2\n*E\n"})
public final class a {

    @NotNull
    public static final String NEW_DATABASE_NAME = "notification-new.db";

    @NotNull
    public static final String PACKAGE_MMS = "com.android.mms";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Map<String, Integer> onSwitch;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final Map<String, Integer> offSwitch;

    @NotNull
    public static final a INSTANCE = new a();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final ConcurrentHashMap<String, Boolean> mPackageSwitchCache = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: com.heytap.health.watch.notification.impl.whitelist.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, d2 = {"com/heytap/health/watch/notification/impl/whitelist/a$a", "Lcom/oplus/aiunit/vision/hm4$c;", "", "success", "", "code", "", "a", "device_notification_impl2_release"}, k = 1, mv = {1, 8, 0})
    public static final class C0013a implements hm4.c {
        public final /* synthetic */ Ref.BooleanRef a;
        public final /* synthetic */ CountDownLatch b;

        public C0013a(Ref.BooleanRef booleanRef, CountDownLatch countDownLatch) {
            this.a = booleanRef;
            this.b = countDownLatch;
        }

        public void a(boolean success, int code) {
            if (success) {
                this.a.element = true;
            }
            this.b.countDown();
        }
    }

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        onSwitch = linkedHashMap;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        offSwitch = linkedHashMap2;
        linkedHashMap.put("wrist_off_push", Integer.MIN_VALUE);
        linkedHashMap.put("light_up", 1073741824);
        linkedHashMap.put("breeno", 268435456);
        linkedHashMap.put("flashback", 536870912);
        linkedHashMap.put("screen_on_push", 33554432);
        linkedHashMap.put(y51.PKG_WECHAT, 67108864);
        linkedHashMap.put("main_switch", 134217728);
        linkedHashMap2.put("wrist_off_push", Integer.MAX_VALUE);
        linkedHashMap2.put("light_up", -1073741825);
        linkedHashMap2.put("breeno", -268435457);
        linkedHashMap2.put("flashback", -536870913);
        linkedHashMap2.put("screen_on_push", -33554433);
        linkedHashMap2.put(y51.PKG_WECHAT, -67108865);
        linkedHashMap2.put("main_switch", -134217729);
    }

    public final int a(@NotNull List<String> packageNames, boolean status) {
        Intrinsics.checkNotNullParameter(packageNames, "packageNames");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = packageNames.iterator();
        while (it.hasNext()) {
            arrayList.add(new NotificationRoomBeanStatus((String) it.next(), status));
        }
        int iD = NotificationRoom.INSTANCE.a().f().d(arrayList);
        m8b.f("NTF_RoomHolder", "[batchUpdate]--> packageNames size: " + packageNames.size() + ", update: " + iD);
        if (iD > 0) {
            Iterator<T> it2 = packageNames.iterator();
            while (it2.hasNext()) {
                mPackageSwitchCache.put((String) it2.next(), Boolean.valueOf(status));
            }
        }
        return iD;
    }

    public final int b(@NotNull List<String> packageNames, boolean status) {
        boolean zR;
        Intrinsics.checkNotNullParameter(packageNames, "packageNames");
        boolean zIsCurrentConnected = wl4.managerApi.isCurrentConnected();
        boolean z = true;
        if (!zIsCurrentConnected) {
            zR = true;
        } else if (packageNames.contains(y51.PKG_WECHAT)) {
            zR = r(y51.PKG_WECHAT, status);
        } else {
            zR = true;
            z = false;
        }
        if (zIsCurrentConnected && z && !zR) {
            return 0;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = packageNames.iterator();
        while (it.hasNext()) {
            arrayList.add(new NotificationRoomBeanStatus((String) it.next(), status));
        }
        int iD = NotificationRoom.INSTANCE.a().f().d(arrayList);
        m8b.f("NTF_RoomHolder", "[batchUpdateWithSync]--> packageNames size: " + packageNames.size() + ", update: " + iD);
        if (iD > 0) {
            Iterator<T> it2 = packageNames.iterator();
            while (it2.hasNext()) {
                mPackageSwitchCache.put((String) it2.next(), Boolean.valueOf(status));
            }
            if (!zIsCurrentConnected) {
                a5k.i(e88.a().getString(R$string.settings_enable_after_connected));
            }
        }
        return iD;
    }

    public final void c() {
        List<String> listMutableListOf = CollectionsKt.mutableListOf(new String[]{"main_switch", "screen_on_push", "wrist_off_push", "light_up"});
        NotificationRoom.Companion companion = NotificationRoom.INSTANCE;
        List<NotificationRoomBean> listB = companion.a().f().b(listMutableListOf);
        boolean z = false;
        if (listB != null && listB.size() == listMutableListOf.size()) {
            z = true;
        }
        if (!z) {
            ArrayList arrayList = new ArrayList();
            n(arrayList);
            m8b.f("NTF_RoomHolder", "checkDefaultSwitches: insert default:" + m(arrayList).size());
        }
        if (companion.a().f().query("cloud_msg") == null) {
            m8b.f("NTF_RoomHolder", "checkDefaultSwitches: insert cloud:" + companion.a().f().f(new NotificationRoomBean("cloud_msg", "", j.VIEW_TYPE_SWITCH_CLOUD, "", false)));
        }
    }

    public final int d(@NotNull String packageName) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        int iC = NotificationRoom.INSTANCE.a().f().c(new NotificationRoomBean(packageName, "", 0, null, false));
        if (iC > 0) {
            mPackageSwitchCache.remove(packageName);
        }
        return iC;
    }

    public final void e() {
        NotificationHolder notificationHolder = NotificationHolder.INSTANCE;
        List<String> listL = notificationHolder.l();
        List<NotificationRoomBean> listB = listL != null ? NotificationRoom.INSTANCE.a().f().b(listL) : null;
        List<String> listB2 = notificationHolder.b();
        List<NotificationRoomBean> listB3 = listB2 != null ? NotificationRoom.INSTANCE.a().f().b(listB2) : null;
        List<NotificationRoomBean> list = listB;
        if (!(list == null || list.isEmpty())) {
            List<NotificationRoomBean> list2 = listB3;
            if (!(list2 == null || list2.isEmpty())) {
                m8b.f("NTF_RoomHolder", "fixMmsAndDial:  is exist");
                return;
            }
        }
        PackageManager packageManager = e88.a().getApplicationContext().getPackageManager();
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.LAUNCHER");
        List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        Intrinsics.checkNotNullExpressionValue(listQueryIntentActivities, "packageManager.queryIntentActivities(intent, 0)");
        mzc.b(listQueryIntentActivities);
        Iterator<T> it = listQueryIntentActivities.iterator();
        while (it.hasNext()) {
            String str = ((ResolveInfo) it.next()).activityInfo.packageName;
            if (list == null || list.isEmpty()) {
                NotificationHolder notificationHolder2 = NotificationHolder.INSTANCE;
                Intrinsics.checkNotNullExpressionValue(str, "pk");
                if (notificationHolder2.i(str)) {
                    a aVar = INSTANCE;
                    String strI = aVar.i(str);
                    m8b.f("NTF_RoomHolder", "fixMms: insert=" + aVar.l(new NotificationRoomBean(str, strI, 0, xyc.INSTANCE.b(strI), notificationHolder2.k(str))) + ", " + str);
                }
            }
            List<NotificationRoomBean> list3 = listB3;
            if (list3 == null || list3.isEmpty()) {
                NotificationHolder notificationHolder3 = NotificationHolder.INSTANCE;
                Intrinsics.checkNotNullExpressionValue(str, "pk");
                if (notificationHolder3.f(str)) {
                    a aVar2 = INSTANCE;
                    String strI2 = aVar2.i(str);
                    m8b.f("NTF_RoomHolder", "fixDial: insert=" + aVar2.l(new NotificationRoomBean(str, strI2, 0, xyc.INSTANCE.b(strI2), notificationHolder3.k(str))) + ", " + str);
                }
            }
        }
        m8b.m("NTF_RoomHolder", "fixMmsAndDial: no launch exist");
    }

    public final void f() {
        NotificationRoom.INSTANCE.a().f().f(new NotificationRoomBean("packageName", "", 0, "", true));
    }

    public final void g() {
        czc czcVarF;
        NotificationRoomBean notificationRoomBeanQuery;
        if (gpj.l() < 26 || (notificationRoomBeanQuery = (czcVarF = NotificationRoom.INSTANCE.a().f()).query("com.coloros.weather.service")) == null) {
            return;
        }
        m8b.f("NTF_RoomHolder", "fixWeather: " + czcVarF.f(new NotificationRoomBean("com.coloros.weather2", notificationRoomBeanQuery.getAppName(), notificationRoomBeanQuery.getViewType(), notificationRoomBeanQuery.getAppNamePy(), notificationRoomBeanQuery.getIsOpen())) + " " + czcVarF.c(notificationRoomBeanQuery));
    }

    public final int h() {
        int i = k("light_up") ? 1073741824 : 0;
        if (k("wrist_off_push")) {
            i |= Integer.MIN_VALUE;
        }
        if (k("breeno")) {
            i |= 268435456;
        }
        if (k("flashback")) {
            i |= 536870912;
        }
        if (k("screen_on_push")) {
            i |= 33554432;
        }
        if (k(y51.PKG_WECHAT)) {
            i |= 67108864;
        }
        if (k("main_switch")) {
            lyc.Companion companion = lyc.INSTANCE;
            Context contextA = e88.a();
            Intrinsics.checkNotNullExpressionValue(contextA, "getAppContext()");
            if (companion.f(contextA)) {
                i |= 134217728;
            }
        }
        return i | 1;
    }

    @Nullable
    public final String i(@NotNull String packageName) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        try {
            PackageManager packageManager = e88.a().getApplicationContext().getPackageManager();
            PackageInfo packageInfo = packageManager.getPackageInfo(packageName, 1);
            if (packageInfo == null) {
                return null;
            }
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            String strValueOf = String.valueOf(applicationInfo != null ? applicationInfo.loadLabel(packageManager) : null);
            xg5.Companion.m(strValueOf);
            return strValueOf;
        } catch (Exception e) {
            m8b.b("NTF_RoomHolder", "getAppName: " + e.getMessage());
            return null;
        }
    }

    public final List<NotificationRoomBean> j() {
        String str = Build.BRAND;
        String str2 = Build.MODEL;
        String str3 = Build.MANUFACTURER;
        StringBuilder sb = new StringBuilder();
        sb.append("getLaunchAppList, brand: ");
        sb.append(str);
        sb.append(", model: ");
        sb.append(str2);
        sb.append(", manufacturer: ");
        sb.append(str3);
        ArrayList arrayList = new ArrayList();
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.LAUNCHER");
        PackageManager packageManager = e88.a().getApplicationContext().getPackageManager();
        List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        Intrinsics.checkNotNullExpressionValue(listQueryIntentActivities, "packageManager.queryIntentActivities(intent, 0)");
        mzc.b(listQueryIntentActivities);
        Iterator<ResolveInfo> it = listQueryIntentActivities.iterator();
        while (it.hasNext()) {
            String str4 = it.next().activityInfo.packageName;
            if (str4 != null) {
                NotificationHolder notificationHolder = NotificationHolder.INSTANCE;
                if (!notificationHolder.h(str4)) {
                    String strI = i(str4);
                    arrayList.add(new NotificationRoomBean(str4, strI, 0, xyc.INSTANCE.b(strI), notificationHolder.k(str4)));
                }
            }
        }
        int size = arrayList.size();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[getLaunchAppList] --> ");
        sb2.append(size);
        n(arrayList);
        arrayList.add(new NotificationRoomBean("packageName", "", 0, "", true));
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(gpj.l() >= 26 ? "com.coloros.weather2" : "com.coloros.weather.service", 1);
            String str5 = packageInfo.packageName;
            Intrinsics.checkNotNullExpressionValue(str5, "packageInfo.packageName");
            String strI2 = i(str5);
            String str6 = packageInfo.packageName;
            Intrinsics.checkNotNullExpressionValue(str6, "packageInfo.packageName");
            arrayList.add(new NotificationRoomBean(str6, strI2, 0, xyc.INSTANCE.b(strI2), true));
        } catch (Exception e) {
            m8b.b("NTF_RoomHolder", "[getLaunchAppList] --> " + e.getMessage());
        }
        return arrayList;
    }

    public final boolean k(@NotNull String packageName) {
        List<String> listB;
        List<String> listL;
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        NotificationHolder notificationHolder = NotificationHolder.INSTANCE;
        if (notificationHolder.c(packageName)) {
            m8b.f("NTF_RoomHolder", "getPackageSwitchStatus: forceAbandon app");
            return false;
        }
        ConcurrentHashMap<String, Boolean> concurrentHashMap = mPackageSwitchCache;
        if (concurrentHashMap.containsKey(packageName)) {
            return Intrinsics.areEqual(concurrentHashMap.get(packageName), Boolean.TRUE);
        }
        if (notificationHolder.i(packageName) && (listL = notificationHolder.l()) != null) {
            for (String str : listL) {
                ConcurrentHashMap<String, Boolean> concurrentHashMap2 = mPackageSwitchCache;
                if (concurrentHashMap2.containsKey(str)) {
                    return Intrinsics.areEqual(concurrentHashMap2.get(str), Boolean.TRUE);
                }
            }
        }
        NotificationHolder notificationHolder2 = NotificationHolder.INSTANCE;
        if (notificationHolder2.f(packageName) && (listB = notificationHolder2.b()) != null) {
            for (String str2 : listB) {
                ConcurrentHashMap<String, Boolean> concurrentHashMap3 = mPackageSwitchCache;
                if (concurrentHashMap3.containsKey(str2)) {
                    return Intrinsics.areEqual(concurrentHashMap3.get(str2), Boolean.TRUE);
                }
            }
        }
        NotificationRoomBean notificationRoomBeanP = p(packageName);
        return notificationRoomBeanP != null ? notificationRoomBeanP.getIsOpen() : NotificationHolder.INSTANCE.k(packageName);
    }

    public final long l(NotificationRoomBean item) {
        long jF = NotificationRoom.INSTANCE.a().f().f(item);
        if (jF > 0) {
            mPackageSwitchCache.put(item.getPackageName(), Boolean.valueOf(item.getIsOpen()));
        }
        return jF;
    }

    public final List<Long> m(List<NotificationRoomBean> items) {
        List<Long> listA = NotificationRoom.INSTANCE.a().f().a(items);
        for (NotificationRoomBean notificationRoomBean : items) {
            mPackageSwitchCache.put(notificationRoomBean.getPackageName(), Boolean.valueOf(notificationRoomBean.getIsOpen()));
        }
        return listA;
    }

    public final void n(List<NotificationRoomBean> packages) {
        packages.add(new NotificationRoomBean("main_switch", "", 1000, "", true));
        packages.add(new NotificationRoomBean("wrist_off_push", "", j.VIEW_TYPE_SWITCH_WRIST_OFF, "", false));
        packages.add(new NotificationRoomBean("cloud_msg", "", j.VIEW_TYPE_SWITCH_CLOUD, "", false));
        packages.add(new NotificationRoomBean("screen_on_push", "", j.VIEW_TYPE_SWITCH_SCREEN_ON_PUSH, "", false));
        packages.add(new NotificationRoomBean("light_up", "", j.VIEW_TYPE_SWITCH_LIGHT_UP, "", false));
        packages.add(new NotificationRoomBean("breeno", "", j.VIEW_TYPE_SWITCH_BREENO, "", true));
        packages.add(new NotificationRoomBean("flashback", "", j.VIEW_TYPE_SWITCH_FLASHBACK, "", true));
    }

    /* JADX WARN: Code duplicated, block: B:106:0x01be A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x0127  */
    /* JADX WARN: Code duplicated, block: B:55:0x0129  */
    /* JADX WARN: Code duplicated, block: B:87:0x01b1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:88:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:94:0x01c4 A[Catch: Exception -> 0x01d3, TryCatch #6 {Exception -> 0x01d3, blocks: (B:92:0x01be, B:94:0x01c4, B:96:0x01c9, B:98:0x01cf), top: B:106:0x01be }] */
    /* JADX WARN: Code duplicated, block: B:95:0x01c7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:96:0x01c9 A[Catch: Exception -> 0x01d3, TryCatch #6 {Exception -> 0x01d3, blocks: (B:92:0x01be, B:94:0x01c4, B:96:0x01c9, B:98:0x01cf), top: B:106:0x01be }] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @SuppressLint({"Range"})
    public final int o() throws Throwable {
        Cursor cursor;
        String string;
        int i;
        int i2;
        String str;
        boolean z;
        Context contextA = e88.a();
        File databasePath = contextA.getDatabasePath("notification-whitelist.db");
        if (databasePath == null) {
            return q().size();
        }
        if (!databasePath.exists()) {
            m8b.f("NTF_RoomHolder", "oldDataConvert: not exist old db");
            return q().size();
        }
        SQLiteDatabase sQLiteDatabaseOpenDatabase = SQLiteDatabase.openDatabase(databasePath.getAbsolutePath(), null, 1);
        int size = 0;
        try {
            try {
                ArrayList arrayList = new ArrayList();
                Cursor cursorQuery = sQLiteDatabaseOpenDatabase.query("notification_list", null, null, null, null, null, null);
                if (cursorQuery != null) {
                    while (cursorQuery.moveToNext()) {
                        try {
                            String string2 = cursorQuery.getString(cursorQuery.getColumnIndex("packageName"));
                            Intrinsics.checkNotNullExpressionValue(string2, "it.getString(it.getColum…ATION_ITEM_PACKAGE_NAME))");
                            String string3 = cursorQuery.getString(cursorQuery.getColumnIndex(Constants.EVENT_APPNAME_FIELD));
                            int i3 = cursorQuery.getInt(cursorQuery.getColumnIndex("open"));
                            String string4 = cursorQuery.getString(cursorQuery.getColumnIndex("appNameTag"));
                            switch (string2.hashCode()) {
                                case -1515670041:
                                    if (string2.equals("com.coloros.weather.service")) {
                                        string3 = INSTANCE.i(string2);
                                    }
                                    str = string3;
                                    i2 = 0;
                                    if (i3 == 1) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    arrayList.add(new NotificationRoomBean(string2, str, i2, string4, z));
                                    break;
                                case -1380919631:
                                    if (!string2.equals("breeno")) {
                                        str = string3;
                                        i2 = 0;
                                        if (i3 == 1) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        arrayList.add(new NotificationRoomBean(string2, str, i2, string4, z));
                                    } else {
                                        string = contextA.getString(R$string.settings_watch_breeno_advice);
                                        i = j.VIEW_TYPE_SWITCH_BREENO;
                                    }
                                    break;
                                case -1146848041:
                                    if (!string2.equals("flashback")) {
                                        str = string3;
                                        i2 = 0;
                                        if (i3 == 1) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        arrayList.add(new NotificationRoomBean(string2, str, i2, string4, z));
                                    } else {
                                        string = contextA.getString(R$string.settings_flashback_assistant);
                                        i = j.VIEW_TYPE_SWITCH_FLASHBACK;
                                    }
                                    break;
                                case -946668966:
                                    if (!string2.equals("wrist_off_push")) {
                                        str = string3;
                                        i2 = 0;
                                        if (i3 == 1) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        arrayList.add(new NotificationRoomBean(string2, str, i2, string4, z));
                                    } else {
                                        string = contextA.getString(R$string.settings_sync_notification_no_push_wrist_off_title);
                                        i = j.VIEW_TYPE_SWITCH_WRIST_OFF;
                                    }
                                    break;
                                case -730694534:
                                    if (!string2.equals("main_switch")) {
                                        str = string3;
                                        i2 = 0;
                                        if (i3 == 1) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        arrayList.add(new NotificationRoomBean(string2, str, i2, string4, z));
                                    } else {
                                        string = contextA.getString(com.heytap.health.watch.notification.R$string.settings_sync_notification);
                                        i = 1000;
                                    }
                                    break;
                                case -425815433:
                                    if (!string2.equals("cloud_msg")) {
                                        str = string3;
                                        i2 = 0;
                                        if (i3 == 1) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        arrayList.add(new NotificationRoomBean(string2, str, i2, string4, z));
                                    } else {
                                        string = contextA.getString(com.heytap.health.watch.notification.R$string.settings_cloud_notification);
                                        i = j.VIEW_TYPE_SWITCH_CLOUD;
                                    }
                                    break;
                                case 848062631:
                                    if (!string2.equals("screen_on_push")) {
                                        str = string3;
                                        i2 = 0;
                                        if (i3 == 1) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        arrayList.add(new NotificationRoomBean(string2, str, i2, string4, z));
                                    } else {
                                        string = contextA.getString(R$string.settings_sync_notification_no_push_screen_on_title);
                                        i = j.VIEW_TYPE_SWITCH_SCREEN_ON_PUSH;
                                    }
                                    break;
                                case 991960676:
                                    if (!string2.equals("light_up")) {
                                        str = string3;
                                        i2 = 0;
                                        if (i3 == 1) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        arrayList.add(new NotificationRoomBean(string2, str, i2, string4, z));
                                    } else {
                                        string = contextA.getString(R$string.settings_light_up);
                                        i = j.VIEW_TYPE_SWITCH_LIGHT_UP;
                                    }
                                    break;
                                default:
                                    str = string3;
                                    i2 = 0;
                                    if (i3 == 1) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    arrayList.add(new NotificationRoomBean(string2, str, i2, string4, z));
                                    break;
                            }
                            i2 = i;
                            str = string;
                            if (i3 == 1) {
                                z = true;
                            } else {
                                z = false;
                            }
                            arrayList.add(new NotificationRoomBean(string2, str, i2, string4, z));
                        } catch (Exception e) {
                            e = e;
                            cursor = cursorQuery;
                            try {
                                m8b.b("NTF_RoomHolder", "initInTransport: " + e.getMessage());
                                if (cursor != null && !cursor.isClosed()) {
                                    cursor.close();
                                }
                                if (sQLiteDatabaseOpenDatabase != null && sQLiteDatabaseOpenDatabase.isOpen()) {
                                }
                                databasePath.delete();
                                if (size > 0) {
                                    return size;
                                }
                                return q().size();
                            } catch (Throwable th) {
                                th = th;
                                if (cursor != null) {
                                    try {
                                        if (!cursor.isClosed()) {
                                            cursor.close();
                                        }
                                        if (sQLiteDatabaseOpenDatabase != null && sQLiteDatabaseOpenDatabase.isOpen()) {
                                            sQLiteDatabaseOpenDatabase.close();
                                        }
                                    } catch (Exception unused) {
                                        m8b.f("NTF_RoomHolder", "initInTransport: double close, ignore");
                                        throw th;
                                    }
                                } else if (sQLiteDatabaseOpenDatabase != null) {
                                    sQLiteDatabaseOpenDatabase.close();
                                }
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            cursor = cursorQuery;
                            if (cursor != null) {
                                if (!cursor.isClosed()) {
                                    cursor.close();
                                }
                                if (sQLiteDatabaseOpenDatabase != null) {
                                    sQLiteDatabaseOpenDatabase.close();
                                }
                            } else if (sQLiteDatabaseOpenDatabase != null) {
                                sQLiteDatabaseOpenDatabase.close();
                            }
                            throw th;
                        }
                    }
                    cursorQuery.close();
                    sQLiteDatabaseOpenDatabase.close();
                    m8b.f("NTF_RoomHolder", "oldDataConvert: insert old data size=" + arrayList.size());
                    size = INSTANCE.m(arrayList).size();
                }
                if (cursorQuery != null && !cursorQuery.isClosed()) {
                    cursorQuery.close();
                }
                if (sQLiteDatabaseOpenDatabase.isOpen()) {
                    sQLiteDatabaseOpenDatabase.close();
                }
            } catch (Exception unused2) {
                m8b.f("NTF_RoomHolder", "initInTransport: double close, ignore");
            }
        } catch (Exception e2) {
            e = e2;
            cursor = null;
        } catch (Throwable th3) {
            th = th3;
            cursor = null;
        }
        databasePath.delete();
        if (size > 0) {
            return size;
        }
        return q().size();
    }

    @Nullable
    public final NotificationRoomBean p(@NotNull String packageName) {
        List<String> listL;
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        NotificationRoomBean notificationRoomBeanQuery = NotificationRoom.INSTANCE.a().f().query(packageName);
        if (notificationRoomBeanQuery == null) {
            NotificationHolder notificationHolder = NotificationHolder.INSTANCE;
            if (!notificationHolder.h(packageName)) {
                if (notificationHolder.i(packageName) && (listL = notificationHolder.l()) != null) {
                    for (String str : listL) {
                        NotificationRoomBean notificationRoomBeanQuery2 = NotificationRoom.INSTANCE.a().f().query(str);
                        if (notificationRoomBeanQuery2 != null) {
                            m8b.m("NTF_RoomHolder", "query: this package=" + packageName + " adapter mms to " + str);
                            mPackageSwitchCache.put(notificationRoomBeanQuery2.getPackageName(), Boolean.valueOf(notificationRoomBeanQuery2.getIsOpen()));
                            return notificationRoomBeanQuery2;
                        }
                    }
                }
                String strI = i(packageName);
                if (strI != null) {
                    boolean zK = NotificationHolder.INSTANCE.k(packageName);
                    NotificationRoomBean notificationRoomBean = new NotificationRoomBean(packageName, strI, 0, xyc.INSTANCE.b(strI), zK);
                    if (INSTANCE.l(notificationRoomBean) > 0) {
                        m8b.f("NTF_RoomHolder", "query: this package=" + packageName + " not exit, now insert success");
                        mPackageSwitchCache.put(packageName, Boolean.valueOf(zK));
                        notificationRoomBeanQuery = notificationRoomBean;
                    }
                }
            }
        }
        if (notificationRoomBeanQuery != null) {
            mPackageSwitchCache.put(packageName, Boolean.valueOf(notificationRoomBeanQuery.getIsOpen()));
        }
        return notificationRoomBeanQuery;
    }

    @NotNull
    public final List<NotificationRoomBean> q() {
        List<NotificationRoomBean> listJ = NotificationRoom.INSTANCE.a().f().j();
        for (NotificationRoomBean notificationRoomBean : listJ) {
            mPackageSwitchCache.put(notificationRoomBean.getPackageName(), Boolean.valueOf(notificationRoomBean.getIsOpen()));
        }
        return listJ;
    }

    public final boolean r(String feature, boolean newStatus) {
        int iIntValue;
        int iH = h();
        if (newStatus) {
            Integer num = onSwitch.get(feature);
            Intrinsics.checkNotNull(num);
            iIntValue = iH | num.intValue();
        } else {
            Integer num2 = offSwitch.get(feature);
            Intrinsics.checkNotNull(num2);
            iIntValue = iH & num2.intValue();
        }
        m8b.f("NTF_RoomHolder", "[sendFeatureSwitchStatus] --> " + feature + ", " + Integer.toBinaryString(iIntValue));
        byte[] byteArray = ((NotificationSwitches$NotificationSwitchData) NotificationSwitches$NotificationSwitchData.newBuilder().setSwitchData(iIntValue).build()).toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "newBuilder().setSwitchDa…ch).build().toByteArray()");
        MessageEvent messageEvent = new MessageEvent(2, 84, byteArray);
        CountDownLatch countDownLatch = new CountDownLatch(1);
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        wl4.deviceMultiple.b.j(wl4.managerApi.n(), messageEvent, new C0013a(booleanRef, countDownLatch));
        try {
            countDownLatch.await(r54.MESSAGE_DELAY_CHANGE_SEND, TimeUnit.MILLISECONDS);
        } catch (Exception e) {
            countDownLatch.countDown();
            m8b.b("NTF_RoomHolder", "[sendFeatureSwitchStatus] --> " + e.getMessage());
        }
        return booleanRef.element;
    }

    public final void s() {
        int iH = h();
        m8b.f("NTF_RoomHolder", "[syncSwitchToDevice] --> " + Integer.toBinaryString(iH));
        byte[] byteArray = ((NotificationSwitches$NotificationSwitchData) NotificationSwitches$NotificationSwitchData.newBuilder().setSwitchData(iH).build()).toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "newBuilder().setSwitchDa…ch).build().toByteArray()");
        wl4.deviceMultiple.b.k(wl4.managerApi.n(), new MessageEvent(2, 84, byteArray));
    }

    public final int t(@NotNull String packageName, boolean status) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        int iE = NotificationRoom.INSTANCE.a().f().e(new NotificationRoomBeanStatus(packageName, status));
        if (iE > 0) {
            mPackageSwitchCache.put(packageName, Boolean.valueOf(status));
        }
        return iE;
    }

    public final void u() throws Throwable {
        int iO = o();
        if (iO <= 0) {
            m8b.f("NTF_RoomHolder", "updateDbData: no data, insert " + m(j()).size());
            return;
        }
        m8b.f("NTF_RoomHolder", "updateDbData: already size = " + iO);
        f();
        g();
        e();
        c();
    }

    public final void v() {
        cb4.INSTANCE.d();
        List<NotificationRoomBean> listQ = q();
        for (NotificationRoomBean notificationRoomBean : listQ) {
            String strI = i(notificationRoomBean.getPackageName());
            notificationRoomBean.setAppName(strI);
            notificationRoomBean.setAppNamePy(xyc.INSTANCE.b(strI));
        }
        m8b.f("NTF_RoomHolder", "updateLanguage: update " + m(listQ).size());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:35:0x007d  */
    public final int w(@NotNull String packageName, boolean status) {
        boolean zR;
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        boolean zIsCurrentConnected = wl4.managerApi.isCurrentConnected();
        boolean z = true;
        if (zIsCurrentConnected) {
            switch (packageName) {
                case "breeno":
                    zR = r("breeno", status);
                    break;
                case "flashback":
                    zR = r("flashback", status);
                    break;
                case "com.tencent.mm":
                    zR = r(y51.PKG_WECHAT, status);
                    break;
                case "wrist_off_push":
                    zR = r("wrist_off_push", status);
                    break;
                case "main_switch":
                    zR = r("main_switch", status);
                    break;
                case "screen_on_push":
                    zR = r("screen_on_push", status);
                    break;
                case "light_up":
                    zR = r("light_up", status);
                    break;
                default:
                    zR = true;
                    z = false;
                    break;
            }
        } else {
            zR = true;
        }
        if (zIsCurrentConnected && z && !zR) {
            return 0;
        }
        int iE = NotificationRoom.INSTANCE.a().f().e(new NotificationRoomBeanStatus(packageName, status));
        if (iE > 0) {
            mPackageSwitchCache.put(packageName, Boolean.valueOf(status));
            if (!zIsCurrentConnected) {
                a5k.i(e88.a().getString(R$string.settings_enable_after_connected));
            }
        }
        return iE;
    }
}
