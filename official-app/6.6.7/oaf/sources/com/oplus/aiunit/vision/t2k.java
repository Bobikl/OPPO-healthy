package com.oplus.aiunit.vision;

import com.health.database.depend.work.config.CloudConfigRequest;
import com.health.database.depend.work.config.SyncDataCloudConfig;
import com.heytap.accessory.constant.Constants;
import com.heytap.health.network.core.BaseResponse;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J#\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b"}, d2 = {"Lcom/oplus/aiunit/vision/t2k;", "", "Lcom/health/database/depend/work/config/CloudConfigRequest;", Constants.EXTRA_PARAMS, "Lcom/heytap/health/network/core/BaseResponse;", "Lcom/health/database/depend/work/config/SyncDataCloudConfig;", "a", "(Lcom/health/database/depend/work/config/CloudConfigRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "depend_release"}, k = 1, mv = {1, 8, 0})
public interface t2k {
    @j3e("v1/c2s/switch/querySwitchStatus")
    @Nullable
    Object a(@ov1 @NotNull CloudConfigRequest cloudConfigRequest, @NotNull Continuation<? super BaseResponse<SyncDataCloudConfig>> continuation);
}
