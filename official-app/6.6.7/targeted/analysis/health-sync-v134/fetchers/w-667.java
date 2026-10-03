package com.heytap.device.data.sporthealth.pull.fetcher;

import com.google.protobuf.ByteString;
import com.heytap.databaseengineservice.db.table.DBAssessmentRecord;
import com.heytap.device.data.storage.Spo2DataRepository;
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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes15.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u00182\u00020\u0001:\u0001\u0019B'\u0012\u0006\u0010\u0012\u001a\u00020\f\u0012\u0006\u0010\u0013\u001a\u00020\f\u0012\u0006\u0010\u0014\u001a\u00020\f\u0012\u0006\u0010\u0015\u001a\u00020\f¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\nH\u0002J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0010H\u0002¨\u0006\u001a"}, d2 = {"Lcom/heytap/device/data/sporthealth/pull/fetcher/w;", "Lcom/heytap/device/data/sporthealth/pull/fetcher/PacketDataFetcher;", kq5.NOT_SET, "m", kq5.NOT_SET, "data", "Lcom/oplus/aiunit/vision/kze;", "e", "i0", "h0", "Lcom/heytap/health/protocol/fitness/FitnessProto$Spo2V2Data;", "prePacketData", kq5.NOT_SET, "e0", kq5.NOT_SET, "f0", "Lcom/heytap/health/protocol/fitness/FitnessProtoV2$Spo2DataV2;", "g0", "sid", "indexCid", "dataCid", "dataType", "<init>", "(IIII)V", "Companion", "a", "device_data_sync_impl_release"}, k = 1, mv = {1, 8, 0})
public final class w extends PacketDataFetcher {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.heytap.device.data.sporthealth.pull.fetcher.w$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002¨\u0006\u0007"}, d2 = {"Lcom/heytap/device/data/sporthealth/pull/fetcher/w$a;", kq5.NOT_SET, "Lcom/heytap/device/data/sporthealth/pull/fetcher/w;", "b", "a", "<init>", "()V", "device_data_sync_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final w a() {
            return new w(5, 84, 85, 4);
        }

