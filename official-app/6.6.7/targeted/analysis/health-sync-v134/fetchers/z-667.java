package com.heytap.device.data.sporthealth.pull.fetcher;

import com.google.protobuf.ByteString;
import com.heytap.health.protocol.workout.WorkoutProto;
import com.oplus.aiunit.vision.ProcessPacketDataResult;
import com.oplus.aiunit.vision.gv4;
import com.oplus.aiunit.vision.kq5;
import com.oplus.aiunit.vision.m8b;
import com.oplus.aiunit.vision.qx4;
import com.oplus.aiunit.vision.v2e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes15.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\bH\u0002¨\u0006\u0010"}, d2 = {"Lcom/heytap/device/data/sporthealth/pull/fetcher/z;", "Lcom/heytap/device/data/sporthealth/pull/fetcher/PacketDataFetcher;", kq5.NOT_SET, "m", kq5.NOT_SET, "data", "Lcom/oplus/aiunit/vision/kze;", "e", "Lcom/heytap/health/protocol/workout/WorkoutProto$SportsRecoveryHeartRateData;", "prePacketData", kq5.NOT_SET, "e0", kq5.NOT_SET, "f0", "<init>", "()V", "device_data_sync_impl_release"}, k = 1, mv = {1, 8, 0})
public final class z extends PacketDataFetcher {
    public z() {
        super(4, 41, 42, 18);
    }

    @Override // com.heytap.device.data.sporthealth.pull.fetcher.PacketDataFetcher, com.oplus.aiunit.vision.jze
    @NotNull
    public ProcessPacketDataResult e(@NotNull byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        ProcessPacketDataResult processPacketDataResult = new ProcessPacketDataResult(1, 0);
        try {
            WorkoutProto.SportsRecoveryHeartRateData from = WorkoutProto.SportsRecoveryHeartRateData.parseFrom(data);
            if (from != null) {
                f0(from);
                if (gv4.o(from, this.f)) {
                    int iE0 = e0(from);
                    if (iE0 > 0) {
                        qx4.n(getDataType(), this.f, this.n, this.g);
                    }
                    processPacketDataResult.d(1);
                    processPacketDataResult.c(iE0);
                } else {
                    processPacketDataResult.d(4);
                }
            } else {
                processPacketDataResult.d(3);
            }
            return processPacketDataResult;
        } catch (Exception unused) {
            m8b.b("Data-Sync", m() + " errorPacketData=" + v2e.a(data));
            processPacketDataResult.d(3);
            return processPacketDataResult;
        }
    }

    public final int e0(WorkoutProto.SportsRecoveryHeartRateData prePacketData) {
        if (prePacketData.getDataCount() == 0) {
            return -1;
        }
        return prePacketData.getData(prePacketData.getDataCount() - 1).getSportsEndTime();
    }

    public final void f0(WorkoutProto.SportsRecoveryHeartRateData data) {
        if (data.getDataCount() == 0) {
            m8b.f("Data-Sync", "RecoveryHR=" + v2e.b(data));
            return;
        }
        for (WorkoutProto.RecoveryHeartRate recoveryHeartRate : data.getDataList()) {
            StringBuilder sb = new StringBuilder();
            ByteString.ByteIterator it = recoveryHeartRate.getHeartRate().iterator();
            while (it.hasNext()) {
                sb.append(((Byte) it.next()).byteValue() & 255);
                sb.append(com.heytap.device.data.storage.e.COMMA);
            }
            StringBuilder sb2 = new StringBuilder();
            for (Integer num : recoveryHeartRate.getOffsetList()) {
                Intrinsics.checkNotNullExpressionValue(num, "offset");
                sb2.append(num.intValue());
                sb2.append(com.heytap.device.data.storage.e.COMMA);
            }
            int startTime = recoveryHeartRate.getStartTime();
            StringBuilder sb3 = new StringBuilder();
            sb3.append("RecoveryHR startTime=");
            sb3.append(startTime);
            sb3.append(" data=");
            sb3.append((Object) sb);
            sb3.append(" offsets=");
            sb3.append((Object) sb2);
        }
    }

    @Override // com.heytap.device.data.sporthealth.pull.fetcher.h
    @NotNull
    public String m() {
        return "SportsRecoveryHRFetcher";
    }
}