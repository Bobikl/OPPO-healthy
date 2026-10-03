package com.heytap.health.watch.notification.impl.apiprovider;

import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.RemoteException;
import android.service.notification.StatusBarNotification;
import com.heytap.health.base.text.GsonUtil;
import com.heytap.health.watch.notification.HealthNotificationBean;
import com.heytap.health.watch.notification.INotificationAidl;
import com.heytap.health.watch.notification.INotificationBooleanCallback;
import com.heytap.health.watch.notification.INotificationBundleCallback;
import com.heytap.health.watch.notification.INotificationDataCallback;
import com.heytap.health.watch.notification.INotificationECDHCallback;
import com.heytap.health.watch.notification.INotificationIntCallback;
import com.heytap.health.watch.notification.NotificationRoomBean;
import com.heytap.health.watch.notification.b;
import com.heytap.health.watch.notification.impl.apiprovider.NotificationTransportApisImpl$iBinder$1;
import com.heytap.health.watch.notification.impl.cloud.CloudPushManager;
import com.heytap.health.watch.notification.impl.fluid.FluidAppInfo;
import com.heytap.health.watch.notification.impl.fluid.FluidConfigCenter;
import com.heytap.health.watch.notification.impl.module.NotificationHolder;
import com.heytap.health.watch.notification.impl.module.NotificationModule;
import com.heytap.health.watch.notification.impl.push.WatchPushManager;
import com.heytap.health.watch.notification.impl.whitelist.a;
import com.heytap.log.nx.obus.Constants;
import com.oplus.aiunit.p007vision.b96;
import com.oplus.aiunit.p007vision.mzc;
import com.oplus.aiunit.p007vision.pt8;
import com.oplus.aiunit.p007vision.s4j;
import com.oplus.aiunit.p007vision.yxc;
import com.oplus.aiunit.vision.e88;
import com.oplus.aiunit.vision.if0;
import com.oplus.aiunit.vision.m8b;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes19.dex */
@Metadata(d1 = {"\u0000]\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J0\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0012\u0010\f\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\rH\u0002J\"\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\n\u001a\u0004\u0018\u00010\u0012H\u0016J\u001c\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\n\u001a\u0004\u0018\u00010\rH\u0016J\u001c\u0010\u0016\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\u0010\u0010\u0017\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0018H\u0016J\u0018\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0018H\u0016J(\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u001fH\u0016J\u0018\u0010 \u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\bH\u0016J\u0010\u0010#\u001a\u00020\u00032\u0006\u0010$\u001a\u00020%H\u0016J(\u0010&\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006'"}, d2 = {"com/heytap/health/watch/notification/impl/apiprovider/NotificationTransportApisImpl$iBinder$1", "Lcom/heytap/health/watch/notification/INotificationAidl$Stub;", "batchSetSwitchStatus", "", "packageNames", "", "", Constants.EVENT_STATUS_FIELD, "", "needSync", "callback", "Lcom/heytap/health/watch/notification/INotificationBooleanCallback;", "buildFluidSupportAppsBundle", "Lcom/heytap/health/watch/notification/INotificationBundleCallback;", "changeCloudSwitch", "target", "mode", "", "Lcom/heytap/health/watch/notification/INotificationIntCallback;", "commonGet", "bundle", "Landroid/os/Bundle;", "commonSet", "getAllSwitches", "Lcom/heytap/health/watch/notification/INotificationDataCallback;", "getSwitch", "packageName", "negotiate", "sid", "cid", "uuid", "Lcom/heytap/health/watch/notification/INotificationECDHCallback;", "pushFakeNotification", "pushData", "skipUnzip", "pushFakeNotification2", "sbn", "Landroid/service/notification/StatusBarNotification;", "setSwitchStatus", "device_notification_impl2_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nNotificationTransportApisImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotificationTransportApisImpl.kt\ncom/heytap/health/watch/notification/impl/apiprovider/NotificationTransportApisImpl$iBinder$1\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,283:1\n215#2,2:284\n1855#3,2:286\n*S KotlinDebug\n*F\n+ 1 NotificationTransportApisImpl.kt\ncom/heytap/health/watch/notification/impl/apiprovider/NotificationTransportApisImpl$iBinder$1\n*L\n262#1:284,2\n99#1:286,2\n*E\n"})
public final class NotificationTransportApisImpl$iBinder$1 extends INotificationAidl.Stub {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void batchSetSwitchStatus$lambda$2(List list, INotificationBooleanCallback iNotificationBooleanCallback, boolean z, boolean z2) throws RemoteException {
        Intrinsics.checkNotNullParameter(iNotificationBooleanCallback, "$callback");
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            iNotificationBooleanCallback.onResult(true);
            return;
        }
        int iB = z ? a.INSTANCE.b(list, z2) : a.INSTANCE.a(list, z2);
        if (iB > 0 && !z2) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                yxc.INSTANCE.J((String) it.next());
            }
        }
        iNotificationBooleanCallback.onResult(iB > 0);
    }

    private final void buildFluidSupportAppsBundle(INotificationBundleCallback callback) throws RemoteException {
        if (callback != null) {
            Bundle bundle = new Bundle();
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<String, FluidAppInfo> entry : FluidConfigCenter.INSTANCE.u().entrySet()) {
                String key = entry.getKey();
                FluidAppInfo value = entry.getValue();
                String appName = value.getAppName();
                int summaryId = value.getSummaryId();
                String summary = value.getSummary();
                String summaryEn = value.getSummaryEn();
                String summaryTr = value.getSummaryTr();
                int iconId = value.getIconId();
                String iconUrl = value.getIconUrl();
                arrayList.add(new FluidAppInfo(key, appName, summaryId, summary, summaryEn, summaryTr, value.getBrandCode(), value.getSystemService(), iconId, iconUrl, null, 0L, 3072, null));
            }
            bundle.putString(b.KEY_FLUID_APP_LIST_JSON, GsonUtil.e(arrayList));
            callback.onResult(bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void changeCloudSwitch$lambda$10(int i, boolean z, INotificationIntCallback iNotificationIntCallback) throws RemoteException {
        m8b.f("NTF_TransportApisImpl", "changeCloudSwitch: mode=" + i + ", target=" + z);
        if (i != 0) {
            if (i != 1) {
                return;
            }
            CloudPushManager.INSTANCE.j(z, iNotificationIntCallback);
        } else if (z) {
            CloudPushManager.INSTANCE.i();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void commonGet$lambda$18(NotificationTransportApisImpl$iBinder$1 notificationTransportApisImpl$iBinder$1, INotificationBundleCallback iNotificationBundleCallback) throws RemoteException {
        Intrinsics.checkNotNullParameter(notificationTransportApisImpl$iBinder$1, "this$0");
        notificationTransportApisImpl$iBinder$1.buildFluidSupportAppsBundle(iNotificationBundleCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void commonSet$lambda$16$lambda$13$lambda$11(LocalTime localTime, LocalTime localTime2) {
        yxc.INSTANCE.L(localTime, localTime2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void commonSet$lambda$16$lambda$13$lambda$12() {
        yxc.INSTANCE.L(null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getAllSwitches$lambda$5(INotificationDataCallback iNotificationDataCallback) throws RemoteException {
        Intrinsics.checkNotNullParameter(iNotificationDataCallback, "$callback");
        List<NotificationRoomBean> listQ = a.INSTANCE.q();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.LAUNCHER");
        List<ResolveInfo> listQueryIntentActivities = e88.a().getApplicationContext().getPackageManager().queryIntentActivities(intent, 0);
        Intrinsics.checkNotNullExpressionValue(listQueryIntentActivities, "packageManager.queryIntentActivities(intent, 0)");
        mzc.b(listQueryIntentActivities);
        Iterator<ResolveInfo> it = listQueryIntentActivities.iterator();
        while (it.hasNext()) {
            String str = it.next().activityInfo.packageName;
            NotificationHolder notificationHolder = NotificationHolder.INSTANCE;
            Intrinsics.checkNotNullExpressionValue(str, "packageName");
            if (!notificationHolder.h(str)) {
                linkedHashSet.add(str);
            }
        }
        m8b.f("NTF_TransportApisImpl", "onResult: local packages=" + linkedHashSet.size() + " , db packages=" + listQ.size());
        int size = listQ.size();
        while (true) {
            size--;
            if (-1 >= size) {
                iNotificationDataCallback.onResult(listQ);
                return;
            }
            NotificationRoomBean notificationRoomBean = listQ.get(size);
            if (!Intrinsics.areEqual(notificationRoomBean.getPackageName(), "com.coloros.weather.service") && !Intrinsics.areEqual(notificationRoomBean.getPackageName(), "com.coloros.weather2") && !Intrinsics.areEqual(notificationRoomBean.getPackageName(), "com.heytap.health.push") && ((!Intrinsics.areEqual(notificationRoomBean.getPackageName(), "com.oplus.beaconlink") || !if0.b("com.oplus.beaconlink")) && notificationRoomBean.getViewType() == 0 && !linkedHashSet.contains(notificationRoomBean.getPackageName()))) {
                m8b.f("NTF_TransportApisImpl", "onResult: delete " + notificationRoomBean.getPackageName());
                listQ.remove(notificationRoomBean);
                a.INSTANCE.d(notificationRoomBean.getPackageName());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getSwitch$lambda$4(String str, INotificationDataCallback iNotificationDataCallback) throws RemoteException {
        Intrinsics.checkNotNullParameter(str, "$packageName");
        Intrinsics.checkNotNullParameter(iNotificationDataCallback, "$callback");
        NotificationRoomBean notificationRoomBeanP = a.INSTANCE.p(str);
        if (notificationRoomBeanP == null) {
            iNotificationDataCallback.onResult(null);
            Unit unit = Unit.INSTANCE;
        }
        if (notificationRoomBeanP != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(notificationRoomBeanP);
            iNotificationDataCallback.onResult(arrayList);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void negotiate$lambda$9(int i, int i2, String str, INotificationECDHCallback iNotificationECDHCallback) throws RemoteException {
        Intrinsics.checkNotNullParameter(str, "$uuid");
        Intrinsics.checkNotNullParameter(iNotificationECDHCallback, "$callback");
        b96.m(i, i2, str, iNotificationECDHCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void pushFakeNotification$lambda$6(String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "$pushData");
        WatchPushManager.INSTANCE.f(str, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void pushFakeNotification2$lambda$8(StatusBarNotification statusBarNotification) {
        Intrinsics.checkNotNullParameter(statusBarNotification, "$sbn");
        HealthNotificationBean healthNotificationBeanC = HealthNotificationBean.Companion.c(HealthNotificationBean.INSTANCE, statusBarNotification, null, 2, null);
        String string = statusBarNotification.getNotification().extras.getString("push_mock_app_name");
        if (string != null) {
            healthNotificationBeanC.setAppName(string);
        }
        if (healthNotificationBeanC.getAppName().length() == 0) {
            healthNotificationBeanC.setAppName("健康");
        }
        pt8.INSTANCE.g(healthNotificationBeanC, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setSwitchStatus$lambda$0(boolean z, String str, boolean z2, INotificationBooleanCallback iNotificationBooleanCallback) throws RemoteException {
        Intrinsics.checkNotNullParameter(str, "$packageName");
        Intrinsics.checkNotNullParameter(iNotificationBooleanCallback, "$callback");
        int iW = z ? a.INSTANCE.w(str, z2) : a.INSTANCE.t(str, z2);
        if (iW > 0 && !z2) {
            yxc.INSTANCE.J(str);
        }
        iNotificationBooleanCallback.onResult(iW > 0);
    }

    @Override // com.heytap.health.watch.notification.INotificationAidl
    public void batchSetSwitchStatus(@Nullable final List<String> packageNames, final boolean status, final boolean needSync, @NotNull final INotificationBooleanCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        NotificationModule.INSTANCE.q(new Runnable() { // from class: com.oplus.aiunit.vision.tzc
            @Override // java.lang.Runnable
            public final void run() throws RemoteException {
                NotificationTransportApisImpl$iBinder$1.batchSetSwitchStatus$lambda$2(packageNames, callback, needSync, status);
            }
        });
    }

    @Override // com.heytap.health.watch.notification.INotificationAidl
    public void changeCloudSwitch(final boolean target, final int mode, @Nullable final INotificationIntCallback callback) {
        NotificationModule.INSTANCE.q(new Runnable() { // from class: com.oplus.aiunit.vision.a0d
            @Override // java.lang.Runnable
            public final void run() throws RemoteException {
                NotificationTransportApisImpl$iBinder$1.changeCloudSwitch$lambda$10(mode, target, callback);
            }
        });
    }

    @Override // com.heytap.health.watch.notification.INotificationAidl
    public void commonGet(@Nullable Bundle bundle, @Nullable final INotificationBundleCallback callback) throws RemoteException {
        if (bundle == null) {
            return;
        }
        String string = bundle.getString(b.METHOD_KEY);
        if (!Intrinsics.areEqual(string, b.METHOD_GET_DISCONNECT_SNAP)) {
            if (Intrinsics.areEqual(string, b.METHOD_GET_FLUID_SUPPORT_APPS)) {
                NotificationModule.INSTANCE.q(new Runnable() { // from class: com.oplus.aiunit.vision.uzc
                    @Override // java.lang.Runnable
                    public final void run() throws RemoteException {
                        NotificationTransportApisImpl$iBinder$1.commonGet$lambda$18(this.i, callback);
                    }
                });
            }
        } else if (callback != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong(b.METHOD_GET_DISCONNECT_SNAP, NotificationModule.INSTANCE.s());
            callback.onResult(bundle2);
        }
    }

    @Override // com.heytap.health.watch.notification.INotificationAidl
    public void commonSet(@Nullable Bundle bundle, @Nullable INotificationBooleanCallback callback) throws RemoteException {
        Object obj;
        if (bundle == null || !Intrinsics.areEqual(bundle.getString(b.EVENT_KEY), b.EVENT_KEY_DND)) {
            return;
        }
        boolean z = bundle.getBoolean(b.KEY_IS_OPEN_DND);
        String string = bundle.getString(b.KEY_DND_START_TIME);
        long j = bundle.getLong(b.KEY_DND_DURATION);
        m8b.f("NTF_TransportApisImpl", "commonSet: " + z + " " + string + " " + j);
        try {
            Result.Companion companion = Result.Companion;
            if (z) {
                final LocalTime localTime = LocalTime.parse(string, DateTimeFormatter.ofPattern(s4j.DATA_FMT2));
                final LocalTime localTimePlusSeconds = localTime.plusSeconds(j);
                NotificationModule.INSTANCE.q(new Runnable() { // from class: com.oplus.aiunit.vision.vzc
                    @Override // java.lang.Runnable
                    public final void run() {
                        NotificationTransportApisImpl$iBinder$1.commonSet$lambda$16$lambda$13$lambda$11(localTime, localTimePlusSeconds);
                    }
                });
            } else {
                NotificationModule.INSTANCE.q(new Runnable() { // from class: com.oplus.aiunit.vision.wzc
                    @Override // java.lang.Runnable
                    public final void run() {
                        NotificationTransportApisImpl$iBinder$1.commonSet$lambda$16$lambda$13$lambda$12();
                    }
                });
            }
            obj = Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        if (Result.isSuccess-impl(obj)) {
            if (callback != null) {
                callback.onResult(true);
            }
        }
        if (Result.exceptionOrNull-impl(obj) == null || callback == null) {
            return;
        }
        callback.onResult(false);
    }

    @Override // com.heytap.health.watch.notification.INotificationAidl
    public void getAllSwitches(@NotNull final INotificationDataCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        NotificationModule.INSTANCE.q(new Runnable() { // from class: com.oplus.aiunit.vision.szc
            @Override // java.lang.Runnable
            public final void run() throws RemoteException {
                NotificationTransportApisImpl$iBinder$1.getAllSwitches$lambda$5(callback);
            }
        });
    }

    @Override // com.heytap.health.watch.notification.INotificationAidl
    public void getSwitch(@NotNull final String packageName, @NotNull final INotificationDataCallback callback) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(callback, "callback");
        NotificationModule.INSTANCE.q(new Runnable() { // from class: com.oplus.aiunit.vision.b0d
            @Override // java.lang.Runnable
            public final void run() throws RemoteException {
                NotificationTransportApisImpl$iBinder$1.getSwitch$lambda$4(packageName, callback);
            }
        });
    }

    @Override // com.heytap.health.watch.notification.INotificationAidl
    public void negotiate(final int sid, final int cid, @NotNull final String uuid, @NotNull final INotificationECDHCallback callback) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(callback, "callback");
        NotificationModule.INSTANCE.q(new Runnable() { // from class: com.oplus.aiunit.vision.yzc
            @Override // java.lang.Runnable
            public final void run() throws RemoteException {
                NotificationTransportApisImpl$iBinder$1.negotiate$lambda$9(sid, cid, uuid, callback);
            }
        });
    }

    @Override // com.heytap.health.watch.notification.INotificationAidl
    public void pushFakeNotification(@NotNull final String pushData, final boolean skipUnzip) {
        Intrinsics.checkNotNullParameter(pushData, "pushData");
        NotificationModule.INSTANCE.q(new Runnable() { // from class: com.oplus.aiunit.vision.rzc
            @Override // java.lang.Runnable
            public final void run() {
                NotificationTransportApisImpl$iBinder$1.pushFakeNotification$lambda$6(pushData, skipUnzip);
            }
        });
    }

    @Override // com.heytap.health.watch.notification.INotificationAidl
    public void pushFakeNotification2(@NotNull final StatusBarNotification sbn) {
        Intrinsics.checkNotNullParameter(sbn, "sbn");
        NotificationModule.INSTANCE.q(new Runnable() { // from class: com.oplus.aiunit.vision.zzc
            @Override // java.lang.Runnable
            public final void run() {
                NotificationTransportApisImpl$iBinder$1.pushFakeNotification2$lambda$8(sbn);
            }
        });
    }

    @Override // com.heytap.health.watch.notification.INotificationAidl
    public void setSwitchStatus(@NotNull final String packageName, final boolean status, final boolean needSync, @NotNull final INotificationBooleanCallback callback) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(callback, "callback");
        NotificationModule.INSTANCE.q(new Runnable() { // from class: com.oplus.aiunit.vision.xzc
            @Override // java.lang.Runnable
            public final void run() throws RemoteException {
                NotificationTransportApisImpl$iBinder$1.setSwitchStatus$lambda$0(needSync, packageName, status, callback);
            }
        });
    }
}
