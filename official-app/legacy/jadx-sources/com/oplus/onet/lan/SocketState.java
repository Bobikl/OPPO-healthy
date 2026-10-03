package com.oplus.onet.lan;

import com.oplus.aiunit.vision.py5;
import com.oplus.pantaconnect.sdk.connectionservice.lan.LanConstants;

/* JADX INFO: loaded from: classes8.dex */
public enum SocketState implements py5 {
    SOCKET_INVALID { // from class: com.oplus.onet.lan.SocketState.1
        @Override // com.oplus.onet.lan.SocketState, com.oplus.aiunit.vision.py5
        public String getString() {
            return LanConstants.SOCKET_STATE_INVALID;
        }
    },
    SOCKET_SPEED_TESTING { // from class: com.oplus.onet.lan.SocketState.2
        @Override // com.oplus.onet.lan.SocketState, com.oplus.aiunit.vision.py5
        public String getString() {
            return LanConstants.SOCKET_STATE_SPEED_TESTING;
        }
    },
    SOCKET_QOS_AVAILABLE { // from class: com.oplus.onet.lan.SocketState.3
        @Override // com.oplus.onet.lan.SocketState, com.oplus.aiunit.vision.py5
        public String getString() {
            return LanConstants.SOCKET_STATE_QOS_AVAILABLE;
        }
    };

    @Override // com.oplus.aiunit.vision.py5
    public abstract /* synthetic */ String getString();
}
