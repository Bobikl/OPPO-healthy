package com.heytap.device.data.sporthealth.pull.fetcher;

import com.google.protobuf.ByteString;
import com.heytap.device.data.storage.Spo2DataRepository;
import com.heytap.health.protocol.fitness.FitnessProto;
import com.oplus.aiunit.vision.ProcessPacketDataResult;
import com.oplus.aiunit.vision.if0;
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
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\bH\u0002¨\u0006\u0010"}, d2 = {"Lcom/heytap/device/data/sporthealth/pull/fetcher/u;", "Lcom/heytap/device/data/sporthealth/pull/fetcher/PacketDataFetcher;", kq5.NOT_SET, "m", kq5.NOT_SET, "data", "Lcom/oplus/aiunit/vision/kze;", "e", "Lcom/heytap/health/protocol/fitness/FitnessProto$Spo2Data;", "prePacketData", kq5.NOT_SET, "e0", kq5.NOT_SET, "f0", "<init>", "()V", "device_data_sync_impl_release"}, k = 1, mv = {1, 8, 0})
public final class u extends PacketDataFetcher {
    public u() {
        super(5, 23, 24, 4);
    }

    @Override // com.heytap.device.data.sporthealth.pull.fetcher.PacketDataFetcher, com.oplus.aiunit.vision.jze
    @NotNull
    public ProcessPacketDataResult e(@NotNull byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        ProcessPacketDataResult processPacketDataResult = new ProcessPacketDataResult(1, 0);
        try {
            FitnessProto.Spo2Data from = FitnessProto.Spo2Data.parseFrom(data);
            if (from != null) {
                m8b.f("Data-Sync", "On BloodOxygenData packet, index=" + T() + " startTime=" + o3k.a(((long) from.getStartTime()) * 1000) + " sleepSize=" + from.getSleepDataCount());
                f0(from);
                Spo2DataRepository.Companion companion = Spo2DataRepository.INSTANCE;
                String str = this.f;
                Intrinsics.checkNotNullExpressionValue(str, "deviceMac");
                if (companion.h(from, str)) {
                    int iE0 = e0(from);
                    if (iE0 > 0) {
                        u(getDataType(), iE0);
                        x(from.getStartTime());
                        w(iE0);
                        v(true);
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

    public final int e0(FitnessProto.Spo2Data prePacketData) {
        int startTime;
        List sleepDataList = prePacketData.getSleepDataList();
        int startTime2 = (sleepDataList == null || sleepDataList.size() <= 0) ? 0 : prePacketData.getStartTime() + (((FitnessProto.SPO2SleepData) CollectionsKt.last(sleepDataList)).getMinuteOffset() * 60) + 1;
        FitnessProto.SPO2NormalData normalData = prePacketData.getNormalData();
        return (normalData == null || normalData.getSecondOffsetList() == null || normalData.getSecondOffsetCount() <= 0 || (startTime = (prePacketData.getStartTime() + normalData.getSecondOffset(normalData.getSecondOffsetCount() + (-1))) + 1) <= startTime2) ? startTime2 : startTime;
    }

    public final void f0(FitnessProto.Spo2Data data) {
        if (if0.w()) {
            StringBuilder sb = new StringBuilder();
            List<FitnessProto.SPO2SleepData> sleepDataList = data.getSleepDataList();
            FitnessProto.SPO2NormalData normalData = data.getNormalData();
            if (sleepDataList != null) {
                for (FitnessProto.SPO2SleepData sPO2SleepData : sleepDataList) {
                    ByteString spo2 = sPO2SleepData.getSpo2();
                    sb.setLength(0);
                    int size = spo2.size();
                    for (int i = 0; i < size; i++) {
                        sb.append((int) spo2.byteAt(i));
                        sb.append(com.heytap.device.data.storage.e.COMMA);
                    }
                    m8b.f("Data-Sync", "Sleep SPO2 minute data startTime=" + o3k.a(((long) (data.getStartTime() + (sPO2SleepData.getMinuteOffset() * 60))) * 1000) + " size=" + spo2.size() + ", values=" + ((Object) sb));
                }
            }
            if (normalData != null) {
                sb.setLength(0);
                ByteString spo3 = normalData.getSpo2();
                List secondOffsetList = normalData.getSecondOffsetList();
                int size2 = spo3.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    sb.append((int) spo3.byteAt(i2));
                    sb.append("->");
                    Object obj = secondOffsetList.get(i2);
                    Intrinsics.checkNotNullExpressionValue(obj, "offsetList[i]");
                    sb.append(((Number) obj).intValue());
                    sb.append(com.heytap.device.data.storage.e.COMMA);
                }
                m8b.f("Data-Sync", "Normal SPO2 startTime=" + o3k.a(((long) data.getStartTime()) * 1000) + ", values=" + ((Object) sb));
            }
        }
    }

    @Override // com.heytap.device.data.sporthealth.pull.fetcher.h
    @NotNull
    public String m() {
        return "Spo2DataFetcher";
    }
}