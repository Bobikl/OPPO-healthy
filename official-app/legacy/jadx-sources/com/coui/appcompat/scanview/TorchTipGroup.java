package com.coui.appcompat.scanview;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.StringRes;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.coui.appcompat.scanview.TorchTipGroup;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.b2n;
import com.oplus.smartenginehelper.ParserTag;
import com.support.scanview.R$id;
import com.support.scanview.R$layout;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\u0011\n\u0002\b\b\u0018\u0000 52\u00020\u0001:\u00015B\u000f\u0012\u0006\u0010\u001a\u001a\u00020\u0017¢\u0006\u0004\b3\u00104J\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\"\u0010\b\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\u000e\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tJ\u000e\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fJ\u0010\u0010\u0011\u001a\u00020\u00052\b\b\u0001\u0010\u0010\u001a\u00020\u000fJ\u0006\u0010\u0012\u001a\u00020\u0005J,\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0003J\b\u0010\u0016\u001a\u00020\u0015H\u0002R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\"\u0010\"\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0017\u0010&\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u000b\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010(\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b'\u0010%R\u0017\u0010*\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0014\u0010#\u001a\u0004\b)\u0010%R\u0017\u0010-\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b+\u0010#\u001a\u0004\b,\u0010%R\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020\u00150.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010/R\u0016\u00102\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u00101¨\u00066"}, d2 = {"Lcom/coui/appcompat/scanview/TorchTipGroup;", "", "Landroid/view/View;", "i", "Lkotlin/Function0;", "", "onActionDown", "onActionUp", "d", "Landroid/view/ViewGroup;", "viewGroup", "c", "", "torchTip", LogFieldKey.MESSAGE_KEY, "", "torchTipResId", LogFieldKey.LEVEL_KEY, b2n.f, "view", MapSchema.FIELD_NAME_ENTRY, "Landroid/widget/LinearLayout;", "j", "Landroid/content/Context;", "a", "Landroid/content/Context;", "context", "", "b", "Z", "getShowTorchTip", "()Z", MapSchema.FIELD_NAME_KEY, "(Z)V", "showTorchTip", "Landroid/widget/LinearLayout;", b2n.g, "()Landroid/widget/LinearLayout;", "bottomTorchTip", "getLeftTorchTip", "leftTorchTip", "getFlippedTorchTip", "flippedTorchTip", "f", "getRightTorchTip", "rightTorchTip", "", "[Landroid/widget/LinearLayout;", "torchTipGroup", "I", "currentShowingIndex", "<init>", "(Landroid/content/Context;)V", "Companion", "coui-support-scanview_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTorchTipGroup.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TorchTipGroup.kt\ncom/coui/appcompat/scanview/TorchTipGroup\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,298:1\n13579#2,2:299\n13579#2,2:301\n13579#2,2:303\n254#3,2:305\n*S KotlinDebug\n*F\n+ 1 TorchTipGroup.kt\ncom/coui/appcompat/scanview/TorchTipGroup\n*L\n138#1:299,2\n187#1:301,2\n197#1:303,2\n231#1:305,2\n*E\n"})
public final class TorchTipGroup {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final PathInterpolator i = new PathInterpolator(0.33f, 0.0f, 0.67f, 1.0f);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public boolean showTorchTip;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final LinearLayout bottomTorchTip;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final LinearLayout leftTorchTip;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final LinearLayout flippedTorchTip;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final LinearLayout rightTorchTip;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final LinearLayout[] torchTipGroup;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public int currentShowingIndex;

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ \u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007J \u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0007R\u0014\u0010\r\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0015R\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lcom/coui/appcompat/scanview/TorchTipGroup$Companion;", "", "Landroid/view/View;", "view", "Lkotlin/Function0;", "", "onEnd", "d", "a", "", "orientation", "", "c", "ANGLE_COUNT", "I", "ANGLE_INCREASE_STEP", "", "ANIMATION_DURATION", "J", "", "APPEAR_ANIM_END", UserInfo.SEX_FEMALE, "APPEAR_ANIM_START", "DISAPPEAR_CONTROL_X1", "DISAPPEAR_CONTROL_X2", "DISAPPEAR_CONTROL_Y1", "DISAPPEAR_CONTROL_Y2", "Landroid/view/animation/PathInterpolator;", "animPathInterpolator", "Landroid/view/animation/PathInterpolator;", "<init>", "()V", "coui-support-scanview_release"}, k = 1, mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nTorchTipGroup.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TorchTipGroup.kt\ncom/coui/appcompat/scanview/TorchTipGroup$Companion\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 Animator.kt\nandroidx/core/animation/AnimatorKt\n*L\n1#1,298:1\n252#2:299\n254#2,2:300\n252#2:317\n31#3:302\n94#3,14:303\n31#3:318\n94#3,14:319\n*S KotlinDebug\n*F\n+ 1 TorchTipGroup.kt\ncom/coui/appcompat/scanview/TorchTipGroup$Companion\n*L\n259#1:299\n263#1:300,2\n277#1:317\n267#1:302\n267#1:303,14\n283#1:318\n283#1:319,14\n*E\n"})
    public static final class Companion {

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\t¸\u0006\n"}, d2 = {"androidx/core/animation/AnimatorKt$addListener$listener$1", "Landroid/animation/Animator$AnimatorListener;", "Landroid/animation/Animator;", "animator", "", ParserTag.TAG_ON_ANIMATION_REPEAT, ParserTag.TAG_ON_ANIMATION_END, ParserTag.TAG_ON_ANIMATION_CANCEL, ParserTag.TAG_ON_ANIMATION_START, "core-ktx_release", "androidx/core/animation/AnimatorKt$doOnEnd$$inlined$addListener$default$1"}, k = 1, mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$listener$1\n+ 2 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$4\n+ 3 TorchTipGroup.kt\ncom/coui/appcompat/scanview/TorchTipGroup$Companion\n+ 4 View.kt\nandroidx/core/view/ViewKt\n+ 5 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$3\n+ 6 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$2\n*L\n1#1,127:1\n98#2:128\n284#3:129\n285#3,3:132\n254#4,2:130\n97#5:135\n96#6:136\n*S KotlinDebug\n*F\n+ 1 TorchTipGroup.kt\ncom/coui/appcompat/scanview/TorchTipGroup$Companion\n*L\n284#1:130,2\n*E\n"})
        public static final class a implements Animator.AnimatorListener {
            public final /* synthetic */ View i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public final /* synthetic */ Function0 f2003j;

            public a(View view, Function0 function0) {
                this.i = view;
                this.f2003j = function0;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(@NotNull Animator animator) {
                Intrinsics.checkNotNullParameter(animator, "animator");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@NotNull Animator animator) {
                Intrinsics.checkNotNullParameter(animator, "animator");
                this.i.setVisibility(8);
                this.i.setAlpha(1.0f);
                this.f2003j.invoke();
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(@NotNull Animator animator) {
                Intrinsics.checkNotNullParameter(animator, "animator");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(@NotNull Animator animator) {
                Intrinsics.checkNotNullParameter(animator, "animator");
            }
        }

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\t¸\u0006\n"}, d2 = {"androidx/core/animation/AnimatorKt$addListener$listener$1", "Landroid/animation/Animator$AnimatorListener;", "Landroid/animation/Animator;", "animator", "", ParserTag.TAG_ON_ANIMATION_REPEAT, ParserTag.TAG_ON_ANIMATION_END, ParserTag.TAG_ON_ANIMATION_CANCEL, ParserTag.TAG_ON_ANIMATION_START, "core-ktx_release", "androidx/core/animation/AnimatorKt$doOnEnd$$inlined$addListener$default$1"}, k = 1, mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$listener$1\n+ 2 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$4\n+ 3 TorchTipGroup.kt\ncom/coui/appcompat/scanview/TorchTipGroup$Companion\n+ 4 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$3\n+ 5 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$2\n*L\n1#1,127:1\n98#2:128\n267#3:129\n97#4:130\n96#5:131\n*E\n"})
        public static final class b implements Animator.AnimatorListener {
            public final /* synthetic */ Function0 i;

            public b(Function0 function0) {
                this.i = function0;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(@NotNull Animator animator) {
                Intrinsics.checkNotNullParameter(animator, "animator");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@NotNull Animator animator) {
                Intrinsics.checkNotNullParameter(animator, "animator");
                this.i.invoke();
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(@NotNull Animator animator) {
                Intrinsics.checkNotNullParameter(animator, "animator");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(@NotNull Animator animator) {
                Intrinsics.checkNotNullParameter(animator, "animator");
            }
        }

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void b(Companion companion, View view, Function0 function0, int i, Object obj) {
            if ((i & 2) != 0) {
                function0 = new Function0<Unit>() { // from class: com.coui.appcompat.scanview.TorchTipGroup$Companion$disappear$1
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                    }

                    @Override // p010kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }
                };
            }
            companion.a(view, function0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void e(Companion companion, View view, Function0 function0, int i, Object obj) {
            if ((i & 2) != 0) {
                function0 = new Function0<Unit>() { // from class: com.coui.appcompat.scanview.TorchTipGroup$Companion$show$1
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                    }

                    @Override // p010kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }
                };
            }
            companion.d(view, function0);
        }

        @JvmStatic
        public final void a(@NotNull View view, @NotNull Function0<Unit> onEnd) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(onEnd, "onEnd");
            if (view.getVisibility() == 0) {
                ObjectAnimator disappear$lambda$3 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, view.getAlpha(), 0.0f);
                disappear$lambda$3.setInterpolator(TorchTipGroup.i);
                disappear$lambda$3.setDuration(250L);
                Intrinsics.checkNotNullExpressionValue(disappear$lambda$3, "disappear$lambda$3");
                disappear$lambda$3.addListener(new a(view, onEnd));
                disappear$lambda$3.start();
            }
        }

        @JvmStatic
        public final boolean c(int orientation) {
            return ((orientation / 90) % 4) % 2 == 0;
        }

        @JvmStatic
        public final void d(@NotNull View view, @NotNull Function0<Unit> onEnd) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(onEnd, "onEnd");
            if (view.getVisibility() == 0) {
                return;
            }
            view.setAlpha(0.0f);
            view.setVisibility(0);
            ObjectAnimator show$lambda$1 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, view.getAlpha(), 1.0f);
            show$lambda$1.setInterpolator(TorchTipGroup.i);
            show$lambda$1.setDuration(250L);
            Intrinsics.checkNotNullExpressionValue(show$lambda$1, "show$lambda$1");
            show$lambda$1.addListener(new b(onEnd));
            show$lambda$1.start();
        }
    }

    public TorchTipGroup(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        LinearLayout linearLayoutJ = j();
        linearLayoutJ.setId(R$id.coui_component_scan_view_torch_tip_bottom);
        linearLayoutJ.setLayoutParams(new ConstraintLayout.LayoutParams(-2, -2));
        this.bottomTorchTip = linearLayoutJ;
        LinearLayout linearLayoutJ2 = j();
        linearLayoutJ2.setId(R$id.coui_component_scan_view_torch_tip_left);
        linearLayoutJ2.setRotation(90.0f);
        linearLayoutJ2.setVisibility(8);
        linearLayoutJ2.setLayoutParams(new ConstraintLayout.LayoutParams(-2, -2));
        this.leftTorchTip = linearLayoutJ2;
        LinearLayout linearLayoutJ3 = j();
        linearLayoutJ3.setId(R$id.coui_component_scan_view_torch_tip_flipped);
        linearLayoutJ3.setRotation(180.0f);
        linearLayoutJ3.setVisibility(8);
        linearLayoutJ3.setLayoutParams(new ConstraintLayout.LayoutParams(-2, -2));
        this.flippedTorchTip = linearLayoutJ3;
        LinearLayout linearLayoutJ4 = j();
        linearLayoutJ4.setId(R$id.coui_component_scan_view_torch_tip_right);
        linearLayoutJ4.setRotation(270.0f);
        linearLayoutJ4.setVisibility(8);
        linearLayoutJ4.setLayoutParams(new ConstraintLayout.LayoutParams(-2, -2));
        this.rightTorchTip = linearLayoutJ4;
        this.torchTipGroup = new LinearLayout[]{linearLayoutJ, linearLayoutJ4, linearLayoutJ3, linearLayoutJ2};
        this.currentShowingIndex = -1;
    }

    public static final boolean f(Function0 onActionDown, Function0 onActionUp, View view, MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(onActionDown, "$onActionDown");
        Intrinsics.checkNotNullParameter(onActionUp, "$onActionUp");
        int action = motionEvent.getAction();
        if (action == 0) {
            onActionDown.invoke();
            return true;
        }
        if (action != 1 && action != 3) {
            return false;
        }
        onActionUp.invoke();
        return false;
    }

    public final void c(@NotNull ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
        viewGroup.addView(this.bottomTorchTip);
        viewGroup.addView(this.leftTorchTip);
        viewGroup.addView(this.rightTorchTip);
        viewGroup.addView(this.flippedTorchTip);
    }

    public final void d(@NotNull Function0<Unit> onActionDown, @NotNull Function0<Unit> onActionUp) {
        Intrinsics.checkNotNullParameter(onActionDown, "onActionDown");
        Intrinsics.checkNotNullParameter(onActionUp, "onActionUp");
        for (LinearLayout linearLayout : this.torchTipGroup) {
            e(linearLayout, onActionDown, onActionUp);
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void e(View view, final Function0<Unit> onActionDown, final Function0<Unit> onActionUp) {
        view.setOnTouchListener(new View.OnTouchListener() { // from class: com.oplus.aiunit.vision.j2k
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                return TorchTipGroup.f(onActionDown, onActionUp, view2, motionEvent);
            }
        });
    }

    public final void g() {
        int i2 = this.currentShowingIndex;
        if (i2 >= 0) {
            Companion.b(INSTANCE, this.torchTipGroup[i2], null, 2, null);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: h, reason: from getter */
    public final LinearLayout getBottomTorchTip() {
        return this.bottomTorchTip;
    }

    @Nullable
    public final View i() {
        int i2 = this.currentShowingIndex;
        if (i2 >= 0) {
            return this.torchTipGroup[i2];
        }
        return null;
    }

    public final LinearLayout j() {
        View getTorchTipGroup$lambda$8 = View.inflate(this.context, R$layout.coui_component_scan_view_torch_tip, null);
        Intrinsics.checkNotNullExpressionValue(getTorchTipGroup$lambda$8, "getTorchTipGroup$lambda$8");
        getTorchTipGroup$lambda$8.setVisibility(8);
        getTorchTipGroup$lambda$8.setAlpha(0.0f);
        Intrinsics.checkNotNull(getTorchTipGroup$lambda$8, "null cannot be cast to non-null type android.widget.LinearLayout");
        return (LinearLayout) getTorchTipGroup$lambda$8;
    }

    public final void k(boolean z) {
        this.showTorchTip = z;
    }

    public final void l(@StringRes int torchTipResId) {
        for (LinearLayout linearLayout : this.torchTipGroup) {
            ((TextView) linearLayout.findViewById(R$id.torch_tip_content)).setText(torchTipResId);
        }
    }

    public final void m(@NotNull CharSequence torchTip) {
        Intrinsics.checkNotNullParameter(torchTip, "torchTip");
        for (LinearLayout linearLayout : this.torchTipGroup) {
            ((TextView) linearLayout.findViewById(R$id.torch_tip_content)).setText(torchTip);
        }
    }
}
