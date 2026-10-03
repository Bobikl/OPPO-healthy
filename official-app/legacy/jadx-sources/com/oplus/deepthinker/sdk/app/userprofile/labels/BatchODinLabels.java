package com.oplus.deepthinker.sdk.app.userprofile.labels;

import androidx.annotation.Keep;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u0017\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0004HÖ\u0001R(\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0006¨\u0006\u0012"}, d2 = {"Lcom/oplus/deepthinker/sdk/app/userprofile/labels/BatchODinLabels;", "", "oDinLabelMap", "", "", "Lcom/oplus/deepthinker/sdk/app/userprofile/labels/ODinLabel;", "(Ljava/util/Map;)V", "getODinLabelMap", "()Ljava/util/Map;", "setODinLabelMap", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "com.oplus.deepthinker.sdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class BatchODinLabels {

    @Nullable
    private Map<String, ODinLabel> oDinLabelMap;

    public BatchODinLabels(@Nullable Map<String, ODinLabel> map) {
        this.oDinLabelMap = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BatchODinLabels copy$default(BatchODinLabels batchODinLabels, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            map = batchODinLabels.oDinLabelMap;
        }
        return batchODinLabels.copy(map);
    }

    @Nullable
    public final Map<String, ODinLabel> component1() {
        return this.oDinLabelMap;
    }

    @NotNull
    public final BatchODinLabels copy(@Nullable Map<String, ODinLabel> oDinLabelMap) {
        return new BatchODinLabels(oDinLabelMap);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof BatchODinLabels) && Intrinsics.areEqual(this.oDinLabelMap, ((BatchODinLabels) other).oDinLabelMap);
    }

    @Nullable
    public final Map<String, ODinLabel> getODinLabelMap() {
        return this.oDinLabelMap;
    }

    public int hashCode() {
        Map<String, ODinLabel> map = this.oDinLabelMap;
        if (map == null) {
            return 0;
        }
        return map.hashCode();
    }

    public final void setODinLabelMap(@Nullable Map<String, ODinLabel> map) {
        this.oDinLabelMap = map;
    }

    @NotNull
    public String toString() {
        return "BatchODinLabels(oDinLabelMap=" + this.oDinLabelMap + ')';
    }
}
