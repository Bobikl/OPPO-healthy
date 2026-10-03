package pantanal.app;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.oplus.aiunit.vision.bs9;
import com.oplus.aiunit.vision.oea;
import com.oplus.aiunit.vision.t6e;
import com.pantanal.fundation.internal.utils.ThreadUtils;
import java.util.Map;
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
import pantanal.app.TimeOutLoadCallback;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\b\u0018\u0000  2\u00020\u0001:\u0001 B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0001¢\u0006\u0002\u0010\u0007J0\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0016\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0018\u00010\u0019H\u0016J\u0018\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u0003H\u0016J\u0010\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0006\u0010\u001f\u001a\u00020\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lpantanal/app/TimeOutLoadCallback;", "Lpantanal/app/OnLoadCallback;", "cardLogMsg", "", "timeOut", "", oea.CALLBACK, "(Ljava/lang/String;ILpantanal/app/OnLoadCallback;)V", "mainHandler", "Landroid/os/Handler;", "getMainHandler", "()Landroid/os/Handler;", "mainHandler$delegate", "Lkotlin/Lazy;", "timeOutAction", "Ljava/lang/Runnable;", "timeOutLimit", "", "onCardViewCreated", "", "innerCard", "", "view", "Landroid/view/View;", "extraMap", "", "onError", "code", "message", "onPreview", "onSuccess", "startLoadCountDown", "Companion", "pantanal-interface_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TimeOutLoadCallback implements OnLoadCallback {
    private static final long SECONDS = 1000;

    @NotNull
    private static final String TAG = "TimeOutLoadCallback";

    @NotNull
    private final String cardLogMsg;

    @NotNull
    private final OnLoadCallback cb;

    /* JADX INFO: renamed from: mainHandler$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mainHandler;
    private final int timeOut;

    @NotNull
    private final Runnable timeOutAction;
    private final long timeOutLimit;

    public TimeOutLoadCallback(@NotNull String cardLogMsg, int i, @NotNull OnLoadCallback cb) {
        Intrinsics.checkNotNullParameter(cardLogMsg, "cardLogMsg");
        Intrinsics.checkNotNullParameter(cb, "cb");
        this.cardLogMsg = cardLogMsg;
        this.timeOut = i;
        this.cb = cb;
        this.timeOutLimit = ((long) i) * 1000;
        this.mainHandler = LazyKt__LazyJVMKt.lazy(new Function0<Handler>() { // from class: pantanal.app.TimeOutLoadCallback$mainHandler$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final Handler invoke() {
                return new Handler(Looper.getMainLooper());
            }
        });
        this.timeOutAction = new Runnable() { // from class: com.oplus.aiunit.vision.kyj
            @Override // java.lang.Runnable
            public final void run() {
                TimeOutLoadCallback.timeOutAction$lambda$1(this.i);
            }
        };
    }

    private final Handler getMainHandler() {
        return (Handler) this.mainHandler.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void timeOutAction$lambda$1(final TimeOutLoadCallback this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        bs9.a.c(t6e.INSTANCE, TAG, this$0.cardLogMsg + ", load card timeout action invoke!", false, null, false, 0, false, null, 252, null);
        ThreadUtils.e(new Runnable() { // from class: com.oplus.aiunit.vision.lyj
            @Override // java.lang.Runnable
            public final void run() {
                TimeOutLoadCallback.timeOutAction$lambda$1$lambda$0(this.i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void timeOutAction$lambda$1$lambda$0(TimeOutLoadCallback this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onError(1010, "load time out, timeout set: " + this$0.timeOut + " seconds");
    }

    @Override // pantanal.app.OnLoadCallback
    public void onCardViewCreated(@NotNull Object innerCard, @NotNull View view, @Nullable Map<String, ? extends Object> extraMap) {
        Object objM5287constructorimpl;
        Intrinsics.checkNotNullParameter(innerCard, "innerCard");
        Intrinsics.checkNotNullParameter(view, "view");
        bs9.a.c(t6e.INSTANCE, TAG, this.cardLogMsg + ", onCardViewCreated view=" + view, false, null, false, 0, false, null, 252, null);
        try {
            Result.Companion companion = Result.INSTANCE;
            this.cb.onCardViewCreated(innerCard, view, extraMap);
            objM5287constructorimpl = Result.m5287constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM5290exceptionOrNullimpl = Result.m5290exceptionOrNullimpl(objM5287constructorimpl);
        if (thM5290exceptionOrNullimpl != null) {
            bs9.a.e(t6e.INSTANCE, TAG, "onCardViewCreated error: " + thM5290exceptionOrNullimpl.getMessage(), false, null, false, 0, false, null, 252, null);
        }
    }

    @Override // pantanal.app.OnLoadCallback
    public void onError(int code, @NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        getMainHandler().removeCallbacks(this.timeOutAction);
        bs9.a.c(t6e.INSTANCE, TAG, this.cardLogMsg + ", onError called, intercept", false, null, false, 0, false, null, 252, null);
        this.cb.onError(code, message);
    }

    @Override // pantanal.app.OnLoadCallback
    public void onFirstFrame(@Nullable View view) {
        OnLoadCallback.DefaultImpls.onFirstFrame(this, view);
    }

    @Override // pantanal.app.OnLoadCallback
    public void onPreview(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.cb.onPreview(view);
    }

    @Override // pantanal.app.OnLoadCallback
    public void onSuccess(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        getMainHandler().removeCallbacks(this.timeOutAction);
        bs9.a.c(t6e.INSTANCE, TAG, this.cardLogMsg + ", onSuccess called", false, null, false, 0, false, null, 252, null);
        this.cb.onSuccess(view);
    }

    public final void startLoadCountDown() {
        bs9.a.d(t6e.INSTANCE, TAG, this.cardLogMsg + ",startLoadCountDown,timeout = " + this.timeOut + " seconds ", false, null, false, 0, false, null, 252, null);
        if (this.timeOut >= 0) {
            getMainHandler().removeCallbacks(this.timeOutAction);
            getMainHandler().postDelayed(this.timeOutAction, this.timeOutLimit);
        }
    }
}
