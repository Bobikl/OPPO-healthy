package com.lifesense.android.bluetooth.core;

import android.os.Handler;
import android.os.Looper;
import com.lifesense.android.bluetooth.core.bean.constant.DeviceConfigInfoType;
import com.lifesense.android.bluetooth.core.bean.constant.ErrorCode;
import com.lifesense.android.bluetooth.core.business.push.c;
import com.lifesense.android.bluetooth.core.protocol.e;

/* JADX INFO: loaded from: classes4.dex */
public abstract class b extends com.lifesense.android.bluetooth.core.business.log.a implements LsBleInterface {
    public boolean initFlag;
    public boolean isSupportedLowEnergy;
    public Handler mainHandler = new Handler(Looper.getMainLooper());

    public class a extends OnSettingCallBack {
        public final /* synthetic */ OnSettingCallBack a;
        public final /* synthetic */ RunnableC0823b b;

        public a(OnSettingCallBack onSettingCallBack, RunnableC0823b runnableC0823b) {
            this.a = onSettingCallBack;
            this.b = runnableC0823b;
        }

        @Override // com.lifesense.android.bluetooth.core.a
        public void onConfigInfo(Object obj) {
            super.onConfigInfo(obj);
            this.a.onConfigInfo(obj);
            b.this.removeSettingTimeoutRunnable(this.b);
        }

        @Override // com.lifesense.android.bluetooth.core.a
        public void onFailure(int i) {
            super.onFailure(i);
            this.a.onFailure(i);
            b.this.removeSettingTimeoutRunnable(this.b);
        }

        @Override // com.lifesense.android.bluetooth.core.a
        public void onSuccess(String str) {
            super.onSuccess(str);
            this.a.onSuccess(str);
            b.this.removeSettingTimeoutRunnable(this.b);
        }
    }

    /* JADX INFO: renamed from: com.lifesense.android.bluetooth.core.b$b, reason: collision with other inner class name */
    public class RunnableC0823b implements Runnable {
        public OnSettingCallBack a;

        public RunnableC0823b(b bVar, OnSettingCallBack onSettingCallBack) {
            this.a = onSettingCallBack;
        }

        @Override // java.lang.Runnable
        public void run() {
            OnSettingCallBack onSettingCallBack = this.a;
            if (onSettingCallBack != null) {
                onSettingCallBack.onFailure(28);
            }
        }
    }

    private void addSettingTimeoutRunnable(RunnableC0823b runnableC0823b) {
        this.mainHandler.postDelayed(runnableC0823b, 5000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeSettingTimeoutRunnable(RunnableC0823b runnableC0823b) {
        this.mainHandler.removeCallbacks(runnableC0823b);
    }

    public boolean isBluetoothAvailable() {
        if (!this.isSupportedLowEnergy) {
            this.isSupportedLowEnergy = com.lifesense.android.bluetooth.core.system.b.getInstance().l();
        }
        return this.isSupportedLowEnergy && com.lifesense.android.bluetooth.core.system.b.getInstance().i();
    }

    @Override // com.lifesense.android.bluetooth.core.LsBleInterface
    public void updateWeightScaleSetting(String str, DeviceConfigInfoType deviceConfigInfoType, Object obj, OnSettingCallBack onSettingCallBack) {
        ErrorCode errorCode;
        if (this.initFlag) {
            com.lifesense.android.bluetooth.core.business.push.msg.a aVarA = e.a(deviceConfigInfoType, obj);
            if (str != null && aVarA != null) {
                aVarA.a(str);
                RunnableC0823b runnableC0823b = new RunnableC0823b(this, onSettingCallBack);
                addSettingTimeoutRunnable(runnableC0823b);
                c.getInstance().a(str, aVarA, new a(onSettingCallBack, runnableC0823b));
                return;
            }
            errorCode = ErrorCode.PARAMETER_ERROR_CODE;
        } else {
            errorCode = ErrorCode.UNINITIALIZED;
        }
        onSettingCallBack.onFailure(errorCode.getCode());
    }
}
