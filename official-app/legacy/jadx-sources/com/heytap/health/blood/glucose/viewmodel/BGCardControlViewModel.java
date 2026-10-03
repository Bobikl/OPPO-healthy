package com.heytap.health.blood.glucose.viewmodel;

import com.heytap.health.base.base.BaseViewModel;
import com.heytap.health.base.livedata.OLiveData;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/heytap/health/blood/glucose/viewmodel/BGCardControlViewModel;", "Lcom/heytap/health/base/base/BaseViewModel;", "Lcom/heytap/health/base/livedata/OLiveData;", "", "j", "Lcom/heytap/health/base/livedata/OLiveData;", "v", "()Lcom/heytap/health/base/livedata/OLiveData;", "dialCardShowLive", "<init>", "()V", "blood_glucose_release"}, k = 1, mv = {1, 8, 0})
public final class BGCardControlViewModel extends BaseViewModel {

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final OLiveData<Boolean> dialCardShowLive = new OLiveData<>();

    @NotNull
    public final OLiveData<Boolean> v() {
        return this.dialCardShowLive;
    }
}
