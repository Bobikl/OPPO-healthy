package com.oplus.aiunit.vision;

import com.heytap.health.health.insight.ModuleType;
import java.time.LocalDate;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J!\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H¦@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, d2 = {"Lcom/oplus/aiunit/vision/o61;", "", "Lcom/heytap/health/health/insight/ModuleType;", "a", "Ljava/time/LocalDate;", "queryDate", "", "Lcom/oplus/aiunit/vision/g11;", "b", "(Ljava/time/LocalDate;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "health_impl_release"}, k = 1, mv = {1, 8, 0})
public interface o61 {
    @NotNull
    ModuleType a();

    @Nullable
    Object b(@NotNull LocalDate localDate, @NotNull Continuation<? super List<? extends g11>> continuation);
}
