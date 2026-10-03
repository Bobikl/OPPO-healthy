package com.coloros.platformalarmclock;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.NonNull;
import com.coloros.alarmclock.IClockAidlInterface;
import com.coloros.alarmclock.IClockUpdateAidlInterface;
import com.oplus.aiunit.vision.f78;
import com.oplus.aiunit.vision.xke;

/* JADX INFO: loaded from: classes13.dex */
public class PlatformClockManager {
    public static final String ACTION_REBIND_CLOCK_SERVICES = "com.coloros.alarmclock.service.rebind_clock_services";
    public static final String ACTION_UNBIND = "com.coloros.alarmclock.service.unbind_services";
    public static final String EXTRA_CHANNEL_NAME = "extra_channel_name";
    public static final int NOTIFY_ACTION_DELETE = 0;
    public static final int NOTIFY_ACTION_DISABLE = 2;
    public static final int NOTIFY_ACTION_UPDATE = 1;
    public static final String RECEIVE_UNBIND = "com.coloros.alarmclock.alarmclock.AlarmReceiver";

    @SuppressLint({"StaticFieldLeak"})
    public static final PlatformClockManager h = new PlatformClockManager();
    public IClockAidlInterface a;
    public xke b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public PlatformClockInfo f1521c;
    public Context d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f1522e = new a(Looper.getMainLooper());
    public final b f = new b();
    public final c g = new c();

    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(@NonNull Message message) {
            String str = PlatformClockManager.ACTION_REBIND_CLOCK_SERVICES;
            Log.i("PlatformClockManager", "handleMessage");
            PlatformClockManager platformClockManager = PlatformClockManager.this;
            if (platformClockManager.b == null) {
                platformClockManager.f(platformClockManager.d);
                return;
            }
            Log.i("PlatformClockManager", "handleMessage msg.what = " + message.what);
            if (message.what == 1) {
                Bundle data = message.getData();
                if (data != null) {
                    PlatformClockInfo platformClockInfo = (PlatformClockInfo) data.getParcelable("key_for_handler_alarm_ring");
                    if (platformClockInfo == null) {
                        Log.e("PlatformClockManager", "handleMessage  clockInfo is null ");
                        return;
                    }
                    Log.i("PlatformClockManager", "handleMessage PlatformClockInfo = " + platformClockInfo.toString());
                    PlatformClockManager platformClockManager2 = PlatformClockManager.this;
                    platformClockManager2.f1521c = platformClockInfo;
                    platformClockManager2.b.alarmClockRing(platformClockInfo);
                    return;
                }
                return;
            }
            Bundle data2 = message.getData();
            if (data2 == null) {
                Log.e("PlatformClockManager", "handleMessage  bundle is null ");
                return;
            }
            long j2 = data2.getLong("key_for_handler_alarm_id");
            Log.i("PlatformClockManager", "handleMessage alarmId = " + j2);
            int i = message.what;
            if (i == 2) {
                PlatformClockManager.this.b.snoozeClock(j2);
            } else if (i == 4) {
                PlatformClockManager.this.b.dismissClock(j2);
            }
            PlatformClockManager.this.j();
        }
    }

    public class b implements ServiceConnection {
        public b() {
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            String str = PlatformClockManager.ACTION_REBIND_CLOCK_SERVICES;
            Log.i("PlatformClockManager", "onServiceConnected");
            PlatformClockManager.this.a = IClockAidlInterface.Stub.asInterface(iBinder);
            PlatformClockManager platformClockManager = PlatformClockManager.this;
            IClockAidlInterface iClockAidlInterface = platformClockManager.a;
            if (iClockAidlInterface != null) {
                try {
                    iClockAidlInterface.registerListener(platformClockManager.g);
                    PlatformClockManager.this.a.bindAlarmClock();
                } catch (RemoteException e2) {
                    String str2 = PlatformClockManager.ACTION_REBIND_CLOCK_SERVICES;
                    Log.e("PlatformClockManager", "onServiceConnected e.getMessage = " + e2.getMessage());
                    e2.printStackTrace();
                }
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            String str = PlatformClockManager.ACTION_REBIND_CLOCK_SERVICES;
            Log.i("PlatformClockManager", "onServiceDisconnected");
            PlatformClockManager.this.j();
        }
    }

    public class c extends IClockUpdateAidlInterface.Stub {
        public c() {
        }

        @Override // com.coloros.alarmclock.IClockUpdateAidlInterface
        public final void alarmClockRing(PlatformClockInfo platformClockInfo) {
            String str = PlatformClockManager.ACTION_REBIND_CLOCK_SERVICES;
            Log.i("PlatformClockManager", "alarmClockRing clockInfo = " + platformClockInfo.toString());
            Message message = new Message();
            Bundle bundle = new Bundle();
            bundle.putParcelable("key_for_handler_alarm_ring", platformClockInfo);
            message.what = 1;
            message.setData(bundle);
            PlatformClockManager.this.f1522e.sendMessage(message);
        }

        @Override // com.coloros.alarmclock.IClockUpdateAidlInterface
        public final void dismissClock(long j2) {
            String str = PlatformClockManager.ACTION_REBIND_CLOCK_SERVICES;
            Log.i("PlatformClockManager", "dismissClock scheduleId = " + j2);
            Message message = new Message();
            Bundle bundle = new Bundle();
            bundle.putLong("key_for_handler_alarm_id", j2);
            message.what = 4;
            message.setData(bundle);
            PlatformClockManager.this.f1522e.sendMessage(message);
        }

        @Override // com.coloros.alarmclock.IClockUpdateAidlInterface
        public final String getChannelName() {
            Context context = PlatformClockManager.this.d;
            if (context == null) {
                String str = PlatformClockManager.ACTION_REBIND_CLOCK_SERVICES;
                Log.e("PlatformClockManager", "getChannelName  mContext != null ");
                return null;
            }
            String packageName = context.getApplicationContext().getPackageName();
            String str2 = PlatformClockManager.ACTION_REBIND_CLOCK_SERVICES;
            Log.i("PlatformClockManager", "getChannelName  channelName : " + packageName);
            return packageName;
        }

        @Override // com.coloros.alarmclock.IClockUpdateAidlInterface
        public final boolean getListenerIsNull() {
            String str = PlatformClockManager.ACTION_REBIND_CLOCK_SERVICES;
            StringBuilder sb = new StringBuilder("getListenerIsNull = ");
            sb.append(PlatformClockManager.this.b == null);
            Log.e("PlatformClockManager", sb.toString());
            return PlatformClockManager.this.b == null;
        }

        @Override // com.coloros.alarmclock.IClockUpdateAidlInterface
        public final boolean isBindAlarmClock() {
            return true;
        }

        @Override // com.coloros.alarmclock.IClockUpdateAidlInterface
        public final void onDataChanged(int i, int i2, long j2) {
            try {
                xke xkeVar = PlatformClockManager.this.b;
                if (xkeVar != null) {
                    xkeVar.onDataChanged(i, i2, j2);
                }
            } catch (Exception e2) {
                String str = PlatformClockManager.ACTION_REBIND_CLOCK_SERVICES;
                Log.e("PlatformClockManager", "onDataChanged error:" + e2);
            }
        }

        @Override // com.coloros.alarmclock.IClockUpdateAidlInterface
        public final void snoozeClock(long j2) {
            String str = PlatformClockManager.ACTION_REBIND_CLOCK_SERVICES;
            Log.i("PlatformClockManager", "snoozeClock scheduleId = " + j2);
            Message message = new Message();
            Bundle bundle = new Bundle();
            bundle.putLong("key_for_handler_alarm_id", j2);
            message.what = 2;
            message.setData(bundle);
            PlatformClockManager.this.f1522e.sendMessage(message);
        }
    }

    public static PlatformClockManager e() {
        return h;
    }

    public final PlatformClockInfo a() {
        Log.i("PlatformClockManager", "getCurrentPlatformClockInfo getCurrentPlatformClockInfo ");
        PlatformClockInfo currentAlarm = null;
        try {
            IClockAidlInterface iClockAidlInterface = this.a;
            if (iClockAidlInterface != null) {
                currentAlarm = iClockAidlInterface.getCurrentAlarm();
                Log.i("PlatformClockManager", "getCurrentPlatformClockInfo mIClockAidlInterface " + currentAlarm);
            } else {
                Log.e("PlatformClockManager", "getCurrentPlatformClockInfo mIClockAidlInterface is null");
            }
        } catch (RemoteException e2) {
            Log.e("PlatformClockManager", "getCurrentPlatformClockInfo RemoteException : " + e2.getMessage());
        }
        return currentAlarm;
    }

    public final void b() {
        Intent intent = new Intent(ACTION_UNBIND);
        intent.putExtra(EXTRA_CHANNEL_NAME, this.d.getApplicationContext().getPackageName());
        intent.setFlags(32);
        intent.addFlags(268435456);
        intent.setComponent(new ComponentName(this.d, RECEIVE_UNBIND));
        this.d.sendBroadcast(intent, "oppo.permission.OPPO_COMPONENT_SAFE");
    }

    public boolean c(Context context) {
        String str = f78.CLOCK_PACKAGE;
        a aVar = this.f1522e;
        Context contextCreatePackageContext = null;
        if (aVar != null) {
            aVar.removeCallbacksAndMessages(null);
        }
        boolean zBindService = false;
        if (context != null) {
            this.d = context;
            Log.i("PlatformClockManager", "bind");
            try {
                Intent intent = new Intent();
                intent.setAction("com.coloros.alarmclock.service.PlatformUtilsClockServices");
                try {
                    contextCreatePackageContext = context.createPackageContext(f78.CLOCK_PACKAGE, 7);
                } catch (PackageManager.NameNotFoundException unused) {
                    Log.e("", "get com.coloros.alarmclockContext Exception");
                }
                if (contextCreatePackageContext == null) {
                    str = "com.oneplus.deskclock";
                }
                intent.setPackage(str);
                zBindService = context.bindService(intent, this.f, 1);
                Log.i("PlatformClockManager", "bind  isBindSuccess = " + zBindService);
                xke xkeVar = this.b;
                if (xkeVar != null) {
                    xkeVar.a(zBindService);
                    if (zBindService && this.f1521c == null) {
                        Log.i("PlatformClockManager", "bind isBindSuccess = true  , mPlatformClockInfo == null ");
                        this.f1521c = a();
                    }
                } else {
                    Log.e("PlatformClockManager", "bind  mPlatformClockListener is null ");
                }
            } catch (Exception e2) {
                Log.e("PlatformClockManager", "bind bind : " + e2.getMessage());
            }
        }
        return zBindService;
    }

    public void d() {
        try {
            if (this.a == null) {
                Log.e("PlatformClockManager", "dismissClock mIClockAidlInterface is null");
                return;
            }
            PlatformClockInfo platformClockInfo = this.f1521c;
            Log.i("PlatformClockManager", "isDismissClockSuccess = " + this.a.dismissClock(platformClockInfo != null ? platformClockInfo.getScheduleId() : -1L));
        } catch (RemoteException e2) {
            Log.e("PlatformClockManager", "dismissClock RemoteException : " + e2.getMessage());
        }
    }

    public void f(Context context) {
        if (context != null) {
            Log.i("PlatformClockManager", "rebindAlarmClock package:" + context.getPackageName());
            Intent intent = new Intent("com.coloros.alarmclock.service.rebind_clock_services");
            intent.setPackage(context.getPackageName());
            context.sendBroadcast(intent, "com.coloros.alarmclock.permission.ACCESS_CLOCK_RECEIVER_PLATFORM");
        }
    }

    public void g(Context context) {
        if (context != null) {
            this.d = context;
        }
    }

    public void h(xke xkeVar) {
        Log.i("PlatformClockManager", "setPlatformClockListener");
        this.b = xkeVar;
        Context context = this.d;
        if (context != null) {
            c(context);
        }
    }

    public void i() {
        long scheduleId;
        Log.i("PlatformClockManager", "snoozeAlarm snoozeAlarm ");
        try {
            if (this.a == null) {
                Log.e("PlatformClockManager", "snoozeAlarm mIClockAidlInterface is null");
                return;
            }
            PlatformClockInfo platformClockInfo = this.f1521c;
            if (platformClockInfo != null) {
                scheduleId = platformClockInfo.getScheduleId();
            } else {
                Log.i("PlatformClockManager", "snoozeAlarm  mPlatformClockInfo is null");
                scheduleId = -1;
            }
            Log.i("PlatformClockManager", "snoozeAlarm  mPlatformClockInfo is scheduleId = " + scheduleId);
            Log.i("PlatformClockManager", "snoozeAlarm isSnoozeClockSuccess = " + this.a.snoozeClock(scheduleId));
        } catch (RemoteException e2) {
            Log.e("PlatformClockManager", "snoozeAlarm RemoteException : " + e2.getMessage());
        }
    }

    public void j() {
        Log.i("PlatformClockManager", "unbindAlarmClock  unbindAlarmClock");
        IClockAidlInterface iClockAidlInterface = this.a;
        if (iClockAidlInterface != null) {
            try {
                iClockAidlInterface.unbindAlarmClock();
                this.a = null;
            } catch (RemoteException e2) {
                Log.e("PlatformClockManager", "unbindAlarmClock RemoteException : " + e2.getMessage());
            }
        }
        try {
            if (this.d != null) {
                b();
                this.d.unbindService(this.f);
            }
        } catch (Exception e3) {
            Log.e("PlatformClockManager", "unbindService error:" + e3);
        }
        if (this.b != null) {
            this.b = null;
        }
        if (this.f1521c != null) {
            this.f1521c = null;
        }
    }
}
