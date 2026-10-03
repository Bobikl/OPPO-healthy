package com.heytap.accessory.connectivity.autoconnect;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.os.Handler;
import android.os.Message;
import androidx.core.app.NotificationCompat;
import com.heytap.accessory.accessorymanager.ConnectConfig;
import com.heytap.accessory.misc.utils.PlatformUtils;

/* JADX INFO: loaded from: classes14.dex */
public class b {
    public AlarmManager a = (AlarmManager) PlatformUtils.getContext().getSystemService(NotificationCompat.CATEGORY_ALARM);
    public Handler b;

    public void a(Handler handler) {
        this.b = handler;
    }

    public void b(int i, PendingIntent pendingIntent) {
        com.heytap.accessory.base.logging.a.a("AutoConnectionTimer", "setAlarmTimer:" + i + " intent:" + pendingIntent.toString());
        this.a.set(0, System.currentTimeMillis() + ((long) i) + 1, pendingIntent);
    }

    public void a(String str, int i, int i2) {
        Message messageObtainMessage = this.b.obtainMessage();
        messageObtainMessage.what = 121;
        messageObtainMessage.obj = new ConnectConfig(str, i, 0, i2);
        messageObtainMessage.sendToTarget();
    }

    public void a(String str, int i, int i2, int i3) {
        com.heytap.accessory.base.logging.a.a("AutoConnectionTimer", "reconnect: address = " + str + " transport = " + i + " uuidType = " + i3 + " retryMode = " + i2);
        ConnectConfig connectConfig = new ConnectConfig(str, i, i2, i3);
        Message messageObtainMessage = this.b.obtainMessage();
        messageObtainMessage.what = 123;
        messageObtainMessage.obj = connectConfig;
        messageObtainMessage.sendToTarget();
    }

    public void a(int i, PendingIntent pendingIntent) {
        com.heytap.accessory.base.logging.a.a("AutoConnectionTimer", "setAlarmClock:" + i + " intent:" + pendingIntent.toString());
        this.a.setAlarmClock(new AlarmManager.AlarmClockInfo(System.currentTimeMillis() + ((long) i) + 1, null), pendingIntent);
    }

    public void a(PendingIntent pendingIntent) {
        this.a.cancel(pendingIntent);
    }

    public void a(a.C0230a c0230a) {
        this.a.cancel(c0230a.b());
    }
}
