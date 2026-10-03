package com.heytap.health.menstrual_period.viewmodel;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.jvm.internal.ContinuationImpl;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.heytap.health.menstrual_period.viewmodel.FeedInfoRepository$Companion", f = "FeedInfoRepository.kt", i = {}, l = {25}, m = "queryFeedInfo", n = {}, s = {})
public final class FeedInfoRepository$Companion$queryFeedInfo$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FeedInfoRepository.Companion this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedInfoRepository$Companion$queryFeedInfo$1(FeedInfoRepository.Companion companion, Continuation<? super FeedInfoRepository$Companion$queryFeedInfo$1> continuation) {
        super(continuation);
        this.this$0 = companion;
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(this);
    }
}
