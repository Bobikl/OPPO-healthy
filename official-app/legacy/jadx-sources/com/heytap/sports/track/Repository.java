package com.heytap.sports.track;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.compose.runtime.internal.StabilityInferred;
import com.oplus.aiunit.vision.StyleData;
import com.oplus.aiunit.vision.b17;
import com.oplus.aiunit.vision.b78;
import com.oplus.aiunit.vision.jb3;
import com.oplus.aiunit.vision.qtf;
import com.oplus.aiunit.vision.wq8;
import com.oplus.aiunit.vision.yha;
import io.protostuff.MapSchema;
import java.util.List;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.ResultKt;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.StringsKt__StringsJVMKt;
import p010kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\r\u001a\u00020\n\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000e¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010\u0003\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\b\u001a\u00020\u0005*\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0017\u0010\u0012\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\b\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u001a\u0010\u001a\u001a\u0004\u0018\u00010\u0005*\u00020\u00188BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0019\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"Lcom/heytap/sports/track/Repository;", "", "Lcom/oplus/aiunit/vision/m2j;", "f", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/graphics/Bitmap;", "", "color", "b", "(Landroid/graphics/Bitmap;Ljava/lang/Integer;)Landroid/graphics/Bitmap;", "Lkotlinx/coroutines/CoroutineScope;", "a", "Lkotlinx/coroutines/CoroutineScope;", "scope", "Lcom/oplus/aiunit/vision/b17;", "Lcom/oplus/aiunit/vision/b17;", MapSchema.FIELD_NAME_ENTRY, "()Lcom/oplus/aiunit/vision/b17;", "source", "c", "I", "dp36", "d", "dp1", "", "(Ljava/lang/String;)Landroid/graphics/Bitmap;", "glideLoad", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Lcom/oplus/aiunit/vision/b17;)V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
public final class Repository {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final CoroutineScope scope;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final b17 source;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final int dp36;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final int dp1;

    public Repository(@NotNull CoroutineScope scope, @NotNull b17 source) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(source, "source");
        this.scope = scope;
        this.source = source;
        this.dp36 = qtf.b(36.0f);
        this.dp1 = qtf.b(1.0f);
    }

    public static /* synthetic */ Bitmap c(Repository repository, Bitmap bitmap, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        return repository.b(bitmap, num);
    }

    public final Bitmap b(Bitmap bitmap, Integer num) {
        float width;
        float strokeWidth;
        Bitmap asShared = bitmap.copy(Bitmap.Config.ARGB_8888, true);
        Canvas canvas = new Canvas(asShared);
        Paint paint = new Paint(1);
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(this.dp1);
        if (num == null) {
            width = canvas.getWidth() / 2.0f;
            strokeWidth = paint.getStrokeWidth();
        } else {
            width = (canvas.getWidth() / 2.0f) - paint.getStrokeWidth();
            strokeWidth = paint.getStrokeWidth();
        }
        canvas.drawCircle(canvas.getWidth() / 2.0f, canvas.getHeight() / 2.0f, width - (strokeWidth / 2), paint);
        if (num != null) {
            float width2 = (canvas.getWidth() / 2.0f) - (paint.getStrokeWidth() / 2);
            paint.setColor(num.intValue());
            canvas.drawCircle(canvas.getWidth() / 2.0f, canvas.getHeight() / 2.0f, width2, paint);
        }
        Intrinsics.checkNotNullExpressionValue(asShared, "asShared");
        return asShared;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Bitmap d(String str) {
        try {
            if (StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) "usercenter-avatar", false, 2, (Object) null)) {
                R r = com.bumptech.glide.a.v(b78.a()).b().Y0(str).w0(new jb3()).f0(this.dp36).e1().get();
                Intrinsics.checkNotNullExpressionValue(r, "with(GlobalApplicationHo…ride(dp36).submit().get()");
                return c(this, (Bitmap) r, null, 1, null);
            }
            if (StringsKt__StringsJVMKt.startsWith$default(str, "http", false, 2, null)) {
                return (Bitmap) com.bumptech.glide.a.v(b78.a()).b().Y0(str).f0(this.dp36).e1().get();
            }
            return null;
        } catch (Exception e2) {
            yha.j(e2);
            return null;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final b17 getSource() {
        return this.source;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object f(@NotNull Continuation<? super StyleData> continuation) {
        Repository$styleData$1 repository$styleData$1;
        Deferred deferredAsync$default;
        List list;
        if (continuation instanceof Repository$styleData$1) {
            repository$styleData$1 = (Repository$styleData$1) continuation;
            int i = repository$styleData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                repository$styleData$1.label = i - Integer.MIN_VALUE;
            } else {
                repository$styleData$1 = new Repository$styleData$1(this, continuation);
            }
        } else {
            repository$styleData$1 = new Repository$styleData$1(this, continuation);
        }
        Object objAwait = repository$styleData$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = repository$styleData$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                deferredAsync$default = (Deferred) repository$styleData$1.L$0;
                ResultKt.throwOnFailure(objAwait);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list = (List) repository$styleData$1.L$0;
                ResultKt.throwOnFailure(objAwait);
            }
            return new StyleData(list, (List) objAwait);
        }
        ResultKt.throwOnFailure(objAwait);
        CoroutineScope coroutineScope = this.scope;
        wq8 wq8Var = wq8.INSTANCE;
        Deferred deferredAsync$default2 = BuildersKt__Builders_commonKt.async$default(coroutineScope, wq8Var.e(), null, new Repository$styleData$mapStyles$1(this, null), 2, null);
        deferredAsync$default = BuildersKt__Builders_commonKt.async$default(this.scope, wq8Var.e(), null, new Repository$styleData$trackStyles$1(this, null), 2, null);
        repository$styleData$1.L$0 = deferredAsync$default;
        repository$styleData$1.label = 1;
        objAwait = deferredAsync$default2.await(repository$styleData$1);
        if (objAwait == coroutine_suspended) {
            return coroutine_suspended;
        }
        List list2 = (List) objAwait;
        repository$styleData$1.L$0 = list2;
        repository$styleData$1.label = 2;
        Object objAwait2 = deferredAsync$default.await(repository$styleData$1);
        if (objAwait2 == coroutine_suspended) {
            return coroutine_suspended;
        }
        objAwait = objAwait2;
        list = list2;
        return new StyleData(list, (List) objAwait);
    }

    public /* synthetic */ Repository(CoroutineScope coroutineScope, b17 b17Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(coroutineScope, (i & 2) != 0 ? new b17() : b17Var);
    }
}
