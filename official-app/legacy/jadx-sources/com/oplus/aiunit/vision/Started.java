package com.oplus.aiunit.vision;

import com.oplus.smartenginehelper.entity.ClickApiEntity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.oxg, reason: from toString */
/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/oplus/aiunit/vision/oxg;", "", "", "toString", "", "hashCode", "other", "", "equals", "", "a", "J", "getTime", "()J", ClickApiEntity.TIME, "<init>", "(J)V", "device_pair_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class Started {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    public final long time;

    public Started(long j2) {
        this.time = j2;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof Started) && this.time == ((Started) other).time;
    }

    public int hashCode() {
        return Long.hashCode(this.time);
    }

    @NotNull
    public String toString() {
        return "Started(time=" + this.time + ")";
    }
}
