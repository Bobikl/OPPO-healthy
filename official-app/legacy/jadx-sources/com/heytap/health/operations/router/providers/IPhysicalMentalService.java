package com.heytap.health.operations.router.providers;

import com.alibaba.android.arouter.facade.template.IProvider;
import com.heytap.health.operations.bean.PhysicalMentalData;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&¨\u0006\b"}, d2 = {"Lcom/heytap/health/operations/router/providers/IPhysicalMentalService;", "Lcom/alibaba/android/arouter/facade/template/IProvider;", "", "startTime", "endTime", "", "Lcom/heytap/health/operations/bean/PhysicalMentalData;", "J2", "operations_release"}, k = 1, mv = {1, 8, 0})
public interface IPhysicalMentalService extends IProvider {
    @NotNull
    List<PhysicalMentalData> J2(long startTime, long endTime);
}
