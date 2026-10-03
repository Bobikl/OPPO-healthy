package com.heytap.nearx.uikit.widget.snackbar.container;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.annotation.NonNull;
import androidx.core.view.animation.PathInterpolatorCompat;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
public class NearContainerSnackAnimUtil {
    public static final int ALPHA_ANIMATION_IN_DURATION = 250;
    public static final int ALPHA_ANIMATION_OUT_DURATION = 180;
    public static final String ALPHA_ANIMATION_TYPE = "alpha";
    public static final int ANIMATION_DURATION_267 = 267;
    public static final int ANIMATION_DURATION_300 = 300;
    public static final int ANIMATION_DURATION_350 = 350;
    public static final String SCALE_X_ANIMATION_TYPE = "scaleX";
    public static final String SCALE_Y_ANIMATION_TYPE = "scaleY";
    public static final String TRANSLATION_X_ANIMATION_TYPE = "translationX";
    public static final String TRANSLATION_Y_ANIMATION_TYPE = "translationY";
    public static final Interpolator ANIM_OUT_Interpolator = PathInterpolatorCompat.create(0.1f, 0.0f, 0.1f, 1.0f);
    public static final Interpolator ANIM_IN_Interpolator = PathInterpolatorCompat.create(0.1f, 0.0f, 0.1f, 1.0f);
    public static final Interpolator INTENT_FLOAT_ANIM_OUT_Interpolator = PathInterpolatorCompat.create(0.3f, 0.0f, 1.0f, 1.0f);
    public static final Interpolator INTENT_FLOAT_ANIM_IN_Interpolator = PathInterpolatorCompat.create(0.3f, 0.0f, 0.1f, 1.0f);
    public static final Interpolator INTENT_NOTICE_ANIM_IN_Interpolator = PathInterpolatorCompat.create(0.22f, 0.34f, 0.05f, 1.0f);
    public static final Interpolator INTENT_NOTICE_ANIM_OUT_Interpolator = PathInterpolatorCompat.create(0.4f, 0.0f, 0.4f, 1.0f);

    public static class UpdateAction implements ValueAnimator.AnimatorUpdateListener {
        Map<String, Method> mMap = new HashMap();
        View targetView;

        public UpdateAction(@NonNull View view) {
            this.targetView = view;
        }

        /* JADX WARN: Code duplicated, block: B:26:0x00d3  */
        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int i;
            PropertyValuesHolder[] values = valueAnimator.getValues();
            int length = values.length;
            int i2 = 0;
            int i3 = 0;
            while (i3 < length) {
                PropertyValuesHolder propertyValuesHolder = values[i3];
                String propertyName = propertyValuesHolder.getPropertyName();
                if (this.mMap.containsKey("set" + propertyName.toLowerCase())) {
                    try {
                        Method method = this.mMap.get("set" + propertyName.toLowerCase());
                        View view = this.targetView;
                        Object[] objArr = new Object[1];
                        objArr[i2] = valueAnimator.getAnimatedValue(propertyValuesHolder.getPropertyName());
                        method.invoke(view, objArr);
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                } else {
                    Method[] methods = this.targetView.getClass().getMethods();
                    int length2 = methods.length;
                    int i4 = i2;
                    while (i4 < length2) {
                        Method method2 = methods[i4];
                        if (method2.getParameterTypes().length == 1) {
                            if (method2.getName().toLowerCase().equals(("set" + propertyName).toLowerCase())) {
                                this.mMap.put("set" + propertyName.toLowerCase(), method2);
                                try {
                                    View view2 = this.targetView;
                                    Object[] objArr2 = new Object[1];
                                    i = 0;
                                    try {
                                        objArr2[0] = valueAnimator.getAnimatedValue(propertyValuesHolder.getPropertyName());
                                        method2.invoke(view2, objArr2);
                                    } catch (Exception e3) {
                                        e = e3;
                                        e.printStackTrace();
                                    }
                                } catch (Exception e4) {
                                    e = e4;
                                    i = 0;
                                }
                            } else {
                                i = i2;
                            }
                        } else {
                            i = i2;
                        }
                        i4++;
                        i2 = i;
                    }
                }
                i3++;
                i2 = i2;
            }
        }
    }

    public static AnimatorSet createAnimatorSet(List<ValueAnimator> list, View view) {
        AnimatorSet animatorSet = new AnimatorSet();
        AnimatorSet.Builder builderPlay = null;
        for (int i = 0; i < list.size(); i++) {
            ValueAnimator valueAnimator = list.get(i);
            if (i == 0) {
                builderPlay = animatorSet.play(valueAnimator);
            } else {
                builderPlay.with(valueAnimator);
            }
            valueAnimator.addUpdateListener(new UpdateAction(view));
        }
        return animatorSet;
    }

    private static AnimatorSet createDefIntentFloatDismissAnim(NearContainerSnackBar nearContainerSnackBar, NearContainerSnackBarBuilder.Params params) {
        nearContainerSnackBar.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(nearContainerSnackBar, "alpha", 1.0f, 0.0f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(nearContainerSnackBar, "translationY", 0.0f, params.marginBottom + nearContainerSnackBar.getMeasuredHeight());
        AnimatorSet animatorSet = new AnimatorSet();
        if (params.animationSlideOut) {
            animatorSet.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2);
        } else {
            animatorSet.play(objectAnimatorOfFloat);
        }
        animatorSet.setInterpolator(INTENT_FLOAT_ANIM_OUT_Interpolator);
        animatorSet.setDuration(267L);
        return animatorSet;
    }

