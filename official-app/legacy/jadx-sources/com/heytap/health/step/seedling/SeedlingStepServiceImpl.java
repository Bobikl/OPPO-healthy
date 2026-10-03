package com.heytap.health.step.seedling;

import android.content.Context;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.heytap.databaseengine.model.SportDataStat;
import com.heytap.health.sport.model.DayStepData;
import com.heytap.health.sport.seedling.SeedlingStepService;
import com.heytap.health.step.detail.ui.stephistory2.datamanager.c;
import com.oplus.aiunit.vision.d08;
import com.oplus.aiunit.vision.lbd;
import com.oplus.aiunit.vision.n05;
import java.time.LocalDate;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Route(path = "/step/SeedlingStepService")
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u001c\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\u000e"}, d2 = {"Lcom/heytap/health/step/seedling/SeedlingStepServiceImpl;", "Lcom/heytap/health/sport/seedling/SeedlingStepService;", "Landroid/content/Context;", "context", "", "init", "", "endTime", "Lcom/oplus/aiunit/vision/lbd;", "", "Lcom/heytap/health/sport/model/DayStepData;", "a4", "<init>", "()V", "step_release"}, k = 1, mv = {1, 8, 0})
public final class SeedlingStepServiceImpl implements SeedlingStepService {

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/heytap/databaseengine/model/SportDataStat;", "it", "Lcom/heytap/health/sport/model/DayStepData;", "a", "(Ljava/util/List;)Ljava/util/List;"}, k = 3, mv = {1, 8, 0})
    public static final class a<T, R> implements d08 {
        public final /* synthetic */ c i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ LocalDate f6025j;
        public final /* synthetic */ LocalDate k;

        public a(c cVar, LocalDate localDate, LocalDate localDate2) {
            this.i = cVar;
            this.f6025j = localDate;
            this.k = localDate2;
        }

        @Override // com.oplus.aiunit.vision.d08
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<DayStepData> apply(@NotNull List<? extends SportDataStat> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            c cVar = this.i;
            LocalDate startDate = this.f6025j;
            Intrinsics.checkNotNullExpressionValue(startDate, "startDate");
            return cVar.a(it, startDate, this.k);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.heytap.health.sport.seedling.SeedlingStepService
    @NotNull
    public lbd<List<DayStepData>> a4(long endTime) {
        c cVar = new c(null, 1, 0 == true ? 1 : 0);
        LocalDate localDateG = n05.g(endTime);
        LocalDate startDate = localDateG.minusWeeks(2L).plusDays(1L);
        Intrinsics.checkNotNullExpressionValue(startDate, "startDate");
        lbd<List<DayStepData>> lbdVarJ0 = c.c(cVar, startDate, localDateG, 0, 4, null).j0(new a(cVar, startDate, localDateG));
        Intrinsics.checkNotNullExpressionValue(lbdVarJ0, "repository = StepDetailR…e, endDate)\n            }");
        return lbdVarJ0;
    }

    @Override // com.alibaba.android.arouter.facade.template.IProvider
    public void init(@Nullable Context context) {
    }
}
