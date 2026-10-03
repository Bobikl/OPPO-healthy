package com.heytap.device.data.sporthealth.pull.fetcher;

import com.heytap.device.data.sporthealth.pull.fetcher.q;
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
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes15.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\nH\u0002J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0010H\u0002¨\u0006\u0014"}, d2 = {"Lcom/heytap/device/data/sporthealth/pull/fetcher/q;", "Lcom/heytap/device/data/sporthealth/pull/fetcher/PacketDataFetcher;", kq5.NOT_SET, "m", kq5.NOT_SET, "data", "Lcom/oplus/aiunit/vision/kze;", "e", "m0", "l0", "Lcom/heytap/health/protocol/fitness/FitnessProto$SensorOsaData;", "prePacketData", kq5.NOT_SET, "g0", kq5.NOT_SET, "h0", "Lcom/heytap/health/protocol/fitness/FitnessProtoV2$SensorOsaDataV2;", "i0", "<init>", "()V", "device_data_sync_impl_release"}, k = 1, mv = {1, 8, 0})
public final class q extends PacketDataFetcher {
    public q() {
        super(5, 100, 101, 22);
    }

    public static final String j0(FitnessProto.SensorOsaData sensorOsaData, int i) {
        Intrinsics.checkNotNullParameter(sensorOsaData, "$data");
        return sensorOsaData.getState(i) + com.heytap.device.data.storage.e.COMMA;
    }

    public static final String k0(FitnessProtoV2.SensorOsaDataV2 sensorOsaDataV2, int i) {
        Intrinsics.checkNotNullParameter(sensorOsaDataV2, "$data");
        return sensorOsaDataV2.getData(i).getState() + com.heytap.device.data.storage.e.COMMA;
    }

    @Override // com.heytap.device.data.sporthealth.pull.fetcher.PacketDataFetcher, com.oplus.aiunit.vision.jze
    @NotNull
    public ProcessPacketDataResult e(@NotNull byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return this.k ? m0(data) : l0(data);
    }

    public final int g0(FitnessProto.SensorOsaData prePacketData) {
        if (prePacketData.getStateCount() > 0) {
            return prePacketData.getStartTime() + ((prePacketData.getStateCount() - 1) * 60);
        }
        return 0;
    }

    public final void h0(final FitnessProto.SensorOsaData data) {
        if (if0.w()) {
            m8b.f("Data-Sync", "SensorOsa data startTime=" + o3k.a(((long) data.getStartTime()) * 1000) + ", totalCount=" + data.getStateCount());
            j6e.a("Data-Sync", "SensorOsa", data.getStateCount(), 60, new j6e.a() { // from class: com.oplus.aiunit.vision.dxg
                @Override // com.oplus.aiunit.vision.j6e.a
                public final String a(int i) {
                    return q.j0(data, i);
                }
            });
        }
    }

    public final void i0(final FitnessProtoV2.SensorOsaDataV2 data) {
        if (if0.w()) {
            m8b.f("Data-Sync", "SensorOsa data startTime=" + o3k.a(((long) data.getStartTime()) * 1000) + ", totalCount=" + data.getDataCount());
            j6e.a("Data-Sync", "SensorOsa", data.getDataCount(), 60, new j6e.a() { // from class: com.oplus.aiunit.vision.cxg
                @Override // com.oplus.aiunit.vision.j6e.a
                public final String a(int i) {
                    return q.k0(data, i);
                }
            });
        }
    }

    public final ProcessPacketDataResult l0(byte[] data) {
        ProcessPacketDataResult processPacketDataResult = new ProcessPacketDataResult(1, 0);
        try {
            FitnessProto.SensorOsaData from = FitnessProto.SensorOsaData.parseFrom(data);
            if (from != null) {
                m8b.f("Data-Sync", "On SensorOsaDataFetcher packet, index=" + T() + " startTime=" + o3k.a(((long) from.getStartTime()) * 1000) + " sensor_osa_data=" + from.getStateCount());
                h0(from);
                com.heytap.device.data.storage.i.Companion companion = com.heytap.device.data.storage.i.INSTANCE;
                String str = this.f;
                Intrinsics.checkNotNullExpressionValue(str, "deviceMac");
                if (companion.a(from, str)) {
                    int iG0 = g0(from);
                    if (iG0 > 0) {
                        u(getDataType(), iG0);
                        x(from.getStartTime());
                        w(iG0);
                        v(true);
                    }
                    processPacketDataResult.d(1);
                    processPacketDataResult.c(iG0);
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

    @Override // com.heytap.device.data.sporthealth.pull.fetcher.h
    @NotNull
    public String m() {
        return "SensorOsaDataFetcher";
    }

    public final ProcessPacketDataResult m0(byte[] data) {
        ProcessPacketDataResult processPacketDataResult = new ProcessPacketDataResult(1, 0);
        try {
            FitnessProtoV2.SensorOsaDataV2 from = FitnessProtoV2.SensorOsaDataV2.parseFrom(data);
            if (from != null) {
                m8b.f("Data-Sync", "On SensorOsaDataFetcher packet, startTime=" + o3k.a(((long) from.getStartTime()) * 1000) + " sensor osa size=" + from.getDataCount());
                List dataList = from.getDataList();
                if (dataList == null || dataList.isEmpty()) {
                    processPacketDataResult.d(1);
                    return processPacketDataResult;
                }
                i0(from);
                com.heytap.device.data.storage.i.Companion companion = com.heytap.device.data.storage.i.INSTANCE;
                String str = this.f;
                Intrinsics.checkNotNullExpressionValue(str, "deviceMac");
                if (companion.b(from, str)) {
                    int endTime = from.getEndTime();
                    if (endTime > 0) {
                        u(getDataType(), endTime);
                        x(from.getStartTime());
                        w(endTime);
                        v(true);
                    }
                    processPacketDataResult.d(1);
                    processPacketDataResult.c(endTime);
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
}