package com.heytap.nearx.uikit.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.CountDownTimer;
import android.text.SpannableString;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.ScrollView;
import android.widget.TextView;
import com.cloud.sdk.cloudstorage.http.HttpHeaders;
import com.coloros.sceneservice.i.e;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.nearx.uikit.R$anim;
import com.heytap.nearx.uikit.R$attr;
import com.heytap.nearx.uikit.R$dimen;
import com.heytap.nearx.uikit.R$id;
import com.heytap.nearx.uikit.R$integer;
import com.heytap.nearx.uikit.R$layout;
import com.heytap.nearx.uikit.R$style;
import com.heytap.nearx.uikit.R$styleable;
import com.heytap.nearx.uikit.widget.NearPopTipView;
import com.oplus.aiunit.vision.vhc;
import com.oplus.aiunit.vision.xhc;
import com.oplus.aiunit.vision.z63;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import com.platform.account.webview.constant.Constants;
import com.sensorsdata.analytics.android.autotrack.aop.SensorsDataAutoTrackHelper;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Deprecated;
import p010kotlin.DeprecationLevel;
import p010kotlin.Metadata;
import p010kotlin.ReplaceWith;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import pantanal.internal.datachannel.CardAction;

/* JADX INFO: loaded from: classes18.dex */
@Deprecated(level = DeprecationLevel.WARNING, message = "不再维护", replaceWith = @ReplaceWith(expression = "NearToolTips", imports = {}))
@Metadata(d1 = {"\u0000Ó\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\f*\u0001\u0013\b\u0017\u0018\u0000 \u008c\u00012\u00020\u0001:\n\u008c\u0001\u008d\u0001\u008e\u0001\u008f\u0001\u0090\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B'\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u000bB\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\fJ\u0010\u0010X\u001a\u00020Y2\u0006\u0010Z\u001a\u00020\u001fH\u0002J\u0010\u0010[\u001a\u00020Y2\u0006\u0010Z\u001a\u00020\u001fH\u0002J\b\u0010\\\u001a\u00020YH\u0002J\b\u0010]\u001a\u00020YH\u0002J\b\u0010^\u001a\u00020YH\u0002J\u0010\u0010_\u001a\u00020Q2\u0006\u0010`\u001a\u00020\u001dH\u0002J\u0006\u0010a\u001a\u00020YJ\u0010\u0010b\u001a\u00020\u00062\u0006\u0010c\u001a\u00020\u001fH\u0002J\u0010\u0010d\u001a\u00020\u00062\u0006\u0010c\u001a\u00020\u001fH\u0002J\u0006\u0010e\u001a\u00020'J\u0006\u0010f\u001a\u00020\u001dJ\u0006\u0010g\u001a\u00020hJ\b\u0010i\u001a\u00020\u0006H\u0002J\u0006\u0010j\u001a\u00020YJ\u0010\u0010k\u001a\u00020Y2\u0006\u0010Z\u001a\u00020\u001fH\u0002J\u0010\u0010l\u001a\u00020Y2\u0006\u0010c\u001a\u00020\u001fH\u0002J\u0010\u0010m\u001a\u00020Y2\u0006\u0010c\u001a\u00020\u001fH\u0002J\b\u0010n\u001a\u00020YH\u0002J\u0016\u0010o\u001a\u00020Y2\u0006\u0010p\u001a\u00020\u00062\u0006\u0010q\u001a\u00020\u0006J\u000e\u0010r\u001a\u00020Y2\u0006\u0010s\u001a\u00020tJ\u000e\u0010u\u001a\u00020Y2\u0006\u0010`\u001a\u00020vJ\u000e\u0010u\u001a\u00020Y2\u0006\u0010`\u001a\u00020wJ\u000e\u0010x\u001a\u00020Y2\u0006\u0010y\u001a\u00020\u0006J\u0010\u0010z\u001a\u00020Y2\u0006\u00105\u001a\u000201H\u0002J\u000e\u0010{\u001a\u00020Y2\u0006\u0010|\u001a\u000201J\u000e\u0010}\u001a\u00020Y2\u0006\u0010~\u001a\u000201J\u000e\u0010\u007f\u001a\u00020Y2\u0006\u0010~\u001a\u000201J\u0017\u0010\u0080\u0001\u001a\u00020Y2\u0006\u0010G\u001a\u00020\u00062\u0006\u0010H\u001a\u00020\u0006J\u0010\u0010\u0081\u0001\u001a\u00020Y2\u0007\u0010\u0082\u0001\u001a\u00020BJ\u0011\u0010\u0083\u0001\u001a\u00020Y2\b\u0010\u0084\u0001\u001a\u00030\u0085\u0001J\u0010\u0010\u0086\u0001\u001a\u00020Y2\u0007\u0010\u0087\u0001\u001a\u00020\u0006J\u0010\u0010\u0088\u0001\u001a\u00020Y2\u0007\u0010\u0089\u0001\u001a\u00020\u0011J\t\u0010\u008a\u0001\u001a\u00020YH\u0002J\t\u0010\u008b\u0001\u001a\u00020YH\u0002R\u000e\u0010\r\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0014R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020'X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010(\u001a\u0004\u0018\u00010)X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u000e\u0010.\u001a\u00020/X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u00100\u001a\u000201X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00102\"\u0004\b3\u00104R$\u00106\u001a\u0002012\u0006\u00105\u001a\u000201@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u00102\"\u0004\b7\u00104R\u000e\u00108\u001a\u000201X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u00109\u001a\u000201X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u00102\"\u0004\b:\u00104R\u000e\u0010;\u001a\u000201X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010<\u001a\u000201X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010=\u001a\u000201X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010>\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010?\u001a\u0004\u0018\u00010@X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010A\u001a\u0004\u0018\u00010BX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010C\u001a\u00020DX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010E\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010F\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010G\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010H\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010I\u001a\u00020JX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010K\u001a\u00020LX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010M\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010N\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010O\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010P\u001a\u00020QX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010R\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010S\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010T\u001a\u00020UX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010V\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010W\u001a\u00020UX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0091\u0001"}, d2 = {"Lcom/heytap/nearx/uikit/widget/NearPopTipView;", "", "window", "Landroid/view/Window;", "(Landroid/view/Window;)V", "arrowMode", "", "(Landroid/view/Window;I)V", "backgroundColor", "z", "", "(Landroid/view/Window;IFI)V", "(Landroid/view/Window;IF)V", "alphaAnimationDuration", "alphaAnimationInterpolator", "Landroid/view/animation/Interpolator;", "anchorView", "Landroid/view/View;", "animationListener", "com/heytap/nearx/uikit/widget/NearPopTipView$animationListener$1", "Lcom/heytap/nearx/uikit/widget/NearPopTipView$animationListener$1;", "arrowDownDrawable", "Landroid/graphics/drawable/Drawable;", "arrowLeftDrawable", "arrowOffsetEnd", "arrowOffsetStart", "arrowRightDrawable", "arrowUpDrawable", "contentContainer", "Landroid/view/ViewGroup;", "contentRectOnScreen", "Landroid/graphics/Rect;", "contentTv", "Landroid/widget/TextView;", "context", "Landroid/content/Context;", "coordsOnWindow", "Landroid/graphics/Point;", "dismissIv", "Landroid/widget/ImageView;", "dismissListener", "Lcom/heytap/nearx/uikit/widget/NearPopTipView$OnDismissListener;", "getDismissListener", "()Lcom/heytap/nearx/uikit/widget/NearPopTipView$OnDismissListener;", "setDismissListener", "(Lcom/heytap/nearx/uikit/widget/NearPopTipView$OnDismissListener;)V", "dismissTouchListener", "Landroid/view/View$OnTouchListener;", "isDefaultDown", "", "()Z", "setDefaultDown", "(Z)V", "value", "isDetailFloat", "setDetailFloat", "isExiting", "isHideArrow", "setHideArrow", "isNeedAlphaAnimation", "isNeedScaleAnimation", "isTipsShowing", "mArrowMode", "mCountDownTimer", "Landroid/os/CountDownTimer;", "mPopClickListener", "Lcom/heytap/nearx/uikit/widget/NearPopTipView$OnPopTipClickListener;", "mScrollView", "Landroid/widget/ScrollView;", "mTipMarginEnd", "mainPanel", "offsetX", "offsetY", "onLayoutChangeListener", "Landroid/view/View$OnLayoutChangeListener;", "onPopupWindowDismissListener", "Landroid/widget/PopupWindow$OnDismissListener;", "parent", "pivotX", "pivotY", "popupWindow", "Lcom/heytap/nearx/uikit/widget/NearPopTipView$ToolTipsPopupWindow;", "scaleAnimationDuration", "scaleAnimationInterpolator", "tmpCoords", "", "viewPortOnScreen", "windowLocationOnScreen", "addIndicatorLeftRight", "", "rectOnScreen", "addIndicatorTopDown", "animateEnter", "animateExit", "calculatePivot", "createPopupWindow", "content", "dismiss", "getCoordDefaultDownY", "rect", "getCoordinatedY", "getDismissIv", "getMainPanel", "getPopupWindow", "Landroid/widget/PopupWindow;", "getScrollViewHeight", "hideDismissButton", "prepareContent", "refreshCoordinatedLeftRight", "refreshCoordinatedTopDown", "registerOrientationHandler", "setArrowOffset", "offsetStart", "offsetEnd", "setAutoDismiss", ClickApiEntity.TIME, "", "setContent", "Landroid/text/SpannableString;", "", "setContentTextColor", "color", "setDetailFloatStyle", "setDismissOnTouchOutside", "cancel", "setIsNeedAlphaAnimation", "isNeed", "setIsNeedScaleAnimation", "setOffset", "setPopClickListener", LogFieldKey.LEVEL_KEY, "setTextClickListener", "listener", "Landroid/view/View$OnClickListener;", "setTipIconResource", e.RESOURCE_ID, CardAction.LIFE_CIRCLE_VALUE_SHOW, "anchor", "sizePopupWindow", "unregisterOrientationHandler", "Companion", "DismissCountTimer", "OnDismissListener", "OnPopTipClickListener", "ToolTipsPopupWindow", "nearx_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public class NearPopTipView {
    public static final int ARROW_MODE_LEFT_RIGHT = 2;
    public static final int ARROW_MODE_UP_DOWN = 1;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int DISMISS_BACKGROUND_ALPHA_NORMAL = 255;
    private static final int DISMISS_BACKGROUND_ALPHA_PRESSED = 51;
    private final int alphaAnimationDuration;

    @NotNull
    private final Interpolator alphaAnimationInterpolator;

    @Nullable
    private View anchorView;

    @NotNull
    private final NearPopTipView$animationListener$1 animationListener;

    @Nullable
    private Drawable arrowDownDrawable;

    @Nullable
    private Drawable arrowLeftDrawable;
    private int arrowOffsetEnd;
    private int arrowOffsetStart;

    @Nullable
    private Drawable arrowRightDrawable;

    @Nullable
    private Drawable arrowUpDrawable;
    private ViewGroup contentContainer;

    @Nullable
    private Rect contentRectOnScreen;

    @NotNull
    private final TextView contentTv;

    @NotNull
    private final Context context;

    @NotNull
    private final Point coordsOnWindow;

    @NotNull
    private final ImageView dismissIv;

    @Nullable
    private OnDismissListener dismissListener;

    @NotNull
    private final View.OnTouchListener dismissTouchListener;
    private boolean isDefaultDown;
    private boolean isDetailFloat;
    private boolean isExiting;
    private boolean isHideArrow;
    private boolean isNeedAlphaAnimation;
    private boolean isNeedScaleAnimation;
    private boolean isTipsShowing;
    private int mArrowMode;

    @Nullable
    private CountDownTimer mCountDownTimer;

    @Nullable
    private OnPopTipClickListener mPopClickListener;

    @NotNull
    private final ScrollView mScrollView;
    private int mTipMarginEnd;

    @NotNull
    private final ViewGroup mainPanel;
    private int offsetX;
    private int offsetY;

    @NotNull
    private final View.OnLayoutChangeListener onLayoutChangeListener;

    @NotNull
    private final PopupWindow.OnDismissListener onPopupWindowDismissListener;

    @NotNull
    private final View parent;
    private float pivotX;
    private float pivotY;
    private ToolTipsPopupWindow popupWindow;
    private final int scaleAnimationDuration;

    @NotNull
    private Interpolator scaleAnimationInterpolator;

    @NotNull
    private final int[] tmpCoords;

    @NotNull
    private final Rect viewPortOnScreen;

    @NotNull
    private final int[] windowLocationOnScreen;
    private float z;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0018\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/heytap/nearx/uikit/widget/NearPopTipView$Companion;", "", "()V", "ARROW_MODE_LEFT_RIGHT", "", "ARROW_MODE_UP_DOWN", "DISMISS_BACKGROUND_ALPHA_NORMAL", "DISMISS_BACKGROUND_ALPHA_PRESSED", "createContentContainer", "Landroid/view/ViewGroup;", HttpHeaders.CTX, "Landroid/content/Context;", "createMainPanel", "backgroundColor", "nearx_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final ViewGroup createContentContainer(Context ctx) {
            FrameLayout frameLayout = new FrameLayout(ctx);
            frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            return frameLayout;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final ViewGroup createMainPanel(Context ctx, int backgroundColor) {
            View viewInflate = LayoutInflater.from(ctx).inflate(R$layout.nx_tool_tips_layout_theme1, (ViewGroup) null);
            if (viewInflate == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
            }
            FrameLayout frameLayout = (FrameLayout) viewInflate;
            frameLayout.setBackgroundColor(backgroundColor);
            return frameLayout;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0003H\u0016¨\u0006\n"}, d2 = {"Lcom/heytap/nearx/uikit/widget/NearPopTipView$DismissCountTimer;", "Landroid/os/CountDownTimer;", "millisInFuture", "", "countDownInterval", "(Lcom/heytap/nearx/uikit/widget/NearPopTipView;JJ)V", Constants.JsbConstants.METHOD_FINISH, "", "onTick", "millisUntilFinished", "nearx_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class DismissCountTimer extends CountDownTimer {
        final /* synthetic */ NearPopTipView this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DismissCountTimer(NearPopTipView this$0, long j2, long j3) {
            super(j2, j3);
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this.this$0 = this$0;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            this.this$0.dismiss();
        }

        @Override // android.os.CountDownTimer
        public void onTick(long millisUntilFinished) {
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/heytap/nearx/uikit/widget/NearPopTipView$OnDismissListener;", "", "onDismiss", "", "nearx_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public interface OnDismissListener {
        void onDismiss();
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/heytap/nearx/uikit/widget/NearPopTipView$OnPopTipClickListener;", "", "onPopClickListener", "", "nearx_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public interface OnPopTipClickListener {
        void onPopClickListener();
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\"\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H&¨\u0006\u0007"}, d2 = {"Lcom/heytap/nearx/uikit/widget/NearPopTipView$ToolTipsPopupWindow;", "Landroid/widget/PopupWindow;", "contentView", "Landroid/view/View;", "(Landroid/view/View;)V", "dismissPopupWindow", "", "nearx_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static abstract class ToolTipsPopupWindow extends PopupWindow {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ToolTipsPopupWindow(@NotNull View contentView) {
            super(contentView);
            Intrinsics.checkNotNullParameter(contentView, "contentView");
        }

        public abstract void dismissPopupWindow();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NearPopTipView(@NotNull Window window) {
        this(window, 0, 0.0f);
        Intrinsics.checkNotNullParameter(window, "window");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SensorsDataInstrumented
    /* JADX INFO: renamed from: _init_$lambda-3, reason: not valid java name */
    public static final void m4680_init_$lambda3(NearPopTipView this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.dismiss();
        SensorsDataAutoTrackHelper.trackViewOnClick(view);
    }

    private final void addIndicatorLeftRight(Rect rectOnScreen) {
        if (this.isHideArrow) {
            return;
        }
        ImageView imageView = new ImageView(this.context);
        float f = this.z;
        if (f > 0.0f) {
            imageView.setZ(f);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        ToolTipsPopupWindow toolTipsPopupWindow = this.popupWindow;
        ViewGroup viewGroup = null;
        if (toolTipsPopupWindow == null) {
            Intrinsics.throwUninitializedPropertyAccessException("popupWindow");
            toolTipsPopupWindow = null;
        }
        int height = toolTipsPopupWindow.getHeight();
        Drawable drawable = this.arrowLeftDrawable;
        layoutParams.topMargin = ((((height - (drawable == null ? 0 : drawable.getIntrinsicHeight())) / 2) - this.mainPanel.getPaddingBottom()) - this.arrowOffsetStart) + this.arrowOffsetEnd;
        if (this.coordsOnWindow.x >= rectOnScreen.left) {
            imageView.setBackground(this.arrowLeftDrawable);
            layoutParams.gravity = 3;
            int paddingLeft = this.mainPanel.getPaddingLeft();
            Drawable drawable2 = this.arrowLeftDrawable;
            layoutParams.leftMargin = ((paddingLeft - (drawable2 != null ? drawable2.getIntrinsicWidth() : 0)) + 3) - 1;
        } else {
            imageView.setBackground(this.arrowRightDrawable);
            layoutParams.gravity = 5;
            int paddingRight = this.mainPanel.getPaddingRight();
            Drawable drawable3 = this.arrowRightDrawable;
            layoutParams.rightMargin = (paddingRight - (drawable3 != null ? drawable3.getIntrinsicWidth() : 0)) + 3 + 1;
        }
        ViewGroup viewGroup2 = this.contentContainer;
        if (viewGroup2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("contentContainer");
        } else {
            viewGroup = viewGroup2;
        }
        viewGroup.addView(imageView, layoutParams);
    }

    private final void addIndicatorTopDown(Rect rectOnScreen) {
        if (this.isHideArrow) {
            return;
        }
        ImageView imageView = new ImageView(this.context);
        float f = this.z;
        if (f > 0.0f) {
            imageView.setZ(f);
        }
        this.parent.getRootView().getLocationOnScreen(this.tmpCoords);
        int i = this.tmpCoords[0];
        this.parent.getRootView().getLocationInWindow(this.tmpCoords);
        int i2 = i - this.tmpCoords[0];
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        int iCenterX = (rectOnScreen.centerX() - this.coordsOnWindow.x) - i2;
        Drawable drawable = this.arrowUpDrawable;
        layoutParams.leftMargin = ((iCenterX - ((drawable == null ? 0 : drawable.getIntrinsicWidth()) / 2)) - this.arrowOffsetStart) + this.arrowOffsetEnd;
        if (this.coordsOnWindow.y >= rectOnScreen.top) {
            imageView.setBackground(this.arrowUpDrawable);
            int paddingTop = this.mainPanel.getPaddingTop();
            Drawable drawable2 = this.arrowUpDrawable;
            layoutParams.topMargin = (paddingTop - (drawable2 != null ? drawable2.getIntrinsicHeight() : 0)) + 3;
        } else {
            imageView.setBackground(this.arrowDownDrawable);
            layoutParams.gravity = 80;
            int paddingBottom = this.mainPanel.getPaddingBottom();
            Drawable drawable3 = this.arrowDownDrawable;
            layoutParams.bottomMargin = (paddingBottom - (drawable3 != null ? drawable3.getIntrinsicHeight() : 0)) + 3;
        }
        ViewGroup viewGroup = this.contentContainer;
        if (viewGroup == null) {
            Intrinsics.throwUninitializedPropertyAccessException("contentContainer");
            viewGroup = null;
        }
        viewGroup.addView(imageView, layoutParams);
    }

    private final void animateEnter() {
        AnimationSet animationSet = new AnimationSet(false);
        if (this.isNeedScaleAnimation) {
            ScaleAnimation scaleAnimation = new ScaleAnimation(0.5f, 1.0f, 0.5f, 1.0f, 1, this.pivotX, 1, this.pivotY);
            scaleAnimation.setDuration(this.scaleAnimationDuration);
            scaleAnimation.setInterpolator(this.scaleAnimationInterpolator);
            animationSet.addAnimation(scaleAnimation);
        }
        if (this.isNeedAlphaAnimation) {
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(this.alphaAnimationDuration);
            alphaAnimation.setInterpolator(this.alphaAnimationInterpolator);
            animationSet.addAnimation(alphaAnimation);
        }
        if (!this.isNeedAlphaAnimation && !this.isNeedScaleAnimation) {
            ScaleAnimation scaleAnimation2 = new ScaleAnimation(0.5f, 1.0f, 0.5f, 1.0f, 1, this.pivotX, 1, this.pivotY);
            scaleAnimation2.setDuration(0L);
            scaleAnimation2.setInterpolator(this.scaleAnimationInterpolator);
            animationSet.addAnimation(scaleAnimation2);
            AlphaAnimation alphaAnimation2 = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation2.setDuration(0L);
            alphaAnimation2.setInterpolator(this.alphaAnimationInterpolator);
            animationSet.addAnimation(alphaAnimation2);
        }
        ViewGroup viewGroup = this.contentContainer;
        if (viewGroup == null) {
            Intrinsics.throwUninitializedPropertyAccessException("contentContainer");
            viewGroup = null;
        }
        viewGroup.startAnimation(animationSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void animateExit() {
        AnimationSet animationSet = new AnimationSet(false);
        if (this.isNeedScaleAnimation) {
            ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.5f, 1.0f, 0.5f, 1, this.pivotX, 1, this.pivotY);
            scaleAnimation.setDuration(this.scaleAnimationDuration);
            scaleAnimation.setInterpolator(this.scaleAnimationInterpolator);
            animationSet.addAnimation(scaleAnimation);
        }
        if (this.isNeedAlphaAnimation) {
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setDuration(this.alphaAnimationDuration);
            alphaAnimation.setInterpolator(this.alphaAnimationInterpolator);
            animationSet.addAnimation(alphaAnimation);
        }
        if (!this.isNeedAlphaAnimation && !this.isNeedScaleAnimation) {
            ScaleAnimation scaleAnimation2 = new ScaleAnimation(1.0f, 0.5f, 1.0f, 0.5f, 1, this.pivotX, 1, this.pivotY);
            scaleAnimation2.setDuration(0L);
            scaleAnimation2.setInterpolator(this.scaleAnimationInterpolator);
            animationSet.addAnimation(scaleAnimation2);
            AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation2.setDuration(0L);
            alphaAnimation2.setInterpolator(this.alphaAnimationInterpolator);
            animationSet.addAnimation(alphaAnimation2);
        }
        animationSet.setAnimationListener(this.animationListener);
        ViewGroup viewGroup = this.contentContainer;
        if (viewGroup == null) {
            Intrinsics.throwUninitializedPropertyAccessException("contentContainer");
            viewGroup = null;
        }
        viewGroup.startAnimation(animationSet);
    }

    private final void calculatePivot() {
        Rect rect = this.contentRectOnScreen;
        Intrinsics.checkNotNull(rect);
        int iCenterX = (rect.centerX() - this.windowLocationOnScreen[0]) - this.coordsOnWindow.x;
        ToolTipsPopupWindow toolTipsPopupWindow = this.popupWindow;
        ToolTipsPopupWindow toolTipsPopupWindow2 = null;
        if (toolTipsPopupWindow == null) {
            Intrinsics.throwUninitializedPropertyAccessException("popupWindow");
            toolTipsPopupWindow = null;
        }
        if (iCenterX >= toolTipsPopupWindow.getWidth()) {
            this.pivotX = 1.0f;
        } else {
            Rect rect2 = this.contentRectOnScreen;
            Intrinsics.checkNotNull(rect2);
            float fCenterX = (rect2.centerX() - this.windowLocationOnScreen[0]) - this.coordsOnWindow.x;
            ToolTipsPopupWindow toolTipsPopupWindow3 = this.popupWindow;
            if (toolTipsPopupWindow3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("popupWindow");
            } else {
                toolTipsPopupWindow2 = toolTipsPopupWindow3;
            }
            this.pivotX = fCenterX / toolTipsPopupWindow2.getWidth();
        }
        int i = this.coordsOnWindow.y;
        Rect rect3 = this.contentRectOnScreen;
        Intrinsics.checkNotNull(rect3);
        if (i >= rect3.top - this.windowLocationOnScreen[1]) {
            this.pivotY = 0.0f;
        } else {
            this.pivotY = 1.0f;
        }
    }

    private final ToolTipsPopupWindow createPopupWindow(final ViewGroup content) {
        ToolTipsPopupWindow toolTipsPopupWindow = new ToolTipsPopupWindow(content, this) { // from class: com.heytap.nearx.uikit.widget.NearPopTipView$createPopupWindow$popup$1
            final /* synthetic */ ViewGroup $content;
            final /* synthetic */ NearPopTipView this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(content);
                this.$content = content;
                this.this$0 = this;
            }

            @Override // android.widget.PopupWindow
            public void dismiss() {
                if (this.this$0.isExiting) {
                    return;
                }
                this.this$0.isExiting = true;
                this.this$0.animateExit();
            }

            @Override // com.heytap.nearx.uikit.widget.NearPopTipView.ToolTipsPopupWindow
            public void dismissPopupWindow() {
                super.dismiss();
                this.this$0.unregisterOrientationHandler();
                this.this$0.isTipsShowing = false;
                ViewGroup viewGroup = this.this$0.contentContainer;
                if (viewGroup == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("contentContainer");
                    viewGroup = null;
                }
                viewGroup.removeAllViews();
            }
        };
        toolTipsPopupWindow.setClippingEnabled(false);
        toolTipsPopupWindow.setAnimationStyle(0);
        toolTipsPopupWindow.setBackgroundDrawable(new ColorDrawable(0));
        content.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        toolTipsPopupWindow.setOnDismissListener(this.onPopupWindowDismissListener);
        return toolTipsPopupWindow;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: dismissTouchListener$lambda-0, reason: not valid java name */
    public static final boolean m4681dismissTouchListener$lambda0(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            if (!(view instanceof ImageView)) {
                return false;
            }
            ((ImageView) view).setImageAlpha(51);
            return false;
        }
        if ((action != 1 && action != 3) || !(view instanceof ImageView)) {
            return false;
        }
        ((ImageView) view).setImageAlpha(255);
        return false;
    }

    private final int getCoordDefaultDownY(Rect rect) {
        int i = rect.top;
        Rect rect2 = this.viewPortOnScreen;
        int i2 = i - rect2.top;
        int i3 = rect2.bottom - rect.bottom;
        ToolTipsPopupWindow toolTipsPopupWindow = this.popupWindow;
        ToolTipsPopupWindow toolTipsPopupWindow2 = null;
        if (toolTipsPopupWindow == null) {
            Intrinsics.throwUninitializedPropertyAccessException("popupWindow");
            toolTipsPopupWindow = null;
        }
        int height = toolTipsPopupWindow.getHeight() - getScrollViewHeight();
        if (i3 >= height) {
            ToolTipsPopupWindow toolTipsPopupWindow3 = this.popupWindow;
            if (toolTipsPopupWindow3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("popupWindow");
            } else {
                toolTipsPopupWindow2 = toolTipsPopupWindow3;
            }
            int iApplyDimension = (int) TypedValue.applyDimension(1, 12.0f, toolTipsPopupWindow2.getContentView().getResources().getDisplayMetrics());
            return i3 >= height + iApplyDimension ? rect.bottom + iApplyDimension : rect.bottom;
        }
        if (i2 >= height) {
            return rect.top - height;
        }
        if (i2 > i3) {
            int i4 = this.viewPortOnScreen.top;
            ToolTipsPopupWindow toolTipsPopupWindow4 = this.popupWindow;
            if (toolTipsPopupWindow4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("popupWindow");
            } else {
                toolTipsPopupWindow2 = toolTipsPopupWindow4;
            }
            toolTipsPopupWindow2.setHeight(i2);
            return i4;
        }
        int i5 = rect.bottom;
        ToolTipsPopupWindow toolTipsPopupWindow5 = this.popupWindow;
        if (toolTipsPopupWindow5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("popupWindow");
        } else {
            toolTipsPopupWindow2 = toolTipsPopupWindow5;
        }
        toolTipsPopupWindow2.setHeight(i3);
        return i5;
    }

    private final int getCoordinatedY(Rect rect) {
        int i;
        int i2 = rect.top;
        Rect rect2 = this.viewPortOnScreen;
        int i3 = i2 - rect2.top;
        int i4 = rect2.bottom - rect.bottom;
        ToolTipsPopupWindow toolTipsPopupWindow = this.popupWindow;
        ToolTipsPopupWindow toolTipsPopupWindow2 = null;
        if (toolTipsPopupWindow == null) {
            Intrinsics.throwUninitializedPropertyAccessException("popupWindow");
            toolTipsPopupWindow = null;
        }
        int height = toolTipsPopupWindow.getHeight() - getScrollViewHeight();
        if (i3 >= height) {
            return rect.top - height;
        }
        if (i4 >= height) {
            ToolTipsPopupWindow toolTipsPopupWindow3 = this.popupWindow;
            if (toolTipsPopupWindow3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("popupWindow");
            } else {
                toolTipsPopupWindow2 = toolTipsPopupWindow3;
            }
            int iApplyDimension = (int) TypedValue.applyDimension(1, 12.0f, toolTipsPopupWindow2.getContentView().getResources().getDisplayMetrics());
            if (i4 < height + iApplyDimension) {
                return rect.bottom;
            }
            i = rect.bottom + iApplyDimension;
        } else if (i3 > i4) {
            i = this.viewPortOnScreen.top;
            ToolTipsPopupWindow toolTipsPopupWindow4 = this.popupWindow;
            if (toolTipsPopupWindow4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("popupWindow");
            } else {
                toolTipsPopupWindow2 = toolTipsPopupWindow4;
            }
            toolTipsPopupWindow2.setHeight(i3);
        } else {
            i = rect.bottom;
            ToolTipsPopupWindow toolTipsPopupWindow5 = this.popupWindow;
            if (toolTipsPopupWindow5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("popupWindow");
            } else {
                toolTipsPopupWindow2 = toolTipsPopupWindow5;
            }
            toolTipsPopupWindow2.setHeight(i4);
        }
        return i;
    }

    private final int getScrollViewHeight() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onLayoutChangeListener$lambda-1, reason: not valid java name */
    public static final void m4682onLayoutChangeListener$lambda1(NearPopTipView this$0, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Rect rect = new Rect(i, i2, i3, i4);
        Rect rect2 = new Rect(i5, i6, i7, i8);
        if (!this$0.isTipsShowing || Intrinsics.areEqual(rect, rect2) || this$0.anchorView == null) {
            return;
        }
        this$0.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onPopupWindowDismissListener$lambda-2, reason: not valid java name */
    public static final void m4683onPopupWindowDismissListener$lambda2(NearPopTipView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.isTipsShowing = false;
        ViewGroup viewGroup = this$0.contentContainer;
        if (viewGroup == null) {
            Intrinsics.throwUninitializedPropertyAccessException("contentContainer");
            viewGroup = null;
        }
        viewGroup.removeAllViews();
        CountDownTimer countDownTimer = this$0.mCountDownTimer;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        OnDismissListener onDismissListener = this$0.dismissListener;
        if (onDismissListener == null) {
            return;
        }
        onDismissListener.onDismiss();
    }

    private final void prepareContent(Rect rectOnScreen) {
        ViewGroup viewGroup = this.contentContainer;
        ViewGroup viewGroup2 = null;
        if (viewGroup == null) {
            Intrinsics.throwUninitializedPropertyAccessException("contentContainer");
            viewGroup = null;
        }
        viewGroup.removeAllViews();
        ViewGroup viewGroup3 = this.contentContainer;
        if (viewGroup3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("contentContainer");
        } else {
            viewGroup2 = viewGroup3;
        }
        viewGroup2.addView(this.mainPanel);
        if (this.mArrowMode == 1 || this.isDetailFloat) {
            addIndicatorTopDown(rectOnScreen);
        } else {
            addIndicatorLeftRight(rectOnScreen);
        }
    }

    private final void refreshCoordinatedLeftRight(Rect rect) {
        int i;
        Rect rect2 = this.contentRectOnScreen;
        Intrinsics.checkNotNull(rect2);
        int iCenterY = rect2.centerY();
        ToolTipsPopupWindow toolTipsPopupWindow = this.popupWindow;
        ToolTipsPopupWindow toolTipsPopupWindow2 = null;
        if (toolTipsPopupWindow == null) {
            Intrinsics.throwUninitializedPropertyAccessException("popupWindow");
            toolTipsPopupWindow = null;
        }
        int height = (iCenterY - (toolTipsPopupWindow.getHeight() / 2)) + this.mainPanel.getPaddingBottom();
        int i2 = rect.left;
        Rect rect3 = this.viewPortOnScreen;
        int i3 = i2 - rect3.left;
        int i4 = rect3.right - rect.right;
        ToolTipsPopupWindow toolTipsPopupWindow3 = this.popupWindow;
        if (toolTipsPopupWindow3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("popupWindow");
            toolTipsPopupWindow3 = null;
        }
        int width = toolTipsPopupWindow3.getWidth();
        if (i3 >= width) {
            i = rect.left - width;
        } else if (i4 >= width) {
            ToolTipsPopupWindow toolTipsPopupWindow4 = this.popupWindow;
            if (toolTipsPopupWindow4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("popupWindow");
            } else {
                toolTipsPopupWindow2 = toolTipsPopupWindow4;
            }
            int iApplyDimension = (int) TypedValue.applyDimension(1, 12.0f, toolTipsPopupWindow2.getContentView().getResources().getDisplayMetrics());
            i = i4 >= width + iApplyDimension ? rect.right + iApplyDimension : rect.right;
        } else if (i3 > i4) {
            i = this.viewPortOnScreen.left;
            ToolTipsPopupWindow toolTipsPopupWindow5 = this.popupWindow;
            if (toolTipsPopupWindow5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("popupWindow");
            } else {
                toolTipsPopupWindow2 = toolTipsPopupWindow5;
            }
            toolTipsPopupWindow2.setWidth(i3);
        } else {
            i = rect.right;
            ToolTipsPopupWindow toolTipsPopupWindow6 = this.popupWindow;
            if (toolTipsPopupWindow6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("popupWindow");
            } else {
                toolTipsPopupWindow2 = toolTipsPopupWindow6;
            }
            toolTipsPopupWindow2.setWidth(i4);
        }
        this.parent.getRootView().getLocationOnScreen(this.tmpCoords);
        int[] iArr = this.tmpCoords;
        int i5 = iArr[0];
        int i6 = iArr[1];
        this.parent.getRootView().getLocationInWindow(this.tmpCoords);
        int[] iArr2 = this.tmpCoords;
        int i7 = iArr2[0];
        int i8 = iArr2[1];
        int[] iArr3 = this.windowLocationOnScreen;
        int i9 = i5 - i7;
        iArr3[0] = i9;
        iArr3[1] = i6 - i8;
        this.coordsOnWindow.set(Math.max(0, i - i9), Math.max(0, height - this.windowLocationOnScreen[1]));
    }

    private final void refreshCoordinatedTopDown(Rect rect) {
        int iCenterX = rect.centerX();
        ToolTipsPopupWindow toolTipsPopupWindow = this.popupWindow;
        ToolTipsPopupWindow toolTipsPopupWindow2 = null;
        if (toolTipsPopupWindow == null) {
            Intrinsics.throwUninitializedPropertyAccessException("popupWindow");
            toolTipsPopupWindow = null;
        }
        int width = iCenterX - (toolTipsPopupWindow.getWidth() / 2);
        int i = this.viewPortOnScreen.right;
        ToolTipsPopupWindow toolTipsPopupWindow3 = this.popupWindow;
        if (toolTipsPopupWindow3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("popupWindow");
        } else {
            toolTipsPopupWindow2 = toolTipsPopupWindow3;
        }
        int iMin = Math.min(width, i - toolTipsPopupWindow2.getWidth());
        int coordinatedY = !this.isDefaultDown ? getCoordinatedY(rect) : getCoordDefaultDownY(rect);
        this.parent.getRootView().getLocationOnScreen(this.tmpCoords);
        int[] iArr = this.tmpCoords;
        int i2 = iArr[0];
        int i3 = iArr[1];
        this.parent.getRootView().getLocationInWindow(this.tmpCoords);
        int[] iArr2 = this.tmpCoords;
        int i4 = iArr2[0];
        int i5 = iArr2[1];
        int[] iArr3 = this.windowLocationOnScreen;
        int i6 = i2 - i4;
        iArr3[0] = i6;
        iArr3[1] = i3 - i5;
        this.coordsOnWindow.set(Math.max(0, iMin - i6), Math.max(0, coordinatedY - this.windowLocationOnScreen[1]));
    }

    private final void registerOrientationHandler() {
        unregisterOrientationHandler();
        this.parent.addOnLayoutChangeListener(this.onLayoutChangeListener);
    }

    private final void setDetailFloatStyle(boolean value) {
        int i;
        int i2;
        if (value) {
            i = R$attr.NearPopTipDetailFloatingStyle;
            i2 = R$style.NearPopTip_DetailFloating;
            this.dismissIv.setVisibility(8);
        } else {
            i = R$attr.NearPopTipStyle;
            i2 = R$style.NearPopTip;
        }
        ViewGroup viewGroup = null;
        TypedArray typedArrayObtainStyledAttributes = this.context.obtainStyledAttributes(null, R$styleable.NearPopTipView, i, i2);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "context.obtainStyledAttr…efStyleAttr, defStyleRes)");
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.NearPopTipView_nxTipMarginStart, 0);
        this.mTipMarginEnd = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.NearPopTipView_nxTipMarginEnd, 0);
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.NearPopTipView_nxTipMarginBottom, 0);
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.NearPopTipView_nxTipMarginTop, 0);
        int dimensionPixelSize4 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.NearPopTipView_nxTipIconMarginStart, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(R$styleable.NearPopTipView_nxTipBackground);
        ViewGroup viewGroup2 = this.contentContainer;
        if (viewGroup2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("contentContainer");
        } else {
            viewGroup = viewGroup2;
        }
        vhc.b(viewGroup, false);
        this.arrowUpDrawable = typedArrayObtainStyledAttributes.getDrawable(R$styleable.NearPopTipView_nxArrowUpDrawable);
        this.arrowDownDrawable = typedArrayObtainStyledAttributes.getDrawable(R$styleable.NearPopTipView_nxArrowDownDrawable);
        this.arrowLeftDrawable = typedArrayObtainStyledAttributes.getDrawable(R$styleable.NearPopTipView_nxArrowLeftDrawable);
        this.arrowRightDrawable = typedArrayObtainStyledAttributes.getDrawable(R$styleable.NearPopTipView_nxArrowRightDrawable);
        this.contentTv.setTextColor(typedArrayObtainStyledAttributes.getColorStateList(R$styleable.NearPopTipView_nxContentTextColor));
        ViewGroup.LayoutParams layoutParams = this.mScrollView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.setMargins(dimensionPixelSize, dimensionPixelSize3, this.mTipMarginEnd, dimensionPixelSize2);
        layoutParams2.setMarginStart(dimensionPixelSize);
        layoutParams2.setMarginEnd(this.mTipMarginEnd);
        ViewGroup.LayoutParams layoutParams3 = this.dismissIv.getLayoutParams();
        if (layoutParams3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
        ((FrameLayout.LayoutParams) layoutParams3).setMarginStart(dimensionPixelSize4);
        this.mainPanel.setBackground(drawable);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SensorsDataInstrumented
    /* JADX INFO: renamed from: setPopClickListener$lambda-4, reason: not valid java name */
    public static final void m4684setPopClickListener$lambda4(NearPopTipView this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        OnPopTipClickListener onPopTipClickListener = this$0.mPopClickListener;
        if (onPopTipClickListener != null) {
            onPopTipClickListener.onPopClickListener();
        }
        SensorsDataAutoTrackHelper.trackViewOnClick(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SensorsDataInstrumented
    /* JADX INFO: renamed from: setPopClickListener$lambda-5, reason: not valid java name */
    public static final void m4685setPopClickListener$lambda5(NearPopTipView this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        OnPopTipClickListener onPopTipClickListener = this$0.mPopClickListener;
        if (onPopTipClickListener != null) {
            onPopTipClickListener.onPopClickListener();
        }
        SensorsDataAutoTrackHelper.trackViewOnClick(view);
    }

    private final void sizePopupWindow() {
        int dimensionPixelSize = this.context.getResources().getDimensionPixelSize(R$dimen.NXtool_tips_max_width) + this.mainPanel.getPaddingLeft() + this.mainPanel.getPaddingRight();
        ViewGroup.LayoutParams layoutParams = this.mScrollView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        this.contentTv.setMaxWidth((((dimensionPixelSize - this.mainPanel.getPaddingLeft()) - this.mainPanel.getPaddingRight()) - layoutParams2.leftMargin) - layoutParams2.rightMargin);
        this.mainPanel.measure(0, 0);
        ToolTipsPopupWindow toolTipsPopupWindow = this.popupWindow;
        ToolTipsPopupWindow toolTipsPopupWindow2 = null;
        if (toolTipsPopupWindow == null) {
            Intrinsics.throwUninitializedPropertyAccessException("popupWindow");
            toolTipsPopupWindow = null;
        }
        toolTipsPopupWindow.setWidth(Math.min(this.mainPanel.getMeasuredWidth(), dimensionPixelSize));
        ToolTipsPopupWindow toolTipsPopupWindow3 = this.popupWindow;
        if (toolTipsPopupWindow3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("popupWindow");
        } else {
            toolTipsPopupWindow2 = toolTipsPopupWindow3;
        }
        toolTipsPopupWindow2.setHeight(this.mainPanel.getMeasuredHeight() + getScrollViewHeight());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void unregisterOrientationHandler() {
        this.parent.removeOnLayoutChangeListener(this.onLayoutChangeListener);
    }

    public final void dismiss() {
        ToolTipsPopupWindow toolTipsPopupWindow = this.popupWindow;
        if (toolTipsPopupWindow == null) {
            Intrinsics.throwUninitializedPropertyAccessException("popupWindow");
            toolTipsPopupWindow = null;
        }
        toolTipsPopupWindow.dismiss();
    }

    @NotNull
    public final ImageView getDismissIv() {
        return this.dismissIv;
    }

    @Nullable
    public final OnDismissListener getDismissListener() {
        return this.dismissListener;
    }

    @NotNull
    public final ViewGroup getMainPanel() {
        return this.mainPanel;
    }

    @NotNull
    public final PopupWindow getPopupWindow() {
        ToolTipsPopupWindow toolTipsPopupWindow = this.popupWindow;
        if (toolTipsPopupWindow != null) {
            return toolTipsPopupWindow;
        }
        Intrinsics.throwUninitializedPropertyAccessException("popupWindow");
        return null;
    }

    public final void hideDismissButton() {
        this.dismissIv.setVisibility(8);
        ViewGroup.LayoutParams layoutParams = this.mScrollView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        if (!this.isDetailFloat) {
            layoutParams2.setMarginEnd(layoutParams2.getMarginStart());
        }
        this.mScrollView.setLayoutParams(layoutParams2);
    }

    /* JADX INFO: renamed from: isDefaultDown, reason: from getter */
    public final boolean getIsDefaultDown() {
        return this.isDefaultDown;
    }

    /* JADX INFO: renamed from: isDetailFloat, reason: from getter */
    public final boolean getIsDetailFloat() {
        return this.isDetailFloat;
    }

    /* JADX INFO: renamed from: isHideArrow, reason: from getter */
    public final boolean getIsHideArrow() {
        return this.isHideArrow;
    }

    public final void setArrowOffset(int offsetStart, int offsetEnd) {
        this.arrowOffsetStart = offsetStart;
        this.arrowOffsetEnd = offsetEnd;
    }

    public final void setAutoDismiss(long time) {
        setDismissOnTouchOutside(false);
        if (this.mCountDownTimer == null) {
            this.mCountDownTimer = new DismissCountTimer(this, time, 1000L);
        }
        CountDownTimer countDownTimer = this.mCountDownTimer;
        if (countDownTimer == null) {
            return;
        }
        countDownTimer.start();
    }

    public final void setContent(@NotNull String content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.contentTv.setText(content);
    }

    public final void setContentTextColor(int color) {
        this.contentTv.setTextColor(color);
    }

    public final void setDefaultDown(boolean z) {
        this.isDefaultDown = z;
    }

    public final void setDetailFloat(boolean z) {
        setDetailFloatStyle(z);
    }

    public final void setDismissListener(@Nullable OnDismissListener onDismissListener) {
        this.dismissListener = onDismissListener;
    }

    public final void setDismissOnTouchOutside(boolean cancel) {
        ToolTipsPopupWindow toolTipsPopupWindow = null;
        if (cancel) {
            ToolTipsPopupWindow toolTipsPopupWindow2 = this.popupWindow;
            if (toolTipsPopupWindow2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("popupWindow");
                toolTipsPopupWindow2 = null;
            }
            toolTipsPopupWindow2.setTouchable(true);
            ToolTipsPopupWindow toolTipsPopupWindow3 = this.popupWindow;
            if (toolTipsPopupWindow3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("popupWindow");
                toolTipsPopupWindow3 = null;
            }
            toolTipsPopupWindow3.setFocusable(true);
            ToolTipsPopupWindow toolTipsPopupWindow4 = this.popupWindow;
            if (toolTipsPopupWindow4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("popupWindow");
                toolTipsPopupWindow4 = null;
            }
            toolTipsPopupWindow4.setOutsideTouchable(true);
        } else {
            ToolTipsPopupWindow toolTipsPopupWindow5 = this.popupWindow;
            if (toolTipsPopupWindow5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("popupWindow");
                toolTipsPopupWindow5 = null;
            }
            toolTipsPopupWindow5.setFocusable(false);
            ToolTipsPopupWindow toolTipsPopupWindow6 = this.popupWindow;
            if (toolTipsPopupWindow6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("popupWindow");
                toolTipsPopupWindow6 = null;
            }
            toolTipsPopupWindow6.setOutsideTouchable(false);
        }
        ToolTipsPopupWindow toolTipsPopupWindow7 = this.popupWindow;
        if (toolTipsPopupWindow7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("popupWindow");
        } else {
            toolTipsPopupWindow = toolTipsPopupWindow7;
        }
        toolTipsPopupWindow.update();
    }

    public final void setHideArrow(boolean z) {
        this.isHideArrow = z;
    }

    public final void setIsNeedAlphaAnimation(boolean isNeed) {
        this.isNeedAlphaAnimation = isNeed;
    }

    public final void setIsNeedScaleAnimation(boolean isNeed) {
        this.isNeedScaleAnimation = isNeed;
    }

    public final void setOffset(int offsetX, int offsetY) {
        this.offsetX = offsetX;
        this.offsetY = offsetY;
    }

    public final void setPopClickListener(@NotNull OnPopTipClickListener l2) {
        Intrinsics.checkNotNullParameter(l2, "l");
        this.mPopClickListener = l2;
        TextView textView = this.contentTv;
        if (textView != null) {
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.ujc
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    NearPopTipView.m4684setPopClickListener$lambda4(this.i, view);
                }
            });
        }
        ViewGroup viewGroup = this.mainPanel;
        if (viewGroup == null) {
            return;
        }
        viewGroup.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.vjc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NearPopTipView.m4685setPopClickListener$lambda5(this.i, view);
            }
        });
    }

    public final void setTextClickListener(@NotNull View.OnClickListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.contentTv.setOnClickListener(listener);
    }

    public final void setTipIconResource(int resourceId) {
        this.dismissIv.setImageResource(resourceId);
    }

    public final void show(@NotNull View anchor) {
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        if (this.isTipsShowing) {
            return;
        }
        this.anchorView = anchor;
        this.isTipsShowing = true;
        this.parent.getWindowVisibleDisplayFrame(this.viewPortOnScreen);
        registerOrientationHandler();
        Rect rect = new Rect();
        this.contentRectOnScreen = rect;
        anchor.getGlobalVisibleRect(rect);
        int[] iArr = new int[2];
        this.parent.getLocationOnScreen(iArr);
        Rect rect2 = this.contentRectOnScreen;
        Intrinsics.checkNotNull(rect2);
        rect2.offset(iArr[0], iArr[1]);
        sizePopupWindow();
        if (this.mArrowMode == 1 || this.isDetailFloat) {
            Rect rect3 = this.contentRectOnScreen;
            Intrinsics.checkNotNull(rect3);
            refreshCoordinatedTopDown(rect3);
        } else {
            Rect rect4 = this.contentRectOnScreen;
            Intrinsics.checkNotNull(rect4);
            refreshCoordinatedLeftRight(rect4);
        }
        Rect rect5 = this.contentRectOnScreen;
        Intrinsics.checkNotNull(rect5);
        prepareContent(rect5);
        calculatePivot();
        animateEnter();
        ToolTipsPopupWindow toolTipsPopupWindow = this.popupWindow;
        if (toolTipsPopupWindow == null) {
            Intrinsics.throwUninitializedPropertyAccessException("popupWindow");
            toolTipsPopupWindow = null;
        }
        View view = this.parent;
        Point point = this.coordsOnWindow;
        toolTipsPopupWindow.showAtLocation(view, 0, point.x + this.offsetX, point.y + this.offsetY);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NearPopTipView(@NotNull Window window, int i) {
        this(window, 0, 0.0f);
        Intrinsics.checkNotNullParameter(window, "window");
        this.mArrowMode = i;
    }

    public final void setContent(@NotNull SpannableString content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.contentTv.setText(content);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NearPopTipView(@NotNull Window window, int i, float f, int i2) {
        this(window, i, f);
        Intrinsics.checkNotNullParameter(window, "window");
        this.mArrowMode = i2;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.heytap.nearx.uikit.widget.NearPopTipView$animationListener$1] */
    public NearPopTipView(@NotNull Window window, int i, float f) {
        Intrinsics.checkNotNullParameter(window, "window");
        this.mArrowMode = 1;
        this.viewPortOnScreen = new Rect();
        this.tmpCoords = new int[2];
        this.windowLocationOnScreen = new int[2];
        this.coordsOnWindow = new Point();
        this.isNeedScaleAnimation = true;
        this.isNeedAlphaAnimation = true;
        this.animationListener = new Animation.AnimationListener() { // from class: com.heytap.nearx.uikit.widget.NearPopTipView$animationListener$1
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(@NotNull Animation animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                NearPopTipView.ToolTipsPopupWindow toolTipsPopupWindow = this.this$0.popupWindow;
                if (toolTipsPopupWindow == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("popupWindow");
                    toolTipsPopupWindow = null;
                }
                toolTipsPopupWindow.dismissPopupWindow();
                this.this$0.isExiting = false;
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(@NotNull Animation animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(@NotNull Animation animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
            }
        };
        View.OnTouchListener onTouchListener = new View.OnTouchListener() { // from class: com.oplus.aiunit.vision.qjc
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return NearPopTipView.m4681dismissTouchListener$lambda0(view, motionEvent);
            }
        };
        this.dismissTouchListener = onTouchListener;
        this.onLayoutChangeListener = new View.OnLayoutChangeListener() { // from class: com.oplus.aiunit.vision.rjc
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                NearPopTipView.m4682onLayoutChangeListener$lambda1(this.i, view, i2, i3, i4, i5, i6, i7, i8, i9);
            }
        };
        this.onPopupWindowDismissListener = new PopupWindow.OnDismissListener() { // from class: com.oplus.aiunit.vision.sjc
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                NearPopTipView.m4683onPopupWindowDismissListener$lambda2(this.i);
            }
        };
        this.z = f;
        Context context = window.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "window.context");
        this.context = context;
        View decorView = window.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "window.decorView");
        this.parent = decorView;
        Resources resources = context.getResources();
        int i2 = R$integer.NXtheme1_animation_time_move_veryfast;
        this.scaleAnimationDuration = resources.getInteger(i2);
        this.alphaAnimationDuration = context.getResources().getInteger(i2);
        Interpolator interpolatorLoadInterpolator = AnimationUtils.loadInterpolator(context, R$anim.nx_curve_opacity_inout);
        Intrinsics.checkNotNullExpressionValue(interpolatorLoadInterpolator, "loadInterpolator(context…m.nx_curve_opacity_inout)");
        this.scaleAnimationInterpolator = interpolatorLoadInterpolator;
        this.alphaAnimationInterpolator = interpolatorLoadInterpolator;
        Companion companion = INSTANCE;
        ViewGroup viewGroupCreateMainPanel = companion.createMainPanel(context, i);
        this.mainPanel = viewGroupCreateMainPanel;
        if (f > 0.0f) {
            viewGroupCreateMainPanel.setZ(f);
        }
        this.contentContainer = companion.createContentContainer(context);
        View viewFindViewById = viewGroupCreateMainPanel.findViewById(R$id.contentSv);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "mainPanel.findViewById(R.id.contentSv)");
        this.mScrollView = (ScrollView) viewFindViewById;
        View viewFindViewById2 = viewGroupCreateMainPanel.findViewById(R$id.contentTv);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "mainPanel.findViewById(R.id.contentTv)");
        TextView textView = (TextView) viewFindViewById2;
        this.contentTv = textView;
        View viewFindViewById3 = viewGroupCreateMainPanel.findViewById(R$id.dismissIv);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "mainPanel.findViewById(R.id.dismissIv)");
        ImageView imageView = (ImageView) viewFindViewById3;
        this.dismissIv = imageView;
        textView.setTextSize(0, (int) z63.c(context.getResources().getDimensionPixelSize(R$dimen.NXtool_tips_content_text_size), context.getResources().getConfiguration().fontScale, 5));
        imageView.setImageAlpha(255);
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.tjc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NearPopTipView.m4680_init_$lambda3(this.i, view);
            }
        });
        imageView.setOnTouchListener(onTouchListener);
        setDetailFloatStyle(this.isDetailFloat);
        Drawable background = viewGroupCreateMainPanel.getBackground();
        if (i != 0) {
            xhc.d(background, i);
            xhc.d(this.arrowDownDrawable, i);
            xhc.d(this.arrowUpDrawable, i);
            xhc.d(this.arrowLeftDrawable, i);
            xhc.d(this.arrowRightDrawable, i);
        }
        ViewGroup viewGroup = this.contentContainer;
        if (viewGroup == null) {
            Intrinsics.throwUninitializedPropertyAccessException("contentContainer");
            viewGroup = null;
        }
        this.popupWindow = createPopupWindow(viewGroup);
    }
}
