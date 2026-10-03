package com.heytap.health.health.cardiovascular;

import com.alibaba.android.arouter.facade.template.IProvider;
import com.heytap.databaseengine.model.AssessmentRecord;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\b\u001a\u00020\u0007H&J\b\u0010\t\u001a\u00020\u0007H&J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0004H&J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH&J\b\u0010\u000f\u001a\u00020\u0007H&J\u001b\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H¦@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\fH&J\u0010\u0010\u0016\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\fH&\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Lcom/heytap/health/health/cardiovascular/CardiovascularService;", "Lcom/alibaba/android/arouter/facade/template/IProvider;", "", "mac", "", "T9", "y2", "", "l5", "q9", "needCheckAgain", "i9", "Lcom/heytap/databaseengine/model/AssessmentRecord;", "assessmentRecord", "Y9", "b0", "", "startTimestamp", "Y2", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "g8", "E9", "health_release"}, k = 1, mv = {1, 8, 0})
public interface CardiovascularService extends IProvider {
    int E9(@NotNull AssessmentRecord assessmentRecord);

    boolean T9(@NotNull String mac);

    @Nullable
    Object Y2(long j2, @NotNull Continuation<? super String> continuation);

    boolean Y9(@NotNull AssessmentRecord assessmentRecord);

    void b0();

    int g8(@NotNull AssessmentRecord assessmentRecord);

    void i9(boolean needCheckAgain);

    void l5();

    void q9();

    boolean y2(@NotNull String mac);
}
