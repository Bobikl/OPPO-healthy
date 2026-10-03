package com.oplus.aiunit.vision;

import com.heytap.accessory.pair.seeker.IDeviceEvent;
import com.heytap.databaseengine.model.DisturbSleep;
import com.heytap.databaseengine.model.SegmentSleepPara;
import com.heytap.databaseengine.model.SleepCheckResult;
import com.heytap.databaseengineservice.db.table.DBSleep;
import com.heytap.databaseengineservice.db.table.DBSleepDataStat;
import com.heytap.health.device_data_sync.data_sync.IDataSyncService;
import com.heytap.health.device_data_sync.data_sync.SleepCalibrationItem;
import com.heytap.health.device_data_sync.data_sync.SleepFixDataItem;
import com.heytap.health.device_settings.health.SportHealthSetting;
import com.heytap.health.device_settings.setting.IDeviceSettingService;
import com.heytap.health.devicemanager.client.call.DMCallException;
import com.heytap.health.health.sleep.DisturbService;
import com.heytap.health.protocol.workout.WorkoutProto;
import com.heytap.health.sleepcheck.result.SleepCheckAndSleepScoreResult;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 B2\u00020\u00012\u00020\u0002:\u0001\u0012B\u0007¢\u0006\u0004\b@\u0010AJ\u0015\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\r\u001a\u00020\u0004H\u0016J\u0018\u0010\u0012\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0010\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0004H\u0016J\u0010\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0004H\u0016J\u0018\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J6\u0010!\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00042\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0004H\u0016J\u001e\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u00192\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"H\u0016J6\u0010'\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00042\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0004H\u0002J\u0010\u0010(\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u0004H\u0002J.\u0010.\u001a\u00020\t2\u0006\u0010)\u001a\u00020\"2\u0006\u0010\u001f\u001a\u00020\u001e2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020+0*2\u0006\u0010-\u001a\u00020\u0010H\u0002J&\u00101\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u001e2\f\u00100\u001a\b\u0012\u0004\u0012\u00020/0*2\u0006\u0010-\u001a\u00020\u0010H\u0002J\u0010\u00104\u001a\u00020\t2\u0006\u00103\u001a\u000202H\u0002J>\u00106\u001a\u00020\t2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u000e\u00100\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010/0\u00192\u0006\u00105\u001a\u0002022\u0006\u0010)\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002J0\u00108\u001a\u00020\t2\u0006\u00107\u001a\u0002022\u000e\u00100\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010/0\u00192\u0006\u0010)\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002JS\u0010;\u001a\u00020\t2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\f\u0010,\u001a\b\u0012\u0004\u0012\u00020+0\u00192\u0006\u00105\u001a\u0002022\u000e\u0010:\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001090\u00032\u0006\u0010)\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b;\u0010<J?\u0010>\u001a\u00020\t2\u0006\u00107\u001a\u0002022\u000e\u0010:\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001090\u00032\u0006\u0010=\u001a\u00020\u00102\u0006\u0010)\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b>\u0010?¨\u0006C"}, d2 = {"Lcom/oplus/aiunit/vision/ee5;", "Lcom/oplus/aiunit/vision/lq9;", "Lcom/oplus/aiunit/vision/kq9;", "", "", "h", "()[Ljava/lang/String;", "", "floatArray", "", "g", "", "d", "b", "", "level", "", "date", "a", IDeviceEvent.FLAG_MAC, "x", "l", "score", "f", "ssoid", "", "Lcom/heytap/databaseengineservice/db/table/DBSleep;", "dbSleepList", "", "sleepStatus", "Lcom/heytap/health/sleepcheck/result/SleepCheckAndSleepScoreResult;", "sleepCheckAndSleepScoreResult", "dataClient", "c", "", "startTime", "endTime", "Lcom/heytap/databaseengine/model/DisturbSleep;", "e", "u", "z", "firstSleepDataTime", "", "Lcom/heytap/health/device_data_sync/data_sync/SleepFixDataItem;", "sleepFixDataItemList", "i", "r", "Lcom/heytap/health/device_data_sync/data_sync/SleepCalibrationItem;", "sleepCalibrationItems", "s", "Lcom/heytap/databaseengineservice/db/table/DBSleepDataStat;", "checkedStat", "v", "checkStat", "F", "dbSleepDataStat", "t", "Lcom/heytap/databaseengine/model/SegmentSleepPara;", "segmentSleepParas", "A", "(Ljava/util/List;Ljava/util/List;Lcom/heytap/databaseengineservice/db/table/DBSleepDataStat;[Lcom/heytap/databaseengine/model/SegmentSleepPara;J[S)V", "integer", "E", "(Lcom/heytap/databaseengineservice/db/table/DBSleepDataStat;[Lcom/heytap/databaseengine/model/SegmentSleepPara;IJ[S)V", "<init>", "()V", "Companion", "depend_release"}, k = 1, mv = {1, 8, 0})
public final class ee5 implements lq9, kq9 {

    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\u000b"}, d2 = {"com/oplus/aiunit/vision/ee5$b", "Lcom/oplus/aiunit/vision/im4;", "", IDeviceEvent.FLAG_MAC, "Lcom/oplus/wearable/linkservice/sdk/common/MessageEvent;", "response", "", "a", "Lcom/heytap/health/devicemanager/client/call/DMCallException;", "throwable", "b", "depend_release"}, k = 1, mv = {1, 8, 0})
    public static final class b implements im4 {
        public void a(@NotNull String mac, @NotNull MessageEvent response) {
            Intrinsics.checkNotNullParameter(mac, IDeviceEvent.FLAG_MAC);
            Intrinsics.checkNotNullParameter(response, "response");
            WorkoutProto.sport_res from = WorkoutProto.sport_res.parseFrom(response.getData());
            Intrinsics.checkNotNullExpressionValue(from, "parseFrom(response.data)");
            m8b.f("DeviceDelegateImpl", "sendHrOnlineLearningToDevice response:" + from.getResCode());
        }

