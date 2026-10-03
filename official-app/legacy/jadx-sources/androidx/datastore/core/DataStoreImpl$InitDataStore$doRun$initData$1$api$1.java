package androidx.datastore.core;

import kotlinx.coroutines.sync.Mutex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.ResultKt;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.jvm.functions.Function2;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.Ref;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001JA\u0010\u0002\u001a\u00028\u000021\u0010\u0003\u001a-\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0004H\u0096@¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"androidx/datastore/core/DataStoreImpl$InitDataStore$doRun$initData$1$api$1", "Landroidx/datastore/core/InitializerApi;", "updateData", "transform", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "t", "Lkotlin/coroutines/Continuation;", "", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDataStoreImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DataStoreImpl.kt\nandroidx/datastore/core/DataStoreImpl$InitDataStore$doRun$initData$1$api$1\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,538:1\n120#2,10:539\n*S KotlinDebug\n*F\n+ 1 DataStoreImpl.kt\nandroidx/datastore/core/DataStoreImpl$InitDataStore$doRun$initData$1$api$1\n*L\n441#1:539,10\n*E\n"})
public final class DataStoreImpl$InitDataStore$doRun$initData$1$api$1<T> implements InitializerApi<T> {
    final /* synthetic */ Ref.ObjectRef<T> $currentData;
    final /* synthetic */ Ref.BooleanRef $initializationComplete;
    final /* synthetic */ Mutex $updateLock;
    final /* synthetic */ DataStoreImpl<T> this$0;

    public DataStoreImpl$InitDataStore$doRun$initData$1$api$1(Mutex mutex, Ref.BooleanRef booleanRef, Ref.ObjectRef<T> objectRef, DataStoreImpl<T> dataStoreImpl) {
        this.$updateLock = mutex;
        this.$initializationComplete = booleanRef;
        this.$currentData = objectRef;
        this.this$0 = dataStoreImpl;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00b8 A[Catch: all -> 0x0056, TRY_LEAVE, TryCatch #1 {all -> 0x0056, blocks: (B:21:0x0052, B:35:0x00b0, B:37:0x00b8), top: B:53:0x0052 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00c7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:40:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:42:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.datastore.core.InitializerApi
    @Nullable
    public Object updateData(@NotNull Function2<? super T, ? super Continuation<? super T>, ? extends Object> function2, @NotNull Continuation<? super T> continuation) throws Throwable {
        DataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1 dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1;
        Mutex mutex;
        Ref.BooleanRef booleanRef;
        Ref.ObjectRef<T> objectRef;
        DataStoreImpl dataStoreImpl;
        DataStoreImpl dataStoreImpl2;
        Mutex mutex2;
        Mutex mutex3;
        Ref.ObjectRef<T> objectRef2;
        DataStoreImpl dataStoreImpl3;
        T t;
        if (continuation instanceof DataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1) {
            dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1 = (DataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1) continuation;
            int i = dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.label = i - Integer.MIN_VALUE;
            } else {
                dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1 = new DataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1(this, continuation);
            }
        } else {
            dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1 = new DataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1(this, continuation);
        }
        Object obj = dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                mutex = this.$updateLock;
                booleanRef = this.$initializationComplete;
                objectRef = this.$currentData;
                dataStoreImpl = (DataStoreImpl<T>) this.this$0;
                dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$0 = function2;
                dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$1 = mutex;
                dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$2 = booleanRef;
                dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$3 = objectRef;
                dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$4 = dataStoreImpl;
                dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.label = 1;
                if (mutex.lock(null, dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1) == coroutine_suspended) {
                    dataStoreImpl2 = dataStoreImpl;
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        t = (T) dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$2;
                        objectRef2 = (Ref.ObjectRef) dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$1;
                        mutex2 = (Mutex) dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$0;
                        try {
                            ResultKt.throwOnFailure(obj);
                            objectRef2.element = t;
                            T t2 = objectRef2.element;
                            mutex2.unlock(null);
                            return t2;
                        } catch (Throwable th) {
                            th = th;
                            mutex2.unlock(null);
                            throw th;
                        }
                    }
                    DataStoreImpl dataStoreImpl4 = (DataStoreImpl) dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$2;
                    objectRef2 = (Ref.ObjectRef) dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$1;
                    mutex3 = (Mutex) dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        dataStoreImpl3 = dataStoreImpl4;
                        if (Intrinsics.areEqual(obj, objectRef2.element)) {
                            mutex2 = mutex3;
                        } else {
                            dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$0 = mutex3;
                            dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$1 = objectRef2;
                            dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$2 = obj;
                            dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.label = 3;
                            if (dataStoreImpl3.writeData$datastore_core_release(obj, false, dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            t = (T) obj;
                            mutex2 = mutex3;
                            objectRef2.element = t;
                        }
                        T t3 = objectRef2.element;
                        mutex2.unlock(null);
                        return t3;
                    } catch (Throwable th2) {
                        th = th2;
                        mutex2 = mutex3;
                        mutex2.unlock(null);
                        throw th;
                    }
                }
                DataStoreImpl dataStoreImpl5 = (DataStoreImpl<T>) ((DataStoreImpl) dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$4);
                Ref.ObjectRef<T> objectRef3 = (Ref.ObjectRef) dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$3;
                booleanRef = (Ref.BooleanRef) dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$2;
                Mutex mutex4 = (Mutex) dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$1;
                Function2<? super T, ? super Continuation<? super T>, ? extends Object> function3 = (Function2) dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$0;
                ResultKt.throwOnFailure(obj);
                mutex = mutex4;
                objectRef = objectRef3;
                function2 = function3;
                dataStoreImpl2 = dataStoreImpl5;
            }
            dataStoreImpl2 = dataStoreImpl;
            if (!(!booleanRef.element)) {
                throw new IllegalStateException("InitializerApi.updateData should not be called after initialization is complete.".toString());
            }
            T t4 = objectRef.element;
            dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$0 = mutex;
            dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$1 = objectRef;
            dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$2 = dataStoreImpl2;
            dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$3 = null;
            dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$4 = null;
            dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.label = 2;
            Object objInvoke = function2.invoke(t4, dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1);
            if (objInvoke == coroutine_suspended) {
                return coroutine_suspended;
            }
            mutex3 = mutex;
            obj = objInvoke;
            objectRef2 = objectRef;
            dataStoreImpl3 = dataStoreImpl2;
            if (Intrinsics.areEqual(obj, objectRef2.element)) {
                dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$0 = mutex3;
                dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$1 = objectRef2;
                dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$2 = obj;
                dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.label = 3;
                if (dataStoreImpl3.writeData$datastore_core_release(obj, false, dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                t = (T) obj;
                mutex2 = mutex3;
                objectRef2.element = t;
            } else {
                mutex2 = mutex3;
            }
            T t5 = objectRef2.element;
            mutex2.unlock(null);
            return t5;
        } catch (Throwable th3) {
            th = th3;
            mutex2 = mutex;
            mutex2.unlock(null);
            throw th;
        }
    }
}
