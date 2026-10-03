package com.heytap.nearx.uikit.widget.navigation;

import android.R;
import android.animation.Animator;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuView;
import androidx.appcompat.widget.TooltipCompat;
import androidx.core.view.PointerIconCompat;
import androidx.core.view.ViewCompat;
import com.heytap.nearx.tangramconfig.strategy.Fields;
import com.heytap.nearx.uikit.R$attr;
import com.heytap.nearx.uikit.R$id;
import com.heytap.nearx.uikit.R$layout;
import com.heytap.nearx.uikit.R$styleable;
import com.heytap.nearx.uikit.widget.NearHintRedDot;
import com.oplus.aiunit.vision.jd1;
import com.oplus.aiunit.vision.whc;
import com.oplus.aiunit.vision.xhc;
import com.oplus.aiunit.vision.y04;
import com.oplus.smartenginehelper.ParserTag;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import com.oplus.smartenginehelper.entity.ViewEntity;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\f\n\u0002\b\r\n\u0002\u0010\r\n\u0002\b\u0007\u0018\u0000 \u0083\u00012\u00020\u00012\u00020\u0002:\u0002\u0083\u0001B9\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0010\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020\bH\u0002J\u0006\u0010B\u001a\u00020@J\u0006\u0010C\u001a\u00020@J\b\u0010D\u001a\u00020@H\u0002J\n\u0010E\u001a\u0004\u0018\u00010(H\u0016J2\u0010F\u001a\u00020@2\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0018\u0010G\u001a\u00020@2\u0006\u0010H\u001a\u00020(2\u0006\u0010I\u001a\u00020\bH\u0016J\b\u0010J\u001a\u00020@H\u0002J\u0012\u0010K\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0002J\u0012\u0010L\u001a\u00020@2\b\u0010M\u001a\u0004\u0018\u00010NH\u0014J\u0010\u0010O\u001a\u00020P2\u0006\u0010Q\u001a\u00020\bH\u0016J0\u0010R\u001a\u00020@2\u0006\u0010S\u001a\u00020\u000b2\u0006\u0010T\u001a\u00020\b2\u0006\u0010U\u001a\u00020\b2\u0006\u0010V\u001a\u00020\b2\u0006\u0010W\u001a\u00020\bH\u0014J\u0018\u0010X\u001a\u00020@2\u0006\u0010Y\u001a\u00020\b2\u0006\u0010Z\u001a\u00020\bH\u0014J\b\u0010[\u001a\u00020\u000bH\u0016J\u0010\u0010\\\u001a\u00020@2\u0006\u0010]\u001a\u00020\u000bH\u0016J\u0010\u0010^\u001a\u00020@2\u0006\u0010_\u001a\u00020\u000bH\u0016J\u0010\u0010`\u001a\u00020@2\u0006\u0010a\u001a\u00020\u000bH\u0016J\u0012\u0010b\u001a\u00020@2\b\u0010c\u001a\u0004\u0018\u00010dH\u0016J\u0006\u0010e\u001a\u00020@J\u0010\u0010f\u001a\u00020@2\b\u0010g\u001a\u0004\u0018\u00010!J\u000e\u0010h\u001a\u00020@2\u0006\u0010i\u001a\u00020\bJ\u000e\u0010j\u001a\u00020@2\u0006\u0010k\u001a\u00020\bJ\u0018\u0010l\u001a\u00020@2\u0006\u0010m\u001a\u00020\u000b2\u0006\u0010n\u001a\u00020oH\u0016J\u0010\u0010p\u001a\u00020@2\b\u0010q\u001a\u0004\u0018\u00010!J\u0015\u0010p\u001a\u00020@2\b\u0010q\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010rJ\u000e\u0010s\u001a\u00020@2\u0006\u0010A\u001a\u00020\bJ\u0016\u0010t\u001a\u00020@2\u0006\u00105\u001a\u00020\b2\u0006\u0010>\u001a\u00020\bJ6\u0010t\u001a\u00020@2\u0006\u00105\u001a\u00020\b2\u0006\u0010>\u001a\u00020\b2\u0006\u0010u\u001a\u00020\b2\u0006\u0010v\u001a\u00020\b2\u0006\u0010w\u001a\u00020\b2\u0006\u0010x\u001a\u00020\bJF\u0010t\u001a\u00020@2\u0006\u00105\u001a\u00020\b2\u0006\u0010>\u001a\u00020\b2\u0006\u0010y\u001a\u00020\b2\u0006\u0010z\u001a\u00020\b2\u0006\u0010u\u001a\u00020\b2\u0006\u0010v\u001a\u00020\b2\u0006\u0010w\u001a\u00020\b2\u0006\u0010x\u001a\u00020\bJ\u0016\u0010t\u001a\u00020@2\u0006\u00105\u001a\u0002062\u0006\u0010>\u001a\u00020\bJ6\u0010t\u001a\u00020@2\u0006\u00105\u001a\u0002062\u0006\u0010>\u001a\u00020\b2\u0006\u0010u\u001a\u00020\b2\u0006\u0010v\u001a\u00020\b2\u0006\u0010w\u001a\u00020\b2\u0006\u0010x\u001a\u00020\bJF\u0010t\u001a\u00020@2\u0006\u00105\u001a\u0002062\u0006\u0010>\u001a\u00020\b2\u0006\u0010y\u001a\u00020\b2\u0006\u0010z\u001a\u00020\b2\u0006\u0010u\u001a\u00020\b2\u0006\u0010v\u001a\u00020\b2\u0006\u0010w\u001a\u00020\b2\u0006\u0010x\u001a\u00020\bJ\u0012\u0010{\u001a\u00020@2\b\u0010|\u001a\u0004\u0018\u00010}H\u0016J\u000e\u0010~\u001a\u00020@2\u0006\u0010\u007f\u001a\u00020\bJ\t\u0010\u0080\u0001\u001a\u00020\u000bH\u0016J\u0007\u0010\u0081\u0001\u001a\u00020@J\u0007\u0010\u0082\u0001\u001a\u00020@R\u000e\u0010\r\u001a\u00020\u000eX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000eX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000eX\u0082D¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u000e\u0010\u001e\u001a\u00020\u001fX\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010!X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\"\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u0010\u0010'\u001a\u0004\u0018\u00010(X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020+X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010,\u001a\u0004\u0018\u00010!X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010-\u001a\u0004\u0018\u00010.X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010/\u001a\u0004\u0018\u00010.X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u000202X\u0082.¢\u0006\u0002\n\u0000R\u0010\u00103\u001a\u0004\u0018\u000104X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u000206X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u00107\u001a\u000208X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u000e\u0010=\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010>\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0084\u0001"}, d2 = {"Lcom/heytap/nearx/uikit/widget/navigation/BottomNavigationItemView;", "Landroid/widget/FrameLayout;", "Landroidx/appcompat/view/menu/MenuView$ItemView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "layoutId", "isEnlargeItemView", "", "(Landroid/content/Context;Landroid/util/AttributeSet;IIZ)V", "ONE", "", "POINT_FIVE", "POINT_THREE", "ZERO", "flRoot", "isNeedTextViewGone", "itemPosition", "getItemPosition", "()I", "setItemPosition", "(I)V", "mAttrs", "getMAttrs", "()Landroid/util/AttributeSet;", "setMAttrs", "(Landroid/util/AttributeSet;)V", "mIcon", "Landroid/widget/ImageView;", "mIconTint", "Landroid/content/res/ColorStateList;", "mIsEnlargeItemView", "getMIsEnlargeItemView", "()Z", "setMIsEnlargeItemView", "(Z)V", "mItemData", "Landroidx/appcompat/view/menu/MenuItemImpl;", "mLayoutId", "mRootLayout", "Landroid/widget/RelativeLayout;", "mTextColor", "mTextEnterAnim", "Landroid/animation/Animator;", "mTextExitAnim", "mTextSize", "mTipView", "Lcom/heytap/nearx/uikit/widget/NearHintRedDot;", "mTipsHideAnim", "Landroid/view/animation/ScaleAnimation;", "number", "", "textView", "Landroid/widget/TextView;", "getTextView", "()Landroid/widget/TextView;", "setTextView", "(Landroid/widget/TextView;)V", "textViewVisibility", "type", "checkEnlargeIcon", "", "size", "clearColorFilter", "clearTips", "createTipsHideAnimator", "getItemData", "initView", "initialize", "itemData", "menuType", "initializeAnim", "isRtlMode", "onConfigurationChanged", "newConfig", "Landroid/content/res/Configuration;", "onCreateDrawableState", "", "extraSpace", "onLayout", "changed", y04.TIME_STYLE_LEFT_DIR_NAME, "top", y04.TIME_STYLE_RIGHT_DIR_NAME, "bottom", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "prefersCondensedTitle", "setCheckable", "checkable", "setChecked", "checked", ClickApiEntity.SET_ENABLED, ViewEntity.ENABLED, "setIcon", "icon", "Landroid/graphics/drawable/Drawable;", "setIconTintForWhite", "setIconTintList", "tint", "setItemBackground", "background", "setMaxTextWidth", ParserTag.TAG_MAX_WIDTH, "setShortcut", "showShortcut", "shortcutKey", "", ClickApiEntity.SET_TEXT_COLOR, "color", "(Ljava/lang/Integer;)V", ClickApiEntity.SET_TEXT_SIZE, "setTipsView", "marginStart", "marginTop", ParserTag.TAG_TEXT_SIZE, "radius", Fields.WIDTH_FIELD, Fields.HEIGHT_FIELD, "setTitle", "title", "", "setTitleVisibility", "visibility", "showsIcon", "startTextEnterAnimation", "startTextExitAnimation", "Companion", "nearx_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class BottomNavigationItemView extends FrameLayout implements MenuView.ItemView {
    private final float ONE;
    private final float POINT_FIVE;
    private final float POINT_THREE;
    private final float ZERO;

    @NotNull
    public Map<Integer, View> _$_findViewCache;

    @Nullable
    private FrameLayout flRoot;
    private boolean isNeedTextViewGone;
    private int itemPosition;

    @Nullable
    private AttributeSet mAttrs;
    private ImageView mIcon;

    @Nullable
    private ColorStateList mIconTint;
    private boolean mIsEnlargeItemView;

    @Nullable
    private MenuItemImpl mItemData;
    private int mLayoutId;
    private RelativeLayout mRootLayout;

    @Nullable
    private ColorStateList mTextColor;

    @Nullable
    private Animator mTextEnterAnim;

    @Nullable
    private Animator mTextExitAnim;
    private int mTextSize;
    private NearHintRedDot mTipView;

    @Nullable
    private ScaleAnimation mTipsHideAnim;

    @NotNull
    private String number;
    public TextView textView;
    private int textViewVisibility;
    private int type;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int INVALID_ITEM_POSITION = -1;
    private static final int TIPS_CIRCLE = 1;
    private static final int TIPS_OVAL = 2;
    private static final int TIPS_HIDE = 3;
    private static final int TIPS_NUM_NORMAL = 4;

    @NotNull
    private static final int[] CHECKED_STATE_SET = {R.attr.state_checked};
    private static final long TEXT_ANIMATION_DURATION = 300;
    private static final long TIPS_ANIMATION_DURATION = 400;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u0006X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082D¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\u0006X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\bR\u0014\u0010\u000e\u001a\u00020\u0006X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\bR\u0014\u0010\u0010\u001a\u00020\u0006X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\bR\u0014\u0010\u0012\u001a\u00020\u0006X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/heytap/nearx/uikit/widget/navigation/BottomNavigationItemView$Companion;", "", "()V", "CHECKED_STATE_SET", "", "INVALID_ITEM_POSITION", "", "getINVALID_ITEM_POSITION", "()I", "TEXT_ANIMATION_DURATION", "", "TIPS_ANIMATION_DURATION", "TIPS_CIRCLE", "getTIPS_CIRCLE", "TIPS_HIDE", "getTIPS_HIDE", "TIPS_NUM_NORMAL", "getTIPS_NUM_NORMAL", "TIPS_OVAL", "getTIPS_OVAL", "nearx_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getINVALID_ITEM_POSITION() {
            return BottomNavigationItemView.INVALID_ITEM_POSITION;
        }

        public final int getTIPS_CIRCLE() {
            return BottomNavigationItemView.TIPS_CIRCLE;
        }

        public final int getTIPS_HIDE() {
            return BottomNavigationItemView.TIPS_HIDE;
        }

        public final int getTIPS_NUM_NORMAL() {
            return BottomNavigationItemView.TIPS_NUM_NORMAL;
        }

        public final int getTIPS_OVAL() {
            return BottomNavigationItemView.TIPS_OVAL;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BottomNavigationItemView(@NotNull Context context) {
        this(context, null, 0, 0, false, 30, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void checkEnlargeIcon(int size) {
        ImageView imageView = this.mIcon;
        ImageView imageView2 = null;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mIcon");
            imageView = null;
        }
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        }
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
        ImageView imageView3 = this.mIcon;
        if (imageView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mIcon");
            imageView3 = null;
        }
        imageView3.setMaxHeight(whc.c(size));
        ImageView imageView4 = this.mIcon;
        if (imageView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mIcon");
            imageView4 = null;
        }
        imageView4.setMaxWidth(whc.c(size));
        ImageView imageView5 = this.mIcon;
        if (imageView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mIcon");
            imageView5 = null;
        }
        imageView5.setAdjustViewBounds(false);
        ImageView imageView6 = this.mIcon;
        if (imageView6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mIcon");
        } else {
            imageView2 = imageView6;
        }
        imageView2.setBackgroundColor(0);
        layoutParams2.height = whc.c(size);
        layoutParams2.width = whc.c(size);
    }

    private final void createTipsHideAnimator() {
        float f = this.ONE;
        float f2 = this.ZERO;
        float f3 = this.POINT_FIVE;
        ScaleAnimation scaleAnimation = new ScaleAnimation(f, f2, f, f2, 1, f3, 1, f3);
        this.mTipsHideAnim = scaleAnimation;
        Intrinsics.checkNotNull(scaleAnimation);
        scaleAnimation.setDuration(TIPS_ANIMATION_DURATION);
        ScaleAnimation scaleAnimation2 = this.mTipsHideAnim;
        Intrinsics.checkNotNull(scaleAnimation2);
        scaleAnimation2.setInterpolator(new jd1(1.0d, 0.4d, 0.0d, 0.0d, true));
        ScaleAnimation scaleAnimation3 = this.mTipsHideAnim;
        Intrinsics.checkNotNull(scaleAnimation3);
        scaleAnimation3.setAnimationListener(new Animation.AnimationListener() { // from class: com.heytap.nearx.uikit.widget.navigation.BottomNavigationItemView.createTipsHideAnimator.1
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(@NotNull Animation animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                NearHintRedDot nearHintRedDot = BottomNavigationItemView.this.mTipView;
                if (nearHintRedDot == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mTipView");
                    nearHintRedDot = null;
                }
                nearHintRedDot.setVisibility(8);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(@NotNull Animation animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(@NotNull Animation animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
            }
        });
    }

    private final void initView(Context context, AttributeSet attrs, int defStyleAttr, int layoutId, boolean isEnlargeItemView) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, R$styleable.BottomNavigationItemView, defStyleAttr, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "context.obtainStyledAttr…temView, defStyleAttr, 0)");
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.BottomNavigationItemView_nxItemPaddingLeftAndRight, 0);
        this.isNeedTextViewGone = typedArrayObtainStyledAttributes.getBoolean(R$styleable.BottomNavigationItemView_nxItemTextGoneWhenLandscape, false);
        typedArrayObtainStyledAttributes.recycle();
        View viewInflate = LayoutInflater.from(context).inflate(layoutId, (ViewGroup) this, true);
        View viewFindViewById = viewInflate.findViewById(R$id.icon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "view.findViewById(R.id.icon)");
        this.mIcon = (ImageView) viewFindViewById;
        View viewFindViewById2 = viewInflate.findViewById(R$id.normalLable);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "view.findViewById(R.id.normalLable)");
        setTextView((TextView) viewFindViewById2);
        View viewFindViewById3 = viewInflate.findViewById(R$id.tips);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "view.findViewById(R.id.tips)");
        this.mTipView = (NearHintRedDot) viewFindViewById3;
        View viewFindViewById4 = viewInflate.findViewById(R$id.rl_content);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "view.findViewById(R.id.rl_content)");
        this.mRootLayout = (RelativeLayout) viewFindViewById4;
        this.flRoot = (FrameLayout) viewInflate.findViewById(R$id.fl_root);
        ViewGroup.LayoutParams layoutParams = getTextView().getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        }
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
        if (this.mIsEnlargeItemView) {
            checkEnlargeIcon(Intrinsics.areEqual("sw480", getTextView().getTag()) ? 40 : 65);
        } else if (Intrinsics.areEqual(ParserTag.CHILD_LAYOUT, getTextView().getTag())) {
            layoutParams2.setMargins(0, 0, 0, whc.b(context, 10));
        }
        RelativeLayout relativeLayout = this.mRootLayout;
        RelativeLayout relativeLayout2 = null;
        if (relativeLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootLayout");
            relativeLayout = null;
        }
        relativeLayout.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
        RelativeLayout relativeLayout3 = this.mRootLayout;
        if (relativeLayout3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootLayout");
            relativeLayout3 = null;
        }
        relativeLayout3.setClipChildren(false);
        RelativeLayout relativeLayout4 = this.mRootLayout;
        if (relativeLayout4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootLayout");
        } else {
            relativeLayout2 = relativeLayout4;
        }
        relativeLayout2.setClipToPadding(false);
        if (getResources().getConfiguration().orientation == 2) {
            getTextView().setVisibility(this.isNeedTextViewGone ? 0 : 8);
        }
    }

    private final void initializeAnim() {
        Keyframe keyframeOfFloat = Keyframe.ofFloat(this.ZERO, this.POINT_THREE);
        float f = this.POINT_FIVE;
        Keyframe keyframeOfFloat2 = Keyframe.ofFloat(f, f);
        float f2 = this.ONE;
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(getTextView(), PropertyValuesHolder.ofKeyframe(View.ALPHA, keyframeOfFloat, keyframeOfFloat2, Keyframe.ofFloat(f2, f2)));
        this.mTextEnterAnim = objectAnimatorOfPropertyValuesHolder;
        Intrinsics.checkNotNull(objectAnimatorOfPropertyValuesHolder);
        objectAnimatorOfPropertyValuesHolder.setInterpolator(new AccelerateInterpolator());
        Animator animator = this.mTextEnterAnim;
        Intrinsics.checkNotNull(animator);
        long j2 = TEXT_ANIMATION_DURATION;
        animator.setDuration(j2);
        ObjectAnimator objectAnimatorOfPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(getTextView(), PropertyValuesHolder.ofKeyframe(View.ALPHA, Keyframe.ofFloat(this.ZERO, this.ONE), keyframeOfFloat2, Keyframe.ofFloat(this.ONE, this.POINT_THREE)));
        this.mTextExitAnim = objectAnimatorOfPropertyValuesHolder2;
        Intrinsics.checkNotNull(objectAnimatorOfPropertyValuesHolder2);
        objectAnimatorOfPropertyValuesHolder2.setInterpolator(new AccelerateInterpolator());
        Animator animator2 = this.mTextExitAnim;
        Intrinsics.checkNotNull(animator2);
        animator2.setDuration(j2);
        Animator animator3 = this.mTextExitAnim;
        Intrinsics.checkNotNull(animator3);
        animator3.addListener(new Animator.AnimatorListener() { // from class: com.heytap.nearx.uikit.widget.navigation.BottomNavigationItemView.initializeAnim.1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(@NotNull Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@NotNull Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                BottomNavigationItemView.this.getTextView().setAlpha(1.0f);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(@NotNull Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(@NotNull Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
            }
        });
    }

    private final boolean isRtlMode(Context context) {
        return context != null && context.getResources().getConfiguration().getLayoutDirection() == 1;
    }

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    @Nullable
    public View _$_findCachedViewById(int i) {
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(i);
        if (viewFindViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), viewFindViewById);
        return viewFindViewById;
    }

    public final void clearColorFilter() {
        ImageView imageView = this.mIcon;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mIcon");
            imageView = null;
        }
        imageView.clearColorFilter();
    }

    public final void clearTips() {
        NearHintRedDot nearHintRedDot = this.mTipView;
        if (nearHintRedDot == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTipView");
            nearHintRedDot = null;
        }
        nearHintRedDot.setVisibility(4);
        this.number = "";
        this.type = 0;
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    @Nullable
    /* JADX INFO: renamed from: getItemData, reason: from getter */
    public MenuItemImpl getMItemData() {
        return this.mItemData;
    }

    public final int getItemPosition() {
        return this.itemPosition;
    }

    @Nullable
    public final AttributeSet getMAttrs() {
        return this.mAttrs;
    }

    public final boolean getMIsEnlargeItemView() {
        return this.mIsEnlargeItemView;
    }

    @NotNull
    public final TextView getTextView() {
        TextView textView = this.textView;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("textView");
        return null;
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void initialize(@NotNull MenuItemImpl itemData, int menuType) {
        Intrinsics.checkNotNullParameter(itemData, "itemData");
        this.mItemData = itemData;
        ImageView imageView = this.mIcon;
        RelativeLayout relativeLayout = null;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mIcon");
            imageView = null;
        }
        imageView.setSelected(itemData.isChecked());
        getTextView().setSelected(itemData.isChecked());
        setEnabled(itemData.isEnabled());
        if (this.mIsEnlargeItemView && itemData.isChecked()) {
            getTextView().setVisibility(8);
            checkEnlargeIcon(64);
            FrameLayout frameLayout = this.flRoot;
            ViewGroup.LayoutParams layoutParams = frameLayout == null ? null : frameLayout.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
            ((FrameLayout.LayoutParams) layoutParams).setMargins(0, 0, 0, 0);
            RelativeLayout relativeLayout2 = this.mRootLayout;
            if (relativeLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mRootLayout");
            } else {
                relativeLayout = relativeLayout2;
            }
            ViewGroup.LayoutParams layoutParams2 = relativeLayout.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
            ((FrameLayout.LayoutParams) layoutParams2).height = whc.c(70);
            getTextView().setVisibility(4);
            getTextView().setVisibility(8);
        } else {
            if (this.mIsEnlargeItemView) {
                FrameLayout frameLayout2 = this.flRoot;
                ViewGroup.LayoutParams layoutParams3 = frameLayout2 == null ? null : frameLayout2.getLayoutParams();
                if (layoutParams3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                }
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "context");
                ((FrameLayout.LayoutParams) layoutParams3).setMargins(0, whc.b(context, 15), 0, 0);
                checkEnlargeIcon(40);
                RelativeLayout relativeLayout3 = this.mRootLayout;
                if (relativeLayout3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mRootLayout");
                } else {
                    relativeLayout = relativeLayout3;
                }
                ViewGroup.LayoutParams layoutParams4 = relativeLayout.getLayoutParams();
                if (layoutParams4 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                }
                ((FrameLayout.LayoutParams) layoutParams4).height = whc.c(56);
            }
            setTitle(itemData.getTitle());
        }
        setIcon(itemData.getIcon());
        setId(itemData.getItemId());
        String str = this.number;
        if (str != null) {
            setTipsView(str, this.type);
        }
        setContentDescription(itemData.getContentDescription());
        TooltipCompat.setTooltipText(this, itemData.getTooltipText());
    }

    @Override // android.view.View
    public void onConfigurationChanged(@Nullable Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        removeAllViews();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        initView(context, this.mAttrs, R$attr.NavigationItemViewStyle, this.mLayoutId, this.mIsEnlargeItemView);
        MenuItemImpl menuItemImpl = this.mItemData;
        Intrinsics.checkNotNull(menuItemImpl);
        initialize(menuItemImpl, 0);
        getTextView().setTextColor(this.mTextColor);
        getTextView().setTextSize(0, this.mTextSize);
    }

    @Override // android.view.ViewGroup, android.view.View
    @NotNull
    public int[] onCreateDrawableState(int extraSpace) {
        int[] drawableState = super.onCreateDrawableState(extraSpace + 1);
        MenuItemImpl menuItemImpl = this.mItemData;
        if (menuItemImpl != null) {
            Intrinsics.checkNotNull(menuItemImpl);
            if (menuItemImpl.isCheckable()) {
                MenuItemImpl menuItemImpl2 = this.mItemData;
                Intrinsics.checkNotNull(menuItemImpl2);
                if (menuItemImpl2.isChecked()) {
                    View.mergeDrawableStates(drawableState, CHECKED_STATE_SET);
                }
            }
        }
        Intrinsics.checkNotNullExpressionValue(drawableState, "drawableState");
        return drawableState;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        int width;
        super.onLayout(changed, left, top, right, bottom);
        NearHintRedDot nearHintRedDot = null;
        if (isRtlMode(getContext())) {
            ImageView imageView = this.mIcon;
            if (imageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mIcon");
                imageView = null;
            }
            int left2 = imageView.getLeft();
            NearHintRedDot nearHintRedDot2 = this.mTipView;
            if (nearHintRedDot2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTipView");
                nearHintRedDot2 = null;
            }
            width = left2 - (nearHintRedDot2.getWidth() / 2);
        } else {
            ImageView imageView2 = this.mIcon;
            if (imageView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mIcon");
                imageView2 = null;
            }
            int left3 = imageView2.getLeft();
            NearHintRedDot nearHintRedDot3 = this.mTipView;
            if (nearHintRedDot3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTipView");
                nearHintRedDot3 = null;
            }
            int width2 = left3 - (nearHintRedDot3.getWidth() / 2);
            ImageView imageView3 = this.mIcon;
            if (imageView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mIcon");
                imageView3 = null;
            }
            width = width2 + imageView3.getWidth();
        }
        ImageView imageView4 = this.mIcon;
        if (imageView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mIcon");
            imageView4 = null;
        }
        int top2 = imageView4.getTop();
        NearHintRedDot nearHintRedDot4 = this.mTipView;
        if (nearHintRedDot4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTipView");
            nearHintRedDot4 = null;
        }
        int height = top2 - (nearHintRedDot4.getHeight() / 2);
        NearHintRedDot nearHintRedDot5 = this.mTipView;
        if (nearHintRedDot5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTipView");
            nearHintRedDot5 = null;
        }
        NearHintRedDot nearHintRedDot6 = this.mTipView;
        if (nearHintRedDot6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTipView");
            nearHintRedDot6 = null;
        }
        int width3 = nearHintRedDot6.getWidth() + width;
        NearHintRedDot nearHintRedDot7 = this.mTipView;
        if (nearHintRedDot7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTipView");
        } else {
            nearHintRedDot = nearHintRedDot7;
        }
        nearHintRedDot5.layout(width, height, width3, nearHintRedDot.getHeight() + height);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (!this.mIsEnlargeItemView || (Intrinsics.areEqual("sw480", getTextView().getTag()) && Intrinsics.areEqual("land", getTextView().getTag()))) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            return;
        }
        if (this.mIsEnlargeItemView) {
            MenuItemImpl mItemData = getMItemData();
            Intrinsics.checkNotNull(mItemData);
            if (mItemData.isChecked()) {
                super.onMeasure(widthMeasureSpec, heightMeasureSpec);
                return;
            }
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        super.onMeasure(widthMeasureSpec, heightMeasureSpec + whc.b(context, 10));
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public boolean prefersCondensedTitle() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setCheckable(boolean checkable) {
        refreshDrawableState();
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setChecked(boolean checked) {
        refreshDrawableState();
        ImageView imageView = this.mIcon;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mIcon");
            imageView = null;
        }
        imageView.setSelected(checked);
        getTextView().setSelected(checked);
    }

    @Override // android.view.View, androidx.appcompat.view.menu.MenuView.ItemView
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        ImageView imageView = this.mIcon;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mIcon");
            imageView = null;
        }
        imageView.setEnabled(enabled);
        getTextView().setEnabled(enabled);
        if (enabled) {
            ViewCompat.setPointerIcon(this, PointerIconCompat.getSystemIcon(getContext(), 1002));
        } else {
            ViewCompat.setPointerIcon(this, null);
        }
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setIcon(@Nullable Drawable icon) {
        ImageView imageView = null;
        if (icon != null) {
            ImageView imageView2 = this.mIcon;
            if (imageView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mIcon");
                imageView2 = null;
            }
            imageView2.setVisibility(0);
            if ((icon instanceof AnimatedStateListDrawable) || (icon instanceof AnimatedStateListDrawableCompat)) {
                int[] iArr = new int[1];
                MenuItemImpl menuItemImpl = this.mItemData;
                Intrinsics.checkNotNull(menuItemImpl);
                iArr[0] = (menuItemImpl.isChecked() ? 1 : -1) * R.attr.state_checked;
                ImageView imageView3 = this.mIcon;
                if (imageView3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mIcon");
                    imageView3 = null;
                }
                imageView3.setImageState(iArr, true);
            }
        } else {
            ImageView imageView4 = this.mIcon;
            if (imageView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mIcon");
                imageView4 = null;
            }
            imageView4.setVisibility(8);
            getTextView().setMaxLines(2);
        }
        ImageView imageView5 = this.mIcon;
        if (imageView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mIcon");
        } else {
            imageView = imageView5;
        }
        imageView.setImageDrawable(icon);
    }

    public final void setIconTintForWhite() {
        if (this.mIsEnlargeItemView) {
            return;
        }
        ImageView imageView = this.mIcon;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mIcon");
            imageView = null;
        }
        imageView.setColorFilter(-1);
    }

    public final void setIconTintList(@Nullable ColorStateList tint) {
        this.mIconTint = tint;
        MenuItemImpl menuItemImpl = this.mItemData;
        if (menuItemImpl != null) {
            Intrinsics.checkNotNull(menuItemImpl);
            setIcon(menuItemImpl.getIcon());
        }
    }

    public final void setItemBackground(int background) {
        Drawable drawableA;
        if (background == 0) {
            drawableA = null;
        } else {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "context");
            drawableA = xhc.a(context, background);
        }
        ViewCompat.setBackground(this, drawableA);
    }

    public final void setItemPosition(int i) {
        this.itemPosition = i;
    }

    public final void setMAttrs(@Nullable AttributeSet attributeSet) {
        this.mAttrs = attributeSet;
    }

    public final void setMIsEnlargeItemView(boolean z) {
        this.mIsEnlargeItemView = z;
    }

    public final void setMaxTextWidth(int maxWidth) {
        if (maxWidth <= 0) {
            return;
        }
        getTextView().setMaxWidth(maxWidth);
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setShortcut(boolean showShortcut, char shortcutKey) {
    }

    public final void setTextColor(@Nullable ColorStateList color) {
        if (color == null || getTextView() == null) {
            return;
        }
        this.mTextColor = color;
        getTextView().setTextColor(color);
    }

    public final void setTextSize(int size) {
        this.mTextSize = size;
        TextView textView = getTextView();
        if (textView == null) {
            return;
        }
        textView.setTextSize(0, size);
    }

    public final void setTextView(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.textView = textView;
    }

    public final void setTipsView(int number, int type) {
        setTipsView(String.valueOf(number), type);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0037  */
    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setTitle(@Nullable CharSequence title) {
        if (this.isNeedTextViewGone && getResources().getConfiguration().orientation == 2) {
            return;
        }
        if (title == null) {
            getTextView().setVisibility(8);
        } else {
            if (title.toString().length() == 0) {
                getTextView().setVisibility(8);
            } else {
                getTextView().setVisibility(this.textViewVisibility);
                getTextView().setText(title);
            }
        }
        if (this.mIsEnlargeItemView) {
            if (Intrinsics.areEqual("land", getTextView().getTag()) || Intrinsics.areEqual("sw480", getTextView().getTag())) {
                getTextView().setVisibility(8);
            }
        }
    }

    public final void setTitleVisibility(int visibility) {
        this.textViewVisibility = visibility;
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public boolean showsIcon() {
        return true;
    }

    public final void startTextEnterAnimation() {
        if (this.mTextEnterAnim == null) {
            initializeAnim();
        }
        Animator animator = this.mTextEnterAnim;
        Intrinsics.checkNotNull(animator);
        animator.start();
    }

    public final void startTextExitAnimation() {
        if (this.mTextExitAnim == null) {
            initializeAnim();
        }
        Animator animator = this.mTextExitAnim;
        Intrinsics.checkNotNull(animator);
        animator.start();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BottomNavigationItemView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, false, 28, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void setTipsView(@NotNull String number, int type) {
        Intrinsics.checkNotNullParameter(number, "number");
        if (type < 0) {
            return;
        }
        this.number = number;
        this.type = type;
        NearHintRedDot nearHintRedDot = null;
        if (type == TIPS_HIDE) {
            NearHintRedDot nearHintRedDot2 = this.mTipView;
            if (nearHintRedDot2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTipView");
                nearHintRedDot2 = null;
            }
            if (nearHintRedDot2.getVisibility() == 8) {
                return;
            }
            if (this.mTipsHideAnim == null) {
                createTipsHideAnimator();
            }
            NearHintRedDot nearHintRedDot3 = this.mTipView;
            if (nearHintRedDot3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTipView");
            } else {
                nearHintRedDot = nearHintRedDot3;
            }
            nearHintRedDot.startAnimation(this.mTipsHideAnim);
            return;
        }
        if (type == TIPS_CIRCLE) {
            NearHintRedDot nearHintRedDot4 = this.mTipView;
            if (nearHintRedDot4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTipView");
                nearHintRedDot4 = null;
            }
            nearHintRedDot4.setPointMode(1);
            NearHintRedDot nearHintRedDot5 = this.mTipView;
            if (nearHintRedDot5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTipView");
            } else {
                nearHintRedDot = nearHintRedDot5;
            }
            nearHintRedDot.setVisibility(0);
            return;
        }
        if (type == TIPS_OVAL) {
            NearHintRedDot nearHintRedDot6 = this.mTipView;
            if (nearHintRedDot6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTipView");
                nearHintRedDot6 = null;
            }
            nearHintRedDot6.setPointText(number);
            NearHintRedDot nearHintRedDot7 = this.mTipView;
            if (nearHintRedDot7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTipView");
                nearHintRedDot7 = null;
            }
            nearHintRedDot7.setPointMode(3);
            NearHintRedDot nearHintRedDot8 = this.mTipView;
            if (nearHintRedDot8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTipView");
            } else {
                nearHintRedDot = nearHintRedDot8;
            }
            nearHintRedDot.setVisibility(0);
            return;
        }
        if (type == TIPS_NUM_NORMAL) {
            NearHintRedDot nearHintRedDot9 = this.mTipView;
            if (nearHintRedDot9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTipView");
                nearHintRedDot9 = null;
            }
            nearHintRedDot9.setPointText(number);
            NearHintRedDot nearHintRedDot10 = this.mTipView;
            if (nearHintRedDot10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTipView");
                nearHintRedDot10 = null;
            }
            nearHintRedDot10.setPointMode(2);
            NearHintRedDot nearHintRedDot11 = this.mTipView;
            if (nearHintRedDot11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTipView");
            } else {
                nearHintRedDot = nearHintRedDot11;
            }
            nearHintRedDot.setVisibility(0);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BottomNavigationItemView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, false, 24, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BottomNavigationItemView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        this(context, attributeSet, i, i2, false, 16, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void setTextColor(@Nullable Integer color) {
        if (color == null || getTextView() == null || this.mIsEnlargeItemView) {
            return;
        }
        getTextView().setTextColor(color.intValue());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BottomNavigationItemView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i, int i2, boolean z) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.ONE = 1.0f;
        this.POINT_THREE = 0.3f;
        this.POINT_FIVE = 0.5f;
        this.itemPosition = INVALID_ITEM_POSITION;
        this.number = "";
        this.mAttrs = attributeSet;
        this.mIsEnlargeItemView = z;
        this.mLayoutId = i2;
        initView(context, attributeSet, i, i2, z);
        this._$_findViewCache = new LinkedHashMap();
    }

    public /* synthetic */ BottomNavigationItemView(Context context, AttributeSet attributeSet, int i, int i2, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? R$attr.NavigationItemViewStyle : i, (i3 & 8) != 0 ? R$layout.nx_enlarge_navigation_item_layout_new : i2, (i3 & 16) != 0 ? false : z);
    }

    public final void setTipsView(int number, int type, int marginStart, int marginTop, int textSize, int radius) {
        setTipsView(String.valueOf(number), type, marginStart, marginTop, textSize, radius);
    }

    public final void setTipsView(@NotNull String number, int type, int marginStart, int marginTop, int textSize, int radius) {
        Intrinsics.checkNotNullParameter(number, "number");
        setTipsView(number, type);
        NearHintRedDot nearHintRedDot = this.mTipView;
        NearHintRedDot nearHintRedDot2 = null;
        if (nearHintRedDot == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTipView");
            nearHintRedDot = null;
        }
        ViewGroup.LayoutParams layoutParams = nearHintRedDot.getLayoutParams();
        if (layoutParams != null) {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            layoutParams2.topMargin = marginTop;
            layoutParams2.setMarginStart(marginStart);
            NearHintRedDot nearHintRedDot3 = this.mTipView;
            if (nearHintRedDot3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTipView");
                nearHintRedDot3 = null;
            }
            nearHintRedDot3.setLayoutParams(layoutParams2);
            NearHintRedDot nearHintRedDot4 = this.mTipView;
            if (nearHintRedDot4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTipView");
            } else {
                nearHintRedDot2 = nearHintRedDot4;
            }
            nearHintRedDot2.measuredDimension(textSize, radius);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
    }

    public final void setTipsView(int number, int type, int width, int height, int marginStart, int marginTop, int textSize, int radius) {
        setTipsView(String.valueOf(number), type, width, height, marginStart, marginTop, textSize, radius);
    }

    public final void setTipsView(@NotNull String number, int type, int width, int height, int marginStart, int marginTop, int textSize, int radius) {
        Intrinsics.checkNotNullParameter(number, "number");
        setTipsView(number, type);
        NearHintRedDot nearHintRedDot = this.mTipView;
        NearHintRedDot nearHintRedDot2 = null;
        if (nearHintRedDot == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTipView");
            nearHintRedDot = null;
        }
        ViewGroup.LayoutParams layoutParams = nearHintRedDot.getLayoutParams();
        if (layoutParams != null) {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            layoutParams2.topMargin = marginTop;
            layoutParams2.setMarginStart(marginStart);
            NearHintRedDot nearHintRedDot3 = this.mTipView;
            if (nearHintRedDot3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTipView");
                nearHintRedDot3 = null;
            }
            nearHintRedDot3.setLayoutParams(layoutParams2);
            NearHintRedDot nearHintRedDot4 = this.mTipView;
            if (nearHintRedDot4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTipView");
            } else {
                nearHintRedDot2 = nearHintRedDot4;
            }
            nearHintRedDot2.measuredDimension(width, height, textSize, radius);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
    }
}
