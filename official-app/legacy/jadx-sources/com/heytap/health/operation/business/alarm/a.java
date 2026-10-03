package com.heytap.health.operation.business.alarm;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import androidx.core.internal.view.SupportMenu;
import androidx.core.os.BuildCompat;
import com.google.gson.annotations.SerializedName;
import com.heytap.health.base.R$mipmap;
import com.heytap.health.base.R$string;
import com.heytap.sports.service.BgConnect;
import com.oplus.aiunit.vision.b78;
import com.oplus.aiunit.vision.ilj;
import com.oplus.aiunit.vision.rg7;
import com.oplus.aiunit.vision.yha;
import com.oplus.aiunit.vision.ys;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes17.dex */
public abstract class a implements Runnable {

    @SerializedName("name")
    public String name;

    @SerializedName("open")
    public boolean open;
    private transient List<a> others;

    @SerializedName("timing")
    public String timing;

    @SerializedName("type")
    public String type;

    public a() {
        this.others = new ArrayList();
        this.name = getClass().getName();
    }

    private PendingIntent buildPendingIntent(int i) {
        Intent intent = new Intent(b78.a(), (Class<?>) RemindAlarmManager.AlarmeReceiver.class);
        intent.putExtra(RemindAlarmManager.ALARM_REFS_KEY, refKey());
        intent.setPackage(b78.a().getPackageName());
        intent.setAction("com.heytap.health.operation.action_remind_notification_receiver");
        return PendingIntent.getBroadcast(b78.a(), 1001, intent, i);
    }

    public void changeTime(String str) {
        if (Objects.equals(this.timing, str)) {
            yha.a("changeTime  >> start alarm time same", str);
        } else {
            this.timing = str;
            yha.a("changeTime  >> start alarm time changed");
        }
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof ys) && this.timing.compareTo(((a) obj).timing()) == 0;
    }

    public String getName() {
        return this.name;
    }

    public PendingIntent getPendingIntent() {
        return buildPendingIntent(BuildCompat.isAtLeastS() ? 167772160 : 134217728);
    }

    public long getTime() {
        yha.a("alarmStr2Time", this.timing);
        try {
            String[] strArrSplit = this.timing.split(":");
            Calendar calendar = Calendar.getInstance();
            long jCurrentTimeMillis = System.currentTimeMillis();
            calendar.setTimeInMillis(jCurrentTimeMillis);
            if (strArrSplit.length != 2) {
                return 0L;
            }
            String str = strArrSplit[0];
            if (TextUtils.isDigitsOnly(str)) {
                calendar.set(11, Integer.parseInt(str));
            }
            String str2 = strArrSplit[1];
            if (TextUtils.isDigitsOnly(str2)) {
                calendar.set(12, Integer.parseInt(str2));
            }
            calendar.set(13, 0);
            if (calendar.getTimeInMillis() < jCurrentTimeMillis) {
                yha.a("AlarmRemind：remind set time tomorrow ");
                calendar.add(6, 1);
            }
            return calendar.getTimeInMillis();
        } catch (Exception e2) {
            yha.j(e2);
            return 0L;
        }
    }

    public String getTiming() {
        return Objects.toString(this.timing, "");
    }

    public String getType() {
        return this.type;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isOpen() {
        return this.open;
    }

    public void keepOther(a aVar) {
        this.others.add(aVar);
    }

    public final void nofity(PendingIntent pendingIntent, Object obj, Object... objArr) {
        nofity(rg7.e(R$string.lib_base_share_title_health), pendingIntent, obj, objArr);
    }

    public abstract String refKey();

    public void resetOther() {
        this.others.clear();
    }

    public void restore() {
    }

    public abstract void ringing();

    @Override // java.lang.Runnable
    public final void run() {
        yha.c(" 收到闹钟了，弹出通知 同时 更新 interval 重新设置下一个闹钟 ", this);
        ringing();
        if (this.others.isEmpty()) {
            return;
        }
        for (int i = 0; i < this.others.size(); i++) {
            this.others.get(i).ringing();
        }
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setOpen(boolean z) {
        this.open = z;
    }

    public void setTiming(String str) {
        this.timing = str;
    }

    public void setType(String str) {
        this.type = str;
    }

    public final String timing() {
        return this.timing;
    }

    public String toString() {
        return "AlarmRemind{timing='" + this.timing + "', open=" + this.open + ", type='" + this.type + "'}";
    }

    public final void nofity(Object obj, PendingIntent pendingIntent, Object obj2, Object... objArr) {
        String string;
        if (obj2 instanceof Integer) {
            string = objArr != null ? rg7.f(((Integer) obj2).intValue(), objArr) : rg7.e(((Integer) obj2).intValue());
        } else {
            string = obj2.toString();
        }
        yha.a("remind notify > ", string);
        Context contextA = b78.a();
        String string2 = obj.toString();
        if (obj instanceof Integer) {
            string2 = rg7.e(((Integer) obj).intValue());
        }
        if (!ilj.b()) {
            yha.a("remind notify > checkPostNotificationPermission 没有通知权限 >> ");
            return;
        }
        NotificationManager notificationManager = (NotificationManager) contextA.getSystemService(BgConnect.KEY_NOTIFICATION);
        NotificationChannel notificationChannel = new NotificationChannel(RemindAlarmManager.CHANNEL_ONE_ID, b78.a().getResources().getString(com.heytap.health.operation.R$string.operation_notify_remind), 4);
        notificationChannel.enableLights(false);
        notificationChannel.setLightColor(SupportMenu.CATEGORY_MASK);
        notificationChannel.setShowBadge(false);
        notificationChannel.enableVibration(false);
        notificationChannel.setVibrationPattern(new long[]{0});
        notificationChannel.setSound(null, null);
        notificationChannel.setLockscreenVisibility(1);
        if (notificationManager != null) {
            notificationManager.createNotificationChannel(notificationChannel);
        }
        NotificationCompat.Builder builder = new NotificationCompat.Builder(contextA, RemindAlarmManager.CHANNEL_ONE_ID);
        builder.setAutoCancel(true).setContentTitle(string2).setDefaults(2).setSmallIcon(R$mipmap.lib_base_ic_launcher).setContentText(string).setPriority(1).setContentIntent(pendingIntent);
        if (notificationManager != null) {
            notificationManager.notify(R$string.lib_base_share_title_health, builder.build());
        }
    }

    public a(String str, boolean z) {
        this();
        this.timing = str;
        this.open = z;
    }
}
