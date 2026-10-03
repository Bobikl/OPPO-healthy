package com.oplus.drs.core.upload.executor;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.heytap.log.config.LogMemoryConfig;
import com.oplus.aiunit.vision.plk;
import com.oplus.aiunit.vision.z6b;
import com.oplus.drs.core.net.domain.DomainSelector;
import com.oplus.drs.core.net.entity.UploadStateAware;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class b {
    public final DomainSelector a;
    public final plk b;

    public b(@NonNull DomainSelector domainSelector, @NonNull plk plkVar) {
        this.a = domainSelector;
        this.b = plkVar;
    }

    @NonNull
    public final UploadOutcome a(@NonNull FailureScenarioClassifier.FailureScenario failureScenario, int i, int i2, @Nullable Throwable th, boolean z, long j2) {
        if (FailureScenarioClassifier.f(failureScenario)) {
            z6b.q("UploadExecutor", "execute APP_ERROR from scenario: " + failureScenario + ", code=" + i2);
            return UploadOutcome.f(failureScenario, i, i2, z, j2);
        }
        if (failureScenario == FailureScenarioClassifier.FailureScenario.NO_NETWORK) {
            z6b.q("UploadExecutor", "execute ENV_ERROR (no network)");
            return UploadOutcome.w();
        }
        z6b.q("UploadExecutor", "execute ENV_ERROR: scenario=" + failureScenario);
        return UploadOutcome.h(failureScenario, i, i2, th, z);
    }

    @NonNull
    public UploadOutcome b(@NonNull a aVar) {
        String str;
        z6b.q("UploadExecutor", "execute START: " + aVar.s());
        if (!aVar.h()) {
            z6b.u("UploadExecutor", "execute SKIP: request not built");
            UploadOutcome uploadOutcomeG = UploadOutcome.g();
            aVar.p(uploadOutcomeG);
            return uploadOutcomeG;
        }
        int size = this.a.c(aVar.a, aVar.i()).size();
        int i = 0;
        Throwable th = null;
        int i2 = 0;
        while (true) {
            if (i >= 3) {
                break;
            }
            DomainSelector.a aVarE = e(aVar.a, aVar.i(), aVar.g());
            if (aVarE == null || (str = aVarE.a) == null) {
                z6b.u("UploadExecutor", "No available domain, all exhausted after " + i + " attempts, distinctDomainCount=" + size);
                break;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Selected domain: level=");
            sb.append(aVarE.b);
            sb.append(", domain=");
            sb.append(h(str));
            sb.append(", attempt=");
            int i3 = i + 1;
            sb.append(i3);
            z6b.m("UploadExecutor", sb.toString());
            UploadStateAware uploadStateAwareF = f(aVar, str);
            int code = uploadStateAwareF.getCode();
            int httpCode = uploadStateAwareF.getHttpCode();
            Throwable exception = uploadStateAwareF.getException();
            boolean zIsBusinessResponse = uploadStateAwareF.isBusinessResponse();
            long retryAfterMs = uploadStateAwareF.getRetryAfterMs();
            FailureScenarioClassifier.FailureScenario failureScenarioA = FailureScenarioClassifier.a(code, httpCode, exception, zIsBusinessResponse);
            aVar.k(str, code, failureScenarioA, exception);
            if (uploadStateAwareF.isSuccess()) {
                this.a.h(str);
                z6b.q("UploadExecutor", "execute SUCCESS: appId=" + aVar.a + ", batchSize=" + aVar.f19813c.size() + ", isHighPriority=" + aVar.g);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("execute SUCCESS detail: ");
                sb2.append(aVar.s());
                z6b.m("UploadExecutor", sb2.toString());
                UploadOutcome uploadOutcomeZ = UploadOutcome.z(uploadStateAwareF.getData());
                aVar.p(uploadOutcomeZ);
                return uploadOutcomeZ;
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Error classified: scenario=");
            sb3.append(failureScenarioA);
            sb3.append(", httpCode=");
            sb3.append(httpCode);
            sb3.append(", exception=");
            sb3.append(exception != null ? exception.getClass().getSimpleName() : "null");
            z6b.q("UploadExecutor", sb3.toString());
            UploadOutcome uploadOutcomeD = d(aVar, failureScenarioA, code, httpCode, str, exception, zIsBusinessResponse, retryAfterMs);
            if (uploadOutcomeD != null) {
                aVar.p(uploadOutcomeD);
                return uploadOutcomeD;
            }
            i = i3;
            i2 = httpCode;
            th = exception;
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append("execute FAILED: appId=");
        sb4.append(aVar.a);
        sb4.append(", batchSize=");
        sb4.append(aVar.f19813c.size());
        sb4.append(", domainRetries=");
        sb4.append(i);
        sb4.append(", distinctDomainCount=");
        sb4.append(size);
        sb4.append(", lastException=");
        sb4.append(th != null ? th.getClass().getSimpleName() : "null");
        z6b.u("UploadExecutor", sb4.toString());
        z6b.n("UploadExecutor", "execute FAILED detail: " + aVar.s());
        UploadOutcome uploadOutcomeA = UploadOutcome.a(i2, th, size, aVar.f());
        aVar.p(uploadOutcomeA);
        return uploadOutcomeA;
    }

    @Nullable
    public final UploadOutcome c(@NonNull a aVar, @NonNull String str, @NonNull FailureScenarioClassifier.FailureScenario failureScenario, int i, int i2, @Nullable Throwable th, boolean z, long j2) {
        FailureScenarioClassifier.FailureScenario failureScenario2 = failureScenario;
        int i3 = i;
        int i4 = i2;
        Throwable th2 = th;
        boolean z2 = z;
        long j3 = j2;
        int i5 = 1;
        for (int i6 = 1; i5 <= i6; i6 = 1) {
            z6b.m("UploadExecutor", "env retry in-request: retryIndex=" + i5 + "/" + i6 + ", domain=" + h(str) + ", scenario=" + failureScenario2 + ", httpCode=" + i4);
            UploadStateAware uploadStateAwareF = f(aVar, str);
            int code = uploadStateAwareF.getCode();
            int httpCode = uploadStateAwareF.getHttpCode();
            Throwable exception = uploadStateAwareF.getException();
            boolean zIsBusinessResponse = uploadStateAwareF.isBusinessResponse();
            long retryAfterMs = uploadStateAwareF.getRetryAfterMs();
            if (uploadStateAwareF.isSuccess()) {
                this.a.h(str);
                z6b.m("UploadExecutor", "env retry SUCCESS: domain=" + h(str) + ", retryIndex=" + i5);
                return UploadOutcome.z(uploadStateAwareF.getData());
            }
            FailureScenarioClassifier.FailureScenario failureScenarioA = FailureScenarioClassifier.a(code, httpCode, exception, zIsBusinessResponse);
            aVar.k(str, code, failureScenarioA, exception);
            StringBuilder sb = new StringBuilder();
            sb.append("env retry result: retryIndex=");
            sb.append(i5);
            sb.append(", scenario=");
            sb.append(failureScenarioA);
            sb.append(", httpCode=");
            sb.append(httpCode);
            sb.append(", exception=");
            sb.append(exception != null ? exception.getClass().getSimpleName() : "null");
            z6b.q("UploadExecutor", sb.toString());
            if (FailureScenarioClassifier.f(failureScenarioA)) {
                return a(failureScenarioA, code, httpCode, exception, zIsBusinessResponse, retryAfterMs);
            }
            i5++;
            failureScenario2 = failureScenarioA;
            i3 = code;
            i4 = httpCode;
            th2 = exception;
            z2 = zIsBusinessResponse;
            j3 = retryAfterMs;
        }
        if (!FailureScenarioClassifier.m(failureScenario2)) {
            return a(failureScenario2, i3, i4, th2, z2, j3);
        }
        this.a.i(str);
        z6b.m("UploadExecutor", "Domain marked unavailable after env retries: " + h(str) + ", switching to next, scenario=" + failureScenario2);
        return null;
    }

    @Nullable
    public final UploadOutcome d(@NonNull a aVar, @NonNull FailureScenarioClassifier.FailureScenario failureScenario, int i, int i2, @NonNull String str, @Nullable Throwable th, boolean z, long j2) {
        if (FailureScenarioClassifier.f(failureScenario)) {
            return a(failureScenario, i, i2, th, z, j2);
        }
        if (!FailureScenarioClassifier.m(failureScenario)) {
            return !g(failureScenario) ? a(failureScenario, i, i2, th, z, j2) : c(aVar, str, failureScenario, i, i2, th, z, j2);
        }
        this.a.i(str);
        z6b.m("UploadExecutor", "Domain marked unavailable: " + h(str) + ", switching to next, scenario=" + failureScenario);
        return null;
    }

    @Nullable
    public final DomainSelector.a e(@NonNull String str, boolean z, @NonNull Set<String> set) {
        return this.a.k(str, z, set);
    }

    @NonNull
    public final UploadStateAware f(@NonNull a aVar, @NonNull String str) {
        int iE = aVar.e();
        if (iE < 0) {
            iE = 0;
        }
        if (aVar.j()) {
            return aVar.a() == null ? UploadStateAware.fail(1) : this.b.b(aVar.c(), aVar.a(), iE, str);
        }
        if (aVar.g) {
            return this.b.c(aVar.c(), iE, aVar.h, str);
        }
        String strD = aVar.d();
        return strD != null ? this.b.a(aVar.c(), iE, str, strD) : this.b.d(aVar.c(), iE, str);
    }

    public final boolean g(@NonNull FailureScenarioClassifier.FailureScenario failureScenario) {
        return failureScenario == FailureScenarioClassifier.FailureScenario.CONNECTION_REFUSED || failureScenario == FailureScenarioClassifier.FailureScenario.TRANSIENT_CONNECTION_FAILURE;
    }

    @NonNull
    public final String h(@NonNull String str) {
        if (str.length() <= 30) {
            return str;
        }
        return str.substring(0, 27) + LogMemoryConfig.LOG_ELLIPSIS;
    }
}
