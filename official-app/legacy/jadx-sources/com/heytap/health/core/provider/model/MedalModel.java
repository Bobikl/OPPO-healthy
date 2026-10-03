package com.heytap.health.core.provider.model;

import com.heytap.health.operations.bean.MedalListBean;
import com.heytap.health.operations.router.providers.IMedalDataService;
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
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006J\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004R\u001d\u0010\u0010\u001a\u0004\u0018\u00010\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0014"}, d2 = {"Lcom/heytap/health/core/provider/model/MedalModel;", "", "", "code", "Lcom/heytap/health/operations/bean/MedalListBean;", "a", "", "startTime", "endTime", "", "d", "c", "Lcom/heytap/health/operations/router/providers/IMedalDataService;", "Lkotlin/Lazy;", "b", "()Lcom/heytap/health/operations/router/providers/IMedalDataService;", "medalDataService", "<init>", "()V", "Companion", "operations_release"}, k = 1, mv = {1, 8, 0})
public final class MedalModel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Lazy medalDataService = LazyKt__LazyJVMKt.lazy(new Function0<IMedalDataService>() { // from class: com.heytap.health.core.provider.model.MedalModel$medalDataService$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        @Nullable
        public final IMedalDataService invoke() {
            try {
                Object objNavigation = x0.d().b("/operation/medaldata").navigation();
                if (objNavigation instanceof IMedalDataService) {
                    return (IMedalDataService) objNavigation;
                }
                return null;
            } catch (Exception e2) {
                a7b.c("MedalModel", "Failed to get IMedalDataService: " + e2.getMessage(), e2);
                return null;
            }
        }
    });

    @Nullable
    public final MedalListBean a(@NotNull String code) {
        Intrinsics.checkNotNullParameter(code, "code");
        try {
            IMedalDataService iMedalDataServiceB = b();
            if (iMedalDataServiceB == null) {
                a7b.b("MedalModel", "getMedalByCode: medalDataService is null");
                return null;
            }
            MedalListBean medalListBeanC = iMedalDataServiceB.C(code);
            boolean z = medalListBeanC != null;
            StringBuilder sb = new StringBuilder();
            sb.append("getMedalByCode: code=");
            sb.append(code);
            sb.append(", found=");
            sb.append(z);
            return medalListBeanC;
        } catch (Exception e2) {
            a7b.c("MedalModel", "Failed to get medal by code " + code + ": " + e2.getMessage(), e2);
            return null;
        }
    }

    public final IMedalDataService b() {
        return (IMedalDataService) this.medalDataService.getValue();
    }

    @Nullable
    public final MedalListBean c() {
        try {
            IMedalDataService iMedalDataServiceB = b();
            if (iMedalDataServiceB != null) {
                return iMedalDataServiceB.s0();
            }
            a7b.b("MedalModel", "queryLastObtainedMedal: medalDataService is null");
            return null;
        } catch (Exception e2) {
            a7b.c("MedalModel", "Error in queryLastObtainedMedal: " + e2.getMessage(), e2);
            return null;
        }
    }

    @NotNull
    public final List<MedalListBean> d(long startTime, long endTime) {
        try {
            IMedalDataService iMedalDataServiceB = b();
            if (iMedalDataServiceB == null) {
                a7b.b("MedalModel", "queryMedalsByTimeRange: medalDataService is null");
                return CollectionsKt__CollectionsKt.emptyList();
            }
            List<MedalListBean> listZ = iMedalDataServiceB.Z(startTime, endTime);
            int size = listZ.size();
            StringBuilder sb = new StringBuilder();
            sb.append("queryMedalsByTimeRange: startTime=");
            sb.append(startTime);
            sb.append(", endTime=");
            sb.append(endTime);
            sb.append(", found=");
            sb.append(size);
            return listZ;
        } catch (Exception e2) {
            a7b.c("MedalModel", "Error in queryMedalsByTimeRange: " + e2.getMessage(), e2);
            return CollectionsKt__CollectionsKt.emptyList();
        }
    }
}
