package com.oplus.aiunit.vision;

import android.app.NotificationChannel;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.IBinder;
import android.os.IInterface;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.os.BuildCompat;
import com.heytap.health.base.R$mipmap;
import com.heytap.health.hearing.R$string;
import com.heytap.health.hearing.ui.HearingSettingActivity;
import com.oplus.health.apiprovider.ClientManager;

/* JADX INFO: loaded from: classes16.dex */
public class jz8 {
    public static final String ACTION_AUDIO_PLAYBACK_STATE_CHANGED = "android.media.ACTION_AUDIO_PLAYBACK_STATE_CHANGED";
    public static final String CHANNEL_ID = "HearingRemindNotificationChannel";
    public static final String EXTRA_PLAYBACK_STATE = "android.media.EXTRA_PLAYBACK_STATE";
    public static final String EXTRA_PLAYBACK_STREAM_TYPE = "android.media.EXTRA_PLAYBACK_STREAM_TYPE";
    public final String a;
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f13090c;
    public final int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f13091e;
    public boolean f;

    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                a7b.f("HearingRemindManager", "Intent is null");
                return;
            }
            String action = intent.getAction();
            a7b.f("HearingRemindManager", "On receive broadcast, action=" + action);
            if ("android.media.VOLUME_CHANGED_ACTION".equals(action)) {
                jz8.this.r(context, intent);
            }
        }
    }

    public class b extends BroadcastReceiver {
        public b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                a7b.f("HearingRemindManager", "Intent is null");
                return;
            }
            String action = intent.getAction();
            a7b.f("HearingRemindManager", "On receive broadcast, action=" + action);
            if ("com.oplus.atlas.hearing_action".equals(action)) {
                a7b.f("HearingRemindManager", "On receive overrun broadcast");
                jz8.this.v(context);
            }
        }
    }

    public class c extends BroadcastReceiver {
        public c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                return;
            }
            int intExtra = intent.getIntExtra(jz8.EXTRA_PLAYBACK_STREAM_TYPE, -1);
            a7b.f("HearingRemindManager", "On receive system audio playback state changed, streamType=" + intExtra);
            if (intExtra == 3) {
                int intExtra2 = intent.getIntExtra(jz8.EXTRA_PLAYBACK_STATE, -1);
                a7b.f("HearingRemindManager", "On receive music play state changed, state=" + intExtra2);
                if (intExtra2 == 1) {
                    jz8.this.u(context);
                } else if (intExtra2 == 0) {
                    jz8.this.f();
                }
            }
        }
    }

    public static class d {
        public static final jz8 a = new jz8();
    }

    public static jz8 h() {
        a7b.f("HearingRemindManager", "Hearing remind manager init");
        boolean zG = zw8.g();
        boolean zF = zw8.f();
        boolean z = zG && zw8.h();
        zw8.a aVarD = zw8.d();
        boolean z2 = z && aVarD != null && aVarD.a;
        if (!zF && !z2) {
            a7b.f("HearingRemindManager", "Hearing remind enable: false, overrunRemind=false volumeLimit=false");
            return null;
        }
        jz8 jz8Var = d.a;
        if (z2) {
            jz8Var.l();
        }
        return jz8Var;
    }

    public static void j() {
        ClientManager.getInstance().getBuildService("HearingService", new ClientManager.a() { // from class: com.oplus.aiunit.vision.iz8
            @Override // com.oplus.health.apiprovider.ClientManager.a
            public final Object a(IBinder iBinder) {
                return jz8.q(iBinder);
            }
        });
    }

    public static /* synthetic */ IInterface q(IBinder iBinder) {
        return null;
    }

    public final void f() {
        NotificationManagerCompat.from(b78.a()).cancel(802);
    }

    public final PendingIntent g(Context context) {
        Intent intent = new Intent(this.f13091e, (Class<?>) HearingSettingActivity.class);
        intent.addFlags(268435456);
        return PendingIntent.getActivity(context, 1234, intent, BuildCompat.isAtLeastS() ? 167772160 : 134217728);
    }

    public final void i() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(ACTION_AUDIO_PLAYBACK_STATE_CHANGED);
        rdf.a(b78.a(), new c(), intentFilter, 2);
    }

    public final void k() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.media.VOLUME_CHANGED_ACTION");
        rdf.a(this.f13091e, new a(), intentFilter, 2);
    }

    public final void l() {
        if (this.f) {
            return;
        }
        this.f = true;
        k();
        i();
    }

    public final void m() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.oplus.atlas.hearing_action");
        intentFilter.addDataScheme("msg");
        intentFilter.addDataSchemeSpecificPart("com.oplus.atlas.exposure_abnormal", 0);
        rdf.a(this.f13091e, new b(), intentFilter, 2);
    }

    public final boolean n() {
        AudioManager audioManager = (AudioManager) b78.a().getSystemService("audio");
        return audioManager.isBluetoothA2dpOn() || audioManager.isWiredHeadsetOn();
    }

    public final boolean o() {
        NotificationManagerCompat notificationManagerCompatFrom = NotificationManagerCompat.from(b78.a());
        if (!notificationManagerCompatFrom.areNotificationsEnabled()) {
            return false;
        }
        NotificationChannel notificationChannel = notificationManagerCompatFrom.getNotificationChannel(CHANNEL_ID);
        return notificationChannel == null || notificationChannel.getImportance() == 4;
    }

    public final boolean p(int i) {
        String strX = x(i);
        if (strX == null) {
            return false;
        }
        return System.currentTimeMillis() - v9g.w().B(strX, 0L) < 86400000;
    }

    public final void r(Context context, Intent intent) {
        if (intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_TYPE", -1) != 3) {
            return;
        }
        a7b.f("HearingRemindManager", "On music volume changed");
        zw8.a aVarD = zw8.d();
        if (aVarD == null || !aVarD.a) {
            a7b.f("HearingRemindManager", "Volume limit not open");
            return;
        }
        AudioManager audioManager = (AudioManager) this.f13091e.getSystemService("audio");
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        int streamVolume = audioManager.getStreamVolume(3);
        a7b.f("HearingRemindManager", "Current volume=" + streamVolume + " max volume=" + streamMaxVolume);
        if (streamVolume == streamMaxVolume) {
            w(context, aVarD.b);
        }
    }

    public final void s(int i) {
        String strX = x(i);
        if (strX != null) {
            v9g.w().T(strX, System.currentTimeMillis());
        }
    }

    public final void t(int i, String str, String str2, PendingIntent pendingIntent) {
        if (g3k.x() || TextUtils.isEmpty(um.c().getSsoid())) {
            a7b.f("HearingRemindManager", "Tourist mode not show hearing notification");
            return;
        }
        if (!o()) {
            a7b.f("HearingRemindManager", "Show notification fail, enable=false, id=" + i);
            return;
        }
        Context contextA = b78.a();
        if (gxe.f(contextA)) {
            a7b.f("HearingRemindManager", "Show notification in main process");
        } else {
            if (gxe.g(contextA)) {
                a7b.f("HearingRemindManager", "Transport process, but main process is running, ignore");
                return;
            }
            a7b.f("HearingRemindManager", "Show notification in transport process, because main process is not exist");
        }
        a7b.f("HearingRemindManager", "Show notify id=" + i + " title=" + str + " content=" + str2);
        s(i);
        NotificationManagerCompat notificationManagerCompatFrom = NotificationManagerCompat.from(contextA);
        NotificationCompat.Builder builder = new NotificationCompat.Builder(contextA, CHANNEL_ID);
        if (notificationManagerCompatFrom.getNotificationChannel(CHANNEL_ID) == null) {
            notificationManagerCompatFrom.createNotificationChannel(new NotificationChannel(CHANNEL_ID, this.f13091e.getString(R$string.health_hearing_remind_notification), 4));
        }
        builder.setContentTitle(str).setContentText(str2).setChannelId(CHANNEL_ID).setContentIntent(pendingIntent).setAutoCancel(true).setSmallIcon(R$mipmap.lib_base_ic_launcher).setWhen(System.currentTimeMillis()).setCategory(NotificationCompat.CATEGORY_REMINDER);
        notificationManagerCompatFrom.notify(i, builder.build());
    }

    public final void u(Context context) {
        if (!n()) {
            a7b.f("HearingRemindManager", "Headset not connect");
            return;
        }
        zw8.a aVarD = zw8.d();
        if (aVarD == null || !aVarD.a) {
            a7b.f("HearingRemindManager", "Limit not enable, data=" + aVarD);
            return;
        }
        if (p(802)) {
            a7b.f("HearingRemindManager", "Volume protection today is notified");
        } else {
            t(802, null, this.f13091e.getString(R$string.health_hearing_volume_limit_in_protection, String.valueOf(aVarD.b)), g(context));
        }
    }

    public final void v(Context context) {
        PendingIntent pendingIntentG;
        if (p(801)) {
            a7b.f("HearingRemindManager", "Overrun today is notified");
            return;
        }
        zw8.a aVarD = zw8.d();
        String string = this.f13091e.getString(R$string.health_hearing_volume_exposure_overrun_tips);
        if (aVarD == null || !aVarD.a) {
            string = this.f13091e.getString(R$string.health_hearing_volume_exposure_overrun_to_open_limit);
            pendingIntentG = g(context);
        } else {
            pendingIntentG = null;
        }
        t(801, this.f13091e.getString(R$string.health_hearing_turn_down_volume), string, pendingIntentG);
    }

    public final void w(Context context, int i) {
        if (p(803)) {
            a7b.f("HearingRemindManager", "Volume to max limit, today is notified");
        } else {
            t(803, null, this.f13091e.getString(R$string.health_hearing_volume_to_max_limit_tip, String.valueOf(i)), g(context));
        }
    }

    public final String x(int i) {
        if (i == 802) {
            return "key_max_volume_protection_notification_time";
        }
        if (i == 803) {
            return "key_volume_limit_max_notification_time";
        }
        if (i == 801) {
            return "key_volume_overrun_notification_time";
        }
        return null;
    }

    public jz8() {
        this.a = "com.oplus.atlas.hearing_action";
        this.b = 801;
        this.f13090c = 802;
        this.d = 803;
        this.f = false;
        this.f13091e = b78.a();
        m();
    }
}
