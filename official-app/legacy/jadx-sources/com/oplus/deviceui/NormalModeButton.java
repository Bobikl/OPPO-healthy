package com.oplus.deviceui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.PathInterpolator;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import coil.ComponentRegistry;
import coil.ImageLoader;
import coil.decode.SvgDecoder;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.store.base.core.state.Constants;
import com.heytap.udeviceui.R$color;
import com.heytap.udeviceui.R$dimen;
import com.heytap.udeviceui.R$drawable;
import com.heytap.udeviceui.R$id;
import com.heytap.udeviceui.R$layout;
import com.heytap.wearable.support.watchface.common.utils.ResourcesUtil;
import com.oplus.aiunit.vision.coj;
import com.oplus.aiunit.vision.pw7;
import com.oplus.smartenginehelper.ParserTag;
import com.sensorsdata.analytics.android.autotrack.aop.SensorsDataAutoTrackHelper;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 H2\u00020\u0001:\u0002IJB\u0011\b\u0016\u0012\u0006\u0010B\u001a\u00020A¢\u0006\u0004\bC\u0010DB\u001b\b\u0016\u0012\u0006\u0010B\u001a\u00020A\u0012\b\u0010F\u001a\u0004\u0018\u00010E¢\u0006\u0004\bC\u0010GJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J#\u0010\n\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0002H\u0002J\b\u0010\r\u001a\u00020\u0002H\u0002J\b\u0010\u000e\u001a\u00020\u0002H\u0002J\b\u0010\u000f\u001a\u00020\u0002H\u0002J\u000e\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010J\u001a\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00102\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014J\u000e\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017J\u000e\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0014J\u000e\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0017J\u000e\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001dJ\u001e\u0010\"\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u0005J\u000e\u0010#\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005J\u0018\u0010$\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u0005J\u000e\u0010%\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u0005J\u0012\u0010(\u001a\u00020\u00052\b\u0010'\u001a\u0004\u0018\u00010&H\u0016R\u0016\u0010+\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010/\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00103\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00106\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u00105R\u0018\u00108\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u00107R\u0018\u0010:\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u00109R\u0018\u0010<\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010;R\u0018\u0010>\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010=R\u0018\u0010@\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010?¨\u0006K"}, d2 = {"Lcom/oplus/deviceui/NormalModeButton;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "v", "t", "", "enable", "s", "isSelected", "isAnim", "u", "(Ljava/lang/Boolean;Z)V", LogFieldKey.LEVEL_KEY, "o", LogFieldKey.MESSAGE_KEY, "n", "", "name", "setName", "iconUri", "Landroid/graphics/drawable/Drawable;", "placeholder", "r", "", "resId", "setIcon", ResourcesUtil.ResourceType.DRAWABLE, "color", "setSelectedColor", "Lcom/oplus/deviceui/NormalModeButton$c;", "listener", "setListener", "selected", Constants.LOADING, "q", "setEnableState", LogFieldKey.PROCESS_NAME_KEY, "setLoadingState", "Landroid/view/MotionEvent;", "event", "onTouchEvent", "i", "Z", "isLoading", "Landroid/widget/ImageView;", "j", "Landroid/widget/ImageView;", "mImageView", "Landroid/widget/TextView;", MapSchema.FIELD_NAME_KEY, "Landroid/widget/TextView;", "mModeNameTv", "Landroid/widget/ProgressBar;", "Landroid/widget/ProgressBar;", "mProgressView", "Lcom/oplus/deviceui/NormalModeButton$c;", "mListener", "Landroid/graphics/drawable/Drawable;", "mIconDrawable", "Ljava/lang/Integer;", "mSelectedColor", "Ljava/lang/String;", "mIconUri", "Ljava/lang/Boolean;", "mSelected", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Companion", "b", "c", "udeviceui_release"}, k = 1, mv = {1, 4, 2})
public class NormalModeButton extends ConstraintLayout {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public boolean isLoading;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public final ImageView mImageView;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public final TextView mModeNameTv;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public final ProgressBar mProgressView;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public c mListener;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public Drawable mIconDrawable;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public Integer mSelectedColor;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public String mIconUri;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public Boolean mSelected;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", ParserTag.TAG_ONCLICK}, k = 3, mv = {1, 4, 2})
    public static final class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        @SensorsDataInstrumented
        public final void onClick(View view) {
            if (!NormalModeButton.this.isEnabled() || NormalModeButton.this.isLoading) {
                SensorsDataAutoTrackHelper.trackViewOnClick(view);
                return;
            }
            Boolean bool = NormalModeButton.this.mSelected;
            boolean z = !(bool != null ? bool.booleanValue() : false);
            c cVar = NormalModeButton.this.mListener;
            if (cVar != null) {
                cVar.a(z);
            }
            SensorsDataAutoTrackHelper.trackViewOnClick(view);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, d2 = {"Lcom/oplus/deviceui/NormalModeButton$c;", "", "", "selected", "", "a", "udeviceui_release"}, k = 1, mv = {1, 4, 2})
    public interface c {
        void a(boolean selected);
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\n"}, d2 = {"com/oplus/deviceui/NormalModeButton$d", "Lcom/oplus/aiunit/vision/coj;", "Landroid/graphics/drawable/Drawable;", "placeholder", "", "b", "error", "c", "result", "a", "coil-base_release"}, k = 1, mv = {1, 4, 2})
    public static final class d implements coj {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f19691j;