        @NotNull
        public final w b() {
            return new w(5, 86, 87, 23);
        }
    }

    public w(int i, int i2, int i3, int i4) {
        super(i, i2, i3, i4);
    }

    @Override // com.heytap.device.data.sporthealth.pull.fetcher.PacketDataFetcher, com.oplus.aiunit.vision.jze
    @NotNull
    public ProcessPacketDataResult e(@NotNull byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return this.k ? h0(data) : i0(data);
    }

    public final int e0(FitnessProto.Spo2V2Data prePacketData) {
        List minuteOffsetList = prePacketData.getMinuteOffsetList();
        List typeSecondOffsetList = prePacketData.getTypeSecondOffsetList();
        if (minuteOffsetList.size() != typeSecondOffsetList.size() || minuteOffsetList.size() <= 0) {
            return 0;
        }
        byte[] byteArray = ((ByteString) typeSecondOffsetList.get(typeSecondOffsetList.size() - 1)).toByteArray();
        return prePacketData.getStartTime() + (((Number) minuteOffsetList.get(minuteOffsetList.size() - 1)).intValue() * 60) + ((byteArray[byteArray.length - 1] >> 2) & 63);
    }

    public final void f0(FitnessProto.Spo2V2Data data) {
        if (if0.w()) {
            StringBuilder sb = new StringBuilder();
            int startTime = data.getStartTime();
            List minuteOffsetList = data.getMinuteOffsetList();
            List typeSecondOffsetList = data.getTypeSecondOffsetList();
            List spo2RdList = data.getSpo2RdList();
            if (minuteOffsetList.size() != typeSecondOffsetList.size() || typeSecondOffsetList.size() != spo2RdList.size()) {
                m8b.f("Data-Sync", "Spo2NewProtocol Data error");
                return;
            }
            if (minuteOffsetList.size() > 0) {
                int size = minuteOffsetList.size();
                int i = 0;
                while (i < size) {
                    Integer num = (Integer) minuteOffsetList.get(i);
                    byte[] byteArray = ((ByteString) typeSecondOffsetList.get(i)).toByteArray();
                    byte[] byteArray2 = ((ByteString) spo2RdList.get(i)).toByteArray();
                    if (byteArray.length != byteArray2.length) {
                        m8b.f("Data-Sync", "Spo2NewProtocol Data error");
                        return;
                    }
                    int length = byteArray.length;
                    int i2 = 0;
                    while (i2 < length) {
                        int i3 = byteArray[i2] & 3;
                        int iIntValue = startTime + (num.intValue() * 60) + ((byteArray[i2] >> 2) & 63);
                        int i4 = (byteArray2[i2] >> 3) & 31;
                        if (i4 != 0) {
                            i4 += 69;
                        }
                        sb.append(" time");
                        sb.append("=");
                        sb.append(o3k.a(((long) iIntValue) * 1000));
                        sb.append(" type");
                        sb.append("=");
                        sb.append(i3);
                        sb.append(com.heytap.device.data.storage.e.COMMA);
                        sb.append(DBAssessmentRecord.SPO2);
                        sb.append("=");
                        sb.append(i4);
                        i2++;
                        spo2RdList = spo2RdList;
                        typeSecondOffsetList = typeSecondOffsetList;
                        minuteOffsetList = minuteOffsetList;
                        size = size;
                    }
                    List list = minuteOffsetList;
                    List list2 = typeSecondOffsetList;
                    m8b.f("Data-Sync", "SPO2 minute data startTime=" + o3k.a(((long) ((num.intValue() * 60) + startTime)) * 1000) + " size=" + byteArray2.length + ", values=" + ((Object) sb));
                    sb.delete(0, sb.length());
                    i++;
                    spo2RdList = spo2RdList;
                    typeSecondOffsetList = list2;
                    minuteOffsetList = list;
                    size = size;
                }
            }
        }
    }

    public final void g0(FitnessProtoV2.Spo2DataV2 data) {
        if (if0.w()) {
            m8b.f("Data-Sync", " data size = " + data.getDataList().size());
            StringBuilder sb = new StringBuilder();
            int startTime = data.getStartTime();
            int size = data.getDataList().size();
            if (size > 0) {
                for (int i = 0; i < size; i++) {
                    int minuteOffset = ((FitnessProtoV2.Spo2ItemDataV2) data.getDataList().get(i)).getMinuteOffset();
                    byte[] byteArray = ((FitnessProtoV2.Spo2ItemDataV2) data.getDataList().get(i)).getTypeSecondOffset().toByteArray();
                    byte[] byteArray2 = ((FitnessProtoV2.Spo2ItemDataV2) data.getDataList().get(i)).getSpo2Rd().toByteArray();
                    if (byteArray.length != byteArray2.length) {
                        m8b.f("Data-Sync", "Spo2NewProtocol Data error");
                        return;
                    }
                    int length = byteArray.length;
                    int i2 = 0;
                    while (i2 < length) {
                        byte b = byteArray[i2];
                        int i3 = b & 3;
                        int i4 = (minuteOffset * 60) + startTime + ((b >> 2) & 63);
                        int i5 = (byteArray2[i2] >> 3) & 31;
                        if (i5 != 0) {
                            i5 += 69;
                        }
                        sb.append(" time");
                        sb.append("=");
                        sb.append(o3k.a(((long) i4) * 1000));
                        sb.append(" type");
                        sb.append("=");
                        sb.append(i3);
                        sb.append(com.heytap.device.data.storage.e.COMMA);
                        sb.append(DBAssessmentRecord.SPO2);
                        sb.append("=");
                        sb.append(i5);
                        i2++;
                        byteArray = byteArray;
                        byteArray2 = byteArray2;
                    }
                    m8b.f("Data-Sync", "SPO2 minute data startTime=" + o3k.a(((long) ((minuteOffset * 60) + startTime)) * 1000) + " size=" + byteArray2.length + ", values=" + ((Object) sb));
                    sb.delete(0, sb.length());
                }
            }
        }
    }

    public final ProcessPacketDataResult h0(byte[] data) {
        ProcessPacketDataResult processPacketDataResult = new ProcessPacketDataResult(1, 0);
        try {
            FitnessProtoV2.Spo2DataV2 from = FitnessProtoV2.Spo2DataV2.parseFrom(data);
            if (from != null) {
                g0(from);
                List dataList = from.getDataList();
                if (dataList == null || dataList.isEmpty()) {
                    processPacketDataResult.d(1);
                    return processPacketDataResult;
                }
                Spo2DataRepository.Companion companion = Spo2DataRepository.INSTANCE;
                String str = this.f;
                Intrinsics.checkNotNullExpressionValue(str, "deviceMac");
                if (companion.m(from, str)) {
                    int endTime = from.getEndTime();
                    if (endTime > 0) {
                        u(getDataType(), endTime);
                        x(from.getStartTime());
                        w(endTime);
                        v(true);
                    }
                    processPacketDataResult.d(1);
                    processPacketDataResult.c(endTime);
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

    public final ProcessPacketDataResult i0(byte[] data) {
        ProcessPacketDataResult processPacketDataResult = new ProcessPacketDataResult(1, 0);
        try {
            FitnessProto.Spo2V2Data from = FitnessProto.Spo2V2Data.parseFrom(data);
            if (from != null) {
                f0(from);
                Spo2DataRepository.Companion companion = Spo2DataRepository.INSTANCE;
                String str = this.f;
                Intrinsics.checkNotNullExpressionValue(str, "deviceMac");
                if (companion.l(from, str)) {
                    int iE0 = e0(from);
                    if (iE0 > 0) {
                        u(getDataType(), iE0);
                        x(from.getStartTime());
                        w(iE0);
                        this.n = iE0;
                        v(true);
                    }
                    processPacketDataResult.d(1);
                    processPacketDataResult.c(iE0);
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
        return "Spo2V2DataFetcher";
    }
}