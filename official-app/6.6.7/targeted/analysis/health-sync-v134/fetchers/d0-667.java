package com.heytap.device.data.sporthealth.pull.fetcher;

import com.heytap.device.data.sporthealth.pull.fetcher.d0;
import com.heytap.health.protocol.fitness.FitnessProto;
import com.heytap.health.protocol.fitness.FitnessProtoV2;
import com.oplus.aiunit.vision.ProcessPacketDataResult;
import com.oplus.aiunit.vision.hii;
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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes15.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0014B\u0017\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u0006\u0010\u0010\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0016\u0010\u000b\u001a\u00020\n2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002J\u001e\u0010\u000e\u001a\u00020\r2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\f\u001a\u00020\nH\u0002¨\u0006\u0015"}, d2 = {"Lcom/heytap/device/data/sporthealth/pull/fetcher/d0;", "Lcom/heytap/device/data/sporthealth/pull/fetcher/PacketDataFetcher;", kq5.NOT_SET, "m", kq5.NOT_SET, "data", "Lcom/oplus/aiunit/vision/kze;", "e", kq5.NOT_SET, "Lcom/heytap/health/protocol/fitness/FitnessProto$TumbleItem;", kq5.NOT_SET, "f0", "dataStartTime", kq5.NOT_SET, "g0", "indexCid", "dataCid", "<init>", "(II)V", "Companion", "a", "device_data_sync_impl_release"}, k = 1, mv = {1, 8, 0})
public final class d0 extends PacketDataFetcher {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.heytap.device.data.sporthealth.pull.fetcher.d0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lcom/heytap/device/data/sporthealth/pull/fetcher/d0$a;", kq5.NOT_SET, kq5.NOT_SET, "isMcuSync", "Lcom/heytap/device/data/sporthealth/pull/fetcher/d0;", "a", "<init>", "()V", "device_data_sync_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final d0 a(boolean isMcuSync) {
            return isMcuSync ? new d0(67, hii.TAEKWONDO) : new d0(67, 68);
        }
    }

    public d0(int i, int i2) {
        super(5, i, i2, 17);
    }

    public static final String h0(List list, int i) {
        Intrinsics.checkNotNullParameter(list, "$data");
        return o3k.a(((long) ((FitnessProto.TumbleItem) list.get(i)).getTimestamp()) * 1000) + "->" + ((FitnessProto.TumbleItem) list.get(i)).getState() + ";";
    }

    @Override // com.heytap.device.data.sporthealth.pull.fetcher.PacketDataFetcher, com.oplus.aiunit.vision.jze
    @NotNull
    public ProcessPacketDataResult e(@NotNull byte[] data) {
        List<FitnessProto.TumbleItem> dataList;
        int startTime;
        Intrinsics.checkNotNullParameter(data, "data");
        ProcessPacketDataResult processPacketDataResult = new ProcessPacketDataResult(1, 0);
        try {
            if (this.k) {
                FitnessProtoV2.TumbleDataV2 from = FitnessProtoV2.TumbleDataV2.parseFrom(data);
                dataList = from.getDataList();
                startTime = from.getStartTime();
            } else {
                FitnessProto.TumbleData from2 = FitnessProto.TumbleData.parseFrom(data);
                dataList = from2.getDataList();
                startTime = from2.getStartTime();
            }
            List<FitnessProto.TumbleItem> list = dataList;
            if (list == null || list.isEmpty()) {
                processPacketDataResult.d(1);
            } else {
                g0(dataList, startTime);
                com.heytap.device.data.storage.n.Companion companion = com.heytap.device.data.storage.n.INSTANCE;
                String str = this.f;
                Intrinsics.checkNotNullExpressionValue(str, "deviceMac");
                if (companion.a(dataList, startTime, str)) {
                    int iF0 = f0(dataList);
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

    public final int f0(List<FitnessProto.TumbleItem> data) {
        if (!data.isEmpty()) {
            return this.k ? ((FitnessProto.TumbleItem) CollectionsKt.last(data)).getTimestamp() : ((FitnessProto.TumbleItem) CollectionsKt.last(data)).getTimestamp() + 1;
        }
        return 0;
    }

    public final void g0(final List<FitnessProto.TumbleItem> data, int dataStartTime) {
        if (if0.w()) {
            m8b.f("Data-Sync", "Tumble data startTime=" + o3k.a(((long) dataStartTime) * 1000) + ", totalCount=" + data.size());
            j6e.a("Data-Sync", "Tumble", data.size(), 20, new j6e.a() { // from class: com.oplus.aiunit.vision.xgk
                @Override // com.oplus.aiunit.vision.j6e.a
                public final String a(int i) {
                    return d0.h0(data, i);
                }
            });
        }
    }

    @Override // com.heytap.device.data.sporthealth.pull.fetcher.h
    @NotNull
    public String m() {
        return "TumbleDataFetcher";
    }
}