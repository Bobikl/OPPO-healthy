package com.heytap.device.data.sporthealth.pull.fetcher;

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
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes15.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0016\u0010\u000e\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002J\u0016\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002J\u0016\u0010\u0012\u001a\u00020\u000f2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00110\nH\u0002¨\u0006\u0015"}, d2 = {"Lcom/heytap/device/data/sporthealth/pull/fetcher/t;", "Lcom/heytap/device/data/sporthealth/pull/fetcher/PacketDataFetcher;", kq5.NOT_SET, "m", kq5.NOT_SET, "data", "Lcom/oplus/aiunit/vision/kze;", "e", "h0", "i0", kq5.NOT_SET, "Lcom/heytap/health/protocol/fitness/FitnessProto$SleepStatisticsDetailData;", "prePacketData", kq5.NOT_SET, "e0", kq5.NOT_SET, "f0", "Lcom/heytap/health/protocol/fitness/FitnessProtoV2$SleepStatisticsItemDataV2;", "g0", "<init>", "()V", "device_data_sync_impl_release"}, k = 1, mv = {1, 8, 0})
public final class t extends PacketDataFetcher {
    public t() {
        super(5, 98, 99, 21);
    }

    @Override // com.heytap.device.data.sporthealth.pull.fetcher.PacketDataFetcher, com.oplus.aiunit.vision.jze
    @NotNull
    public ProcessPacketDataResult e(@NotNull byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return this.k ? h0(data) : i0(data);
    }

    public final int e0(List<FitnessProto.SleepStatisticsDetailData> prePacketData) {
        return ((FitnessProto.SleepStatisticsDetailData) CollectionsKt.last(prePacketData)).getDateTime();
    }

    public final void f0(List<FitnessProto.SleepStatisticsDetailData> data) {
        if (if0.w()) {
            if (!(!data.isEmpty())) {
                m8b.f("Data-Sync", "Print detail Log sleep statistics data is null");
                return;
            }
            int size = data.size();
            for (int i = 0; i < size; i++) {
                m8b.f("Data-Sync", "sleep statistics data size = " + data.size() + " datetime=" + o3k.a(((long) data.get(i).getDateTime()) * 1000) + ", avg sleep spo2 =" + data.get(i).getAvgSleepSpo2() + ", avg sleep heart rate = " + data.get(i).getAvgSleepHeartRate() + ", sleep heart rate range low = " + data.get(i).getSleepHeartRateRangeLow() + ", sleep heart rate range hight = " + data.get(i).getSleepHeartRateRangeHight() + ", avg sleep breathe rang low = " + data.get(i).getAvgSleepBreatheRangLow() + ", avg sleep breathe rang hight = " + data.get(i).getAvgSleepBreatheRangHight() + ", heart rate warning label = " + data.get(i).getHeartRateWarningLabel());
                int sleepBedCount = data.get(i).getSleepBedCount();
                StringBuilder sb = new StringBuilder();
                sb.append("sleep statistics sleep bed time data size = ");
                sb.append(sleepBedCount);
                m8b.f("Data-Sync", sb.toString());
                if (sleepBedCount != 0) {
                    for (int i2 = 0; i2 < sleepBedCount; i2++) {
                        m8b.f("Data-Sync", "sleep statistics sleep bed time type = " + data.get(i).getSleepBed(i2).getType() + " time = " + o3k.a(((long) data.get(i).getSleepBed(i2).getDateTime()) * 1000));
                    }
                }
            }
        }
    }

