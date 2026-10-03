package com.heytap.device.data.sporthealth.pull.fetcher;

import com.heytap.health.protocol.fitness.FitnessProtoV2;
import com.heytap.health.protocol.relax.RelaxProto;
import com.oplus.aiunit.vision.ProcessPacketDataResult;
import com.oplus.aiunit.vision.if0;
import com.oplus.aiunit.vision.kq5;
import com.oplus.aiunit.vision.m8b;
import com.oplus.aiunit.vision.v2e;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes15.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001bB'\u0012\u0006\u0010\u0014\u001a\u00020\u000b\u0012\u0006\u0010\u0015\u001a\u00020\u000b\u0012\u0006\u0010\u0016\u001a\u00020\u000b\u0012\u0006\u0010\u0017\u001a\u00020\u000b¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\nH\u0002J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\rH\u0002J\u0016\u0010\u0012\u001a\u00020\u00112\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002J\u0010\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\rH\u0002¨\u0006\u001c"}, d2 = {"Lcom/heytap/device/data/sporthealth/pull/fetcher/p;", "Lcom/heytap/device/data/sporthealth/pull/fetcher/PacketDataFetcher;", kq5.NOT_SET, "m", kq5.NOT_SET, "data", "Lcom/oplus/aiunit/vision/kze;", "e", "j0", "i0", "Lcom/heytap/health/protocol/relax/RelaxProto$RelaxDetailData;", kq5.NOT_SET, "f0", "Lcom/heytap/health/protocol/fitness/FitnessProtoV2$RelaxDetailDataV2;", "e0", kq5.NOT_SET, "Lcom/heytap/health/protocol/relax/RelaxProto$RelaxItem;", kq5.NOT_SET, "h0", "g0", "sid", "indexCid", "dataCid", "dataType", "<init>", "(IIII)V", "Companion", "a", "device_data_sync_impl_release"}, k = 1, mv = {1, 8, 0})
public final class p extends PacketDataFetcher {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.heytap.device.data.sporthealth.pull.fetcher.p$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lcom/heytap/device/data/sporthealth/pull/fetcher/p$a;", kq5.NOT_SET, "Lcom/heytap/device/data/sporthealth/pull/fetcher/p;", "a", "b", "c", "<init>", "()V", "device_data_sync_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final p a() {
            return new p(36, 1, 2, 10);
        }

        @NotNull
        public final p b() {
            return new p(5, 1, 171, 10);
        }

