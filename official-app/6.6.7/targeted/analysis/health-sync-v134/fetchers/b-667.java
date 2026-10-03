package com.heytap.device.data.sporthealth.pull.fetcher;

import com.heytap.device.data.storage.AssessmentRecordDataRepository;
import com.heytap.health.protocol.cardiovascular.CardiovascularProto;
import com.oplus.aiunit.vision.ProcessPacketDataResult;
import com.oplus.aiunit.vision.if0;
import com.oplus.aiunit.vision.kq5;
import com.oplus.aiunit.vision.m8b;
import com.oplus.aiunit.vision.o3k;
import com.oplus.aiunit.vision.v2e;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes15.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0016\u0010\u000b\u001a\u00020\n2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002J\u0016\u0010\r\u001a\u00020\f2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¨\u0006\u0010"}, d2 = {"Lcom/heytap/device/data/sporthealth/pull/fetcher/b;", "Lcom/heytap/device/data/sporthealth/pull/fetcher/PacketDataFetcher;", kq5.NOT_SET, "m", kq5.NOT_SET, "data", "Lcom/oplus/aiunit/vision/kze;", "e", kq5.NOT_SET, "Lcom/heytap/health/protocol/cardiovascular/CardiovascularProto$AssessmentRecordData;", kq5.NOT_SET, "e0", kq5.NOT_SET, "f0", "<init>", "()V", "device_data_sync_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAssessmentRecordDataFetcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssessmentRecordDataFetcher.kt\ncom/heytap/device/data/sporthealth/pull/fetcher/AssessmentRecordDataFetcher\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,107:1\n1855#2,2:108\n*S KotlinDebug\n*F\n+ 1 AssessmentRecordDataFetcher.kt\ncom/heytap/device/data/sporthealth/pull/fetcher/AssessmentRecordDataFetcher\n*L\n95#1:108,2\n*E\n"})
public final class b extends PacketDataFetcher {
    public b() {
        super(5, 105, 106, 24);
    }

    @Override // com.heytap.device.data.sporthealth.pull.fetcher.PacketDataFetcher, com.oplus.aiunit.vision.jze
    @NotNull
    public ProcessPacketDataResult e(@NotNull byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        ProcessPacketDataResult processPacketDataResult = new ProcessPacketDataResult(1, 0);
        try {
            List<CardiovascularProto.AssessmentRecordData> dataList = this.k ? CardiovascularProto.AssessmentRecordDataListV2.parseFrom(data).getDataList() : CardiovascularProto.AssessmentRecordDataList.parseFrom(data).getDataList();
            List<CardiovascularProto.AssessmentRecordData> list = dataList;
            if (list == null || list.isEmpty()) {
                processPacketDataResult.d(1);
            } else {
                m8b.f("Data-Sync", "On Assessment Record Data packet, index=" + T() + " dataSize=" + dataList.size());
                f0(dataList);
                AssessmentRecordDataRepository.Companion companion = AssessmentRecordDataRepository.INSTANCE;
                String str = this.f;
                Intrinsics.checkNotNullExpressionValue(str, "deviceMac");
                if (companion.c(dataList, str)) {
                    int iE0 = e0(dataList);
                    if (iE0 > 0) {
                        u(getDataType(), iE0);
                        x(((CardiovascularProto.AssessmentRecordData) CollectionsKt.first(dataList)).getStartTime());
                        w(iE0);
                        v(true);
                        processPacketDataResult.d(1);
                        processPacketDataResult.c(iE0);
                    }
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

    public final int e0(List<CardiovascularProto.AssessmentRecordData> data) {
        if (!data.isEmpty()) {
            return ((CardiovascularProto.AssessmentRecordData) CollectionsKt.last(data)).getEndTime();
        }
        return 0;
    }

    public final void f0(List<CardiovascularProto.AssessmentRecordData> data) {
        if (if0.w() && (!data.isEmpty())) {
            for (CardiovascularProto.AssessmentRecordData assessmentRecordData : data) {
                String strA = o3k.a(((long) assessmentRecordData.getStartTime()) * 1000);
                String strA2 = o3k.a(((long) assessmentRecordData.getEndTime()) * 1000);
                String strB = v2e.b(assessmentRecordData);
                Intrinsics.checkNotNullExpressionValue(strB, "toJson(item)");
                m8b.f("Data-Sync", "Assessment record data  startTime =" + strA + " endTime = " + strA2 + new Regex("_\":").replace(strB, "\":"));
            }
        }
    }

    @Override // com.heytap.device.data.sporthealth.pull.fetcher.h
    @NotNull
    public String m() {
        return "AssessmentRecordDataFetcher";
    }
}