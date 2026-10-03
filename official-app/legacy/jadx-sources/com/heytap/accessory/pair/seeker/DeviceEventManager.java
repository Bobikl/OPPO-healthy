package com.heytap.accessory.pair.seeker;

import android.os.Bundle;

/* JADX INFO: loaded from: classes14.dex */
public class DeviceEventManager {

    public static class Event {
        public static final String KEY_P2P_MAC_ADDRESS = "p2p_mac_address";
        public static final String KEY_PAIR_ADDRESS = "pair_address";
        public static final String KEY_REMOTE_DEVICE_ID = "key_remote_device_id";
        public static final String KEY_TAG = "tag";
        private Bundle mBundle;
        private int mId;

        public Event(int i, Bundle bundle) {
            this.mId = i;
            this.mBundle = bundle;
        }

        public Bundle getBundle() {
            return this.mBundle;
        }

        public void setBundle(Bundle bundle) {
            this.mBundle = bundle;
        }

        public Event(int i) {
            this.mId = i;
        }

        public Event(Bundle bundle) {
            this.mBundle = bundle;
        }
    }
}
