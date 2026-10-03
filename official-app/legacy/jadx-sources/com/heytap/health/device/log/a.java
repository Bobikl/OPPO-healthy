package com.heytap.health.device.log;

import com.heytap.sporthealth.blib.data.NetResult;
import com.oplus.aiunit.vision.av1;
import com.oplus.aiunit.vision.m1e;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bb\u0018\u00002\u00020\u0001J4\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00062\u0019\b\u0003\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\u00040\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, d2 = {"Lcom/heytap/health/device/log/a;", "", "", "", "Lkotlin/jvm/JvmSuppressWildcards;", "params", "Lcom/heytap/sporthealth/blib/data/NetResult;", "a", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
interface a {
    @m1e("v1/c2s/log/uploadEapLog")
    @Nullable
    Object a(@av1 @NotNull Map<String, Object> map, @NotNull Continuation<? super NetResult<String>> continuation);
}