    public final void g0(List<FitnessProtoV2.SleepStatisticsItemDataV2> data) {
        List<FitnessProtoV2.SleepStatisticsItemDataV2> list = data;
        if (if0.w()) {
            String str = "Data-Sync";
            if (!(!list.isEmpty())) {
                m8b.f("Data-Sync", "Print detail Log sleep statistics data is null");
                return;
            }
            int size = data.size();
            int i = 0;
            while (i < size) {
                int i2 = size;
                String str2 = str;
                int i3 = i;
                m8b.f(str2, "sleep statistics data size = " + data.size() + " datetime=" + o3k.a(((long) list.get(i).getDateTime()) * 1000) + ", avg sleep spo2 =" + list.get(i).getAvgSleepSpo2() + ", sleep_bed_time = " + list.get(i).getSleepBedTime() + ", sleep_outbed_time = " + list.get(i).getSleepOutbedTime() + ", sleep_duration = " + list.get(i).getSleepDuration() + ", sleep_burden = " + list.get(i).getSleepBurden() + ", sleep_recovery_rate = " + list.get(i).getSleepRecoveryRate() + ", sleep_recovery_diff_value = " + list.get(i).getSleepRecoveryDiffValue() + ", hrv_base_data = " + list.get(i).getHrvData().getBaseData() + ", hrv_range_low = " + list.get(i).getHrvData().getBaseRangeLow() + ", hrv_range_high = " + list.get(i).getHrvData().getBaseRangeHight() + ", hrv_reasonable_low = " + list.get(i).getHrvData().getBaseReasonableRangeLow() + ", hrv_reasonable_hight = " + list.get(i).getHrvData().getBaseReasonableRangeHight() + ", heart_base_data = " + list.get(i).getHeartData().getBaseData() + ", heart_range_low = " + list.get(i).getHeartData().getBaseRangeLow() + ", heart_range_high = " + list.get(i).getHeartData().getBaseRangeHight() + ", heart_reasonable_low = " + list.get(i).getHeartData().getBaseReasonableRangeLow() + ", heart_reasonable_hight = " + list.get(i).getHeartData().getBaseReasonableRangeHight() + ", breathe_base_data = " + list.get(i).getBreatheData().getBaseData() + ", breathe_range_low = " + list.get(i).getBreatheData().getBaseRangeLow() + ", breathe_range_high = " + list.get(i).getBreatheData().getBaseRangeHight() + ", breathe_reasonable_low = " + list.get(i).getBreatheData().getBaseReasonableRangeLow() + ", breathe_reasonable_hight = " + list.get(i).getBreatheData().getBaseReasonableRangeHight() + ", heart_rate_warning_label = " + list.get(i).getHeartRateWarningLabel());
                list = data;
                int sleepBedCount = list.get(i3).getSleepBedCount();
                StringBuilder sb = new StringBuilder();
                sb.append("sleep statistics sleep bed time data size = ");
                sb.append(sleepBedCount);
                m8b.f(str2, sb.toString());
                if (sleepBedCount != 0) {
                    for (int i4 = 0; i4 < sleepBedCount; i4++) {
                        m8b.f(str2, "sleep statistics sleep bed time type = " + list.get(i3).getSleepBed(i4).getType() + " time = " + o3k.a(((long) list.get(i3).getSleepBed(i4).getDateTime()) * 1000));
                    }
                }
                i = i3 + 1;
                str = str2;
                size = i2;
            }
        }
    }

    public final ProcessPacketDataResult h0(byte[] data) {
        ProcessPacketDataResult processPacketDataResult = new ProcessPacketDataResult(1, 0);
        try {
            FitnessProtoV2.SleepStatisticsDataV2 from = FitnessProtoV2.SleepStatisticsDataV2.parseFrom(data);
            if (from != null) {
                List dataList = from.getDataList();
                if (dataList == null || dataList.isEmpty()) {
                    processPacketDataResult.d(1);
                    m8b.f("Data-Sync", "sleep statistics data size is 0");
                    return processPacketDataResult;
                }
                List<FitnessProtoV2.SleepStatisticsItemDataV2> dataList2 = from.getDataList();
                Intrinsics.checkNotNullExpressionValue(dataList2, "sleepStatisticsData.dataList");
                g0(dataList2);
                com.heytap.device.data.storage.k.Companion companion = com.heytap.device.data.storage.k.INSTANCE;
                List<FitnessProtoV2.SleepStatisticsItemDataV2> dataList3 = from.getDataList();
                Intrinsics.checkNotNullExpressionValue(dataList3, "sleepStatisticsData.dataList");
                String str = this.f;
                Intrinsics.checkNotNullExpressionValue(str, "deviceMac");
                if (companion.e(dataList3, str)) {
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
            List<FitnessProto.SleepStatisticsDetailData> dataList = FitnessProto.SleepStatisticsData.parseFrom(data).getDataList();
            List<FitnessProto.SleepStatisticsDetailData> list = dataList;
            if (list == null || list.isEmpty()) {
                processPacketDataResult.d(1);
            } else {
                m8b.f("Data-Sync", "On sleep statistics data packet, index=" + T() + " size = " + dataList.size());
                f0(dataList);
                com.heytap.device.data.storage.k.Companion companion = com.heytap.device.data.storage.k.INSTANCE;
                String str = this.f;
                Intrinsics.checkNotNullExpressionValue(str, "deviceMac");
                if (companion.d(dataList, str)) {
                    int iE0 = e0(dataList);
                    if (iE0 > 0) {
                        u(getDataType(), iE0);
                        x(dataList.get(0).getDateTime());
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

    @Override // com.heytap.device.data.sporthealth.pull.fetcher.h
    @NotNull
    public String m() {
        return "SleepStatisticsDataFetcher";
    }
}