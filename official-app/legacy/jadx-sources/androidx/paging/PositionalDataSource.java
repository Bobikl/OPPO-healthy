package androidx.paging;

import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import androidx.arch.core.util.Function;
import androidx.exifinterface.media.ExifInterface;
import androidx.paging.PositionalDataSource;
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
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\b'\u0018\u0000 '*\b\b\u0000\u0010\u0001*\u00020\u00022\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u0002H\u00010\u0003:\u0005'()*+B\u0005¢\u0006\u0002\u0010\u0005J\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0012H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00102\u0006\u0010\u0011\u001a\u00020\u0016H\u0081@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u001e\u0010\u0015\u001a\u00020\u00192\u0006\u0010\u0011\u001a\u00020\u00162\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bH'J\u001f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u00102\u0006\u0010\u0011\u001a\u00020\u001dH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u001eJ\u001e\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0011\u001a\u00020\u001d2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u001fH'J*\u0010 \u001a\b\u0012\u0004\u0012\u0002H!0\u0000\"\b\b\u0001\u0010!*\u00020\u00022\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H!0#J*\u0010 \u001a\b\u0012\u0004\u0012\u0002H!0\u0000\"\b\b\u0001\u0010!*\u00020\u00022\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H!0$J6\u0010%\u001a\b\u0012\u0004\u0012\u0002H!0\u0000\"\b\b\u0001\u0010!*\u00020\u00022\u001e\u0010\"\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000&\u0012\n\u0012\b\u0012\u0004\u0012\u0002H!0&0#J6\u0010%\u001a\b\u0012\u0004\u0012\u0002H!0\u0000\"\b\b\u0001\u0010!*\u00020\u00022\u001e\u0010\"\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000&\u0012\n\u0012\b\u0012\u0004\u0012\u0002H!0&0$R\u001a\u0010\u0006\u001a\u00020\u0007X\u0090D¢\u0006\u000e\n\u0000\u0012\u0004\b\b\u0010\u0005\u001a\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006,"}, d2 = {"Landroidx/paging/PositionalDataSource;", ExifInterface.GPS_DIRECTION_TRUE, "", "Landroidx/paging/DataSource;", "", "()V", "isContiguous", "", "isContiguous$paging_common$annotations", "isContiguous$paging_common", "()Z", "getKeyInternal", "item", "getKeyInternal$paging_common", "(Ljava/lang/Object;)Ljava/lang/Integer;", "load", "Landroidx/paging/DataSource$BaseResult;", "params", "Landroidx/paging/DataSource$Params;", "load$paging_common", "(Landroidx/paging/DataSource$Params;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadInitial", "Landroidx/paging/PositionalDataSource$LoadInitialParams;", "loadInitial$paging_common", "(Landroidx/paging/PositionalDataSource$LoadInitialParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "callback", "Landroidx/paging/PositionalDataSource$LoadInitialCallback;", "loadRange", "Landroidx/paging/PositionalDataSource$LoadRangeParams;", "(Landroidx/paging/PositionalDataSource$LoadRangeParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/paging/PositionalDataSource$LoadRangeCallback;", "map", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "function", "Lkotlin/Function1;", "Landroidx/arch/core/util/Function;", "mapByPage", "", "Companion", "LoadInitialCallback", "LoadInitialParams", "LoadRangeCallback", "LoadRangeParams", "paging-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Deprecated(message = "PositionalDataSource is deprecated and has been replaced by PagingSource", replaceWith = @ReplaceWith(expression = "PagingSource<Int, T>", imports = {"androidx.paging.PagingSource"}))
@SourceDebugExtension({"SMAP\nPositionalDataSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PositionalDataSource.kt\nandroidx/paging/PositionalDataSource\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,506:1\n314#2,11:507\n314#2,11:518\n1549#3:529\n1620#3,3:530\n1549#3:533\n1620#3,3:534\n*S KotlinDebug\n*F\n+ 1 PositionalDataSource.kt\nandroidx/paging/PositionalDataSource\n*L\n360#1:507,11\n428#1:518,11\n500#1:529\n500#1:530,3\n504#1:533\n504#1:534,3\n*E\n"})
public abstract class PositionalDataSource<T> extends DataSource<Integer, T> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final boolean isContiguous;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u0007J \u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0007¨\u0006\n"}, d2 = {"Landroidx/paging/PositionalDataSource$Companion;", "", "()V", "computeInitialLoadPosition", "", "params", "Landroidx/paging/PositionalDataSource$LoadInitialParams;", "totalCount", "computeInitialLoadSize", "initialLoadPosition", "paging-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final int computeInitialLoadPosition(@NotNull LoadInitialParams params, int totalCount) {
            Intrinsics.checkNotNullParameter(params, "params");
            int i = params.requestedStartPosition;
            int i2 = params.requestedLoadSize;
            int i3 = params.pageSize;
            return Math.max(0, Math.min(((((totalCount - i2) + i3) - 1) / i3) * i3, (i / i3) * i3));
        }

        @JvmStatic
        public final int computeInitialLoadSize(@NotNull LoadInitialParams params, int initialLoadPosition, int totalCount) {
            Intrinsics.checkNotNullParameter(params, "params");
            return Math.min(totalCount - initialLoadPosition, params.requestedLoadSize);
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b&\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u00072\u0006\u0010\b\u001a\u00020\tH&J&\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH&¨\u0006\u000b"}, d2 = {"Landroidx/paging/PositionalDataSource$LoadInitialCallback;", ExifInterface.GPS_DIRECTION_TRUE, "", "()V", "onResult", "", "data", "", "position", "", "totalCount", "paging-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class LoadInitialCallback<T> {
        public abstract void onResult(@NotNull List<? extends T> data, int position);

        public abstract void onResult(@NotNull List<? extends T> data, int position, int totalCount);
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u0010\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Landroidx/paging/PositionalDataSource$LoadInitialParams;", "", "requestedStartPosition", "", "requestedLoadSize", "pageSize", "placeholdersEnabled", "", "(IIIZ)V", "paging-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class LoadInitialParams {

        @JvmField
        public final int pageSize;

        @JvmField
        public final boolean placeholdersEnabled;

        @JvmField
        public final int requestedLoadSize;

        @JvmField
        public final int requestedStartPosition;

        public LoadInitialParams(int i, int i2, int i3, boolean z) {
            this.requestedStartPosition = i;
            this.requestedLoadSize = i2;
            this.pageSize = i3;
            this.placeholdersEnabled = z;
            if (!(i >= 0)) {
                throw new IllegalStateException(("invalid start position: " + i).toString());
            }
            if (!(i2 >= 0)) {
                throw new IllegalStateException(("invalid load size: " + i2).toString());
            }
            if (i3 >= 0) {
                return;
            }
            throw new IllegalStateException(("invalid page size: " + i3).toString());
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000\b&\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007H&¨\u0006\b"}, d2 = {"Landroidx/paging/PositionalDataSource$LoadRangeCallback;", ExifInterface.GPS_DIRECTION_TRUE, "", "()V", "onResult", "", "data", "", "paging-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class LoadRangeCallback<T> {
        public abstract void onResult(@NotNull List<? extends T> data);
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0010\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Landroidx/paging/PositionalDataSource$LoadRangeParams;", "", "startPosition", "", "loadSize", "(II)V", "paging-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class LoadRangeParams {

        @JvmField
        public final int loadSize;

        @JvmField
        public final int startPosition;

        public LoadRangeParams(int i, int i2) {
            this.startPosition = i;
            this.loadSize = i2;
        }
    }

    public PositionalDataSource() {
        super(DataSource.KeyType.POSITIONAL);
    }

    @JvmStatic
    public static final int computeInitialLoadPosition(@NotNull LoadInitialParams loadInitialParams, int i) {
        return INSTANCE.computeInitialLoadPosition(loadInitialParams, i);
    }

    @JvmStatic
    public static final int computeInitialLoadSize(@NotNull LoadInitialParams loadInitialParams, int i, int i2) {
        return INSTANCE.computeInitialLoadSize(loadInitialParams, i, i2);
    }

    public static /* synthetic */ void isContiguous$paging_common$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object loadRange(final LoadRangeParams loadRangeParams, Continuation<? super DataSource.BaseResult<T>> continuation) {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        loadRange(loadRangeParams, new LoadRangeCallback<T>() { // from class: androidx.paging.PositionalDataSource$loadRange$2$1
            @Override // androidx.paging.PositionalDataSource.LoadRangeCallback
            public void onResult(@NotNull List<? extends T> data) {
                Intrinsics.checkNotNullParameter(data, "data");
                int i = loadRangeParams.startPosition;
                Integer numValueOf = i == 0 ? null : Integer.valueOf(i);
                if (this.isInvalid()) {
                    CancellableContinuation<DataSource.BaseResult<T>> cancellableContinuation = cancellableContinuationImpl;
                    Result.Companion companion = Result.INSTANCE;
                    cancellableContinuation.resumeWith(Result.m5287constructorimpl(DataSource.BaseResult.INSTANCE.empty$paging_common()));
                } else {
                    CancellableContinuation<DataSource.BaseResult<T>> cancellableContinuation2 = cancellableContinuationImpl;
                    Result.Companion companion2 = Result.INSTANCE;
                    cancellableContinuation2.resumeWith(Result.m5287constructorimpl(new DataSource.BaseResult(data, numValueOf, Integer.valueOf(loadRangeParams.startPosition + data.size()), 0, 0, 24, null)));
                }
            }
        });
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List map$lambda$4(Function function, List list) {
        Intrinsics.checkNotNullParameter(function, "$function");
        Intrinsics.checkNotNullExpressionValue(list, "list");
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(function.apply(it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List map$lambda$5(Function1 function, List list) {
        Intrinsics.checkNotNullParameter(function, "$function");
        Intrinsics.checkNotNullExpressionValue(list, "list");
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(function.invoke(it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List mapByPage$lambda$2(Function1 function, List it) {
        Intrinsics.checkNotNullParameter(function, "$function");
        Intrinsics.checkNotNullExpressionValue(it, "it");
        return (List) function.invoke(it);
    }

    @Override // androidx.paging.DataSource
    /* JADX INFO: renamed from: isContiguous$paging_common, reason: from getter */
    public boolean getIsContiguous() {
        return this.isContiguous;
    }

    @Override // androidx.paging.DataSource
    @Nullable
    public final Object load$paging_common(@NotNull DataSource.Params<Integer> params, @NotNull Continuation<? super DataSource.BaseResult<T>> continuation) {
        if (params.getType() != LoadType.REFRESH) {
            Integer key = params.getKey();
            Intrinsics.checkNotNull(key);
            int iIntValue = key.intValue();
            int pageSize = params.getPageSize();
            if (params.getType() == LoadType.PREPEND) {
                pageSize = Math.min(pageSize, iIntValue);
                iIntValue -= pageSize;
            }
            return loadRange(new LoadRangeParams(iIntValue, pageSize), continuation);
        }
        int initialLoadSize = params.getInitialLoadSize();
        int iMax = 0;
        if (params.getKey() != null) {
            int iIntValue2 = params.getKey().intValue();
            if (params.getPlaceholdersEnabled()) {
                initialLoadSize = Math.max(initialLoadSize / params.getPageSize(), 2) * params.getPageSize();
                iMax = Math.max(0, ((iIntValue2 - (initialLoadSize / 2)) / params.getPageSize()) * params.getPageSize());
            } else {
                iMax = Math.max(0, iIntValue2 - (initialLoadSize / 2));
            }
        }
        return loadInitial$paging_common(new LoadInitialParams(iMax, initialLoadSize, params.getPageSize(), params.getPlaceholdersEnabled()), continuation);
    }

    @WorkerThread
    public abstract void loadInitial(@NotNull LoadInitialParams params, @NotNull LoadInitialCallback<T> callback);

    @VisibleForTesting
    @Nullable
    public final Object loadInitial$paging_common(@NotNull final LoadInitialParams loadInitialParams, @NotNull Continuation<? super DataSource.BaseResult<T>> continuation) {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        loadInitial(loadInitialParams, new LoadInitialCallback<T>(this) { // from class: androidx.paging.PositionalDataSource$loadInitial$2$1
            final /* synthetic */ PositionalDataSource<T> this$0;

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.this$0 = this;
            }

            private final void resume(PositionalDataSource.LoadInitialParams params, DataSource.BaseResult<T> result) {
                if (params.placeholdersEnabled) {
                    result.validateForInitialTiling$paging_common(params.pageSize);
                }
                cancellableContinuationImpl.resumeWith(Result.m5287constructorimpl(result));
            }

            @Override // androidx.paging.PositionalDataSource.LoadInitialCallback
            public void onResult(@NotNull List<? extends T> data, int position, int totalCount) {
                Intrinsics.checkNotNullParameter(data, "data");
                if (!this.this$0.isInvalid()) {
                    int size = data.size() + position;
                    resume(loadInitialParams, new DataSource.BaseResult<>(data, position == 0 ? null : Integer.valueOf(position), size == totalCount ? null : Integer.valueOf(size), position, (totalCount - data.size()) - position));
                } else {
                    CancellableContinuation<DataSource.BaseResult<T>> cancellableContinuation = cancellableContinuationImpl;
                    Result.Companion companion = Result.INSTANCE;
                    cancellableContinuation.resumeWith(Result.m5287constructorimpl(DataSource.BaseResult.INSTANCE.empty$paging_common()));
                }
            }

            @Override // androidx.paging.PositionalDataSource.LoadInitialCallback
            public void onResult(@NotNull List<? extends T> data, int position) {
                Intrinsics.checkNotNullParameter(data, "data");
                if (this.this$0.isInvalid()) {
                    CancellableContinuation<DataSource.BaseResult<T>> cancellableContinuation = cancellableContinuationImpl;
                    Result.Companion companion = Result.INSTANCE;
                    cancellableContinuation.resumeWith(Result.m5287constructorimpl(DataSource.BaseResult.INSTANCE.empty$paging_common()));
                    return;
                }
                resume(loadInitialParams, new DataSource.BaseResult<>(data, position == 0 ? null : Integer.valueOf(position), Integer.valueOf(data.size() + position), position, Integer.MIN_VALUE));
            }
        });
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    @WorkerThread
    public abstract void loadRange(@NotNull LoadRangeParams params, @NotNull LoadRangeCallback<T> callback);

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.paging.DataSource
    @NotNull
    public final Integer getKeyInternal$paging_common(@NotNull T item) {
        Intrinsics.checkNotNullParameter(item, "item");
        throw new IllegalStateException("Cannot get key by item in positionalDataSource");
    }

    @Override // androidx.paging.DataSource
    @NotNull
    public final <V> PositionalDataSource<V> map(@NotNull final Function<T, V> function) {
        Intrinsics.checkNotNullParameter(function, "function");
        return mapByPage((Function) new Function() { // from class: com.oplus.aiunit.vision.coe
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return PositionalDataSource.map$lambda$4(function, (List) obj);
            }
        });
    }

    @Override // androidx.paging.DataSource
    @NotNull
    public final <V> PositionalDataSource<V> mapByPage(@NotNull Function<List<T>, List<V>> function) {
        Intrinsics.checkNotNullParameter(function, "function");
        return new WrapperPositionalDataSource(this, function);
    }

    @Override // androidx.paging.DataSource
    @NotNull
    public final <V> PositionalDataSource<V> map(@NotNull final Function1<? super T, ? extends V> function) {
        Intrinsics.checkNotNullParameter(function, "function");
        return mapByPage((Function) new Function() { // from class: com.oplus.aiunit.vision.boe
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return PositionalDataSource.map$lambda$5(function, (List) obj);
            }
        });
    }

    @Override // androidx.paging.DataSource
    @NotNull
    public final <V> PositionalDataSource<V> mapByPage(@NotNull final Function1<? super List<? extends T>, ? extends List<? extends V>> function) {
        Intrinsics.checkNotNullParameter(function, "function");
        return mapByPage((Function) new Function() { // from class: com.oplus.aiunit.vision.aoe
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return PositionalDataSource.mapByPage$lambda$2(function, (List) obj);
            }
        });
    }
}
