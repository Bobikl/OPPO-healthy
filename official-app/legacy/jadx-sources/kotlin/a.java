package kotlin;

import com.oplus.aiunit.vision.b2n;
import com.oplus.cardwidget.util.Logger;
import io.protostuff.MapSchema;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import n.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes10.dex */
@p010kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J$\u0010\t\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u0016\u0010\f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\r\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002J&\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002R \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R&\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0011R&\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0011¨\u0006\u0017"}, d2 = {"Lj/a;", "", "", "widgetCode", "Lj/b;", "updateAction", "Lkotlin/Function0;", "", "run", b2n.g, "Ljava/util/concurrent/ExecutorService;", "task", MapSchema.FIELD_NAME_ENTRY, "c", "d", "Ljava/util/concurrent/ConcurrentHashMap;", "b", "Ljava/util/concurrent/ConcurrentHashMap;", "cardDataTasks", "cardLayoutUpdateRunnableCache", "cardDataUpdateRunnableCache", "<init>", "()V", "com.oplus.card.widget.cardwidget"}, k = 1, mv = {1, 8, 0})
public final class a {

    @NotNull
    public static final a a = new a();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final ConcurrentHashMap<String, ExecutorService> cardDataTasks = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ConcurrentHashMap<String, p010kotlin.jvm.functions.Function0<p010kotlin.Unit>> cardLayoutUpdateRunnableCache = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static final ConcurrentHashMap<String, p010kotlin.jvm.functions.Function0<p010kotlin.Unit>> cardDataUpdateRunnableCache = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: j.a$a, reason: collision with other inner class name */
    @p010kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class C1031a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.UPDATE_LAYOUT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.UPDATE_DATA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    /* JADX INFO: renamed from: j.a$b, reason: from Kotlin metadata */
    @p010kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/Function0;", "", "a", "()Lkotlin/jvm/functions/Function0;"}, k = 3, mv = {1, 8, 0})
    public static final class Function0 extends Lambda implements p010kotlin.jvm.functions.Function0<p010kotlin.jvm.functions.Function0<? extends p010kotlin.Unit>> {
        final /* synthetic */ p010kotlin.jvm.functions.Function0<p010kotlin.Unit> a;
        final /* synthetic */ b b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f20667c;

        /* JADX INFO: renamed from: j.a$b$a, reason: collision with other inner class name */
        @p010kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public /* synthetic */ class C1032a {
            public static final /* synthetic */ int[] a;

            static {
                int[] iArr = new int[b.values().length];
                try {
                    iArr[b.UPDATE_LAYOUT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[b.UPDATE_DATA.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Function0(p010kotlin.jvm.functions.Function0<p010kotlin.Unit> function0, b bVar, String str) {
            super(0);
            this.a = function0;
            this.b = bVar;
            this.f20667c = str;
        }

        @Override // p010kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p010kotlin.jvm.functions.Function0<p010kotlin.Unit> invoke() {
            ConcurrentHashMap concurrentHashMap;
            this.a.invoke();
            int i = C1032a.a[this.b.ordinal()];
            if (i == 1) {
                concurrentHashMap = a.cardLayoutUpdateRunnableCache;
            } else {
                if (i != 2) {
                    throw new p010kotlin.NoWhenBranchMatchedException();
                }
                concurrentHashMap = a.cardDataUpdateRunnableCache;
            }
            return (p010kotlin.jvm.functions.Function0) concurrentHashMap.remove(this.f20667c);
        }
    }

    public static final void f(String widgetCode, p010kotlin.jvm.functions.Function0 run, b updateAction) {
        Intrinsics.checkNotNullParameter(widgetCode, "$widgetCode");
        Intrinsics.checkNotNullParameter(run, "$run");
        Intrinsics.checkNotNullParameter(updateAction, "$updateAction");
        Logger.INSTANCE.debug("ExecutorTask", widgetCode, "executeUpdate, task submit,run:" + run);
        b.a("ExecutorTask", new Function0(run, updateAction, widgetCode));
    }

    public final void c(@NotNull String widgetCode) {
        Intrinsics.checkNotNullParameter(widgetCode, "widgetCode");
        Logger.INSTANCE.d("ExecutorTask", "registerDataTask widgetCode:" + widgetCode);
        cardDataTasks.remove(widgetCode);
        cardLayoutUpdateRunnableCache.remove(widgetCode);
        cardDataUpdateRunnableCache.remove(widgetCode);
    }

    public final void d(final String widgetCode, final b updateAction, final p010kotlin.jvm.functions.Function0<p010kotlin.Unit> run) {
        ExecutorService executorService = cardDataTasks.get(widgetCode);
        if (executorService != null) {
            executorService.submit(new Runnable() { // from class: com.oplus.aiunit.vision.i8m
                @Override // java.lang.Runnable
                public final void run() {
                    kotlin.a.f(widgetCode, run, updateAction);
                }
            });
        }
    }

    public final void e(@NotNull String widgetCode, @NotNull ExecutorService task) {
        Intrinsics.checkNotNullParameter(widgetCode, "widgetCode");
        Intrinsics.checkNotNullParameter(task, "task");
        Logger logger = Logger.INSTANCE;
        logger.d("ExecutorTask", "registerDataTask widgetCode:" + widgetCode + " task:" + task);
        cardDataTasks.put(widgetCode, task);
        p010kotlin.jvm.functions.Function0<p010kotlin.Unit> function0 = cardLayoutUpdateRunnableCache.get(widgetCode);
        if (function0 != null) {
            logger.d("ExecutorTask", "registerDataTask widgetCode:" + widgetCode + " executeLayoutUpdate!");
            a.d(widgetCode, b.UPDATE_LAYOUT, function0);
        }
        p010kotlin.jvm.functions.Function0<p010kotlin.Unit> function1 = cardDataUpdateRunnableCache.get(widgetCode);
        if (function1 != null) {
            logger.d("ExecutorTask", "registerDataTask widgetCode:" + widgetCode + " executeDataUpdate!");
            a.d(widgetCode, b.UPDATE_DATA, function1);
        }
    }

    public final void h(@NotNull String widgetCode, @NotNull b updateAction, @NotNull p010kotlin.jvm.functions.Function0<p010kotlin.Unit> run) {
        ConcurrentHashMap<String, p010kotlin.jvm.functions.Function0<p010kotlin.Unit>> concurrentHashMap;
        Intrinsics.checkNotNullParameter(widgetCode, "widgetCode");
        Intrinsics.checkNotNullParameter(updateAction, "updateAction");
        Intrinsics.checkNotNullParameter(run, "run");
        if (cardDataTasks.get(widgetCode) != null) {
            d(widgetCode, updateAction, run);
            return;
        }
        Logger.INSTANCE.w("ExecutorTask", "runOnDataThread widgetCode(" + widgetCode + ") is illegal or target card is destroy,may update later!");
        int i = C1031a.a[updateAction.ordinal()];
        if (i == 1) {
            concurrentHashMap = cardLayoutUpdateRunnableCache;
        } else if (i != 2) {
            return;
        } else {
            concurrentHashMap = cardDataUpdateRunnableCache;
        }
        concurrentHashMap.put(widgetCode, run);
    }
}
