package com.heytap.device.data.sporthealth.pull.fetcher;

import com.heytap.device.data.sporthealth.pull.fetcher.a0;
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
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u001e\u0010\f\u001a\u00020\n2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u001e\u0010\u000e\u001a\u00020\r2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¨\u0006\u0011"}, d2 = {"Lcom/heytap/device/data/sporthealth/pull/fetcher/a0;", "Lcom/heytap/device/data/sporthealth/pull/fetcher/PacketDataFetcher;", kq5.NOT_SET, "m", kq5.NOT_SET, "data", "Lcom/oplus/aiunit/vision/kze;", "e", kq5.NOT_SET, "Lcom/heytap/health/protocol/fitness/FitnessProto$StressItem;", kq5.NOT_SET, "dataStartTime", "f0", kq5.NOT_SET, "g0", "<init>", "()V", "device_data_sync_impl_release"}, k = 1, mv = {1, 8, 0})
public final class a0 extends PacketDataFetcher {
    public a0() {
        super(5, 34, 35, 8);
    }

    public static final String h0(List list, int i) {
        Intrinsics.checkNotNullParameter(list, "$data");
        FitnessProto.StressItem stressItem = (FitnessProto.StressItem) list.get(i);
        return " value = " + stressItem.getStress() + " minuteOffset = " + stressItem.getMinuteOffset() + " sdnn = " + stressItem.getSdnn() + " rmssd = " + stressItem.getRmssd() + ";    ";
    }

    @Override // com.heytap.device.data.sporthealth.pull.fetcher.PacketDataFetcher, com.oplus.aiunit.vision.jze
    @NotNull
    public ProcessPacketDataResult e(@NotNull byte[] data) {
        List<FitnessProto.StressItem> dataList;
        int startTime;
        Intrinsics.checkNotNullParameter(data, "data");
        ProcessPacketDataResult processPacketDataResult = new ProcessPacketDataResult(1, 0);
        try {
            if (this.k) {
                FitnessProtoV2.StressDataV2 from = FitnessProtoV2.StressDataV2.parseFrom(data);
                dataList = from.getDataList();
                startTime = from.getStartTime();
            } else {
                FitnessProto.StressData from2 = FitnessProto.StressData.parseFrom(data);
                dataList = from2.getDataList();
                startTime = from2.getStartTime();
            }
            List<FitnessProto.StressItem> list = dataList;
            if (list == null || list.isEmpty()) {
                processPacketDataResult.d(1);
            } else {
                g0(dataList, startTime);
                com.heytap.device.data.storage.l.Companion companion = com.heytap.device.data.storage.l.INSTANCE;
                String str = this.f;
                Intrinsics.checkNotNullExpressionValue(str, "deviceMac");
                if (companion.a(dataList, startTime, str)) {
                    int iF0 = f0(dataList, startTime);
                    u(getDataType(), iF0);
                    x(startTime);
                    w(this.k ? iF0 : iF0 - 1);
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

    public final int f0(List<FitnessProto.StressItem> data, int dataStartTime) {
        if (!data.isEmpty()) {
            return dataStartTime + (this.k ? (data.size() - 1) * 60 : ((data.size() - 1) * 60) + 1);
        }
        return dataStartTime;
    }

    public final void g0(final List<FitnessProto.StressItem> data, int dataStartTime) {
        if (if0.w()) {
            m8b.f("Data-Sync", "Stress data startTime= " + o3k.a(((long) dataStartTime) * 1000) + ", totalCount=" + data.size());
            j6e.a("Data-Sync", "Stress", data.size(), 60, new j6e.a() { // from class: com.oplus.aiunit.vision.d1j
                @Override // com.oplus.aiunit.vision.j6e.a
                public final String a(int i) {
                    return a0.h0(data, i);
                }
            });
        }
    }

    @Override // com.heytap.device.data.sporthealth.pull.fetcher.h
    @NotNull
    public String m() {
        return "StressDataFetcher";
    }
}