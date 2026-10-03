package com.oplus.seedling.sdk.plugin.bean;

import androidx.annotation.Keep;
import com.oplus.pantanal.plugin.bean.ConfigBean;
import com.oplus.pantanal.plugin.bean.HashEntity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0014"}, d2 = {"Lcom/oplus/seedling/sdk/plugin/bean/SeedlingSdkConfigBean;", "Lcom/oplus/pantanal/plugin/bean/ConfigBean;", "hashLite", "Lcom/oplus/pantanal/plugin/bean/HashEntity;", "hashStandard", "(Lcom/oplus/pantanal/plugin/bean/HashEntity;Lcom/oplus/pantanal/plugin/bean/HashEntity;)V", "getHashLite", "()Lcom/oplus/pantanal/plugin/bean/HashEntity;", "getHashStandard", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "pantanal-client_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class SeedlingSdkConfigBean extends ConfigBean {

    @Nullable
    private final HashEntity hashLite;

    @Nullable
    private final HashEntity hashStandard;

    public SeedlingSdkConfigBean(@Nullable HashEntity hashEntity, @Nullable HashEntity hashEntity2) {
        this.hashLite = hashEntity;
        this.hashStandard = hashEntity2;
    }

    public static /* synthetic */ SeedlingSdkConfigBean copy$default(SeedlingSdkConfigBean seedlingSdkConfigBean, HashEntity hashEntity, HashEntity hashEntity2, int i, Object obj) {
        if ((i & 1) != 0) {
            hashEntity = seedlingSdkConfigBean.hashLite;
        }
        if ((i & 2) != 0) {
            hashEntity2 = seedlingSdkConfigBean.hashStandard;
        }
        return seedlingSdkConfigBean.copy(hashEntity, hashEntity2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final HashEntity getHashLite() {
        return this.hashLite;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final HashEntity getHashStandard() {
        return this.hashStandard;
    }

    @NotNull
    public final SeedlingSdkConfigBean copy(@Nullable HashEntity hashLite, @Nullable HashEntity hashStandard) {
        return new SeedlingSdkConfigBean(hashLite, hashStandard);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SeedlingSdkConfigBean)) {
            return false;
        }
        SeedlingSdkConfigBean seedlingSdkConfigBean = (SeedlingSdkConfigBean) other;
        return Intrinsics.areEqual(this.hashLite, seedlingSdkConfigBean.hashLite) && Intrinsics.areEqual(this.hashStandard, seedlingSdkConfigBean.hashStandard);
    }

    @Nullable
    public final HashEntity getHashLite() {
        return this.hashLite;
    }

    @Nullable
    public final HashEntity getHashStandard() {
        return this.hashStandard;
    }

    public int hashCode() {
        HashEntity hashEntity = this.hashLite;
        int iHashCode = (hashEntity == null ? 0 : hashEntity.hashCode()) * 31;
        HashEntity hashEntity2 = this.hashStandard;
        return iHashCode + (hashEntity2 != null ? hashEntity2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SeedlingSdkConfigBean(hashLite=" + this.hashLite + ", hashStandard=" + this.hashStandard + ")";
    }
}
