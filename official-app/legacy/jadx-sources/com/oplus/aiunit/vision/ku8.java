package com.oplus.aiunit.vision;

import com.heytap.health.network.core.BaseResponse;
import com.heytap.health.watch.thirdparty.bugfix.research.api.ResearchBaseResponse;
import com.heytap.health.watch.thirdparty.bugfix.research.api.ResearchProjectDataBean;
import com.heytap.health.watch.thirdparty.bugfix.research.api.ResearchUserInfo;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J?\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004H§@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ9\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004H§@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lcom/oplus/aiunit/vision/ku8;", "", "", "dest", "", "params", "Lcom/heytap/health/network/core/BaseResponse;", "Lcom/heytap/health/watch/thirdparty/bugfix/research/api/ResearchBaseResponse;", "Lcom/heytap/health/watch/thirdparty/bugfix/research/api/ResearchUserInfo;", "b", "(Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/heytap/health/watch/thirdparty/bugfix/research/api/ResearchProjectDataBean;", "a", "thirdparty_impl_release"}, k = 1, mv = {1, 8, 0})
public interface ku8 {
    @m1e("forward/openapi/v1/project/getHbpProjectUserState")
    @Nullable
    Object a(@yh8("dest") @NotNull String str, @av1 @NotNull Map<String, String> map, @NotNull Continuation<? super ResearchBaseResponse<ResearchProjectDataBean>> continuation);

    @m1e("forward/openapi/v1/user/info")
    @Nullable
    Object b(@yh8("dest") @NotNull String str, @av1 @NotNull Map<String, String> map, @NotNull Continuation<? super BaseResponse<ResearchBaseResponse<ResearchUserInfo>>> continuation);
}
