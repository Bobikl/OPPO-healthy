package androidx.paging;

import androidx.arch.core.util.Function;
import androidx.paging.PageKeyedDataSource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Deprecated;
import p010kotlin.Metadata;
import p010kotlin.ReplaceWith;
import p010kotlin.Result;
import p010kotlin.collections.CollectionsKt__IterablesKt;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.coroutines.jvm.internal.DebugProbesKt;
import p010kotlin.jvm.JvmField;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\b'\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0004:\u0004+,-.B\u0005¢\u0006\u0002\u0010\u0005J0\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f2\u0012\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u0007H\u0002J\u0017\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00028\u0001H\u0010¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00010\u000f2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00010\u000f2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u001cJ*\u0010\u001a\u001a\u00020\u001d2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\fH&J%\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000f2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u001cJ*\u0010\u001f\u001a\u00020\u001d2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\fH&J%\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00010\u000f2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000!H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\"J*\u0010 \u001a\u00020\u001d2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000!2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010#H&J0\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H%0\u0000\"\b\b\u0002\u0010%*\u00020\u00022\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u0002H%0'J0\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H%0\u0000\"\b\b\u0002\u0010%*\u00020\u00022\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u0002H%0(J<\u0010)\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H%0\u0000\"\b\b\u0002\u0010%*\u00020\u00022\u001e\u0010&\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010*\u0012\n\u0012\b\u0012\u0004\u0012\u0002H%0*0'J<\u0010)\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H%0\u0000\"\b\b\u0002\u0010%*\u00020\u00022\u001e\u0010&\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010*\u0012\n\u0012\b\u0012\u0004\u0012\u0002H%0*0(R\u001a\u0010\u0006\u001a\u00020\u0007X\u0090D¢\u0006\u000e\n\u0000\u0012\u0004\b\b\u0010\u0005\u001a\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006/"}, d2 = {"Landroidx/paging/PageKeyedDataSource;", "Key", "", "Value", "Landroidx/paging/DataSource;", "()V", "supportsPageDropping", "", "getSupportsPageDropping$paging_common$annotations", "getSupportsPageDropping$paging_common", "()Z", "continuationAsCallback", "Landroidx/paging/PageKeyedDataSource$LoadCallback;", "continuation", "Lkotlinx/coroutines/CancellableContinuation;", "Landroidx/paging/DataSource$BaseResult;", "isAppend", "getKeyInternal", "item", "getKeyInternal$paging_common", "(Ljava/lang/Object;)Ljava/lang/Object;", "load", "params", "Landroidx/paging/DataSource$Params;", "load$paging_common", "(Landroidx/paging/DataSource$Params;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadAfter", "Landroidx/paging/PageKeyedDataSource$LoadParams;", "(Landroidx/paging/PageKeyedDataSource$LoadParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "callback", "loadBefore", "loadInitial", "Landroidx/paging/PageKeyedDataSource$LoadInitialParams;", "(Landroidx/paging/PageKeyedDataSource$LoadInitialParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/paging/PageKeyedDataSource$LoadInitialCallback;", "map", "ToValue", "function", "Lkotlin/Function1;", "Landroidx/arch/core/util/Function;", "mapByPage", "", "LoadCallback", "LoadInitialCallback", "LoadInitialParams", "LoadParams", "paging-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Deprecated(message = "PageKeyedDataSource is deprecated and has been replaced by PagingSource", replaceWith = @ReplaceWith(expression = "PagingSource<Key, Value>", imports = {"androidx.paging.PagingSource"}))
@SourceDebugExtension({"SMAP\nPageKeyedDataSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PageKeyedDataSource.kt\nandroidx/paging/PageKeyedDataSource\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,350:1\n314#2,11:351\n314#2,11:362\n314#2,11:373\n1549#3:384\n1620#3,3:385\n1549#3:388\n1620#3,3:389\n*S KotlinDebug\n*F\n+ 1 PageKeyedDataSource.kt\nandroidx/paging/PageKeyedDataSource\n*L\n202#1:351,11\n236#1:362,11\n241#1:373,11\n344#1:384\n344#1:385,3\n349#1:388\n349#1:389,3\n*E\n"})
public abstract class PageKeyedDataSource<Key, Value> extends DataSource<Key, Value> {
    private final boolean supportsPageDropping;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\b&\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J%\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00030\b2\b\u0010\t\u001a\u0004\u0018\u00018\u0002H&¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/paging/PageKeyedDataSource$LoadCallback;", "Key", "Value", "", "()V", "onResult", "", "data", "", "adjacentPageKey", "(Ljava/util/List;Ljava/lang/Object;)V", "paging-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class LoadCallback<Key, Value> {
        public abstract void onResult(@NotNull List<? extends Value> data, @Nullable Key adjacentPageKey);
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\b&\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J/\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00030\b2\b\u0010\t\u001a\u0004\u0018\u00018\u00022\b\u0010\n\u001a\u0004\u0018\u00018\u0002H&¢\u0006\u0002\u0010\u000bJ?\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00030\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\t\u001a\u0004\u0018\u00018\u00022\b\u0010\n\u001a\u0004\u0018\u00018\u0002H&¢\u0006\u0002\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroidx/paging/PageKeyedDataSource$LoadInitialCallback;", "Key", "Value", "", "()V", "onResult", "", "data", "", "previousPageKey", "nextPageKey", "(Ljava/util/List;Ljava/lang/Object;Ljava/lang/Object;)V", "position", "", "totalCount", "(Ljava/util/List;IILjava/lang/Object;Ljava/lang/Object;)V", "paging-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class LoadInitialCallback<Key, Value> {
        public abstract void onResult(@NotNull List<? extends Value> data, int position, int totalCount, @Nullable Key previousPageKey, @Nullable Key nextPageKey);

        public abstract void onResult(@NotNull List<? extends Value> data, @Nullable Key previousPageKey, @Nullable Key nextPageKey);
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0016\u0018\u0000*\b\b\u0002\u0010\u0001*\u00020\u00022\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u0010\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Landroidx/paging/PageKeyedDataSource$LoadInitialParams;", "Key", "", "requestedLoadSize", "", "placeholdersEnabled", "", "(IZ)V", "paging-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class LoadInitialParams<Key> {

        @JvmField
        public final boolean placeholdersEnabled;

        @JvmField
        public final int requestedLoadSize;

        public LoadInitialParams(int i, boolean z) {
            this.requestedLoadSize = i;
            this.placeholdersEnabled = z;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0016\u0018\u0000*\b\b\u0002\u0010\u0001*\u00020\u00022\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00028\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0012\u0010\u0003\u001a\u00028\u00028\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0007R\u0010\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Landroidx/paging/PageKeyedDataSource$LoadParams;", "Key", "", "key", "requestedLoadSize", "", "(Ljava/lang/Object;I)V", "Ljava/lang/Object;", "paging-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class LoadParams<Key> {

        @JvmField
        @NotNull
        public final Key key;

        @JvmField
        public final int requestedLoadSize;

        public LoadParams(@NotNull Key key, int i) {
            Intrinsics.checkNotNullParameter(key, "key");
            this.key = key;
            this.requestedLoadSize = i;
        }
    }

    public PageKeyedDataSource() {
        super(DataSource.KeyType.PAGE_KEYED);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LoadCallback<Key, Value> continuationAsCallback(final CancellableContinuation<? super DataSource.BaseResult<Value>> continuation, final boolean isAppend) {
        return new LoadCallback<Key, Value>() { // from class: androidx.paging.PageKeyedDataSource.continuationAsCallback.1
            @Override // androidx.paging.PageKeyedDataSource.LoadCallback
            public void onResult(@NotNull List<? extends Value> data, @Nullable Key adjacentPageKey) {
                Intrinsics.checkNotNullParameter(data, "data");
                CancellableContinuation<DataSource.BaseResult<Value>> cancellableContinuation = continuation;
                Result.Companion companion = Result.INSTANCE;
                boolean z = isAppend;
                cancellableContinuation.resumeWith(Result.m5287constructorimpl(new DataSource.BaseResult(data, z ? null : adjacentPageKey, z ? adjacentPageKey : null, 0, 0, 24, null)));
            }
        };
    }

    public static /* synthetic */ void getSupportsPageDropping$paging_common$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object loadAfter(LoadParams<Key> loadParams, Continuation<? super DataSource.BaseResult<Value>> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        loadAfter(loadParams, continuationAsCallback(cancellableContinuationImpl, true));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object loadBefore(LoadParams<Key> loadParams, Continuation<? super DataSource.BaseResult<Value>> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        loadBefore(loadParams, continuationAsCallback(cancellableContinuationImpl, false));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object loadInitial(LoadInitialParams<Key> loadInitialParams, Continuation<? super DataSource.BaseResult<Value>> continuation) {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        loadInitial(loadInitialParams, new LoadInitialCallback<Key, Value>() { // from class: androidx.paging.PageKeyedDataSource$loadInitial$2$1
            @Override // androidx.paging.PageKeyedDataSource.LoadInitialCallback
            public void onResult(@NotNull List<? extends Value> data, int position, int totalCount, @Nullable Key previousPageKey, @Nullable Key nextPageKey) {
                Intrinsics.checkNotNullParameter(data, "data");
                CancellableContinuation<DataSource.BaseResult<Value>> cancellableContinuation = cancellableContinuationImpl;
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuation.resumeWith(Result.m5287constructorimpl(new DataSource.BaseResult(data, previousPageKey, nextPageKey, position, (totalCount - data.size()) - position)));
            }

            @Override // androidx.paging.PageKeyedDataSource.LoadInitialCallback
            public void onResult(@NotNull List<? extends Value> data, @Nullable Key previousPageKey, @Nullable Key nextPageKey) {
                Intrinsics.checkNotNullParameter(data, "data");
                CancellableContinuation<DataSource.BaseResult<Value>> cancellableContinuation = cancellableContinuationImpl;
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuation.resumeWith(Result.m5287constructorimpl(new DataSource.BaseResult(data, previousPageKey, nextPageKey, 0, 0, 24, null)));
            }
        });
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List map$lambda$5(Function function, List list) {
        Intrinsics.checkNotNullParameter(function, "$function");
        Intrinsics.checkNotNullExpressionValue(list, "list");
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(function.apply(it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List map$lambda$6(Function1 function, List list) {
        Intrinsics.checkNotNullParameter(function, "$function");
        Intrinsics.checkNotNullExpressionValue(list, "list");
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(function.invoke(it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List mapByPage$lambda$3(Function1 function, List it) {
        Intrinsics.checkNotNullParameter(function, "$function");
        Intrinsics.checkNotNullExpressionValue(it, "it");
        return (List) function.invoke(it);
    }

    @Override // androidx.paging.DataSource
    @NotNull
    public Key getKeyInternal$paging_common(@NotNull Value item) {
        Intrinsics.checkNotNullParameter(item, "item");
        throw new IllegalStateException("Cannot get key by item in pageKeyedDataSource");
    }

    @Override // androidx.paging.DataSource
    /* JADX INFO: renamed from: getSupportsPageDropping$paging_common, reason: from getter */
    public boolean getSupportsPageDropping() {
        return this.supportsPageDropping;
    }

    @Override // androidx.paging.DataSource
    @Nullable
    public final Object load$paging_common(@NotNull DataSource.Params<Key> params, @NotNull Continuation<? super DataSource.BaseResult<Value>> continuation) {
        if (params.getType() == LoadType.REFRESH) {
            return loadInitial(new LoadInitialParams<>(params.getInitialLoadSize(), params.getPlaceholdersEnabled()), continuation);
        }
        if (params.getKey() == null) {
            return DataSource.BaseResult.INSTANCE.empty$paging_common();
        }
        if (params.getType() == LoadType.PREPEND) {
            return loadBefore(new LoadParams<>(params.getKey(), params.getPageSize()), continuation);
        }
        if (params.getType() == LoadType.APPEND) {
            return loadAfter(new LoadParams<>(params.getKey(), params.getPageSize()), continuation);
        }
        throw new IllegalArgumentException("Unsupported type " + params.getType());
    }

    public abstract void loadAfter(@NotNull LoadParams<Key> params, @NotNull LoadCallback<Key, Value> callback);

    public abstract void loadBefore(@NotNull LoadParams<Key> params, @NotNull LoadCallback<Key, Value> callback);

    public abstract void loadInitial(@NotNull LoadInitialParams<Key> params, @NotNull LoadInitialCallback<Key, Value> callback);

    @Override // androidx.paging.DataSource
    @NotNull
    public final <ToValue> PageKeyedDataSource<Key, ToValue> map(@NotNull final Function<Value, ToValue> function) {
        Intrinsics.checkNotNullParameter(function, "function");
        return mapByPage((Function) new Function() { // from class: com.oplus.aiunit.vision.d4e
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return PageKeyedDataSource.map$lambda$5(function, (List) obj);
            }
        });
    }

    @Override // androidx.paging.DataSource
    @NotNull
    public final <ToValue> PageKeyedDataSource<Key, ToValue> mapByPage(@NotNull Function<List<Value>, List<ToValue>> function) {
        Intrinsics.checkNotNullParameter(function, "function");
        return new WrapperPageKeyedDataSource(this, function);
    }

    @Override // androidx.paging.DataSource
    @NotNull
    public final <ToValue> PageKeyedDataSource<Key, ToValue> map(@NotNull final Function1<? super Value, ? extends ToValue> function) {
        Intrinsics.checkNotNullParameter(function, "function");
        return mapByPage((Function) new Function() { // from class: com.oplus.aiunit.vision.c4e
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return PageKeyedDataSource.map$lambda$6(function, (List) obj);
            }
        });
    }

    @Override // androidx.paging.DataSource
    @NotNull
    public final <ToValue> PageKeyedDataSource<Key, ToValue> mapByPage(@NotNull final Function1<? super List<? extends Value>, ? extends List<? extends ToValue>> function) {
        Intrinsics.checkNotNullParameter(function, "function");
        return mapByPage((Function) new Function() { // from class: com.oplus.aiunit.vision.b4e
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return PageKeyedDataSource.mapByPage$lambda$3(function, (List) obj);
            }
        });
    }
}
