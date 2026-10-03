package com.heytap.health.health_archives.viewmodel;

import com.google.android.gms.actions.SearchIntents;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.jvm.internal.ContinuationImpl;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.heytap.health.health_archives.viewmodel.SearchViewModel", f = "SearchViewModel.kt", i = {0, 0, 1, 1, 1, 2, 2}, l = {42, 46, 47}, m = "searchByQuery", n = {"this", SearchIntents.EXTRA_QUERY, "this", SearchIntents.EXTRA_QUERY, "recordList", "this", "recordList"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$0", "L$1"})
public final class SearchViewModel$searchByQuery$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SearchViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchViewModel$searchByQuery$1(SearchViewModel searchViewModel, Continuation<? super SearchViewModel$searchByQuery$1> continuation) {
        super(continuation);
        this.this$0 = searchViewModel;
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.F(null, this);
    }
}
