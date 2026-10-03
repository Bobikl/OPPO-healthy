package androidx.compose.material.pullrefresh;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
public /* synthetic */ class PullRefreshKt$pullRefresh$2$1 extends FunctionReferenceImpl implements Function1<Float, Float> {
    public PullRefreshKt$pullRefresh$2$1(Object obj) {
        super(1, obj, PullRefreshState.class, "onPull", "onPull$material_release(F)F", 0);
    }

    @NotNull
    public final Float invoke(float f) {
        return Float.valueOf(((PullRefreshState) this.receiver).onPull$material_release(f));
    }

    @Override // p010kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Float invoke(Float f) {
        return invoke(f.floatValue());
    }
}