        public void b(@NotNull DMCallException throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            m8b.f("DeviceDelegateImpl", "sendHrOnlineLearningToDevice failure");
        }
    }

    public static final void B(ee5 ee5Var, final DBSleepDataStat dBSleepDataStat, SegmentSleepPara[] segmentSleepParaArr, long j, short[] sArr, List list, List list2, int i) {
        String str;
        Intrinsics.checkNotNullParameter(ee5Var, "this$0");
        Intrinsics.checkNotNullParameter(dBSleepDataStat, "$checkStat");
        Intrinsics.checkNotNullParameter(segmentSleepParaArr, "$segmentSleepParas");
        Intrinsics.checkNotNullParameter(sArr, "$sleepStatus");
        Intrinsics.checkNotNullParameter(list, "$sleepFixDataItemList");
        Intrinsics.checkNotNullParameter(list2, "$dbSleepList");
        if (i <= -1) {
            if (i != -100000) {
                sj4.c("DeviceDelegateImpl", "send sleep result from device: false");
                try {
                    final DBSleepDataStat dBSleepDataStatC = new sth().c(list2);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("result_need_send_to_device", "1_" + vd8.g(dBSleepDataStat));
                    jSONObject.put("sleep_check_result_sent_", "0_" + vd8.g(list));
                    dBSleepDataStatC.setMetadata(mzi.N(dBSleepDataStat.getMetadata(), jSONObject.toString()));
                    sj4.a("DeviceDelegateImpl", "updateNewCheckData sleep calibration data not success update: " + dBSleepDataStatC.getMetadata());
                    cs8.e("DeviceDImpl").execute(new Runnable() { // from class: com.oplus.aiunit.vision.de5
                        @Override // java.lang.Runnable
                        public final void run() {
                            ee5.D(dBSleepDataStatC);
                        }
                    });
                    return;
                } catch (JSONException e) {
                    sj4.b("DeviceDelegateImpl", "sleepCheckResult device used check data JSONException e: " + e.getMessage());
                    return;
                }
            }
            return;
        }
        try {
            sj4.c("DeviceDelegateImpl", "send sleep fix data to device result: " + i);
            str = "DeviceDelegateImpl";
            try {
                ee5Var.E(dBSleepDataStat, segmentSleepParaArr, i, j, sArr);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("sleep_check_result_device_used_", i);
                jSONObject2.put("result_need_send_to_device", "0_");
                jSONObject2.put("sleep_check_result_sent_", "1_" + vd8.g(list));
                dBSleepDataStat.setMetadata(mzi.N(dBSleepDataStat.getMetadata(), jSONObject2.toString()));
                sj4.a(str, "check sleep data result update: " + dBSleepDataStat);
                cs8.e("DeviceDImpl").execute(new Runnable() { // from class: com.oplus.aiunit.vision.ce5
                    @Override // java.lang.Runnable
                    public final void run() {
                        ee5.C(dBSleepDataStat);
                    }
                });
            } catch (JSONException e2) {
                e = e2;
                sj4.b(str, "sleepCheckResult device used check data JSONException e: " + e.getMessage());
            }
        } catch (JSONException e3) {
            e = e3;
            str = "DeviceDelegateImpl";
        }
    }

    public static final void C(DBSleepDataStat dBSleepDataStat) {
        Intrinsics.checkNotNullParameter(dBSleepDataStat, "$checkStat");
        qhi.b(1011).a(CollectionsKt.listOf(dBSleepDataStat), false);
    }

