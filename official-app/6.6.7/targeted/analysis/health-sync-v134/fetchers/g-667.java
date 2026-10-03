package com.heytap.device.data.sporthealth.pull.fetcher;

import com.heytap.device.data.sporthealth.pull.fetcher.g;
import com.heytap.device.data.storage.ActivityDataRepository;
import com.heytap.health.protocol.fitness.FitnessProto;
import com.heytap.health.protocol.fitness.FitnessProtoV2;
import com.oplus.aiunit.vision.ProcessPacketDataResult;
import com.oplus.aiunit.vision.if0;
import com.oplus.aiunit.vision.j6e;
import com.oplus.aiunit.vision.kq5;
import com.oplus.aiunit.vision.m8b;
import com.oplus.aiunit.vision.o3k;
import com.oplus.aiunit.vision.v2e;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes15.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J \u0010\f\u001a\u00020\n2\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002J \u0010\u000e\u001a\u00020\r2\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¨\u0006\u0011"}, d2 = {"Lcom/heytap/device/data/sporthealth/pull/fetcher/g;", "Lcom/heytap/device/data/sporthealth/pull/fetcher/PacketDataFetcher;", kq5.NOT_SET, "m", kq5.NOT_SET, "data", "Lcom/oplus/aiunit/vision/kze;", "e", kq5.NOT_SET, "Lcom/heytap/health/protocol/fitness/FitnessProto$ActivityItem;", kq5.NOT_SET, "dataStartTime", "f0", kq5.NOT_SET, "g0", "<init>", "()V", "device_data_sync_impl_release"}, k = 1, mv = {1, 8, 0})
public final class g extends PacketDataFetcher {
    public g() {
        super(5, 9, 10, 1);
    }

    public static final String h0(List list, int i, int i2) {
        FitnessProto.ActivityItem activityItem = (FitnessProto.ActivityItem) list.get(i2);
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("[time=%s ,step=%s, distance=%s, calorie=%s, height=%s, exercise=%s, type=%s, sedentary=%s], ", Arrays.copyOf(new Object[]{o3k.a((((long) i) + (((long) activityItem.getTimeOffset()) * 60)) * 1000), Integer.valueOf(activityItem.getMinuteStep()), Integer.valueOf(activityItem.getMinuteDistance()), Integer.valueOf(activityItem.getMinuteCalorie()), Integer.valueOf(activityItem.getMinuteHeight()), Integer.valueOf(activityItem.getMinuteExercise()), Integer.valueOf(activityItem.getMinuteSportType()), Integer.valueOf(activityItem.getSedentaryState())}, 8));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    @Override // com.heytap.device.data.sporthealth.pull.fetcher.PacketDataFetcher, com.oplus.aiunit.vision.jze
    @NotNull
    public ProcessPacketDataResult e(@NotNull byte[] data) {
        List<FitnessProto.ActivityItem> dataList;
        int startTime;
        Intrinsics.checkNotNullParameter(data, "data");
        ProcessPacketDataResult processPacketDataResult = new ProcessPacketDataResult(1, 0);
        try {
            if (this.k) {
                FitnessProtoV2.ActivityDataV2 from = FitnessProtoV2.ActivityDataV2.parseFrom(data);
                dataList = from.getDataList();
                startTime = from.getStartTime();
            } else {
                FitnessProto.ActivityData from2 = FitnessProto.ActivityData.parseFrom(data);
                dataList = from2.getDataList();
                startTime = from2.getStartTime();
            }
            List<FitnessProto.ActivityItem> list = dataList;
            if (list == null || list.isEmpty()) {
                processPacketDataResult.d(1);
            } else {
                g0(dataList, startTime);
                if (ActivityDataRepository.INSTANCE.a(dataList, startTime, this.f)) {
                    int iF0 = f0(dataList, startTime);
                    u(getDataType(), iF0);
                    x(startTime);
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

    public final int f0(List<FitnessProto.ActivityItem> data, int dataStartTime) {
        if (data == null || !(!data.isEmpty())) {
            return dataStartTime;
        }
        return this.k ? dataStartTime + (((FitnessProto.ActivityItem) CollectionsKt.last(data)).getTimeOffset() * 60) : dataStartTime + (((FitnessProto.ActivityItem) CollectionsKt.last(data)).getTimeOffset() * 60) + 1;
    }

    public final void g0(final List<FitnessProto.ActivityItem> data, final int dataStartTime) {
        if (if0.w()) {
            if (data == null) {
                m8b.f("Data-Sync", "DailyActivity data is null");
                return;
            }
            m8b.f("Data-Sync", "DailyActivity data startTime= " + o3k.a(((long) dataStartTime) * 1000) + " , totalCount=" + data.size());
            j6e.a("Data-Sync", "DailyActivity", data.size(), 8, new j6e.a() { // from class: com.oplus.aiunit.vision.lq4
                @Override // com.oplus.aiunit.vision.j6e.a
                public final String a(int i) {
                    return g.h0(data, dataStartTime, i);
                }
            });
        }
    }

    @Override // com.heytap.device.data.sporthealth.pull.fetcher.h
    @NotNull
    public String m() {
        return "DailyActivityDataFetcher";
    }
}