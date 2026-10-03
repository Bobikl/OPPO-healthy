package com.oplus.aiunit.p007vision;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.heytap.health.base.R;
import com.heytap.health.base.notification.NotificationConfig;
import com.heytap.health.device_data_sync.data_sync.IDeviceWearStatusService;
import com.heytap.health.device_manager_base.DeviceConstants;
import com.heytap.health.devicemanager.processor.bean.OobeStatusBean;
import com.heytap.health.devicemanager.processor.bean.UserDeviceInfo;
import com.heytap.health.watch.notification.HealthNotificationBean;
import com.heytap.health.watch.notification.INotificationApiService;
import com.heytap.health.watch.notification.impl.R$string;
import com.heytap.health.watch.notification.impl.cloud.CloudPushManager;
import com.heytap.health.watch.notification.impl.module.NotificationHolder;
import com.heytap.health.watch.notification.impl.module.NotificationModule;
import com.heytap.health.watch.notification.impl.whitelist.a;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.e1;
import com.oplus.aiunit.vision.e88;
import com.oplus.aiunit.vision.fdg;
import com.oplus.aiunit.vision.ln3;
import com.oplus.aiunit.vision.m8b;
import com.oplus.aiunit.vision.mb5;
import com.oplus.aiunit.vision.wl4;
import com.oplus.aiunit.vision.wwc;
import com.oplus.wearable.linkservice.sdk.Node;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes19.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00172\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\n\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bJ\b\u0010\u000b\u001a\u00020\u0004H\u0002J\b\u0010\f\u001a\u00020\u0004H\u0002J\b\u0010\r\u001a\u00020\u0004H\u0002J\b\u0010\u000e\u001a\u00020\u0004H\u0002R\u0016\u0010\u0011\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0013¨\u0006\u0018"}, d2 = {"Lcom/oplus/aiunit/vision/y51;", "", "Lcom/oplus/wearable/linkservice/sdk/Node;", "node", "", "h", "Lcom/heytap/health/watch/notification/HealthNotificationBean;", "sbn", "", "fromReceive", "c", "e", "b", "g", "d", "a", "Lcom/heytap/health/watch/notification/HealthNotificationBean;", "lastSbn", "Lcom/oplus/aiunit/vision/uwc$b;", "Lcom/oplus/aiunit/vision/uwc$b;", "ability", "<init>", "()V", "Companion", "device_notification_impl2_release"}, k = 1, mv = {1, 8, 0})
public final class y51 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String PKG_QQ = "com.tencent.mobileqq";

    @NotNull
    public static final String PKG_WECHAT = "com.tencent.mm";

    @NotNull
    public static final String TAG = "NTF_Intercept";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public HealthNotificationBean lastSbn;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public uwc.b ability;

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.y51$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u001c\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b8\u00109J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\fH\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000f\u0010\u000bJ\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0010\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0011\u0010\u000eJ\u0018\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\fH\u0002J\u0018\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\fH\u0002J\u0010\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\fH\u0002J\u0010\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\fH\u0002J\u0010\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\fH\u0002J,\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\u0019H\u0002J\u0010\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002R\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010 R\u0014\u0010\"\u001a\u00020\u001e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010 R\u0014\u0010#\u001a\u00020\u001e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b#\u0010 R\u0014\u0010$\u001a\u00020\u001e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010 R\u0014\u0010%\u001a\u00020\u001e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b%\u0010 R\u0014\u0010&\u001a\u00020\u001e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b&\u0010 R\u0014\u0010'\u001a\u00020\u001e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b'\u0010 R\u0014\u0010(\u001a\u00020\u001e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b(\u0010 R\u0014\u0010)\u001a\u00020\u001e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b)\u0010 R\u0014\u0010*\u001a\u00020\u001e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b*\u0010 R\u0014\u0010+\u001a\u00020\u001e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b+\u0010 R\u0014\u0010,\u001a\u00020\u001e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b,\u0010 R\u0014\u0010-\u001a\u00020\u001e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b-\u0010 R\u0014\u0010.\u001a\u00020\u001e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b.\u0010 R\u0014\u0010/\u001a\u00020\u001e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b/\u0010 R\u0014\u00100\u001a\u00020\u001e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b0\u0010 R\u0014\u00101\u001a\u00020\u001e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b1\u0010 R\u0014\u00102\u001a\u00020\u001e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b2\u0010 R\u0014\u00103\u001a\u00020\u001e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b3\u0010 R\u0014\u00104\u001a\u00020\u001e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b4\u0010 R\u0014\u00105\u001a\u00020\u001e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b5\u0010 R\u0014\u00106\u001a\u00020\u001e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b6\u0010 R\u0014\u00107\u001a\u00020\u001e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b7\u0010 ¨\u0006:"}, d2 = {"Lcom/oplus/aiunit/vision/y51$a;", "", "Lcom/heytap/health/watch/notification/HealthNotificationBean;", "sbn", "", LogFieldKey.MESSAGE_KEY, "q", "k", "Landroid/app/Notification;", "notification", "h", "(Landroid/app/Notification;)Z", "Landroid/service/notification/StatusBarNotification;", LogFieldKey.LEVEL_KEY, "(Landroid/service/notification/StatusBarNotification;)Z", "j", LogFieldKey.PROCESS_NAME_KEY, "f", "lastSbn", "c", "o", "d", "i", "statusBarNotification", "g", "", "title", "content", "n", "e", "", "DAISY_REDUNDANT_MISSED_CALL_STR", "Ljava/lang/String;", "MANUFACTURER_DAISY", "OPPO_TT_PUSH_CHANNEL_ID", "OPPO_TT_PUSH_CHANNEL_ID_2", "PKG_BEECHAT", "PKG_BEECHAT_2", "PKG_CHALLEGRAM", "PKG_CHANNEL_OPPO_TT_REPLY", "PKG_CHANNEL_WX_DOWNLOAD", "PKG_GMAIL", "PKG_KIKI", "PKG_LINE", "PKG_NOTIFICATION_PLUGIN", "PKG_OASISFENG_NEVO", "PKG_QQ", "PKG_QQ_LITE", "PKG_QQ_TIM", "PKG_TEAM_TALK", "PKG_WECHAT", "PKG_WHATSAPP", "PKG_WINTHESHOW_QUICKREPLY", "RANKER_GROUP", "SKYPE_PKG_NAME", "TAG", "<init>", "()V", "device_notification_impl2_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean c(StatusBarNotification sbn, StatusBarNotification lastSbn) {
            Notification notification = sbn.getNotification();
            if ((notification != null ? notification.extras : null) == null) {
                m8b.m("NTF_Intercept", "Note: notification or extras null refuse");
                return true;
            }
            if (f(sbn)) {
                m8b.m("NTF_Intercept", "Note: is music filter and refuse");
                return true;
            }
            Intrinsics.checkNotNullExpressionValue(notification, "notification");
            if (h(notification)) {
                m8b.m("NTF_Intercept", "Note: notification on going refuse");
                return true;
            }
            if (j(notification)) {
                m8b.m("NTF_Intercept", "Note: extra progress refuse");
                return true;
            }
            if (l(sbn)) {
                m8b.m("NTF_Intercept", "Note: is rank group refuse");
                return true;
            }
            if (!o(sbn, lastSbn)) {
                return false;
            }
            m8b.m("NTF_Intercept", "Note: is special app  refuse");
            return true;
        }

        public final boolean d(StatusBarNotification sbn) {
            Notification notification = sbn.getNotification();
            return (notification.getGroup() == null || (notification.flags & 512) == 0) ? false : true;
        }

        public final boolean e(HealthNotificationBean sbn) {
            if (NotificationHolder.INSTANCE.f(sbn.getPackageName())) {
                m8b.f("NTF_Intercept", "missed call, filter it");
                return true;
            }
            String str = Build.MANUFACTURER;
            Intrinsics.checkNotNullExpressionValue(str, "MANUFACTURER");
            if (!StringsKt.equals(StringsKt.trim(str).toString(), "HUAWEI", true) || !TextUtils.equals("未接来电", sbn.getTitle()) || !TextUtils.equals("未接来电", sbn.getContent())) {
                return false;
            }
            m8b.f("NTF_Intercept", "DAISY missed call, filter it");
            return true;
        }

        public final boolean f(@NotNull StatusBarNotification sbn) {
            Intrinsics.checkNotNullParameter(sbn, "sbn");
            return TextUtils.equals(HealthNotificationBean.INSTANCE.f(sbn.getNotification().extras, "android.template"), Notification.MediaStyle.class.getName());
        }

        public final boolean g(StatusBarNotification statusBarNotification) {
            String channelId = statusBarNotification.getNotification().getChannelId();
            if (channelId == null) {
                return false;
            }
            if (TextUtils.equals(statusBarNotification.getPackageName(), "com.teamtalk.im") && StringsKt.startsWith$default(channelId, "com.oppo.im_client", false, 2, (Object) null)) {
                return true;
            }
            return TextUtils.equals(statusBarNotification.getPackageName(), y51.PKG_WECHAT) && Intrinsics.areEqual(channelId, "reminder_channel_id");
        }

        public final boolean h(@NotNull Notification notification) {
            Intrinsics.checkNotNullParameter(notification, "notification");
            return (notification.flags & 34) != 0;
        }

        public final boolean i(StatusBarNotification sbn) {
            Notification notification = sbn.getNotification();
            String channelId = notification != null ? notification.getChannelId() : null;
            if (channelId == null) {
                channelId = "";
            }
            if (TextUtils.equals(sbn.getPackageName(), "com.teamtalk.im")) {
                return StringsKt.startsWith$default(channelId, "yzj_notification_channel_update_app", false, 2, (Object) null) || StringsKt.startsWith$default(channelId, "yzj_notification_channel_others", false, 2, (Object) null);
            }
            return false;
        }

        public final boolean j(@NotNull Notification notification) {
            Intrinsics.checkNotNullParameter(notification, "notification");
            Bundle bundle = notification.extras;
            return Intrinsics.areEqual("progress", notification.category) || (bundle != null ? bundle.getInt("android.progressMax", 0) : 0) > 0;
        }

        public final boolean k(@NotNull HealthNotificationBean sbn) {
            Intrinsics.checkNotNullParameter(sbn, "sbn");
            return Intrinsics.areEqual(sbn.getPackageName(), y51.PKG_QQ) || Intrinsics.areEqual(sbn.getPackageName(), "com.tencent.qqlite") || Intrinsics.areEqual(sbn.getPackageName(), "com.tencent.tim");
        }

        public final boolean l(@NotNull StatusBarNotification sbn) {
            Intrinsics.checkNotNullParameter(sbn, "sbn");
            boolean z = (sbn.getNotification().getGroup() == null || (sbn.getNotification().flags & 512) == 0) ? false : true;
            if (TextUtils.equals(sbn.getTag(), "ranker_group")) {
                return true;
            }
            String key = sbn.getKey();
            Intrinsics.checkNotNullExpressionValue(key, "sbn.key");
            return StringsKt.contains$default(key, "ranker_group", false, 2, (Object) null) || z;
        }

        public final boolean m(@NotNull HealthNotificationBean sbn) {
            Intrinsics.checkNotNullParameter(sbn, "sbn");
            return Intrinsics.areEqual("com.android.systemui", sbn.getPackageName()) && Intrinsics.areEqual("ENVELOPE", sbn.getChannelId()) && StringsKt.contains$default(sbn.getTag(), "WeChatEnvelopeHandler", false, 2, (Object) null);
        }

        public final boolean n(StatusBarNotification sbn, StatusBarNotification lastSbn, CharSequence title, CharSequence content) {
            Notification notification = lastSbn.getNotification();
            Intrinsics.checkNotNullExpressionValue(notification, "lastSbn.notification");
            HealthNotificationBean.Companion companion = HealthNotificationBean.INSTANCE;
            String strF = companion.f(notification.extras, "android.title");
            String strF2 = companion.f(notification.extras, "android.text");
            NotificationHolder notificationHolder = NotificationHolder.INSTANCE;
            String packageName = lastSbn.getPackageName();
            Intrinsics.checkNotNullExpressionValue(packageName, "lastSbn.packageName");
            if (notificationHolder.f(packageName) && TextUtils.equals(lastSbn.getPackageName(), sbn.getPackageName()) && TextUtils.equals(lastSbn.getKey(), sbn.getKey()) && TextUtils.equals(strF, title) && TextUtils.equals(strF2, content) && sbn.getPostTime() - lastSbn.getPostTime() < 500) {
                m8b.f("NTF_Intercept", "redundant missed call, filter it");
                return true;
            }
            String str = Build.MANUFACTURER;
            Intrinsics.checkNotNullExpressionValue(str, "MANUFACTURER");
            if (!StringsKt.equals(StringsKt.trim(str).toString(), "HUAWEI", true) || !TextUtils.equals("未接来电", title) || !TextUtils.equals("未接来电", content)) {
                return false;
            }
            m8b.f("NTF_Intercept", "DAISY redundant missed call, filter it");
            return true;
        }

        public final boolean o(StatusBarNotification sbn, StatusBarNotification lastSbn) {
            if (p(sbn)) {
                return true;
            }
            HealthNotificationBean.Companion companion = HealthNotificationBean.INSTANCE;
            if (!n(sbn, lastSbn, companion.f(sbn.getNotification().extras, "android.title"), companion.f(sbn.getNotification().extras, "android.text"))) {
                return false;
            }
            m8b.m("NTF_Intercept", "[isSpecialApp] isRedundantMissedCall filter.and refuse");
            return true;
        }

        public final boolean p(@NotNull StatusBarNotification sbn) {
            Intrinsics.checkNotNullParameter(sbn, "sbn");
            if (Intrinsics.areEqual("org.thunderdog.challegram", sbn.getPackageName()) && sbn.getId() == 2) {
                m8b.m("NTF_Intercept", "[isSpecialApp] challegram special case,and return.");
                return true;
            }
            if (Intrinsics.areEqual("com.skype.rover", sbn.getPackageName()) && 513 == sbn.getNotification().flags) {
                m8b.m("NTF_Intercept", "[isSpecialApp] skype special case,and return.");
                return true;
            }
            if (Intrinsics.areEqual("com.whatsapp", sbn.getPackageName()) && TextUtils.isEmpty(sbn.getTag())) {
                m8b.m("NTF_Intercept", "[isSpecialApp] whatapp special case,and return.");
                return true;
            }
            if (Intrinsics.areEqual("kik.android", sbn.getPackageName()) && sbn.getId() == 0) {
                m8b.m("NTF_Intercept", "[isSpecialApp] kiKi special case,and return.");
                return true;
            }
            if (Intrinsics.areEqual("com.google.android.gm", sbn.getPackageName()) && sbn.getId() == 0) {
                m8b.m("NTF_Intercept", "[isSpecialApp] Gmail special case,and return.");
                return true;
            }
            if (Intrinsics.areEqual("jp.naver.line.android", sbn.getPackageName()) && !Intrinsics.areEqual("NOTIFICATION_TAG_MESSAGE", sbn.getTag())) {
                m8b.m("NTF_Intercept", "[isSpecialApp] Line special case,and return.");
                return true;
            }
            if ((Intrinsics.areEqual("com.beeplabs.beechat", sbn.getPackageName()) || Intrinsics.areEqual("com.beeplabs.beechat2", sbn.getPackageName())) && sbn.getId() == 1) {
                m8b.m("NTF_Intercept", "[isSpecialApp] BeeChat special case,and return.");
                return true;
            }
            if (Intrinsics.areEqual(sbn.getPackageName(), e88.a().getPackageName()) && sbn.getId() == NotificationConfig.INSTANCE.d().c()[0].intValue()) {
                m8b.m("NTF_Intercept", "[isSpecialApp] intercept notice return");
                return true;
            }
            HealthNotificationBean.Companion companion = HealthNotificationBean.INSTANCE;
            String strF = companion.f(sbn.getNotification().extras, "android.title");
            String strF2 = companion.f(sbn.getNotification().extras, "android.text");
            if (TextUtils.isEmpty(strF) && TextUtils.isEmpty(strF2)) {
                m8b.m("NTF_Intercept", "[isSpecialApp] title&content is  null");
                return true;
            }
            NotificationHolder notificationHolder = NotificationHolder.INSTANCE;
            String packageName = sbn.getPackageName();
            Intrinsics.checkNotNullExpressionValue(packageName, "sbn.packageName");
            if (notificationHolder.i(packageName) && TextUtils.isEmpty(strF2)) {
                m8b.m("NTF_Intercept", "[isSpecialApp] MMS special case,and return.");
                return true;
            }
            if (d(sbn)) {
                m8b.m("NTF_Intercept", "[isSpecialApp] ,GroupSummary ignore");
                return true;
            }
            if (i(sbn)) {
                m8b.m("NTF_Intercept", "[isSpecialApp] oppo TT download  refuse");
                return true;
            }
            if (!g(sbn)) {
                return false;
            }
            m8b.m("NTF_Intercept", "[isSpecialApp] channel need filter.and refuse");
            return true;
        }

        public final boolean q(@NotNull HealthNotificationBean sbn) {
            Intrinsics.checkNotNullParameter(sbn, "sbn");
            return Intrinsics.areEqual(sbn.getPackageName(), "com.oasisfeng.nevo") || Intrinsics.areEqual(sbn.getPackageName(), "com.wintheshow.quickreply") || Intrinsics.areEqual(sbn.getPackageName(), "com.vincentw.notificationplugin") || Intrinsics.areEqual(sbn.getPackageName(), y51.PKG_WECHAT);
        }
    }

    public y51() {
        String str = null;
        HealthNotificationBean healthNotificationBean = new HealthNotificationBean(0, 0, 0, 0, 0, 0L, 0L, null, null, null, null, null, str, str, null, null, null, null, null, null, null, false, false, false, false, false, false, 0, null, null, null, null, null, -1, 1, null);
        NotificationCompat.Builder contentText = new NotificationCompat.Builder(e88.a()).setContentTitle("demo").setContentText("demo");
        Intrinsics.checkNotNullExpressionValue(contentText, "Builder(GlobalApplicatio…  .setContentText(\"demo\")");
        Notification notificationBuild = contentText.build();
        Intrinsics.checkNotNullExpressionValue(notificationBuild, "notificationBuilder.build()");
        healthNotificationBean.setOrigin(new StatusBarNotification("com.heytap.health.push", "com.heytap.health.push", 1, "push_tag", Process.myUid(), 0, 0, notificationBuild, Process.myUserHandle(), System.currentTimeMillis()));
        this.lastSbn = healthNotificationBean;
    }

    public static final void f(y51 y51Var, Integer num) {
        Intrinsics.checkNotNullParameter(y51Var, "this$0");
        if (num != null && num.intValue() == 1) {
            y51Var.b();
        }
    }

    public final void b() {
        fdg.x(INotificationApiService.SP_NAME).W(INotificationApiService.HAS_SEND_INTERCEPT, true);
        d();
        g();
        hyc.INSTANCE.d(true);
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00dc  */
    public final boolean c(@NotNull HealthNotificationBean sbn, boolean fromReceive) {
        boolean z;
        boolean zE;
        Intrinsics.checkNotNullParameter(sbn, "sbn");
        UserDeviceInfo userDeviceInfoI = wl4.managerApi.i(mb5.a.INSTANCE);
        if (!fromReceive) {
            if (userDeviceInfoI == null || !userDeviceInfoI.isConnect()) {
                hyc.INSTANCE.b().add(sbn.getKey());
                m8b.f("NTF_Intercept", "intercept: device not connect, run cloud push, " + sbn.getKey());
                CloudPushManager.INSTANCE.k(sbn);
                zE = false;
            } else {
                NotificationHolder notificationHolder = NotificationHolder.INSTANCE;
                String mac = userDeviceInfoI.getMac();
                Intrinsics.checkNotNullExpressionValue(mac, "activeDevice.mac");
                zE = notificationHolder.e(mac);
                if (zE) {
                    m8b.f("NTF_Intercept", "intercept: nodeFamilyStatus=true");
                }
            }
            if (zE | (userDeviceInfoI == null || !userDeviceInfoI.isConnect())) {
                return true;
            }
        }
        if (Intrinsics.areEqual(sbn.getPackageName(), PKG_WECHAT) && hyc.INSTANCE.c() == 1) {
            m8b.f("NTF_Intercept", "intercept: isWeChatLogin=true");
            return true;
        }
        hyc.Companion companion = hyc.INSTANCE;
        boolean z2 = companion.c() == 2 || companion.c() == 3;
        if (Intrinsics.areEqual(sbn.getPackageName(), PKG_WECHAT) && z2) {
            if ((sbn.getOrigin() instanceof StatusBarNotification) && (this.lastSbn.getOrigin() instanceof StatusBarNotification)) {
                Companion companion2 = INSTANCE;
                Object origin = sbn.getOrigin();
                Intrinsics.checkNotNull(origin, "null cannot be cast to non-null type android.service.notification.StatusBarNotification");
                Object origin2 = this.lastSbn.getOrigin();
                Intrinsics.checkNotNull(origin2, "null cannot be cast to non-null type android.service.notification.StatusBarNotification");
                if (companion2.c((StatusBarNotification) origin, (StatusBarNotification) origin2)) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            if (!z) {
                return false;
            }
        }
        a aVar = a.INSTANCE;
        boolean zK = aVar.k("main_switch");
        m8b.f("NTF_Intercept", "intercept: mainSwitch=" + zK);
        if (!zK) {
            return true;
        }
        boolean zK2 = aVar.k("screen_on_push");
        ezc ezcVar = ezc.INSTANCE;
        Context contextA = e88.a();
        Intrinsics.checkNotNullExpressionValue(contextA, "getAppContext()");
        boolean zB = ezcVar.b(contextA);
        m8b.f("NTF_Intercept", "intercept: screenOnSwitch=" + zK2 + ", screenOffOrLocked=" + zB);
        if (!zB) {
            uwc.b bVar = this.ability;
            if (bVar != null && bVar.T8()) {
                if (!NotificationHolder.INSTANCE.f(sbn.getPackageName())) {
                    return true;
                }
            } else if (!zK2) {
                e();
                return true;
            }
        }
        uwc.b bVar2 = this.ability;
        if ((bVar2 != null && bVar2.w5()) && !aVar.k("wrist_off_push")) {
            NotificationModule notificationModule = NotificationModule.INSTANCE;
            if (notificationModule.z() != 1) {
                m8b.f("NTF_Intercept", "intercept: wearStatus=" + notificationModule.z());
                return true;
            }
        }
        if (!Intrinsics.areEqual(userDeviceInfoI != null ? userDeviceInfoI.getModel() : null, DeviceConstants.Companion.I()) && this.lastSbn.repeat(sbn)) {
            m8b.f("NTF_Intercept", "intercept: repeat with last sbn");
            return true;
        }
        if ((sbn.getOrigin() instanceof StatusBarNotification) && (this.lastSbn.getOrigin() instanceof StatusBarNotification)) {
            Companion companion3 = INSTANCE;
            Object origin3 = sbn.getOrigin();
            Intrinsics.checkNotNull(origin3, "null cannot be cast to non-null type android.service.notification.StatusBarNotification");
            Object origin4 = this.lastSbn.getOrigin();
            Intrinsics.checkNotNull(origin4, "null cannot be cast to non-null type android.service.notification.StatusBarNotification");
            if (companion3.c((StatusBarNotification) origin3, (StatusBarNotification) origin4)) {
                return true;
            }
        }
        uwc.b bVar3 = this.ability;
        if ((bVar3 != null && bVar3.c5()) && INSTANCE.e(sbn)) {
            m8b.f("NTF_Intercept", "intercept:  watch bt mode,  ignore miss call");
            return true;
        }
        if (INSTANCE.m(sbn)) {
            uwc.b bVar4 = this.ability;
            if (bVar4 != null && bVar4.v5()) {
                m8b.f("NTF_Intercept", "intercept: rx watch ignore redPackage");
                return true;
            }
            this.lastSbn = sbn;
            return false;
        }
        NotificationModule notificationModule2 = NotificationModule.INSTANCE;
        if (notificationModule2.E() && !fromReceive) {
            uwc.b bVar5 = this.ability;
            if ((bVar5 != null && bVar5.p4()) && (sbn.getOrigin() instanceof StatusBarNotification)) {
                Object origin5 = sbn.getOrigin();
                Intrinsics.checkNotNull(origin5, "null cannot be cast to non-null type android.service.notification.StatusBarNotification");
                StatusBarNotification statusBarNotification = (StatusBarNotification) origin5;
                if (statusBarNotification.getNotification().extras.getBoolean("isVerificationCode", false)) {
                    m8b.f("NTF_Intercept", "intercept: support verify, ignore, wait for broadcast");
                    this.lastSbn = sbn;
                    notificationModule2.m(statusBarNotification);
                    return true;
                }
            }
        }
        boolean zK3 = aVar.k(sbn.getPackageName());
        m8b.f("NTF_Intercept", "intercept: packageSwitch=" + zK3);
        if (!zK3) {
            return true;
        }
        this.lastSbn = sbn;
        return false;
    }

    public final void d() {
        Context contextA = e88.a();
        NotificationManager notificationManager = (NotificationManager) contextA.getSystemService(NotificationManager.class);
        NotificationConfig notificationConfig = NotificationConfig.INSTANCE;
        String strA = notificationConfig.d().a();
        String strB = notificationConfig.d().b();
        NotificationChannel notificationChannel = new NotificationChannel(strA, strB, 3);
        notificationChannel.enableLights(true);
        notificationChannel.setLightColor(-65536);
        notificationChannel.setShowBadge(true);
        notificationChannel.setLockscreenVisibility(1);
        notificationChannel.setDescription(strB);
        notificationChannel.setBypassDnd(true);
        notificationManager.createNotificationChannel(notificationChannel);
        String string = contextA.getString(R$string.notification_intercept_tips_content_phone);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(com.he…rcept_tips_content_phone)");
        NotificationCompat.Builder builder = new NotificationCompat.Builder(contextA, strA);
        builder.setSmallIcon(R.mipmap.lib_base_ic_launcher).setContentTitle(contextA.getString(R$string.notification_intercept_tips_title)).setContentText(string).setStyle(new NotificationCompat.BigTextStyle().bigText(string)).setAutoCancel(true);
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(contextA, "com.heytap.health.main.MainActivity"));
        intent.putExtra("jump_action", "screen_on_push");
        Notification notificationBuild = builder.setPriority(1).setCategory("alarm").setContentIntent(PendingIntent.getActivity(contextA, 0, intent, Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728)).build();
        Intrinsics.checkNotNullExpressionValue(notificationBuild, "builder.setPriority(Noti…nt(pendingIntent).build()");
        notificationManager.notify(notificationConfig.d().c()[0].intValue(), notificationBuild);
    }

    public final void e() {
        hyc.Companion companion = hyc.INSTANCE;
        if (companion.a()) {
            return;
        }
        boolean z = false;
        if (fdg.x(INotificationApiService.SP_NAME).r(INotificationApiService.HAS_SEND_INTERCEPT, false)) {
            companion.d(true);
            return;
        }
        OobeStatusBean oobeStatusBean = (OobeStatusBean) wl4.deviceMultiple.a.k(wl4.managerApi.n()).getValue();
        if (oobeStatusBean != null && oobeStatusBean.isOobeFinish()) {
            z = true;
        }
        if (z) {
            if (a.INSTANCE.k("wrist_off_push")) {
                b();
                return;
            }
            Object objNavigation = e1.d().b("/device_data_sync/data_sync/DeviceWearStatusService").navigation();
            Intrinsics.checkNotNull(objNavigation, "null cannot be cast to non-null type com.heytap.health.device_data_sync.data_sync.IDeviceWearStatusService");
            ((IDeviceWearStatusService) objNavigation).X6(new ln3() { // from class: com.oplus.aiunit.vision.x51
                public final void onResult(Object obj) {
                    y51.f(this.a, (Integer) obj);
                }
            }, true);
        }
    }

    public final void g() {
        Context contextA = e88.a();
        String packageName = contextA.getPackageName();
        NotificationCompat.Builder contentText = new NotificationCompat.Builder(e88.a()).setSmallIcon(R.mipmap.lib_base_ic_launcher).setContentTitle(contextA.getString(R$string.notification_intercept_tips_title)).setContentText(contextA.getString(R$string.notification_intercept_tips_content_watch));
        Intrinsics.checkNotNullExpressionValue(contentText, "Builder(GlobalApplicatio…cept_tips_content_watch))");
        Notification notificationBuild = contentText.build();
        Intrinsics.checkNotNullExpressionValue(notificationBuild, "notificationBuilder.build()");
        HealthNotificationBean healthNotificationBeanC = HealthNotificationBean.Companion.c(HealthNotificationBean.INSTANCE, new StatusBarNotification(packageName, packageName, NotificationConfig.INSTANCE.d().c()[0].intValue(), "", Process.myUid(), 0, 0, notificationBuild, Process.myUserHandle(), System.currentTimeMillis()), null, 2, null);
        healthNotificationBeanC.setAppName(healthNotificationBeanC.getTitle());
        yxc.INSTANCE.b(healthNotificationBeanC);
    }

    public final void h(@NotNull Node node) {
        Intrinsics.checkNotNullParameter(node, "node");
        this.ability = wwc.a(node.getNodeId());
    }
}
