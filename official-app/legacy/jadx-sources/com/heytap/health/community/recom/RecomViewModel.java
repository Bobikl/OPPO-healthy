package com.heytap.health.community.recom;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.heytap.databaseengine.model.SpaceInfo;
import com.heytap.databaseengine.model.UserGoalInfo;
import com.heytap.health.base.base.BaseViewModel;
import com.heytap.health.community.data.PostRespData;
import com.heytap.health.community.data.TopicBoard;
import com.heytap.health.core.operation.datacenter.ISpaceServer;
import com.heytap.health.network.core.BaseResponse;
import com.heytap.health.network.core.a;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.b2k;
import com.oplus.aiunit.vision.eoe;
import com.oplus.aiunit.vision.m3k;
import com.oplus.aiunit.vision.x0;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.Pair;
import p010kotlin.ResultKt;
import p010kotlin.TuplesKt;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.collections.MapsKt__MapsJVMKt;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.coroutines.jvm.internal.Boxing;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001dB\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ)\u0010\u0007\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\u000f\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f0\u000b2\u0006\u0010\n\u001a\u00020\tJ&\u0010\u0010\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f0\u000b2\u0006\u0010\n\u001a\u00020\tJ\u0019\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\rH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {"Lcom/heytap/health/community/recom/RecomViewModel;", "Lcom/heytap/health/base/base/BaseViewModel;", "", "scrollId", "Lkotlin/Pair;", "Lcom/heytap/health/community/data/PostRespData;", "", "x", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Landroidx/lifecycle/LiveData;", "", "", "Lcom/heytap/databaseengine/model/SpaceInfo;", "y", "z", "Lcom/heytap/health/community/data/TopicBoard;", "w", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/heytap/health/core/operation/datacenter/ISpaceServer;", "j", "Lkotlin/Lazy;", "v", "()Lcom/heytap/health/core/operation/datacenter/ISpaceServer;", "spaceServer", "<init>", "()V", "Companion", "a", "community_impl_release"}, k = 1, mv = {1, 8, 0})
public final class RecomViewModel extends BaseViewModel {

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy spaceServer = LazyKt__LazyJVMKt.lazy(new Function0<ISpaceServer>() { // from class: com.heytap.health.community.recom.RecomViewModel$spaceServer$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final ISpaceServer invoke() {
            Object objNavigation = x0.d().b("/operations/SpaceServer").navigation();
            Intrinsics.checkNotNull(objNavigation, "null cannot be cast to non-null type com.heytap.health.core.operation.datacenter.ISpaceServer");
            return (ISpaceServer) objNavigation;
        }
    });

    public final ISpaceServer v() {
        return (ISpaceServer) this.spaceServer.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object w(@NotNull Continuation<? super List<TopicBoard>> continuation) {
        RecomViewModel$queryBoardTopics$1 recomViewModel$queryBoardTopics$1;
        if (continuation instanceof RecomViewModel$queryBoardTopics$1) {
            recomViewModel$queryBoardTopics$1 = (RecomViewModel$queryBoardTopics$1) continuation;
            int i = recomViewModel$queryBoardTopics$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                recomViewModel$queryBoardTopics$1.label = i - Integer.MIN_VALUE;
            } else {
                recomViewModel$queryBoardTopics$1 = new RecomViewModel$queryBoardTopics$1(this, continuation);
            }
        } else {
            recomViewModel$queryBoardTopics$1 = new RecomViewModel$queryBoardTopics$1(this, continuation);
        }
        Object objA = recomViewModel$queryBoardTopics$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = recomViewModel$queryBoardTopics$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objA);
            b2k b2kVar = (b2k) a.j(b2k.class);
            recomViewModel$queryBoardTopics$1.label = 1;
            objA = b2kVar.a(recomViewModel$queryBoardTopics$1);
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objA);
        }
        BaseResponse baseResponse = (BaseResponse) objA;
        if (!baseResponse.isSuccess() || baseResponse.getBody() == null) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        a7b.b("RecomViewModel", "queryBoardTopics error. response=" + baseResponse);
        Object body = baseResponse.getBody();
        Intrinsics.checkNotNullExpressionValue(body, "response.body");
        return body;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object x(@NotNull String str, @NotNull Continuation<? super Pair<PostRespData, Boolean>> continuation) {
        RecomViewModel$queryPostData$1 recomViewModel$queryPostData$1;
        BaseResponse baseResponse;
        if (continuation instanceof RecomViewModel$queryPostData$1) {
            recomViewModel$queryPostData$1 = (RecomViewModel$queryPostData$1) continuation;
            int i = recomViewModel$queryPostData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                recomViewModel$queryPostData$1.label = i - Integer.MIN_VALUE;
            } else {
                recomViewModel$queryPostData$1 = new RecomViewModel$queryPostData$1(this, continuation);
            }
        } else {
            recomViewModel$queryPostData$1 = new RecomViewModel$queryPostData$1(this, continuation);
        }
        Object objD = recomViewModel$queryPostData$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = recomViewModel$queryPostData$1.label;
        boolean z = true;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objD);
            Map mapMapOf = MapsKt__MapsJVMKt.mapOf(TuplesKt.to("scrollId", str));
            if (m3k.d()) {
                eoe eoeVar = (eoe) a.j(eoe.class);
                recomViewModel$queryPostData$1.L$0 = str;
                recomViewModel$queryPostData$1.label = 1;
                objD = eoeVar.b(mapMapOf, recomViewModel$queryPostData$1);
                if (objD == coroutine_suspended) {
                    return coroutine_suspended;
                }
                baseResponse = (BaseResponse) objD;
            } else {
                eoe eoeVar2 = (eoe) a.j(eoe.class);
                recomViewModel$queryPostData$1.L$0 = str;
                recomViewModel$queryPostData$1.label = 2;
                objD = eoeVar2.d(mapMapOf, recomViewModel$queryPostData$1);
                if (objD == coroutine_suspended) {
                    return coroutine_suspended;
                }
                baseResponse = (BaseResponse) objD;
            }
        } else if (i2 == 1) {
            str = (String) recomViewModel$queryPostData$1.L$0;
            ResultKt.throwOnFailure(objD);
            baseResponse = (BaseResponse) objD;
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) recomViewModel$queryPostData$1.L$0;
            ResultKt.throwOnFailure(objD);
            baseResponse = (BaseResponse) objD;
        }
        if (!baseResponse.isSuccess()) {
            a7b.b("RecomViewModel", "getPostData response error. scrollId=" + str + ", response=" + baseResponse);
            z = false;
        }
        return new Pair(baseResponse.getBody(), Boxing.boxBoolean(z));
    }

    @NotNull
    public final LiveData<Map<String, List<SpaceInfo>>> y(@NotNull LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        MutableLiveData<Map<String, List<SpaceInfo>>> mutableLiveDataT6 = v().T6(lifecycleOwner, UserGoalInfo.DEVICE_STEPS_GOAL_DEFAULT, "01");
        Intrinsics.checkNotNullExpressionValue(mutableLiveDataT6, "spaceServer.querySpaceDa…UNITY_RECOMMEND\n        )");
        return mutableLiveDataT6;
    }

    @NotNull
    public final LiveData<Map<String, List<SpaceInfo>>> z(@NotNull LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        MutableLiveData<Map<String, List<SpaceInfo>>> mutableLiveDataC7 = v().c7(lifecycleOwner, UserGoalInfo.DEVICE_STEPS_GOAL_DEFAULT, "01");
        Intrinsics.checkNotNullExpressionValue(mutableLiveDataC7, "spaceServer.querySpaceRe…UNITY_RECOMMEND\n        )");
        return mutableLiveDataC7;
    }
}
