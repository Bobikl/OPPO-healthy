package n;

import android.content.Context;
import android.os.Build;
import androidx.exifinterface.media.ExifInterface;
import com.oplus.aiunit.vision.v9m;
import com.oplus.aiunit.vision.w9m;
import com.oplus.cardwidget.util.Logger;
import com.oplus.os.OplusBuild;
import com.oplus.pantanal.seedling.constants.Constants;
import io.protostuff.MapSchema;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.Result;
import p010kotlin.ResultKt;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a+\u0010\u0005\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0000\u001a\b\u0010\u000b\u001a\u00020\tH\u0002\u001a\u000e\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f\"#\u0010\u0015\u001a\n \u0011*\u0004\u0018\u00010\u00100\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "", "tag", "Lkotlin/Function0;", "call", "a", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Landroid/content/Context;", "context", "", "d", "c", "Ljava/lang/Runnable;", "task", "", "b", "Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", "Lkotlin/Lazy;", MapSchema.FIELD_NAME_ENTRY, "()Ljava/util/concurrent/ExecutorService;", "fixedExecutor", "com.oplus.card.widget.cardwidget"}, k = 2, mv = {1, 8, 0})
public final class b {

    @NotNull
    public static final Lazy a = LazyKt__LazyJVMKt.lazy(a.a);

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", "a", "()Ljava/util/concurrent/ExecutorService;"}, k = 3, mv = {1, 8, 0})
    public static final class a extends Lambda implements Function0<ExecutorService> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // p010kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ExecutorService invoke() {
            return Executors.newFixedThreadPool(2, new v9m("CardWidgetFixedExecutor"));
        }
    }

    @Nullable
    public static final <T> T a(@NotNull String tag, @NotNull Function0<? extends T> call) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(call, "call");
        try {
            Result.Companion companion = Result.INSTANCE;
            return call.invoke();
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Throwable thM5290exceptionOrNullimpl = Result.m5290exceptionOrNullimpl(Result.m5287constructorimpl(ResultKt.createFailure(th)));
            if (thM5290exceptionOrNullimpl == null) {
                return null;
            }
            Logger.INSTANCE.e(tag + "_ERR", "run action has error:" + thM5290exceptionOrNullimpl.getMessage());
            return null;
        }
    }

    public static final void b(@NotNull Runnable task) {
        Intrinsics.checkNotNullParameter(task, "task");
        e().execute(task);
    }

    public static final boolean c() {
        boolean z;
        Object objM5287constructorimpl;
        boolean z2;
        try {
            Result.Companion companion = Result.INSTANCE;
            z2 = Build.VERSION.SDK_INT >= 33 && OplusBuild.VERSION.SDK_VERSION >= 30;
            try {
                objM5287constructorimpl = Result.m5287constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                z = z2;
                th = th;
                Result.Companion companion2 = Result.INSTANCE;
                boolean z3 = z;
                objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th));
                z2 = z3;
            }
        } catch (Throwable th2) {
            th = th2;
            z = false;
        }
        if (Result.m5290exceptionOrNullimpl(objM5287constructorimpl) != null) {
            return false;
        }
        return z2;
    }

    public static final boolean d(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        boolean z = false;
        boolean zA = w9m.a(context, "com.oplus.pantanal.ums", Constants.META_DATA_CARD_SERVICE_SUPPORT, false);
        boolean zC = c();
        if (zA && zC) {
            z = true;
        }
        Logger.INSTANCE.i("Utils", "isUmsRunCardService, isUmsCardService=" + z + ",isUmsSupportCardService=" + zA + ", isAboveOSVersion14=" + zC);
        return z;
    }

    public static final ExecutorService e() {
        return (ExecutorService) a.getValue();
    }
}
