package com.oplus.aiunit.vision;

import com.heytap.health.blood.glucose.service.NetConfig;
import com.heytap.sporthealth.blib.data.NetResult;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J1\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, d2 = {"Lcom/oplus/aiunit/vision/yq5;", "", "", "", "params", "Lcom/heytap/sporthealth/blib/data/NetResult;", "Lcom/heytap/health/blood/glucose/service/NetConfig;", "a", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "blood_glucose_release"}, k = 1, mv = {1, 8, 0})
public interface yq5 {
    @m1e("v1/c2s/switch/querySwitchStatus")
    @Nullable
    Object a(@av1 @NotNull Map<String, String> map, @NotNull Continuation<? super NetResult<NetConfig>> continuation);
}
