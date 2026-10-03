package com.heytap.nearx.uikit.internal.widget.navigation;

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
import androidx.exifinterface.media.ExifInterface;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.nearx.tangramconfig.strategy.Fields;
import com.heytap.nearx.uikit.R$attr;
import com.heytap.nearx.uikit.R$id;
import com.heytap.nearx.uikit.R$layout;
import com.heytap.nearx.uikit.R$styleable;
import com.heytap.nearx.uikit.widget.NearHintRedDot;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.c8l;
import com.oplus.aiunit.vision.jd1;
import com.oplus.aiunit.vision.whc;
import com.oplus.aiunit.vision.xhc;
import com.oplus.aiunit.vision.y04;
import com.oplus.smartenginehelper.ParserTag;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import com.oplus.smartenginehelper.entity.ViewEntity;
import io.protostuff.MapSchema;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\r\n\u0002\b\u000b\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b!\u0018\u0000 ¢\u00012\u00020\u00012\u00020\u0002:\u0002£\u0001B=\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0006\b \u0001\u0010¡\u0001J2\u0010\r\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0002J\b\u0010\u000e\u001a\u00020\fH\u0002J\b\u0010\u000f\u001a\u00020\fH\u0002J\u0012\u0010\u0010\u001a\u00020\n2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002J\u0012\u0010\u0013\u001a\u00020\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0014J\u0018\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0007H\u0016J\u0018\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0007H\u0014J0\u0010 \u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u0007H\u0014J\n\u0010!\u001a\u0004\u0018\u00010\u0014H\u0016J\u0012\u0010$\u001a\u00020\f2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016J\u000e\u0010&\u001a\u00020\f2\u0006\u0010%\u001a\u00020\u0007J\u0010\u0010(\u001a\u00020\f2\u0006\u0010'\u001a\u00020\nH\u0016J\u0010\u0010*\u001a\u00020\f2\u0006\u0010)\u001a\u00020\nH\u0016J\u0010\u0010,\u001a\u00020\f2\u0006\u0010+\u001a\u00020\nH\u0016J\u0010\u0010/\u001a\u00020.2\u0006\u0010-\u001a\u00020\u0007H\u0016J\u0018\u00103\u001a\u00020\f2\u0006\u00100\u001a\u00020\n2\u0006\u00102\u001a\u000201H\u0016J\u0012\u00106\u001a\u00020\f2\b\u00105\u001a\u0004\u0018\u000104H\u0016J\b\u00107\u001a\u00020\nH\u0016J\b\u00108\u001a\u00020\nH\u0016J\u0010\u0010;\u001a\u00020\f2\b\u0010:\u001a\u0004\u0018\u000109J\u0010\u0010=\u001a\u00020\f2\b\u0010<\u001a\u0004\u0018\u000109J\u000e\u0010?\u001a\u00020\f2\u0006\u0010>\u001a\u00020\u0007J\u000e\u0010A\u001a\u00020\f2\u0006\u0010@\u001a\u00020\u0007J\u000e\u0010C\u001a\u00020\f2\u0006\u0010B\u001a\u00020\u0007J\u0006\u0010D\u001a\u00020\fJ\u0016\u0010H\u001a\u00020\f2\u0006\u0010F\u001a\u00020E2\u0006\u0010G\u001a\u00020\u0007J6\u0010M\u001a\u00020\f2\u0006\u0010F\u001a\u00020E2\u0006\u0010G\u001a\u00020\u00072\u0006\u0010I\u001a\u00020\u00072\u0006\u0010J\u001a\u00020\u00072\u0006\u0010K\u001a\u00020\u00072\u0006\u0010L\u001a\u00020\u0007JF\u0010P\u001a\u00020\f2\u0006\u0010F\u001a\u00020E2\u0006\u0010G\u001a\u00020\u00072\u0006\u0010N\u001a\u00020\u00072\u0006\u0010O\u001a\u00020\u00072\u0006\u0010I\u001a\u00020\u00072\u0006\u0010J\u001a\u00020\u00072\u0006\u0010K\u001a\u00020\u00072\u0006\u0010L\u001a\u00020\u0007J\u0006\u0010Q\u001a\u00020\fJ\u0006\u0010R\u001a\u00020\fR\u0014\u0010U\u001a\u00020S8\u0002X\u0082D¢\u0006\u0006\n\u0004\bP\u0010TR\u0014\u0010V\u001a\u00020S8\u0002X\u0082D¢\u0006\u0006\n\u0004\bQ\u0010TR\u0014\u0010W\u001a\u00020S8\u0002X\u0082D¢\u0006\u0006\n\u0004\bR\u0010TR\u0014\u0010Y\u001a\u00020S8\u0002X\u0082D¢\u0006\u0006\n\u0004\bX\u0010TR\"\u0010a\u001a\u00020Z8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R\"\u0010h\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bb\u0010c\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR\u0016\u0010l\u001a\u00020i8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bj\u0010kR\u0018\u0010o\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010nR\u0018\u0010r\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bp\u0010qR\u0018\u0010t\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bs\u0010qR\u0016\u0010x\u001a\u00020u8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bv\u0010wR\u0018\u0010|\u001a\u0004\u0018\u00010y8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bz\u0010{R\u0018\u0010~\u001a\u0004\u0018\u00010y8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b}\u0010{R\u001b\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u007f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R\u001a\u0010\u0086\u0001\u001a\u00030\u0083\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R\u0019\u0010\u0089\u0001\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0018\u0010F\u001a\u00020E8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u008b\u0001R\u0017\u0010G\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008c\u0001\u0010cR\u0018\u0010\u008e\u0001\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008d\u0001\u0010cR+\u0010\u0095\u0001\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u008f\u0001\u0010\u0090\u0001\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001\"\u0006\b\u0093\u0001\u0010\u0094\u0001R)\u0010\u009b\u0001\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0096\u0001\u0010\u0088\u0001\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001\"\u0006\b\u0099\u0001\u0010\u009a\u0001R\u0018\u0010\u009d\u0001\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u009c\u0001\u0010cR\u0018\u0010\u009f\u0001\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u009e\u0001\u0010c¨\u0006¤\u0001"}, d2 = {"Lcom/heytap/nearx/uikit/internal/widget/navigation/BottomNavigationItemView;", "Landroid/widget/FrameLayout;", "Landroidx/appcompat/view/menu/MenuView$ItemView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "layoutId", "", "isEnlargeItemView", "", "d", MapSchema.FIELD_NAME_ENTRY, "c", "f", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "Landroidx/appcompat/view/menu/MenuItemImpl;", "itemData", "menuType", "initialize", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "changed", y04.TIME_STYLE_LEFT_DIR_NAME, "top", y04.TIME_STYLE_RIGHT_DIR_NAME, "bottom", "onLayout", "getItemData", "", "title", "setTitle", "visibility", "setTitleVisibily", "checkable", "setCheckable", "checked", "setChecked", ViewEntity.ENABLED, ClickApiEntity.SET_ENABLED, "extraSpace", "", "onCreateDrawableState", "showShortcut", "", "shortcutKey", "setShortcut", "Landroid/graphics/drawable/Drawable;", "icon", "setIcon", "prefersCondensedTitle", "showsIcon", "Landroid/content/res/ColorStateList;", "tint", "setIconTintList", "color", ClickApiEntity.SET_TEXT_COLOR, "size", ClickApiEntity.SET_TEXT_SIZE, "background", "setItemBackground", ParserTag.TAG_MAX_WIDTH, "setMaxTextWidth", "b", "", "number", "type", b2n.f, "marginStart", "marginTop", ParserTag.TAG_TEXT_SIZE, "radius", b2n.g, Fields.WIDTH_FIELD, Fields.HEIGHT_FIELD, "i", "j", MapSchema.FIELD_NAME_KEY, "", UserInfo.SEX_FEMALE, "ZERO", "ONE", "POINT_THREE", LogFieldKey.LEVEL_KEY, "POINT_FIVE", "Landroid/widget/TextView;", LogFieldKey.MESSAGE_KEY, "Landroid/widget/TextView;", "getTextView", "()Landroid/widget/TextView;", "setTextView", "(Landroid/widget/TextView;)V", "textView", "n", "I", "getItemPosition", "()I", "setItemPosition", "(I)V", "itemPosition", "Landroid/widget/ImageView;", "o", "Landroid/widget/ImageView;", "mIcon", LogFieldKey.PROCESS_NAME_KEY, "Landroidx/appcompat/view/menu/MenuItemImpl;", "mItemData", "q", "Landroid/content/res/ColorStateList;", "mIconTint", "r", "mTextColor", "Lcom/heytap/nearx/uikit/widget/NearHintRedDot;", "s", "Lcom/heytap/nearx/uikit/widget/NearHintRedDot;", "mTipView", "Landroid/animation/Animator;", "t", "Landroid/animation/Animator;", "mTextEnterAnim", "u", "mTextExitAnim", "Landroid/view/animation/ScaleAnimation;", "v", "Landroid/view/animation/ScaleAnimation;", "mTipsHideAnim", "Landroid/widget/RelativeLayout;", "w", "Landroid/widget/RelativeLayout;", "mRootLayout", "x", "Z", "isNeedTextViewGone", "y", "Ljava/lang/String;", "z", "A", "textViewVisibility", c8l.KEY_B, "Landroid/util/AttributeSet;", "getMAttrs", "()Landroid/util/AttributeSet;", "setMAttrs", "(Landroid/util/AttributeSet;)V", "mAttrs", "C", "getMIsEnlargeItemView", "()Z", "setMIsEnlargeItemView", "(Z)V", "mIsEnlargeItemView", "D", "mTextSize", ExifInterface.LONGITUDE_EAST, "mLayoutId", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;IIZ)V", "Companion", "a", "nearx_release"}, k = 1, mv = {1, 6, 0})
public final class BottomNavigationItemView extends FrameLayout implements MenuView.ItemView {
    public static final int G = -1;
    public static final int H = 1;
    public static final int I = 2;
    public static final int J = 3;
    public static final int K = 4;

    @NotNull
    public static final int[] L = {R.attr.state_checked};
    public static final long M = 300;
    public static final long N = 400;

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    public int textViewVisibility;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @Nullable
    public AttributeSet mAttrs;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public boolean mIsEnlargeItemView;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public int mTextSize;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public int mLayoutId;

    @NotNull
    public Map<Integer, View> F;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public final float ZERO;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public final float ONE;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public final float POINT_THREE;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public final float POINT_FIVE;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public TextView textView;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public int itemPosition;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public ImageView mIcon;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @Nullable
    public MenuItemImpl mItemData;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @Nullable
    public ColorStateList mIconTint;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @Nullable
    public ColorStateList mTextColor;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    public NearHintRedDot mTipView;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @Nullable
    public Animator mTextEnterAnim;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @Nullable
    public Animator mTextExitAnim;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @Nullable
    public ScaleAnimation mTipsHideAnim;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    public RelativeLayout mRootLayout;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    public boolean isNeedTextViewGone;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @NotNull
    public String number;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    public int type;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"com/heytap/nearx/uikit/internal/widget/navigation/BottomNavigationItemView$b", "Landroid/view/animation/Animation$AnimationListener;", "Landroid/view/animation/Animation;", "animation", "", ParserTag.TAG_ON_ANIMATION_START, ParserTag.TAG_ON_ANIMATION_END, ParserTag.TAG_ON_ANIMATION_REPEAT, "nearx_release"}, k = 1, mv = {1, 6, 0})
    public static final class b implements Animation.AnimationListener {
        public b() {
        }

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
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/heytap/nearx/uikit/internal/widget/navigation/BottomNavigationItemView$c", "Landroid/animation/Animator$AnimatorListener;", "Landroid/animation/Animator;", "animation", "", ParserTag.TAG_ON_ANIMATION_START, ParserTag.TAG_ON_ANIMATION_END, ParserTag.TAG_ON_ANIMATION_CANCEL, ParserTag.TAG_ON_ANIMATION_REPEAT, "nearx_release"}, k = 1, mv = {1, 6, 0})
    public static final class c implements Animator.AnimatorListener {
        public c() {
        }

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
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BottomNavigationItemView(@NotNull Context context) {
        this(context, null, 0, 0, false, 30, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void b() {
        NearHintRedDot nearHintRedDot = this.mTipView;
        if (nearHintRedDot == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTipView");
            nearHintRedDot = null;
        }
        nearHintRedDot.setVisibility(4);
        this.number = "";
        this.type = 0;
    }

    public final void c() {
        float f = this.ONE;
        float f2 = this.ZERO;
        float f3 = this.POINT_FIVE;
        ScaleAnimation scaleAnimation = new ScaleAnimation(f, f2, f, f2, 1, f3, 1, f3);
        this.mTipsHideAnim = scaleAnimation;
        Intrinsics.checkNotNull(scaleAnimation);
        scaleAnimation.setDuration(N);
        ScaleAnimation scaleAnimation2 = this.mTipsHideAnim;
        Intrinsics.checkNotNull(scaleAnimation2);
        scaleAnimation2.setInterpolator(new jd1(1.0d, 0.4d, 0.0d, 0.0d, true));
        ScaleAnimation scaleAnimation3 = this.mTipsHideAnim;
        Intrinsics.checkNotNull(scaleAnimation3);
        scaleAnimation3.setAnimationListener(new b());
    }

    public final void d(Context context, AttributeSet attrs, int defStyleAttr, int layoutId, boolean isEnlargeItemView) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, R$styleable.BottomNavigationItemView, defStyleAttr, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "context.obtainStyledAttr…temView, defStyleAttr, 0)");
        typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.BottomNavigationItemView_nxImageMaxHigh, 0);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.BottomNavigationItemView_nxItemPaddingLeftAndRight, 0);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.BottomNavigationItemView_nxImageTextPadding, 0);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.BottomNavigationItemView_nxImageMarginTop, 0);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.BottomNavigationItemView_nxImageMarginTopWhenLandscape, 0);
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
        ImageView imageView = this.mIcon;
        RelativeLayout relativeLayout = null;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mIcon");
            imageView = null;
        }
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        }
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
        ViewGroup.LayoutParams layoutParams3 = getTextView().getLayoutParams();
        if (layoutParams3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        }
        RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) layoutParams3;
        if (this.mIsEnlargeItemView) {
            ImageView imageView2 = this.mIcon;
            if (imageView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mIcon");
                imageView2 = null;
            }
            imageView2.setMaxHeight(whc.c(45));
            ImageView imageView3 = this.mIcon;
            if (imageView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mIcon");
                imageView3 = null;
            }
            imageView3.setMaxWidth(whc.c(45));
            ImageView imageView4 = this.mIcon;
            if (imageView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mIcon");
                imageView4 = null;
            }
            imageView4.setAdjustViewBounds(false);
            layoutParams2.height = whc.c(45);
            layoutParams2.width = whc.c(45);
        } else if (Intrinsics.areEqual(ParserTag.CHILD_LAYOUT, getTextView().getTag())) {
            layoutParams4.setMargins(0, 0, 0, whc.b(context, 10));
        }
        RelativeLayout relativeLayout2 = this.mRootLayout;
        if (relativeLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootLayout");
            relativeLayout2 = null;
        }
        relativeLayout2.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
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
            relativeLayout = relativeLayout4;
        }
        relativeLayout.setClipToPadding(false);
        if (getResources().getConfiguration().orientation == 2) {
            getTextView().setVisibility(this.isNeedTextViewGone ? 0 : 8);
        }
    }

    public final void e() {
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
        long j2 = M;
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
        animator3.addListener(new c());
    }

    public final boolean f(Context context) {
        return context != null && context.getResources().getConfiguration().getLayoutDirection() == 1;
    }

    public final void g(@NotNull String number, int type) {
        Intrinsics.checkNotNullParameter(number, "number");
        if (type < 0) {
            return;
        }
        this.number = number;
        this.type = type;
        NearHintRedDot nearHintRedDot = null;
        if (type == J) {
            NearHintRedDot nearHintRedDot2 = this.mTipView;
            if (nearHintRedDot2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTipView");
                nearHintRedDot2 = null;
            }
            if (nearHintRedDot2.getVisibility() == 8) {
                return;
            }
            if (this.mTipsHideAnim == null) {
                c();
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
        if (type == H) {
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
        if (type == I) {
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
        if (type == K) {
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

    public final void h(@NotNull String number, int type, int marginStart, int marginTop, int textSize, int radius) {
        Intrinsics.checkNotNullParameter(number, "number");
        g(number, type);
        NearHintRedDot nearHintRedDot = this.mTipView;
        NearHintRedDot nearHintRedDot2 = null;
        if (nearHintRedDot == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTipView");
            nearHintRedDot = null;
        }
        ViewGroup.LayoutParams layoutParams = nearHintRedDot.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        }
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
    }

    public final void i(@NotNull String number, int type, int width, int height, int marginStart, int marginTop, int textSize, int radius) {
        Intrinsics.checkNotNullParameter(number, "number");
        g(number, type);
        NearHintRedDot nearHintRedDot = this.mTipView;
        NearHintRedDot nearHintRedDot2 = null;
        if (nearHintRedDot == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTipView");
            nearHintRedDot = null;
        }
        ViewGroup.LayoutParams layoutParams = nearHintRedDot.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        }
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
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void initialize(@NotNull MenuItemImpl itemData, int menuType) {
        Intrinsics.checkNotNullParameter(itemData, "itemData");
        this.mItemData = itemData;
        ImageView imageView = this.mIcon;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mIcon");
            imageView = null;
        }
        imageView.setSelected(itemData.isChecked());
        getTextView().setSelected(itemData.isChecked());
        setEnabled(itemData.isEnabled());
        setIcon(itemData.getIcon());
        setTitle(itemData.getTitle());
        setId(itemData.getItemId());
        String str = this.number;
        if (str != null) {
            g(str, this.type);
        }
        setContentDescription(itemData.getContentDescription());
        TooltipCompat.setTooltipText(this, itemData.getTooltipText());
    }

    public final void j() {
        if (this.mTextEnterAnim == null) {
            e();
        }
        Animator animator = this.mTextEnterAnim;
        Intrinsics.checkNotNull(animator);
        animator.start();
    }

    public final void k() {
        if (this.mTextExitAnim == null) {
            e();
        }
        Animator animator = this.mTextExitAnim;
        Intrinsics.checkNotNull(animator);
        animator.start();
    }

    @Override // android.view.View
    public void onConfigurationChanged(@Nullable Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        removeAllViews();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        d(context, this.mAttrs, R$attr.NavigationItemViewStyle, this.mLayoutId, this.mIsEnlargeItemView);
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
                    View.mergeDrawableStates(drawableState, L);
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
        if (f(getContext())) {
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
        if (this.mLayoutId == R$layout.nx_enlarge_navigation_item_layout) {
            height += 3;
        }
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
        if (!this.mIsEnlargeItemView || Intrinsics.areEqual("land", getTextView().getTag()) || Intrinsics.areEqual("sw480", getTextView().getTag())) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            return;
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

    public final void setTitleVisibily(int visibility) {
        this.textViewVisibility = visibility;
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public boolean showsIcon() {
        return true;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BottomNavigationItemView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, false, 28, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BottomNavigationItemView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, false, 24, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BottomNavigationItemView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i, int i2, boolean z) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.ONE = 1.0f;
        this.POINT_THREE = 0.3f;
        this.POINT_FIVE = 0.5f;
        this.itemPosition = G;
        this.number = "";
        this.mAttrs = attributeSet;
        this.mIsEnlargeItemView = z;
        this.mLayoutId = i2;
        d(context, attributeSet, i, i2, z);
        this.F = new LinkedHashMap();
    }

    public /* synthetic */ BottomNavigationItemView(Context context, AttributeSet attributeSet, int i, int i2, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? R$attr.NavigationItemViewStyle : i, (i3 & 8) != 0 ? R$layout.nx_color_navigation_item_layout : i2, (i3 & 16) != 0 ? false : z);
    }
}
