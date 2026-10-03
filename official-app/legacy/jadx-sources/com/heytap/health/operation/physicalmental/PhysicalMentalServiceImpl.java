package com.heytap.health.operation.physicalmental;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.heytap.databaseengine.model.physicalMental.PhysicalMentalStatus;
import com.heytap.health.operations.bean.PhysicalMentalData;
import com.heytap.health.operations.router.providers.IPhysicalMentalService;
import java.util.List;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes17.dex */
@StabilityInferred(parameters = 0)
@Route(path = "/operation/physicalmental")
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u001e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0012\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0002¨\u0006\u0013"}, d2 = {"Lcom/heytap/health/operation/physicalmental/PhysicalMentalServiceImpl;", "Lcom/heytap/health/operations/router/providers/IPhysicalMentalService;", "", "startTime", "endTime", "", "Lcom/heytap/health/operations/bean/PhysicalMentalData;", "J2", "Landroid/content/Context;", "context", "", "init", "Lcom/heytap/databaseengine/model/physicalMental/PhysicalMentalStatus;", "status", "h1", "<init>", "()V", "Companion", "a", "operation_impl_release"}, k = 1, mv = {1, 8, 0})
public final class PhysicalMentalServiceImpl implements IPhysicalMentalService {
    public static final int $stable = 0;

    @Override // com.heytap.health.operations.router.providers.IPhysicalMentalService
    @NotNull
    public List<PhysicalMentalData> J2(long startTime, long endTime) {
        StringBuilder sb = new StringBuilder();
        sb.append("queryPhysicalMentalByTimeRange: startTime=");
        sb.append(startTime);
        sb.append(", endTime=");
        sb.append(endTime);
        return (List) BuildersKt__BuildersKt.runBlocking$default(null, new PhysicalMentalServiceImpl$queryPhysicalMentalByTimeRange$1(startTime, endTime, this, null), 1, null);
    }

    public final PhysicalMentalData h1(PhysicalMentalStatus status) {
        return new PhysicalMentalData(status.getStress(), status.getStressState(), status.getDataCreatedTimestamp());
    }

    @Override // com.alibaba.android.arouter.facade.template.IProvider
    public void init(@Nullable Context context) {
    }
}
