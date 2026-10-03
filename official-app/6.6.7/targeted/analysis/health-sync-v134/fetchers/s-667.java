package com.heytap.device.data.sporthealth.pull.fetcher;

import com.google.protobuf.ByteString;
import com.heytap.health.protocol.fitness.FitnessProto;
import com.heytap.health.protocol.fitness.FitnessProtoV2;
import com.oplus.aiunit.vision.ProcessPacketDataResult;
import com.oplus.aiunit.vision.if0;
import com.oplus.aiunit.vision.kq5;
import com.oplus.aiunit.vision.m8b;
import com.oplus.aiunit.vision.o3k;
import com.oplus.aiunit.vision.v2e;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes15.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0014\u0010\u000b\u001a\u00020\n2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\u0016\u0010\r\u001a\u00020\f2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¨\u0006\u0010"}, d2 = {"Lcom/heytap/device/data/sporthealth/pull/fetcher/s;", "Lcom/heytap/device/data/sporthealth/pull/fetcher/PacketDataFetcher;", kq5.NOT_SET, "m", kq5.NOT_SET, "data", "Lcom/oplus/aiunit/vision/kze;", "e", kq5.NOT_SET, "Lcom/heytap/health/protocol/fitness/FitnessProto$SleepRRIntervalItem;", kq5.NOT_SET, "f0", kq5.NOT_SET, "e0", "<init>", "()V", "device_data_sync_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSleepRRIntervalDataFetcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepRRIntervalDataFetcher.kt\ncom/heytap/device/data/sporthealth/pull/fetcher/SleepRRIntervalDataFetcher\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,104:1\n1855#2:105\n1855#2,2:106\n1856#2:108\n*S KotlinDebug\n*F\n+ 1 SleepRRIntervalDataFetcher.kt\ncom/heytap/device/data/sporthealth/pull/fetcher/SleepRRIntervalDataFetcher\n*L\n87#1:105\n91#1:106,2\n87#1:108\n*E\n"})
public final class s extends PacketDataFetcher {
    public s() {
        super(5, 163, 164, 31);
    }

    @Override // com.heytap.device.data.sporthealth.pull.fetcher.PacketDataFetcher, com.oplus.aiunit.vision.jze
    @NotNull
    public ProcessPacketDataResult e(@NotNull byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        ProcessPacketDataResult processPacketDataResult = new ProcessPacketDataResult(1, 0);
        try {
            List<FitnessProto.SleepRRIntervalItem> dataList = this.k ? FitnessProtoV2.SleepRRIntervalV2.parseFrom(data).getDataList() : FitnessProto.SleepRRInterval.parseFrom(data).getDataList();
            List<FitnessProto.SleepRRIntervalItem> list = dataList;
            if (list == null || list.isEmpty()) {
                processPacketDataResult.d(1);
            } else {
                m8b.f("Data-Sync", "On Sleep RR Interval data packet, index=" + T() + " size = " + dataList.size());
                f0(dataList);
                com.heytap.device.data.storage.j.Companion companion = com.heytap.device.data.storage.j.INSTANCE;
                String str = this.f;
                Intrinsics.checkNotNullExpressionValue(str, "deviceMac");
                if (companion.a(dataList, str)) {
                    int iE0 = e0(dataList);
                    if (iE0 > 0) {
                        u(getDataType(), iE0);
                        x(((FitnessProto.SleepRRIntervalItem) CollectionsKt.first(dataList)).getTimeStamp());
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

    public final int e0(List<FitnessProto.SleepRRIntervalItem> data) {
        return ((FitnessProto.SleepRRIntervalItem) CollectionsKt.last(data)).getTimeStamp();
    }

    public final void f0(@NotNull List<FitnessProto.SleepRRIntervalItem> data) {
        Intrinsics.checkNotNullParameter(data, "data");
        if (if0.w()) {
            m8b.f("Data-Sync", "SleepRRInterval data size " + data.size());
            for (FitnessProto.SleepRRIntervalItem sleepRRIntervalItem : data) {
                ByteString data2 = sleepRRIntervalItem.getData();
                Intrinsics.checkNotNullExpressionValue(data2, "item.data");
                StringBuilder sb = new StringBuilder();
                sb.append("data=");
                Iterator it = data2.iterator();
                while (it.hasNext()) {
                    sb.append((((Byte) it.next()).byteValue() & 255) + com.heytap.device.data.storage.e.COMMA);
                }
                m8b.f("Data-Sync", "SleepRRInterval dataTime = " + o3k.a(((long) sleepRRIntervalItem.getTimeStamp()) * 1000) + " " + ((Object) sb) + " ");
                StringsKt.clear(sb);
            }
        }
    }

    @Override // com.heytap.device.data.sporthealth.pull.fetcher.h
    @NotNull
    public String m() {
        return "SleepRRIntervalDataFetcher";
    }
}