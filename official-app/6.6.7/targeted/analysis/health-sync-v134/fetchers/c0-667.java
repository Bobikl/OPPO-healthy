package com.heytap.device.data.sporthealth.pull.fetcher;

import com.heytap.health.protocol.fitness.FitnessProtoV2;
import com.oplus.aiunit.vision.ProcessPacketDataResult;
import com.oplus.aiunit.vision.if0;
import com.oplus.aiunit.vision.kq5;
import com.oplus.aiunit.vision.m8b;
import com.oplus.aiunit.vision.o3k;
import com.oplus.aiunit.vision.v2e;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes15.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\bH\u0002¨\u0006\r"}, d2 = {"Lcom/heytap/device/data/sporthealth/pull/fetcher/c0;", "Lcom/heytap/device/data/sporthealth/pull/fetcher/PacketDataFetcher;", kq5.NOT_SET, "m", kq5.NOT_SET, "data", "Lcom/oplus/aiunit/vision/kze;", "e", "Lcom/heytap/health/protocol/fitness/FitnessProtoV2$SunlightStatList;", kq5.NOT_SET, "e0", "<init>", "()V", "device_data_sync_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSunlightStatDataFetcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SunlightStatDataFetcher.kt\ncom/heytap/device/data/sporthealth/pull/fetcher/SunlightStatDataFetcher\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,100:1\n766#2:101\n857#2,2:102\n1855#2,2:104\n*S KotlinDebug\n*F\n+ 1 SunlightStatDataFetcher.kt\ncom/heytap/device/data/sporthealth/pull/fetcher/SunlightStatDataFetcher\n*L\n51#1:101\n51#1:102,2\n93#1:104,2\n*E\n"})
public final class c0 extends PacketDataFetcher {
    public c0() {
        super(5, 237, 237, 36);
    }

    @Override // com.heytap.device.data.sporthealth.pull.fetcher.PacketDataFetcher, com.oplus.aiunit.vision.jze
    @NotNull
    public ProcessPacketDataResult e(@NotNull byte[] data) {
        boolean z;
        Intrinsics.checkNotNullParameter(data, "data");
        ProcessPacketDataResult processPacketDataResult = new ProcessPacketDataResult(1, 0);
        try {
            FitnessProtoV2.SunlightStatList from = FitnessProtoV2.SunlightStatList.parseFrom(data);
            if (from != null) {
                m8b.f("Data-Sync", "On sunlight stat data packet, index=" + T() + " dataSize=" + from.getDataList().size());
                List dataList = from.getDataList();
                Intrinsics.checkNotNullExpressionValue(dataList, "sunlightStatData.dataList");
                if (!dataList.isEmpty()) {
                    List dataList2 = from.getDataList();
                    Intrinsics.checkNotNullExpressionValue(dataList2, "sunlightStatData.dataList");
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : dataList2) {
                        FitnessProtoV2.SunlightStat sunlightStat = (FitnessProtoV2.SunlightStat) obj;
                        if (sunlightStat.getTotalSunlightDuration() > 0 || sunlightStat.getIsValidSunshine() == 1) {
                            z = true;
                        } else {
                            long timestamp = ((long) sunlightStat.getTimestamp()) * 1000;
                            m8b.f("Data-Sync", "skip invalid sunshine stat, is_valid_sunshine=" + sunlightStat.getIsValidSunshine() + ", totalSunlightDuration=" + sunlightStat.getTotalSunlightDuration() + ", time=" + o3k.a(timestamp));
                            z = false;
                        }
                        if (z) {
                            arrayList.add(obj);
                        }
                    }
                    FitnessProtoV2.SunlightStatList sunlightStatList = arrayList.size() == from.getDataList().size() ? from : (FitnessProtoV2.SunlightStatList) from.toBuilder().clearData().addAllData(arrayList).build();
                    Intrinsics.checkNotNullExpressionValue(sunlightStatList, "dataToSave");
                    e0(sunlightStatList);
                    com.heytap.device.data.storage.m.Companion companion = com.heytap.device.data.storage.m.INSTANCE;
                    String str = this.f;
                    Intrinsics.checkNotNullExpressionValue(str, "deviceMac");
                    if (companion.b(sunlightStatList, str)) {
                        int endTime = from.getEndTime();
                        if (endTime > 0) {
                            u(getDataType(), endTime);
                            x(from.getStartTime());
                            w(endTime);
                            v(true);
                            processPacketDataResult.d(1);
                            processPacketDataResult.c(endTime);
                        }
                    } else {
                        processPacketDataResult.d(4);
                    }
                } else {
                    processPacketDataResult.d(1);
                }
            }
            return processPacketDataResult;
        } catch (Exception unused) {
            m8b.b("Data-Sync", m() + " errorPacketData=" + v2e.a(data));
            processPacketDataResult.d(3);
            return processPacketDataResult;
        }
    }

    public final void e0(FitnessProtoV2.SunlightStatList data) {
        if (if0.w()) {
            m8b.f("Data-Sync", "Sunlight stat data size = " + data.getDataList().size());
            List dataList = data.getDataList();
            Intrinsics.checkNotNullExpressionValue(dataList, "data.dataList");
            if (!dataList.isEmpty()) {
                List<FitnessProtoV2.SunlightStat> dataList2 = data.getDataList();
                Intrinsics.checkNotNullExpressionValue(dataList2, "data.dataList");
                for (FitnessProtoV2.SunlightStat sunlightStat : dataList2) {
                    m8b.f("Data-Sync", "time = " + o3k.a(((long) sunlightStat.getTimestamp()) * 1000) + ", " + v2e.b(sunlightStat));
                }
            }
        }
    }

    @Override // com.heytap.device.data.sporthealth.pull.fetcher.h
    @NotNull
    public String m() {
        return "SunlightStatDataFetcher";
    }
}