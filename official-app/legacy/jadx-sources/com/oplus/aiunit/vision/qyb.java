package com.oplus.aiunit.vision;

import com.google.protobuf.InvalidProtocolBufferException;
import com.heytap.health.protocol.dm.DMProto$BatteryInfo;
import com.heytap.health.protocol.dm.DMProto$ConnectDeviceInfo;
import com.heytap.wearable.proto.pair.UeStateInfo;
import com.op.proto.AboutWatchProto;
import com.op.proto.BindDeviceResponse;
import com.op.proto.HealthGoalResult;
import heytap.health.device.protocol.ota.OTAProto$Ota;

/* JADX INFO: loaded from: classes17.dex */
public abstract class qyb implements bid {
    @Override // com.oplus.aiunit.vision.bid
    public void a(int i, int i2, byte[] bArr) {
        try {
            if (i == 1) {
                n(i2, bArr);
            } else if (i == 5) {
                o(i2, bArr);
            } else if (i != 27) {
            } else {
                p(i2, bArr);
            }
        } catch (InvalidProtocolBufferException unused) {
        }
    }

    @Override // com.oplus.aiunit.vision.bid
    public void b(int i, int i2, byte[] bArr) {
        i(i2);
    }

    public final boolean c(int i) {
        return (i > 0 && i <= 6) || i == 19 || i == 22 || i == 30 || i == 31;
    }

    public void d(AboutWatchProto.AboutWatchInfo aboutWatchInfo) {
    }

    public void e(BindDeviceResponse.bind_rsp_t bind_rsp_tVar) {
    }

    public void f(String str, int i) {
    }

    public void g(DMProto$ConnectDeviceInfo dMProto$ConnectDeviceInfo) {
    }

    public void h(int i, HealthGoalResult.HealthGoalResultData healthGoalResultData) {
    }

    public void i(int i) {
    }

    public void j(OTAProto$Ota oTAProto$Ota) {
    }

    public void k(int i) {
    }

    public void l(HealthGoalResult.HealthGoalResultData healthGoalResultData) {
    }

    public void m(UeStateInfo ueStateInfo) {
    }

    public final void n(int i, byte[] bArr) throws InvalidProtocolBufferException {
        StringBuilder sb = new StringBuilder();
        sb.append("parseDeviceAnswer commandId:");
        sb.append(i);
        if (bArr == null) {
            a7b.m("MessageReceivedListenerAdapter", "parseDeviceAnswer data == null,and return");
            return;
        }
        if (i != 7) {
            if (i == 8) {
                DMProto$BatteryInfo from = DMProto$BatteryInfo.parseFrom(bArr);
                f(from.getDeviceMac(), from.getBatteryPercent());
                return;
            }
            if (i == 20) {
                d(AboutWatchProto.AboutWatchInfo.parseFrom(bArr));
                return;
            }
            if (i != 135) {
                if (i == 154) {
                    e(BindDeviceResponse.bind_rsp_t.parseFrom(bArr));
                    return;
                }
                switch (i) {
                    case 16:
                        k(UeStateInfo.parseFrom(bArr).getUeState());
                        break;
                    case 17:
                        m(UeStateInfo.parseFrom(bArr));
                        break;
                    case 18:
                        l(HealthGoalResult.HealthGoalResultData.parseFrom(bArr));
                        break;
                }
                return;
            }
        }
        g(DMProto$ConnectDeviceInfo.parseFrom(bArr));
    }

    public final void o(int i, byte[] bArr) throws InvalidProtocolBufferException {
        if (c(i)) {
            if (bArr == null) {
                a7b.m("MessageReceivedListenerAdapter", "parseHealthAnswer data == null,and return");
            } else {
                h(i, HealthGoalResult.HealthGoalResultData.parseFrom(bArr));
            }
        }
    }

    public final void p(int i, byte[] bArr) {
        if (i == 13) {
            try {
                j(OTAProto$Ota.parseFrom(bArr));
            } catch (InvalidProtocolBufferException unused) {
            }
        }
    }
}
