package com.tencent.qgame.animplayer.textureview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.TextureView;
import com.oplus.aiunit.vision.a40;
import com.oplus.aiunit.vision.b40;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016R$\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/tencent/qgame/animplayer/textureview/InnerTextureView;", "Landroid/view/TextureView;", "Landroid/view/MotionEvent;", "ev", "", "dispatchTouchEvent", "Lcom/oplus/aiunit/vision/a40;", "i", "Lcom/oplus/aiunit/vision/a40;", "getPlayer", "()Lcom/oplus/aiunit/vision/a40;", "setPlayer", "(Lcom/oplus/aiunit/vision/a40;)V", "player", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "animplayer_release"}, k = 1, mv = {1, 4, 0})
public final class InnerTextureView extends TextureView {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public a40 player;

    @JvmOverloads
    public InnerTextureView(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(@Nullable MotionEvent ev) {
        a40 a40Var;
        b40 pluginManager;
        a40 a40Var2 = this.player;
        if ((a40Var2 == null || !a40Var2.o() || ev == null || (a40Var = this.player) == null || (pluginManager = a40Var.getPluginManager()) == null || !pluginManager.e(ev)) ? false : true) {
            return true;
        }
        return super.dispatchTouchEvent(ev);
    }

    @Nullable
    public final a40 getPlayer() {
        return this.player;
    }

    public final void setPlayer(@Nullable a40 a40Var) {
        this.player = a40Var;
    }

    @JvmOverloads
    public InnerTextureView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ InnerTextureView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public InnerTextureView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }
}
