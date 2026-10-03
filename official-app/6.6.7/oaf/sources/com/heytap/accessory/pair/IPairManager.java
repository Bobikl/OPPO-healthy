package com.heytap.accessory.pair;

import com.heytap.accessory.pair.seeker.device.BaseDevice;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public interface IPairManager {
    public static final int RESULT_FAILED = 1;
    public static final int RESULT_SUCCESS = 0;
    public static final int START_PAIRING = 2;

    public interface IPairEventListener {
        void onEvent(int i, BaseDevice baseDevice, int i2);
    }

    boolean cancelBond(String str);

    void closeServer();

    void openServer();

    void registerEventListener(IPairEventListener iPairEventListener);

    void startBond(String str, int i);

    void unregisterEventListener();
}
