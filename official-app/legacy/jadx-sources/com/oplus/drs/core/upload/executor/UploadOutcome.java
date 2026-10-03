package com.oplus.drs.core.upload.executor;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.oplus.drs.core.net.entity.UploadStateAware;
import com.oppo.obus.common.configmetadata.core.entity.AreaConfig;

/* JADX INFO: loaded from: classes6.dex */
public final class UploadOutcome {
    public final Type a;
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f19809c;

    @Nullable
    public final FailureScenarioClassifier.FailureScenario d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final AreaConfig f19810e;

    @Nullable
    public final String f;

    @Nullable
    public final AppErrorType g;

    @Nullable
    public final Throwable h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f19811j;
    public final int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f19812l;

    public enum AppErrorType {
        BAD_REQUEST,
        UNAUTHORIZED,
        FORBIDDEN,
        NOT_FOUND,
        PAYLOAD_TOO_LARGE,
        RATE_LIMITED,
        SERVER_ERROR,
        SERVER_BUSY,
        BUSINESS_REJECT,
        UNKNOWN_APP
    }

    public enum Type {
        SUCCESS,
        ENV_ERROR,
        APP_ERROR
    }

    public UploadOutcome(@NonNull Type type, int i, int i2, @Nullable FailureScenarioClassifier.FailureScenario failureScenario, @Nullable AreaConfig areaConfig, @Nullable String str, @Nullable AppErrorType appErrorType, @Nullable Throwable th, boolean z, long j2, int i3, boolean z2) {
        this.a = type;
        this.b = i;
        this.f19809c = i2;
        this.d = failureScenario;
        this.f19810e = areaConfig;
        this.f = str;
        this.g = appErrorType;
        this.h = th;
        this.i = z;
        this.f19811j = Math.max(0L, j2);
        this.k = Math.max(0, i3);
        this.f19812l = z2;
    }

    @NonNull
    public static UploadOutcome a(int i, @Nullable Throwable th, int i2, @Nullable FailureScenarioClassifier.FailureScenario failureScenario) {
        return new UploadOutcome(Type.ENV_ERROR, i, i, failureScenario != null ? failureScenario : FailureScenarioClassifier.FailureScenario.HOST_UNRESOLVABLE, null, "All domains exhausted", null, th, false, 0L, i2, true);
    }

    @NonNull
    public static UploadOutcome b(int i) {
        return d(i, false);
    }

    @NonNull
    public static UploadOutcome c(int i, int i2, boolean z, long j2) {
        return e(v(i), i, i2, u(i, z), z, j2);
    }

    @NonNull
    public static UploadOutcome d(int i, boolean z) {
        return c(i, i, z, 0L);
    }

    @NonNull
    public static UploadOutcome e(@NonNull FailureScenarioClassifier.FailureScenario failureScenario, int i, int i2, @NonNull AppErrorType appErrorType, boolean z, long j2) {
        return new UploadOutcome(Type.APP_ERROR, i, i2, failureScenario, null, "APP_ERROR: " + failureScenario + "(resultCode=" + i + ", httpCode=" + i2 + ")", appErrorType, null, z, j2, 0, false);
    }

    @NonNull
    public static UploadOutcome f(@NonNull FailureScenarioClassifier.FailureScenario failureScenario, int i, int i2, boolean z, long j2) {
        return e(failureScenario, i, i2, u(i, z), z, j2);
    }

    @NonNull
    public static UploadOutcome g() {
        return new UploadOutcome(Type.APP_ERROR, 2, 2, FailureScenarioClassifier.FailureScenario.REQUEST_BUILD_FAILED, null, "Failed to build request", AppErrorType.BAD_REQUEST, null, false, 0L, 0, false);
    }

