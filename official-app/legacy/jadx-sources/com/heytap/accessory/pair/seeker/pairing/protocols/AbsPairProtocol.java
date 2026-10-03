package com.heytap.accessory.pair.seeker.pairing.protocols;

import android.os.Bundle;
import androidx.annotation.NonNull;
import com.heytap.accessory.pair.logging.PairLog;
import com.heytap.accessory.pair.seeker.DeviceEventManager;
import com.heytap.accessory.pair.seeker.pairing.workers.AbsWorker;
import com.heytap.accessory.pair.utils.HexUtils;
import java.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
public abstract class AbsPairProtocol {
    public static final int PAIR_TYPE_BLE = 3;
    public static final int PAIR_TYPE_BT = 1;
    public static final int PAIR_TYPE_WIFI = 2;
    private static final String TAG = "AbsPairProtocol";
    private static final int WIFI_ADDRESS_LENGTH = 4;
    private CallBack mFinishedCallBack;
    protected String mProviderBleMac;
    protected final AbsWorker mWorker;

    public interface CallBack {
        void onPairingFinished(int i, int i2, @NonNull Bundle bundle);
    }

    public AbsPairProtocol(AbsWorker absWorker, CallBack callBack) {
        this.mWorker = absWorker;
        this.mProviderBleMac = absWorker.getDevice().getMac();
        this.mFinishedCallBack = callBack;
    }

    public void end(int i) {
        Bundle bundle = new Bundle();
        bundle.putString("pair_address", getPairedAddress());
        if ((getPairedAddress() == null || getPairedAddress().split("\\.").length == 4) && getMacAddress() != null) {
            String strMacByteToStr = HexUtils.macByteToStr(getMacAddress());
            if (strMacByteToStr != null) {
                bundle.putString(DeviceEventManager.Event.KEY_P2P_MAC_ADDRESS, strMacByteToStr.toLowerCase());
            } else {
                PairLog.e(TAG, "macByteToStr is null " + Arrays.toString(getMacAddress()));
            }
        }
        this.mFinishedCallBack.onPairingFinished(getPairType(), i, bundle);
    }

    public abstract byte[] getMacAddress();

    public abstract int getPairType();

    public abstract String getPairedAddress();

    public abstract void handlePairingResponse(byte[] bArr);

    public abstract void start();
}
