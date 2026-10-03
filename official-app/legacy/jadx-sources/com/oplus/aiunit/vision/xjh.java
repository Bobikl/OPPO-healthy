package com.oplus.aiunit.vision;

import android.text.TextUtils;
import com.heytap.databaseengine.model.SleepIndex;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 \u00112\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u0019\u0010\t\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¨\u0006\u0012"}, d2 = {"Lcom/oplus/aiunit/vision/xjh;", "", "", "Lcom/heytap/databaseengine/model/SleepIndex;", "sleepIndexList", "", "c", "", "value", "a", "(Ljava/lang/Integer;)I", "", "heartRateWarningLabel", "", "b", "<init>", "()V", "Companion", "health_release"}, k = 1, mv = {1, 8, 0})
public final class xjh {
    public static final int HAS_HEART_RATE_WARNING = 1;

    public final int a(Integer value) {
        if (value != null) {
            return value.intValue();
        }
        return 0;
    }

    public final boolean b(String heartRateWarningLabel) {
        if (heartRateWarningLabel == null || TextUtils.isEmpty(heartRateWarningLabel)) {
            return false;
        }
        if (StringsKt__StringsKt.contains$default((CharSequence) heartRateWarningLabel, (CharSequence) ",", false, 2, (Object) null)) {
            return true;
        }
        try {
            Integer.parseInt(heartRateWarningLabel);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    @NotNull
    public final List<SleepIndex> c(@NotNull List<? extends SleepIndex> sleepIndexList) {
        Intrinsics.checkNotNullParameter(sleepIndexList, "sleepIndexList");
        HashMap map = new HashMap();
        for (SleepIndex sleepIndex : sleepIndexList) {
            StringBuilder sb = new StringBuilder();
            sb.append("sleepIndex:");
            sb.append(sleepIndex);
            long dataTimestamp = sleepIndex.getDataTimestamp();
            int hasHeartRateWarning = sleepIndex.getHasHeartRateWarning();
            String heartRateWarningLabel = sleepIndex.getHeartRateWarningLabel();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("dataTimestamp:");
            sb2.append(dataTimestamp);
            sb2.append(", :");
            sb2.append(hasHeartRateWarning);
            sb2.append(", :");
            sb2.append(heartRateWarningLabel);
            if (map.containsKey(Long.valueOf(sleepIndex.getDataTimestamp()))) {
                Object obj = map.get(Long.valueOf(sleepIndex.getDataTimestamp()));
                Intrinsics.checkNotNull(obj);
                SleepIndex sleepIndex2 = (SleepIndex) obj;
                if (!b(sleepIndex2.getHeartRateWarningLabel()) || sleepIndex2.getHasHeartRateWarning() < 1) {
                    if (b(sleepIndex.getHeartRateWarningLabel()) && sleepIndex.getHasHeartRateWarning() >= 1) {
                        map.put(Long.valueOf(sleepIndex.getDataTimestamp()), sleepIndex);
                    } else if (sleepIndex2.getHasHeartRateWarning() < 1) {
                        if (sleepIndex.getHasHeartRateWarning() >= 1) {
                            map.put(Long.valueOf(sleepIndex.getDataTimestamp()), sleepIndex);
                        } else if (a(sleepIndex.getAvgSleepSpo2()) > a(sleepIndex2.getAvgSleepSpo2())) {
                            map.put(Long.valueOf(sleepIndex.getDataTimestamp()), sleepIndex);
                        }
                    }
                }
            } else {
                map.put(Long.valueOf(sleepIndex.getDataTimestamp()), sleepIndex);
            }
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(map.values());
        return arrayList;
    }
}