        public d(NormalModeButton normalModeButton, NormalModeButton normalModeButton2, String str) {
            this.f19691j = str;
        }

        @Override // com.oplus.aiunit.vision.coj
        public void a(@NotNull Drawable result) {
            Intrinsics.checkNotNullParameter(result, "result");
            NormalModeButton.this.setIcon(result);
            NormalModeButton.this.mIconUri = this.f19691j;
            NormalModeButton.this.v();
        }

        @Override // com.oplus.aiunit.vision.coj
        public void b(@Nullable Drawable placeholder) {
            if (placeholder != null) {
                NormalModeButton.this.setIcon(placeholder);
                NormalModeButton.this.v();
            }
        }

        @Override // com.oplus.aiunit.vision.coj
        public void c(@Nullable Drawable error) {
            if (error != null) {
                NormalModeButton.this.setIcon(error);
                NormalModeButton.this.v();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 2})
    public static final class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            NormalModeButton.this.m();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 2})
    public static final class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            NormalModeButton.this.n();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NormalModeButton(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(getContext(), R$layout.normal_mode_button, this);
        View viewFindViewById = findViewById(R$id.image);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(R.id.image)");
        ImageView imageView = (ImageView) viewFindViewById;
        this.mImageView = imageView;
        View viewFindViewById2 = findViewById(R$id.mode_name);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(R.id.mode_name)");
        TextView textView = (TextView) viewFindViewById2;
        this.mModeNameTv = textView;
        View viewFindViewById3 = findViewById(R$id.progress);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(R.id.progress)");
        this.mProgressView = (ProgressBar) viewFindViewById3;
        pw7 pw7Var = pw7.INSTANCE;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        textView.setTextSize(pw7Var.a(context2));
        imageView.setOnClickListener(new a());
    }

    public final void l() {
        PathInterpolator pathInterpolator = new PathInterpolator(0.4f, 0.0f, 0.6f, 1.0f);
        ObjectAnimator scaleXAnimator = ObjectAnimator.ofFloat(this.mImageView, "scaleX", 1.0f, 0.92f);
        ObjectAnimator scaleYAnimator = ObjectAnimator.ofFloat(this.mImageView, "scaleY", 1.0f, 0.92f);
        Intrinsics.checkNotNullExpressionValue(scaleXAnimator, "scaleXAnimator");
        scaleXAnimator.setInterpolator(pathInterpolator);
        Intrinsics.checkNotNullExpressionValue(scaleYAnimator, "scaleYAnimator");
        scaleYAnimator.setInterpolator(pathInterpolator);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(scaleXAnimator, scaleYAnimator);
        animatorSet.setDuration(200L);
        animatorSet.start();
    }

