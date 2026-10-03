package com.oplus.aiunit.vision;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothA2dp;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothClass;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothProfile;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class h2l {
    public final Context a;
    public final c b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f11978c;
    public BluetoothAdapter d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public BluetoothA2dp f11979e;
    public final BluetoothProfile.ServiceListener f = new a();
    public final BroadcastReceiver g = new b();

    public class a implements BluetoothProfile.ServiceListener {
        public a() {
        }

        @Override // android.bluetooth.BluetoothProfile.ServiceListener
        public void onServiceConnected(int i, BluetoothProfile bluetoothProfile) {
            if (i == 2 && (bluetoothProfile instanceof BluetoothA2dp)) {
                h2l.this.f11979e = (BluetoothA2dp) bluetoothProfile;
            }
        }

        @Override // android.bluetooth.BluetoothProfile.ServiceListener
        public void onServiceDisconnected(int i) {
            if (i == 2) {
                h2l.this.f11979e = null;
            }
        }
    }

    public class b extends BroadcastReceiver {
        public b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || !"android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED".equals(intent.getAction())) {
                return;
            }
            BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
            h2l h2lVar = h2l.this;
            if (h2lVar.h(h2lVar.a, bluetoothDevice)) {
                h2l.this.b.a(intent.getIntExtra("android.bluetooth.profile.extra.STATE", 0), bluetoothDevice == null ? null : bluetoothDevice.getAddress());
            }
        }
    }

    public interface c {
        void a(int i, @Nullable String str);
    }

    public h2l(Context context, c cVar) {
        this.a = context.getApplicationContext();
        this.b = cVar;
    }

    @Nullable
    public String e() {
        List<BluetoothDevice> devicesMatchingConnectionStates;
        if (this.f11979e == null) {
            return null;
        }
        try {
            Set<String> setF = f();
            if (!setF.isEmpty() && (devicesMatchingConnectionStates = this.f11979e.getDevicesMatchingConnectionStates(new int[]{2})) != null && !devicesMatchingConnectionStates.isEmpty()) {
                for (BluetoothDevice bluetoothDevice : devicesMatchingConnectionStates) {
                    if (bluetoothDevice != null && !TextUtils.isEmpty(bluetoothDevice.getAddress()) && setF.contains(bluetoothDevice.getAddress().toUpperCase(Locale.ROOT))) {
                        return bluetoothDevice.getAddress();
                    }
                }
                return null;
            }
            return null;
        } catch (SecurityException e2) {
            a7b.m("VMEDIA_BtHeadsetTracker", "getCurrentBluetoothHeadsetMac security exception: " + e2.getMessage());
        } catch (Exception e3) {
            a7b.m("VMEDIA_BtHeadsetTracker", "getCurrentBluetoothHeadsetMac exception: " + e3.getMessage());
        }
    }

    public final Set<String> f() {
        AudioDeviceInfo[] devices;
        HashSet hashSet = new HashSet();
        AudioManager audioManager = (AudioManager) this.a.getSystemService("audio");
        if (audioManager != null && (devices = audioManager.getDevices(2)) != null && devices.length != 0) {
            for (AudioDeviceInfo audioDeviceInfo : devices) {
                if (audioDeviceInfo != null && i(audioDeviceInfo.getType())) {
                    String address = audioDeviceInfo.getAddress();
                    if (!TextUtils.isEmpty(address)) {
                        hashSet.add(address.toUpperCase(Locale.ROOT));
                    }
                }
            }
        }
        return hashSet;
    }

    public final void g() {
        if (this.f11979e != null) {
            return;
        }
        if (this.d == null) {
            this.d = BluetoothAdapter.getDefaultAdapter();
        }
        BluetoothAdapter bluetoothAdapter = this.d;
        if (bluetoothAdapter == null) {
            a7b.m("VMEDIA_BtHeadsetTracker", "initBluetoothA2dpProxy ignored: adapter is null");
            return;
        }
        try {
            bluetoothAdapter.getProfileProxy(this.a, this.f, 2);
        } catch (SecurityException e2) {
            a7b.m("VMEDIA_BtHeadsetTracker", "initBluetoothA2dpProxy security exception: " + e2.getMessage());
        } catch (Exception e3) {
            a7b.m("VMEDIA_BtHeadsetTracker", "initBluetoothA2dpProxy exception: " + e3.getMessage());
        }
    }

    public final boolean h(Context context, BluetoothDevice bluetoothDevice) {
        BluetoothClass bluetoothClass;
        if (bluetoothDevice == null || ContextCompat.checkSelfPermission(context, "android.permission.BLUETOOTH_CONNECT") != 0 || (bluetoothClass = bluetoothDevice.getBluetoothClass()) == null) {
            return false;
        }
        int deviceClass = bluetoothClass.getDeviceClass();
        return deviceClass == 1028 || deviceClass == 1048 || deviceClass == 1032;
    }

    @SuppressLint({"InlinedApi"})
    public final boolean i(int i) {
        return i == 8 || i == 26 || i == 27 || i == 30;
    }

    public final void j() {
        if (this.f11978c) {
            return;
        }
        try {
            rdf.a(this.a, this.g, new IntentFilter("android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED"), 2);
            this.f11978c = true;
        } catch (Exception e2) {
            a7b.m("VMEDIA_BtHeadsetTracker", "registerA2dpConnectionStateReceiver exception: " + e2.getMessage());
        }
    }

    public final void k() {
        BluetoothA2dp bluetoothA2dp;
        BluetoothAdapter bluetoothAdapter = this.d;
        if (bluetoothAdapter == null || (bluetoothA2dp = this.f11979e) == null) {
            return;
        }
        try {
            try {
                try {
                    bluetoothAdapter.closeProfileProxy(2, bluetoothA2dp);
                } catch (Exception e2) {
                    a7b.m("VMEDIA_BtHeadsetTracker", "releaseBluetoothA2dpProxy exception: " + e2.getMessage());
                }
            } catch (SecurityException e3) {
                a7b.m("VMEDIA_BtHeadsetTracker", "releaseBluetoothA2dpProxy security exception: " + e3.getMessage());
            }
        } finally {
            this.f11979e = null;
        }
    }

    public void l() {
        g();
        j();
    }

    public void m() {
        n();
        k();
    }

    public final void n() {
        if (this.f11978c) {
            try {
                try {
                    this.a.unregisterReceiver(this.g);
                } catch (Exception e2) {
                    a7b.m("VMEDIA_BtHeadsetTracker", "unregisterA2dpConnectionStateReceiver exception: " + e2.getMessage());
                }
            } finally {
                this.f11978c = false;
            }
        }
    }
}
