package com.oplus.aiunit.vision;

import com.oplus.drs.core.reconciliation.ClearReason;
import com.oplus.drs.core.reconciliation.FilterReason;
import com.oplus.drs.core.reconciliation.FlowControlReason;
import com.oplus.drs.core.reconciliation.ReconciliationStage;
import com.oplus.drs.core.reconciliation.UploadFailReason;
import com.oplus.drs.core.reconciliation.ValidationReason;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes6.dex */
public class uv4 {
    public static final ConcurrentLinkedQueue<uv4> m = new ConcurrentLinkedQueue<>();
    public ReconciliationStage a = ReconciliationStage.RECEIVED;
    public int b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ValidationReason f17614c = ValidationReason.NONE;
    public FilterReason d = FilterReason.NONE;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f17615e = 0;
    public FlowControlReason f = FlowControlReason.NONE;
    public UploadFailReason g = UploadFailReason.NONE;
    public int h = 0;
    public long i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ClearReason f17616j = ClearReason.NONE;
    public long k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public List<Long> f17617l = null;

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ReconciliationStage.values().length];
            a = iArr;
            try {
                iArr[ReconciliationStage.RECEIVED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[ReconciliationStage.VALIDATION_FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[ReconciliationStage.FILTERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[ReconciliationStage.CACHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[ReconciliationStage.RATE_LIMITED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[ReconciliationStage.UPLOAD_ATTEMPT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[ReconciliationStage.UPLOAD_FAILED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[ReconciliationStage.UPLOADED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[ReconciliationStage.EXPIRED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public static uv4 h() {
        return m.poll();
    }

    public static uv4 n() {
        uv4 uv4VarH = h();
        return uv4VarH != null ? uv4VarH : new uv4();
    }

    public static void p(uv4 uv4Var) {
        ConcurrentLinkedQueue<uv4> concurrentLinkedQueue = m;
        if (concurrentLinkedQueue.size() < 20) {
            concurrentLinkedQueue.offer(uv4Var);
        }
    }

    public int a() {
        return this.f17615e;
    }

    public ClearReason b() {
        return this.f17616j;
    }

    public int c() {
        return this.b;
    }

    public long d() {
        return this.k;
    }

    public List<Long> e() {
        return this.f17617l;
    }

    public FilterReason f() {
        return this.d;
    }

    public FlowControlReason g() {
        return this.f;
    }

    public int i() {
        return this.h;
    }

    public ReconciliationStage j() {
        return this.a;
    }

    public long k() {
        return this.i;
    }

    public UploadFailReason l() {
        return this.g;
    }

    public ValidationReason m() {
        return this.f17614c;
    }

    public synchronized void o() {
        q();
        p(this);
    }

    public synchronized void q() {
        this.a = ReconciliationStage.RECEIVED;
        this.b = 0;
        this.f17614c = ValidationReason.NONE;
        this.d = FilterReason.NONE;
        this.f17615e = 0;
        this.f = FlowControlReason.NONE;
        this.g = UploadFailReason.NONE;
        this.h = 0;
        this.i = 0L;
        this.f17616j = ClearReason.NONE;
        this.k = 0L;
        this.f17617l = null;
    }

    public void r(ClearReason clearReason) {
        this.f17616j = clearReason;
    }

    public void s(int i) {
        this.b = i;
    }

    public void t(long j2) {
        this.k = j2;
    }

    public String toString() {
        switch (a.a[this.a.ordinal()]) {
            case 1:
                return String.format("RECEIVED[count=%d]", Integer.valueOf(this.b));
            case 2:
                return String.format("VALIDATION_FAILED[count=%d, reason=%s]", Integer.valueOf(this.b), this.f17614c.getDescription());
            case 3:
                return String.format("FILTERED[count=%d, reason=%s]", Integer.valueOf(this.b), this.d.getDescription());
            case 4:
                return String.format("CACHED[count=%d, flag=%d]", Integer.valueOf(this.b), Integer.valueOf(this.f17615e));
            case 5:
                return String.format("RATE_LIMITED[count=%d, reason=%s]", Integer.valueOf(this.b), this.f.getDescription());
            case 6:
                return String.format("UPLOAD_ATTEMPT[count=%d]", Integer.valueOf(this.b));
            case 7:
                return String.format("UPLOAD_FAILED[count=%d, reason=%s, retry=%d]", Integer.valueOf(this.b), this.g.getDescription(), Integer.valueOf(this.h));
            case 8:
                List<Long> list = this.f17617l;
                return list != null ? String.format("UPLOADED[batch=%d, cost=%dms]", Integer.valueOf(list.size()), Long.valueOf(this.i)) : String.format("UPLOADED[count=%d, cost=%dms]", Integer.valueOf(this.b), Long.valueOf(this.i));
            case 9:
                return String.format("EXPIRED[count=%d, reason=%s]", Integer.valueOf(this.b), this.f17616j.getDescription());
            default:
                return super.toString();
        }
    }

    public void u(FilterReason filterReason) {
        this.d = filterReason;
    }

    public void v(FlowControlReason flowControlReason) {
        this.f = flowControlReason;
    }

    public void w(ReconciliationStage reconciliationStage) {
        this.a = reconciliationStage;
    }

    public void x(ValidationReason validationReason) {
        this.f17614c = validationReason;
    }
}