    public static final void D(DBSleepDataStat dBSleepDataStat) {
        sz9 sz9VarB = qhi.b(1011);
        Intrinsics.checkNotNullExpressionValue(dBSleepDataStat, "statData");
        sz9VarB.a(CollectionsKt.listOf(dBSleepDataStat), false);
    }

    public static final void G(ee5 ee5Var, final DBSleepDataStat dBSleepDataStat, List list, long j, short[] sArr, List list2, int i) {
        Intrinsics.checkNotNullParameter(ee5Var, "this$0");
        Intrinsics.checkNotNullParameter(dBSleepDataStat, "$checkStat");
        Intrinsics.checkNotNullParameter(list, "$sleepCalibrationItems");
        Intrinsics.checkNotNullParameter(sArr, "$sleepStatus");
        Intrinsics.checkNotNullParameter(list2, "$dbSleepList");
        ee5Var.t(dBSleepDataStat, list, j, sArr);
        if (i == 100000) {
            try {
                sj4.c("DeviceDelegateImpl", "updateNewCheckData send sleep calibration data to device result: " + i);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("result_need_send_to_device", "0_");
                jSONObject.put("sleep_calibration_result_sent", "1_" + vd8.g(list));
                dBSleepDataStat.setMetadata(mzi.N(dBSleepDataStat.getMetadata(), jSONObject.toString()));
                sj4.a("DeviceDelegateImpl", "updateNewCheckData sleep calibration data result update: " + dBSleepDataStat.getMetadata());
                cs8.e("DeviceDImpl").execute(new Runnable() { // from class: com.oplus.aiunit.vision.ae5
                    @Override // java.lang.Runnable
                    public final void run() {
                        ee5.H(dBSleepDataStat);
                    }
                });
                return;
            } catch (JSONException e) {
                sj4.b("DeviceDelegateImpl", "sleepCheckResult device used check data JSONException e: " + e.getMessage());
                return;
            }
        }
        if (i != -100000 || ((!list2.isEmpty()) && ((DBSleep) list2.get(0)).getDataVersion() == 12)) {
            sj4.c("DeviceDelegateImpl", "updateNewCheckData send sleep calibration result from device: false");
            try {
                sj4.c("DeviceDelegateImpl", "updateNewCheckData send sleep calibration data to device result: " + i);
                final DBSleepDataStat dBSleepDataStatC = new sth().c(list2);
                JSONObject jSONObject2 = new JSONObject();
                if (i == 0) {
                    jSONObject2.put("result_need_send_to_device", "0_");
                } else {
                    jSONObject2.put("result_need_send_to_device", "1_" + vd8.g(dBSleepDataStat));
                }
                jSONObject2.put("sleep_calibration_result_sent", "0_" + vd8.g(list));
                dBSleepDataStatC.setMetadata(mzi.N(dBSleepDataStat.getMetadata(), jSONObject2.toString()));
                sj4.a("DeviceDelegateImpl", "updateNewCheckData sleep calibration data not success update: " + dBSleepDataStatC.getMetadata());
                cs8.e("DeviceDImpl").execute(new Runnable() { // from class: com.oplus.aiunit.vision.be5
                    @Override // java.lang.Runnable
                    public final void run() {
                        ee5.I(dBSleepDataStatC);
                    }
                });
            } catch (JSONException e2) {
                sj4.b("DeviceDelegateImpl", "sleepCheckResult device used check data JSONException e: " + e2.getMessage());
            }
        }
    }

    public static final void H(DBSleepDataStat dBSleepDataStat) {
        Intrinsics.checkNotNullParameter(dBSleepDataStat, "$checkStat");
        qhi.b(1011).a(CollectionsKt.listOf(dBSleepDataStat), false);
    }

    public static final void I(DBSleepDataStat dBSleepDataStat) {
        sz9 sz9VarB = qhi.b(1011);
        Intrinsics.checkNotNullExpressionValue(dBSleepDataStat, "statData");
        sz9VarB.a(CollectionsKt.listOf(dBSleepDataStat), false);
    }

    public static final void w(int i) {
        if (i != 100000) {
            m8b.f("DeviceDelegateImpl", "sendOsaLevelToDevice send osa level result from device: false");
            return;
        }
        m8b.f("DeviceDelegateImpl", "sendOsaLevelToDevice send osa level to device result: " + i);
    }

    public static final void y(int i) {
        if (i != 100000) {
            sj4.c("DeviceDelegateImpl", "updateNewCheckData send sleep check score result from device: false");
            return;
        }
        sj4.c("DeviceDelegateImpl", "updateNewCheckData send sleep check score to device result: " + i);
    }

