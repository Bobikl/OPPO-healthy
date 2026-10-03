package com.health.health_seedlingcard.bean;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/health/health_seedlingcard/bean/SleepReminderWaveOpt;", "", "data", "", "(Ljava/lang/String;)V", "getData", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "health_seedlingcard_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class SleepReminderWaveOpt {

    @NotNull
    private final String data;

    /* JADX WARN: Illegal instructions before constructor call */
    public SleepReminderWaveOpt() {
        String str = null;
        this(str, 1, str);
    }

    public static /* synthetic */ SleepReminderWaveOpt copy$default(SleepReminderWaveOpt sleepReminderWaveOpt, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sleepReminderWaveOpt.data;
        }
        return sleepReminderWaveOpt.copy(str);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getData() {
        return this.data;
    }

    @NotNull
    public final SleepReminderWaveOpt copy(@NotNull String data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return new SleepReminderWaveOpt(data);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SleepReminderWaveOpt) && Intrinsics.areEqual(this.data, ((SleepReminderWaveOpt) other).data);
    }

    @NotNull
    public final String getData() {
        return this.data;
    }

    public int hashCode() {
        return this.data.hashCode();
    }

    @NotNull
    public String toString() {
        return "SleepReminderWaveOpt(data=" + this.data + ")";
    }

    public SleepReminderWaveOpt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "data");
        this.data = str;
    }

    public /* synthetic */ SleepReminderWaveOpt(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str);
    }
}
