package com.oplus.aiunit.vision;

import com.google.protobuf.InvalidProtocolBufferException;
import com.heytap.health.protocol.dm.DMProto$ConnectDeviceInfo;

/* JADX INFO: loaded from: classes15.dex */
public abstract class syb implements did {
    @Override // com.oplus.aiunit.vision.did
    public void a(int i, int i2, byte[] bArr) {
        if (i == 1) {
            try {
                d(i2, bArr);
            } catch (InvalidProtocolBufferException e2) {
                a7b.b("MessageReceivedListenerAdapter", "[parseOtaAnswer] --> " + e2.getMessage());
            }
        }
    }

    @Override // com.oplus.aiunit.vision.did
    public void b(int i, int i2, byte[] bArr) {
        a7b.f("MessageReceivedListenerAdapter", "[notifySendMessageTimeout] --> commandId=" + i2);
    }

    public void c(DMProto$ConnectDeviceInfo dMProto$ConnectDeviceInfo) {
    }

    public final void d(int i, byte[] bArr) throws InvalidProtocolBufferException {
        StringBuilder sb = new StringBuilder();
        sb.append("parseDeviceAnswer commandId:");
        sb.append(i);
        if (bArr == null) {
            a7b.m("MessageReceivedListenerAdapter", "parseDeviceAnswer data == null,and return");
        } else if (i == 7 || i == 135) {
            c(DMProto$ConnectDeviceInfo.parseFrom(bArr));
        }
    }
}
