package com.oplus.pantaconnect.sdk.connectionservice.lan;

/* JADX INFO: loaded from: classes8.dex */
public enum SocketState implements DocumentedSpan {
    SOCKET_INVALID { // from class: com.oplus.pantaconnect.sdk.connectionservice.lan.SocketState.1
        @Override // com.oplus.pantaconnect.sdk.connectionservice.lan.DocumentedSpan
        public String getString() {
            return LanConstants.SOCKET_STATE_INVALID;
        }
    },
    SOCKET_SPEED_TESTING { // from class: com.oplus.pantaconnect.sdk.connectionservice.lan.SocketState.2
        @Override // com.oplus.pantaconnect.sdk.connectionservice.lan.DocumentedSpan
        public String getString() {
            return LanConstants.SOCKET_STATE_SPEED_TESTING;
        }
    },
    SOCKET_QOS_AVAILABLE { // from class: com.oplus.pantaconnect.sdk.connectionservice.lan.SocketState.3
        @Override // com.oplus.pantaconnect.sdk.connectionservice.lan.DocumentedSpan
        public String getString() {
            return LanConstants.SOCKET_STATE_QOS_AVAILABLE;
        }
    }
}
