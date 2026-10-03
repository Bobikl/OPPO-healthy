package androidx.paging;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.jvm.internal.ContinuationImpl;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.paging.AsyncPagingDataDiffer$differBase$1", f = "AsyncPagingDataDiffer.kt", i = {0, 0, 0, 0, 0}, l = {185}, m = "presentNewList", n = {"this", "previousList", "newList", "onListPresentable", "lastAccessedIndex"}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"})
public final class AsyncPagingDataDiffer$differBase$1$presentNewList$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AsyncPagingDataDiffer$differBase$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsyncPagingDataDiffer$differBase$1$presentNewList$1(AsyncPagingDataDiffer$differBase$1 asyncPagingDataDiffer$differBase$1, Continuation continuation) {
        super(continuation);
        this.this$0 = asyncPagingDataDiffer$differBase$1;
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.presentNewList(null, null, 0, null, this);
    }
}
