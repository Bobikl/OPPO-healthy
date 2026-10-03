package com.oplus.feedback.common.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.customer.feedback.sdk.R;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/oplus/feedback/common/view/FbLoadingView;", "Landroid/widget/RelativeLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Feedback_sdkRelease"}, k = 1, mv = {1, 8, 0})
public final class FbLoadingView extends RelativeLayout {

    @Nullable
    public final View i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public final ProgressBar f19883j;

    public FbLoadingView(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        View.inflate(context, R.layout.fb_loading_view, this);
        this.i = findViewById(R.id.rl_loading);
        this.f19883j = (ProgressBar) findViewById(R.id.pb_loading);
        a();
    }

    @SuppressLint({"UseCompatLoadingForDrawables"})
    public final void a() {
        Drawable indeterminateDrawable;
        Drawable drawable = getContext().getDrawable(R.drawable.fb_progress_anim);
        ProgressBar progressBar = this.f19883j;
        Rect bounds = (progressBar == null || (indeterminateDrawable = progressBar.getIndeterminateDrawable()) == null) ? null : indeterminateDrawable.getBounds();
        View view = this.i;
        if (view != null) {
            view.setBackgroundColor(getContext().getColor(R.color.fb_loading_container_background_color));
        }
        ProgressBar progressBar2 = this.f19883j;
        if (progressBar2 != null) {
            progressBar2.setIndeterminateDrawable(drawable);
        }
        ProgressBar progressBar3 = this.f19883j;
        Drawable indeterminateDrawable2 = progressBar3 != null ? progressBar3.getIndeterminateDrawable() : null;
        if (indeterminateDrawable2 == null) {
            return;
        }
        if (bounds == null) {
            bounds = new Rect();
        }
        indeterminateDrawable2.setBounds(bounds);
    }
}