        @NotNull
        public final p c() {
            return new p(5, 1, 249, 10);
        }
    }

    public p(int i, int i2, int i3, int i4) {
        super(i, i2, i3, i4);
    }

    @Override // com.heytap.device.data.sporthealth.pull.fetcher.PacketDataFetcher, com.oplus.aiunit.vision.jze
    @NotNull
    public ProcessPacketDataResult e(@NotNull byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return this.k ? i0(data) : j0(data);
    }

    public final int e0(FitnessProtoV2.RelaxDetailDataV2 data) {
        List dataList = data.getDataList();
        Intrinsics.checkNotNullExpressionValue(dataList, "data.dataList");
        if (!(!dataList.isEmpty())) {
            return 0;
        }
        List dataList2 = data.getDataList();
        Intrinsics.checkNotNullExpressionValue(dataList2, "data.dataList");
        FitnessProtoV2.RelaxItemV2 relaxItemV2 = (FitnessProtoV2.RelaxItemV2) CollectionsKt.last(dataList2);
        return relaxItemV2.getStartTime() + relaxItemV2.getDuration();
    }

    public final int f0(RelaxProto.RelaxDetailData data) {
        List dataList = data.getDataList();
        Intrinsics.checkNotNullExpressionValue(dataList, "data.dataList");
        if (!(!dataList.isEmpty())) {
            return 0;
        }
        List dataList2 = data.getDataList();
        Intrinsics.checkNotNullExpressionValue(dataList2, "data.dataList");
        RelaxProto.RelaxItem relaxItem = (RelaxProto.RelaxItem) CollectionsKt.last(dataList2);
        return relaxItem.getStartTime() + relaxItem.getDuration();
    }

    public final void g0(FitnessProtoV2.RelaxDetailDataV2 data) {
        if (if0.w()) {
            Iterator it = data.getDataList().iterator();
            while (it.hasNext()) {
                String strB = v2e.b((FitnessProtoV2.RelaxItemV2) it.next());
                StringBuilder sb = new StringBuilder();
                sb.append("Relax item data=");
                sb.append(strB);
            }
        }
    }

    public final void h0(List<RelaxProto.RelaxItem> data) {
        if (if0.w()) {
            Iterator<RelaxProto.RelaxItem> it = data.iterator();
            while (it.hasNext()) {
                String strB = v2e.b(it.next());
                StringBuilder sb = new StringBuilder();
                sb.append("Relax item data=");
                sb.append(strB);
            }
        }
    }

    public final ProcessPacketDataResult i0(byte[] data) {
        ProcessPacketDataResult processPacketDataResult = new ProcessPacketDataResult(1, 0);
        try {
            FitnessProtoV2.RelaxDetailDataV2 from = FitnessProtoV2.RelaxDetailDataV2.parseFrom(data);
            if (from != null) {
                g0(from);
                if (from.getDataList().isEmpty()) {
                    processPacketDataResult.d(1);
                    return processPacketDataResult;
                }
                com.heytap.device.data.storage.h.Companion companion = com.heytap.device.data.storage.h.INSTANCE;
                String str = this.f;
                Intrinsics.checkNotNullExpressionValue(str, "deviceMac");
                if (companion.a(from, str)) {
                    int iE0 = e0(from);
                    u(getDataType(), iE0);
                    List dataList = from.getDataList();
                    Intrinsics.checkNotNullExpressionValue(dataList, "relaxData.dataList");
                    x(((FitnessProtoV2.RelaxItemV2) CollectionsKt.first(dataList)).getStartTime());
                    w(iE0);
                    v(true);
                    processPacketDataResult.d(1);
                    processPacketDataResult.c(iE0);
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

    public final ProcessPacketDataResult j0(byte[] data) {
        ProcessPacketDataResult processPacketDataResult = new ProcessPacketDataResult(1, 0);
        try {
            RelaxProto.RelaxDetailData from = RelaxProto.RelaxDetailData.parseFrom(data);
            if (from != null) {
                List<RelaxProto.RelaxItem> dataList = from.getDataList();
                Intrinsics.checkNotNullExpressionValue(dataList, "relaxData.dataList");
                h0(dataList);
                List dataList2 = from.getDataList();
                if (dataList2 == null || dataList2.isEmpty()) {
                    processPacketDataResult.d(1);
                    return processPacketDataResult;
                }
                com.heytap.device.data.storage.h.Companion companion = com.heytap.device.data.storage.h.INSTANCE;
                List<RelaxProto.RelaxItem> dataList3 = from.getDataList();
                Intrinsics.checkNotNullExpressionValue(dataList3, "relaxData.dataList");
                String str = this.f;
                Intrinsics.checkNotNullExpressionValue(str, "deviceMac");
                if (companion.b(dataList3, str)) {
                    int iF0 = f0(from);
                    u(getDataType(), iF0);
                    List dataList4 = from.getDataList();
                    Intrinsics.checkNotNullExpressionValue(dataList4, "relaxData.dataList");
                    x(((RelaxProto.RelaxItem) CollectionsKt.first(dataList4)).getStartTime());
                    w(iF0);
                    v(true);
                    processPacketDataResult.d(1);
                    processPacketDataResult.c(iF0);
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

    @Override // com.heytap.device.data.sporthealth.pull.fetcher.h
    @NotNull
    public String m() {
        return "RelaxDataFetcher";
    }
}