    private static AnimatorSet createDefIntentFloatShowAnim(NearContainerSnackBar nearContainerSnackBar, NearContainerSnackBarBuilder.Params params) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(nearContainerSnackBar, "alpha", 0.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(nearContainerSnackBar, "scaleX", 0.8f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(nearContainerSnackBar, "scaleY", 0.8f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(nearContainerSnackBar, "translationY", params.marginBottom, 0.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2).with(objectAnimatorOfFloat3).with(objectAnimatorOfFloat4);
        animatorSet.setInterpolator(INTENT_FLOAT_ANIM_IN_Interpolator);
        animatorSet.setDuration(267L);
        return animatorSet;
    }

    private static AnimatorSet createDefIntentNoTitleNoticeDismissAnim(NearContainerSnackBar nearContainerSnackBar, NearContainerSnackBarBuilder.Params params) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(nearContainerSnackBar, "alpha", 1.0f, 0.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(objectAnimatorOfFloat);
        animatorSet.setDuration(180L);
        animatorSet.setInterpolator(ANIM_OUT_Interpolator);
        return animatorSet;
    }

    private static AnimatorSet createDefIntentNoTitleNoticeShowAnim(NearContainerSnackBar nearContainerSnackBar, NearContainerSnackBarBuilder.Params params) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(nearContainerSnackBar, "alpha", 0.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(nearContainerSnackBar, "scaleX", 0.8f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(nearContainerSnackBar, "scaleY", 0.8f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2).with(objectAnimatorOfFloat3);
        animatorSet.setDuration(250L);
        animatorSet.setInterpolator(ANIM_IN_Interpolator);
        return animatorSet;
    }

    private static AnimatorSet createDefIntentNoticeDismissAnim(NearContainerSnackBar nearContainerSnackBar, NearContainerSnackBarBuilder.Params params) {
        nearContainerSnackBar.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(nearContainerSnackBar, "translationY", 0.0f, params.marginBottom + nearContainerSnackBar.getMeasuredHeight());
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(objectAnimatorOfFloat);
        animatorSet.setDuration(300L);
        animatorSet.setInterpolator(INTENT_NOTICE_ANIM_OUT_Interpolator);
        return animatorSet;
    }

    private static AnimatorSet createDefIntentNoticeShowAnim(NearContainerSnackBar nearContainerSnackBar, NearContainerSnackBarBuilder.Params params) {
        nearContainerSnackBar.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(nearContainerSnackBar, "alpha", 0.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(nearContainerSnackBar, "scaleX", 0.8f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(nearContainerSnackBar, "scaleY", 0.8f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(nearContainerSnackBar, "translationY", params.marginBottom + nearContainerSnackBar.getMeasuredHeight(), 0.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2).with(objectAnimatorOfFloat3).with(objectAnimatorOfFloat4);
        animatorSet.setDuration(350L);
        animatorSet.setInterpolator(INTENT_NOTICE_ANIM_IN_Interpolator);
        return animatorSet;
    }

    public static AnimatorSet createDefNormalDismissAnim(NearContainerSnackBar nearContainerSnackBar) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(nearContainerSnackBar, "alpha", 1.0f, 0.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(objectAnimatorOfFloat);
        animatorSet.setInterpolator(ANIM_OUT_Interpolator);
        animatorSet.setDuration(180L);
        return animatorSet;
    }

    public static AnimatorSet createDefNormalShowAnim(NearContainerSnackBar nearContainerSnackBar) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(nearContainerSnackBar, "alpha", 0.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(nearContainerSnackBar, "scaleX", 0.8f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(nearContainerSnackBar, "scaleY", 0.8f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2).with(objectAnimatorOfFloat3);
        animatorSet.setDuration(250L);
        animatorSet.setInterpolator(ANIM_IN_Interpolator);
        return animatorSet;
    }

    public static AnimatorSet getDefDismissAnim(NearContainerSnackBarBuilder.Params params, NearContainerSnackBar nearContainerSnackBar) {
        int i = params.type;
        if (i == 1) {
            return createDefIntentFloatDismissAnim(nearContainerSnackBar, params);
        }
        if (i != 2) {
            return i != 3 ? createDefNormalDismissAnim(nearContainerSnackBar) : createDefIntentNoTitleNoticeDismissAnim(nearContainerSnackBar, params);
        }
        return createDefIntentNoticeDismissAnim(nearContainerSnackBar, params);
    }

    public static AnimatorSet getDefShowAnim(NearContainerSnackBarBuilder.Params params, NearContainerSnackBar nearContainerSnackBar) {
        int i = params.type;
        if (i == 1) {
            return createDefIntentFloatShowAnim(nearContainerSnackBar, params);
        }
        if (i != 2) {
            return i != 3 ? createDefNormalShowAnim(nearContainerSnackBar) : createDefIntentNoTitleNoticeShowAnim(nearContainerSnackBar, params);
        }
        return createDefIntentNoticeShowAnim(nearContainerSnackBar, params);
    }
}
