package com.heytap.health.menstrual_period.viewmodel;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.base.text.GsonUtil;
import com.heytap.health.menstrual_period.net.FeedInfoData;
import com.heytap.health.network.core.BaseResponse;
import com.heytap.health.network.core.a;
import com.heytap.store.business.rn.service.RnConstant;
import com.oplus.aiunit.vision.o05;
import com.oplus.aiunit.vision.osb;
import com.oplus.aiunit.vision.v9g;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.ResultKt;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.coroutines.jvm.internal.Boxing;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/heytap/health/menstrual_period/viewmodel/FeedInfoRepository;", "", "Companion", "menstrual_period_impl_release"}, k = 1, mv = {1, 8, 0})
public final class FeedInfoRepository {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String SP_KEY_FEED_INFO = "key_feed_info";

    @NotNull
    public static final String SP_MENSTRUAL_FEED_INFO = "menstrual_feed_info";

    @NotNull
    public static final String TAG = "FeedInfoRepository";

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Lcom/heytap/health/menstrual_period/viewmodel/FeedInfoRepository$Companion;", "", "Lcom/heytap/health/network/core/BaseResponse;", "", "Lcom/heytap/health/menstrual_period/net/FeedInfoData;", "b", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "", "SP_KEY_FEED_INFO", "Ljava/lang/String;", "SP_MENSTRUAL_FEED_INFO", "TAG", "<init>", "()V", "menstrual_period_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final List<FeedInfoData> a() {
            String strD = v9g.x(FeedInfoRepository.SP_MENSTRUAL_FEED_INFO).D(FeedInfoRepository.SP_KEY_FEED_INFO);
            if (strD == null || strD.length() == 0) {
                return null;
            }
            return GsonUtil.c(strD, FeedInfoData.class);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Nullable
        public final Object b(@NotNull Continuation<? super BaseResponse<List<FeedInfoData>>> continuation) {
            FeedInfoRepository$Companion$queryFeedInfo$1 feedInfoRepository$Companion$queryFeedInfo$1;
            if (continuation instanceof FeedInfoRepository$Companion$queryFeedInfo$1) {
                feedInfoRepository$Companion$queryFeedInfo$1 = (FeedInfoRepository$Companion$queryFeedInfo$1) continuation;
                int i = feedInfoRepository$Companion$queryFeedInfo$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    feedInfoRepository$Companion$queryFeedInfo$1.label = i - Integer.MIN_VALUE;
                } else {
                    feedInfoRepository$Companion$queryFeedInfo$1 = new FeedInfoRepository$Companion$queryFeedInfo$1(this, continuation);
                }
            } else {
                feedInfoRepository$Companion$queryFeedInfo$1 = new FeedInfoRepository$Companion$queryFeedInfo$1(this, continuation);
            }
            Object objA = feedInfoRepository$Companion$queryFeedInfo$1.result;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = feedInfoRepository$Companion$queryFeedInfo$1.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objA);
                HashMap<String, Object> map = new HashMap<>();
                map.put(RnConstant.KEY_PAGE, Boxing.boxInt(1));
                map.put("pageSize", Boxing.boxInt(30));
                LocalDate localDateMinusDays = LocalDate.now().minusDays(30L);
                Intrinsics.checkNotNullExpressionValue(localDateMinusDays, "now().minusDays(30)");
                map.put("addTimestamp", Boxing.boxLong(o05.x(localDateMinusDays) / ((long) 1000)));
                osb osbVar = (osb) a.j(osb.class);
                feedInfoRepository$Companion$queryFeedInfo$1.label = 1;
                objA = osbVar.a(map, feedInfoRepository$Companion$queryFeedInfo$1);
                if (objA == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objA);
            }
            return (BaseResponse) objA;
        }
    }
}
