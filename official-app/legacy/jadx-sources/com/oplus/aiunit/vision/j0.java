package com.oplus.aiunit.vision;

import com.heytap.health.sleep.ai.data.QuestionsModuleResponse;
import com.heytap.health.sleep.ai.data.QuestionsResponse;
import com.heytap.health.sleep.ai.data.Response;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00022\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0001H§@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, d2 = {"Lcom/oplus/aiunit/vision/j0;", "", "Lcom/heytap/health/sleep/ai/data/Response;", "Lcom/heytap/health/sleep/ai/data/QuestionsResponse;", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "body", "Lcom/heytap/health/sleep/ai/data/QuestionsModuleResponse;", "b", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sleep_release"}, k = 1, mv = {1, 8, 0})
public interface j0 {
    @m1e("v1/c2s/aihealth/dialog/getQuestions")
    @Nullable
    Object a(@NotNull Continuation<? super Response<QuestionsResponse>> continuation);

    @m1e("v1/c2s/aihealth/dialog/getModuleQuestions")
    @Nullable
    Object b(@av1 @Nullable Object obj, @NotNull Continuation<? super Response<QuestionsModuleResponse>> continuation);
}