    public final void A(final List<? extends DBSleep> dbSleepList, final List<? extends SleepFixDataItem> sleepFixDataItemList, final DBSleepDataStat checkStat, final SegmentSleepPara[] segmentSleepParas, final long firstSleepDataTime, final short[] sleepStatus) {
        sj4.c("DeviceDelegateImpl", "send check sleep data to device: " + sleepFixDataItemList + ", metadata: " + checkStat.getMetadata());
        if (rz.b(sleepFixDataItemList)) {
            sj4.c("DeviceDelegateImpl", "updateCheckData sleep fix data is null or empty");
        } else {
            ((IDataSyncService) e1.d().h(IDataSyncService.class)).Y5(sleepFixDataItemList, new ln3() { // from class: com.oplus.aiunit.vision.zd5
                public final void onResult(Object obj) {
                    ee5.B(this.a, checkStat, segmentSleepParas, firstSleepDataTime, sleepStatus, sleepFixDataItemList, dbSleepList, ((Integer) obj).intValue());
                }
            });
        }
    }

    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v10 */
    public final void E(DBSleepDataStat dbSleepDataStat, SegmentSleepPara[] segmentSleepParas, int integer, long firstSleepDataTime, short[] sleepStatus) {
        SegmentSleepPara[] segmentSleepParaArr = segmentSleepParas;
        long fallAsleep = dbSleepDataStat.getFallAsleep();
        long sleepOut = dbSleepDataStat.getSleepOut();
        int length = segmentSleepParaArr.length;
        long j = 0;
        ?? r9 = 1;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        boolean z = true;
        int i = 0;
        while (i < length) {
            SegmentSleepPara segmentSleepPara = segmentSleepParaArr[i];
            Intrinsics.checkNotNull(segmentSleepPara);
            int sleepOutPoint = segmentSleepPara.getSleepOutPoint() - segmentSleepPara.getSleepInPoint();
            int i2 = length;
            long j5 = sleepOut;
            if (((integer >> i) & 1) == r9) {
                sj4.c("DeviceDelegateImpl", "update fallAsleep and sleep out");
                if (segmentSleepPara.getCheckInSleepPoint() + segmentSleepPara.getCheckOutSleepPoint() <= sleepOutPoint) {
                    if (z) {
                        fallAsleep = mzi.g(firstSleepDataTime + (((long) (segmentSleepPara.getSleepInPoint() + segmentSleepPara.getCheckInSleepPoint())) * ((long) 60000)), (boolean) r9);
                        z = false;
                    }
                    i = i;
                    sleepOut = mzi.g(firstSleepDataTime + (((long) ((segmentSleepPara.getSleepOutPoint() + r9) - segmentSleepPara.getCheckOutSleepPoint())) * ((long) 60000)), false);
                }
                i++;
                segmentSleepParaArr = segmentSleepParas;
                length = i2;
                r9 = 1;
            } else {
                sj4.c("DeviceDelegateImpl", "seg indexInterval:" + sleepOutPoint);
                int i3 = sleepOutPoint + 1;
                int iCoerceAtMost = RangesKt.coerceAtMost(segmentSleepPara.getCheckInSleepPoint(), i3);
                for (int i4 = 0; i4 < iCoerceAtMost; i4++) {
                    short s = (short) (sleepStatus[segmentSleepPara.getSleepInPoint() + i4] & 7);
                    if (s == 0 || s == 4) {
                        j4++;
                    } else if (s == 1) {
                        j2++;
                    } else if (s == 2) {
                        j++;
                    } else if (s == 3) {
                        j3++;
                    }
                }
                boolean z2 = false;
                int iCoerceAtMost2 = RangesKt.coerceAtMost(segmentSleepPara.getCheckOutSleepPoint(), RangesKt.coerceAtLeast(i3 - segmentSleepPara.getCheckInSleepPoint(), 0));
                int i5 = 0;
                while (i5 < iCoerceAtMost2) {
                    short s2 = (short) (sleepStatus[segmentSleepPara.getSleepOutPoint() - i5] & 7);
                    if ((s2 == 0 || s2 == 4) ? true : z2) {
                        j4++;
                    } else if (s2 == 1) {
                        j2++;
                    } else {
                        if (s2 == 2) {
                            j++;
                        } else if (s2 == 3) {
                            j3++;
                        }
                        i5++;
                        z2 = false;
                    }
                    i5++;
                    z2 = false;
                }
            }
            sleepOut = j5;
            i++;
            segmentSleepParaArr = segmentSleepParas;
            length = i2;
            r9 = 1;
        }
        dbSleepDataStat.setFallAsleep(fallAsleep);
        dbSleepDataStat.setTotalSleepTime(dbSleepDataStat.getTotalSleepTime() + j + j2 + j3);
        dbSleepDataStat.setTotalDeepSleepTime(dbSleepDataStat.getTotalDeepSleepTime() + j);
        dbSleepDataStat.setTotalLightlySleepTime(dbSleepDataStat.getTotalLightlySleepTime() + j2);
        dbSleepDataStat.setTotalRemTime(dbSleepDataStat.getTotalRemTime() + j3);
        dbSleepDataStat.setTotalWakeUpTime(dbSleepDataStat.getTotalWakeUpTime() + j4);
        dbSleepDataStat.setSleepOut(sleepOut);
    }