    public final void m() {
        ObjectAnimator animator = ObjectAnimator.ofFloat(this.mImageView, "alpha", 0.0f, 1.0f);
        PathInterpolator pathInterpolator = new PathInterpolator(0.0f, 0.0f, 0.2f, 1.0f);
        Intrinsics.checkNotNullExpressionValue(animator, "animator");
        animator.setInterpolator(pathInterpolator);
        animator.setDuration(340L);
        animator.start();
    }

    public final void n() {
        ObjectAnimator animator = ObjectAnimator.ofFloat(this.mImageView, "alpha", 1.0f, 0.0f);
        PathInterpolator pathInterpolator = new PathInterpolator(0.0f, 0.0f, 0.2f, 1.0f);
        Intrinsics.checkNotNullExpressionValue(animator, "animator");
        animator.setInterpolator(pathInterpolator);
        animator.setDuration(340L);
        animator.start();
    }

    public final void o() {
        PathInterpolator pathInterpolator = new PathInterpolator(0.0f, 0.0f, 0.2f, 1.0f);
        ObjectAnimator scaleXAnimator = ObjectAnimator.ofFloat(this.mImageView, "scaleX", 0.92f, 1.0f);
        ObjectAnimator scaleYAnimator = ObjectAnimator.ofFloat(this.mImageView, "scaleY", 0.92f, 1.0f);
        Intrinsics.checkNotNullExpressionValue(scaleXAnimator, "scaleXAnimator");
        scaleXAnimator.setInterpolator(pathInterpolator);
        Intrinsics.checkNotNullExpressionValue(scaleYAnimator, "scaleYAnimator");
        scaleYAnimator.setInterpolator(pathInterpolator);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(scaleXAnimator, scaleYAnimator);
        animatorSet.setDuration(340L);
        animatorSet.start();
    }

    @Override // android.view.View
    public boolean onTouchEvent(@Nullable MotionEvent event) {
        if (isEnabled() && !this.isLoading) {
            Integer numValueOf = event != null ? Integer.valueOf(event.getAction()) : null;
            if (numValueOf != null && numValueOf.intValue() == 0) {
                l();
            } else if (numValueOf != null && numValueOf.intValue() == 1) {
                o();
            }
        }
        return false;
    }

    public final void p(boolean isSelected, boolean isAnim) {
        Log.d("UDeviceNormalModeButton", "set selected state name=" + this.mModeNameTv.getText() + ",old state=" + this.mSelected + ",new state=" + isSelected + ",isAnim=" + isAnim);
        if (Intrinsics.areEqual(Boolean.valueOf(isSelected), this.mSelected)) {
            return;
        }
        this.mSelected = Boolean.valueOf(isSelected);
        if (this.isLoading) {
            t();
        } else {
            this.mProgressView.setVisibility(8);
            u(this.mSelected, isAnim);
        }
    }

    public final void q(boolean selected, boolean enable, boolean loading) {
        setLoadingState(loading);
        setEnableState(enable);
        p(selected, loading);
    }

