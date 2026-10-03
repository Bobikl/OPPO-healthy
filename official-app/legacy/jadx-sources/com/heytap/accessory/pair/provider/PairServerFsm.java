package com.heytap.accessory.pair.provider;

import com.heytap.accessory.pair.logging.PairLog;

/* JADX INFO: loaded from: classes14.dex */
public enum PairServerFsm {
    IDLE,
    GATT_CONNECTING,
    INITIALIZATION,
    KEY_BASED_PAIRING,
    KSC,
    SUCCESS,
    ERROR;

    private static final String TAG = "PairServerFsm";

    public boolean enter(ProtocolEventManager protocolEventManager) {
        PairServerFsm fsm = protocolEventManager.getFsm();
        if (fsm == this) {
            PairLog.w(TAG, "enter failed, duplicate PairServerFsm: " + this);
            return false;
        }
        PairServerFsm pairServerFsm = ERROR;
        if (fsm == pairServerFsm) {
            PairLog.w(TAG, "enter " + this + " failed, preFsm is " + pairServerFsm);
        }
        if (fsm != null) {
            fsm.onExit(protocolEventManager);
        }
        protocolEventManager.setFsm(this);
        onEntry(protocolEventManager);
        return true;
    }

    public void onEntry(ProtocolEventManager protocolEventManager) {
        PairLog.i(TAG, "onEntry: " + this);
    }

    public void onExit(ProtocolEventManager protocolEventManager) {
        PairLog.i(TAG, "onExit: " + this);
    }
}
