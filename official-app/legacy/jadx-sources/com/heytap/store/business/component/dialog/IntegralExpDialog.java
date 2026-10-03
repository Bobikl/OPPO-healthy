package com.heytap.store.business.component.dialog;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.heytap.store.base.core.util.deeplink.DeeplinkHelper;
import com.heytap.store.business.component.R;
import com.heytap.store.business.component.dialog.IntegralExpDialog;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.e30;
import com.oplus.aiunit.vision.ixb;
import com.oplus.aiunit.vision.kbd;
import com.oplus.aiunit.vision.p14;
import com.oplus.mydevices.sdk.compat.DeviceInfoCompat;
import com.oplus.smartenginehelper.entity.TextEntity;
import com.sensorsdata.analytics.android.autotrack.aop.SensorsDataAutoTrackHelper;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.random.Random;
import p010kotlin.ranges.IntRange;
import p010kotlin.ranges.RangesKt___RangesKt;
import pantanal.internal.datachannel.CardAction;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\u0006\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'¢\u0006\u0004\bV\u0010WJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J2\u0010\f\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002J\u0010\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0002J\b\u0010\u0011\u001a\u00020\u0002H\u0002J\b\u0010\u0012\u001a\u00020\u0002H\u0002J\b\u0010\u0013\u001a\u00020\u0002H\u0002J\b\u0010\u0014\u001a\u00020\u0002H\u0002J\b\u0010\u0015\u001a\u00020\u0002H\u0002J2\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00172\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u00192\n\u0010\u001c\u001a\u00020\u001b\"\u00020\tH\u0002J\b\u0010\u001e\u001a\u00020\u0002H\u0016J\b\u0010\u001f\u001a\u00020\u0002H\u0016R\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0017\u0010#\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010(\u001a\u0004\u0018\u00010'8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R$\u0010-\u001a\u0004\u0018\u00010,8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R$\u00104\u001a\u0004\u0018\u0001038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R$\u0010:\u001a\u0004\u0018\u0001038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u00105\u001a\u0004\b;\u00107\"\u0004\b<\u00109R$\u0010\u000e\u001a\u0004\u0018\u00010=8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR$\u0010C\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR$\u0010I\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bI\u0010D\u001a\u0004\bJ\u0010F\"\u0004\bK\u0010HR$\u0010L\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bL\u0010D\u001a\u0004\bM\u0010F\"\u0004\bN\u0010HR$\u0010P\u001a\u0004\u0018\u00010O8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010U¨\u0006X"}, d2 = {"Lcom/heytap/store/business/component/dialog/IntegralExpDialog;", "Landroid/app/Dialog;", "", "setFullScreenConfig", "Landroidx/appcompat/widget/AppCompatTextView;", DeviceInfoCompat.DeviceType.TV, "", "startColor", "endColor", "", "start", TextEntity.ELLIPSIZE_END, "setTextColorGradient", "Landroid/view/View;", "backgroundView", "startBackGroundAnimation", "endBackGroundAnimation", "startLightAnimation", "showLottieTop", "startNumAnimation", "rangeNum", "endNumRange", "view", "", "duration", "Lkotlin/Function0;", "animationEndMethod", "", "values", "scaleViewAnimation", CardAction.LIFE_CIRCLE_VALUE_SHOW, "dismiss", "Landroid/content/Context;", "mContext", "Landroid/content/Context;", "integralNum", "I", "getIntegralNum", "()I", "", "jumpLink", "Ljava/lang/String;", "getJumpLink", "()Ljava/lang/String;", "Landroidx/appcompat/widget/AppCompatImageView;", "imgLight", "Landroidx/appcompat/widget/AppCompatImageView;", "getImgLight", "()Landroidx/appcompat/widget/AppCompatImageView;", "setImgLight", "(Landroidx/appcompat/widget/AppCompatImageView;)V", "Lcom/airbnb/lottie/LottieAnimationView;", "lottieTop", "Lcom/airbnb/lottie/LottieAnimationView;", "getLottieTop", "()Lcom/airbnb/lottie/LottieAnimationView;", "setLottieTop", "(Lcom/airbnb/lottie/LottieAnimationView;)V", "lottieBottom", "getLottieBottom", "setLottieBottom", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "getBackgroundView", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "setBackgroundView", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "tvDesc", "Landroidx/appcompat/widget/AppCompatTextView;", "getTvDesc", "()Landroidx/appcompat/widget/AppCompatTextView;", "setTvDesc", "(Landroidx/appcompat/widget/AppCompatTextView;)V", "tvDescNum", "getTvDescNum", "setTvDescNum", "tvNum", "getTvNum", "setTvNum", "Lcom/oplus/aiunit/vision/cv5;", "disposable", "Lcom/oplus/aiunit/vision/cv5;", "getDisposable", "()Lcom/oplus/aiunit/vision/cv5;", "setDisposable", "(Lcom/oplus/aiunit/vision/cv5;)V", "<init>", "(Landroid/content/Context;ILjava/lang/String;)V", "widget_release"}, k = 1, mv = {1, 6, 0})
public final class IntegralExpDialog extends Dialog {

