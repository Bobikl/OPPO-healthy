package com.oplus.deviceui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.RequiresApi;
import androidx.core.content.ContextCompat;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.udeviceui.R$id;
import com.heytap.udeviceui.R$layout;
import com.heytap.udeviceui.R$styleable;
import com.heytap.wearable.support.watchface.common.utils.ResourcesUtil;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.vek;
import com.oplus.smartenginehelper.ParserTag;
import com.oplus.smartenginehelper.entity.ViewEntity;
import io.netty.util.internal.StringUtil;
import io.protostuff.MapSchema;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 P2\u00020\u0001:\u0002QRB\u0011\b\u0016\u0012\u0006\u0010J\u001a\u00020I¢\u0006\u0004\bK\u0010LB\u001b\b\u0016\u0012\u0006\u0010J\u001a\u00020I\u0012\b\u0010N\u001a\u0004\u0018\u00010M¢\u0006\u0004\bK\u0010OJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\u001e\u0010\f\u001a\u00020\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0002J\b\u0010\r\u001a\u00020\u0002H\u0015J\u0012\u0010\u0010\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016J\u0012\u0010\u0012\u001a\u00020\n2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000eH\u0016J\u000e\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\nJ\u000e\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\nJ\u000e\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\nJ\u0006\u0010\u0018\u001a\u00020\u0002J\u000e\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\nJ\u0010\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001aH\u0007J\u0010\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001dH\u0007J\u000e\u0010 \u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001aJ\u000e\u0010\"\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\nJ\u000e\u0010%\u001a\u00020\u00022\u0006\u0010$\u001a\u00020#J\u000e\u0010&\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\nJ\u000e\u0010(\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\nR\u001c\u0010,\u001a\n **\u0004\u0018\u00010)0)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010+R\u0018\u0010.\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010-R\u0016\u00100\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010/R\u0016\u00101\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010/R\u0016\u00102\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010/R\u0016\u00104\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010/R\u0016\u00106\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u0010/R\u0016\u00108\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u0010/R\u0018\u0010;\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0018\u0010?\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0018\u0010A\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010>R*\u0010F\u001a\u0016\u0012\u0004\u0012\u00020\b\u0018\u00010Bj\n\u0012\u0004\u0012\u00020\b\u0018\u0001`C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER*\u0010H\u001a\u0016\u0012\u0004\u0012\u00020\b\u0018\u00010Bj\n\u0012\u0004\u0012\u00020\b\u0018\u0001`C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010E¨\u0006S"}, d2 = {"Lcom/oplus/deviceui/ModeButton;", "Landroid/widget/FrameLayout;", "", "j", MapSchema.FIELD_NAME_KEY, b2n.g, LogFieldKey.LEVEL_KEY, "", "Landroid/animation/Animator;", "list", "", "isSelectAnimator", "i", "onFinishInflate", "Landroid/view/MotionEvent;", "ev", "dispatchTouchEvent", "event", "onTouchEvent", "selected", "setButtonSelectedWithAnimation", "withProgress", "setWithProgress", "setButtonSelected", LogFieldKey.MESSAGE_KEY, b2n.f, "", "resId", "setIcon", "Landroid/graphics/drawable/Drawable;", ResourcesUtil.ResourceType.DRAWABLE, "value", "setbackgroundTint", "single", "setSinglePress", "Lcom/oplus/deviceui/ModeButton$b;", "listener", "setOnButtonClickListener", "setSingleChoose", ViewEntity.ENABLED, "setButtonEnabled", "", "kotlin.jvm.PlatformType", "Ljava/lang/String;", "TAG", "Landroid/graphics/drawable/Drawable;", "icon", "Z", "mSelected", "mWithProgress", "isLoading", "n", "mSinglePress", "o", "mSingleChoose", LogFieldKey.PROCESS_NAME_KEY, "mEnabled", "q", "Lcom/oplus/deviceui/ModeButton$b;", "mListener", "Landroid/animation/AnimatorSet;", "r", "Landroid/animation/AnimatorSet;", "mSelectAnimatorSet", "s", "mDownAnimatorSet", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "t", "Ljava/util/ArrayList;", "mAfterDownAnimatorList", "u", "mSelectAnimatorList", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Companion", "a", "b", "udeviceui_release"}, k = 1, mv = {1, 4, 2})
public class ModeButton extends FrameLayout {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public final String TAG;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public Drawable icon;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public boolean mSelected;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public boolean mWithProgress;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public boolean isLoading;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public boolean mSinglePress;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public boolean mSingleChoose;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public boolean mEnabled;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public b mListener;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public AnimatorSet mSelectAnimatorSet;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    public AnimatorSet mDownAnimatorSet;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public ArrayList<Animator> mAfterDownAnimatorList;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    public ArrayList<Animator> mSelectAnimatorList;
    public HashMap v;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&¨\u0006\u0007"}, d2 = {"Lcom/oplus/deviceui/ModeButton$b;", "", "", "selected", "isLoading", "", "a", "udeviceui_release"}, k = 1, mv = {1, 4, 2})
    public interface b {
        void a(boolean selected, boolean isLoading);
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/oplus/deviceui/ModeButton$c", "Landroid/animation/AnimatorListenerAdapter;", "Landroid/animation/Animator;", "animation", "", ParserTag.TAG_ON_ANIMATION_END, "udeviceui_release"}, k = 1, mv = {1, 4, 2})
    public static final class c extends AnimatorListenerAdapter {
        public c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@Nullable Animator animation) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = ModeButton.this.mAfterDownAnimatorList;
            if (arrayList2 == null || arrayList2.isEmpty()) {
                ModeButton.this.mAfterDownAnimatorList = null;
            } else {
                ArrayList arrayList3 = ModeButton.this.mAfterDownAnimatorList;
                Intrinsics.checkNotNull(arrayList3);
                arrayList.addAll(arrayList3);
            }
            ArrayList arrayList4 = ModeButton.this.mSelectAnimatorList;
            if (arrayList4 == null || arrayList4.isEmpty()) {
                ModeButton.this.mSelectAnimatorList = null;
            } else {
                ArrayList arrayList5 = ModeButton.this.mSelectAnimatorList;
                Intrinsics.checkNotNull(arrayList5);
                arrayList.addAll(arrayList5);
            }
            if (arrayList.isEmpty()) {
                return;
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            animatorSet.setDuration(340L);
            animatorSet.start();
            ArrayList arrayList6 = ModeButton.this.mAfterDownAnimatorList;
            if (arrayList6 != null) {
                arrayList6.clear();
            }
            ModeButton.this.mAfterDownAnimatorList = null;
            ModeButton.this.mDownAnimatorSet = null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModeButton(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.TAG = getClass().getSimpleName();
        this.mEnabled = true;
        View.inflate(getContext(), R$layout.mode_button_layout, this);
    }

    public View a(int i) {
        if (this.v == null) {
            this.v = new HashMap();
        }
        View view = (View) this.v.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(i);
        this.v.put(Integer.valueOf(i), viewFindViewById);
        return viewFindViewById;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(@Nullable MotionEvent ev) {
        if (this.mEnabled) {
            return super.dispatchTouchEvent(ev);
        }
        return false;
    }

    public final void g(boolean selected) {
        FrameLayout mContainerProgress = (FrameLayout) a(R$id.mContainerProgress);
        Intrinsics.checkNotNullExpressionValue(mContainerProgress, "mContainerProgress");
        mContainerProgress.setAlpha(0.0f);
        if (selected) {
            ImageView mPicNormal = (ImageView) a(R$id.mPicNormal);
            Intrinsics.checkNotNullExpressionValue(mPicNormal, "mPicNormal");
            mPicNormal.setAlpha(0.0f);
            ImageView mPicSelected = (ImageView) a(R$id.mPicSelected);
            Intrinsics.checkNotNullExpressionValue(mPicSelected, "mPicSelected");
            mPicSelected.setAlpha(1.0f);
            return;
        }
        ImageView mPicNormal2 = (ImageView) a(R$id.mPicNormal);
        Intrinsics.checkNotNullExpressionValue(mPicNormal2, "mPicNormal");
        mPicNormal2.setAlpha(1.0f);
        ImageView mPicSelected2 = (ImageView) a(R$id.mPicSelected);
        Intrinsics.checkNotNullExpressionValue(mPicSelected2, "mPicSelected");
        mPicSelected2.setAlpha(0.0f);
    }

    public final void h() {
        AnimatorSet animatorSet = new AnimatorSet();
        PathInterpolator pathInterpolator = new PathInterpolator(0.4f, 0.0f, 0.6f, 1.0f);
        ObjectAnimator scaleXAnimator = ObjectAnimator.ofFloat(this, "scaleX", 1.0f, 0.92f);
        ObjectAnimator scaleYAnimator = ObjectAnimator.ofFloat(this, "scaleY", 1.0f, 0.92f);
        Intrinsics.checkNotNullExpressionValue(scaleXAnimator, "scaleXAnimator");
        scaleXAnimator.setInterpolator(pathInterpolator);
        Intrinsics.checkNotNullExpressionValue(scaleYAnimator, "scaleYAnimator");
        scaleYAnimator.setInterpolator(pathInterpolator);
        animatorSet.playTogether(scaleXAnimator, scaleYAnimator);
        animatorSet.setDuration(200L);
        animatorSet.addListener(new c());
        animatorSet.start();
        this.mDownAnimatorSet = animatorSet;
    }

    public final void i(List<? extends Animator> list, boolean isSelectAnimator) {
        AnimatorSet animatorSet = this.mDownAnimatorSet;
        if (animatorSet == null || !animatorSet.isRunning()) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.playTogether(list);
            animatorSet2.setDuration(340L);
            animatorSet2.start();
            return;
        }
        if (isSelectAnimator) {
            if (this.mSelectAnimatorList == null) {
                this.mSelectAnimatorList = new ArrayList<>();
            }
            ArrayList<Animator> arrayList = this.mSelectAnimatorList;
            if (arrayList != null) {
                arrayList.addAll(list);
                return;
            }
            return;
        }
        if (this.mAfterDownAnimatorList == null) {
            this.mAfterDownAnimatorList = new ArrayList<>();
        }
        ArrayList<Animator> arrayList2 = this.mAfterDownAnimatorList;
        if (arrayList2 != null) {
            arrayList2.addAll(list);
        }
    }

    public final void j() {
        ObjectAnimator mIconSelectedAlpha;
        ArrayList arrayList = new ArrayList();
        ObjectAnimator mIconNormalAlpha = ObjectAnimator.ofFloat((ImageView) a(R$id.mPicNormal), "alpha", 1.0f, 0.0f);
        if (this.mWithProgress) {
            this.isLoading = true;
            mIconSelectedAlpha = ObjectAnimator.ofFloat((FrameLayout) a(R$id.mContainerProgress), "alpha", 0.0f, 1.0f);
        } else {
            mIconSelectedAlpha = ObjectAnimator.ofFloat((ImageView) a(R$id.mPicSelected), "alpha", 0.0f, 1.0f);
        }
        PathInterpolator pathInterpolator = new PathInterpolator(0.0f, 0.0f, 0.2f, 1.0f);
        Intrinsics.checkNotNullExpressionValue(mIconNormalAlpha, "mIconNormalAlpha");
        mIconNormalAlpha.setInterpolator(pathInterpolator);
        Intrinsics.checkNotNullExpressionValue(mIconSelectedAlpha, "mIconSelectedAlpha");
        mIconSelectedAlpha.setInterpolator(pathInterpolator);
        arrayList.add(mIconNormalAlpha);
        arrayList.add(mIconSelectedAlpha);
        i(arrayList, true);
    }

    public final void k() {
        ObjectAnimator mIconNormalAlpha;
        ArrayList arrayList = new ArrayList();
        ObjectAnimator mIconSelectedAlpha = ObjectAnimator.ofFloat((ImageView) a(R$id.mPicSelected), "alpha", 1.0f, 0.0f);
        if (this.mWithProgress) {
            this.isLoading = true;
            mIconNormalAlpha = ObjectAnimator.ofFloat((FrameLayout) a(R$id.mContainerProgress), "alpha", 0.0f, 1.0f);
        } else {
            mIconNormalAlpha = ObjectAnimator.ofFloat((ImageView) a(R$id.mPicNormal), "alpha", 0.0f, 1.0f);
        }
        PathInterpolator pathInterpolator = new PathInterpolator(0.0f, 0.0f, 0.2f, 1.0f);
        Intrinsics.checkNotNullExpressionValue(mIconNormalAlpha, "mIconNormalAlpha");
        mIconNormalAlpha.setInterpolator(pathInterpolator);
        Intrinsics.checkNotNullExpressionValue(mIconSelectedAlpha, "mIconSelectedAlpha");
        mIconSelectedAlpha.setInterpolator(pathInterpolator);
        arrayList.add(mIconNormalAlpha);
        arrayList.add(mIconSelectedAlpha);
        i(arrayList, true);
    }

    public final void l() {
        ArrayList arrayList = new ArrayList();
        PathInterpolator pathInterpolator = new PathInterpolator(0.0f, 0.0f, 0.2f, 1.0f);
        ObjectAnimator scaleXAnimator = ObjectAnimator.ofFloat(this, "scaleX", 0.92f, 1.0f);
        ObjectAnimator scaleYAnimator = ObjectAnimator.ofFloat(this, "scaleY", 0.92f, 1.0f);
        Intrinsics.checkNotNullExpressionValue(scaleXAnimator, "scaleXAnimator");
        scaleXAnimator.setInterpolator(pathInterpolator);
        Intrinsics.checkNotNullExpressionValue(scaleYAnimator, "scaleYAnimator");
        scaleYAnimator.setInterpolator(pathInterpolator);
        arrayList.add(scaleXAnimator);
        arrayList.add(scaleYAnimator);
        i(arrayList, false);
    }

    public final void m() {
        if (this.isLoading) {
            Log.d(this.TAG, "current is loading, no need show again.");
            return;
        }
        this.isLoading = true;
        FrameLayout mContainerProgress = (FrameLayout) a(R$id.mContainerProgress);
        Intrinsics.checkNotNullExpressionValue(mContainerProgress, "mContainerProgress");
        mContainerProgress.setAlpha(1.0f);
        ImageView mPicNormal = (ImageView) a(R$id.mPicNormal);
        Intrinsics.checkNotNullExpressionValue(mPicNormal, "mPicNormal");
        mPicNormal.setAlpha(0.0f);
        ImageView mPicSelected = (ImageView) a(R$id.mPicSelected);
        Intrinsics.checkNotNullExpressionValue(mPicSelected, "mPicSelected");
        mPicSelected.setAlpha(0.0f);
    }

    @Override // android.view.View
    @RequiresApi(23)
    public void onFinishInflate() {
        super.onFinishInflate();
        Drawable drawable = this.icon;
        if (drawable != null) {
            setIcon(drawable);
        }
        if (this.mSelected) {
            ImageView mPicNormal = (ImageView) a(R$id.mPicNormal);
            Intrinsics.checkNotNullExpressionValue(mPicNormal, "mPicNormal");
            mPicNormal.setAlpha(0.0f);
            ImageView mPicSelected = (ImageView) a(R$id.mPicSelected);
            Intrinsics.checkNotNullExpressionValue(mPicSelected, "mPicSelected");
            mPicSelected.setAlpha(1.0f);
        }
        ImageView mPicSelected2 = (ImageView) a(R$id.mPicSelected);
        Intrinsics.checkNotNullExpressionValue(mPicSelected2, "mPicSelected");
        vek vekVar = vek.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        mPicSelected2.setBackgroundTintList(ColorStateList.valueOf(vekVar.c(context)));
    }

    @Override // android.view.View
    public boolean onTouchEvent(@Nullable MotionEvent event) {
        Integer numValueOf = event != null ? Integer.valueOf(event.getAction()) : null;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            if (this.isLoading) {
                Log.d(this.TAG, "current is loading.");
                return false;
            }
            Log.d(this.TAG, "ACTION_DOWN");
            h();
        } else if (numValueOf != null && numValueOf.intValue() == 1) {
            if (this.isLoading) {
                return false;
            }
            Log.d(this.TAG, "ACTION_UP " + this.mSinglePress + StringUtil.SPACE + this.mWithProgress + StringUtil.SPACE + this.isLoading + StringUtil.SPACE + this.mSingleChoose);
            l();
            if (this.mSinglePress) {
                b bVar = this.mListener;
                if (bVar != null) {
                    bVar.a(this.mSelected, this.mWithProgress);
                }
                return super.onTouchEvent(event);
            }
            if (this.mWithProgress && this.isLoading) {
                return super.onTouchEvent(event);
            }
            if (!this.mSelected) {
                j();
            } else {
                if (this.mSingleChoose) {
                    return super.onTouchEvent(event);
                }
                k();
            }
            boolean z = this.mWithProgress;
            if (!z) {
                this.mSelected = !this.mSelected;
            }
            b bVar2 = this.mListener;
            if (bVar2 != null) {
                bVar2.a(this.mSelected, z);
            }
        }
        return true;
    }

    public final void setButtonEnabled(boolean enabled) {
        Log.d(getClass().getSimpleName(), "setmEnabled " + enabled);
        this.mEnabled = enabled;
        setEnabled(enabled);
        if (this.mEnabled) {
            setAlpha(1.0f);
        } else {
            setAlpha(0.3f);
        }
    }

    public final void setButtonSelected(boolean selected) {
        this.mSelected = selected;
        FrameLayout mContainerProgress = (FrameLayout) a(R$id.mContainerProgress);
        Intrinsics.checkNotNullExpressionValue(mContainerProgress, "mContainerProgress");
        mContainerProgress.setAlpha(0.0f);
        this.isLoading = false;
        if (selected) {
            ImageView mPicNormal = (ImageView) a(R$id.mPicNormal);
            Intrinsics.checkNotNullExpressionValue(mPicNormal, "mPicNormal");
            mPicNormal.setAlpha(0.0f);
            ImageView mPicSelected = (ImageView) a(R$id.mPicSelected);
            Intrinsics.checkNotNullExpressionValue(mPicSelected, "mPicSelected");
            mPicSelected.setAlpha(1.0f);
            return;
        }
        ImageView mPicNormal2 = (ImageView) a(R$id.mPicNormal);
        Intrinsics.checkNotNullExpressionValue(mPicNormal2, "mPicNormal");
        mPicNormal2.setAlpha(1.0f);
        ImageView mPicSelected2 = (ImageView) a(R$id.mPicSelected);
        Intrinsics.checkNotNullExpressionValue(mPicSelected2, "mPicSelected");
        mPicSelected2.setAlpha(0.0f);
    }

    public final void setButtonSelectedWithAnimation(boolean selected) {
        ObjectAnimator objectAnimatorOfFloat;
        ObjectAnimator objectAnimatorOfFloat2;
        AnimatorSet animatorSet;
        Log.d(getClass().getSimpleName(), "setButtonSelectedWithAnimation isEnable? " + this.mEnabled + ", isSelected? " + this.mSelected + StringUtil.SPACE + this.mWithProgress + ", isLoading? " + this.isLoading + StringUtil.SPACE + selected);
        if (this.mEnabled) {
            if (this.mSelected == selected && !this.isLoading) {
                Log.d(this.TAG, "selected is same");
                return;
            }
            ArrayList<Animator> arrayList = this.mSelectAnimatorList;
            if (arrayList != null) {
                arrayList.clear();
            }
            this.mSelectAnimatorList = null;
            AnimatorSet animatorSet2 = this.mSelectAnimatorSet;
            if (animatorSet2 != null && animatorSet2.isRunning() && (animatorSet = this.mSelectAnimatorSet) != null) {
                animatorSet.cancel();
            }
            this.mSelectAnimatorSet = new AnimatorSet();
            if (this.mWithProgress && this.isLoading) {
                objectAnimatorOfFloat = ObjectAnimator.ofFloat((FrameLayout) a(R$id.mContainerProgress), "alpha", 1.0f, 0.0f);
                Intrinsics.checkNotNullExpressionValue(objectAnimatorOfFloat, "ObjectAnimator.ofFloat(m…rogress, \"alpha\", 1f, 0f)");
            } else if (selected) {
                objectAnimatorOfFloat = ObjectAnimator.ofFloat((ImageView) a(R$id.mPicNormal), "alpha", 1.0f, 0.0f);
                Intrinsics.checkNotNullExpressionValue(objectAnimatorOfFloat, "ObjectAnimator.ofFloat(m…cNormal, \"alpha\", 1f, 0f)");
            } else {
                objectAnimatorOfFloat = ObjectAnimator.ofFloat((ImageView) a(R$id.mPicSelected), "alpha", 1.0f, 0.0f);
                Intrinsics.checkNotNullExpressionValue(objectAnimatorOfFloat, "ObjectAnimator.ofFloat(m…elected, \"alpha\", 1f, 0f)");
            }
            if (selected) {
                objectAnimatorOfFloat2 = ObjectAnimator.ofFloat((ImageView) a(R$id.mPicSelected), "alpha", 0.0f, 1.0f);
                Intrinsics.checkNotNullExpressionValue(objectAnimatorOfFloat2, "ObjectAnimator.ofFloat(m…elected, \"alpha\", 0f, 1f)");
                ImageView mPicNormal = (ImageView) a(R$id.mPicNormal);
                Intrinsics.checkNotNullExpressionValue(mPicNormal, "mPicNormal");
                mPicNormal.setAlpha(0.0f);
            } else {
                objectAnimatorOfFloat2 = ObjectAnimator.ofFloat((ImageView) a(R$id.mPicNormal), "alpha", 0.0f, 1.0f);
                Intrinsics.checkNotNullExpressionValue(objectAnimatorOfFloat2, "ObjectAnimator.ofFloat(m…cNormal, \"alpha\", 0f, 1f)");
                ImageView mPicSelected = (ImageView) a(R$id.mPicSelected);
                Intrinsics.checkNotNullExpressionValue(mPicSelected, "mPicSelected");
                mPicSelected.setAlpha(0.0f);
            }
            AnimatorSet animatorSet3 = this.mSelectAnimatorSet;
            if (animatorSet3 != null) {
                animatorSet3.playTogether(objectAnimatorOfFloat2, objectAnimatorOfFloat);
            }
            AnimatorSet animatorSet4 = this.mSelectAnimatorSet;
            if (animatorSet4 != null) {
                animatorSet4.setDuration(340L);
            }
            AnimatorSet animatorSet5 = this.mSelectAnimatorSet;
            if (animatorSet5 != null) {
                animatorSet5.start();
            }
            this.isLoading = false;
            this.mSelected = selected;
        }
    }

    @RequiresApi(23)
    public final void setIcon(int resId) {
        Drawable drawable = ContextCompat.getDrawable(getContext(), resId);
        if (drawable != null) {
            setIcon(drawable);
        }
    }

    public final void setOnButtonClickListener(@NotNull b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.mListener = listener;
    }

    public final void setSingleChoose(boolean single) {
        this.mSingleChoose = single;
    }

    public final void setSinglePress(boolean single) {
        this.mSinglePress = single;
    }

    public final void setWithProgress(boolean withProgress) {
        this.mWithProgress = withProgress;
    }

    public final void setbackgroundTint(int value) {
        ImageView mPicSelected = (ImageView) a(R$id.mPicSelected);
        Intrinsics.checkNotNullExpressionValue(mPicSelected, "mPicSelected");
        mPicSelected.setBackgroundTintList(ColorStateList.valueOf(value));
    }

    @RequiresApi(23)
    public final void setIcon(@NotNull Drawable drawable) {
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        ImageView mPicNormal = (ImageView) a(R$id.mPicNormal);
        Intrinsics.checkNotNullExpressionValue(mPicNormal, "mPicNormal");
        mPicNormal.setForeground(drawable);
        ImageView mPicSelected = (ImageView) a(R$id.mPicSelected);
        Intrinsics.checkNotNullExpressionValue(mPicSelected, "mPicSelected");
        Drawable.ConstantState constantState = drawable.getConstantState();
        mPicSelected.setForeground(constantState != null ? constantState.newDrawable() : null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModeButton(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.TAG = getClass().getSimpleName();
        this.mEnabled = true;
        View.inflate(getContext(), R$layout.mode_button_layout, this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.UDeviceModeButton);
        this.icon = typedArrayObtainStyledAttributes.getDrawable(R$styleable.UDeviceModeButton_centerIcon);
        this.mSelected = typedArrayObtainStyledAttributes.getBoolean(R$styleable.UDeviceModeButton_selected, false);
        typedArrayObtainStyledAttributes.recycle();
    }
}
