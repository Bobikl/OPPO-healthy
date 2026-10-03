package com.heytap.nearx.uikit.widget.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.preference.PreferenceViewHolder;
import com.heytap.health.wallet.ui.adapter.BaseRecyclerViewHolder;
import com.heytap.nearx.uikit.R$attr;
import com.heytap.nearx.uikit.R$id;
import com.oplus.aiunit.vision.gjc;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B%\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u0012\u001a\u00020\u0013H\u0002J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0006\u0010\u0017\u001a\u00020\u0013J\u000e\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\nR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u000b\"\u0004\b\f\u0010\rR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/heytap/nearx/uikit/widget/preference/NearJumpLoadingPreference;", "Lcom/heytap/nearx/uikit/widget/preference/NearPreference;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "isLoading", "", "()Z", "setLoading", "(Z)V", "nearLoadingView", "Landroid/widget/ImageView;", "rotateAnimation", "Landroid/view/animation/RotateAnimation;", "initAnimation", "", "onBindViewHolder", BaseRecyclerViewHolder.HOLDER_TAG_HEADER, "Landroidx/preference/PreferenceViewHolder;", "releaseResource", "setLoadingViewVisible", "isVisible", "nearx_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public class NearJumpLoadingPreference extends NearPreference {
    private boolean isLoading;

    @Nullable
    private ImageView nearLoadingView;

    @Nullable
    private RotateAnimation rotateAnimation;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public NearJumpLoadingPreference(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void initAnimation() {
        this.rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        RotateAnimation rotateAnimation = this.rotateAnimation;
        if (rotateAnimation != null) {
            rotateAnimation.setInterpolator(linearInterpolator);
        }
        RotateAnimation rotateAnimation2 = this.rotateAnimation;
        if (rotateAnimation2 != null) {
            rotateAnimation2.setDuration(1500L);
        }
        RotateAnimation rotateAnimation3 = this.rotateAnimation;
        if (rotateAnimation3 != null) {
            rotateAnimation3.setRepeatCount(-1);
        }
        RotateAnimation rotateAnimation4 = this.rotateAnimation;
        if (rotateAnimation4 != null) {
            rotateAnimation4.setFillAfter(true);
        }
        RotateAnimation rotateAnimation5 = this.rotateAnimation;
        if (rotateAnimation5 != null) {
            rotateAnimation5.setStartOffset(10L);
        }
        ImageView imageView = this.nearLoadingView;
        if (imageView == null) {
            return;
        }
        imageView.setAnimation(this.rotateAnimation);
    }

    /* JADX INFO: renamed from: isLoading, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    @Override // com.heytap.nearx.uikit.widget.preference.NearPreference, androidx.preference.Preference
    public void onBindViewHolder(@NotNull PreferenceViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.onBindViewHolder(holder);
        if (gjc.c()) {
            LinearLayout linearLayout = (LinearLayout) holder.findViewById(R$id.loading_container);
            if (linearLayout != null) {
                linearLayout.setPaddingRelative(0, 0, 0, 0);
            }
            ImageView imageView = (ImageView) holder.findViewById(R$id.nx_preference_widget_jump);
            if (imageView != null) {
                imageView.setVisibility(8);
            }
        }
        this.nearLoadingView = (ImageView) holder.findViewById(R$id.preference_loadingView);
        setLoadingViewVisible(this.isLoading);
        initAnimation();
    }

    public final void releaseResource() {
        RotateAnimation rotateAnimation = this.rotateAnimation;
        if (rotateAnimation != null) {
            rotateAnimation.cancel();
        }
        this.rotateAnimation = null;
    }

    public final void setLoading(boolean z) {
        this.isLoading = z;
    }

    public final void setLoadingViewVisible(boolean isVisible) {
        this.isLoading = isVisible;
        if (isVisible) {
            ImageView imageView = this.nearLoadingView;
            if (imageView == null) {
                return;
            }
            imageView.setVisibility(0);
            return;
        }
        ImageView imageView2 = this.nearLoadingView;
        if (imageView2 == null) {
            return;
        }
        imageView2.setVisibility(8);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public NearJumpLoadingPreference(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public NearJumpLoadingPreference(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.isLoading = true;
    }

    public /* synthetic */ NearJumpLoadingPreference(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? R$attr.NearJumpLoadingPreferenceStyle : i);
    }
}
