package com.heytap.device.data.sporthealth.pull.fetcher;

import com.heytap.device.data.sporthealth.pull.fetcher.e;
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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes15.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\u0018\u0000 \u00142\u00020\u0001:\u0001\u0015B'\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u0006\u0010\u0010\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0016\u0010\u000b\u001a\u00020\n2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002J\u0016\u0010\r\u001a\u00020\f2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¨\u0006\u0016"}, d2 = {"Lcom/heytap/device/data/sporthealth/pull/fetcher/e;", "Lcom/heytap/device/data/sporthealth/pull/fetcher/PacketDataFetcher;", kq5.NOT_SET, "m", kq5.NOT_SET, "data", "Lcom/oplus/aiunit/vision/kze;", "e", kq5.NOT_SET, "Lcom/heytap/health/protocol/fitness/FitnessProto$BloodSugarNoticeRecord;", kq5.NOT_SET, "f0", kq5.NOT_SET, "g0", "sid", "indexCid", "dataCid", "dataType", "<init>", "(IIII)V", "Companion", "a", "device_data_sync_impl_release"}, k = 1, mv = {1, 8, 0})
public final class e extends PacketDataFetcher {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.heytap.device.data.sporthealth.pull.fetcher.e$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002¨\u0006\u0007"}, d2 = {"Lcom/heytap/device/data/sporthealth/pull/fetcher/e$a;", kq5.NOT_SET, "Lcom/heytap/device/data/sporthealth/pull/fetcher/e;", "a", "b", "<init>", "()V", "device_data_sync_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final e a() {
            return new e(5, 116, 117, 26);
        }

        @NotNull
        public final e b() {
            return new e(5, 116, 169, 26);
        }
    }

    public e(int i, int i2, int i3, int i4) {
        super(i, i2, i3, i4);
    }

    public static final String h0(List list, int i) {
        Intrinsics.checkNotNullParameter(list, "$data");
        FitnessProto.BloodSugarNoticeRecord bloodSugarNoticeRecord = (FitnessProto.BloodSugarNoticeRecord) list.get(i);
        return " time = " + o3k.a(((long) bloodSugarNoticeRecord.getTimestamp()) * 1000) + "  value = " + bloodSugarNoticeRecord.getValue() + "  type = " + bloodSugarNoticeRecord.getType() + " ";
    }

    @Override // com.heytap.device.data.sporthealth.pull.fetcher.PacketDataFetcher, com.oplus.aiunit.vision.jze
    @NotNull
    public ProcessPacketDataResult e(@NotNull byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        ProcessPacketDataResult processPacketDataResult = new ProcessPacketDataResult(1, 0);
        try {
            List<FitnessProto.BloodSugarNoticeRecord> recordsList = this.k ? FitnessProtoV2.BloodSugarNoticeDataV2.parseFrom(data).getRecordsList() : FitnessProto.BloodSugarNoticeData.parseFrom(data).getRecordsList();
            List<FitnessProto.BloodSugarNoticeRecord> list = recordsList;
            if (list == null || list.isEmpty()) {
                processPacketDataResult.d(1);
            } else {
                m8b.f("Data-Sync", "On BloodSugarNoticeData packet, index = " + T() + " Size = " + recordsList.size());
                g0(recordsList);
                com.heytap.device.data.storage.b.Companion companion = com.heytap.device.data.storage.b.INSTANCE;
                String str = this.f;
                Intrinsics.checkNotNullExpressionValue(str, "deviceMac");
                if (companion.c(recordsList, str)) {
                    int iF0 = f0(recordsList);
                    u(getDataType(), iF0);
                    x(((FitnessProto.BloodSugarNoticeRecord) CollectionsKt.first(recordsList)).getTimestamp());
                    w(iF0);
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

    public final int f0(List<FitnessProto.BloodSugarNoticeRecord> data) {
        return ((FitnessProto.BloodSugarNoticeRecord) CollectionsKt.last(data)).getTimestamp();
    }

    public final void g0(final List<FitnessProto.BloodSugarNoticeRecord> data) {
        if (if0.w()) {
            m8b.f("Data-Sync", "BloodSugarNotice Data startTime=" + o3k.a(((long) ((FitnessProto.BloodSugarNoticeRecord) CollectionsKt.first(data)).getTimestamp()) * 1000) + ", totalCount=" + data.size());
            j6e.a("Data-Sync", "BloodSugarNotice", data.size(), 60, new j6e.a() { // from class: com.oplus.aiunit.vision.ot1
                @Override // com.oplus.aiunit.vision.j6e.a
                public final String a(int i) {
                    return e.h0(data, i);
                }
            });
        }
    }

    @Override // com.heytap.device.data.sporthealth.pull.fetcher.h
    @NotNull
    public String m() {
        return "BloodSugarNoticeDataFetcher";
    }
}