    public final void F(final List<? extends DBSleep> dbSleepList, final List<? extends SleepCalibrationItem> sleepCalibrationItems, final DBSleepDataStat checkStat, final long firstSleepDataTime, final short[] sleepStatus) {
        sj4.c("DeviceDelegateImpl", "updateNewCheckData send calibration sleep data to device: " + sleepCalibrationItems);
        if (rz.b(sleepCalibrationItems)) {
            sj4.c("DeviceDelegateImpl", "updateNewCheckData sleep data is null or empty");
        } else {
            ((IDataSyncService) e1.d().h(IDataSyncService.class)).W7(sleepCalibrationItems, new ln3() { // from class: com.oplus.aiunit.vision.yd5
                public final void onResult(Object obj) {
                    ee5.G(this.a, checkStat, sleepCalibrationItems, firstSleepDataTime, sleepStatus, dbSleepList, ((Integer) obj).intValue());
                }
            });
        }
    }

    public void a(byte level, int date) {
        ((IDataSyncService) e1.d().h(IDataSyncService.class)).U2(level, (int) (o15.a(date) / ((long) 1000)), new ln3() { // from class: com.oplus.aiunit.vision.wd5
            public final void onResult(Object obj) {
                ee5.w(((Integer) obj).intValue());
            }
        });
    }

    @NotNull
    public String b() {
        return SportHealthSetting.NAP_SUNSHINEDURATION.name();
    }

    public void c(@NotNull String ssoid, @NotNull List<? extends DBSleep> dbSleepList, @NotNull short[] sleepStatus, @NotNull SleepCheckAndSleepScoreResult sleepCheckAndSleepScoreResult, @NotNull String dataClient) {
        Intrinsics.checkNotNullParameter(ssoid, "ssoid");
        Intrinsics.checkNotNullParameter(dbSleepList, "dbSleepList");
        Intrinsics.checkNotNullParameter(sleepStatus, "sleepStatus");
        Intrinsics.checkNotNullParameter(sleepCheckAndSleepScoreResult, "sleepCheckAndSleepScoreResult");
        Intrinsics.checkNotNullParameter(dataClient, "dataClient");
        u(ssoid, dbSleepList, sleepStatus, sleepCheckAndSleepScoreResult, dataClient);
    }

    public boolean d() {
        Object objNavigation = e1.d().b("/device_settings/DeviceSettingServiceImpl").navigation();
        IDeviceSettingService iDeviceSettingService = objNavigation instanceof IDeviceSettingService ? (IDeviceSettingService) objNavigation : null;
        return iDeviceSettingService != null && iDeviceSettingService.k();
    }

    @NotNull
    public List<DisturbSleep> e(long startTime, long endTime) {
        List<DisturbSleep> listH2 = ((DisturbService) e1.d().h(DisturbService.class)).h2(startTime, endTime);
        Intrinsics.checkNotNullExpressionValue(listH2, "getInstance().navigation…bData(startTime, endTime)");
        return listH2;
    }

    public void f(int score, int date) {
        ((IDataSyncService) e1.d().h(IDataSyncService.class)).x5(score, (int) (o15.a(date) / ((long) 1000)), new ln3() { // from class: com.oplus.aiunit.vision.xd5
            public final void onResult(Object obj) {
                ee5.y(((Integer) obj).intValue());
            }
        });
    }

    public void g(@NotNull float[] floatArray) {
        Intrinsics.checkNotNullParameter(floatArray, "floatArray");
        m8b.f("DeviceDelegateImpl", "sendHrOnlineLearningToDevice data:" + ArraysKt.toList(floatArray));
        WorkoutProto.hr_online_learning_result.Builder builderNewBuilder = WorkoutProto.hr_online_learning_result.newBuilder();
        builderNewBuilder.addAllFeatureList(ArraysKt.toList(floatArray));
        MessageEvent messageEvent = new MessageEvent(4, 67, builderNewBuilder.build().toByteArray());
        pl4 pl4Var = wl4.devicePrimary.d;
        String currentConnectId = wl4.managerApi.getCurrentConnectId();
        if (currentConnectId == null) {
            currentConnectId = "";
        }
        pl4.a.b(pl4Var, currentConnectId, messageEvent, new b(), (ap4) null, 0L, 0, 56, (Object) null);
    }

