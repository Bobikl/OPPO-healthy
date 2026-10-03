package com.heytap.device.data.sporthealth.pull.fetcher;

import com.heytap.device.data.sporthealth.pull.fetcher.k;
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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes15.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\u0018\u0000 \u00162\u00020\u0001:\u0001\u0017B'\u0012\u0006\u0010\u0010\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\n\u0012\u0006\u0010\u0012\u001a\u00020\n\u0012\u0006\u0010\u0013\u001a\u00020\n¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J&\u0010\r\u001a\u00020\n2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0002J\u001e\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\f\u001a\u00020\nH\u0002¨\u0006\u0018"}, d2 = {"Lcom/heytap/device/data/sporthealth/pull/fetcher/k;", "Lcom/heytap/device/data/sporthealth/pull/fetcher/PacketDataFetcher;", kq5.NOT_SET, "m", kq5.NOT_SET, "data", "Lcom/oplus/aiunit/vision/kze;", "e", kq5.NOT_SET, "Lcom/heytap/health/protocol/fitness/FitnessProto$HeartRateItem;", kq5.NOT_SET, "interval", "dataStartTime", "f0", kq5.NOT_SET, "g0", "sid", "indexCid", "detailCid", "dataType", "<init>", "(IIII)V", "Companion", "a", "device_data_sync_impl_release"}, k = 1, mv = {1, 8, 0})
public final class k extends PacketDataFetcher {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.heytap.device.data.sporthealth.pull.fetcher.k$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002¨\u0006\u0007"}, d2 = {"Lcom/heytap/device/data/sporthealth/pull/fetcher/k$a;", kq5.NOT_SET, "Lcom/heytap/device/data/sporthealth/pull/fetcher/k;", "a", "b", "<init>", "()V", "device_data_sync_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final k a() {
            return new k(5, 11, 12, 2);
        }

        @NotNull
        public final k b() {
            return new k(5, 17, 18, 6);
        }
    }

    public k(int i, int i2, int i3, int i4) {
        super(i, i2, i3, i4);
    }

    public static final String h0(List list, k kVar, int i) {
        Intrinsics.checkNotNullParameter(list, "$data");
        Intrinsics.checkNotNullParameter(kVar, "this$0");
        FitnessProto.HeartRateItem heartRateItem = (FitnessProto.HeartRateItem) list.get(i);
        return heartRateItem.getHeartRate() + com.heytap.device.data.storage.e.COMMA + (kVar.getDataType() == 6 ? 1 : heartRateItem.getType()) + com.heytap.device.data.storage.e.COMMA + heartRateItem.getTimeOffset() + ";";
    }

    @Override // com.heytap.device.data.sporthealth.pull.fetcher.PacketDataFetcher, com.oplus.aiunit.vision.jze
    @NotNull
    public ProcessPacketDataResult e(@NotNull byte[] data) {
        List<FitnessProto.HeartRateItem> dataList;
        int interval;
        int startTime;
        Intrinsics.checkNotNullParameter(data, "data");
        ProcessPacketDataResult processPacketDataResult = new ProcessPacketDataResult(1, 0);
        try {
            if (this.k) {
                FitnessProtoV2.HeartRateDataV2 from = FitnessProtoV2.HeartRateDataV2.parseFrom(data);
                dataList = from.getDataList();
                startTime = from.getStartTime();
                interval = 1;
            } else {
                FitnessProto.HeartRateData from2 = FitnessProto.HeartRateData.parseFrom(data);
                dataList = from2.getDataList();
                int startTime2 = from2.getStartTime();
                interval = from2.getInterval();
                startTime = startTime2;
            }
            List<FitnessProto.HeartRateItem> list = dataList;
            if (list == null || list.isEmpty()) {
                processPacketDataResult.d(1);
            } else {
                g0(dataList, startTime);
                com.heytap.device.data.storage.f.Companion companion = com.heytap.device.data.storage.f.INSTANCE;
                String str = this.f;
                Intrinsics.checkNotNullExpressionValue(str, "deviceMac");
                if (companion.b(dataList, interval, startTime, str, getDataType())) {
                    int iF0 = f0(dataList, interval, startTime);
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

    public final int f0(List<FitnessProto.HeartRateItem> data, int interval, int dataStartTime) {
        if (!data.isEmpty()) {
            if (interval == 0) {
                interval = 60;
            }
            dataStartTime += ((FitnessProto.HeartRateItem) CollectionsKt.last(data)).getTimeOffset() * interval;
        }
        return this.k ? dataStartTime : dataStartTime + 1;
    }

    public final void g0(final List<FitnessProto.HeartRateItem> data, int dataStartTime) {
        if (if0.w()) {
            int size = data.size();
            int iCoerceAtMost = 0;
            int iCoerceAtLeast = 0;
            int iCoerceAtMost2 = 0;
            for (int i = 0; i < size; i++) {
                if (getDataType() == 6) {
                    if (iCoerceAtMost2 == 0) {
                        iCoerceAtMost2 = data.get(i).getHeartRate();
                    }
                    iCoerceAtMost2 = RangesKt.coerceAtMost(iCoerceAtMost2, data.get(i).getHeartRate());
                } else {
                    iCoerceAtLeast = RangesKt.coerceAtLeast(iCoerceAtLeast, data.get(i).getHeartRate());
                    if (iCoerceAtMost == 0) {
                        iCoerceAtMost = data.get(i).getHeartRate();
                    }
                    iCoerceAtMost = RangesKt.coerceAtMost(iCoerceAtMost, data.get(i).getHeartRate());
                }
            }
            m8b.f("Data-Sync", "HeartRate data startTime=" + o3k.a(((long) dataStartTime) * 1000) + " mixHeartRate = " + iCoerceAtMost + " maxHeartRate = " + iCoerceAtLeast + " restHeartRate = " + iCoerceAtMost2);
            j6e.a("Data-Sync", "HeartRate", data.size(), 60, new j6e.a() { // from class: com.oplus.aiunit.vision.cg8
                @Override // com.oplus.aiunit.vision.j6e.a
                public final String a(int i2) {
                    return k.h0(data, this, i2);
                }
            });
        }
    }

    @Override // com.heytap.device.data.sporthealth.pull.fetcher.h
    @NotNull
    public String m() {
        return "HRDataFetcher";
    }
}