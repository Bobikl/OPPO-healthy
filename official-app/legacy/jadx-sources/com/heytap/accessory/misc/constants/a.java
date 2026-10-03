package com.heytap.accessory.misc.constants;

/* JADX INFO: loaded from: classes14.dex */
public enum a {
    AFP_CONTROL_FRAME_IMMEDIATE_ACK((byte) 0),
    AFP_CONTROL_FRAME_BLOCK_ACK((byte) 1),
    AFP_CONTROL_FRAME_NAK((byte) 2);

    public byte a;

    a(byte b) {
        this.a = b;
    }

    public static a a(byte b) {
        for (a aVar : values()) {
            if (aVar.a == b) {
                return aVar;
            }
        }
        return AFP_CONTROL_FRAME_IMMEDIATE_ACK;
    }

    public byte a() {
        return this.a;
    }
}
