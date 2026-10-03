package com.heytap.health.sleep.bean;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.blood.glucose.BloodGlucoseWarningActivity;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/heytap/health/sleep/bean/PhoneSleepImpreciseBean;", "", "()V", "date", "", "getDate", "()I", "setDate", "(I)V", BloodGlucoseWarningActivity.SSOID, "", "getSsoId", "()Ljava/lang/String;", "setSsoId", "(Ljava/lang/String;)V", "sleep_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PhoneSleepImpreciseBean {
    public static final int $stable = 8;
    private int date;

    @NotNull
    private String ssoId = "";

    public final int getDate() {
        return this.date;
    }

    @NotNull
    public final String getSsoId() {
        return this.ssoId;
    }

    public final void setDate(int i) {
        this.date = i;
    }

    public final void setSsoId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.ssoId = str;
    }
}
