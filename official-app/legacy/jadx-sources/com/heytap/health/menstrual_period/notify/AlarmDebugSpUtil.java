package com.heytap.health.menstrual_period.notify;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001a\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001e\u0010\f\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001e\u0010\u000f\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001e\u0010\u0012\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001e\u0010\u0015\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001e\u0010\u0018\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001e\u0010\u001b\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\b¨\u0006\u001e"}, d2 = {"Lcom/heytap/health/menstrual_period/notify/AlarmDebugSpUtil;", "", "()V", ClickApiEntity.DELAY, "", "getDelay", "()Ljava/lang/String;", "setDelay", "(Ljava/lang/String;)V", "end_symptom", "getEnd_symptom", "setEnd_symptom", "end_time", "getEnd_time", "setEnd_time", "first_day_symptom", "getFirst_day_symptom", "setFirst_day_symptom", "first_day_time", "getFirst_day_time", "setFirst_day_time", "period_symptom", "getPeriod_symptom", "setPeriod_symptom", "predict_symptom", "getPredict_symptom", "setPredict_symptom", "predict_time", "getPredict_time", "setPredict_time", "menstrual_period_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AlarmDebugSpUtil {
    public static final int $stable = 8;

    @NotNull
    private String predict_time = "";

    @NotNull
    private String predict_symptom = "";

    @NotNull
    private String first_day_time = "";

    @NotNull
    private String first_day_symptom = "";

    @NotNull
    private String period_symptom = "";

    @NotNull
    private String end_time = "";

    @NotNull
    private String end_symptom = "";

    @NotNull
    private String delay = "";

    @NotNull
    public final String getDelay() {
        return this.delay;
    }

    @NotNull
    public final String getEnd_symptom() {
        return this.end_symptom;
    }

    @NotNull
    public final String getEnd_time() {
        return this.end_time;
    }

    @NotNull
    public final String getFirst_day_symptom() {
        return this.first_day_symptom;
    }

    @NotNull
    public final String getFirst_day_time() {
        return this.first_day_time;
    }

    @NotNull
    public final String getPeriod_symptom() {
        return this.period_symptom;
    }

    @NotNull
    public final String getPredict_symptom() {
        return this.predict_symptom;
    }

    @NotNull
    public final String getPredict_time() {
        return this.predict_time;
    }

    public final void setDelay(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.delay = str;
    }

    public final void setEnd_symptom(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.end_symptom = str;
    }

    public final void setEnd_time(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.end_time = str;
    }

    public final void setFirst_day_symptom(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.first_day_symptom = str;
    }

    public final void setFirst_day_time(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.first_day_time = str;
    }

    public final void setPeriod_symptom(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.period_symptom = str;
    }

    public final void setPredict_symptom(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.predict_symptom = str;
    }

    public final void setPredict_time(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.predict_time = str;
    }
}
