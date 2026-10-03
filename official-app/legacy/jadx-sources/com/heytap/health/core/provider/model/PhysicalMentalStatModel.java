package com.heytap.health.core.provider.model;

import com.heytap.health.operations.bean.PhysicalMentalStatData;
import com.heytap.health.operations.router.providers.IPhysicalMentalStatService;
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
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u000f2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002R\u001d\u0010\f\u001a\u0004\u0018\u00010\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/heytap/health/core/provider/model/PhysicalMentalStatModel;", "", "", "startTime", "endTime", "", "Lcom/heytap/health/operations/bean/PhysicalMentalStatData;", "b", "Lcom/heytap/health/operations/router/providers/IPhysicalMentalStatService;", "a", "Lkotlin/Lazy;", "()Lcom/heytap/health/operations/router/providers/IPhysicalMentalStatService;", "physicalMentalStatService", "<init>", "()V", "Companion", "operations_release"}, k = 1, mv = {1, 8, 0})
public final class PhysicalMentalStatModel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Lazy physicalMentalStatService = LazyKt__LazyJVMKt.lazy(new Function0<IPhysicalMentalStatService>() { // from class: com.heytap.health.core.provider.model.PhysicalMentalStatModel$physicalMentalStatService$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        @Nullable
        public final IPhysicalMentalStatService invoke() {
            try {
                Object objNavigation = x0.d().b("/operation/physicalmentalstat").navigation();
                if (objNavigation instanceof IPhysicalMentalStatService) {
                    return (IPhysicalMentalStatService) objNavigation;
                }
                return null;
            } catch (Exception e2) {
                a7b.c("PhysicalMentalStatModel", "Failed to get IPhysicalMentalStatService: " + e2.getMessage(), e2);
                return null;
            }
        }
    });

    public final IPhysicalMentalStatService a() {
        return (IPhysicalMentalStatService) this.physicalMentalStatService.getValue();
    }

    @NotNull
    public final List<PhysicalMentalStatData> b(long startTime, long endTime) {
        try {
            IPhysicalMentalStatService iPhysicalMentalStatServiceA = a();
            if (iPhysicalMentalStatServiceA == null) {
                a7b.b("PhysicalMentalStatModel", "queryPhysicalMentalStatByTimeRange: service is null");
                return CollectionsKt__CollectionsKt.emptyList();
            }
            List<PhysicalMentalStatData> listNa = iPhysicalMentalStatServiceA.Na(startTime, endTime);
            int size = listNa.size();
            StringBuilder sb = new StringBuilder();
            sb.append("queryPhysicalMentalStatByTimeRange: startTime=");
            sb.append(startTime);
            sb.append(", endTime=");
            sb.append(endTime);
            sb.append(", found=");
            sb.append(size);
            return listNa;
        } catch (Exception e2) {
            a7b.c("PhysicalMentalStatModel", "Error in queryPhysicalMentalStatByTimeRange: " + e2.getMessage(), e2);
            return CollectionsKt__CollectionsKt.emptyList();
        }
    }
}
