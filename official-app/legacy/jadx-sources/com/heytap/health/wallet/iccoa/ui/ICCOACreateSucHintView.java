package com.heytap.health.wallet.iccoa.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.heytap.health.wallet.entrance.R$id;
import com.heytap.health.wallet.entrance.R$layout;
import com.heytap.log.formatter.LogFieldKey;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0002¢\u0006\u0004\b \u0010!J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006R\u0016\u0010\f\u001a\u00020\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0016\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\""}, d2 = {"Lcom/heytap/health/wallet/iccoa/ui/ICCOACreateSucHintView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "resId", "", "setLeftIconResource", "", "text", "setTitleText", "setSubtitleText", "i", "Landroidx/constraintlayout/widget/ConstraintLayout;", "rootView", "Landroid/widget/ImageView;", "j", "Landroid/widget/ImageView;", "leftIcon", "Landroid/widget/TextView;", MapSchema.FIELD_NAME_KEY, "Landroid/widget/TextView;", "title", LogFieldKey.LEVEL_KEY, "subtitle", "Landroid/view/View;", LogFieldKey.MESSAGE_KEY, "Landroid/view/View;", "vLine", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "entrance_release"}, k = 1, mv = {1, 8, 0})
public final class ICCOACreateSucHintView extends ConstraintLayout {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public ConstraintLayout rootView;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public ImageView leftIcon;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public TextView title;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public TextView subtitle;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public View vLine;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ICCOACreateSucHintView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void setLeftIconResource(int resId) {
        this.leftIcon.setImageResource(resId);
    }

    public final void setSubtitleText(@NotNull CharSequence text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.subtitle.setText(text);
    }

    public final void setTitleText(@NotNull CharSequence text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.title.setText(text);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ICCOACreateSucHintView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ ICCOACreateSucHintView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ICCOACreateSucHintView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        View viewInflate = View.inflate(context, R$layout.item_iccoa_create_suc_hint, this);
        Intrinsics.checkNotNull(viewInflate, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
        this.rootView = constraintLayout;
        View viewFindViewById = constraintLayout.findViewById(R$id.left_icon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "rootView.findViewById(R.id.left_icon)");
        this.leftIcon = (ImageView) viewFindViewById;
        View viewFindViewById2 = this.rootView.findViewById(R$id.title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "rootView.findViewById(R.id.title)");
        this.title = (TextView) viewFindViewById2;
        View viewFindViewById3 = this.rootView.findViewById(R$id.subtitle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "rootView.findViewById(R.id.subtitle)");
        this.subtitle = (TextView) viewFindViewById3;
        View viewFindViewById4 = this.rootView.findViewById(R$id.v_line);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "rootView.findViewById(R.id.v_line)");
        this.vLine = viewFindViewById4;
    }
}
