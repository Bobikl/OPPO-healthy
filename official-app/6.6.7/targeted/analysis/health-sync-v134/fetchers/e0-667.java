package com.heytap.device.data.sporthealth.pull.fetcher;

import com.heytap.health.protocol.fitness.FitnessProto;
import com.heytap.health.protocol.fitness.FitnessProtoV2;
import com.oplus.aiunit.vision.ProcessPacketDataResult;
import com.oplus.aiunit.vision.if0;
import com.oplus.aiunit.vision.j6e;
import com.oplus.aiunit.vision.kq5;
import com.oplus.aiunit.vision.m8b;
import com.oplus.aiunit.vision.o3k;
import com.oplus.aiunit.vision.v2e;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes15.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u001e\u0010\f\u001a\u00020\n2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u001e\u0010\u000e\u001a\u00020\r2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¨\u0006\u0011"}, d2 = {"Lcom/heytap/device/data/sporthealth/pull/fetcher/e0;", "Lcom/heytap/device/data/sporthealth/pull/fetcher/PacketDataFetcher;", kq5.NOT_SET, "m", kq5.NOT_SET, "data", "Lcom/oplus/aiunit/vision/kze;", "e", kq5.NOT_SET, "Lcom/heytap/health/protocol/fitness/FitnessProto$WristTemperatureRecord;", kq5.NOT_SET, "dataStartTime", "f0", kq5.NOT_SET, "g0", "<init>", "()V", "device_data_sync_impl_release"}, k = 1, mv = {1, 8, 0})
public final class e0 extends PacketDataFetcher {
    public e0() {
        super(5, 120, 121, 28);
    }

    public static final String h0(List list, int i, int i2) {
        Intrinsics.checkNotNullParameter(list, "$data");
        FitnessProto.WristTemperatureRecord wristTemperatureRecord = (FitnessProto.WristTemperatureRecord) list.get(i2);
        return " time = " + o3k.a(((long) (i + (wristTemperatureRecord.getMinuteOffset() * 60))) * 1000) + " status = " + (wristTemperatureRecord.getValue() & 3) + " confidence = " + ((wristTemperatureRecord.getValue() >> 2) & 1) + " value = " + ((wristTemperatureRecord.getValue() >> 3) & 8191);
    }

    @Override // com.heytap.device.data.sporthealth.pull.fetcher.PacketDataFetcher, com.oplus.aiunit.vision.jze
    @NotNull
    public ProcessPacketDataResult e(@NotNull byte[] data) {
        List<FitnessProto.WristTemperatureRecord> recordsList;
        int startTime;
        Intrinsics.checkNotNullParameter(data, "data");
        ProcessPacketDataResult processPacketDataResult = new ProcessPacketDataResult(1, 0);
        try {
            if (this.k) {
                FitnessProtoV2.WristTemperatureDataV2 from = FitnessProtoV2.WristTemperatureDataV2.parseFrom(data);
                recordsList = from.getRecordsList();
                startTime = from.getStartTime();
            } else {
                FitnessProto.WristTemperatureData from2 = FitnessProto.WristTemperatureData.parseFrom(data);
                recordsList = from2.getRecordsList();
                startTime = from2.getStartTime();
            }
            List<FitnessProto.WristTemperatureRecord> list = recordsList;
            if (list == null || list.isEmpty()) {
                processPacketDataResult.d(1);
            } else {
                m8b.f("Data-Sync", "On WristTemperature packet, index = " + T() + " time = " + o3k.a(((long) startTime) * 1000));
                g0(recordsList, startTime);
                com.heytap.device.data.storage.o.Companion companion = com.heytap.device.data.storage.o.INSTANCE;
                String str = this.f;
                Intrinsics.checkNotNullExpressionValue(str, "deviceMac");
                if (companion.a(recordsList, startTime, str)) {
                    int iF0 = f0(recordsList, startTime);
                    u(getDataType(), iF0);
                    x(startTime);
                    w(iF0);
                    v(true);
                    processPacketDataResult.d(1);
                    processPacketDataResult.c(iF0);
                } else {
                    processPacketDataResult.d(4);
                }
            }
            return processPacketDataResult;
        } catch (Exception unused) {
            m8b.b("Data-Sync", m() + " errorPacketData=" + v2e.a(data));
            processPacketDataResult.d(3);
            return processPacketDataResult;
        }
    }

    public final int f0(List<FitnessProto.WristTemperatureRecord> data, int dataStartTime) {
        return data.isEmpty() ? dataStartTime : dataStartTime + (((FitnessProto.WristTemperatureRecord) CollectionsKt.last(data)).getMinuteOffset() * 60) + 60;
    }

    public final void g0(final List<FitnessProto.WristTemperatureRecord> data, final int dataStartTime) {
        if (if0.w()) {
            m8b.f("Data-Sync", "WristTemperature Data startTime=" + o3k.a(((long) dataStartTime) * 1000) + ", totalCount=" + data.size());
            j6e.a("Data-Sync", "WristTemperature", data.size(), 60, new j6e.a() { // from class: com.oplus.aiunit.vision.x6m
                @Override // com.oplus.aiunit.vision.j6e.a
                public final String a(int i) {
                    return com.heytap.device.data.sporthealth.pull.fetcher.e0.h0(data, dataStartTime, i);
                }
            });
        }
    }

    @Override // com.heytap.device.data.sporthealth.pull.fetcher.h
    @NotNull
    public String m() {
        return "WristTemperatureDataFetcher";
    }
}