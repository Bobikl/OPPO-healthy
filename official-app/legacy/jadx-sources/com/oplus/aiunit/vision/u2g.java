package com.oplus.aiunit.vision;

import com.heytap.sports.record.details.RecordDetailsInstructionActivity;
import p010kotlin.Metadata;
import p010kotlin.Pair;
import p010kotlin.TuplesKt;
import p010kotlin.collections.MapsKt__MapsKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¨\u0006\u0004"}, d2 = {"", "index", "", "b", "sport_impl_release"}, k = 2, mv = {1, 8, 0})
public final class u2g {
    public static final void b(int i) {
        String str;
        y0 y0Var = y0.INSTANCE;
        Pair[] pairArr = new Pair[1];
        RecordDetailsInstructionActivity.Companion companion = RecordDetailsInstructionActivity.INSTANCE;
        if (i == 0) {
            str = RecordDetailsInstructionActivity.RUNNING_POSTURE_TOUCHDOWN_BALANCE;
        } else if (i != 1) {
            str = i != 2 ? RecordDetailsInstructionActivity.RUNNING_POSTURE_VERTICAL_STRIDE_RATIO : RecordDetailsInstructionActivity.RUNNING_POSTURE_VERTICAL_AMPLITUDE;
        } else {
            str = RecordDetailsInstructionActivity.RUNNING_POSTURE_TOUCHDOWN_TIME;
        }
        pairArr[0] = TuplesKt.to("type", str);
        y0Var.a("/sports/RecordDetailInstructionActivity", MapsKt__MapsKt.mutableMapOf(pairArr));
    }
}
