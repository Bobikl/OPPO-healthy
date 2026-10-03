package com.oplus.aiunit.vision;

import com.heytap.health.network.core.BaseResponse;
import com.heytap.sports.recommend.bean.AnalyzeParam;
import com.heytap.sports.recommend.bean.AnalyzeResult;
import com.heytap.sports.recommend.ui.UploadSelectedData;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J%\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0007H§@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Lcom/oplus/aiunit/vision/xdf;", "", "Lcom/heytap/sports/recommend/ui/UploadSelectedData;", "params", "Lcom/heytap/health/network/core/BaseResponse;", "a", "(Lcom/heytap/sports/recommend/ui/UploadSelectedData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/heytap/sports/recommend/bean/AnalyzeParam;", "Lcom/heytap/sports/recommend/bean/AnalyzeResult;", "b", "(Lcom/heytap/sports/recommend/bean/AnalyzeParam;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "recommend_release"}, k = 1, mv = {1, 8, 0})
public interface xdf {
    @m1e("api/recommend/saveQuestionnaire")
    @Nullable
    Object a(@av1 @NotNull UploadSelectedData uploadSelectedData, @NotNull Continuation<? super BaseResponse<Object>> continuation);

    @m1e("api/recommend/analysis")
    @Nullable
    Object b(@av1 @NotNull AnalyzeParam analyzeParam, @NotNull Continuation<? super BaseResponse<AnalyzeResult>> continuation);
}
