package com.heytap.device.data.sporthealth.pull.fetcher;

import com.heytap.health.protocol.fitness.FitnessProto;
import com.oplus.aiunit.vision.ProcessPacketDataResult;
import com.oplus.aiunit.vision.gv4;
import com.oplus.aiunit.vision.if0;
import com.oplus.aiunit.vision.j6e;
import com.oplus.aiunit.vision.kq5;
import com.oplus.aiunit.vision.m8b;
import com.oplus.aiunit.vision.o3k;
import com.oplus.aiunit.vision.v2e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes15.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\bH\u0002J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\bH\u0002¨\u0006\u000f"}, d2 = {"Lcom/heytap/device/data/sporthealth/pull/fetcher/m;", "Lcom/heytap/device/data/sporthealth/pull/fetcher/PacketDataFetcher;", kq5.NOT_SET, "m", kq5.NOT_SET, "data", "Lcom/oplus/aiunit/vision/kze;", "e", "Lcom/heytap/health/protocol/fitness/FitnessProto$HrvData;", kq5.NOT_SET, "f0", kq5.NOT_SET, "g0", "<init>", "()V", "device_data_sync_impl_release"}, k = 1, mv = {1, 8, 0})
public final class m extends PacketDataFetcher {
    public m() {
        super(5, 57, 58, 15);
    }

    public static final String h0(FitnessProto.HrvData hrvData, int i) {
        Intrinsics.checkNotNullParameter(hrvData, "$data");
        return hrvData.getState(i) + com.heytap.device.data.storage.e.COMMA;
    }

    @Override // com.heytap.device.data.sporthealth.pull.fetcher.PacketDataFetcher, com.oplus.aiunit.vision.jze
    @NotNull
    public ProcessPacketDataResult e(@NotNull byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        ProcessPacketDataResult processPacketDataResult = new ProcessPacketDataResult(1, 0);
        try {
            FitnessProto.HrvData from = FitnessProto.HrvData.parseFrom(data);
            if (from != null) {
                g0(from);
                if (gv4.m(from, this.f)) {
                    int iF0 = f0(from);
                    u(getDataType(), iF0);
                    x(from.getStartTime());
                    w(iF0);
                    v(true);
                    processPacketDataResult.d(1);
                    processPacketDataResult.c(iF0);
                } else {
                    processPacketDataResult.d(4);
                }
            } else {
                processPacketDataResult.d(1);
            }
            return processPacketDataResult;
        } catch (Exception unused) {
            m8b.b("Data-Sync", m() + " errorPacketData=" + v2e.a(data));
            processPacketDataResult.d(3);
            return processPacketDataResult;
        }
    }

    public final int f0(FitnessProto.HrvData data) {
        return data.getStartTime() + ((data.getStateCount() - 1) * 60);
    }

    public final void g0(final FitnessProto.HrvData data) {
        if (if0.w()) {
            m8b.f("Data-Sync", "HRV data startTime=" + o3k.a(((long) data.getStartTime()) * 1000) + ", totalCount=" + data.getStateCount());
            j6e.a("Data-Sync", "HRV", data.getStateCount(), 60, new j6e.a() { // from class: com.oplus.aiunit.vision.mg8
                @Override // com.oplus.aiunit.vision.j6e.a
                public final String a(int i) {
                    return com.heytap.device.data.sporthealth.pull.fetcher.m.h0(data, i);
                }
            });
        }
    }

    @Override // com.heytap.device.data.sporthealth.pull.fetcher.h
    @NotNull
    public String m() {
        return "HRVDataFetcher";
    }
}