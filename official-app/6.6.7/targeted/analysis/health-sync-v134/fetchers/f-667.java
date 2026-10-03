package com.heytap.device.data.sporthealth.pull.fetcher;

import com.heytap.health.protocol.fitness.FitnessProto;
import com.heytap.health.protocol.fitness.FitnessProtoV2;
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
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u001e\u0010\r\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u001e\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¨\u0006\u0012"}, d2 = {"Lcom/heytap/device/data/sporthealth/pull/fetcher/f;", "Lcom/heytap/device/data/sporthealth/pull/fetcher/PacketDataFetcher;", kq5.NOT_SET, "m", kq5.NOT_SET, "data", "Lcom/oplus/aiunit/vision/kze;", "e", kq5.NOT_SET, "Lcom/heytap/health/protocol/fitness/FitnessProto$BreatheRateDetailData;", "prePacketData", kq5.NOT_SET, "dataStartTime", "e0", kq5.NOT_SET, "f0", "<init>", "()V", "device_data_sync_impl_release"}, k = 1, mv = {1, 8, 0})
public final class f extends PacketDataFetcher {
    public f() {
        super(5, 96, 97, 20);
    }

    @Override // com.heytap.device.data.sporthealth.pull.fetcher.PacketDataFetcher, com.oplus.aiunit.vision.jze
    @NotNull
    public ProcessPacketDataResult e(@NotNull byte[] data) {
        List<FitnessProto.BreatheRateDetailData> dataList;
        int startTime;
        Intrinsics.checkNotNullParameter(data, "data");
        ProcessPacketDataResult processPacketDataResult = new ProcessPacketDataResult(1, 0);
        try {
            if (this.k) {
                FitnessProtoV2.BreatheRateDataV2 from = FitnessProtoV2.BreatheRateDataV2.parseFrom(data);
                dataList = from.getDataList();
                startTime = from.getStartTime();
            } else {
                FitnessProto.BreatheRateData from2 = FitnessProto.BreatheRateData.parseFrom(data);
                dataList = from2.getDataList();
                startTime = from2.getStartTime();
            }
            m8b.f("Data-Sync", "On breathe rate data, startTime=" + o3k.a(((long) startTime) * 1000) + " data size=" + dataList.size());
            if (dataList.isEmpty()) {
                processPacketDataResult.d(1);
            } else {
                f0(dataList, startTime);
                com.heytap.device.data.storage.c.Companion companion = com.heytap.device.data.storage.c.INSTANCE;
                String str = this.f;
                Intrinsics.checkNotNullExpressionValue(str, "deviceMac");
                if (companion.a(dataList, startTime, str)) {
                    int iE0 = e0(dataList, startTime);
                    if (iE0 > 0) {
                        u(getDataType(), iE0);
                        x(startTime);
                        w(iE0);
                        v(true);
                        processPacketDataResult.d(1);
                        processPacketDataResult.c(iE0);
                    }
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

    public final int e0(List<FitnessProto.BreatheRateDetailData> prePacketData, int dataStartTime) {
        if (!prePacketData.isEmpty()) {
            return dataStartTime + (((FitnessProto.BreatheRateDetailData) CollectionsKt.last(prePacketData)).getMinuteOffset() * 60);
        }
        return 0;
    }

    public final void f0(List<FitnessProto.BreatheRateDetailData> data, int dataStartTime) {
        if (if0.w() && (!data.isEmpty())) {
            int size = data.size();
            for (int i = 0; i < size; i++) {
                int minuteOffset = (data.get(i).getMinuteOffset() * 60) + dataStartTime;
                int breatheData = data.get(i).getBreatheData() & 3;
                int breatheData2 = data.get(i).getBreatheData() >> 2;
                m8b.f("Data-Sync", "Breathe rate data startTime=" + o3k.a(((long) minuteOffset) * 1000) + " confi=" + breatheData + ", breatheValue=" + breatheData2);
            }
        }
    }

    @Override // com.heytap.device.data.sporthealth.pull.fetcher.h
    @NotNull
    public String m() {
        return "BreatheRateDataFetcher";
    }
}