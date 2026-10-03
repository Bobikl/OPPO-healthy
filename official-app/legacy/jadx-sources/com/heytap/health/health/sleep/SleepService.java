package com.heytap.health.health.sleep;

import com.alibaba.android.arouter.facade.template.IProvider;
import com.heytap.health.base.utils.AsyncResult;
import com.oplus.aiunit.vision.SeedlingCardSleepData;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\t0\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H¦@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Lcom/heytap/health/health/sleep/SleepService;", "Lcom/alibaba/android/arouter/facade/template/IProvider;", "Lcom/heytap/health/base/utils/AsyncResult;", "Lcom/oplus/aiunit/vision/uqg;", "Z4", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "startTime", "endTime", "", "j8", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "health_release"}, k = 1, mv = {1, 8, 0})
public interface SleepService extends IProvider {
    @Nullable
    Object Z4(@NotNull Continuation<? super AsyncResult<SeedlingCardSleepData>> continuation);

    @Nullable
    Object j8(long j2, long j3, @NotNull Continuation<? super AsyncResult<List<SeedlingCardSleepData>>> continuation);
}
