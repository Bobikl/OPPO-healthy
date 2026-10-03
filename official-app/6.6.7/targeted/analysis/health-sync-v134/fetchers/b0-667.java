package com.heytap.device.data.sporthealth.pull.fetcher;

import com.heytap.health.protocol.fitness.FitnessProtoV2;
import com.oplus.aiunit.vision.ProcessPacketDataResult;
import com.oplus.aiunit.vision.if0;
import com.oplus.aiunit.vision.kq5;
import com.oplus.aiunit.vision.m8b;
import com.oplus.aiunit.vision.o3k;
import com.oplus.aiunit.vision.v2e;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes15.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\bH\u0002¨\u0006\r"}, d2 = {"Lcom/heytap/device/data/sporthealth/pull/fetcher/b0;", "Lcom/heytap/device/data/sporthealth/pull/fetcher/PacketDataFetcher;", kq5.NOT_SET, "m", kq5.NOT_SET, "data", "Lcom/oplus/aiunit/vision/kze;", "e", "Lcom/heytap/health/protocol/fitness/FitnessProtoV2$SunlightList;", kq5.NOT_SET, "e0", "<init>", "()V", "device_data_sync_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSunlightDataFetcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SunlightDataFetcher.kt\ncom/heytap/device/data/sporthealth/pull/fetcher/SunlightDataFetcher\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,85:1\n1855#2,2:86\n*S KotlinDebug\n*F\n+ 1 SunlightDataFetcher.kt\ncom/heytap/device/data/sporthealth/pull/fetcher/SunlightDataFetcher\n*L\n78#1:86,2\n*E\n"})
public final class b0 extends PacketDataFetcher {
    public b0() {
        super(5, 236, 236, 35);
    }

    @Override // com.heytap.device.data.sporthealth.pull.fetcher.PacketDataFetcher, com.oplus.aiunit.vision.jze
    @NotNull
    public ProcessPacketDataResult e(@NotNull byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        ProcessPacketDataResult processPacketDataResult = new ProcessPacketDataResult(1, 0);
        try {
            FitnessProtoV2.SunlightList from = FitnessProtoV2.SunlightList.parseFrom(data);
            if (from != null) {
                m8b.f("Data-Sync", "On sunlight data packet, index=" + T() + " dataSize=" + from.getDataList().size());
                List dataList = from.getDataList();
                Intrinsics.checkNotNullExpressionValue(dataList, "sunlightDetailData.dataList");
                if (!dataList.isEmpty()) {
                    e0(from);
                    com.heytap.device.data.storage.m.Companion companion = com.heytap.device.data.storage.m.INSTANCE;
                    String str = this.f;
                    Intrinsics.checkNotNullExpressionValue(str, "deviceMac");
                    if (companion.a(from, str)) {
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

    public final void e0(FitnessProtoV2.SunlightList data) {
        if (if0.w()) {
            m8b.f("Data-Sync", "Sunlight detail data size = " + data.getDataList().size());
            List dataList = data.getDataList();
            Intrinsics.checkNotNullExpressionValue(dataList, "data.dataList");
            if (!dataList.isEmpty()) {
                List<FitnessProtoV2.SunlightItem> dataList2 = data.getDataList();
                Intrinsics.checkNotNullExpressionValue(dataList2, "data.dataList");
                for (FitnessProtoV2.SunlightItem sunlightItem : dataList2) {
                    m8b.f("Data-Sync", "time = " + o3k.a(((long) sunlightItem.getTimestamp()) * 1000) + ", sunlight_exposed = " + sunlightItem.getSunlightExposed() + ", max_light_intensity = " + sunlightItem.getMaxLightIntensity());
                }
            }
        }
    }

    @Override // com.heytap.device.data.sporthealth.pull.fetcher.h
    @NotNull
    public String m() {
        return "SunlightDataFetcher";
    }
}