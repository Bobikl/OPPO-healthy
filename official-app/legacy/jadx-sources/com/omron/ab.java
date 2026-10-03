package com.omron;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.HandlerThread;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.sensorsdata.analytics.android.sdk.aop.push.PushAutoTrackHelper;

/* JADX INFO: loaded from: classes5.dex */
class ab {

    @NonNull
    private final Context a;

    @NonNull
    private final el b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final BluetoothAdapter f8773c;

    @NonNull
    private ac d;

    public class a extends BroadcastReceiver {

        /* JADX INFO: renamed from: com.omron.ab$a$a, reason: collision with other inner class name */
        public class RunnableC0846a implements Runnable {
            final /* synthetic */ c a;

            public RunnableC0846a(c cVar) {
                this.a = cVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                ab.this.a(this.a);
            }
        }

        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(@NonNull Context context, @NonNull Intent intent) {
            PushAutoTrackHelper.onBroadcastReceiver(this, context, intent);
            aa.a();
            c cVarA = c.a(intent.getIntExtra("android.bluetooth.adapter.extra.STATE", 10));
            if (ab.this.b.a()) {
                ab.this.a(cVarA);
            } else {
                ab.this.b.post(new RunnableC0846a(cVarA));
            }
        }
    }

    public class b implements Runnable {
        final /* synthetic */ en a;

        public b(en enVar) {
            this.a = enVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.a(ab.this.d);
            this.a.c();
        }
    }

    public enum c {
        On(12),
        Off(10),
        TurningOn(11),
        TurningOff(13);

        private int a;

        c(int i) {
            this.a = i;
        }

        public int a() {
            return this.a;
        }

        public static c a(int i) {
            for (c cVar : values()) {
                if (cVar.a() == i) {
                    return cVar;
                }
            }
            return Off;
        }
    }

    public ab(@NonNull Context context, @Nullable Looper looper) {
        if (looper == null) {
            HandlerThread handlerThread = new HandlerThread(getClass().getSimpleName());
            handlerThread.start();
            looper = handlerThread.getLooper();
        }
        this.a = context;
        this.b = new el(looper);
        BluetoothManager bluetoothManager = (BluetoothManager) context.getSystemService("bluetooth");
        if (bluetoothManager == null) {
            this.f8773c = null;
            this.d = ac.Unsupported;
            return;
        }
        BluetoothAdapter adapter = bluetoothManager.getAdapter();
        this.f8773c = adapter;
        if (adapter == null) {
            this.d = ac.Unsupported;
        } else if (!context.getPackageManager().hasSystemFeature("android.hardware.bluetooth_le")) {
            this.d = ac.Unsupported;
        } else {
            this.d = adapter.isEnabled() ? ac.PoweredOn : ac.PoweredOff;
            context.registerReceiver(new a(), new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
        }
    }

    @NonNull
    public BluetoothAdapter a() {
        BluetoothAdapter bluetoothAdapter = this.f8773c;
        if (bluetoothAdapter != null) {
            return bluetoothAdapter;
        }
        throw new NullPointerException("null == mBluetoothAdapter");
    }

    @NonNull
    public Context b() {
        return this.a;
    }

    @NonNull
    public el c() {
        return this.b;
    }

    public ac d() {
        if (this.b.a()) {
            return this.d;
        }
        en enVar = new en();
        this.b.post(new b(enVar));
        enVar.b();
        return (ac) enVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(@NonNull c cVar) {
        aa.d("Received ACTION_STATE_CHANGED. newState:" + cVar.name());
        ac acVar = this.d;
        this.d = c.On == cVar ? ac.PoweredOn : ac.PoweredOff;
        ac acVar2 = this.d;
        if (acVar != acVar2) {
            a(acVar2);
        }
    }

    public void a(@NonNull ac acVar) {
        throw null;
    }
}
