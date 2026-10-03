package coil.size;

import android.content.Context;
import android.util.DisplayMetrics;
import com.oplus.aiunit.vision.m7h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0096\u0002J\b\u0010\n\u001a\u00020\tH\u0016R\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"Lcoil/size/d;", "Lcom/oplus/aiunit/vision/m7h;", "Lcoil/size/e;", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "other", "", "equals", "", "hashCode", "Landroid/content/Context;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "coil-base_release"}, k = 1, mv = {1, 9, 0})
public final class d implements m7h {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    public d(@NotNull Context context) {
        this.context = context;
    }

    @Override // com.oplus.aiunit.vision.m7h
    @Nullable
    public Object a(@NotNull Continuation<? super Size> continuation) {
        DisplayMetrics displayMetrics = this.context.getResources().getDisplayMetrics();
        c.a aVarA = a.a(Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels));
        return new Size(aVarA, aVarA);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof d) && Intrinsics.areEqual(this.context, ((d) other).context);
    }

    public int hashCode() {
        return this.context.hashCode();
    }
}
