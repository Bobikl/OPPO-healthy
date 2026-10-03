package com.heytap.health.menstrual_period.sp;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001e\u0010\u0012\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000e¨\u0006\u0015"}, d2 = {"Lcom/heytap/health/menstrual_period/sp/MenstrualSymptomSpConfig;", "", "()V", "notify_symptom_value_base", "", "getNotify_symptom_value_base", "()Ljava/lang/String;", "setNotify_symptom_value_base", "(Ljava/lang/String;)V", "notify_time", "", "getNotify_time", "()J", "setNotify_time", "(J)V", "symptom_config", "getSymptom_config", "setSymptom_config", "symptom_config_get_time", "getSymptom_config_get_time", "setSymptom_config_get_time", "menstrual_period_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MenstrualSymptomSpConfig {
    public static final int $stable = 8;
    private long notify_time;
    private long symptom_config_get_time;

    @NotNull
    private String symptom_config = "";

    @NotNull
    private String notify_symptom_value_base = "";

    @NotNull
    public final String getNotify_symptom_value_base() {
        return this.notify_symptom_value_base;
    }

    public final long getNotify_time() {
        return this.notify_time;
    }

    @NotNull
    public final String getSymptom_config() {
        return this.symptom_config;
    }

    public final long getSymptom_config_get_time() {
        return this.symptom_config_get_time;
    }

    public final void setNotify_symptom_value_base(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.notify_symptom_value_base = str;
    }

    public final void setNotify_time(long j2) {
        this.notify_time = j2;
    }

    public final void setSymptom_config(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.symptom_config = str;
    }

    public final void setSymptom_config_get_time(long j2) {
        this.symptom_config_get_time = j2;
    }
}
