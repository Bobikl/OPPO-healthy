package androidx.compose.ui.graphics;

import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.Immutable;
import org.hapjs.card.api.debug.CardDebugController;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001B\u0007\b\u0004¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0007J\b\u0010\u0006\u001a\u00020\u0004H%J\b\u0010\u0007\u001a\u00020\bH\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0001\u0003\t\n\u000b¨\u0006\f"}, d2 = {"Landroidx/compose/ui/graphics/RenderEffect;", "", "()V", "internalRenderEffect", "Landroid/graphics/RenderEffect;", "asAndroidRenderEffect", "createRenderEffect", CardDebugController.EXTRA_IS_SUPPORTED, "", "Landroidx/compose/ui/graphics/AndroidRenderEffect;", "Landroidx/compose/ui/graphics/BlurEffect;", "Landroidx/compose/ui/graphics/OffsetEffect;", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAndroidRenderEffect.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidRenderEffect.android.kt\nandroidx/compose/ui/graphics/RenderEffect\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,169:1\n1#2:170\n*E\n"})
public abstract class RenderEffect {

    @Nullable
    private android.graphics.RenderEffect internalRenderEffect;

    public /* synthetic */ RenderEffect(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @RequiresApi(31)
    @NotNull
    public final android.graphics.RenderEffect asAndroidRenderEffect() {
        android.graphics.RenderEffect renderEffect = this.internalRenderEffect;
        if (renderEffect != null) {
            return renderEffect;
        }
        android.graphics.RenderEffect renderEffectCreateRenderEffect = getAndroidRenderEffect();
        this.internalRenderEffect = renderEffectCreateRenderEffect;
        return renderEffectCreateRenderEffect;
    }

    @RequiresApi(31)
    @NotNull
    /* JADX INFO: renamed from: createRenderEffect */
    public abstract android.graphics.RenderEffect getAndroidRenderEffect();

    public boolean isSupported() {
        return Build.VERSION.SDK_INT >= 31;
    }

    private RenderEffect() {
    }
}
