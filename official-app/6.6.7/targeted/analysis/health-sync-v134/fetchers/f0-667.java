package com.heytap.device.data.sporthealth.pull.fetcher;

import com.heytap.device.data.sporthealth.pull.fetcher.f0;
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
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0016\u0010\u000b\u001a\u00020\n2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002J\u0016\u0010\r\u001a\u00020\f2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¨\u0006\u0010"}, d2 = {"Lcom/heytap/device/data/sporthealth/pull/fetcher/f0;", "Lcom/heytap/device/data/sporthealth/pull/fetcher/PacketDataFetcher;", kq5.NOT_SET, "m", kq5.NOT_SET, "data", "Lcom/oplus/aiunit/vision/kze;", "e", kq5.NOT_SET, "Lcom/heytap/health/protocol/fitness/FitnessProto$WristTemperatureIndex;", kq5.NOT_SET, "f0", kq5.NOT_SET, "g0", "<init>", "()V", "device_data_sync_impl_release"}, k = 1, mv = {1, 8, 0})
public final class f0 extends PacketDataFetcher {
    public f0() {
        super(5, 122, 123, 29);
    }

    public static final String h0(List list, int i) {
        Intrinsics.checkNotNullParameter(list, "$data");
        FitnessProto.WristTemperatureIndex wristTemperatureIndex = (FitnessProto.WristTemperatureIndex) list.get(i);
        return " time = " + o3k.a(((long) wristTemperatureIndex.getTimeStamp()) * 1000) + "  typical_value = " + wristTemperatureIndex.getTypicalValue() + " confidence = " + wristTemperatureIndex.getConfidence() + "  baseline_day_value = " + wristTemperatureIndex.getBaselineDay() + " symptoms = " + wristTemperatureIndex.getSymptoms() + " actions=" + wristTemperatureIndex.getBehaviors();
    }

    @Override // com.heytap.device.data.sporthealth.pull.fetcher.PacketDataFetcher, com.oplus.aiunit.vision.jze
    @NotNull
    public ProcessPacketDataResult e(@NotNull byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        ProcessPacketDataResult processPacketDataResult = new ProcessPacketDataResult(1, 0);
        try {
            List<FitnessProto.WristTemperatureIndex> recordsList = this.k ? FitnessProtoV2.WristTemperatureStatisticsDataV2.parseFrom(data).getRecordsList() : FitnessProto.WristTemperatureIndexPacket.parseFrom(data).getRecordsList();
            List<FitnessProto.WristTemperatureIndex> list = recordsList;
            if (list == null || list.isEmpty()) {
                processPacketDataResult.d(1);
            } else {
                m8b.f("Data-Sync", "On WristTemperatureIndex packet, index = " + T() + " Size = " + recordsList.size());
                g0(recordsList);
                com.heytap.device.data.storage.o.Companion companion = com.heytap.device.data.storage.o.INSTANCE;
                String str = this.f;
                Intrinsics.checkNotNullExpressionValue(str, "deviceMac");
                if (companion.b(recordsList, str)) {
                    int iF0 = f0(recordsList);
                    u(getDataType(), iF0);
                    x(((FitnessProto.WristTemperatureIndex) CollectionsKt.first(recordsList)).getTimeStamp());
                    w(iF0 + 60);
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

    public final int f0(List<FitnessProto.WristTemperatureIndex> data) {
        return ((FitnessProto.WristTemperatureIndex) CollectionsKt.last(data)).getTimeStamp();
    }

    public final void g0(final List<FitnessProto.WristTemperatureIndex> data) {
        if (if0.w()) {
            m8b.f("Data-Sync", "WristTemperature Data startTime=" + o3k.a(((long) ((FitnessProto.WristTemperatureIndex) CollectionsKt.first(data)).getTimeStamp()) * 1000) + ", totalCount=" + data.size());
            j6e.a("Data-Sync", "WristTemperatureIndex", data.size(), 60, new j6e.a() { // from class: com.oplus.aiunit.vision.z7m
                @Override // com.oplus.aiunit.vision.j6e.a
                public final String a(int i) {
                    return f0.h0(data, i);
                }
            });
        }
    }

    @Override // com.heytap.device.data.sporthealth.pull.fetcher.h
    @NotNull
    public String m() {
        return "WristTemperatureIndexDataFetcher";
    }
}