package com.heytap.accessory.pair.seeker.device;

import android.bluetooth.BluetoothDevice;
import com.heytap.accessory.pair.logging.PairLog;
import com.heytap.accessory.pair.seeker.pairing.workers.AbsWorker;
import com.heytap.accessory.pair.seeker.pairing.workers.IWorkerCallback;
import com.heytap.accessory.pair.seeker.pairing.workers.ModelIDWorker;

/* JADX INFO: loaded from: classes14.dex */
public class ModelIdDevice extends BaseDevice implements IWorkerCallback {
    public static final String TAG = "ModelIdDevice";
    private int mAuthRetryTime;

    public ModelIdDevice(BluetoothDevice bluetoothDevice) {
        super(bluetoothDevice);
        this.mAuthRetryTime = 3;
    }

    private boolean doPair() {
        ModelIDWorker modelIDWorker = new ModelIDWorker(this, this.mAuthRetryTime);
        this.mWorker = modelIDWorker;
        modelIDWorker.run(this);
        PairLog.i(TAG, "start pair, device: " + this);
        return true;
    }

    @Override // com.heytap.accessory.pair.seeker.device.BaseDevice
    public void cancel(int i) {
        AbsWorker absWorker = this.mWorker;
        if (absWorker != null) {
            absWorker.cancel(i);
        } else {
            PairLog.i(TAG, "not start");
        }
    }

    @Override // com.heytap.accessory.pair.seeker.pairing.workers.IWorkerCallback
    public void onWorkerStop(boolean z) {
        if (z) {
            return;
        }
        PairLog.d(TAG, "no need to removePairingDevices here");
    }

    @Override // com.heytap.accessory.pair.seeker.device.BaseDevice
    public void run(int i) {
        if (i == 2) {
            doPair();
        }
    }

    @Override // com.heytap.accessory.pair.seeker.device.BaseDevice
    public int setStateData(int i, byte[] bArr) {
        return super.setStateData(i, bArr);
    }

    public ModelIdDevice(BluetoothDevice bluetoothDevice, int i) {
        super(bluetoothDevice);
        this.mAuthRetryTime = 3;
        this.mConnectivityFlag = i;
    }
}
