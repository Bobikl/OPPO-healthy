package com.oplus.aiunit.vision;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import androidx.core.internal.view.SupportMenu;
import com.heytap.health.base.R$mipmap;
import com.heytap.health.base.notification.NotificationConfig;
import com.heytap.health.sleep.R$id;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.Pair;
import p010kotlin.jvm.JvmField;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ*\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\b\u001a\u00020\u0007J2\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\b\u001a\u00020\u0007J\"\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005J:\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002R\u0014\u0010\u0013\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0015R\u0016\u0010\u0017\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0015R\u0016\u0010\u0019\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0015¨\u0006\u001c"}, d2 = {"Lcom/oplus/aiunit/vision/lyc;", "", "", "titleStr", "contentStr", "Ljava/lang/Class;", "gotoCls", "", "ongoing", "", "d", "", "notifyId", "c", "Landroid/app/Notification;", "a", "Lkotlin/Pair;", "Landroid/app/NotificationManager;", "b", "TAG", "Ljava/lang/String;", "I", "SLEEP_NOTIFY_ID_DEFAULT", "SLEEP_NOTIFY_ID_FOREGROUND", "SLEEP_AUDIO_NOTIFY_ID_FOREGROUND", "SLEEP_AUDIO_NOTIFY_ID_AUTOMATIC", "<init>", "()V", "sleep_release"}, k = 1, mv = {1, 8, 0})
public final class lyc {

    @NotNull
    public static final String TAG = "NotificationUtils";

    @NotNull
    public static final lyc INSTANCE = new lyc();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final int SLEEP_NOTIFY_ID_DEFAULT = R$id.health_sleep_notify_id_default;

    @JvmField
    public static int SLEEP_NOTIFY_ID_FOREGROUND = R$id.health_sleep_notify_id_foreground;

    @JvmField
    public static int SLEEP_AUDIO_NOTIFY_ID_FOREGROUND = R$id.health_sleep_audio_notify_id_foreground;

    @JvmField
    public static int SLEEP_AUDIO_NOTIFY_ID_AUTOMATIC = R$id.health_sleep_audio_notify_id_automatic;
    public static final int $stable = 8;

    @NotNull
    public final Notification a(@NotNull String titleStr, @NotNull String contentStr, @NotNull Class<?> gotoCls) {
        Intrinsics.checkNotNullParameter(titleStr, "titleStr");
        Intrinsics.checkNotNullParameter(contentStr, "contentStr");
        Intrinsics.checkNotNullParameter(gotoCls, "gotoCls");
        return b(titleStr, contentStr, gotoCls, true).getFirst();
    }

    public final Pair<Notification, NotificationManager> b(String titleStr, String contentStr, Class<?> gotoCls, boolean ongoing) {
        Context contextA = b78.a();
        int i = Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728;
        Intent intent = new Intent(contextA, gotoCls);
        intent.addFlags(335544320);
        PendingIntent activity = PendingIntent.getActivity(contextA, 10011, intent, i);
        NotificationConfig notificationConfig = NotificationConfig.INSTANCE;
        NotificationChannel notificationChannel = new NotificationChannel(notificationConfig.f().getChannelId(), notificationConfig.f().getChannelName(), 3);
        notificationChannel.enableLights(false);
        notificationChannel.setLightColor(SupportMenu.CATEGORY_MASK);
        notificationChannel.setShowBadge(true);
        notificationChannel.setSound(null, null);
        notificationChannel.enableVibration(false);
        notificationChannel.setLockscreenVisibility(1);
        NotificationManager notificationManager = (NotificationManager) contextA.getSystemService(NotificationManager.class);
        if (notificationManager != null) {
            notificationManager.createNotificationChannel(notificationChannel);
        }
        NotificationCompat.Builder autoCancel = new NotificationCompat.Builder(contextA, notificationConfig.f().getChannelId()).setSmallIcon(R$mipmap.lib_base_ic_launcher).setOngoing(ongoing).setContentTitle(titleStr).setContentText(contentStr).setContentIntent(activity).setPriority(0).setAutoCancel(true);
        Intrinsics.checkNotNullExpressionValue(autoCancel, "Builder(context, Notific…     .setAutoCancel(true)");
        Notification notificationBuild = autoCancel.build();
        Intrinsics.checkNotNullExpressionValue(notificationBuild, "builder.build()");
        return new Pair<>(notificationBuild, notificationManager);
    }

    public final void c(int notifyId, @NotNull String titleStr, @NotNull String contentStr, @NotNull Class<?> gotoCls, boolean ongoing) {
        Intrinsics.checkNotNullParameter(titleStr, "titleStr");
        Intrinsics.checkNotNullParameter(contentStr, "contentStr");
        Intrinsics.checkNotNullParameter(gotoCls, "gotoCls");
        Pair<Notification, NotificationManager> pairB = b(titleStr, contentStr, gotoCls, ongoing);
        Notification first = pairB.getFirst();
        NotificationManager second = pairB.getSecond();
        if (second != null) {
            second.notify(notifyId, first);
        }
    }

    public final void d(@NotNull String titleStr, @NotNull String contentStr, @NotNull Class<?> gotoCls, boolean ongoing) {
        Intrinsics.checkNotNullParameter(titleStr, "titleStr");
        Intrinsics.checkNotNullParameter(contentStr, "contentStr");
        Intrinsics.checkNotNullParameter(gotoCls, "gotoCls");
        c(SLEEP_NOTIFY_ID_DEFAULT, titleStr, contentStr, gotoCls, ongoing);
    }
}