    @Nullable
    private ConstraintLayout backgroundView;

    @Nullable
    private cv5 disposable;

    @Nullable
    private AppCompatImageView imgLight;
    private final int integralNum;

    @Nullable
    private final String jumpLink;

    @Nullable
    private LottieAnimationView lottieBottom;

    @Nullable
    private LottieAnimationView lottieTop;

    @NotNull
    private final Context mContext;

    @Nullable
    private AppCompatTextView tvDesc;

    @Nullable
    private AppCompatTextView tvDescNum;

    @Nullable
    private AppCompatTextView tvNum;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntegralExpDialog(@NotNull Context mContext, int i, @Nullable String str) {
        super(mContext);
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        this.mContext = mContext;
        this.integralNum = i;
        this.jumpLink = str;
        setContentView(LayoutInflater.from(getContext()).inflate(R.layout.dialog_integral_exp_layout, (ViewGroup) null));
        setFullScreenConfig();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void endBackGroundAnimation(View backgroundView) {
        scaleViewAnimation(backgroundView, 100L, new Function0<Unit>() { // from class: com.heytap.store.business.component.dialog.IntegralExpDialog.endBackGroundAnimation.1
            {
                super(0);
            }

            @Override // p010kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                IntegralExpDialog.this.startLightAnimation();
                IntegralExpDialog.this.startNumAnimation();
            }
        }, 1.1f, 1.0f);
    }

