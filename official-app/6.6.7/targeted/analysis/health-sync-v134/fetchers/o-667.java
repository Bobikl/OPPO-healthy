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
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\bH\u0002¨\u0006\r"}, d2 = {"Lcom/heytap/device/data/sporthealth/pull/fetcher/o;", "Lcom/heytap/device/data/sporthealth/pull/fetcher/PacketDataFetcher;", kq5.NOT_SET, "m", kq5.NOT_SET, "data", "Lcom/oplus/aiunit/vision/kze;", "e", "Lcom/heytap/health/protocol/fitness/FitnessProtoV2$PhysicalMentalHealthIndexData;", kq5.NOT_SET, "e0", "<init>", "()V", "device_data_sync_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPhysicalMentalHealthIndexDataFetcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PhysicalMentalHealthIndexDataFetcher.kt\ncom/heytap/device/data/sporthealth/pull/fetcher/PhysicalMentalHealthIndexDataFetcher\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,85:1\n1855#2,2:86\n*S KotlinDebug\n*F\n+ 1 PhysicalMentalHealthIndexDataFetcher.kt\ncom/heytap/device/data/sporthealth/pull/fetcher/PhysicalMentalHealthIndexDataFetcher\n*L\n78#1:86,2\n*E\n"})
public final class o extends PacketDataFetcher {
    public o() {
        super(5, 199, 199, 33);
    }

    @Override // com.heytap.device.data.sporthealth.pull.fetcher.PacketDataFetcher, com.oplus.aiunit.vision.jze
    @NotNull
    public ProcessPacketDataResult e(@NotNull byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        ProcessPacketDataResult processPacketDataResult = new ProcessPacketDataResult(1, 0);
        try {
            FitnessProtoV2.PhysicalMentalHealthIndexData from = FitnessProtoV2.PhysicalMentalHealthIndexData.parseFrom(data);
            if (from != null) {
                m8b.f("Data-Sync", "On physical mental health index data packet, index=" + T() + " dataSize=" + from.getDataList().size());
                List dataList = from.getDataList();
                Intrinsics.checkNotNullExpressionValue(dataList, "physicalMentalHealthIndexData.dataList");
                if (!dataList.isEmpty()) {
                    e0(from);
                    com.heytap.device.data.storage.g.Companion companion = com.heytap.device.data.storage.g.INSTANCE;
                    String str = this.f;
                    Intrinsics.checkNotNullExpressionValue(str, "deviceMac");
                    if (companion.c(from, str)) {
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

    public final void e0(FitnessProtoV2.PhysicalMentalHealthIndexData data) {
        if (if0.w()) {
            m8b.f("Data-Sync", "Physical mental health data size = " + data.getDataList().size());
            List dataList = data.getDataList();
            Intrinsics.checkNotNullExpressionValue(dataList, "data.dataList");
            if (!dataList.isEmpty()) {
                List<FitnessProtoV2.PhysicalMentalHealthIndexDataItme> dataList2 = data.getDataList();
                Intrinsics.checkNotNullExpressionValue(dataList2, "data.dataList");
                for (FitnessProtoV2.PhysicalMentalHealthIndexDataItme physicalMentalHealthIndexDataItme : dataList2) {
                    m8b.f("Data-Sync", "time = " + o3k.a(((long) physicalMentalHealthIndexDataItme.getDayStartTime()) * 1000) + ", " + v2e.b(physicalMentalHealthIndexDataItme));
                }
            }
        }
    }

    @Override // com.heytap.device.data.sporthealth.pull.fetcher.h
    @NotNull
    public String m() {
        return "PhysicalMentalHealthIndexDataFetcher";
    }
}