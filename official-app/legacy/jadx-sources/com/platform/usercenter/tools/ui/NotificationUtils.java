package com.platform.usercenter.tools.ui;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.media.AudioAttributes;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.RequiresPermission;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import com.heytap.sports.service.BgConnect;
import com.oplus.wrapper.app.StatusBarManager;
import com.platform.usercenter.tools.UCBasicUtils;
import com.platform.usercenter.tools.log.UCLogUtil;
import com.platform.usercenter.tools.osdk.CompatUtils;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes9.dex */
public class NotificationUtils {
    public static final int IMPORTANCE_DEFAULT = 3;
    public static final int IMPORTANCE_HIGH = 4;
    public static final int IMPORTANCE_LOW = 2;
    public static final int IMPORTANCE_MIN = 1;
    public static final int IMPORTANCE_NONE = 0;
    public static final int IMPORTANCE_UNSPECIFIED = -1000;
    private static final String TAG = "NotificationUtils";

    public static class ChannelConfig {
        private NotificationChannel mNotificationChannel;

        public ChannelConfig(String str, CharSequence charSequence, int i) {
            this.mNotificationChannel = new NotificationChannel(str, charSequence, i);
        }

        public NotificationChannel getNotificationChannel() {
            return this.mNotificationChannel;
        }

        public ChannelConfig setBypassDnd(boolean z) {
            this.mNotificationChannel.setBypassDnd(z);
            return this;
        }

        public ChannelConfig setDescription(String str) {
            this.mNotificationChannel.setDescription(str);
            return this;
        }

        public ChannelConfig setGroup(String str) {
            this.mNotificationChannel.setGroup(str);
            return this;
        }

        public ChannelConfig setImportance(int i) {
            this.mNotificationChannel.setImportance(i);
            return this;
        }

        public ChannelConfig setLightColor(int i) {
            this.mNotificationChannel.setLightColor(i);
            return this;
        }

        public ChannelConfig setLockscreenVisibility(int i) {
            this.mNotificationChannel.setLockscreenVisibility(i);
            return this;
        }

        public ChannelConfig setName(CharSequence charSequence) {
            this.mNotificationChannel.setName(charSequence);
            return this;
        }

        public ChannelConfig setShowBadge(boolean z) {
            this.mNotificationChannel.setShowBadge(z);
            return this;
        }

        public ChannelConfig setSound(Uri uri, AudioAttributes audioAttributes) {
            this.mNotificationChannel.setSound(uri, audioAttributes);
            return this;
        }

        public ChannelConfig setVibrationPattern(long[] jArr) {
            this.mNotificationChannel.setVibrationPattern(jArr);
            return this;
        }
    }

    public interface Consumer<T> {
        void accept(T t);
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Importance {
    }

    public static boolean areNotificationsEnabled(Context context) {
        return NotificationManagerCompat.from(context).areNotificationsEnabled();
    }

    public static void cancel(String str, int i) {
        NotificationManagerCompat.from(UCBasicUtils.sContext).cancel(str, i);
    }

    public static void cancelAll(Context context) {
        NotificationManagerCompat.from(context).cancelAll();
    }

    private static void invokePanels(String str) {
        Object systemService = UCBasicUtils.sContext.getApplicationContext().getSystemService("statusbar");
        if (CompatUtils.check(30, 1)) {
            try {
                StatusBarManager statusBarManager = new StatusBarManager((android.app.StatusBarManager) systemService);
                if (TextUtils.equals(str, "expandNotificationsPanel")) {
                    statusBarManager.expandNotificationsPanel();
                    return;
                } else if (TextUtils.equals(str, "collapsePanels")) {
                    statusBarManager.collapsePanels();
                    return;
                }
            } catch (Throwable th) {
                UCLogUtil.e(UCBasicUtils.SDK_TAG, TAG + "addon：" + th);
            }
        }
        try {
            Class.forName("android.app.StatusBarManager").getMethod(str, new Class[0]).invoke(systemService, new Object[0]);
        } catch (Exception e2) {
            UCLogUtil.e(UCBasicUtils.SDK_TAG, TAG + e2);
        }
    }

    public static void notify(int i, Consumer<NotificationCompat.Builder> consumer) {
        notify(null, i, new ChannelConfig(UCBasicUtils.sContext.getPackageName(), UCBasicUtils.sContext.getPackageName(), 3), consumer);
    }

    @RequiresPermission("android.permission.EXPAND_STATUS_BAR")
    public static void setNotificationBarVisibility(boolean z) {
        invokePanels(z ? "expandNotificationsPanel" : "collapsePanels");
    }

    public static void cancel(int i) {
        NotificationManagerCompat.from(UCBasicUtils.sContext).cancel(i);
    }

    public static void notify(String str, int i, Consumer<NotificationCompat.Builder> consumer) {
        notify(str, i, new ChannelConfig(UCBasicUtils.sContext.getPackageName(), UCBasicUtils.sContext.getPackageName(), 3), consumer);
    }

    public static void notify(int i, ChannelConfig channelConfig, Consumer<NotificationCompat.Builder> consumer) {
        notify(null, i, channelConfig, consumer);
    }

    public static void notify(String str, int i, ChannelConfig channelConfig, Consumer<NotificationCompat.Builder> consumer) {
        ((NotificationManager) UCBasicUtils.sContext.getApplicationContext().getSystemService(BgConnect.KEY_NOTIFICATION)).createNotificationChannel(channelConfig.getNotificationChannel());
        NotificationManagerCompat notificationManagerCompatFrom = NotificationManagerCompat.from(UCBasicUtils.sContext);
        NotificationCompat.Builder builder = new NotificationCompat.Builder(UCBasicUtils.sContext);
        builder.setChannelId(channelConfig.mNotificationChannel.getId());
        consumer.accept(builder);
        notificationManagerCompatFrom.notify(str, i, builder.build());
    }
}
