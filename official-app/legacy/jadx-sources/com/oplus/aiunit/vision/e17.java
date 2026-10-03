package com.oplus.aiunit.vision;

import com.google.gson.annotations.SerializedName;
import com.heytap.health.oobe.repo.VirtualAccount;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0004\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/oplus/aiunit/vision/e17;", "", "", "Lcom/heytap/health/oobe/repo/VirtualAccount;", "a", "Ljava/util/List;", "()Ljava/util/List;", "records", "device_pair_impl_release"}, k = 1, mv = {1, 8, 0})
public final class e17 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @SerializedName("records")
    @NotNull
    private final List<VirtualAccount> records;

    @NotNull
    public final List<VirtualAccount> a() {
        return this.records;
    }
}
