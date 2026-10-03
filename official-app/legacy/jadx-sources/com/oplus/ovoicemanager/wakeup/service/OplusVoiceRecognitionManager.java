package com.oplus.ovoicemanager.wakeup.service;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import com.oplus.aiunit.vision.x8d;
import com.oplus.mydevices.sdk.compat.DeviceInfoCompat;

/* JADX INFO: loaded from: classes8.dex */
public class OplusVoiceRecognitionManager {
    public static Handler b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile OplusVoiceRecognitionManager f20047c;
    public final OplusVoiceWakeupManager a;

    public enum DeviceType {
        WATCH(DeviceInfoCompat.DeviceType.WATCH),
        EARBUDS("earbuds");

        private final String typeValue;

        DeviceType(String str) {
            this.typeValue = str;
        }

        public static DeviceType fromTypeValue(String str) {
            for (DeviceType deviceType : values()) {
                if (deviceType.typeValue.equals(str)) {
                    return deviceType;
                }
            }
            throw new IllegalArgumentException("invalid type: " + str);
        }

        public String getTypeValue() {
            return this.typeValue;
        }
    }

    public static class Stub extends HotwordRecordingListener.Stub {
        private HotwordRecordingListener listener;

        public Stub(HotwordRecordingListener hotwordRecordingListener) {
            this.listener = hotwordRecordingListener;
        }

        private void executeOnMainThread(Runnable runnable) {
            OplusVoiceRecognitionManager.b.post(runnable);
        }

        @Override // com.oplus.ovoicemanager.wakeup.service.HotwordRecordingListener
        public String getClientPackageName() throws RemoteException {
            HotwordRecordingListener hotwordRecordingListener = this.listener;
            return hotwordRecordingListener != null ? hotwordRecordingListener.getClientPackageName() : "";
        }

        @Override // com.oplus.ovoicemanager.wakeup.service.HotwordRecordingListener
        public void onBufferReceive(byte[] bArr) {
        }

        @Override // com.oplus.ovoicemanager.wakeup.service.HotwordRecordingListener
        public void onEvent(int i, Bundle bundle) throws RemoteException {
            HotwordRecordingListener hotwordRecordingListener = this.listener;
            if (hotwordRecordingListener != null) {
                hotwordRecordingListener.onEvent(i, bundle);
            }
        }

        @Override // com.oplus.ovoicemanager.wakeup.service.HotwordRecordingListener
        public void onResult(int i, int i2) throws RemoteException {
            HotwordRecordingListener hotwordRecordingListener = this.listener;
            if (hotwordRecordingListener != null) {
                hotwordRecordingListener.onResult(i, i2);
            }
        }

        @Override // com.oplus.ovoicemanager.wakeup.service.HotwordRecordingListener
        public int read(byte[] bArr, int i, int i2) throws RemoteException {
            HotwordRecordingListener hotwordRecordingListener = this.listener;
            if (hotwordRecordingListener != null) {
                return hotwordRecordingListener.read(bArr, i, i2);
            }
            return -1;
        }

        @Override // com.oplus.ovoicemanager.wakeup.service.HotwordRecordingListener
        public int startRecording(int i) throws RemoteException {
            HotwordRecordingListener hotwordRecordingListener = this.listener;
            if (hotwordRecordingListener != null) {
                return hotwordRecordingListener.startRecording(i);
            }
            return -1;
        }

        @Override // com.oplus.ovoicemanager.wakeup.service.HotwordRecordingListener
        public int stopRecording() throws RemoteException {
            HotwordRecordingListener hotwordRecordingListener = this.listener;
            if (hotwordRecordingListener != null) {
                return hotwordRecordingListener.stopRecording();
            }
            return -1;
        }
    }

    public OplusVoiceRecognitionManager(OplusVoiceWakeupManager oplusVoiceWakeupManager) {
        this.a = oplusVoiceWakeupManager;
    }

    public static OplusVoiceRecognitionManager e(Context context, x8d x8dVar) {
        b = new Handler(context.getApplicationContext().getMainLooper());
        if (f20047c == null) {
            synchronized (OplusVoiceRecognitionManager.class) {
                if (f20047c == null) {
                    f20047c = new OplusVoiceRecognitionManager(OplusVoiceWakeupManager.k(context, x8dVar));
                }
            }
        }
        return f20047c;
    }

    public void b() {
        this.a.h();
    }

    public void c() {
        this.a.i();
    }

    public int d(HotwordRecordingListener hotwordRecordingListener) {
        if (f()) {
            return this.a.j(new Stub(hotwordRecordingListener));
        }
        return -1;
    }

    public boolean f() {
        return this.a.l();
    }

    public int g(int i, DeviceType deviceType, Bundle bundle) {
        if (!f()) {
            return -1;
        }
        bundle.putString("device_type", deviceType.getTypeValue());
        return this.a.m(i, bundle);
    }

    public int h() {
        if (f()) {
            return this.a.n();
        }
        return -1;
    }
}
