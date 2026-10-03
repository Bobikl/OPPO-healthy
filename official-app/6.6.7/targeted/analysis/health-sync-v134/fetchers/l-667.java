package com.heytap.device.data.sporthealth.pull.fetcher;

import com.heytap.health.protocol.fitness.FitnessProto;
import com.heytap.health.protocol.fitness.FitnessProtoV2;
import com.oplus.aiunit.vision.ProcessPacketDataResult;
import com.oplus.aiunit.vision.kq5;
import com.oplus.aiunit.vision.m8b;
import com.oplus.aiunit.vision.v2e;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes15.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0016\u0010\u000b\u001a\u00020\n2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¨\u0006\u000e"}, d2 = {"Lcom/heytap/device/data/sporthealth/pull/fetcher/l;", "Lcom/heytap/device/data/sporthealth/pull/fetcher/PacketDataFetcher;", kq5.NOT_SET, "m", kq5.NOT_SET, "data", "Lcom/oplus/aiunit/vision/kze;", "e", kq5.NOT_SET, "Lcom/heytap/health/protocol/fitness/FitnessProto$HeartRateContent;", kq5.NOT_SET, "e0", "<init>", "()V", "device_data_sync_impl_release"}, k = 1, mv = {1, 8, 0})
public final class l extends PacketDataFetcher {
    public l() {
        super(5, 46, 47, 13);
    }

    @Override // com.heytap.device.data.sporthealth.pull.fetcher.PacketDataFetcher, com.oplus.aiunit.vision.jze
    @NotNull
    public ProcessPacketDataResult e(@NotNull byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        ProcessPacketDataResult processPacketDataResult = new ProcessPacketDataResult(1, 0);
        try {
            List<FitnessProto.HeartRateContent> dataList = this.k ? FitnessProtoV2.HeartRateNoticeDataV2.parseFrom(data).getDataList() : FitnessProto.HeartRateNoticeData.parseFrom(data).getDataList();
            List<FitnessProto.HeartRateContent> list = dataList;
            if (list == null || list.isEmpty()) {
                processPacketDataResult.d(1);
            } else {
                String strB = v2e.b(dataList);
                StringBuilder sb = new StringBuilder();
                sb.append("HeartRateNotice data=");
                sb.append(strB);
                com.heytap.device.data.storage.f.Companion companion = com.heytap.device.data.storage.f.INSTANCE;
                String str = this.f;
                Intrinsics.checkNotNullExpressionValue(str, "deviceMac");
                if (companion.c(dataList, str)) {
                    int iE0 = e0(dataList);
                    u(getDataType(), iE0);
                    if (!(data.length == 0)) {
                        x(((FitnessProto.HeartRateContent) CollectionsKt.first(dataList)).getStartTime());
                        w(iE0);
                        v(true);
                    }
                    processPacketDataResult.d(1);
                    processPacketDataResult.c(iE0);
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

    public final int e0(List<FitnessProto.HeartRateContent> data) {
        if (!data.isEmpty()) {
            return ((FitnessProto.HeartRateContent) CollectionsKt.last(data)).getEndTime();
        }
        return 0;
    }

    @Override // com.heytap.device.data.sporthealth.pull.fetcher.h
    @NotNull
    public String m() {
        return "HRNoticeDataFetcher";
    }
}