    @NonNull
    public static UploadOutcome h(@NonNull FailureScenarioClassifier.FailureScenario failureScenario, int i, int i2, @Nullable Throwable th, boolean z) {
        String str = "ENV_ERROR: " + failureScenario;
        if (th != null) {
            str = str + " (" + th.getClass().getSimpleName() + ")";
        }
        return new UploadOutcome(Type.ENV_ERROR, i, i2, failureScenario, null, str, null, th, z, 0L, 0, false);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:45:0x0058 A[FALL_THROUGH] */
    @NonNull
    public static AppErrorType u(int i, boolean z) {
        if (i != 2) {
            if (i == 200) {
                return z ? AppErrorType.BUSINESS_REJECT : AppErrorType.UNKNOWN_APP;
            }
            if (i != 408) {
                if (i == 413) {
                    return AppErrorType.PAYLOAD_TOO_LARGE;
                }
                if (i != 503 && i != 507 && i != 509) {
                    if (i != 400) {
                        if (i == 401) {
                            return AppErrorType.UNAUTHORIZED;
                        }
                        if (i == 403) {
                            return AppErrorType.FORBIDDEN;
                        }
                        if (i == 404) {
                            return AppErrorType.NOT_FOUND;
                        }
                        if (i == 500 || i == 501) {
                            return AppErrorType.SERVER_ERROR;
                        }
                        if (i != 536) {
                            if (i != 537) {
                                switch (i) {
                                    case UploadStateAware.HTTP_RATE_LIMIT /* 429 */:
                                        return AppErrorType.RATE_LIMITED;
                                    case UploadStateAware.HTTP_NOT_ENOUGH_URL_PARAMS /* 430 */:
                                    case UploadStateAware.HTTP_URL_TIMESTAMP_INVALID /* 431 */:
                                    case UploadStateAware.HTTP_REQUEST_EXPIRED /* 433 */:
                                    case UploadStateAware.HTTP_URL_SIGN_INVALID /* 434 */:
                                    case UploadStateAware.HTTP_INVALID_SOURCE_SDK_TYPE /* 435 */:
                                        return AppErrorType.BUSINESS_REJECT;
                                    case UploadStateAware.HTTP_URL_APPID_INVALID /* 432 */:
                                        break;
                                    default:
                                        switch (i) {
                                            default:
                                                switch (i) {
                                                    case 450:
                                                    case UploadStateAware.HTTP_NO_HEAD_FOUND /* 451 */:
                                                    case UploadStateAware.HTTP_NO_BODY_FOUND /* 452 */:
                                                    case UploadStateAware.HTTP_BODY_INVALID /* 453 */:
                                                    case UploadStateAware.HTTP_HQUEUE_WRITE_FAILED /* 454 */:
                                                    case UploadStateAware.HTTP_NO_DECODE_BODY_FOUND /* 455 */:
                                                        break;
                                                    default:
                                                        switch (i) {
                                                            case UploadStateAware.HTTP_PUSH_KAFKA_FAILED /* 556 */:
                                                            case UploadStateAware.HTTP_PUSH_KAFKA_TIMEOUT /* 557 */:
                                                            case UploadStateAware.HTTP_KAFKA_CLUSTER_INIT_FAILED /* 558 */:
                                                                break;
                                                            default:
                                                                if (i < 500 || i >= 600) {
                                                                    return z ? AppErrorType.BUSINESS_REJECT : AppErrorType.UNKNOWN_APP;
                                                                }
                                                                return AppErrorType.SERVER_BUSY;
                                                        }
                                                        break;
                                                }
                                            case UploadStateAware.HTTP_DECRYPT_FAILED /* 440 */:
                                            case UploadStateAware.HTTP_DECOMPRESS_FAILED /* 441 */:
                                            case UploadStateAware.HTTP_DESERIALIZE_FAILED /* 442 */:
                                            case 443:
                                            case 444:
                                                return AppErrorType.BUSINESS_REJECT;
                                        }
                                        break;
                                }
                            }
                        }
                        return AppErrorType.UNKNOWN_APP;
                    }
                }
            }
            return AppErrorType.SERVER_BUSY;
        }
        return AppErrorType.BAD_REQUEST;
    }

    @NonNull
    public static FailureScenarioClassifier.FailureScenario v(int i) {
        if (i == 2) {
            return FailureScenarioClassifier.FailureScenario.REQUEST_BUILD_FAILED;
        }
        if (i == 404 || i == 432 || i == 536) {
            return FailureScenarioClassifier.FailureScenario.APP_ID_REJECTED;
        }
        if (i == 429) {
            return FailureScenarioClassifier.FailureScenario.APP_RATE_LIMITED;
        }
        return (i < 500 || i >= 600) ? FailureScenarioClassifier.FailureScenario.APP_DATA_INVALID : FailureScenarioClassifier.FailureScenario.SERVER_BACKOFF;
    }

    @NonNull
    public static UploadOutcome w() {
        return new UploadOutcome(Type.ENV_ERROR, 5, 5, FailureScenarioClassifier.FailureScenario.NO_NETWORK, null, "Network unavailable", null, null, false, 0L, 0, false);
    }

    @NonNull
    public static UploadOutcome z(@Nullable AreaConfig areaConfig) {
        return new UploadOutcome(Type.SUCCESS, 200, 200, null, areaConfig, null);
    }

    @Nullable
    public AppErrorType i() {
        return this.g;
    }

    @Nullable
    public Throwable j() {
        return this.h;
    }

    @Nullable
    public FailureScenarioClassifier.FailureScenario k() {
        return this.d;
    }

    public int l() {
        return this.f19809c;
    }

    @Nullable
    public AreaConfig m() {
        return this.f19810e;
    }

    public int n() {
        return this.b;
    }

    public long o() {
        return this.f19811j;
    }

    @NonNull
    public Type p() {
        return this.a;
    }

    public boolean q() {
        return this.a == Type.APP_ERROR;
    }

    public boolean r() {
        return this.i;
    }

    public boolean s() {
        return this.a == Type.ENV_ERROR;
    }

    public boolean t() {
        return this.a == Type.SUCCESS;
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("UploadOutcome{type=");
        sb.append(this.a);
        sb.append(", resultCode=");
        sb.append(this.b);
        sb.append(", httpCode=");
        sb.append(this.f19809c);
        if (this.d != null) {
            sb.append(", failureScenario=");
            sb.append(this.d);
        }
        if (this.g != null) {
            sb.append(", appErrorType=");
            sb.append(this.g);
        }
        if (this.f != null) {
            sb.append(", message='");
            sb.append(this.f);
            sb.append("'");
        }
        if (this.i) {
            sb.append(", businessResponse=true");
        }
        if (this.f19811j > 0) {
            sb.append(", retryAfterMs=");
            sb.append(this.f19811j);
        }
        if (this.k > 0) {
            sb.append(", actualAttempts=");
            sb.append(this.k);
        }
        sb.append("}");
        return sb.toString();
    }

    public boolean x() {
        return q() && FailureScenarioClassifier.k(this.d);
    }

    public boolean y() {
        return q() && FailureScenarioClassifier.l(this.d);
    }

    public UploadOutcome(@NonNull Type type, int i, int i2, @Nullable FailureScenarioClassifier.FailureScenario failureScenario, @Nullable AreaConfig areaConfig, @Nullable String str) {
        this(type, i, i2, failureScenario, areaConfig, str, null, null, false, 0L, 0, false);
    }
}