    private final void endNumRange() {
        AppCompatTextView appCompatTextView = this.tvNum;
        if (appCompatTextView == null) {
            return;
        }
        AppCompatTextView tvDescNum = getTvDescNum();
        if (tvDescNum != null) {
            tvDescNum.setVisibility(0);
        }
        scaleViewAnimation(appCompatTextView, 200L, new Function0<Unit>() { // from class: com.heytap.store.business.component.dialog.IntegralExpDialog$endNumRange$1$1
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }

            @Override // p010kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        }, 1.1f, 1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void rangeNum() {
        final ArrayList arrayList = new ArrayList();
        while (arrayList.size() < 10) {
            int iRandom = RangesKt___RangesKt.random(new IntRange(1, 99), Random.INSTANCE);
            if (!arrayList.contains(Integer.valueOf(iRandom))) {
                arrayList.add(Integer.valueOf(iRandom));
            }
        }
        this.disposable = kbd.n(1L, 17L, 0L, 50L, TimeUnit.MILLISECONDS).B(e30.a()).x(new p14() { // from class: com.oplus.aiunit.vision.mca
            @Override // com.oplus.aiunit.vision.p14
            public final void accept(Object obj) {
                IntegralExpDialog.m4835rangeNum$lambda9(this.i, arrayList, (Long) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: rangeNum$lambda-9, reason: not valid java name */
    public static final void m4835rangeNum$lambda9(final IntegralExpDialog this$0, final List rangeArray, final Long l2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(rangeArray, "$rangeArray");
        AppCompatTextView appCompatTextView = this$0.tvNum;
        if (appCompatTextView == null) {
            return;
        }
        appCompatTextView.post(new Runnable() { // from class: com.oplus.aiunit.vision.lca
            @Override // java.lang.Runnable
            public final void run() {
                IntegralExpDialog.m4836rangeNum$lambda9$lambda8(l2, this$0, rangeArray);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: rangeNum$lambda-9$lambda-8, reason: not valid java name */
    public static final void m4836rangeNum$lambda9$lambda8(Long l2, IntegralExpDialog this$0, List rangeArray) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(rangeArray, "$rangeArray");
        if (l2 != null && l2.longValue() == 17) {
            AppCompatTextView appCompatTextView = this$0.tvNum;
            if (appCompatTextView != null) {
                appCompatTextView.setText(String.valueOf(this$0.integralNum));
            }
            this$0.endNumRange();
            return;
        }
        AppCompatTextView appCompatTextView2 = this$0.tvNum;
        if (appCompatTextView2 == null) {
            return;
        }
        appCompatTextView2.setText(String.valueOf(((Number) CollectionsKt___CollectionsKt.random(rangeArray, Random.INSTANCE)).intValue()));
    }

    private final void scaleViewAnimation(View view, long duration, final Function0<Unit> animationEndMethod, float... values) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(view, "scaleX", Arrays.copyOf(values, values.length)), ObjectAnimator.ofFloat(view, "scaleY", Arrays.copyOf(values, values.length)));
        animatorSet.setDuration(duration);
        animatorSet.start();
        animatorSet.addListener(new Animator.AnimatorListener() { // from class: com.heytap.store.business.component.dialog.IntegralExpDialog.scaleViewAnimation.1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(@Nullable Animator animation) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@Nullable Animator animation) {
                animationEndMethod.invoke();
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(@Nullable Animator animation) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(@Nullable Animator animation) {
            }
        });
    }

    private final void setFullScreenConfig() {
        Window window = getWindow();
        View decorView = window == null ? null : window.getDecorView();
        if (decorView != null) {
            decorView.setSystemUiVisibility(12032);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.addFlags(Integer.MIN_VALUE);
        }
        Window window3 = getWindow();
        WindowManager.LayoutParams attributes = window3 != null ? window3.getAttributes() : null;
        if (attributes != null) {
            attributes.width = -1;
        }
        if (attributes != null) {
            attributes.height = -1;
        }
        Window window4 = getWindow();
        if (window4 != null) {
            window4.setNavigationBarColor(0);
        }
        Window window5 = getWindow();
        if (window5 != null) {
            window5.setStatusBarColor(0);
        }
        Window window6 = getWindow();
        if (window6 != null) {
            window6.setType(1000);
        }
        if (attributes != null) {
            attributes.layoutInDisplayCutoutMode = 1;
        }
        Window window7 = getWindow();
        if (window7 == null) {
            return;
        }
        window7.setAttributes(attributes);
    }

    private final void setTextColorGradient(AppCompatTextView tv, int startColor, int endColor, float start, float end) {
        if (tv == null) {
            return;
        }
        tv.getPaint().setShader(new LinearGradient(0.0f, 0.0f, 0.0f, tv.getPaint().getTextSize(), new int[]{startColor, endColor}, new float[]{start, end}, Shader.TileMode.CLAMP));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SensorsDataInstrumented
    /* JADX INFO: renamed from: show$lambda-1, reason: not valid java name */
    public static final void m4837show$lambda1(IntegralExpDialog this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.dismiss();
        SensorsDataAutoTrackHelper.trackViewOnClick(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SensorsDataInstrumented
    /* JADX INFO: renamed from: show$lambda-2, reason: not valid java name */
    public static final void m4838show$lambda2(IntegralExpDialog this$0, View view) throws InterruptedException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Context context = this$0.mContext;
        if (context != null && (context instanceof Activity)) {
            DeeplinkHelper.INSTANCE.navigation((Activity) context, this$0.jumpLink, (252 & 4) != 0 ? null : null, (252 & 8) != 0 ? false : false, (252 & 16) != 0 ? 3 : 0, (252 & 32) != 0 ? null : null, (252 & 64) != 0 ? null : null, (252 & 128) != 0 ? null : null);
        }
        this$0.dismiss();
        SensorsDataAutoTrackHelper.trackViewOnClick(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showLottieTop() {
        final LottieAnimationView lottieAnimationView = this.lottieTop;
        if (lottieAnimationView != null) {
            lottieAnimationView.setVisibility(0);
            lottieAnimationView.playAnimation();
            lottieAnimationView.addAnimatorListener(new Animator.AnimatorListener() { // from class: com.heytap.store.business.component.dialog.IntegralExpDialog$showLottieTop$1$1
                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(@Nullable Animator animation) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(@Nullable Animator animation) {
                    lottieAnimationView.setMinAndMaxFrame(110, ixb.DEVICE_AUX_BATTERY_INFO);
                    lottieAnimationView.playAnimation();
                    lottieAnimationView.loop(true);
                    lottieAnimationView.removeAllAnimatorListeners();
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(@Nullable Animator animation) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(@Nullable Animator animation) {
                }
            });
        }
        LottieAnimationView lottieAnimationView2 = this.lottieBottom;
        if (lottieAnimationView2 == null) {
            return;
        }
        lottieAnimationView2.setVisibility(0);
        lottieAnimationView2.loop(true);
        lottieAnimationView2.playAnimation();
    }

    private final void startBackGroundAnimation(final View backgroundView) {
        scaleViewAnimation(backgroundView, 250L, new Function0<Unit>() { // from class: com.heytap.store.business.component.dialog.IntegralExpDialog.startBackGroundAnimation.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p010kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                IntegralExpDialog.this.endBackGroundAnimation(backgroundView);
            }
        }, 0.0f, 1.1f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startLightAnimation() {
        final AppCompatImageView appCompatImageView = this.imgLight;
        if (appCompatImageView == null) {
            return;
        }
        appCompatImageView.setVisibility(0);
        scaleViewAnimation(appCompatImageView, 650L, new Function0<Unit>() { // from class: com.heytap.store.business.component.dialog.IntegralExpDialog$startLightAnimation$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p010kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
                appCompatImageView.setAnimation(rotateAnimation);
                rotateAnimation.setDuration(10000L);
                rotateAnimation.setRepeatCount(-1);
                rotateAnimation.setInterpolator(new LinearInterpolator());
                appCompatImageView.startAnimation(rotateAnimation);
                this.showLottieTop();
            }
        }, 0.0f, 1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startNumAnimation() {
        AppCompatTextView appCompatTextView = this.tvNum;
        if (appCompatTextView == null) {
            return;
        }
        appCompatTextView.setVisibility(0);
        scaleViewAnimation(appCompatTextView, 150L, new Function0<Unit>() { // from class: com.heytap.store.business.component.dialog.IntegralExpDialog$startNumAnimation$1$1
            {
                super(0);
            }

            @Override // p010kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.this$0.rangeNum();
            }
        }, 1.0f, 1.1f);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        cv5 cv5Var = this.disposable;
        if (cv5Var == null) {
            return;
        }
        cv5Var.dispose();
    }

    @Nullable
    public final ConstraintLayout getBackgroundView() {
        return this.backgroundView;
    }

    @Nullable
    public final cv5 getDisposable() {
        return this.disposable;
    }

    @Nullable
    public final AppCompatImageView getImgLight() {
        return this.imgLight;
    }

    public final int getIntegralNum() {
        return this.integralNum;
    }

    @Nullable
    public final String getJumpLink() {
        return this.jumpLink;
    }

    @Nullable
    public final LottieAnimationView getLottieBottom() {
        return this.lottieBottom;
    }

    @Nullable
    public final LottieAnimationView getLottieTop() {
        return this.lottieTop;
    }

    @Nullable
    public final AppCompatTextView getTvDesc() {
        return this.tvDesc;
    }

    @Nullable
    public final AppCompatTextView getTvDescNum() {
        return this.tvDescNum;
    }

    @Nullable
    public final AppCompatTextView getTvNum() {
        return this.tvNum;
    }

    public final void setBackgroundView(@Nullable ConstraintLayout constraintLayout) {
        this.backgroundView = constraintLayout;
    }

    public final void setDisposable(@Nullable cv5 cv5Var) {
        this.disposable = cv5Var;
    }

    public final void setImgLight(@Nullable AppCompatImageView appCompatImageView) {
        this.imgLight = appCompatImageView;
    }

    public final void setLottieBottom(@Nullable LottieAnimationView lottieAnimationView) {
        this.lottieBottom = lottieAnimationView;
    }

    public final void setLottieTop(@Nullable LottieAnimationView lottieAnimationView) {
        this.lottieTop = lottieAnimationView;
    }

    public final void setTvDesc(@Nullable AppCompatTextView appCompatTextView) {
        this.tvDesc = appCompatTextView;
    }

    public final void setTvDescNum(@Nullable AppCompatTextView appCompatTextView) {
        this.tvDescNum = appCompatTextView;
    }

    public final void setTvNum(@Nullable AppCompatTextView appCompatTextView) {
        this.tvNum = appCompatTextView;
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        this.imgLight = (AppCompatImageView) findViewById(R.id.img_integral_exp_light_bg);
        this.lottieTop = (LottieAnimationView) findViewById(R.id.lottie_integral_exp_top);
        this.lottieBottom = (LottieAnimationView) findViewById(R.id.lottie_integral_exp_bottom);
        this.backgroundView = (ConstraintLayout) findViewById(R.id.cl_integral_Exp_container);
        this.tvDesc = (AppCompatTextView) findViewById(R.id.tv_integral_exp_desc);
        this.tvDescNum = (AppCompatTextView) findViewById(R.id.tv_integral_exp_dialog_number_desc);
        this.tvNum = (AppCompatTextView) findViewById(R.id.tv_integral_exp_dialog_number);
        LottieAnimationView lottieAnimationView = this.lottieBottom;
        if (lottieAnimationView != null) {
            lottieAnimationView.setAnimation("integral_bottom_lottie.json");
        }
        LottieAnimationView lottieAnimationView2 = this.lottieTop;
        if (lottieAnimationView2 != null) {
            lottieAnimationView2.setAnimation("integral_top_lottie.json");
        }
        AppCompatImageView appCompatImageView = this.imgLight;
        if (appCompatImageView != null) {
            appCompatImageView.setVisibility(4);
        }
        LottieAnimationView lottieAnimationView3 = this.lottieTop;
        if (lottieAnimationView3 != null) {
            lottieAnimationView3.setVisibility(4);
        }
        LottieAnimationView lottieAnimationView4 = this.lottieBottom;
        if (lottieAnimationView4 != null) {
            lottieAnimationView4.setVisibility(4);
        }
        AppCompatTextView appCompatTextView = this.tvDescNum;
        if (appCompatTextView != null) {
            appCompatTextView.setVisibility(4);
        }
        AppCompatTextView appCompatTextView2 = this.tvNum;
        if (appCompatTextView2 != null) {
            appCompatTextView2.setVisibility(4);
        }
        setTextColorGradient(this.tvNum, Color.parseColor("#FFF9F1"), Color.parseColor("#FFCA98"), 0.0f, 1.0f);
        setTextColorGradient(this.tvDescNum, Color.parseColor("#FFF9F1"), Color.parseColor("#FFCA98"), 0.0f, 1.0f);
        AppCompatTextView appCompatTextView3 = this.tvNum;
        if (appCompatTextView3 != null) {
            appCompatTextView3.setTypeface(Typeface.createFromAsset(getContext().getAssets(), "fonts/BEBAS.ttf"));
        }
        AppCompatTextView appCompatTextView4 = this.tvDescNum;
        if (appCompatTextView4 != null) {
            appCompatTextView4.setTypeface(Typeface.createFromAsset(getContext().getAssets(), "fonts/BEBAS.ttf"));
        }
        ConstraintLayout constraintLayout = this.backgroundView;
        if (constraintLayout != null) {
            startBackGroundAnimation(constraintLayout);
        }
        AppCompatImageView appCompatImageView2 = (AppCompatImageView) findViewById(R.id.dialog_delete);
        if (appCompatImageView2 != null) {
            appCompatImageView2.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.nca
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    IntegralExpDialog.m4837show$lambda1(this.i, view);
                }
            });
        }
        LottieAnimationView lottieAnimationView5 = this.lottieBottom;
        if (lottieAnimationView5 == null) {
            return;
        }
        lottieAnimationView5.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.oca
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws InterruptedException {
                IntegralExpDialog.m4838show$lambda2(this.i, view);
            }
        });
    }

    public /* synthetic */ IntegralExpDialog(Context context, int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, i, (i2 & 4) != 0 ? "" : str);
    }
}
