package com.oplus.aiunit.vision;

import com.oplus.drs.core.reconciliation.ClearReason;
import com.oplus.drs.core.reconciliation.FilterReason;
import com.oplus.drs.core.reconciliation.FlowControlReason;
import com.oplus.drs.core.reconciliation.UploadFailReason;
import com.oplus.drs.core.reconciliation.ValidationReason;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public interface rv4 {
    void a(String str, long j2, long j3, FlowControlReason flowControlReason);

    void b(List<String> list);

    void c(String str, long j2, long j3, UploadFailReason uploadFailReason, int i);

    List<tv4> d();

    void e(String str, long j2, long j3, ClearReason clearReason);

    void f(String str, Map<Long, Integer> map, ValidationReason validationReason);

    void g(String str, Map<Long, Integer> map, int i);

    void h(String str, long j2, long j3);

    void i(String str, Map<Long, Integer> map);

    void j(String str, long j2, long j3, FilterReason filterReason);

    void k(String str, long j2, long j3);

    void l(String str, Map<Long, Integer> map, int i);

    void m(String str, long j2, long j3);

    void n(String str, long j2, long j3, ValidationReason validationReason);

    void o(String str, Map<Long, Integer> map, UploadFailReason uploadFailReason, int i);

    void p(String str, long j2, agf.b bVar);

    void q(String str, long j2, long j3, int i);

    void r(String str, Map<Long, Integer> map);
}
