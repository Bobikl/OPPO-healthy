package com.heytap.health.community.search;

import com.heytap.health.base.base.BaseViewModel;
import com.heytap.health.community.data.PostRespData;
import com.heytap.health.community.data.SearchRequestParams;
import com.heytap.health.network.core.BaseResponse;
import com.heytap.health.network.core.a;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.eoe;
import com.oplus.aiunit.vision.n28;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.ResultKt;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.coroutines.jvm.internal.Boxing;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\n\u0010\u000bJ-\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lcom/heytap/health/community/search/SearchPostViewModel;", "Lcom/heytap/health/base/base/BaseViewModel;", "", n28.KEYWORD, "", "appSortType", "scrollId", "Lcom/heytap/health/community/data/PostRespData;", "v", "(Ljava/lang/String;ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<init>", "()V", "Companion", "a", "community_impl_release"}, k = 1, mv = {1, 8, 0})
public final class SearchPostViewModel extends BaseViewModel {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object v(@NotNull String str, int i, @NotNull String str2, @NotNull Continuation<? super PostRespData> continuation) {
        SearchPostViewModel$searchPostData$1 searchPostViewModel$searchPostData$1;
        if (continuation instanceof SearchPostViewModel$searchPostData$1) {
            searchPostViewModel$searchPostData$1 = (SearchPostViewModel$searchPostData$1) continuation;
            int i2 = searchPostViewModel$searchPostData$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                searchPostViewModel$searchPostData$1.label = i2 - Integer.MIN_VALUE;
            } else {
                searchPostViewModel$searchPostData$1 = new SearchPostViewModel$searchPostData$1(this, continuation);
            }
        } else {
            searchPostViewModel$searchPostData$1 = new SearchPostViewModel$searchPostData$1(this, continuation);
        }
        Object objF = searchPostViewModel$searchPostData$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = searchPostViewModel$searchPostData$1.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objF);
            SearchRequestParams searchRequestParams = new SearchRequestParams(str);
            searchRequestParams.setAppSortType(Boxing.boxInt(i));
            searchRequestParams.setScrollId(ByteString.INSTANCE.encodeUtf8(str2).utf8());
            eoe eoeVar = (eoe) a.j(eoe.class);
            searchPostViewModel$searchPostData$1.L$0 = str2;
            searchPostViewModel$searchPostData$1.label = 1;
            objF = eoeVar.f(searchRequestParams, searchPostViewModel$searchPostData$1);
            if (objF == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = (String) searchPostViewModel$searchPostData$1.L$0;
            ResultKt.throwOnFailure(objF);
        }
        BaseResponse baseResponse = (BaseResponse) objF;
        if (!baseResponse.isSuccess()) {
            a7b.b("SearchPostViewModel", "searchPostData response error. scrollId=" + str2 + ", response=" + baseResponse);
        }
        return baseResponse.getBody();
    }
}
