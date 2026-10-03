package com.heytap.health.sleep.day.viewmodel;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.base.base.BaseViewModel;
import com.heytap.health.base.livedata.OLiveData;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\b\u0010\tJ\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/heytap/health/sleep/day/viewmodel/SleepCardStyleViewModel;", "Lcom/heytap/health/base/base/BaseViewModel;", "Lcom/heytap/health/base/livedata/OLiveData;", "Lcom/heytap/health/sleep/day/viewmodel/SleepCardStyleViewModel$SleepCardStyle;", "v", "j", "Lcom/heytap/health/base/livedata/OLiveData;", "mObservableStyle", "<init>", "()V", "SleepCardStyle", "sleep_release"}, k = 1, mv = {1, 8, 0})
public final class SleepCardStyleViewModel extends BaseViewModel {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final OLiveData<SleepCardStyle> mObservableStyle = new OLiveData<>();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/heytap/health/sleep/day/viewmodel/SleepCardStyleViewModel$SleepCardStyle;", "", "(Ljava/lang/String;I)V", "SLEEP_ANALYSIS", "SLEEP_COACH", "NONE", "sleep_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum SleepCardStyle {
        SLEEP_ANALYSIS,
        SLEEP_COACH,
        NONE
    }

    @NotNull
    public final OLiveData<SleepCardStyle> v() {
        return this.mObservableStyle;
    }
}
