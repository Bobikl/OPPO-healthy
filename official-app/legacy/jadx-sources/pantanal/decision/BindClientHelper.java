package pantanal.decision;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import com.oplus.aiunit.vision.bs9;
import com.oplus.aiunit.vision.t6e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.Result;
import p010kotlin.ResultKt;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00009\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0006\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u001c\u001a\u00020\u001d2\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003J\u0010\u0010\u001e\u001a\u00020\u001d2\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003R\u0010\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0007R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019¨\u0006 "}, d2 = {"Lpantanal/decision/BindClientHelper;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "connection", "pantanal/decision/BindClientHelper$connection$1", "Lpantanal/decision/BindClientHelper$connection$1;", "isBound", "", "()Z", "setBound", "(Z)V", "isDestroyed", "isHandlerInitialized", "listSize", "", "getListSize", "()I", "setListSize", "(I)V", "rebindCount", "retryHandler", "Landroid/os/Handler;", "getRetryHandler", "()Landroid/os/Handler;", "retryHandler$delegate", "Lkotlin/Lazy;", "bindUmsClient", "", "unbindUmsClient", "Companion", "service-decision_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class BindClientHelper {
    private static final long INTERVAL_REBIND = 2000;
    private static final int MAX_REBIND_COUNT = 3;

    @NotNull
    private static final String TAG = "UmsClientHelper";

    @NotNull
    private static final String UMS_SERVICE_COMPONENT = "com.oplus.pantanal.ums.cardservice.service.CardComponentService";

    @NotNull
    private final BindClientHelper$connection$1 connection;

    @Nullable
    private final Context context;
    private volatile boolean isBound;
    private volatile boolean isDestroyed;
    private volatile boolean isHandlerInitialized;
    private volatile int listSize;
    private volatile int rebindCount;

    /* JADX INFO: renamed from: retryHandler$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy retryHandler;

    /* JADX WARN: Multi-variable type inference failed */
    public BindClientHelper() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Handler getRetryHandler() {
        return (Handler) this.retryHandler.getValue();
    }

    public final void bindUmsClient(@Nullable Context context) {
        Object objM5287constructorimpl;
        if (context == null) {
            bs9.a.e(t6e.INSTANCE, TAG, "bindUmsClient context is null", false, null, false, 0, false, null, 252, null);
            return;
        }
        this.isDestroyed = false;
        Intent intent = new Intent();
        intent.setComponent(new ComponentName("com.oplus.pantanal.ums", UMS_SERVICE_COMPONENT));
        try {
            Result.Companion companion = Result.INSTANCE;
            context.bindService(intent, this.connection, 1);
            this.isBound = true;
            objM5287constructorimpl = Result.m5287constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM5290exceptionOrNullimpl = Result.m5290exceptionOrNullimpl(objM5287constructorimpl);
        if (thM5290exceptionOrNullimpl != null) {
            bs9.a.b(t6e.INSTANCE, TAG, "bindUmsClient error: " + thM5290exceptionOrNullimpl.getMessage(), false, null, false, 0, false, null, 252, null);
        }
    }

    public final int getListSize() {
        return this.listSize;
    }

    /* JADX INFO: renamed from: isBound, reason: from getter */
    public final boolean getIsBound() {
        return this.isBound;
    }

    public final void setBound(boolean z) {
        this.isBound = z;
    }

    public final void setListSize(int i) {
        this.listSize = i;
    }

    public final void unbindUmsClient(@Nullable Context context) {
        Object objM5287constructorimpl;
        if (context == null) {
            bs9.a.e(t6e.INSTANCE, TAG, "unbindUmsClient context is null", false, null, false, 0, false, null, 252, null);
            return;
        }
        this.isDestroyed = true;
        try {
            Result.Companion companion = Result.INSTANCE;
            context.unbindService(this.connection);
            this.isBound = false;
            objM5287constructorimpl = Result.m5287constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM5290exceptionOrNullimpl = Result.m5290exceptionOrNullimpl(objM5287constructorimpl);
        if (thM5290exceptionOrNullimpl != null) {
            bs9.a.b(t6e.INSTANCE, TAG, "unbindUmsClient error: " + thM5290exceptionOrNullimpl.getMessage(), false, null, false, 0, false, null, 252, null);
        }
        if (this.isHandlerInitialized) {
            getRetryHandler().removeCallbacksAndMessages(null);
        }
    }

    public BindClientHelper(@Nullable Context context) {
        this.context = context;
        this.retryHandler = LazyKt__LazyJVMKt.lazy(new Function0<Handler>() { // from class: pantanal.decision.BindClientHelper$retryHandler$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final Handler invoke() {
                this.this$0.isHandlerInitialized = true;
                return new Handler(Looper.getMainLooper());
            }
        });
        this.connection = new BindClientHelper$connection$1(this);
    }

    public /* synthetic */ BindClientHelper(Context context, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : context);
    }
}
