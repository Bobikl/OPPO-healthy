package com.heytap.sporthealth.blib.helper;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.sporthealth.blib.weiget.ConstraintLayout24;
import com.oplus.aiunit.vision.qtf;
import com.oplus.aiunit.vision.wek;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0003\u001a\u00020\u0002H\u0014J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\"\u0010\u0010\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u001b"}, d2 = {"Lcom/heytap/sporthealth/blib/helper/ConstraintLayout242;", "Lcom/heytap/sporthealth/blib/weiget/ConstraintLayout24;", "", "getActualWidth", "Landroid/content/res/Configuration;", "newConfig", "", "onConfigurationChanged", LogFieldKey.LEVEL_KEY, "I", "getDp8", "()I", "dp8", "", LogFieldKey.MESSAGE_KEY, "Z", "isFold", "()Z", "setFold", "(Z)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "lib_ui_release"}, k = 1, mv = {1, 8, 0})
public final class ConstraintLayout242 extends ConstraintLayout24 {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public final int dp8;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public boolean isFold;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ConstraintLayout242(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.heytap.sporthealth.blib.weiget.ConstraintLayout24
    public int getActualWidth() {
        return this.isFold ? super.getActualWidth() : (super.getActualWidth() - this.dp8) / 2;
    }

    public final int getDp8() {
        return this.dp8;
    }

    @Override // android.view.View
    public void onConfigurationChanged(@Nullable Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        this.isFold = wek.a(context);
    }

    public final void setFold(boolean z) {
        this.isFold = z;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ConstraintLayout242(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ ConstraintLayout242(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ConstraintLayout242(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.dp8 = qtf.b(8.0f);
        this.isFold = wek.a(context);
    }
}
