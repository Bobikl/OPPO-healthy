package com.oplus.aiunit.p007vision;

import android.content.Context;
import android.os.Bundle;
import com.heytap.health.base.task.ThreadUtils;
import com.heytap.health.base.text.GsonUtil;
import com.heytap.health.base.track.quality.QualityTrack;
import com.heytap.health.base.track.quality.Scenes;
import com.heytap.health.watch.commonnotification.HeytapNotificationListenerService;
import com.heytap.health.watch.notification.HealthNotificationBean;
import com.heytap.health.watch.notification.impl.module.NotificationHolder;
import com.heytap.health.watch.notification.impl.module.NotificationModule;
import com.heytap.health.watchpair.family.personalInfo.FamilyPersonalInfoActivity;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.log.nx.obus.Constants;
import com.oplus.aiunit.vision.e88;
import com.oplus.aiunit.vision.em4;
import com.oplus.aiunit.vision.hm4;
import com.oplus.aiunit.vision.m8b;
import com.oplus.aiunit.vision.wl4;
import com.oplus.wearable.linkservice.sdk.Node;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import java.time.LocalTime;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes19.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b;\u0010<J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\u001a\u0010\r\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016J\u0018\u0010\u000e\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\u000e\u0010\u0010\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bJ\u0010\u0010\u0011\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\u0012\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\u0013\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\b\u0010\u0014\u001a\u00020\u0006H\u0016J\u000e\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0015J\u0006\u0010\u0018\u001a\u00020\u0006J\u000e\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0019J\u000e\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u0019J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\b2\u0006\u0010\u001a\u001a\u00020\u0019J\u000e\u0010!\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u001fJ\u0006\u0010\"\u001a\u00020\u001fJ\u001a\u0010&\u001a\u00020\u00062\b\u0010$\u001a\u0004\u0018\u00010#2\b\u0010%\u001a\u0004\u0018\u00010#J\u0006\u0010'\u001a\u00020\u0006R\u0014\u0010(\u001a\u00020\u00198\u0006X\u0086T¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010,\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010+R\u0014\u0010/\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010.R\u0014\u00102\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u00101R\u0018\u00104\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u00103R\"\u00107\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\b058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u00106R\u0018\u00109\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u00108R\u0018\u0010:\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u00108¨\u0006="}, d2 = {"Lcom/oplus/aiunit/vision/yxc;", "Lcom/oplus/aiunit/vision/vr9;", "", "v", "Lcom/heytap/health/watch/commonnotification/HeytapNotificationListenerService;", "listenerService", "", "d", "Lcom/heytap/health/watch/notification/HealthNotificationBean;", "hnb", "e", "Landroid/os/Bundle;", "watchPush", "g", "a", "h", "y", "b", "f", "c", "onDestroy", "Lcom/oplus/wearable/linkservice/sdk/Node;", "node", FamilyPersonalInfoActivity.SEX_M, "H", "", "key", "I", "packageName", "J", LogFieldKey.TAG_KEY, "", Constants.EVENT_STATUS_FIELD, "N", "u", "Ljava/time/LocalTime;", "start", "end", "L", "K", "TAG", "Ljava/lang/String;", "Lcom/oplus/aiunit/vision/tll;", "Lcom/oplus/aiunit/vision/tll;", "mWeChatVoiceTransceiver", "Lcom/oplus/aiunit/vision/hyc;", "Lcom/oplus/aiunit/vision/hyc;", "mIntercept", "Lcom/oplus/aiunit/vision/mxc;", "Lcom/oplus/aiunit/vision/mxc;", "mEventConverter", "Lcom/heytap/health/watch/commonnotification/HeytapNotificationListenerService;", "mListenerService", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/util/concurrent/ConcurrentHashMap;", "mSbnCache", "Ljava/time/LocalTime;", "mSleepStart", "mSleepEnd", "<init>", "()V", "device_notification_impl2_release"}, k = 1, mv = {1, 8, 0})
public final class yxc implements vr9 {

    @NotNull
    public static final String TAG = "NTF_EventManager";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public static HeytapNotificationListenerService mListenerService;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public static LocalTime mSleepStart;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public static LocalTime mSleepEnd;

    @NotNull
    public static final yxc INSTANCE = new yxc();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final tll mWeChatVoiceTransceiver = new tll();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final hyc mIntercept = new hyc();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final mxc mEventConverter = new mxc();

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public static ConcurrentHashMap<String, HealthNotificationBean> mSbnCache = new ConcurrentHashMap<>();

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, d2 = {"com/oplus/aiunit/vision/yxc$a", "Lcom/oplus/aiunit/vision/hm4$c;", "", "success", "", "code", "", "a", "device_notification_impl2_release"}, k = 1, mv = {1, 8, 0})
    public static final class a implements hm4.c {
        public final /* synthetic */ HealthNotificationBean a;

        public a(HealthNotificationBean healthNotificationBean) {
            this.a = healthNotificationBean;
        }

        public static final void c(HealthNotificationBean healthNotificationBean) {
            Intrinsics.checkNotNullParameter(healthNotificationBean, "$hnb");
            yxc.mSbnCache.put(healthNotificationBean.getKey(), healthNotificationBean);
            m8b.f(yxc.TAG, "onForceNotificationPosted onSendResult: cache sbn " + healthNotificationBean.getKey());
        }

        public void a(boolean success, int code) {
            if (success) {
                NotificationModule notificationModule = NotificationModule.INSTANCE;
                final HealthNotificationBean healthNotificationBean = this.a;
                notificationModule.q(new Runnable() { // from class: com.oplus.aiunit.vision.xxc
                    @Override // java.lang.Runnable
                    public final void run() {
                        yxc.a.c(healthNotificationBean);
                    }
                });
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, d2 = {"com/oplus/aiunit/vision/yxc$b", "Lcom/oplus/aiunit/vision/hm4$c;", "", "success", "", "code", "", "a", "device_notification_impl2_release"}, k = 1, mv = {1, 8, 0})
    public static final class b implements hm4.c {
        public final /* synthetic */ HealthNotificationBean a;

        public b(HealthNotificationBean healthNotificationBean) {
            this.a = healthNotificationBean;
        }

        public static final void c(HealthNotificationBean healthNotificationBean) {
            Intrinsics.checkNotNullParameter(healthNotificationBean, "$hnb");
            yxc.mSbnCache.remove(healthNotificationBean.getKey());
            m8b.f(yxc.TAG, "onSendResult: remove sbn cache " + healthNotificationBean.getKey());
        }

        public void a(boolean success, int code) {
            if (success) {
                NotificationModule notificationModule = NotificationModule.INSTANCE;
                final HealthNotificationBean healthNotificationBean = this.a;
                notificationModule.q(new Runnable() { // from class: com.oplus.aiunit.vision.zxc
                    @Override // java.lang.Runnable
                    public final void run() {
                        yxc.b.c(healthNotificationBean);
                    }
                });
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, d2 = {"com/oplus/aiunit/vision/yxc$c", "Lcom/oplus/aiunit/vision/hm4$c;", "", "success", "", "code", "", "a", "device_notification_impl2_release"}, k = 1, mv = {1, 8, 0})
    public static final class c implements hm4.c {
        public final /* synthetic */ HealthNotificationBean a;

        public c(HealthNotificationBean healthNotificationBean) {
            this.a = healthNotificationBean;
        }

        public static final void c(HealthNotificationBean healthNotificationBean) {
            Intrinsics.checkNotNullParameter(healthNotificationBean, "$hnb");
            yxc.mSbnCache.put(healthNotificationBean.getKey(), healthNotificationBean);
            m8b.f(yxc.TAG, "onSendResult: cache sbn " + healthNotificationBean.getKey());
        }

        public void a(boolean success, int code) {
            if (success) {
                NotificationModule notificationModule = NotificationModule.INSTANCE;
                final HealthNotificationBean healthNotificationBean = this.a;
                notificationModule.q(new Runnable() { // from class: com.oplus.aiunit.vision.ayc
                    @Override // java.lang.Runnable
                    public final void run() {
                        yxc.c.c(healthNotificationBean);
                    }
                });
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, d2 = {"com/oplus/aiunit/vision/yxc$d", "Lcom/oplus/aiunit/vision/hm4$c;", "", "success", "", "code", "", "a", "device_notification_impl2_release"}, k = 1, mv = {1, 8, 0})
    public static final class d implements hm4.c {
        public final /* synthetic */ HealthNotificationBean a;

        public d(HealthNotificationBean healthNotificationBean) {
            this.a = healthNotificationBean;
        }

        public static final void c(HealthNotificationBean healthNotificationBean) {
            Intrinsics.checkNotNullParameter(healthNotificationBean, "$hnb");
            yxc.mSbnCache.remove(healthNotificationBean.getKey());
            m8b.f(yxc.TAG, "onSendResult: remove sbn " + healthNotificationBean.getKey());
        }

        public void a(boolean success, int code) {
            if (success) {
                NotificationModule notificationModule = NotificationModule.INSTANCE;
                final HealthNotificationBean healthNotificationBean = this.a;
                notificationModule.q(new Runnable() { // from class: com.oplus.aiunit.vision.byc
                    @Override // java.lang.Runnable
                    public final void run() {
                        yxc.d.c(healthNotificationBean);
                    }
                });
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, d2 = {"com/oplus/aiunit/vision/yxc$e", "Lcom/oplus/aiunit/vision/hm4$c;", "", "success", "", "code", "", "a", "device_notification_impl2_release"}, k = 1, mv = {1, 8, 0})
    public static final class e implements hm4.c {
        public final /* synthetic */ HealthNotificationBean a;
        public final /* synthetic */ long b;

        public e(HealthNotificationBean healthNotificationBean, long j) {
            this.a = healthNotificationBean;
            this.b = j;
        }

        public static final void c(HealthNotificationBean healthNotificationBean, long j) {
            Intrinsics.checkNotNullParameter(healthNotificationBean, "$hnb");
            yxc.mSbnCache.put(healthNotificationBean.getKey(), healthNotificationBean);
            m8b.f(yxc.TAG, "onSendResult: cache sbn " + healthNotificationBean.getKey());
            if (j <= 1000 || !Intrinsics.areEqual(healthNotificationBean.getPackageName(), y51.PKG_WECHAT)) {
                return;
            }
            HashMap map = new HashMap();
            map.put("key", healthNotificationBean.getKey());
            map.put("loginStatus", Integer.valueOf(yxc.INSTANCE.u()));
            map.put("postTime", Long.valueOf(healthNotificationBean.getPostTimeMillis()));
            map.put("duration", Long.valueOf(j));
            QualityTrack qualityTrack = QualityTrack.INSTANCE;
            Scenes scenes = Scenes.NOTIFICATION_DELAY;
            String strE = GsonUtil.e(map);
            Intrinsics.checkNotNullExpressionValue(strE, "toJson(map)");
            qualityTrack.c(scenes, strE);
        }

        public void a(boolean success, int code) {
            if (success) {
                NotificationModule notificationModule = NotificationModule.INSTANCE;
                final HealthNotificationBean healthNotificationBean = this.a;
                final long j = this.b;
                notificationModule.q(new Runnable() { // from class: com.oplus.aiunit.vision.cyc
                    @Override // java.lang.Runnable
                    public final void run() {
                        yxc.e.c(healthNotificationBean, j);
                    }
                });
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, d2 = {"com/oplus/aiunit/vision/yxc$f", "Lcom/oplus/aiunit/vision/hm4$c;", "", "success", "", "code", "", "a", "device_notification_impl2_release"}, k = 1, mv = {1, 8, 0})
    public static final class f implements hm4.c {
        public final /* synthetic */ HealthNotificationBean a;

        public f(HealthNotificationBean healthNotificationBean) {
            this.a = healthNotificationBean;
        }

        public static final void c(HealthNotificationBean healthNotificationBean) {
            Intrinsics.checkNotNullParameter(healthNotificationBean, "$hnb");
            yxc.mSbnCache.put(healthNotificationBean.getKey(), healthNotificationBean);
            m8b.f(yxc.TAG, "onSendResult: cache sbn " + healthNotificationBean.getKey());
        }

        public void a(boolean success, int code) {
            if (success) {
                NotificationModule notificationModule = NotificationModule.INSTANCE;
                final HealthNotificationBean healthNotificationBean = this.a;
                notificationModule.q(new Runnable() { // from class: com.oplus.aiunit.vision.dyc
                    @Override // java.lang.Runnable
                    public final void run() {
                        yxc.f.c(healthNotificationBean);
                    }
                });
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, d2 = {"com/oplus/aiunit/vision/yxc$g", "Lcom/oplus/aiunit/vision/hm4$c;", "", "success", "", "code", "", "a", "device_notification_impl2_release"}, k = 1, mv = {1, 8, 0})
    public static final class g implements hm4.c {
        public final /* synthetic */ HealthNotificationBean a;

        public g(HealthNotificationBean healthNotificationBean) {
            this.a = healthNotificationBean;
        }

        public static final void c(HealthNotificationBean healthNotificationBean) {
            Intrinsics.checkNotNullParameter(healthNotificationBean, "$hnb");
            yxc.mSbnCache.remove(healthNotificationBean.getKey());
            m8b.f(yxc.TAG, "onSendResult: remove sbn cache " + healthNotificationBean.getKey());
        }

        public void a(boolean success, int code) {
            if (success) {
                NotificationModule notificationModule = NotificationModule.INSTANCE;
                final HealthNotificationBean healthNotificationBean = this.a;
                notificationModule.q(new Runnable() { // from class: com.oplus.aiunit.vision.eyc
                    @Override // java.lang.Runnable
                    public final void run() {
                        yxc.g.c(healthNotificationBean);
                    }
                });
            }
        }
    }

    public static final void A(HealthNotificationBean healthNotificationBean) {
        Intrinsics.checkNotNullParameter(healthNotificationBean, "$hnb");
        if (qbm.INSTANCE.k() || INSTANCE.v()) {
            healthNotificationBean.setFlags(healthNotificationBean.getFlags() | 268435456);
        }
        MessageEvent messageEventC = mEventConverter.c(healthNotificationBean);
        if (messageEventC != null) {
            wl4.deviceMultiple.b.j(wl4.managerApi.n(), messageEventC, new a(healthNotificationBean));
        }
    }

    public static final void B(HealthNotificationBean healthNotificationBean) {
        Intrinsics.checkNotNullParameter(healthNotificationBean, "$hnb");
        MessageEvent messageEventE = mEventConverter.e(healthNotificationBean);
        if (messageEventE != null) {
            wl4.deviceMultiple.b.j(wl4.managerApi.n(), messageEventE, new b(healthNotificationBean));
        }
    }

    public static final void C(HealthNotificationBean healthNotificationBean, Bundle bundle) {
        Intrinsics.checkNotNullParameter(healthNotificationBean, "$hnb");
        Intrinsics.checkNotNullParameter(bundle, "$watchPush");
        em4 em4Var = wl4.managerApi;
        String currentConnectId = em4Var.getCurrentConnectId();
        if (currentConnectId != null && NotificationHolder.INSTANCE.e(currentConnectId)) {
            m8b.f(TAG, "onNotificationFluid, familyIntercept");
            return;
        }
        if (qbm.INSTANCE.k() || INSTANCE.v()) {
            healthNotificationBean.setFlags(healthNotificationBean.getFlags() | 268435456);
        }
        MessageEvent messageEventA = mEventConverter.a(healthNotificationBean, bundle);
        if (messageEventA != null) {
            wl4.deviceMultiple.b.j(em4Var.n(), messageEventA, new c(healthNotificationBean));
        }
    }

    public static final void D(HealthNotificationBean healthNotificationBean) {
        Intrinsics.checkNotNullParameter(healthNotificationBean, "$hnb");
        if (qbm.INSTANCE.k()) {
            healthNotificationBean.setFlags(healthNotificationBean.getFlags() | 268435456);
        }
        MessageEvent messageEventB = mEventConverter.b(healthNotificationBean);
        if (messageEventB != null) {
            wl4.deviceMultiple.b.j(wl4.managerApi.n(), messageEventB, new d(healthNotificationBean));
        }
    }

    public static final void E(HealthNotificationBean healthNotificationBean) {
        Intrinsics.checkNotNullParameter(healthNotificationBean, "$hnb");
        long jCurrentTimeMillis = System.currentTimeMillis() - healthNotificationBean.getPostTimeMillis();
        tll tllVar = mWeChatVoiceTransceiver;
        mxc mxcVar = mEventConverter;
        tllVar.b(healthNotificationBean, mxcVar);
        if (mIntercept.f(healthNotificationBean, false)) {
            return;
        }
        if (qbm.INSTANCE.k() || INSTANCE.v() || healthNotificationBean.isSilent()) {
            healthNotificationBean.setFlags(healthNotificationBean.getFlags() | 268435456);
        }
        MessageEvent messageEventC = mxcVar.c(healthNotificationBean);
        if (messageEventC != null) {
            wl4.deviceMultiple.b.j(wl4.managerApi.n(), messageEventC, new e(healthNotificationBean, jCurrentTimeMillis));
        }
    }

    public static final void F(HealthNotificationBean healthNotificationBean, Bundle bundle) {
        Intrinsics.checkNotNullParameter(healthNotificationBean, "$hnb");
        if (qbm.INSTANCE.k() || INSTANCE.v()) {
            healthNotificationBean.setFlags(healthNotificationBean.getFlags() | 268435456);
        }
        MessageEvent messageEventD = mEventConverter.d(healthNotificationBean, bundle);
        if (messageEventD != null) {
            wl4.deviceMultiple.b.j(wl4.managerApi.n(), messageEventD, new f(healthNotificationBean));
        }
    }

    public static final void G(HealthNotificationBean healthNotificationBean) {
        MessageEvent messageEventE;
        Intrinsics.checkNotNullParameter(healthNotificationBean, "$hnb");
        hyc.INSTANCE.b().remove(healthNotificationBean.getKey());
        com.heytap.health.watch.notification.impl.whitelist.a aVar = com.heytap.health.watch.notification.impl.whitelist.a.INSTANCE;
        if (aVar.k("main_switch")) {
            if ((!aVar.k(healthNotificationBean.getPackageName()) && !y51.INSTANCE.m(healthNotificationBean)) || (messageEventE = mEventConverter.e(healthNotificationBean)) == null) {
                return;
            }
            wl4.deviceMultiple.b.j(wl4.managerApi.n(), messageEventE, new g(healthNotificationBean));
        }
    }

    public static final void w() {
        com.heytap.health.watch.notification.impl.whitelist.a.INSTANCE.s();
    }

    public static final void x() {
        com.heytap.health.watch.notification.impl.whitelist.a.INSTANCE.s();
    }

    public static final void z(HealthNotificationBean healthNotificationBean) {
        Intrinsics.checkNotNullParameter(healthNotificationBean, "$hnb");
        if (mIntercept.f(healthNotificationBean, true)) {
            return;
        }
        INSTANCE.b(healthNotificationBean);
    }

    public final void H() {
        try {
            m8b.f(TAG, "removeAll: clear");
            mSbnCache.clear();
            HeytapNotificationListenerService heytapNotificationListenerService = mListenerService;
            if (heytapNotificationListenerService != null) {
                heytapNotificationListenerService.cancelAllNotifications();
            }
        } catch (Exception e2) {
            lyc.Companion companion = lyc.INSTANCE;
            Context contextA = e88.a();
            Intrinsics.checkNotNullExpressionValue(contextA, "getAppContext()");
            boolean zF = companion.f(contextA);
            m8b.m(TAG, "removeAllSbn: " + e2.getMessage() + ", enable=" + zF);
        }
    }

    public final void I(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            m8b.f(TAG, "removeSbn: " + key);
            mSbnCache.remove(key);
            HeytapNotificationListenerService heytapNotificationListenerService = mListenerService;
            if (heytapNotificationListenerService != null) {
                heytapNotificationListenerService.cancelNotification(key);
            }
        } catch (Exception e2) {
            lyc.Companion companion = lyc.INSTANCE;
            Context contextA = e88.a();
            Intrinsics.checkNotNullExpressionValue(contextA, "getAppContext()");
            boolean zF = companion.f(contextA);
            m8b.m(TAG, "removeSbn: " + e2.getMessage() + ", enable=" + zF);
        }
    }

    public final void J(@NotNull String packageName) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        m8b.f(TAG, "removeSbnByPackage: packageName=" + packageName);
        Enumeration<String> enumerationKeys = mSbnCache.keys();
        Intrinsics.checkNotNullExpressionValue(enumerationKeys, "mSbnCache.keys()");
        Iterator it = CollectionsKt.iterator(enumerationKeys);
        while (it.hasNext()) {
            String str = (String) it.next();
            Intrinsics.checkNotNullExpressionValue(str, "key");
            if (StringsKt.contains$default(str, packageName, false, 2, (Object) null)) {
                mSbnCache.remove(str);
                m8b.f(TAG, "removeSbnByPackage: key=" + str);
            }
        }
    }

    public final void K() {
        mEventConverter.g();
    }

    public final void L(@Nullable LocalTime start, @Nullable LocalTime end) {
        mSleepStart = start;
        mSleepEnd = end;
    }

    public final void M(@NotNull Node node) {
        Intrinsics.checkNotNullParameter(node, "node");
        mIntercept.g(node);
        mEventConverter.h(node);
    }

    public final void N(int status) {
        mIntercept.h(status);
    }

    @Override // com.oplus.aiunit.p007vision.vr9
    public void a(@NotNull final HealthNotificationBean hnb, @NotNull final Bundle watchPush) {
        Intrinsics.checkNotNullParameter(hnb, "hnb");
        Intrinsics.checkNotNullParameter(watchPush, "watchPush");
        NotificationModule.INSTANCE.q(new Runnable() { // from class: com.oplus.aiunit.vision.qxc
            @Override // java.lang.Runnable
            public final void run() {
                yxc.C(hnb, watchPush);
            }
        });
    }

    @Override // com.oplus.aiunit.p007vision.vr9
    public void b(@NotNull final HealthNotificationBean hnb) {
        Intrinsics.checkNotNullParameter(hnb, "hnb");
        NotificationModule.INSTANCE.q(new Runnable() { // from class: com.oplus.aiunit.vision.uxc
            @Override // java.lang.Runnable
            public final void run() {
                yxc.A(hnb);
            }
        });
    }

    @Override // com.oplus.aiunit.p007vision.vr9
    public void c(@NotNull final HealthNotificationBean hnb) {
        Intrinsics.checkNotNullParameter(hnb, "hnb");
        NotificationModule.INSTANCE.q(new Runnable() { // from class: com.oplus.aiunit.vision.vxc
            @Override // java.lang.Runnable
            public final void run() {
                yxc.B(hnb);
            }
        });
    }

    @Override // com.oplus.aiunit.p007vision.vr9
    public void d(@NotNull HeytapNotificationListenerService listenerService) {
        Intrinsics.checkNotNullParameter(listenerService, "listenerService");
        m8b.f(TAG, "onCreate:" + listenerService);
        mListenerService = listenerService;
        ThreadUtils.doInBackground("NTF_", new Runnable() { // from class: com.oplus.aiunit.vision.sxc
            @Override // java.lang.Runnable
            public final void run() {
                yxc.w();
            }
        }, 1500L);
    }

    @Override // com.oplus.aiunit.p007vision.vr9
    public void e(@NotNull final HealthNotificationBean hnb) {
        Intrinsics.checkNotNullParameter(hnb, "hnb");
        NotificationModule.INSTANCE.q(new Runnable() { // from class: com.oplus.aiunit.vision.rxc
            @Override // java.lang.Runnable
            public final void run() {
                yxc.E(hnb);
            }
        });
    }

    @Override // com.oplus.aiunit.p007vision.vr9
    public void f(@NotNull final HealthNotificationBean hnb) {
        Intrinsics.checkNotNullParameter(hnb, "hnb");
        NotificationModule.INSTANCE.q(new Runnable() { // from class: com.oplus.aiunit.vision.txc
            @Override // java.lang.Runnable
            public final void run() {
                yxc.G(hnb);
            }
        });
    }

    @Override // com.oplus.aiunit.p007vision.vr9
    public void g(@NotNull final HealthNotificationBean hnb, @Nullable final Bundle watchPush) {
        Intrinsics.checkNotNullParameter(hnb, "hnb");
        NotificationModule.INSTANCE.q(new Runnable() { // from class: com.oplus.aiunit.vision.oxc
            @Override // java.lang.Runnable
            public final void run() {
                yxc.F(hnb, watchPush);
            }
        });
    }

    @Override // com.oplus.aiunit.p007vision.vr9
    public void h(@NotNull final HealthNotificationBean hnb) {
        Intrinsics.checkNotNullParameter(hnb, "hnb");
        NotificationModule.INSTANCE.q(new Runnable() { // from class: com.oplus.aiunit.vision.pxc
            @Override // java.lang.Runnable
            public final void run() {
                yxc.D(hnb);
            }
        });
    }

    @Override // com.oplus.aiunit.p007vision.vr9
    public void onDestroy() {
        StringBuilder sb = new StringBuilder();
        sb.append("onDestroy: ");
        sb.append(this);
        mSbnCache.clear();
        ThreadUtils.doInBackground("NTF_", new Runnable() { // from class: com.oplus.aiunit.vision.nxc
            @Override // java.lang.Runnable
            public final void run() {
                yxc.x();
            }
        }, 1500L);
    }

    @Nullable
    public final HealthNotificationBean t(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return mSbnCache.get(key);
    }

    public final int u() {
        return mIntercept.e();
    }

    public final boolean v() {
        LocalTime localTime;
        LocalTime localTime2 = mSleepStart;
        if (localTime2 == null || (localTime = mSleepEnd) == null) {
            return false;
        }
        LocalTime localTimeNow = LocalTime.now();
        if (localTime2.isBefore(localTime)) {
            if (localTimeNow.isBefore(localTime2) || localTimeNow.isAfter(localTime)) {
                return false;
            }
        } else if (!localTimeNow.isBefore(localTime) && !localTimeNow.isAfter(localTime2)) {
            return false;
        }
        return true;
    }

    public final void y(@NotNull final HealthNotificationBean hnb) {
        Intrinsics.checkNotNullParameter(hnb, "hnb");
        NotificationModule.INSTANCE.q(new Runnable() { // from class: com.oplus.aiunit.vision.wxc
            @Override // java.lang.Runnable
            public final void run() {
                yxc.z(hnb);
            }
        });
    }
}
