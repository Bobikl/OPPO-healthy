package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.databaseengine.model.SportHealthData;
import com.heytap.databaseengine.model.snore.OsaResultBean;
import io.protostuff.MapSchema;
import java.util.List;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0018\u0010\u0019R$\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007R*\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0017\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0013\u001a\u0004\b\u000b\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Lcom/oplus/aiunit/vision/psd;", "", "Lcom/heytap/databaseengine/model/snore/OsaResultBean;", "a", "Lcom/heytap/databaseengine/model/snore/OsaResultBean;", "()Lcom/heytap/databaseengine/model/snore/OsaResultBean;", "d", "(Lcom/heytap/databaseengine/model/snore/OsaResultBean;)V", "osaResultBean", "", "Lcom/heytap/databaseengine/model/SportHealthData;", "b", "Ljava/util/List;", "c", "()Ljava/util/List;", "f", "(Ljava/util/List;)V", "spo2List", "", "Z", "()Z", MapSchema.FIELD_NAME_ENTRY, "(Z)V", "saveResult", "<init>", "()V", "sleep_release"}, k = 1, mv = {1, 8, 0})
public final class psd {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public OsaResultBean osaResultBean;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public List<SportHealthData> spo2List;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public boolean saveResult;

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final OsaResultBean getOsaResultBean() {
        return this.osaResultBean;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getSaveResult() {
        return this.saveResult;
    }

    @Nullable
    public final List<SportHealthData> c() {
        return this.spo2List;
    }

    public final void d(@Nullable OsaResultBean osaResultBean) {
        this.osaResultBean = osaResultBean;
    }

    public final void e(boolean z) {
        this.saveResult = z;
    }

    public final void f(@Nullable List<SportHealthData> list) {
        this.spo2List = list;
    }
}