    @NotNull
    public String[] h() {
        return new String[]{SportHealthSetting.HIGH_RATE_NOTIFICATION_ENABLE.name(), SportHealthSetting.QUIET_RATE_NOTIFICATION_ENABLE.name(), SportHealthSetting.HIGH_RATE_VALUE.name(), SportHealthSetting.QUIET_RATE_VALUE.name(), SportHealthSetting.QUIET_RATE_LOW_VALUE.name()};
    }

    public int l(@NotNull String mac) {
        Intrinsics.checkNotNullParameter(mac, IDeviceEvent.FLAG_MAC);
        return ((IDataSyncService) e1.d().h(IDataSyncService.class)).l(mac);
    }

    public final void r(long firstSleepDataTime, SleepCheckAndSleepScoreResult sleepCheckAndSleepScoreResult, List<SleepFixDataItem> sleepFixDataItemList, int i) {
        if (i >= 5) {
            sj4.d("DeviceDelegateImpl", "buildDataSendToDevice data seg big than 5!");
            return;
        }
        com.heytap.health.sleepcheck.result.SegmentSleepPara segmentSleepPara = sleepCheckAndSleepScoreResult.segmentSleepParas[i];
        int i2 = segmentSleepPara.check_inSleepPoint;
        int i3 = segmentSleepPara.check_outSleepPoint;
        int i4 = segmentSleepPara.check_sleepLatency;
        SleepFixDataItem sleepFixDataItem = new SleepFixDataItem();
        long j = 1000;
        sleepFixDataItem.setSleepOriginalInTime((int) ((firstSleepDataTime + ((long) (sleepCheckAndSleepScoreResult.segmentInfo[i][0] * 60000))) / j));
        sleepFixDataItem.setSleepOriginalOutTime((int) ((firstSleepDataTime + ((long) (sleepCheckAndSleepScoreResult.segmentInfo[i][1] * 60000))) / j));
        int i5 = sleepCheckAndSleepScoreResult.segmentInfo[i][0];
        sleepFixDataItem.setSleepInTime((int) ((firstSleepDataTime + ((long) (RangesKt.coerceAtLeast(i2 + i5, i5) * 60000))) / j));
        int i6 = sleepCheckAndSleepScoreResult.segmentInfo[i][1];
        sleepFixDataItem.setSleepOutTime((int) ((firstSleepDataTime + ((long) (RangesKt.coerceAtMost(i6 - i3, i6) * 60000))) / j));
        sleepFixDataItem.setSleepCost(i4);
        sleepFixDataItem.setLastSleepTime((int) ((firstSleepDataTime + ((long) (sleepCheckAndSleepScoreResult.segmentInfo[i][1] * 60000))) / j));
        sleepFixDataItemList.add(sleepFixDataItem);
    }

    public final void s(SleepCheckAndSleepScoreResult sleepCheckAndSleepScoreResult, List<SleepCalibrationItem> sleepCalibrationItems, int i) {
        if (i >= 20) {
            sj4.d("DeviceDelegateImpl", "buildNewProtocolDataToDevice data seg big than 20!");
            return;
        }
        int i2 = sleepCheckAndSleepScoreResult.segmentSleepParas[i].check_num;
        for (int i3 = 0; i3 < i2; i3++) {
            SleepCalibrationItem sleepCalibrationItem = new SleepCalibrationItem();
            long j = 1000;
            sleepCalibrationItem.setStartTimestamp((int) (sleepCheckAndSleepScoreResult.segmentSleepParas[i].check_start_finish_ts[0][i3] / j));
            sleepCalibrationItem.setEndTimestamp((int) (sleepCheckAndSleepScoreResult.segmentSleepParas[i].check_start_finish_ts[1][i3] / j));
            sleepCalibrationItems.add(sleepCalibrationItem);
        }
    }

    public final void t(DBSleepDataStat dbSleepDataStat, List<? extends SleepCalibrationItem> sleepCalibrationItems, long firstSleepDataTime, short[] sleepStatus) {
        for (SleepCalibrationItem sleepCalibrationItem : sleepCalibrationItems) {
            Intrinsics.checkNotNull(sleepCalibrationItem);
            if (((long) sleepCalibrationItem.getStartTimestamp()) * 1000 == firstSleepDataTime) {
                dbSleepDataStat.setFallAsleep(mzi.g((((long) sleepCalibrationItem.getEndTimestamp()) * 1000) + ((long) 60000), true));
            }
            long j = 60000;
            if ((((long) sleepCalibrationItem.getEndTimestamp()) * 1000) + j == (((long) sleepStatus.length) * j) + firstSleepDataTime) {
                dbSleepDataStat.setSleepOut(mzi.g(((long) sleepCalibrationItem.getStartTimestamp()) * 1000, false));
            }
        }
    }

