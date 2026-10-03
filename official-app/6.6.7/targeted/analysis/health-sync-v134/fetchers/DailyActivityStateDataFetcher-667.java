package com.heytap.device.data.sporthealth.pull.fetcher;

import com.heytap.device.data.storage.ActivityDataRepository;
import com.heytap.health.devicemanager.deviceability.DeviceInfo;
import com.heytap.health.protocol.fitness.FitnessProtoV2;
import com.oplus.aiunit.vision.ProcessPacketDataResult;
import com.oplus.aiunit.vision.gd5;
import com.oplus.aiunit.vision.hii;
import com.oplus.aiunit.vision.if0;
import com.oplus.aiunit.vision.kq5;
import com.oplus.aiunit.vision.m8b;
import com.oplus.aiunit.vision.o3k;
import com.oplus.aiunit.vision.tz4;
import com.oplus.aiunit.vision.v2e;
import com.oplus.aiunit.vision.wl4;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes15.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0016\u0010\u000b\u001a\u00020\n2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¨\u0006\u000e"}, d2 = {"Lcom/heytap/device/data/sporthealth/pull/fetcher/DailyActivityStateDataFetcher;", "Lcom/heytap/device/data/sporthealth/pull/fetcher/PacketDataFetcher;", kq5.NOT_SET, "m", kq5.NOT_SET, "data", "Lcom/oplus/aiunit/vision/kze;", "e", kq5.NOT_SET, "Lcom/heytap/health/protocol/fitness/FitnessProtoV2$SportStatDataV2;", kq5.NOT_SET, "e0", "<init>", "()V", "device_data_sync_impl_release"}, k = 1, mv = {1, 8, 0})
public final class DailyActivityStateDataFetcher extends PacketDataFetcher {
    public DailyActivityStateDataFetcher() {
        super(5, hii.UPPER_LIMB_TRAINING, hii.UPPER_LIMB_TRAINING, 34);
    }

    @Override // com.heytap.device.data.sporthealth.pull.fetcher.PacketDataFetcher, com.oplus.aiunit.vision.jze
    @NotNull
    public ProcessPacketDataResult e(@NotNull byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        ProcessPacketDataResult processPacketDataResult = new ProcessPacketDataResult(1, 0);
        try {
            FitnessProtoV2.SportStatListV2 from = FitnessProtoV2.SportStatListV2.parseFrom(data);
            if (from != null) {
                List dataList = from.getDataList();
                if (dataList == null || dataList.isEmpty()) {
                    processPacketDataResult.d(1);
                    m8b.f("Data-Sync", "daily activity state data size is 0");
                    return processPacketDataResult;
                }
                List<FitnessProtoV2.SportStatDataV2> dataList2 = from.getDataList();
                Intrinsics.checkNotNullExpressionValue(dataList2, "dailyActivityStateData.dataList");
                e0(dataList2);
                ActivityDataRepository.Companion companion = ActivityDataRepository.INSTANCE;
                List<FitnessProtoV2.SportStatDataV2> dataList3 = from.getDataList();
                Intrinsics.checkNotNullExpressionValue(dataList3, "dailyActivityStateData.dataList");
                String str = this.f;
                Intrinsics.checkNotNullExpressionValue(str, "deviceMac");
                if (companion.d(dataList3, str)) {
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
                if (((Boolean) gd5.c(wl4.managerApi.getCurrActiveMac()).a(new Function1<DeviceInfo, Boolean>() { // from class: com.heytap.device.data.sporthealth.pull.fetcher.DailyActivityStateDataFetcher$processPacketData$1
                    @NotNull
                    public final Boolean invoke(@NotNull DeviceInfo deviceInfo) {
                        Intrinsics.checkNotNullParameter(deviceInfo, "$this$applyInfo");
                        return Boolean.valueOf(!deviceInfo.k0());
                    }
                })).booleanValue()) {
                    tz4 tz4Var = tz4.INSTANCE;
                    int startTime = from.getStartTime();
                    int endTime2 = from.getEndTime();
                    List<FitnessProtoV2.SportStatDataV2> dataList4 = from.getDataList();
                    Intrinsics.checkNotNullExpressionValue(dataList4, "dailyActivityStateData.dataList");
                    tz4Var.y(startTime, endTime2, dataList4);
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

    public final void e0(List<FitnessProtoV2.SportStatDataV2> data) {
        if (if0.w()) {
            if (!(!data.isEmpty())) {
                m8b.f("Data-Sync", "Print detail Log daily activity state data is null");
                return;
            }
            int size = data.size();
            for (int i = 0; i < size; i++) {
                m8b.f("Data-Sync", "daily activity state data size = " + data.size() + " datetime=" + o3k.a(((long) data.get(i).getTimestamp()) * 1000) + " " + v2e.b(data.get(i)));
            }
        }
    }

    @Override // com.heytap.device.data.sporthealth.pull.fetcher.h
    @NotNull
    public String m() {
        return "DailyActivityStateDataFetcher";
    }
}