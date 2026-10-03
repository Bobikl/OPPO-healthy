package com.oplus.aiunit.vision;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.internal.view.SupportMenu;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.heytap.health.base.R$mipmap;
import com.heytap.health.cervical_vertebra.R$string;
import com.heytap.sports.service.BgConnect;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/oplus/aiunit/vision/a63;", "", "Companion", "a", "cervical_vertebra_release"}, k = 1, mv = {1, 8, 0})
public final class a63 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.a63$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0006\u0010\u0003\u001a\u00020\u0002J\u001e\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007J\b\u0010\f\u001a\u00020\u000bH\u0002R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/oplus/aiunit/vision/a63$a;", "", "", "a", "", "title", "content", "Landroid/app/PendingIntent;", BaseGmsClient.KEY_PENDING_INTENT, "", "c", "Landroidx/core/app/NotificationCompat$Builder;", "b", "CERVICAL_VERTEBRAE_CHANNEL_ID", "Ljava/lang/String;", "", "CERVICAL_VERTEBRAE_NOTIFICATION_ID", "I", "<init>", "()V", "cervical_vertebra_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a() {
            NotificationManagerCompat notificationManagerCompatFrom = NotificationManagerCompat.from(b78.a());
            Intrinsics.checkNotNullExpressionValue(notificationManagerCompatFrom, "from(GlobalApplicationHolder.getAppContext())");
            if (!notificationManagerCompatFrom.areNotificationsEnabled()) {
                return false;
            }
            NotificationChannel notificationChannel = notificationManagerCompatFrom.getNotificationChannel("CervicalVertebraeChannel");
            if (notificationChannel == null) {
                NotificationChannel notificationChannel2 = new NotificationChannel("CervicalVertebraeChannel", b78.a().getString(R$string.cervical_vertebra_notification_channel_name1), 3);
                notificationChannel2.enableLights(false);
                notificationChannel2.setLightColor(SupportMenu.CATEGORY_MASK);
                notificationChannel2.setShowBadge(false);
                notificationChannel2.enableVibration(false);
                notificationChannel2.setVibrationPattern(new long[]{0});
                notificationChannel2.setSound(null, null);
                notificationChannel2.setLockscreenVisibility(1);
                notificationManagerCompatFrom.createNotificationChannel(notificationChannel2);
            } else if (notificationChannel.getImportance() < 2) {
                return false;
            }
            return true;
        }

        public final NotificationCompat.Builder b() {
            Context contextA = b78.a();
            Object systemService = contextA.getSystemService(BgConnect.KEY_NOTIFICATION);
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            NotificationManager notificationManager = (NotificationManager) systemService;
            if (notificationManager.getNotificationChannel("CervicalVertebraeChannel") == null) {
                NotificationChannel notificationChannel = new NotificationChannel("CervicalVertebraeChannel", b78.a().getString(R$string.cervical_vertebra_notification_channel_name1), 3);
                notificationChannel.enableLights(false);
                notificationChannel.setLightColor(SupportMenu.CATEGORY_MASK);
                notificationChannel.setShowBadge(false);
                notificationChannel.enableVibration(false);
                notificationChannel.setVibrationPattern(new long[]{0});
                notificationChannel.setSound(null, null);
                notificationChannel.setLockscreenVisibility(1);
                notificationManager.createNotificationChannel(notificationChannel);
            }
            NotificationCompat.Builder priority = new NotificationCompat.Builder(contextA, "CervicalVertebraeChannel").setAutoCancel(true).setDefaults(2).setSmallIcon(R$mipmap.lib_base_ic_launcher).setPriority(0);
            Intrinsics.checkNotNullExpressionValue(priority, "Builder(context, CERVICA…nCompat.PRIORITY_DEFAULT)");
            return priority;
        }

        public final void c(@NotNull String title, @NotNull String content, @NotNull PendingIntent pendingIntent) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(content, "content");
            Intrinsics.checkNotNullParameter(pendingIntent, "pendingIntent");
            Notification notificationBuild = b().setContentTitle(title).setContentText(content).setContentIntent(pendingIntent).build();
            Intrinsics.checkNotNullExpressionValue(notificationBuild, "builder.setContentTitle(…                 .build()");
            Object systemService = b78.a().getSystemService(BgConnect.KEY_NOTIFICATION);
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            ((NotificationManager) systemService).notify(10111, notificationBuild);
        }
    }
}
