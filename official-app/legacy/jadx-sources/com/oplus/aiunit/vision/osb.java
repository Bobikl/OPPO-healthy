package com.oplus.aiunit.vision;

import com.heytap.health.menstrual_period.net.FeedInfoData;
import com.heytap.health.menstrual_period.net.SwitchUserResult;
import com.heytap.health.network.core.BaseResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J1\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ1\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00052\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\bJE\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u00052$\b\u0001\u0010\u0004\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\nj\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001`\u000bH§@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"Lcom/oplus/aiunit/vision/osb;", "", "", "", "params", "Lcom/heytap/health/network/core/BaseResponse;", "Lcom/heytap/health/menstrual_period/net/SwitchUserResult;", "b", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "c", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "", "Lcom/heytap/health/menstrual_period/net/FeedInfoData;", "a", "(Ljava/util/HashMap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "menstrual_period_impl_release"}, k = 1, mv = {1, 8, 0})
public interface osb {
    @m1e("v1/c2s/common/thirdParty/queryFeedInfo")
    @Nullable
    Object a(@av1 @NotNull HashMap<String, Object> map, @NotNull Continuation<? super BaseResponse<List<FeedInfoData>>> continuation);

    @m1e("v1/c2s/switch/queryUserSetting")
    @Nullable
    Object b(@av1 @NotNull Map<String, String> map, @NotNull Continuation<? super BaseResponse<SwitchUserResult>> continuation);

    @m1e("v1/c2s/switch/syncUserSetting")
    @Nullable
    Object c(@av1 @NotNull Map<String, String> map, @NotNull Continuation<? super BaseResponse<Object>> continuation);
}
