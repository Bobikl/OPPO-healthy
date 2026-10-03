package com.heytap.health.sleep.service.homecard;

import android.content.Context;
import com.alibaba.android.arouter.facade.template.IProvider;
import com.oplus.aiunit.vision.t5h;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J1\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H¦@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ1\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H¦@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Lcom/heytap/health/sleep/service/homecard/SleepCardService;", "Lcom/alibaba/android/arouter/facade/template/IProvider;", "Landroid/content/Context;", "context", "", "startTime", "endTime", "", "Lcom/oplus/aiunit/vision/t5h;", "J4", "(Landroid/content/Context;JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "x8", "sleep_release"}, k = 1, mv = {1, 8, 0})
public interface SleepCardService extends IProvider {
    @Nullable
    Object J4(@NotNull Context context, long j2, long j3, @NotNull Continuation<? super List<t5h>> continuation);

    @Nullable
    Object x8(@NotNull Context context, long j2, long j3, @NotNull Continuation<? super List<t5h>> continuation);
}
