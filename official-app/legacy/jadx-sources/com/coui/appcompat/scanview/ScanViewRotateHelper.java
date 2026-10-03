package com.coui.appcompat.scanview;

import android.content.Context;
import android.graphics.Point;
import android.util.DisplayMetrics;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.Observer;
import com.coui.appcompat.grid.COUIPercentUtils;
import com.coui.responsiveui.config.UIConfig;
import com.coui.responsiveui.config.a;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.nearx.tangramconfig.strategy.Fields;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.bj2;
import com.oplus.aiunit.vision.c8l;
import com.oplus.aiunit.vision.hw2;
import com.oplus.aiunit.vision.iim;
import com.oplus.aiunit.vision.mj2;
import com.oplus.smartenginehelper.ParserTag;
import com.support.scanview.R$dimen;
import com.support.scanview.R$id;
import io.protostuff.MapSchema;
import java.lang.ref.WeakReference;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.math.MathKt__MathJVMKt;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 `2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001aB\u000f\u0012\u0006\u00104\u001a\u000202¢\u0006\u0004\b^\u0010_J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\u001a\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0002J\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0002J\u0010\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0006H\u0002J\u0010\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0006H\u0002J\u0010\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0006H\u0002J\b\u0010\u0015\u001a\u00020\u0003H\u0002J\u0014\u0010\u0018\u001a\u00020\u000e*\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0006H\u0002J\u0014\u0010\u001b\u001a\u00020\u0006*\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0006H\u0002J\u0014\u0010\u001c\u001a\u00020\u0006*\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u0006H\u0002J\u0006\u0010\u001d\u001a\u00020\u0003J\u000f\u0010\u001e\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0003H\u0000¢\u0006\u0004\b \u0010\u001fJ\u000f\u0010!\u001a\u00020\u0003H\u0000¢\u0006\u0004\b!\u0010\u001fJ\u001f\u0010#\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020'2\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b(\u0010)J+\u0010,\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060*H\u0000¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\bH\u0000¢\u0006\u0004\b.\u0010/J\u0010\u00101\u001a\u00020\u00032\u0006\u00100\u001a\u00020\u0002H\u0016R\u0014\u00104\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u00103R\"\u0010\u0007\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b(\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R#\u0010?\u001a\n ;*\u0004\u0018\u00010:0:8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010<\u001a\u0004\b=\u0010>R#\u0010@\u001a\n ;*\u0004\u0018\u00010:0:8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010<\u001a\u0004\b0\u0010>R#\u0010D\u001a\n ;*\u0004\u0018\u00010A0A8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010<\u001a\u0004\bB\u0010CR#\u0010H\u001a\n ;*\u0004\u0018\u00010E0E8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bF\u0010<\u001a\u0004\bF\u0010GR#\u0010L\u001a\n ;*\u0004\u0018\u00010I0I8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010<\u001a\u0004\bJ\u0010KR\u001c\u0010O\u001a\n ;*\u0004\u0018\u00010M0M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010NR\u0014\u0010R\u001a\u00020P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010QR\u001c\u0010U\u001a\n ;*\u0004\u0018\u00010\u00190\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010V\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u00105R!\u0010Z\u001a\b\u0012\u0004\u0012\u00020X0W8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u0010<\u001a\u0004\bS\u0010YR\u0016\u0010]\u001a\u00020[8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\\¨\u0006b"}, d2 = {"Lcom/coui/appcompat/scanview/ScanViewRotateHelper;", "Landroidx/lifecycle/Observer;", "Lcom/coui/responsiveui/config/UIConfig;", "", UserInfo.SEX_FEMALE, "G", "", "orientation", "", "hasAnimation", "H", "Landroid/view/ViewGroup;", "container", c8l.KEY_B, "Landroid/util/Size;", LogFieldKey.MESSAGE_KEY, "totalWidth", "u", "o", Fields.WIDTH_FIELD, "v", "J", "Landroid/view/View;", ParserTag.TAG_MAX_WIDTH, LogFieldKey.PROCESS_NAME_KEY, "Landroid/content/Context;", "resId", b2n.g, "i", "x", "C", "()V", "A", ExifInterface.LONGITUDE_EAST, "gridCount", MapSchema.FIELD_NAME_KEY, "(II)I", LogFieldKey.LEVEL_KEY, "(I)I", "", "j", "(I)F", "Lkotlin/Function1;", "getGridCount", "w", "(ILkotlin/jvm/functions/Function1;)I", "y", "()Z", "t", "z", "Lcom/coui/appcompat/scanview/COUIFullscreenScanView;", "Lcom/coui/appcompat/scanview/COUIFullscreenScanView;", "root", "I", "q", "()I", "D", "(I)V", "Lcom/coui/appcompat/scanview/RotateLottieAnimationView;", "kotlin.jvm.PlatformType", "Lkotlin/Lazy;", "f", "()Lcom/coui/appcompat/scanview/RotateLottieAnimationView;", "albumIcon", "torchIcon", "Landroid/widget/TextView;", b2n.f, "()Landroid/widget/TextView;", iim.a.f, "Landroid/widget/FrameLayout;", "n", "()Landroid/widget/FrameLayout;", "finderHolder", "Landroidx/constraintlayout/widget/ConstraintLayout;", "s", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "rotateContentContainer", "Lcom/coui/responsiveui/config/a;", "Lcom/coui/responsiveui/config/a;", "responsiveUIConfig", "Lcom/coui/appcompat/scanview/TorchTipGroup;", "Lcom/coui/appcompat/scanview/TorchTipGroup;", "torchTipGroup", "r", "Landroid/content/Context;", "context", "torchTipMargin", "Ljava/lang/ref/WeakReference;", "Lcom/oplus/aiunit/vision/hw2;", "()Ljava/lang/ref/WeakReference;", "orientationListener", "Lcom/coui/responsiveui/config/UIConfig$WindowType;", "Lcom/coui/responsiveui/config/UIConfig$WindowType;", "lastScreenType", "<init>", "(Lcom/coui/appcompat/scanview/COUIFullscreenScanView;)V", "Companion", "a", "coui-support-scanview_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nScanViewRotateHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScanViewRotateHelper.kt\ncom/coui/appcompat/scanview/ScanViewRotateHelper\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,309:1\n321#2,4:310\n321#2,4:314\n321#2,4:318\n321#2,4:322\n321#2,4:326\n*S KotlinDebug\n*F\n+ 1 ScanViewRotateHelper.kt\ncom/coui/appcompat/scanview/ScanViewRotateHelper\n*L\n77#1:310,4\n89#1:314,4\n121#1:318,4\n129#1:322,4\n265#1:326,4\n*E\n"})
public final class ScanViewRotateHelper implements Observer<UIConfig> {
    public static final int PERCENT_UTILS_FLAG_WITHOUT_PADDING = 0;
    public static final int SCREEN_TYPE_WIDTH_THRESH_MEDIUM = 840;
    public static final int SCREEN_TYPE_WIDTH_THRESH_SMALL = 600;
    public static final int TOTAL_GRID_COUNT_SCREEN_TYPE_LARGE = 12;
    public static final int TOTAL_GRID_COUNT_SCREEN_TYPE_MEDIUM = 8;
    public static final int TOTAL_GRID_COUNT_SCREEN_TYPE_SMALL = 4;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final COUIFullscreenScanView root;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public int orientation;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final Lazy albumIcon;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy torchIcon;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final Lazy description;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy finderHolder;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    public final Lazy rotateContentContainer;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public final a responsiveUIConfig;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    public final TorchTipGroup torchTipGroup;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public final Context context;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    public final int torchTipMargin;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @NotNull
    public final Lazy orientationListener;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @NotNull
    public UIConfig.WindowType lastScreenType;

    public ScanViewRotateHelper(@NotNull COUIFullscreenScanView root) {
        Intrinsics.checkNotNullParameter(root, "root");
        this.root = root;
        this.albumIcon = LazyKt__LazyJVMKt.lazy(new Function0<RotateLottieAnimationView>() { // from class: com.coui.appcompat.scanview.ScanViewRotateHelper$albumIcon$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            public final RotateLottieAnimationView invoke() {
                return (RotateLottieAnimationView) this.this$0.root.findViewById(R$id.coui_component_scan_view_album);
            }
        });
        this.torchIcon = LazyKt__LazyJVMKt.lazy(new Function0<RotateLottieAnimationView>() { // from class: com.coui.appcompat.scanview.ScanViewRotateHelper$torchIcon$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            public final RotateLottieAnimationView invoke() {
                return (RotateLottieAnimationView) this.this$0.root.findViewById(R$id.coui_component_scan_view_torch);
            }
        });
        this.description = LazyKt__LazyJVMKt.lazy(new Function0<TextView>() { // from class: com.coui.appcompat.scanview.ScanViewRotateHelper$description$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            public final TextView invoke() {
                return (TextView) this.this$0.root.findViewById(R$id.coui_component_scan_view_description);
            }
        });
        this.finderHolder = LazyKt__LazyJVMKt.lazy(new Function0<FrameLayout>() { // from class: com.coui.appcompat.scanview.ScanViewRotateHelper$finderHolder$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            public final FrameLayout invoke() {
                return (FrameLayout) this.this$0.root.findViewById(R$id.coui_component_scan_view_finder_holder);
            }
        });
        this.rotateContentContainer = LazyKt__LazyJVMKt.lazy(new Function0<ConstraintLayout>() { // from class: com.coui.appcompat.scanview.ScanViewRotateHelper$rotateContentContainer$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            public final ConstraintLayout invoke() {
                return (ConstraintLayout) this.this$0.root.findViewById(R$id.coui_component_scan_view_rotate_container);
            }
        });
        a aVarF = a.f(root.getContext());
        this.responsiveUIConfig = aVarF;
        this.torchTipGroup = root.getTorchTipGroup();
        Context context = root.getContext();
        this.context = context;
        Intrinsics.checkNotNullExpressionValue(context, "context");
        this.torchTipMargin = h(context, R$dimen.coui_component_scan_view_torch_tip_margin);
        this.orientationListener = LazyKt__LazyJVMKt.lazy(new Function0<WeakReference<hw2>>() { // from class: com.coui.appcompat.scanview.ScanViewRotateHelper$orientationListener$2

            @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/coui/appcompat/scanview/ScanViewRotateHelper$orientationListener$2$a", "Lcom/oplus/aiunit/vision/hw2;", "", "orientation", "", "a", "coui-support-scanview_release"}, k = 1, mv = {1, 8, 0})
            public static final class a extends hw2 {
                public final /* synthetic */ ScanViewRotateHelper b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(ScanViewRotateHelper scanViewRotateHelper, Context applicationContext) {
                    super(applicationContext);
                    this.b = scanViewRotateHelper;
                    Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
                }

                @Override // com.oplus.aiunit.vision.hw2
                public void a(int orientation) {
                    if (this.b.getOrientation() == orientation) {
                        return;
                    }
                    bj2.a("ScanViewRotateHelper", "[onDirectionChanged] newOrientation=" + orientation + " oldOrientation=" + this.b.getOrientation() + " width=" + this.b.l(orientation));
                    ScanViewRotateHelper.I(this.b, orientation, false, 2, null);
                    this.b.D(orientation);
                }
            }

            {
                super(0);
            }

            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final WeakReference<hw2> invoke() {
                return new WeakReference<>(new a(this.this$0, this.this$0.context.getApplicationContext()));
            }
        });
        UIConfig.WindowType windowTypeK = aVarF.k();
        Intrinsics.checkNotNullExpressionValue(windowTypeK, "responsiveUIConfig.screenType");
        this.lastScreenType = windowTypeK;
    }

    public static /* synthetic */ void I(ScanViewRotateHelper scanViewRotateHelper, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = true;
        }
        scanViewRotateHelper.H(i, z);
    }

    public final void A() {
        this.responsiveUIConfig.l().observeForever(this);
        hw2 hw2Var = r().get();
        if (hw2Var != null) {
            hw2Var.enable();
        }
    }

    public final void B(ViewGroup container, int orientation) {
        if (TorchTipGroup.INSTANCE.c(orientation)) {
            container.setRotation(-orientation);
            container.setTranslationX(0.0f);
            container.setTranslationY(0.0f);
            ViewGroup.LayoutParams layoutParams = container.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            ((ViewGroup.MarginLayoutParams) layoutParams2).height = -1;
            ((ViewGroup.MarginLayoutParams) layoutParams2).width = -1;
            container.setLayoutParams(layoutParams2);
            return;
        }
        container.setRotation(-orientation);
        container.setTranslationX((this.root.getWidth() - this.root.getHeight()) / 2);
        container.setTranslationY((this.root.getHeight() - this.root.getWidth()) / 2);
        ViewGroup.LayoutParams layoutParams3 = container.getLayoutParams();
        if (layoutParams3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
        ((ViewGroup.MarginLayoutParams) layoutParams4).height = this.root.getWidth();
        ((ViewGroup.MarginLayoutParams) layoutParams4).width = this.root.getHeight();
        container.setLayoutParams(layoutParams4);
    }

    public final void C() {
        if (y()) {
            t().o();
            f().o();
            t().setOrientation(this.orientation);
            f().setOrientation(this.orientation);
            return;
        }
        t().n();
        t().p();
        f().n();
        f().p();
    }

    public final void D(int i) {
        this.orientation = i;
    }

    public final void E() {
        this.responsiveUIConfig.l().removeObserver(this);
        hw2 hw2Var = r().get();
        if (hw2Var != null) {
            hw2Var.disable();
        }
    }

    public final void F() {
        int iW = w(this.orientation, new ScanViewRotateHelper$updateDescriptionLp$descriptionMaxWidth$1(this));
        TextView description = g();
        Intrinsics.checkNotNullExpressionValue(description, "description");
        Size sizeP = p(description, iW);
        TextView description2 = g();
        Intrinsics.checkNotNullExpressionValue(description2, "description");
        ViewGroup.LayoutParams layoutParams = description2.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        ((ViewGroup.MarginLayoutParams) layoutParams2).width = sizeP.getWidth() - ((y() ? i(this.root, R$dimen.coui_component_scan_view_icon_margin_horizontal) : 0) * 2);
        description2.setLayoutParams(layoutParams2);
    }

    public final void G() {
        int iW = w(this.orientation, new ScanViewRotateHelper$updateFinderViewLp$finderHolderWidth$1(this));
        FrameLayout finderHolder = n();
        Intrinsics.checkNotNullExpressionValue(finderHolder, "finderHolder");
        ViewGroup.LayoutParams layoutParams = finderHolder.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        ((ViewGroup.MarginLayoutParams) layoutParams2).width = iW;
        finderHolder.setLayoutParams(layoutParams2);
    }

    public final void H(final int orientation, boolean hasAnimation) {
        final ConstraintLayout constraintLayoutS = s();
        if (y()) {
            if (((int) constraintLayoutS.getRotation()) != 0) {
                Intrinsics.checkNotNullExpressionValue(constraintLayoutS, "this");
                B(constraintLayoutS, 0);
                return;
            }
            return;
        }
        if (!hasAnimation) {
            Intrinsics.checkNotNullExpressionValue(constraintLayoutS, "this");
            B(constraintLayoutS, orientation);
        } else {
            TorchTipGroup.Companion companion = TorchTipGroup.INSTANCE;
            Intrinsics.checkNotNullExpressionValue(constraintLayoutS, "this");
            companion.a(constraintLayoutS, new Function0<Unit>() { // from class: com.coui.appcompat.scanview.ScanViewRotateHelper$updateRotateContainerOrientation$1$1
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
                    ScanViewRotateHelper scanViewRotateHelper = this.this$0;
                    ConstraintLayout constraintLayout = constraintLayoutS;
                    Intrinsics.checkNotNullExpressionValue(constraintLayout, "this");
                    scanViewRotateHelper.B(constraintLayout, orientation);
                    this.this$0.x();
                    TorchTipGroup.Companion companion2 = TorchTipGroup.INSTANCE;
                    ConstraintLayout constraintLayout2 = constraintLayoutS;
                    Intrinsics.checkNotNullExpressionValue(constraintLayout2, "this");
                    TorchTipGroup.Companion.e(companion2, constraintLayout2, null, 2, null);
                }
            });
        }
    }

    public final void J() {
        int i = this.orientation;
        TorchTipGroup torchTipGroup = this.torchTipGroup;
        Size sizeP = p(torchTipGroup.getBottomTorchTip(), w(i, new ScanViewRotateHelper$updateTorchTipGroupLp$1$torchTipMaxWidth$1(this)));
        LinearLayout bottomTorchTip = torchTipGroup.getBottomTorchTip();
        ViewGroup.LayoutParams layoutParams = bottomTorchTip.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        ((ViewGroup.MarginLayoutParams) layoutParams2).width = sizeP.getWidth();
        layoutParams2.bottomToTop = R$id.coui_component_scan_view_description;
        layoutParams2.startToStart = 0;
        layoutParams2.endToEnd = 0;
        ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = this.torchTipMargin;
        bottomTorchTip.setLayoutParams(layoutParams2);
    }

    public final RotateLottieAnimationView f() {
        return (RotateLottieAnimationView) this.albumIcon.getValue();
    }

    public final TextView g() {
        return (TextView) this.description.getValue();
    }

    public final int h(Context context, int i) {
        return context.getResources().getDimensionPixelSize(i);
    }

    public final int i(View view, int i) {
        return view.getContext().getResources().getDimensionPixelSize(i);
    }

    public final float j(int orientation) {
        Point pointA = mj2.a(this.context);
        if (y()) {
            return pointA.x;
        }
        return TorchTipGroup.INSTANCE.c(orientation) ? pointA.x : pointA.y;
    }

    public final int k(int gridCount, int orientation) {
        return MathKt__MathJVMKt.roundToInt(COUIPercentUtils.calculateWidth(j(orientation), gridCount, v(l(orientation)), 0, this.context));
    }

    public final int l(int orientation) {
        Size sizeM = m();
        if (!y() && !TorchTipGroup.INSTANCE.c(orientation)) {
            return sizeM.getHeight();
        }
        return sizeM.getWidth();
    }

    public final Size m() {
        DisplayMetrics displayMetrics = this.context.getResources().getDisplayMetrics();
        Point pointA = mj2.a(this.context);
        float f = pointA.x;
        float f2 = displayMetrics.density;
        return new Size(MathKt__MathJVMKt.roundToInt(f / f2), MathKt__MathJVMKt.roundToInt(pointA.y / f2));
    }

    public final FrameLayout n() {
        return (FrameLayout) this.finderHolder.getValue();
    }

    public final int o(int totalWidth) {
        if (totalWidth < 600) {
            return 5;
        }
        return totalWidth < 840 ? 6 : 8;
    }

    public final Size p(View view, int i) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        return new Size(view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final int getOrientation() {
        return this.orientation;
    }

    public final WeakReference<hw2> r() {
        return (WeakReference) this.orientationListener.getValue();
    }

    public final ConstraintLayout s() {
        return (ConstraintLayout) this.rotateContentContainer.getValue();
    }

    public final RotateLottieAnimationView t() {
        return (RotateLottieAnimationView) this.torchIcon.getValue();
    }

    public final int u(int totalWidth) {
        return totalWidth >= 600 ? 6 : 5;
    }

    public final int v(int width) {
        if (width < 600) {
            return 4;
        }
        return width < 840 ? 8 : 12;
    }

    public final int w(int orientation, @NotNull Function1<? super Integer, Integer> getGridCount) {
        Intrinsics.checkNotNullParameter(getGridCount, "getGridCount");
        return k(getGridCount.invoke(Integer.valueOf(l(orientation))).intValue(), orientation);
    }

    public final void x() {
        J();
        F();
        G();
        this.root.f();
    }

    public final boolean y() {
        return this.responsiveUIConfig.k() == UIConfig.WindowType.SMALL;
    }

    @Override // androidx.lifecycle.Observer
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void onChanged(@NotNull UIConfig t) {
        Intrinsics.checkNotNullParameter(t, "t");
        bj2.a("ScanViewRotateHelper", "[onChanged] lastScreenType=" + this.lastScreenType + " currentScreenType=" + this.responsiveUIConfig.k());
        if (this.lastScreenType == this.responsiveUIConfig.k()) {
            return;
        }
        UIConfig.WindowType windowTypeK = this.responsiveUIConfig.k();
        Intrinsics.checkNotNullExpressionValue(windowTypeK, "responsiveUIConfig.screenType");
        this.lastScreenType = windowTypeK;
        C();
        H(this.orientation, false);
        x();
    }
}
