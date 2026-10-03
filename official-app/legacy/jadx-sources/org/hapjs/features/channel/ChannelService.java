package org.hapjs.features.channel;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.util.Log;
import com.oplus.aiunit.vision.dum;
import com.oplus.aiunit.vision.wgm;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class ChannelService extends Service {
    public static final /* synthetic */ int d = 0;
    public Map<String, dum> a = new HashMap();
    public HandlerThread b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public wgm f20755c;

    public class a implements Thread.UncaughtExceptionHandler {
        public a(ChannelService channelService) {
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th) {
            Log.e("ChannelService", "ChannelService Thread died", th);
        }
    }

    public class b extends wgm {
        public b(Context context, Looper looper, int[] iArr) {
            super(context, looper, iArr);
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return new Messenger(this.f20755c).getBinder();
    }

    public void onChannelServiceCreate() {
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        onChannelServiceCreate();
        HandlerThread handlerThread = new HandlerThread("ChannelService");
        this.b = handlerThread;
        handlerThread.start();
        this.b.setUncaughtExceptionHandler(new a(this));
        this.f20755c = new b(this, this.b.getLooper(), new int[]{-1, -2, -3, 0});
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f20755c.sendEmptyMessage(-2);
        Log.d("ChannelService", "onDestroy");
    }
}