    public final void u(String ssoid, List<? extends DBSleep> dbSleepList, short[] sleepStatus, SleepCheckAndSleepScoreResult sleepCheckAndSleepScoreResult, String dataClient) {
        sj4.c("DeviceDelegateImpl", "processCheckResult() sleepCheckAndSleepScoreResult: " + sleepCheckAndSleepScoreResult);
        int i = sleepCheckAndSleepScoreResult.sleepScore;
        int i2 = sleepCheckAndSleepScoreResult.sleepScoreCheck;
        long startTimestamp = dbSleepList.get(0).getStartTimestamp();
        int i3 = o15.i(o15.o(startTimestamp));
        SleepCheckResult sleepCheckResult = new SleepCheckResult();
        sleepCheckResult.setSleepScore(i);
        sleepCheckResult.setSleepScoreCheck(i2);
        sleepCheckResult.setTotalSleepMinutes(sleepCheckAndSleepScoreResult.totalSleepMinutes);
        sleepCheckResult.setSegment(sleepCheckAndSleepScoreResult.segment);
        sleepCheckResult.setSegmentInfo(sleepCheckAndSleepScoreResult.segmentInfo);
        SegmentSleepPara[] segmentSleepParaArr = new SegmentSleepPara[sleepCheckAndSleepScoreResult.segment];
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i4 = sleepCheckAndSleepScoreResult.segment;
        int i5 = 0;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        long j5 = 0;
        while (i5 < i4) {
            com.heytap.health.sleepcheck.result.SegmentSleepPara segmentSleepPara = sleepCheckAndSleepScoreResult.segmentSleepParas[i5];
            ArrayList arrayList3 = arrayList2;
            int i6 = segmentSleepPara.check_inSleepPoint;
            int i7 = i4;
            int i8 = segmentSleepPara.check_outSleepPoint;
            int i9 = segmentSleepPara.check_sleepLatency;
            long j6 = j5;
            SegmentSleepPara segmentSleepPara2 = new SegmentSleepPara();
            segmentSleepParaArr[i5] = segmentSleepPara2;
            Intrinsics.checkNotNull(segmentSleepPara2);
            segmentSleepPara2.setSleepInPoint(sleepCheckAndSleepScoreResult.segmentSleepParas[i5].sleepInPoint);
            SegmentSleepPara segmentSleepPara3 = segmentSleepParaArr[i5];
            Intrinsics.checkNotNull(segmentSleepPara3);
            segmentSleepPara3.setSleepOutPoint(sleepCheckAndSleepScoreResult.segmentSleepParas[i5].sleepOutPoint);
            SegmentSleepPara segmentSleepPara4 = segmentSleepParaArr[i5];
            Intrinsics.checkNotNull(segmentSleepPara4);
            segmentSleepPara4.setSleepMinutes(sleepCheckAndSleepScoreResult.segmentSleepParas[i5].sleepMinutes);
            SegmentSleepPara segmentSleepPara5 = segmentSleepParaArr[i5];
            Intrinsics.checkNotNull(segmentSleepPara5);
            segmentSleepPara5.setDeepMinutes(sleepCheckAndSleepScoreResult.segmentSleepParas[i5].deepMinutes);
            SegmentSleepPara segmentSleepPara6 = segmentSleepParaArr[i5];
            Intrinsics.checkNotNull(segmentSleepPara6);
            segmentSleepPara6.setLowMinutes(sleepCheckAndSleepScoreResult.segmentSleepParas[i5].lowMinutes);
            SegmentSleepPara segmentSleepPara7 = segmentSleepParaArr[i5];
            Intrinsics.checkNotNull(segmentSleepPara7);
            segmentSleepPara7.setRemMinutes(sleepCheckAndSleepScoreResult.segmentSleepParas[i5].remMinutes);
            SegmentSleepPara segmentSleepPara8 = segmentSleepParaArr[i5];
            Intrinsics.checkNotNull(segmentSleepPara8);
            segmentSleepPara8.setWakeMinutes(sleepCheckAndSleepScoreResult.segmentSleepParas[i5].wakeMinutes);
            SegmentSleepPara segmentSleepPara9 = segmentSleepParaArr[i5];
            Intrinsics.checkNotNull(segmentSleepPara9);
            segmentSleepPara9.setWakeCount(sleepCheckAndSleepScoreResult.segmentSleepParas[i5].wakeCount);
            SegmentSleepPara segmentSleepPara10 = segmentSleepParaArr[i5];
            Intrinsics.checkNotNull(segmentSleepPara10);
            segmentSleepPara10.setCheckInSleepPoint(i6);
            SegmentSleepPara segmentSleepPara11 = segmentSleepParaArr[i5];
            Intrinsics.checkNotNull(segmentSleepPara11);
            segmentSleepPara11.setCheckOutSleepPoint(i8);
            SegmentSleepPara segmentSleepPara12 = segmentSleepParaArr[i5];
            Intrinsics.checkNotNull(segmentSleepPara12);
            segmentSleepPara12.setCheckSleepLatency(i9);
            com.heytap.health.sleepcheck.result.SegmentSleepPara segmentSleepPara13 = sleepCheckAndSleepScoreResult.segmentSleepParas[i5];
            j4 += (long) segmentSleepPara13.sleepMinutes;
            long j7 = ((long) segmentSleepPara13.deepMinutes) + j;
            j3 += (long) segmentSleepPara13.lowMinutes;
            long j8 = j2 + ((long) segmentSleepPara13.remMinutes);
            long j9 = j6 + ((long) segmentSleepPara13.wakeMinutes);
            int i10 = i5;
            SegmentSleepPara[] segmentSleepParaArr2 = segmentSleepParaArr;
            r(startTimestamp, sleepCheckAndSleepScoreResult, arrayList, i10);
            SegmentSleepPara segmentSleepPara14 = segmentSleepParaArr2[i10];
            Intrinsics.checkNotNull(segmentSleepPara14);
            segmentSleepPara14.setCheckNum(sleepCheckAndSleepScoreResult.segmentSleepParas[i10].check_num);
            SegmentSleepPara segmentSleepPara15 = segmentSleepParaArr2[i10];
            Intrinsics.checkNotNull(segmentSleepPara15);
            segmentSleepPara15.setCheckStartFinishTs(sleepCheckAndSleepScoreResult.segmentSleepParas[i10].check_start_finish_ts);
            s(sleepCheckAndSleepScoreResult, arrayList3, i10);
            i5 = i10 + 1;
            segmentSleepParaArr = segmentSleepParaArr2;
            arrayList2 = arrayList3;
            i4 = i7;
            j5 = j9;
            j2 = j8;
            j = j7;
        }
        long j10 = j5;
        ArrayList arrayList4 = arrayList2;
        long j11 = j2;
        SegmentSleepPara[] segmentSleepParaArr3 = segmentSleepParaArr;
        sleepCheckResult.setSegmentSleepParas(segmentSleepParaArr3);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sleep_check_result_", vd8.g(sleepCheckResult));
        } catch (JSONException e) {
            sj4.b("DeviceDelegateImpl", "sleepCheckResult JSONException e: " + e.getMessage());
        }
        DBSleepDataStat dBSleepDataStat = new DBSleepDataStat();
        dBSleepDataStat.setSsoid(ssoid);
        dBSleepDataStat.setFallAsleep(mzi.g(startTimestamp, true));
        dBSleepDataStat.setSleepOut(mzi.g(startTimestamp + (((long) sleepStatus.length) * ((long) 60000)), false));
        dBSleepDataStat.setTotalSleepTime(j4);
        dBSleepDataStat.setTotalDeepSleepTime(j);
        dBSleepDataStat.setTotalLightlySleepTime(j3);
        dBSleepDataStat.setTotalRemTime(j11);
        dBSleepDataStat.setTotalWakeUpTime(j10);
        dBSleepDataStat.setDate(i3);
        if (z(dataClient)) {
            dBSleepDataStat.setSleepScore(0);
            dBSleepDataStat.setCheckedSleepScore(0);
        } else {
            dBSleepDataStat.setSleepScore(Integer.valueOf(i));
            dBSleepDataStat.setCheckedSleepScore(Integer.valueOf(i2));
        }
        dBSleepDataStat.setMetadata(jSONObject.toString());
        dBSleepDataStat.setSyncStatus(0);
        dBSleepDataStat.setModifiedTimestamp(0L);
        dBSleepDataStat.setTimezone(o15.r((String) null));
        v(dBSleepDataStat);
        F(dbSleepList, arrayList4, dBSleepDataStat, startTimestamp, sleepStatus);
        A(dbSleepList, arrayList, dBSleepDataStat, segmentSleepParaArr3, startTimestamp, sleepStatus);
    }

    public final void v(DBSleepDataStat checkedStat) {
        sj4.c("DeviceDelegateImpl", "saveTodayCheckData jsonStr: " + checkedStat.getMetadata());
        sj4.a("DeviceDelegateImpl", "saveTodayCheckData data: " + checkedStat);
        qhi.b(1011).a(CollectionsKt.listOf(checkedStat), false);
    }

    public int x(@NotNull String mac) {
        Intrinsics.checkNotNullParameter(mac, IDeviceEvent.FLAG_MAC);
        return ((IDataSyncService) e1.d().h(IDataSyncService.class)).x(mac);
    }

    public final boolean z(String dataClient) {
        return yei.a(dataClient).E7();
    }
}