    public final void r(@NotNull String iconUri, @Nullable Drawable placeholder) {
        Intrinsics.checkNotNullParameter(iconUri, "iconUri");
        if (StringsKt__StringsJVMKt.isBlank(iconUri)) {
            if (placeholder != null) {
                setIcon(placeholder);
                return;
            }
            return;
        }
        if (Intrinsics.areEqual(iconUri, this.mIconUri)) {
            Log.d("UDeviceNormalModeButton", "current uri is the same, no need request again.");
            return;
        }
        Log.d("UDeviceNormalModeButton", "set icon: " + iconUri);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R$dimen.mode_image_size);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        coil.request.a aVarB = new coil.request.a.C0136a(context2).e(iconUri).a(Bitmap.Config.ARGB_8888).i(placeholder).p(dimensionPixelSize).u(new d(this, this, iconUri)).b();
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "context");
        ImageLoader.Builder builderB = new ImageLoader.Builder(context3).b(true);
        ComponentRegistry.Builder builder = new ComponentRegistry.Builder();
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "context");
        builder.add(new SvgDecoder(context4, false, 2, null));
        Unit unit = Unit.INSTANCE;
        builderB.d(builder.e()).c().a(aVarB);
    }

    public final void s(boolean enable) {
        if (isEnabled() == enable) {
            return;
        }
        setEnabled(enable);
        setAlpha(enable ? 1.0f : 0.3f);
    }

    public final void setEnableState(boolean enable) {
        s(enable);
    }

    public final void setIcon(int resId) {
        Drawable drawable = ContextCompat.getDrawable(getContext(), resId);
        if (drawable != null) {
            setIcon(drawable);
        }
    }

    public final void setListener(@NotNull c listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.mListener = listener;
    }

    public final void setLoadingState(boolean loading) {
        if (this.isLoading == loading) {
            Log.d("UDeviceNormalModeButton", "current loading state is same");
        } else {
            this.isLoading = loading;
            v();
        }
    }

    public final void setName(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.mModeNameTv.setText(name);
        this.mImageView.setContentDescription(name);
    }

    public final void setSelectedColor(int color) {
        this.mSelectedColor = Integer.valueOf(color);
        Log.d("UDeviceNormalModeButton", "setSelectedColor name=" + this.mModeNameTv.getText() + " mSelected=" + this.mSelected + ",isLoading=" + this.mSelected + ",color=" + color);
        if (!Intrinsics.areEqual(this.mSelected, Boolean.TRUE) || this.isLoading) {
            return;
        }
        ImageView imageView = this.mImageView;
        Integer num = this.mSelectedColor;
        imageView.setBackgroundTintList(num != null ? ColorStateList.valueOf(num.intValue()) : null);
    }

    public final void t() {
        this.mImageView.setBackgroundResource(R$drawable.mode_button_bg);
        this.mImageView.setImageDrawable(null);
        this.mProgressView.setVisibility(0);
        this.mImageView.setBackgroundTintList(null);
    }

    public final void u(Boolean isSelected, boolean isAnim) {
        this.mImageView.setImageDrawable(this.mIconDrawable);
        if (!Intrinsics.areEqual(isSelected, Boolean.TRUE)) {
            this.mImageView.setBackgroundTintList(null);
            this.mImageView.setBackgroundResource(R$drawable.mode_button_bg);
            this.mImageView.setImageTintList(ColorStateList.valueOf(ContextCompat.getColor(getContext(), R$color.mode_button_icon_normal_tint)));
            if (isAnim) {
                this.mImageView.post(new f());
                return;
            }
            return;
        }
        this.mImageView.setBackgroundResource(R$drawable.mode_button_bg_selected);
        this.mImageView.setImageTintList(ColorStateList.valueOf(-1));
        ImageView imageView = this.mImageView;
        Integer num = this.mSelectedColor;
        imageView.setBackgroundTintList(num != null ? ColorStateList.valueOf(num.intValue()) : null);
        if (isAnim) {
            this.mImageView.post(new e());
        }
    }

    public final void v() {
        if (this.isLoading) {
            t();
        } else {
            this.mProgressView.setVisibility(8);
            u(this.mSelected, false);
        }
    }

    public final void setIcon(@NotNull Drawable drawable) {
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        this.mIconDrawable = drawable;
        this.mImageView.setImageDrawable(drawable);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NormalModeButton(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(getContext(), R$layout.normal_mode_button, this);
        View viewFindViewById = findViewById(R$id.image);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(R.id.image)");
        ImageView imageView = (ImageView) viewFindViewById;
        this.mImageView = imageView;
        View viewFindViewById2 = findViewById(R$id.mode_name);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(R.id.mode_name)");
        TextView textView = (TextView) viewFindViewById2;
        this.mModeNameTv = textView;
        View viewFindViewById3 = findViewById(R$id.progress);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(R.id.progress)");
        this.mProgressView = (ProgressBar) viewFindViewById3;
        pw7 pw7Var = pw7.INSTANCE;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        textView.setTextSize(pw7Var.a(context2));
        imageView.setOnClickListener(new a());
    }
}
