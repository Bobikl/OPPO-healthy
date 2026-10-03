package com.oplus.aiunit.vision;

import com.heytap.sporthealth.blib.data.NetResult;
import com.heytap.sports.share.repo.StickerData;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J5\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ0\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00050\n2\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H'J/\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00052\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lcom/oplus/aiunit/vision/h70;", "", "", "", "params", "Lcom/heytap/sporthealth/blib/data/NetResult;", "", "Lcom/oplus/aiunit/vision/di3;", "b", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/oplus/aiunit/vision/xr2;", "c", "Lcom/heytap/sports/share/repo/StickerData;", "a", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
public interface h70 {
    @m1e("v1/c2s/switch/querySwitchStatus")
    @Nullable
    Object a(@av1 @NotNull Map<String, String> map, @NotNull Continuation<? super NetResult<StickerData>> continuation);

    @m1e("v1/c2s/operation/queryOperationList")
    @Nullable
    Object b(@av1 @NotNull Map<String, String> map, @NotNull Continuation<? super NetResult<List<CloudImgs>>> continuation);

    @m1e("v1/c2s/operation/queryOperationList")
    @NotNull
    xr2<NetResult<List<CloudImgs>>> c(@av1 @NotNull Map<String, String> params);
}
