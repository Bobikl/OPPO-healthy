package com.oplus.aiunit.vision;

import androidx.exifinterface.media.ExifInterface;
import com.oplus.deepthinker.sdk.app.aidl.eventfountain.EventType;
import com.oplus.smartenginehelper.ParserTag;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \u001a*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0013¢\u0006\u0004\b\u0018\u0010\u0019J\"\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003H\u0016J\"\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003H\u0016J\"\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003H\u0016J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0016R&\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0011R\u0017\u0010\u0017\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\f\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001b"}, d2 = {"Lcom/oplus/aiunit/vision/mik;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/oplus/aiunit/vision/t89;", "Lkotlin/Function0;", "", "queryAction", "Lcom/oplus/aiunit/vision/xz4;", "d", "requestAction", "Lcom/oplus/aiunit/vision/kqf;", "c", "Lcom/oplus/aiunit/vision/qre;", "b", "Lcom/oplus/aiunit/vision/bsb;", "a", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Ljava/util/concurrent/ConcurrentHashMap;", "cacheSource", "Ljava/util/concurrent/ExecutorService;", "Ljava/util/concurrent/ExecutorService;", "getExecutor", "()Ljava/util/concurrent/ExecutorService;", "executor", "<init>", "(Ljava/util/concurrent/ExecutorService;)V", "Companion", "com.heytap.nearx.httpdns"}, k = 1, mv = {1, 4, 0})
public final class mik<T> implements t89<T> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final ConcurrentHashMap<String, List<T>> cacheSource;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final ExecutorService executor;

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.mik$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005\"\u0004\b\u0001\u0010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0003R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/oplus/aiunit/vision/mik$a;", "", ExifInterface.GPS_DIRECTION_TRUE, "Ljava/util/concurrent/ExecutorService;", "executor", "Lcom/oplus/aiunit/vision/t89;", "a", "", "THREAD_NUM", "I", "<init>", "()V", "com.heytap.nearx.httpdns"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ t89 b(Companion companion, ExecutorService executorService, int i, Object obj) {
            if ((i & 1) != 0) {
                executorService = Executors.newFixedThreadPool(5);
                Intrinsics.checkNotNullExpressionValue(executorService, "Executors.newFixedThreadPool(THREAD_NUM)");
            }
            return companion.a(executorService);
        }

        @NotNull
        public final <T> t89<T> a(@NotNull ExecutorService executor) {
            Intrinsics.checkNotNullParameter(executor, "executor");
            return new mik(executor, null);
        }
    }

    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016¨\u0006\f"}, d2 = {"com/oplus/aiunit/vision/mik$b", "Lcom/oplus/aiunit/vision/bsb;", "", "key", "", EventType.STATE_PACKAGE_CHANGED_REMOVE, "", "b", "", ParserTag.TAG_GET, "data", "a", "com.heytap.nearx.httpdns"}, k = 1, mv = {1, 4, 0})
    public static final class b implements bsb<T> {
        public b() {
        }

        @Override // com.oplus.aiunit.vision.bsb
        public void a(@NotNull String key, @NotNull List<? extends T> data) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(data, "data");
            mik.this.cacheSource.put(key, data);
        }

        @Override // com.oplus.aiunit.vision.bsb
        public boolean b(@NotNull String key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return mik.this.cacheSource.containsKey(key);
        }

        @Override // com.oplus.aiunit.vision.bsb
        @NotNull
        public List<T> get(@NotNull String key) {
            Intrinsics.checkNotNullParameter(key, "key");
            List<T> list = (List) mik.this.cacheSource.get(key);
            return list != null ? list : CollectionsKt__CollectionsKt.emptyList();
        }

        @Override // com.oplus.aiunit.vision.bsb
        public void remove(@NotNull String key) {
            Intrinsics.checkNotNullParameter(key, "key");
            mik.this.cacheSource.remove(key);
        }
    }

    public mik(ExecutorService executorService) {
        this.executor = executorService;
        this.cacheSource = new ConcurrentHashMap<>();
    }

    @Override // com.oplus.aiunit.vision.t89
    @NotNull
    public bsb<T> a() {
        return new b();
    }

    @Override // com.oplus.aiunit.vision.t89
    @NotNull
    public qre<T> b(@NotNull Function0<? extends List<? extends T>> queryAction) {
        Intrinsics.checkNotNullParameter(queryAction, "queryAction");
        return new rre(a(), queryAction, this.executor);
    }

    @Override // com.oplus.aiunit.vision.t89
    @NotNull
    public kqf<T> c(@NotNull Function0<? extends List<? extends T>> requestAction) {
        Intrinsics.checkNotNullParameter(requestAction, "requestAction");
        return new lqf(a(), requestAction, this.executor);
    }

    @Override // com.oplus.aiunit.vision.t89
    @NotNull
    public xz4<T> d(@NotNull Function0<? extends List<? extends T>> queryAction) {
        Intrinsics.checkNotNullParameter(queryAction, "queryAction");
        return new yz4(a(), queryAction, this.executor);
    }

    public /* synthetic */ mik(ExecutorService executorService, DefaultConstructorMarker defaultConstructorMarker) {
        this(executorService);
    }
}
