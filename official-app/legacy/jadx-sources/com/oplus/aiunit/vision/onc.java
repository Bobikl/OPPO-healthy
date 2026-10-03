package com.oplus.aiunit.vision;

import com.heytap.health.network.core.BaseResponse;
import com.heytap.sports.partner.bean.Common;
import com.heytap.sports.partner.bean.Highlights;
import com.heytap.sports.partner.bean.MessageSummary;
import com.heytap.sports.partner.bean.PartnerDetail;
import io.protostuff.MapSchema;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J/\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\bJ/\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\bJ\u0019\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0005H§@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ/\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00052\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\bJ\u001f\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u0005H§@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Lcom/oplus/aiunit/vision/onc;", "", "", "", "params", "Lcom/heytap/health/network/core/BaseResponse;", "Lcom/heytap/sports/partner/bean/Common;", "c", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", MapSchema.FIELD_NAME_ENTRY, "f", "Lcom/heytap/sports/partner/bean/MessageSummary;", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/heytap/sports/partner/bean/PartnerDetail;", "b", "", "Lcom/heytap/sports/partner/bean/Highlights;", "d", "partner_release"}, k = 1, mv = {1, 8, 0})
public interface onc {
    @m1e("/v1/c2s/partner/queryMessageSummary")
    @Nullable
    Object a(@NotNull Continuation<? super BaseResponse<MessageSummary>> continuation);

    @m1e("/v1/c2s/partner/queryPartDetail")
    @Nullable
    Object b(@av1 @NotNull Map<String, String> map, @NotNull Continuation<? super BaseResponse<PartnerDetail>> continuation);

    @m1e("/v1/c2s/partner/cancelLike")
    @Nullable
    Object c(@av1 @NotNull Map<String, String> map, @NotNull Continuation<? super BaseResponse<Common>> continuation);

    @m1e("/v1/c2s/partner/queryUserAchievementList")
    @Nullable
    Object d(@NotNull Continuation<? super BaseResponse<List<Highlights>>> continuation);

    @m1e("/v1/c2s/partner/commentAchievement")
    @Nullable
    Object e(@av1 @NotNull Map<String, String> map, @NotNull Continuation<? super BaseResponse<Common>> continuation);

    @m1e("/v1/c2s/partner/like")
    @Nullable
    Object f(@av1 @NotNull Map<String, String> map, @NotNull Continuation<? super BaseResponse<Common>> continuation);
}
