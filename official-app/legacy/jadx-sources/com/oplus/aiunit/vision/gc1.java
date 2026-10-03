package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.oplus.drs.core.upload.executor.FailureScenarioClassifier;
import com.oplus.drs.core.upload.executor.UploadOutcome;

/* JADX INFO: loaded from: classes6.dex */
public final class gc1 {

    @Nullable
    public final String a;
    public final boolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final FailureScenarioClassifier.FailureScenario f11703c;

    @Nullable
    public final UploadOutcome.AppErrorType d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f11704e;
    public final boolean f;

    @Nullable
    public final String g;

    @NonNull
    public final UploadOutcome h;

    public gc1(@Nullable String str, boolean z, @Nullable FailureScenarioClassifier.FailureScenario failureScenario, @Nullable UploadOutcome.AppErrorType appErrorType, boolean z2, boolean z3, @Nullable String str2, @NonNull UploadOutcome uploadOutcome) {
        this.a = str;
        this.b = z;
        this.f11703c = failureScenario;
        this.d = appErrorType;
        this.f11704e = z2;
        this.f = z3;
        this.g = str2;
        this.h = uploadOutcome;
    }

    @NonNull
    public static gc1 a(@Nullable String str, @NonNull UploadOutcome uploadOutcome) {
        if (uploadOutcome.t()) {
            return new gc1(str, true, null, null, false, false, null, uploadOutcome);
        }
        if (!uploadOutcome.s()) {
            return new gc1(str, false, null, uploadOutcome.i(), uploadOutcome.y(), uploadOutcome.x(), null, uploadOutcome);
        }
        Throwable thJ = uploadOutcome.j();
        return new gc1(str, false, uploadOutcome.k(), null, false, false, thJ == null ? null : thJ.getClass().getSimpleName(), uploadOutcome);
    }
}
