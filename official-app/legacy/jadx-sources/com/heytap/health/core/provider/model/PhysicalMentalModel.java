package com.heytap.health.core.provider.model;

import com.heytap.health.operations.bean.PhysicalMentalData;
import com.heytap.health.operations.router.providers.IPhysicalMentalService;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.x0;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u000f2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002R\u001d\u0010\f\u001a\u0004\u0018\u00010\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/heytap/health/core/provider/model/PhysicalMentalModel;", "", "", "startTime", "endTime", "", "Lcom/heytap/health/operations/bean/PhysicalMentalData;", "b", "Lcom/heytap/health/operations/router/providers/IPhysicalMentalService;", "a", "Lkotlin/Lazy;", "()Lcom/heytap/health/operations/router/providers/IPhysicalMentalService;", "physicalMentalService", "<init>", "()V", "Companion", "operations_release"}, k = 1, mv = {1, 8, 0})
public final class PhysicalMentalModel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Lazy physicalMentalService = LazyKt__LazyJVMKt.lazy(new Function0<IPhysicalMentalService>() { // from class: com.heytap.health.core.provider.model.PhysicalMentalModel$physicalMentalService$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        @Nullable
        public final IPhysicalMentalService invoke() {
            try {
                Object objNavigation = x0.d().b("/operation/physicalmental").navigation();
                if (objNavigation instanceof IPhysicalMentalService) {
                    return (IPhysicalMentalService) objNavigation;
                }
                return null;
            } catch (Exception e2) {
                a7b.c("PhysicalMentalModel", "Failed to get IPhysicalMentalService: " + e2.getMessage(), e2);
                return null;
            }
        }
    });

    public final IPhysicalMentalService a() {
        return (IPhysicalMentalService) this.physicalMentalService.getValue();
    }

    @NotNull
    public final List<PhysicalMentalData> b(long startTime, long endTime) {
        try {
            IPhysicalMentalService iPhysicalMentalServiceA = a();
            if (iPhysicalMentalServiceA == null) {
                a7b.b("PhysicalMentalModel", "queryPhysicalMentalByTimeRange: service is null");
                return CollectionsKt__CollectionsKt.emptyList();
            }
            List<PhysicalMentalData> listJ2 = iPhysicalMentalServiceA.J2(startTime, endTime);
            int size = listJ2.size();
            StringBuilder sb = new StringBuilder();
            sb.append("queryPhysicalMentalByTimeRange: startTime=");
            sb.append(startTime);
            sb.append(", endTime=");
            sb.append(endTime);
            sb.append(", found=");
            sb.append(size);
            return listJ2;
        } catch (Exception e2) {
            a7b.c("PhysicalMentalModel", "Error in queryPhysicalMentalByTimeRange: " + e2.getMessage(), e2);
            return CollectionsKt__CollectionsKt.emptyList();
        }
    }
}
