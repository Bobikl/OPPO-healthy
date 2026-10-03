package com.garmin.fit.plugins;

import com.garmin.fit.FitRuntimeException;
import com.oplus.aiunit.vision.mf9;
import com.oplus.aiunit.vision.s05;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public class HrToRecordMesgBroadcastPlugin {

    public class HeartRateList extends ArrayList<a> {
        private final long GAP_INCREMENT_MILLISECONDS = 250;
        private final float GAP_INCREMENT_SECONDS = 0.25f;
        private final long GAP_MAX_MILLISECONDS = 5000;
        private final long GAP_MAX_STEPS = 20;
        private Float anchorEventTimestamp = Float.valueOf(0.0f);
        private s05 anchorTimestamp = null;
        final /* synthetic */ HrToRecordMesgBroadcastPlugin this$0;

        public HeartRateList(HrToRecordMesgBroadcastPlugin hrToRecordMesgBroadcastPlugin) {
        }

        public void addHrMesssage(mf9 mf9Var) {
            if (mf9Var == null) {
                throw new FitRuntimeException("FIT HrToRecordMesgBroadcastPlugin Error: HR mesg must not be null");
            }
            int i = 0;
            int i2 = 1;
            if (mf9Var.getTimestamp() != null) {
                this.anchorTimestamp = new s05(mf9Var.getTimestamp());
                if (mf9Var.B() != null) {
                    this.anchorTimestamp.b(mf9Var.B().floatValue());
                }
                if (mf9Var.C() != 1) {
                    throw new FitRuntimeException("FIT HrToRecordMesgBroadcastPlugin Error: Anchor HR mesg must have 1 event_timestamp");
                }
                this.anchorEventTimestamp = mf9Var.z(0);
            }
            if (this.anchorTimestamp == null) {
                throw new FitRuntimeException("FIT HrToRecordMesgBroadcastPlugin Error: No anchor timestamp received in a HR mesg before diff HR mesgs");
            }
            if (mf9Var.C() != mf9Var.D()) {
                throw new FitRuntimeException("FIT HrToRecordMesgBroadcastPlugin Error: HR mesg with mismatching event timestamp and filtered bpm");
            }
            while (i < mf9Var.C()) {
                Float fZ = mf9Var.z(i);
                if (fZ.floatValue() < this.anchorEventTimestamp.floatValue()) {
                    if (this.anchorEventTimestamp.floatValue() - fZ.floatValue() <= 2097152.0f) {
                        throw new FitRuntimeException("FIT HrToRecordMesgBroadcastPlugin Error: Anchor event_timestamp is greater than subsequent event_timestamp. This does not allow for correct delta calculation.");
                    }
                    fZ = Float.valueOf(fZ.floatValue() + 4194304.0f);
                }
                a aVar = new a(this.anchorTimestamp, mf9Var.A(i).shortValue());
                aVar.a.b(fZ.floatValue() - this.anchorEventTimestamp.floatValue());
                if (!isEmpty()) {
                    a aVar2 = get(size() - i2);
                    long jAbs = Math.abs(aVar.a.h().getTime() - aVar2.a.h().getTime());
                    for (long j2 = 1; jAbs > 250 && j2 <= 20; j2++) {
                        a aVar3 = new a(aVar2);
                        aVar3.a.b(j2 * 0.25f);
                        add(aVar3);
                        jAbs -= 250;
                    }
                }
                add(aVar);
                i++;
                i2 = 1;
            }
        }
    }

    public static class a {
        public s05 a;
        public short b;

        public a(a aVar) {
            this.a = new s05(aVar.a);
            this.b = aVar.b;
        }

        public a(s05 s05Var, short s) {
            this.a = new s05(s05Var);
            this.b = s;
        }
    }
}
