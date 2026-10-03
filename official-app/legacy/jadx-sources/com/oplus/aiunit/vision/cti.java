package com.oplus.aiunit.vision;

import com.heytap.health.network.core.BaseResponse;
import com.heytap.health.step.detail.ui.stephistory2.net.MobileMsgBean;
import java.util.HashMap;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001JG\u0010\t\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u00062$\b\u0001\u0010\u0005\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002j\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001`\u0004H§@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Lcom/oplus/aiunit/vision/cti;", "", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "body", "Lcom/heytap/health/network/core/BaseResponse;", "", "Lcom/heytap/health/step/detail/ui/stephistory2/net/MobileMsgBean;", "a", "(Ljava/util/HashMap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "step_release"}, k = 1, mv = {1, 8, 0})
public interface cti {
    @m1e("v5/c2s/mobile/terminal/queryUserDailyMobileTerminalList")
    @Nullable
    Object a(@av1 @NotNull HashMap<String, Object> map, @NotNull Continuation<? super BaseResponse<List<MobileMsgBean>>> continuation);
}
