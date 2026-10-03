package com.heytap.health.community.focus;

import com.heytap.health.network.core.BaseResponse;
import com.heytap.health.network.core.a;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.eoe;
import java.util.LinkedHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.ResultKt;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.coroutines.jvm.internal.Boxing;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0002\u0007\fB\u0007¢\u0006\u0004\b\t\u0010\nJ#\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lcom/heytap/health/community/focus/FollowRepository;", "", "", "postId", "Lcom/heytap/health/community/focus/FollowRepository$LikeStatus;", "likeStatus", "", "a", "(JLcom/heytap/health/community/focus/FollowRepository$LikeStatus;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<init>", "()V", "Companion", "LikeStatus", "community_impl_release"}, k = 1, mv = {1, 8, 0})
public final class FollowRepository {

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/heytap/health/community/focus/FollowRepository$LikeStatus;", "", "status", "", "(Ljava/lang/String;II)V", "getStatus", "()I", "LIKE", "UNLIKE", "community_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum LikeStatus {
        LIKE(1),
        UNLIKE(0);

        private final int status;

        LikeStatus(int i) {
            this.status = i;
        }

        public final int getStatus() {
            return this.status;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object a(long j2, @NotNull LikeStatus likeStatus, @NotNull Continuation<? super Integer> continuation) {
        FollowRepository$postLike$1 followRepository$postLike$1;
        if (continuation instanceof FollowRepository$postLike$1) {
            followRepository$postLike$1 = (FollowRepository$postLike$1) continuation;
            int i = followRepository$postLike$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                followRepository$postLike$1.label = i - Integer.MIN_VALUE;
            } else {
                followRepository$postLike$1 = new FollowRepository$postLike$1(this, continuation);
            }
        } else {
            followRepository$postLike$1 = new FollowRepository$postLike$1(this, continuation);
        }
        Object objC = followRepository$postLike$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = followRepository$postLike$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objC);
            a7b.f("FollowRepository", "postLike " + j2 + ", changeTo:" + likeStatus);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("postId", Boxing.boxLong(j2));
            linkedHashMap.put("likeStatus", Boxing.boxLong((long) likeStatus.getStatus()));
            eoe eoeVar = (eoe) a.r(eoe.class);
            followRepository$postLike$1.label = 1;
            objC = eoeVar.c(linkedHashMap, followRepository$postLike$1);
            if (objC == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objC);
        }
        return Boxing.boxInt(((BaseResponse) objC).getErrorCode());
    }
}
