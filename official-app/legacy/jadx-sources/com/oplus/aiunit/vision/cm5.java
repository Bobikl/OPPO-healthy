package com.oplus.aiunit.vision;

import com.heytap.health.device.ota.privacy.PrivacyDiff;
import com.heytap.health.network.core.BaseResponse;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J6\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0019\b\u0001\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002¢\u0006\u0002\b\u0004H§@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, d2 = {"Lcom/oplus/aiunit/vision/cm5;", "", "", "", "Lkotlin/jvm/JvmSuppressWildcards;", "params", "Lcom/heytap/health/network/core/BaseResponse;", "Lcom/heytap/health/device/ota/privacy/PrivacyDiff;", "a", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deviceota_impl_release"}, k = 1, mv = {1, 8, 0})
public interface cm5 {
    @m1e("v1/c2s/protocol/privacy/queryMachineProtocolContentDiff")
    @Nullable
    Object a(@av1 @NotNull Map<String, Object> map, @NotNull Continuation<? super BaseResponse<PrivacyDiff>> continuation);
}
