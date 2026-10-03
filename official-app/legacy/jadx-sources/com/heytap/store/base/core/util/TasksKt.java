package com.heytap.store.base.core.util;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.exifinterface.media.ExifInterface;
import com.heytap.store.base.core.util.TasksKt;
import com.heytap.store.platform.tools.ContextGetterUtils;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.JvmName;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.functions.Function2;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000`\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0006\u0010\n\u001a\u00020\u000b\u001a\u001c\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0010\u001a\u0014\u0010\u0011\u001a\u00020\u00032\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0010\u001a\u0014\u0010\u0013\u001a\u00020\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0010\u001a.\u0010\u0014\u001a\u00020\u0015\"\b\b\u0000\u0010\u0016*\u00020\u0017*\b\u0012\u0004\u0012\u0002H\u00160\u00182\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u0002H\u0016\u0012\u0004\u0012\u00020\u00030\u0001\u001a;\u0010\u0014\u001a\u00020\u0015\"\b\b\u0000\u0010\u0016*\u00020\u0017*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00160\u00190\u00182\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u0002H\u0016\u0012\u0004\u0012\u00020\u00030\u0001H\u0007¢\u0006\u0002\b\u001a\u001a9\u0010\u001b\u001a\u00020\u0015\"\b\b\u0000\u0010\u0016*\u00020\u0017*\b\u0012\u0004\u0012\u0002H\u00160\u00182\u001d\u0010\u000f\u001a\u0019\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u0002H\u0016\u0012\u0004\u0012\u00020\u00030\u001c¢\u0006\u0002\b\u001d\u001aF\u0010\u001b\u001a\u00020\u0015\"\b\b\u0000\u0010\u0016*\u00020\u0017*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00160\u00190\u00182\u001d\u0010\u000f\u001a\u0019\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u0002H\u0016\u0012\u0004\u0012\u00020\u00030\u001c¢\u0006\u0002\b\u001dH\u0007¢\u0006\u0002\b\u001e\u001aX\u0010\u001f\u001a\b\u0012\u0004\u0012\u0002H!0 \"\u0004\b\u0000\u0010\u0016\"\u0004\b\u0001\u0010!*\u0002H\u00162\u0016\b\u0002\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00012\u001d\u0010\u0012\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00160\u0018\u0012\u0004\u0012\u0002H!0\u0001¢\u0006\u0002\b\u001d¢\u0006\u0002\u0010#\u001a`\u0010\u001f\u001a\b\u0012\u0004\u0012\u0002H!0 \"\u0004\b\u0000\u0010\u0016\"\u0004\b\u0001\u0010!*\u0002H\u00162\u0016\b\u0002\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00012\u0006\u0010$\u001a\u00020%2\u001d\u0010\u0012\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00160\u0018\u0012\u0004\u0012\u0002H!0\u0001¢\u0006\u0002\b\u001d¢\u0006\u0002\u0010&\u001aR\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00030 \"\u0004\b\u0000\u0010\u0016*\u0002H\u00162\u0016\b\u0002\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00012\u001d\u0010\u0012\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00160\u0018\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u001d¢\u0006\u0002\u0010#\u001aZ\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00030 \"\u0004\b\u0000\u0010\u0016*\u0002H\u00162\u0016\b\u0002\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00012\u0006\u0010$\u001a\u00020%2\u001d\u0010\u0012\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00160\u0018\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u001d¢\u0006\u0002\u0010&\u001a,\u0010(\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0016*\b\u0012\u0004\u0012\u0002H\u00160\u00182\u0014\u0010\u000f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u0001H\u0016\u0012\u0004\u0012\u00020\u00030\u0001\u001a+\u0010\f\u001a\u00020\u0003*\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u001d\u001a#\u0010\u0013\u001a\u00020\u0003*\u00020\u000b2\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u001d\u001a+\u0010\u0013\u001a\u00020\u0003*\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u001d\u001a*\u0010)\u001a\u00020\u0015\"\u0004\b\u0000\u0010\u0016*\b\u0012\u0004\u0012\u0002H\u00160\u00182\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u0002H\u0016\u0012\u0004\u0012\u00020\u00030\u0001\"\u001a\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u001b\u0010\u0004\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006*"}, d2 = {"crashLogger", "Lkotlin/Function1;", "", "", "handler", "Landroid/os/Handler;", "getHandler", "()Landroid/os/Handler;", "handler$delegate", "Lkotlin/Lazy;", "context", "Landroid/content/Context;", "postDelayed", "delayMillis", "", "f", "Lkotlin/Function0;", "runOnThreadPool", "task", "runOnUiThread", "activityUiThread", "", ExifInterface.GPS_DIRECTION_TRUE, "Landroid/app/Activity;", "Lcom/heytap/store/base/core/util/AsyncContext;", "Lcom/heytap/store/base/core/util/WrapContext;", "activityContextUiThread", "activityUiThreadWithContext", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "activityContextUiThreadWithContext", "asyncResult", "Ljava/util/concurrent/Future;", "R", "exceptionHandler", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/util/concurrent/Future;", "executorService", "Ljava/util/concurrent/ExecutorService;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Ljava/util/concurrent/ExecutorService;Lkotlin/jvm/functions/Function1;)Ljava/util/concurrent/Future;", "doAsync", "onComplete", "uiThread", "Core_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class TasksKt {

    @NotNull
    private static final Lazy handler$delegate = LazyKt__LazyJVMKt.lazy(new Function0<Handler>() { // from class: com.heytap.store.base.core.util.TasksKt$handler$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    });

    @NotNull
    private static final Function1<Throwable, Unit> crashLogger = new Function1<Throwable, Unit>() { // from class: com.heytap.store.base.core.util.TasksKt$crashLogger$1
        @Override // p010kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            throwable.printStackTrace();
        }
    };

    @JvmName(name = "activityContextUiThread")
    public static final <T extends Activity> boolean activityContextUiThread(@NotNull AsyncContext<WrapContext<T>> asyncContext, @NotNull final Function1<? super T, Unit> f) {
        Intrinsics.checkNotNullParameter(asyncContext, "<this>");
        Intrinsics.checkNotNullParameter(f, "f");
        WrapContext<T> wrapContext = asyncContext.getWeakRef().get();
        final T owner = wrapContext == null ? null : wrapContext.getOwner();
        if (owner == null || owner.isFinishing()) {
            return false;
        }
        owner.runOnUiThread(new Runnable() { // from class: com.oplus.aiunit.vision.lpj
            @Override // java.lang.Runnable
            public final void run() {
                TasksKt.m4781activityUiThread$lambda8(f, owner);
            }
        });
        return true;
    }

    @JvmName(name = "activityContextUiThreadWithContext")
    public static final <T extends Activity> boolean activityContextUiThreadWithContext(@NotNull AsyncContext<WrapContext<T>> asyncContext, @NotNull final Function2<? super Context, ? super T, Unit> f) {
        Intrinsics.checkNotNullParameter(asyncContext, "<this>");
        Intrinsics.checkNotNullParameter(f, "f");
        WrapContext<T> wrapContext = asyncContext.getWeakRef().get();
        final T owner = wrapContext == null ? null : wrapContext.getOwner();
        if (owner == null || owner.isFinishing()) {
            return false;
        }
        owner.runOnUiThread(new Runnable() { // from class: com.oplus.aiunit.vision.epj
            @Override // java.lang.Runnable
            public final void run() {
                TasksKt.m4783activityUiThreadWithContext$lambda9(f, owner);
            }
        });
        return true;
    }

    public static final <T extends Activity> boolean activityUiThread(@NotNull AsyncContext<T> asyncContext, @NotNull final Function1<? super T, Unit> f) {
        Intrinsics.checkNotNullParameter(asyncContext, "<this>");
        Intrinsics.checkNotNullParameter(f, "f");
        final T t = asyncContext.getWeakRef().get();
        if (t == null || t.isFinishing()) {
            return false;
        }
        t.runOnUiThread(new Runnable() { // from class: com.oplus.aiunit.vision.ipj
            @Override // java.lang.Runnable
            public final void run() {
                TasksKt.m4780activityUiThread$lambda6(f, t);
            }
        });
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: activityUiThread$lambda-6, reason: not valid java name */
    public static final void m4780activityUiThread$lambda6(Function1 f, Activity activity) {
        Intrinsics.checkNotNullParameter(f, "$f");
        Intrinsics.checkNotNullParameter(activity, "$activity");
        f.invoke(activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: activityUiThread$lambda-8, reason: not valid java name */
    public static final void m4781activityUiThread$lambda8(Function1 f, Activity activity) {
        Intrinsics.checkNotNullParameter(f, "$f");
        Intrinsics.checkNotNullParameter(activity, "$activity");
        f.invoke(activity);
    }

    public static final <T extends Activity> boolean activityUiThreadWithContext(@NotNull AsyncContext<T> asyncContext, @NotNull final Function2<? super Context, ? super T, Unit> f) {
        Intrinsics.checkNotNullParameter(asyncContext, "<this>");
        Intrinsics.checkNotNullParameter(f, "f");
        final T t = asyncContext.getWeakRef().get();
        if (t == null || t.isFinishing()) {
            return false;
        }
        t.runOnUiThread(new Runnable() { // from class: com.oplus.aiunit.vision.mpj
            @Override // java.lang.Runnable
            public final void run() {
                TasksKt.m4782activityUiThreadWithContext$lambda7(f, t);
            }
        });
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: activityUiThreadWithContext$lambda-7, reason: not valid java name */
    public static final void m4782activityUiThreadWithContext$lambda7(Function2 f, Activity activity) {
        Intrinsics.checkNotNullParameter(f, "$f");
        Intrinsics.checkNotNullParameter(activity, "$activity");
        f.invoke(activity, activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: activityUiThreadWithContext$lambda-9, reason: not valid java name */
    public static final void m4783activityUiThreadWithContext$lambda9(Function2 f, Activity activity) {
        Intrinsics.checkNotNullParameter(f, "$f");
        Intrinsics.checkNotNullParameter(activity, "$activity");
        f.invoke(activity, activity);
    }

    @NotNull
    public static final <T, R> Future<R> asyncResult(T t, @Nullable final Function1<? super Throwable, Unit> function1, @NotNull final Function1<? super AsyncContext<T>, ? extends R> task) {
        Intrinsics.checkNotNullParameter(task, "task");
        final AsyncContext asyncContext = new AsyncContext(new WeakReference(t));
        return BackgroundExecutor.INSTANCE.submit(new Function0<R>() { // from class: com.heytap.store.base.core.util.TasksKt.asyncResult.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // p010kotlin.jvm.functions.Function0
            public final R invoke() {
                try {
                    return task.invoke(asyncContext);
                } catch (Throwable th) {
                    Function1<Throwable, Unit> function2 = function1;
                    if (function2 != null) {
                        function2.invoke(th);
                    }
                    throw th;
                }
            }
        });
    }

    public static /* synthetic */ Future asyncResult$default(Object obj, Function1 function1, Function1 function2, int i, Object obj2) {
        if ((i & 1) != 0) {
            function1 = crashLogger;
        }
        return asyncResult(obj, function1, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: asyncResult$lambda-11, reason: not valid java name */
    public static final Object m4784asyncResult$lambda11(Function1 task, AsyncContext context, Function1 function1) {
        Intrinsics.checkNotNullParameter(task, "$task");
        Intrinsics.checkNotNullParameter(context, "$context");
        try {
            return task.invoke(context);
        } catch (Throwable th) {
            if (function1 != null) {
                function1.invoke(th);
            }
            throw th;
        }
    }

    @NotNull
    public static final Context context() {
        return ContextGetterUtils.INSTANCE.getApp();
    }

    @NotNull
    public static final <T> Future<Unit> doAsync(T t, @Nullable final Function1<? super Throwable, Unit> function1, @NotNull final Function1<? super AsyncContext<T>, Unit> task) {
        Intrinsics.checkNotNullParameter(task, "task");
        final AsyncContext asyncContext = new AsyncContext(new WeakReference(t));
        return BackgroundExecutor.INSTANCE.submit(new Function0<Unit>() { // from class: com.heytap.store.base.core.util.TasksKt.doAsync.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            @Override // p010kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                try {
                    task.invoke(asyncContext);
                } catch (Throwable th) {
                    Function1<Throwable, Unit> function2 = function1;
                    if (function2 == null) {
                        return;
                    }
                    function2.invoke(th);
                    Unit unit = Unit.INSTANCE;
                }
            }
        });
    }

    public static /* synthetic */ Future doAsync$default(Object obj, Function1 function1, Function1 function2, int i, Object obj2) {
        if ((i & 1) != 0) {
            function1 = crashLogger;
        }
        return doAsync(obj, function1, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: doAsync$lambda-10, reason: not valid java name */
    public static final Unit m4785doAsync$lambda10(Function1 task, AsyncContext context, Function1 function1) {
        Intrinsics.checkNotNullParameter(task, "$task");
        Intrinsics.checkNotNullParameter(context, "$context");
        try {
            task.invoke(context);
        } catch (Throwable th) {
            if (function1 != null) {
                function1.invoke(th);
            }
        }
        return Unit.INSTANCE;
    }

    @NotNull
    public static final Handler getHandler() {
        return (Handler) handler$delegate.getValue();
    }

    public static final <T> void onComplete(@NotNull AsyncContext<T> asyncContext, @NotNull final Function1<? super T, Unit> f) {
        Intrinsics.checkNotNullParameter(asyncContext, "<this>");
        Intrinsics.checkNotNullParameter(f, "f");
        final T t = asyncContext.getWeakRef().get();
        if (Looper.getMainLooper() == Looper.myLooper()) {
            f.invoke(t);
        } else {
            getHandler().post(new Runnable() { // from class: com.oplus.aiunit.vision.fpj
                @Override // java.lang.Runnable
                public final void run() {
                    TasksKt.m4786onComplete$lambda4(f, t);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onComplete$lambda-4, reason: not valid java name */
    public static final void m4786onComplete$lambda4(Function1 f, Object obj) {
        Intrinsics.checkNotNullParameter(f, "$f");
        f.invoke(obj);
    }

    public static final void postDelayed(@NotNull final Context context, long j2, @NotNull final Function1<? super Context, Unit> f) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(f, "f");
        getHandler().postDelayed(new Runnable() { // from class: com.oplus.aiunit.vision.kpj
            @Override // java.lang.Runnable
            public final void run() {
                TasksKt.m4787postDelayed$lambda2(f, context);
            }
        }, j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: postDelayed$lambda-2, reason: not valid java name */
    public static final void m4787postDelayed$lambda2(Function1 f, Context this_postDelayed) {
        Intrinsics.checkNotNullParameter(f, "$f");
        Intrinsics.checkNotNullParameter(this_postDelayed, "$this_postDelayed");
        f.invoke(this_postDelayed);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: postDelayed$lambda-3, reason: not valid java name */
    public static final void m4788postDelayed$lambda3(Function0 f) {
        Intrinsics.checkNotNullParameter(f, "$f");
        f.invoke();
    }

    public static final void runOnThreadPool(@NotNull final Function0<Unit> task) {
        Intrinsics.checkNotNullParameter(task, "task");
        BackgroundExecutor.INSTANCE.submit(new Function0<Unit>() { // from class: com.heytap.store.base.core.util.TasksKt.runOnThreadPool.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p010kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                task.invoke();
            }
        });
    }

    public static final void runOnUiThread(@NotNull final Function0<Unit> f) {
        Intrinsics.checkNotNullParameter(f, "f");
        if (Looper.getMainLooper() == Looper.myLooper()) {
            f.invoke();
        } else {
            getHandler().post(new Runnable() { // from class: com.oplus.aiunit.vision.cpj
                @Override // java.lang.Runnable
                public final void run() {
                    TasksKt.m4789runOnUiThread$lambda0(f);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: runOnUiThread$lambda-0, reason: not valid java name */
    public static final void m4789runOnUiThread$lambda0(Function0 f) {
        Intrinsics.checkNotNullParameter(f, "$f");
        f.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: runOnUiThread$lambda-1, reason: not valid java name */
    public static final void m4790runOnUiThread$lambda1(Function1 f, Context this_runOnUiThread) {
        Intrinsics.checkNotNullParameter(f, "$f");
        Intrinsics.checkNotNullParameter(this_runOnUiThread, "$this_runOnUiThread");
        f.invoke(this_runOnUiThread);
    }

    public static final <T> boolean uiThread(@NotNull AsyncContext<T> asyncContext, @NotNull final Function1<? super T, Unit> f) {
        Intrinsics.checkNotNullParameter(asyncContext, "<this>");
        Intrinsics.checkNotNullParameter(f, "f");
        final T t = asyncContext.getWeakRef().get();
        if (t == null) {
            return false;
        }
        if (Looper.getMainLooper() == Looper.myLooper()) {
            f.invoke(t);
            return true;
        }
        getHandler().post(new Runnable() { // from class: com.oplus.aiunit.vision.hpj
            @Override // java.lang.Runnable
            public final void run() {
                TasksKt.m4791uiThread$lambda5(f, t);
            }
        });
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: uiThread$lambda-5, reason: not valid java name */
    public static final void m4791uiThread$lambda5(Function1 f, Object obj) {
        Intrinsics.checkNotNullParameter(f, "$f");
        f.invoke(obj);
    }

    public static final void postDelayed(long j2, @NotNull final Function0<Unit> f) {
        Intrinsics.checkNotNullParameter(f, "f");
        getHandler().postDelayed(new Runnable() { // from class: com.oplus.aiunit.vision.bpj
            @Override // java.lang.Runnable
            public final void run() {
                TasksKt.m4788postDelayed$lambda3(f);
            }
        }, j2);
    }

    @NotNull
    public static final <T, R> Future<R> asyncResult(T t, @Nullable final Function1<? super Throwable, Unit> function1, @NotNull ExecutorService executorService, @NotNull final Function1<? super AsyncContext<T>, ? extends R> task) {
        Intrinsics.checkNotNullParameter(executorService, "executorService");
        Intrinsics.checkNotNullParameter(task, "task");
        final AsyncContext asyncContext = new AsyncContext(new WeakReference(t));
        Future<R> futureSubmit = executorService.submit(new Callable() { // from class: com.oplus.aiunit.vision.gpj
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return TasksKt.m4784asyncResult$lambda11(task, asyncContext, function1);
            }
        });
        Intrinsics.checkNotNullExpressionValue(futureSubmit, "executorService.submit<R…throw thr\n        }\n    }");
        return futureSubmit;
    }

    public static /* synthetic */ Future asyncResult$default(Object obj, Function1 function1, ExecutorService executorService, Function1 function2, int i, Object obj2) {
        if ((i & 1) != 0) {
            function1 = crashLogger;
        }
        return asyncResult(obj, function1, executorService, function2);
    }

    @NotNull
    public static final <T> Future<Unit> doAsync(T t, @Nullable final Function1<? super Throwable, Unit> function1, @NotNull ExecutorService executorService, @NotNull final Function1<? super AsyncContext<T>, Unit> task) {
        Intrinsics.checkNotNullParameter(executorService, "executorService");
        Intrinsics.checkNotNullParameter(task, "task");
        final AsyncContext asyncContext = new AsyncContext(new WeakReference(t));
        Future<Unit> futureSubmit = executorService.submit(new Callable() { // from class: com.oplus.aiunit.vision.dpj
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return TasksKt.m4785doAsync$lambda10(task, asyncContext, function1);
            }
        });
        Intrinsics.checkNotNullExpressionValue(futureSubmit, "executorService.submit<U…voke(thr)\n        }\n    }");
        return futureSubmit;
    }

    public static /* synthetic */ Future doAsync$default(Object obj, Function1 function1, ExecutorService executorService, Function1 function2, int i, Object obj2) {
        if ((i & 1) != 0) {
            function1 = crashLogger;
        }
        return doAsync(obj, function1, executorService, function2);
    }

    public static final void runOnUiThread(@NotNull final Context context, @NotNull final Function1<? super Context, Unit> f) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(f, "f");
        if (Looper.getMainLooper() == Looper.myLooper()) {
            f.invoke(context);
        } else {
            getHandler().post(new Runnable() { // from class: com.oplus.aiunit.vision.jpj
                @Override // java.lang.Runnable
                public final void run() {
                    TasksKt.m4790runOnUiThread$lambda1(f, context);
                }
            });
        }
    }

    public static final void runOnUiThread(@NotNull Context context, long j2, @NotNull Function1<? super Context, Unit> f) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(f, "f");
        postDelayed(context, j2, f);
    }
}
