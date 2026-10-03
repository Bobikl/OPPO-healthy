package androidx.datastore.core;

import androidx.exifinterface.media.ExifInterface;
import com.heytap.webview.extension.protocol.Const;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileLock;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.ResultKt;
import p010kotlin.Unit;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.CoroutineContext;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.coroutines.jvm.internal.Boxing;
import p010kotlin.coroutines.jvm.internal.ContinuationImpl;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;
import p010kotlin.coroutines.jvm.internal.SuspendLambda;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.functions.Function2;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.InlineMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u0000 42\u00020\u0001:\u00014B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010 \u001a\u00020\u00052\u0006\u0010!\u001a\u00020\bH\u0002J\u000e\u0010\"\u001a\u00020#H\u0096@¢\u0006\u0002\u0010$J\u000e\u0010%\u001a\u00020#H\u0096@¢\u0006\u0002\u0010$J2\u0010&\u001a\u0002H'\"\u0004\b\u0000\u0010'2\u001c\u0010(\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H'0*\u0012\u0006\u0012\u0004\u0018\u00010+0)H\u0096@¢\u0006\u0002\u0010,J8\u0010-\u001a\u0002H'\"\u0004\b\u0000\u0010'2\"\u0010(\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020/\u0012\n\u0012\b\u0012\u0004\u0012\u0002H'0*\u0012\u0006\u0012\u0004\u0018\u00010+0.H\u0096@¢\u0006\u0002\u00100J:\u00101\u001a\u0002H'\"\u0004\b\u0000\u0010'2$\b\u0004\u0010(\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u0002H'0*\u0012\u0006\u0012\u0004\u0018\u00010+0.H\u0082H¢\u0006\u0002\u00100J\f\u00102\u001a\u00020\u001d*\u00020\u0005H\u0002J\f\u00103\u001a\u00020\u001d*\u00020\u0005H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\u00020\u0005X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0012\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0013\u0010\fR\u001b\u0010\u0016\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\u001a\u0004\b\u0019\u0010\u001a*\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u00065"}, d2 = {"Landroidx/datastore/core/MultiProcessCoordinator;", "Landroidx/datastore/core/InterProcessCoordinator;", "context", "Lkotlin/coroutines/CoroutineContext;", Const.Scheme.SCHEME_FILE, "Ljava/io/File;", "(Lkotlin/coroutines/CoroutineContext;Ljava/io/File;)V", "LOCK_ERROR_MESSAGE", "", "LOCK_SUFFIX", "VERSION_SUFFIX", "getFile", "()Ljava/io/File;", "inMemoryMutex", "Lkotlinx/coroutines/sync/Mutex;", "lazySharedCounter", "Lkotlin/Lazy;", "Landroidx/datastore/core/SharedCounter;", "lockFile", "getLockFile", "lockFile$delegate", "Lkotlin/Lazy;", "sharedCounter", "getSharedCounter$delegate", "(Landroidx/datastore/core/MultiProcessCoordinator;)Ljava/lang/Object;", "getSharedCounter", "()Landroidx/datastore/core/SharedCounter;", "updateNotifications", "Lkotlinx/coroutines/flow/Flow;", "", "getUpdateNotifications", "()Lkotlinx/coroutines/flow/Flow;", "fileWithSuffix", "suffix", "getVersion", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "incrementAndGetVersion", "lock", ExifInterface.GPS_DIRECTION_TRUE, "block", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "tryLock", "Lkotlin/Function2;", "", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "withLazyCounter", "createIfNotExists", "createParentDirectories", "Companion", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMultiProcessCoordinator.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiProcessCoordinator.android.kt\nandroidx/datastore/core/MultiProcessCoordinator\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 3 MutexUtils.kt\nandroidx/datastore/core/MutexUtilsKt\n*L\n1#1,205:1\n159#1,8:226\n159#1,8:234\n120#2,10:206\n32#3,10:216\n*S KotlinDebug\n*F\n+ 1 MultiProcessCoordinator.android.kt\nandroidx/datastore/core/MultiProcessCoordinator\n*L\n99#1:226,8\n106#1:234,8\n43#1:206,10\n60#1:216,10\n*E\n"})
public final class MultiProcessCoordinator implements InterProcessCoordinator {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String DEADLOCK_ERROR_MESSAGE = "Resource deadlock would occur";
    private static final long INITIAL_WAIT_MILLIS = 10;
    private static final long MAX_WAIT_MILLIS = 60000;

    @NotNull
    private final String LOCK_ERROR_MESSAGE;

    @NotNull
    private final String LOCK_SUFFIX;

    @NotNull
    private final String VERSION_SUFFIX;

    @NotNull
    private final CoroutineContext context;

    @NotNull
    private final File file;

    @NotNull
    private final Mutex inMemoryMutex;

    @NotNull
    private final Lazy<SharedCounter> lazySharedCounter;

    /* JADX INFO: renamed from: lockFile$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy lockFile;

    @NotNull
    private final Flow<Unit> updateNotifications;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0082@¢\u0006\u0002\u0010\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Landroidx/datastore/core/MultiProcessCoordinator$Companion;", "", "()V", "DEADLOCK_ERROR_MESSAGE", "", "INITIAL_WAIT_MILLIS", "", "MAX_WAIT_MILLIS", "getExclusiveFileLockWithRetryIfDeadlock", "Ljava/nio/channels/FileLock;", "lockFileStream", "Ljava/io/FileOutputStream;", "(Ljava/io/FileOutputStream;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Can't wrap try/catch for region: R(3:33|17|18) */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x005d, code lost:
        
            r12 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x005e, code lost:
        
            r1 = r12.getMessage();
            r6 = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0063, code lost:
        
            if (r1 != null) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0070, code lost:
        
            r6 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0071, code lost:
        
            if (r6 != false) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0073, code lost:
        
            r0.L$0 = r13;
            r0.J$0 = r4;
            r0.label = 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x007d, code lost:
        
            if (kotlinx.coroutines.DelayKt.delay(r4, r0) == r14) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x007f, code lost:
        
            return r14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0083, code lost:
        
            throw r12;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x007d -> B:29:0x0080). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object getExclusiveFileLockWithRetryIfDeadlock(FileOutputStream fileOutputStream, Continuation<? super FileLock> continuation) throws IOException {
            MultiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1 multiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1;
            long j2;
            if (continuation instanceof MultiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1) {
                multiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1 = (MultiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1) continuation;
                int i = multiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    multiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1.label = i - Integer.MIN_VALUE;
                } else {
                    multiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1 = new MultiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1(this, continuation);
                }
            } else {
                multiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1 = new MultiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1(this, continuation);
            }
            Object obj = multiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1.result;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = multiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                j2 = MultiProcessCoordinator.INITIAL_WAIT_MILLIS;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j2 = multiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1.J$0;
                fileOutputStream = (FileOutputStream) multiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1.L$0;
                ResultKt.throwOnFailure(obj);
                j2 *= (long) 2;
            }
            if (j2 <= MultiProcessCoordinator.MAX_WAIT_MILLIS) {
                FileLock fileLockLock = fileOutputStream.getChannel().lock(0L, Long.MAX_VALUE, false);
                Intrinsics.checkNotNullExpressionValue(fileLockLock, "lockFileStream.getChanne…LUE, /* shared= */ false)");
                return fileLockLock;
            }
            FileLock fileLockLock2 = fileOutputStream.getChannel().lock(0L, Long.MAX_VALUE, false);
            Intrinsics.checkNotNullExpressionValue(fileLockLock2, "lockFileStream.getChanne…LUE, /* shared= */ false)");
            return fileLockLock2;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.MultiProcessCoordinator$lock$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.datastore.core.MultiProcessCoordinator", f = "MultiProcessCoordinator.android.kt", i = {0, 0, 0, 1, 1, 2, 2}, l = {211, 47, 48}, m = "lock", n = {"this", "block", "$this$withLock_u24default$iv", "block", "$this$withLock_u24default$iv", "$this$withLock_u24default$iv", "lock"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$0", "L$2"})
    public static final class AnonymousClass1<T> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MultiProcessCoordinator.this.lock(null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.MultiProcessCoordinator$tryLock$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.datastore.core.MultiProcessCoordinator", f = "MultiProcessCoordinator.android.kt", i = {0, 0, 1, 1, 1}, l = {62, 87}, m = "tryLock", n = {"$this$withTryLock_u24default$iv", "locked$iv", "$this$withTryLock_u24default$iv", "lock", "locked$iv"}, s = {"L$0", "Z$0", "L$0", "L$2", "Z$0"})
    public static final class C13781<T> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C13781(Continuation<? super C13781> continuation) {
            super(continuation);
        }

        @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MultiProcessCoordinator.this.tryLock(null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: androidx.datastore.core.MultiProcessCoordinator$withLazyCounter$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/CoroutineScope;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.datastore.core.MultiProcessCoordinator$withLazyCounter$2", f = "MultiProcessCoordinator.android.kt", i = {}, l = {163}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nMultiProcessCoordinator.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiProcessCoordinator.android.kt\nandroidx/datastore/core/MultiProcessCoordinator$withLazyCounter$2\n*L\n1#1,205:1\n*E\n"})
    public static final class AnonymousClass2<T> extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super T>, Object> {
        final /* synthetic */ Function2<SharedCounter, Continuation<? super T>, Object> $block;
        int label;
        final /* synthetic */ MultiProcessCoordinator this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(Function2<? super SharedCounter, ? super Continuation<? super T>, ? extends Object> function2, MultiProcessCoordinator multiProcessCoordinator, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$block = function2;
            this.this$0 = multiProcessCoordinator;
        }

        @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new AnonymousClass2(this.$block, this.this$0, continuation);
        }

        @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Function2<SharedCounter, Continuation<? super T>, Object> function2 = this.$block;
                SharedCounter sharedCounter = this.this$0.getSharedCounter();
                this.label = 1;
                obj = function2.invoke(sharedCounter, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }

        @Nullable
        public final Object invokeSuspend$$forInline(@NotNull Object obj) {
            return this.$block.invoke(this.this$0.getSharedCounter(), this);
        }

        @Override // p010kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super T> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public MultiProcessCoordinator(@NotNull CoroutineContext context, @NotNull File file) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(file, "file");
        this.context = context;
        this.file = file;
        this.updateNotifications = MulticastFileObserver.INSTANCE.observe(file);
        this.LOCK_SUFFIX = ".lock";
        this.VERSION_SUFFIX = ".version";
        this.LOCK_ERROR_MESSAGE = "fcntl failed: EAGAIN";
        this.inMemoryMutex = MutexKt.Mutex$default(false, 1, null);
        this.lockFile = LazyKt__LazyJVMKt.lazy(new Function0<File>() { // from class: androidx.datastore.core.MultiProcessCoordinator$lockFile$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final File invoke() throws IOException {
                MultiProcessCoordinator multiProcessCoordinator = this.this$0;
                File fileFileWithSuffix = multiProcessCoordinator.fileWithSuffix(multiProcessCoordinator.LOCK_SUFFIX);
                this.this$0.createIfNotExists(fileFileWithSuffix);
                return fileFileWithSuffix;
            }
        });
        this.lazySharedCounter = LazyKt__LazyJVMKt.lazy(new Function0<SharedCounter>() { // from class: androidx.datastore.core.MultiProcessCoordinator$lazySharedCounter$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final SharedCounter invoke() {
                SharedCounter.Companion companion = SharedCounter.INSTANCE;
                companion.loadLib();
                final MultiProcessCoordinator multiProcessCoordinator = this.this$0;
                return companion.create$datastore_core_release(new Function0<File>() { // from class: androidx.datastore.core.MultiProcessCoordinator$lazySharedCounter$1.1
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // p010kotlin.jvm.functions.Function0
                    @NotNull
                    public final File invoke() throws IOException {
                        MultiProcessCoordinator multiProcessCoordinator2 = multiProcessCoordinator;
                        File fileFileWithSuffix = multiProcessCoordinator2.fileWithSuffix(multiProcessCoordinator2.VERSION_SUFFIX);
                        multiProcessCoordinator.createIfNotExists(fileFileWithSuffix);
                        return fileFileWithSuffix;
                    }
                });
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void createIfNotExists(File file) throws IOException {
        createParentDirectories(file);
        if (file.exists()) {
            return;
        }
        file.createNewFile();
    }

    private final void createParentDirectories(File file) throws IOException {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
            if (parentFile.isDirectory()) {
                return;
            }
            throw new IOException("Unable to create parent directories of " + file);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File fileWithSuffix(String suffix) {
        return new File(this.file.getAbsolutePath() + suffix);
    }

    private final File getLockFile() {
        return (File) this.lockFile.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SharedCounter getSharedCounter() {
        return this.lazySharedCounter.getValue();
    }

    private final <T> Object withLazyCounter(Function2<? super SharedCounter, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super T> continuation) throws Throwable {
        if (this.lazySharedCounter.isInitialized()) {
            return function2.invoke(getSharedCounter(), continuation);
        }
        CoroutineContext coroutineContext = this.context;
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(function2, this, null);
        InlineMarker.mark(0);
        Object objWithContext = BuildersKt.withContext(coroutineContext, anonymousClass2, continuation);
        InlineMarker.mark(1);
        return objWithContext;
    }

    @NotNull
    public final File getFile() {
        return this.file;
    }

    @Override // androidx.datastore.core.InterProcessCoordinator
    @NotNull
    public Flow<Unit> getUpdateNotifications() {
        return this.updateNotifications;
    }

    @Override // androidx.datastore.core.InterProcessCoordinator
    @Nullable
    public Object getVersion(@NotNull Continuation<? super Integer> continuation) {
        return this.lazySharedCounter.isInitialized() ? Boxing.boxInt(getSharedCounter().getValue()) : BuildersKt.withContext(this.context, new MultiProcessCoordinator$getVersion$$inlined$withLazyCounter$1(this, null), continuation);
    }

    @Override // androidx.datastore.core.InterProcessCoordinator
    @Nullable
    public Object incrementAndGetVersion(@NotNull Continuation<? super Integer> continuation) {
        return this.lazySharedCounter.isInitialized() ? Boxing.boxInt(getSharedCounter().incrementAndGetValue()) : BuildersKt.withContext(this.context, new MultiProcessCoordinator$incrementAndGetVersion$$inlined$withLazyCounter$1(this, null), continuation);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00b4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:39:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:41:0x00bb A[Catch: all -> 0x00d9, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x00d9, blocks: (B:41:0x00bb, B:52:0x00d5, B:55:0x00dc), top: B:63:0x0024, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00d5 A[Catch: all -> 0x00d9, TRY_ENTER, TryCatch #4 {all -> 0x00d9, blocks: (B:41:0x00bb, B:52:0x00d5, B:55:0x00dc), top: B:63:0x0024, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.io.Closeable, java.lang.Object, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object>] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r2v9 */
    @Override // androidx.datastore.core.InterProcessCoordinator
    @Nullable
    public <T> Object lock(@NotNull Function1<? super Continuation<? super T>, ? extends Object> function1, @NotNull Continuation<? super T> continuation) throws Throwable {
        AnonymousClass1 anonymousClass1;
        Mutex mutex;
        ?? r10;
        FileOutputStream fileOutputStream;
        Throwable th;
        ?? r11;
        Mutex mutex2;
        ?? r2;
        java.io.Closeable closeable;
        FileLock fileLock;
        FileLock fileLock2;
        Object objInvoke;
        Mutex mutex3;
        ?? r12;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        ?? r13 = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = anonymousClass1.label;
        try {
            try {
                try {
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(r13);
                        mutex = this.inMemoryMutex;
                        anonymousClass1.L$0 = this;
                        anonymousClass1.L$1 = function1;
                        anonymousClass1.L$2 = mutex;
                        anonymousClass1.label = 1;
                        if (mutex.lock(null, anonymousClass1) == coroutine_suspended) {
                            r10 = function1;
                            return coroutine_suspended;
                        }
                    } else {
                        if (i2 != 1) {
                            if (i2 != 2) {
                                if (i2 != 3) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                fileLock = (FileLock) anonymousClass1.L$2;
                                closeable = (java.io.Closeable) anonymousClass1.L$1;
                                mutex3 = (Mutex) anonymousClass1.L$0;
                                try {
                                    ResultKt.throwOnFailure(r13);
                                    r12 = r13;
                                    if (fileLock != null) {
                                        fileLock.release();
                                    }
                                    try {
                                        p010kotlin.io.CloseableKt.closeFinally(closeable, null);
                                        mutex3.unlock(null);
                                        return r12;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        r13 = mutex3;
                                        r13.unlock(null);
                                        throw th;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    if (fileLock != null) {
                                        fileLock.release();
                                    }
                                    throw th;
                                }
                            }
                            closeable = (java.io.Closeable) anonymousClass1.L$2;
                            mutex2 = (Mutex) anonymousClass1.L$1;
                            Function1 function2 = (Function1) anonymousClass1.L$0;
                            try {
                                ResultKt.throwOnFailure(r13);
                                r2 = function2;
                                r11 = r13;
                                fileLock2 = (FileLock) r11;
                                try {
                                    anonymousClass1.L$0 = mutex2;
                                    anonymousClass1.L$1 = closeable;
                                    anonymousClass1.L$2 = fileLock2;
                                    anonymousClass1.label = 3;
                                    objInvoke = r2.invoke(anonymousClass1);
                                    if (objInvoke == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    mutex3 = mutex2;
                                    fileLock = fileLock2;
                                    r12 = objInvoke;
                                    if (fileLock != null) {
                                        fileLock.release();
                                    }
                                    p010kotlin.io.CloseableKt.closeFinally(closeable, null);
                                    mutex3.unlock(null);
                                    return r12;
                                } catch (Throwable th4) {
                                    fileLock = fileLock2;
                                    th = th4;
                                    if (fileLock != null) {
                                        fileLock.release();
                                    }
                                    throw th;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                fileLock = null;
                                if (fileLock != null) {
                                    fileLock.release();
                                }
                                throw th;
                            }
                        }
                        Mutex mutex4 = (Mutex) anonymousClass1.L$2;
                        boolean z = (Function1<? super Continuation<? super T>, ? extends Object>) ((Function1) anonymousClass1.L$1);
                        MultiProcessCoordinator multiProcessCoordinator = (MultiProcessCoordinator) anonymousClass1.L$0;
                        ResultKt.throwOnFailure(r13);
                        mutex = mutex4;
                        this = multiProcessCoordinator;
                        r10 = z;
                    }
                    Companion companion = INSTANCE;
                    anonymousClass1.L$0 = r10;
                    anonymousClass1.L$1 = mutex;
                    anonymousClass1.L$2 = fileOutputStream;
                    anonymousClass1.label = 2;
                    Object exclusiveFileLockWithRetryIfDeadlock = companion.getExclusiveFileLockWithRetryIfDeadlock(fileOutputStream, anonymousClass1);
                    if (exclusiveFileLockWithRetryIfDeadlock == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    Mutex mutex5 = mutex;
                    r11 = exclusiveFileLockWithRetryIfDeadlock;
                    mutex2 = mutex5;
                    r2 = r10;
                    closeable = fileOutputStream;
                    fileLock2 = (FileLock) r11;
                    anonymousClass1.L$0 = mutex2;
                    anonymousClass1.L$1 = closeable;
                    anonymousClass1.L$2 = fileLock2;
                    anonymousClass1.label = 3;
                    objInvoke = r2.invoke(anonymousClass1);
                    if (objInvoke == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    mutex3 = mutex2;
                    fileLock = fileLock2;
                    r12 = objInvoke;
                    if (fileLock != null) {
                        fileLock.release();
                    }
                    p010kotlin.io.CloseableKt.closeFinally(closeable, null);
                    mutex3.unlock(null);
                    return r12;
                } catch (Throwable th6) {
                    th = th6;
                    fileLock = null;
                    if (fileLock != null) {
                        fileLock.release();
                    }
                    throw th;
                }
                r10 = function1;
                fileOutputStream = new FileOutputStream(this.getLockFile());
            } catch (Throwable th7) {
                th = th7;
            }
        } catch (Throwable th8) {
            r13 = anonymousClass1;
            try {
                throw th8;
            } catch (Throwable th9) {
                p010kotlin.io.CloseableKt.closeFinally(function1, th8);
                throw th9;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x007b  */
    /* JADX WARN: Code duplicated, block: B:65:0x00eb A[Catch: all -> 0x0104, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0104, blocks: (B:65:0x00eb, B:75:0x0100, B:78:0x0108), top: B:92:0x0029, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:75:0x0100 A[Catch: all -> 0x0104, TRY_ENTER, TryCatch #2 {all -> 0x0104, blocks: (B:65:0x00eb, B:75:0x0100, B:78:0x0108), top: B:92:0x0029, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [androidx.datastore.core.MultiProcessCoordinator] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.io.Closeable, java.lang.Object] */
    @Override // androidx.datastore.core.InterProcessCoordinator
    @Nullable
    public <T> Object tryLock(@NotNull Function2<? super Boolean, ? super Continuation<? super T>, ? extends Object> function2, @NotNull Continuation<? super T> continuation) throws Throwable {
        C13781 c13781;
        FileLock fileLock;
        FileLock fileLockTryLock;
        Mutex mutex;
        java.io.Closeable closeable;
        Mutex mutex2;
        boolean z;
        ?? r1 = this;
        ?? r2 = function2;
        if (continuation instanceof C13781) {
            c13781 = (C13781) continuation;
            int i = c13781.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c13781.label = i - Integer.MIN_VALUE;
            } else {
                c13781 = new C13781(continuation);
            }
        } else {
            c13781 = new C13781(continuation);
        }
        Object objInvoke = c13781.result;
        ?? coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c13781.label;
        try {
            try {
                if (i2 == 0) {
                    ResultKt.throwOnFailure(objInvoke);
                    Mutex mutex3 = r1.inMemoryMutex;
                    boolean zTryLock = mutex3.tryLock(null);
                    try {
                        if (!zTryLock) {
                            Boolean boolBoxBoolean = Boxing.boxBoolean(false);
                            c13781.L$0 = mutex3;
                            c13781.Z$0 = zTryLock;
                            c13781.label = 1;
                            objInvoke = r2.invoke(boolBoxBoolean, c13781);
                            if (objInvoke == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            mutex2 = mutex3;
                            z = zTryLock;
                            if (z) {
                                mutex2.unlock(null);
                            }
                            return objInvoke;
                        }
                        FileInputStream fileInputStream = new FileInputStream(getLockFile());
                        try {
                            try {
                                fileLockTryLock = fileInputStream.getChannel().tryLock(0L, Long.MAX_VALUE, true);
                            } catch (IOException e2) {
                                String message = e2.getMessage();
                                if (!(message != null && StringsKt__StringsJVMKt.startsWith$default(message, r1.LOCK_ERROR_MESSAGE, false, 2, null))) {
                                    String message2 = e2.getMessage();
                                    if (!(message2 != null && StringsKt__StringsJVMKt.startsWith$default(message2, DEADLOCK_ERROR_MESSAGE, false, 2, null))) {
                                        throw e2;
                                    }
                                    if (fileLock != null) {
                                        fileLock.release();
                                    }
                                    throw th;
                                }
                                fileLockTryLock = null;
                            }
                            try {
                                Boolean boolBoxBoolean2 = Boxing.boxBoolean(fileLockTryLock != null);
                                c13781.L$0 = mutex3;
                                c13781.L$1 = fileInputStream;
                                c13781.L$2 = fileLockTryLock;
                                c13781.Z$0 = zTryLock;
                                c13781.label = 2;
                                objInvoke = r2.invoke(boolBoxBoolean2, c13781);
                                if (objInvoke == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                fileLock = fileLockTryLock;
                                mutex = mutex3;
                                r1 = zTryLock;
                                closeable = fileInputStream;
                                if (fileLock != null) {
                                    fileLock.release();
                                }
                                p010kotlin.io.CloseableKt.closeFinally(closeable, null);
                                if (r1 != 0) {
                                    mutex.unlock(null);
                                }
                                return objInvoke;
                            } catch (Throwable th) {
                                th = th;
                                fileLock = fileLockTryLock;
                                if (fileLock != null) {
                                    fileLock.release();
                                }
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            fileLock = null;
                            if (fileLock != null) {
                                fileLock.release();
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        r2 = mutex3;
                        r1 = zTryLock;
                    }
                } else {
                    if (i2 == 1) {
                        z = c13781.Z$0;
                        mutex2 = (Mutex) c13781.L$0;
                        ResultKt.throwOnFailure(objInvoke);
                        if (z) {
                            mutex2.unlock(null);
                        }
                        return objInvoke;
                    }
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    boolean z2 = c13781.Z$0;
                    fileLock = (FileLock) c13781.L$2;
                    closeable = (java.io.Closeable) c13781.L$1;
                    mutex = (Mutex) c13781.L$0;
                    try {
                        ResultKt.throwOnFailure(objInvoke);
                        r1 = z2;
                        if (fileLock != null) {
                            fileLock.release();
                        }
                        try {
                            p010kotlin.io.CloseableKt.closeFinally(closeable, null);
                            if (r1 != 0) {
                                mutex.unlock(null);
                            }
                            return objInvoke;
                        } catch (Throwable th4) {
                            th = th4;
                            r2 = mutex;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        if (fileLock != null) {
                            fileLock.release();
                        }
                        throw th;
                    }
                }
            } catch (Throwable th6) {
                r2 = c13781;
                try {
                    throw th6;
                } catch (Throwable th7) {
                    p010kotlin.io.CloseableKt.closeFinally(coroutine_suspended, th6);
                    throw th7;
                }
            }
        } catch (Throwable th8) {
            th = th8;
        }
        if (r1 != 0) {
            r2.unlock(null);
        }
        throw th;
    }
}
