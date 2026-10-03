package com.heytap.health.operation.doctor;

import android.app.Activity;
import com.heytap.health.base.task.ThreadUtils;
import com.heytap.health.operation.R$string;
import com.oplus.aiunit.vision.op;
import com.oplus.aiunit.vision.qtf;
import com.oplus.aiunit.vision.y0k;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<no name provided>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
public final class DoctorServiceImpl$deeplinkHandle$handleFail$1 extends Lambda implements Function0<Unit> {
    public static final DoctorServiceImpl$deeplinkHandle$handleFail$1 INSTANCE = new DoctorServiceImpl$deeplinkHandle$handleFail$1();

    public DoctorServiceImpl$deeplinkHandle$handleFail$1() {
        super(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0() {
        Activity activityP = op.n().p();
        if (Intrinsics.areEqual(activityP != null ? activityP.getClass().getName() : null, "com.heytap.health.router.RouterActivity") && !activityP.isFinishing() && !activityP.isDestroyed()) {
            activityP.finish();
        }
        y0k.h(qtf.l(R$string.operation_doctor_account_not_same));
    }

    @Override // p010kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ThreadUtils.doInUiThread(new Runnable() { // from class: com.heytap.health.operation.doctor.a
            @Override // java.lang.Runnable
            public final void run() {
                DoctorServiceImpl$deeplinkHandle$handleFail$1.invoke$lambda$0();
            }
        });
    }
}
