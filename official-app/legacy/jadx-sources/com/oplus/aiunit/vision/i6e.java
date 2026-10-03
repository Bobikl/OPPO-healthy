package com.oplus.aiunit.vision;

import com.heytap.health.oobe.dto.OOBEFail;
import com.heytap.health.oobe.fail.OOBEException;
import com.oplus.accountsdk.base.account.trace.AcBaseTraceHelper;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u000b\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\u0003\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/oplus/aiunit/vision/i6e;", "", "", "a", "Z", "b", "()Z", "success", "Lcom/heytap/health/oobe/fail/OOBEException;", "Lcom/heytap/health/oobe/fail/OOBEException;", "()Lcom/heytap/health/oobe/fail/OOBEException;", AcBaseTraceHelper.VAL_FAIL, "<init>", "(ZLcom/heytap/health/oobe/fail/OOBEException;)V", "device_pair_impl_release"}, k = 1, mv = {1, 8, 0})
public final class i6e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final boolean success;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final OOBEException fail;

    public i6e(boolean z, @NotNull OOBEException fail) {
        Intrinsics.checkNotNullParameter(fail, "fail");
        this.success = z;
        this.fail = fail;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final OOBEException getFail() {
        return this.fail;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    public /* synthetic */ i6e(boolean z, OOBEException oOBEException, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? new OOBEException(new OOBEFail(null, null, null, null, 0, null, null, 127, null)) : oOBEException);
    }
}
