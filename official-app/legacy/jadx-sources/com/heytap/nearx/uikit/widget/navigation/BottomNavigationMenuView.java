package com.heytap.nearx.uikit.widget.navigation;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.transition.Fade;
import android.transition.TransitionSet;
import android.util.AttributeSet;
import android.util.Property;
import android.util.SparseArray;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuView;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import com.heytap.nearx.tangramconfig.strategy.Fields;
import com.heytap.nearx.uikit.R$attr;
import com.heytap.nearx.uikit.R$color;
import com.heytap.nearx.uikit.R$dimen;
import com.heytap.nearx.uikit.internal.widget.navigation.BottomNavigationMenu;
import com.heytap.nearx.uikit.widget.navigation.BottomNavigationMenuView;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import com.oplus.aiunit.vision.htj;
import com.oplus.aiunit.vision.y04;
import com.oplus.smartenginehelper.ParserTag;
import com.sensorsdata.analytics.android.autotrack.aop.SensorsDataAutoTrackHelper;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b#\b\u0016\u0018\u0000 ~2\u00020\u00012\u00020\u0002:\u0002~\u007fB\u001b\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B\u001f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\"\u0010G\u001a\u00020H2\b\u0010I\u001a\u0004\u0018\u00010J2\u0006\u0010K\u001a\u00020L2\u0006\u0010M\u001a\u00020\tH\u0002J\u0006\u0010N\u001a\u00020HJ\u0006\u0010O\u001a\u00020HJ\u000e\u0010P\u001a\u00020H2\u0006\u0010Q\u001a\u00020\tJ\u0006\u0010R\u001a\u00020HJ\u0010\u0010S\u001a\u0004\u0018\u00010T2\u0006\u0010U\u001a\u00020JJ\b\u0010V\u001a\u00020\tH\u0016J\b\u0010W\u001a\u00020'H\u0016J\b\u0010X\u001a\u00020'H\u0016J\u0012\u0010Y\u001a\u00020H2\b\u0010Z\u001a\u0004\u0018\u000100H\u0016J\u0012\u0010[\u001a\u00020H2\b\u0010\\\u001a\u0004\u0018\u00010]H\u0014J0\u0010^\u001a\u00020H2\u0006\u0010_\u001a\u00020\u001b2\u0006\u0010`\u001a\u00020\t2\u0006\u0010a\u001a\u00020\t2\u0006\u0010b\u001a\u00020\t2\u0006\u0010c\u001a\u00020\tH\u0014J\u0018\u0010d\u001a\u00020H2\u0006\u0010e\u001a\u00020\t2\u0006\u0010f\u001a\u00020\tH\u0014J\u0016\u0010 \u001a\u00020H2\u0006\u0010\u001d\u001a\u00020\t2\u0006\u0010Q\u001a\u00020\tJ\u0006\u0010g\u001a\u00020HJ\u0010\u0010h\u001a\u00020H2\u0006\u0010i\u001a\u00020\tH\u0016J\u000e\u0010j\u001a\u00020H2\u0006\u0010k\u001a\u00020\tJ\u000e\u0010l\u001a\u00020H2\u0006\u0010m\u001a\u00020\u001bJ\u000e\u0010n\u001a\u00020H2\u0006\u0010o\u001a\u000205J\u0016\u0010p\u001a\u00020H2\u0006\u0010q\u001a\u00020\t2\u0006\u0010r\u001a\u00020\tJ\u001e\u0010p\u001a\u00020H2\u0006\u0010Q\u001a\u00020\t2\u0006\u0010q\u001a\u00020\t2\u0006\u0010r\u001a\u00020\tJ>\u0010p\u001a\u00020H2\u0006\u0010Q\u001a\u00020\t2\u0006\u0010q\u001a\u00020\t2\u0006\u0010r\u001a\u00020\t2\u0006\u0010s\u001a\u00020\t2\u0006\u0010t\u001a\u00020\t2\u0006\u0010u\u001a\u00020\t2\u0006\u0010v\u001a\u00020\tJN\u0010p\u001a\u00020H2\u0006\u0010Q\u001a\u00020\t2\u0006\u0010q\u001a\u00020\t2\u0006\u0010r\u001a\u00020\t2\u0006\u0010w\u001a\u00020\t2\u0006\u0010x\u001a\u00020\t2\u0006\u0010s\u001a\u00020\t2\u0006\u0010t\u001a\u00020\t2\u0006\u0010u\u001a\u00020\t2\u0006\u0010v\u001a\u00020\tJ\u001e\u0010p\u001a\u00020H2\u0006\u0010Q\u001a\u00020\t2\u0006\u0010q\u001a\u00020L2\u0006\u0010r\u001a\u00020\tJ>\u0010p\u001a\u00020H2\u0006\u0010Q\u001a\u00020\t2\u0006\u0010q\u001a\u00020L2\u0006\u0010r\u001a\u00020\t2\u0006\u0010s\u001a\u00020\t2\u0006\u0010t\u001a\u00020\t2\u0006\u0010u\u001a\u00020\t2\u0006\u0010v\u001a\u00020\tJN\u0010p\u001a\u00020H2\u0006\u0010Q\u001a\u00020\t2\u0006\u0010q\u001a\u00020L2\u0006\u0010r\u001a\u00020\t2\u0006\u0010w\u001a\u00020\t2\u0006\u0010x\u001a\u00020\t2\u0006\u0010s\u001a\u00020\t2\u0006\u0010t\u001a\u00020\t2\u0006\u0010u\u001a\u00020\t2\u0006\u0010v\u001a\u00020\tJ\u0016\u0010p\u001a\u00020H2\u0006\u0010q\u001a\u00020L2\u0006\u0010r\u001a\u00020\tJ\u0006\u0010y\u001a\u00020HJ\b\u0010z\u001a\u00020HH\u0002J\u000e\u0010{\u001a\u00020H2\u0006\u0010U\u001a\u00020\tJ\b\u0010|\u001a\u00020HH\u0016J\u0010\u0010}\u001a\u00020H2\b\u0010I\u001a\u0004\u0018\u00010JR\u000e\u0010\u000b\u001a\u00020\fX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082D¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R(\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u001b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001cR$\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\t@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0010\"\u0004\b \u0010\u0012R(\u0010\"\u001a\u0004\u0018\u00010\u00142\b\u0010!\u001a\u0004\u0018\u00010\u0014@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0017\"\u0004\b$\u0010\u0019R\u0018\u0010%\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010&X\u0082\u000e¢\u0006\u0004\n\u0002\u0010(R\u000e\u0010)\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010*\u001a\u0004\u0018\u00010+X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010/\u001a\u0004\u0018\u000100X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u000203X\u0082.¢\u0006\u0002\n\u0000R\u0010\u00104\u001a\u0004\u0018\u000105X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00107\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00108\u001a\u0004\u0018\u000109X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020;X\u0082.¢\u0006\u0002\n\u0000R\u0014\u0010<\u001a\b\u0012\u0004\u0012\u00020>0=X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010?\u001a\u00020'8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b@\u0010AR\u0014\u0010B\u001a\u00020'8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bC\u0010AR\u001e\u0010E\u001a\u00020\t2\u0006\u0010D\u001a\u00020\t@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\bF\u0010\u0010¨\u0006\u0080\u0001"}, d2 = {"Lcom/heytap/nearx/uikit/widget/navigation/BottomNavigationMenuView;", "Landroid/widget/FrameLayout;", "Landroidx/appcompat/view/menu/MenuView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "END_ALPHA", "", "START_ALPHA", "enlargeItemIndex", "getEnlargeItemIndex", "()I", "setEnlargeItemIndex", "(I)V", "tint", "Landroid/content/res/ColorStateList;", "iconTintList", "getIconTintList", "()Landroid/content/res/ColorStateList;", "setIconTintList", "(Landroid/content/res/ColorStateList;)V", "isRtlMode", "", "()Z", "background", "itemBackgroundRes", "getItemBackgroundRes", "setItemBackgroundRes", "color", "itemTextColor", "getItemTextColor", "setItemTextColor", "mButtons", "", "Lcom/heytap/nearx/uikit/widget/navigation/BottomNavigationItemView;", "[Lcom/heytap/nearx/uikit/widget/navigation/BottomNavigationItemView;", "mDefaultPadding", "mEnterAnim", "Landroid/animation/Animator;", "mFirstBuild", "mItemHeight", "mItemTextSize", "mMenu", "Landroidx/appcompat/view/menu/MenuBuilder;", "mNeedTextAnim", "mOnClickListener", "Landroid/view/View$OnClickListener;", "mPresenter", "Lcom/heytap/nearx/uikit/widget/navigation/NavigationPresenter;", "mPreviousSelectedPostion", "mSelectedItemPosition", "mSet", "Landroid/transition/TransitionSet;", "mTempChildWidths", "", "mTipList", "Landroid/util/SparseArray;", "Lcom/heytap/nearx/uikit/widget/navigation/BottomNavigationMenuView$ItemTipBean;", "newEnlargeItem", "getNewEnlargeItem", "()Lcom/heytap/nearx/uikit/widget/navigation/BottomNavigationItemView;", "newItem", "getNewItem", "<set-?>", "selectedItemId", "getSelectedItemId", "addTipBean", "", "item", "Landroid/view/MenuItem;", SpeechConstant.TTS_PLAY_MARK_TIP, "", "tipType", "buildMenuView", "clearColorFilter", "clearTips", "position", "clearTipsAll", "getMenuItemView", "Landroidx/appcompat/view/menu/MenuView$ItemView;", "itemId", "getWindowAnimations", "initEnlargeMenuItem", "initMenuItem", "initialize", "menu", "onConfigurationChanged", "newConfig", "Landroid/content/res/Configuration;", "onLayout", "changed", y04.TIME_STYLE_LEFT_DIR_NAME, "top", y04.TIME_STYLE_RIGHT_DIR_NAME, "bottom", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "setItemForEnlargeColor", "setItemHeight", "defaultHeight", "setItemTextSize", "size", "setNeedTextAnim", "needTextAnim", "setPresenter", "presenter", "setTipsView", "tips", "tipsType", "marginStart", "marginTop", ParserTag.TAG_TEXT_SIZE, "radius", Fields.WIDTH_FIELD, Fields.HEIGHT_FIELD, "startEnterAnimation", "startTextAnimation", "tryRestoreSelectedItemId", "updateMenuView", "updateSelectPosition", "Companion", "ItemTipBean", "nearx_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public class BottomNavigationMenuView extends FrameLayout implements MenuView {
    private final float END_ALPHA;
    private final float START_ALPHA;

    @NotNull
    public Map<Integer, View> _$_findViewCache;
    private int enlargeItemIndex;

    @Nullable
    private ColorStateList iconTintList;
    private int itemBackgroundRes;

    @Nullable
    private ColorStateList itemTextColor;

    @Nullable
    private BottomNavigationItemView[] mButtons;
    private int mDefaultPadding;

    @Nullable
    private Animator mEnterAnim;
    private boolean mFirstBuild;
    private int mItemHeight;
    private int mItemTextSize;

    @Nullable
    private MenuBuilder mMenu;
    private boolean mNeedTextAnim;
    private View.OnClickListener mOnClickListener;

    @Nullable
    private NavigationPresenter mPresenter;
    private int mPreviousSelectedPostion;
    private int mSelectedItemPosition;

    @Nullable
    private TransitionSet mSet;
    private int[] mTempChildWidths;

    @NotNull
    private final SparseArray<ItemTipBean> mTipList;
    private int selectedItemId;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final long ACTIVE_ANIMATION_DURATION_MS = 100;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/heytap/nearx/uikit/widget/navigation/BottomNavigationMenuView$Companion;", "", "()V", "ACTIVE_ANIMATION_DURATION_MS", "", "getACTIVE_ANIMATION_DURATION_MS", "()J", "nearx_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long getACTIVE_ANIMATION_DURATION_MS() {
            return BottomNavigationMenuView.ACTIVE_ANIMATION_DURATION_MS;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/heytap/nearx/uikit/widget/navigation/BottomNavigationMenuView$ItemTipBean;", "", SpeechConstant.TTS_PLAY_MARK_TIP, "", "tipType", "", "(Ljava/lang/String;I)V", "getTip", "()Ljava/lang/String;", "setTip", "(Ljava/lang/String;)V", "getTipType", "()I", "setTipType", "(I)V", "nearx_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class ItemTipBean {

        @NotNull
        private String tip;
        private int tipType;

        public ItemTipBean(@NotNull String tip, int i) {
            Intrinsics.checkNotNullParameter(tip, "tip");
            this.tip = tip;
            this.tipType = i;
        }

        @NotNull
        public final String getTip() {
            return this.tip;
        }

        public final int getTipType() {
            return this.tipType;
        }

        public final void setTip(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.tip = str;
        }

        public final void setTipType(int i) {
            this.tipType = i;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public BottomNavigationMenuView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SensorsDataInstrumented
    /* JADX INFO: renamed from: _init_$lambda-0, reason: not valid java name */
    public static final void m4701_init_$lambda0(BottomNavigationMenuView this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (view == null) {
            NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type com.heytap.nearx.uikit.widget.navigation.BottomNavigationItemView");
            SensorsDataAutoTrackHelper.trackViewOnClick(view);
            throw nullPointerException;
        }
        MenuItemImpl mItemData = ((BottomNavigationItemView) view).getMItemData();
        MenuBuilder menuBuilder = this$0.mMenu;
        Intrinsics.checkNotNull(menuBuilder);
        if (!menuBuilder.performItemAction(mItemData, this$0.mPresenter, 0)) {
            Intrinsics.checkNotNull(mItemData);
            mItemData.setChecked(true);
        }
        if (this$0.mNeedTextAnim && mItemData != null && this$0.selectedItemId != mItemData.getItemId()) {
            this$0.startTextAnimation();
        }
        SensorsDataAutoTrackHelper.trackViewOnClick(view);
    }

    private final void addTipBean(MenuItem item, String tip, int tipType) {
        if (item == null) {
            return;
        }
        ItemTipBean itemTipBean = this.mTipList.get(item.getItemId());
        if (itemTipBean == null) {
            itemTipBean = new ItemTipBean(tip, tipType);
        } else {
            itemTipBean.setTip(tip);
            itemTipBean.setTipType(tipType);
        }
        this.mTipList.put(item.getItemId(), itemTipBean);
    }

    private final BottomNavigationItemView getNewEnlargeItem() {
        return initEnlargeMenuItem();
    }

    private final BottomNavigationItemView getNewItem() {
        return initMenuItem();
    }

    private final boolean isRtlMode() {
        return getLayoutDirection() == 1;
    }

    private final void startTextAnimation() {
        if (this.mSelectedItemPosition == this.mPreviousSelectedPostion) {
            return;
        }
        BottomNavigationItemView[] bottomNavigationItemViewArr = this.mButtons;
        Intrinsics.checkNotNull(bottomNavigationItemViewArr);
        bottomNavigationItemViewArr[this.mSelectedItemPosition].startTextEnterAnimation();
        BottomNavigationItemView[] bottomNavigationItemViewArr2 = this.mButtons;
        Intrinsics.checkNotNull(bottomNavigationItemViewArr2);
        bottomNavigationItemViewArr2[this.mPreviousSelectedPostion].startTextExitAnimation();
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

    public final void buildMenuView() {
        MenuBuilder menuBuilder = this.mMenu;
        Intrinsics.checkNotNull(menuBuilder);
        int size = menuBuilder.size();
        if (size != 0) {
            removeAllViews();
        }
        if (size == 0) {
            this.selectedItemId = 0;
            this.mSelectedItemPosition = 0;
            this.mButtons = null;
            return;
        }
        this.mFirstBuild = true;
        this.mButtons = new BottomNavigationItemView[size];
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            MenuBuilder menuBuilder2 = this.mMenu;
            Intrinsics.checkNotNull(menuBuilder2);
            MenuItem item = menuBuilder2.getItem(i);
            if (item == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.appcompat.view.menu.MenuItemImpl");
            }
            MenuItemImpl menuItemImpl = (MenuItemImpl) item;
            if (menuItemImpl.isVisible()) {
                if (i >= BottomNavigationMenu.INSTANCE.a()) {
                    break;
                }
                BottomNavigationItemView newItem = (i < 0 || i != this.enlargeItemIndex) ? getNewItem() : getNewEnlargeItem();
                BottomNavigationItemView[] bottomNavigationItemViewArr = this.mButtons;
                if (bottomNavigationItemViewArr != null) {
                    bottomNavigationItemViewArr[i] = newItem;
                }
                newItem.setIconTintList(this.iconTintList);
                newItem.setTextColor(this.itemTextColor);
                newItem.setTextSize(this.mItemTextSize);
                newItem.setItemBackground(this.itemBackgroundRes);
                newItem.initialize(menuItemImpl, 0);
                newItem.setItemPosition(i);
                View.OnClickListener onClickListener = this.mOnClickListener;
                if (onClickListener == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mOnClickListener");
                    onClickListener = null;
                }
                newItem.setOnClickListener(onClickListener);
                ItemTipBean itemTipBean = this.mTipList.get(menuItemImpl.getItemId());
                if (itemTipBean != null) {
                    newItem.setTipsView(itemTipBean.getTip(), itemTipBean.getTipType());
                }
                addView(newItem);
            }
            i = i2;
        }
        MenuBuilder menuBuilder3 = this.mMenu;
        Intrinsics.checkNotNull(menuBuilder3);
        this.mSelectedItemPosition = Math.min(menuBuilder3.size() - 1, this.mSelectedItemPosition);
        MenuBuilder menuBuilder4 = this.mMenu;
        Intrinsics.checkNotNull(menuBuilder4);
        menuBuilder4.getItem(this.mSelectedItemPosition).setChecked(true);
    }

    public final void clearColorFilter() {
        BottomNavigationItemView[] bottomNavigationItemViewArr = this.mButtons;
        Intrinsics.checkNotNull(bottomNavigationItemViewArr);
        int length = bottomNavigationItemViewArr.length;
        int i = 0;
        while (i < length) {
            BottomNavigationItemView bottomNavigationItemView = bottomNavigationItemViewArr[i];
            i++;
            if (bottomNavigationItemView != null) {
                bottomNavigationItemView.clearColorFilter();
            }
        }
    }

    public final void clearTips(int position) {
        try {
            BottomNavigationItemView[] bottomNavigationItemViewArr = this.mButtons;
            Intrinsics.checkNotNull(bottomNavigationItemViewArr);
            bottomNavigationItemViewArr[position].clearTips();
        } catch (Exception unused) {
        }
    }

    public final void clearTipsAll() {
        try {
            MenuBuilder menuBuilder = this.mMenu;
            Intrinsics.checkNotNull(menuBuilder);
            int size = menuBuilder.size();
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                BottomNavigationItemView[] bottomNavigationItemViewArr = this.mButtons;
                Intrinsics.checkNotNull(bottomNavigationItemViewArr);
                bottomNavigationItemViewArr[i].clearTips();
                i = i2;
            }
        } catch (Exception unused) {
        }
    }

    public final int getEnlargeItemIndex() {
        return this.enlargeItemIndex;
    }

    @Nullable
    public final ColorStateList getIconTintList() {
        return this.iconTintList;
    }

    public final int getItemBackgroundRes() {
        return this.itemBackgroundRes;
    }

    @Nullable
    public final ColorStateList getItemTextColor() {
        return this.itemTextColor;
    }

    @Nullable
    public final MenuView.ItemView getMenuItemView(@NotNull MenuItem itemId) {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        BottomNavigationItemView[] bottomNavigationItemViewArr = this.mButtons;
        if (bottomNavigationItemViewArr == null) {
            return null;
        }
        int length = bottomNavigationItemViewArr.length;
        int i = 0;
        while (i < length) {
            BottomNavigationItemView bottomNavigationItemView = bottomNavigationItemViewArr[i];
            i++;
            if (bottomNavigationItemView.getId() == itemId.getItemId()) {
                return bottomNavigationItemView;
            }
        }
        return null;
    }

    public final int getSelectedItemId() {
        return this.selectedItemId;
    }

    @Override // androidx.appcompat.view.menu.MenuView
    public int getWindowAnimations() {
        return 0;
    }

    @NotNull
    public BottomNavigationItemView initEnlargeMenuItem() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        return new BottomNavigationItemView(context, null, 0, 0, false, 30, null);
    }

    @NotNull
    public BottomNavigationItemView initMenuItem() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        return new BottomNavigationItemView(context, null, 0, 0, false, 30, null);
    }

    @Override // androidx.appcompat.view.menu.MenuView
    public void initialize(@Nullable MenuBuilder menu) {
        this.mMenu = menu;
    }

    @Override // android.view.View
    public void onConfigurationChanged(@Nullable Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        this.mDefaultPadding = getResources().getDimensionPixelSize(R$dimen.NXcolor_navigation_item_padding);
        requestLayout();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        int childCount = getChildCount();
        int i = right - left;
        int i2 = bottom - top;
        int i3 = 0;
        int measuredWidth = 0;
        while (i3 < childCount) {
            int i4 = i3 + 1;
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                if (isRtlMode()) {
                    int i5 = i - measuredWidth;
                    childAt.layout(i5 - childAt.getMeasuredWidth(), 0, i5, i2);
                } else {
                    childAt.layout(measuredWidth, 0, childAt.getMeasuredWidth() + measuredWidth, i2);
                }
                measuredWidth += childAt.getMeasuredWidth();
            }
            i3 = i4;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int size = View.MeasureSpec.getSize(widthMeasureSpec) - (this.mDefaultPadding * 2);
        int childCount = getChildCount();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.mItemHeight, 1073741824);
        int i = size / (childCount == 0 ? 1 : childCount);
        int i2 = size - (i * childCount);
        int i3 = 0;
        while (true) {
            int[] iArr = null;
            if (i3 >= childCount) {
                break;
            }
            int i4 = i3 + 1;
            int[] iArr2 = this.mTempChildWidths;
            if (iArr2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTempChildWidths");
                iArr2 = null;
            }
            iArr2[i3] = i;
            if (i2 > 0) {
                int[] iArr3 = this.mTempChildWidths;
                if (iArr3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mTempChildWidths");
                } else {
                    iArr = iArr3;
                }
                iArr[i3] = iArr[i3] + 1;
                i2--;
            }
            i3 = i4;
        }
        int i5 = 0;
        int measuredWidth = 0;
        while (i5 < childCount) {
            int i6 = i5 + 1;
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                if (childCount == 1) {
                    int i7 = this.mDefaultPadding;
                    childAt.setPadding(i7, 0, i7, 0);
                    int[] iArr4 = this.mTempChildWidths;
                    if (iArr4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mTempChildWidths");
                        iArr4 = null;
                    }
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(iArr4[i5] + (this.mDefaultPadding * 2), 1073741824), iMakeMeasureSpec);
                } else if (i5 == 0) {
                    childAt.setPadding(isRtlMode() ? 0 : this.mDefaultPadding, 0, isRtlMode() ? this.mDefaultPadding : 0, 0);
                    int[] iArr5 = this.mTempChildWidths;
                    if (iArr5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mTempChildWidths");
                        iArr5 = null;
                    }
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(iArr5[i5] + this.mDefaultPadding, 1073741824), iMakeMeasureSpec);
                } else if (i5 == childCount - 1) {
                    childAt.setPadding(isRtlMode() ? this.mDefaultPadding : 0, 0, isRtlMode() ? 0 : this.mDefaultPadding, 0);
                    int[] iArr6 = this.mTempChildWidths;
                    if (iArr6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mTempChildWidths");
                        iArr6 = null;
                    }
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(iArr6[i5] + this.mDefaultPadding, 1073741824), iMakeMeasureSpec);
                } else {
                    childAt.setPadding(0, 0, 0, 0);
                    int[] iArr7 = this.mTempChildWidths;
                    if (iArr7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mTempChildWidths");
                        iArr7 = null;
                    }
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(iArr7[i5], 1073741824), iMakeMeasureSpec);
                }
                childAt.getLayoutParams().width = childAt.getMeasuredWidth();
                measuredWidth += childAt.getMeasuredWidth();
            }
            i5 = i6;
        }
        setMeasuredDimension(View.resolveSizeAndState(measuredWidth, View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), 0), View.resolveSizeAndState(this.mItemHeight, iMakeMeasureSpec, 0));
    }

    public final void setEnlargeItemIndex(int i) {
        this.enlargeItemIndex = i;
    }

    public final void setIconTintList(@Nullable ColorStateList colorStateList) {
        this.iconTintList = colorStateList;
        BottomNavigationItemView[] bottomNavigationItemViewArr = this.mButtons;
        if (bottomNavigationItemViewArr == null) {
            return;
        }
        Intrinsics.checkNotNull(bottomNavigationItemViewArr);
        int length = bottomNavigationItemViewArr.length;
        int i = 0;
        while (i < length) {
            BottomNavigationItemView bottomNavigationItemView = bottomNavigationItemViewArr[i];
            i++;
            bottomNavigationItemView.setIconTintList(colorStateList);
        }
    }

    public final void setItemBackgroundRes(int i) {
        this.itemBackgroundRes = i;
        BottomNavigationItemView[] bottomNavigationItemViewArr = this.mButtons;
        if (bottomNavigationItemViewArr == null) {
            return;
        }
        Intrinsics.checkNotNull(bottomNavigationItemViewArr);
        int length = bottomNavigationItemViewArr.length;
        int i2 = 0;
        while (i2 < length) {
            BottomNavigationItemView bottomNavigationItemView = bottomNavigationItemViewArr[i2];
            i2++;
            bottomNavigationItemView.setItemBackground(i);
        }
    }

    public final void setItemForEnlargeColor() {
        BottomNavigationItemView[] bottomNavigationItemViewArr = this.mButtons;
        Intrinsics.checkNotNull(bottomNavigationItemViewArr);
        int length = bottomNavigationItemViewArr.length;
        int i = 0;
        while (i < length) {
            BottomNavigationItemView bottomNavigationItemView = bottomNavigationItemViewArr[i];
            i++;
            if (bottomNavigationItemView != null) {
                bottomNavigationItemView.setTextColor(Integer.valueOf(getContext().getResources().getColor(R$color.nx_navigation_enlarge_item_color)));
            }
            if (bottomNavigationItemView != null) {
                bottomNavigationItemView.setIconTintForWhite();
            }
        }
    }

    public void setItemHeight(int defaultHeight) {
        this.mItemHeight = defaultHeight;
    }

    public final void setItemTextColor(@Nullable ColorStateList colorStateList) {
        this.itemTextColor = colorStateList;
        BottomNavigationItemView[] bottomNavigationItemViewArr = this.mButtons;
        if (bottomNavigationItemViewArr == null) {
            return;
        }
        Intrinsics.checkNotNull(bottomNavigationItemViewArr);
        int length = bottomNavigationItemViewArr.length;
        int i = 0;
        while (i < length) {
            BottomNavigationItemView bottomNavigationItemView = bottomNavigationItemViewArr[i];
            i++;
            if (bottomNavigationItemView != null) {
                bottomNavigationItemView.setTextColor(colorStateList);
            }
        }
    }

    public final void setItemTextSize(int size) {
        this.mItemTextSize = size;
        BottomNavigationItemView[] bottomNavigationItemViewArr = this.mButtons;
        if (bottomNavigationItemViewArr == null) {
            return;
        }
        int length = bottomNavigationItemViewArr.length;
        int i = 0;
        while (i < length) {
            BottomNavigationItemView bottomNavigationItemView = bottomNavigationItemViewArr[i];
            i++;
            bottomNavigationItemView.setTextSize(size);
        }
    }

    public final void setNeedTextAnim(boolean needTextAnim) {
        this.mNeedTextAnim = needTextAnim;
    }

    public final void setPresenter(@NotNull NavigationPresenter presenter) {
        Intrinsics.checkNotNullParameter(presenter, "presenter");
        this.mPresenter = presenter;
    }

    public final void setTipsView(int position, int tips, int tipsType, int marginStart, int marginTop, int textSize, int radius) {
        setTipsView(position, String.valueOf(tips), tipsType, marginStart, marginTop, textSize, radius);
    }

    public final void startEnterAnimation() {
        if (this.mEnterAnim == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<BottomNavigationMenuView, Float>) View.ALPHA, this.START_ALPHA, this.END_ALPHA);
            this.mEnterAnim = objectAnimatorOfFloat;
            Intrinsics.checkNotNull(objectAnimatorOfFloat);
            objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
            Animator animator = this.mEnterAnim;
            Intrinsics.checkNotNull(animator);
            animator.setDuration(ACTIVE_ANIMATION_DURATION_MS);
        }
        Animator animator2 = this.mEnterAnim;
        Intrinsics.checkNotNull(animator2);
        animator2.start();
    }

    public final void tryRestoreSelectedItemId(int itemId) {
        MenuBuilder menuBuilder = this.mMenu;
        Intrinsics.checkNotNull(menuBuilder);
        int size = menuBuilder.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            MenuBuilder menuBuilder2 = this.mMenu;
            Intrinsics.checkNotNull(menuBuilder2);
            MenuItem item = menuBuilder2.getItem(i);
            if (itemId == item.getItemId()) {
                this.selectedItemId = itemId;
                this.mSelectedItemPosition = i;
                item.setChecked(true);
                return;
            }
            i = i2;
        }
    }

    public void updateMenuView() {
        MenuBuilder menuBuilder = this.mMenu;
        Intrinsics.checkNotNull(menuBuilder);
        int size = menuBuilder.size();
        BottomNavigationItemView[] bottomNavigationItemViewArr = this.mButtons;
        Intrinsics.checkNotNull(bottomNavigationItemViewArr);
        if (size != bottomNavigationItemViewArr.length) {
            buildMenuView();
            return;
        }
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            MenuBuilder menuBuilder2 = this.mMenu;
            Intrinsics.checkNotNull(menuBuilder2);
            MenuItem item = menuBuilder2.getItem(i);
            if (item.isChecked()) {
                this.selectedItemId = item.getItemId();
                this.mSelectedItemPosition = i;
            }
            i = i2;
        }
        if (this.mFirstBuild) {
            BottomNavigationItemView[] bottomNavigationItemViewArr2 = this.mButtons;
            Intrinsics.checkNotNull(bottomNavigationItemViewArr2);
            int i3 = this.mSelectedItemPosition;
            if (bottomNavigationItemViewArr2[i3] != null && size > i3) {
                NavigationPresenter navigationPresenter = this.mPresenter;
                Intrinsics.checkNotNull(navigationPresenter);
                navigationPresenter.setUpdateSuspended(true);
                BottomNavigationItemView[] bottomNavigationItemViewArr3 = this.mButtons;
                Intrinsics.checkNotNull(bottomNavigationItemViewArr3);
                BottomNavigationItemView bottomNavigationItemView = bottomNavigationItemViewArr3[this.mSelectedItemPosition];
                MenuBuilder menuBuilder3 = this.mMenu;
                Intrinsics.checkNotNull(menuBuilder3);
                MenuItem item2 = menuBuilder3.getItem(this.mSelectedItemPosition);
                if (item2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.appcompat.view.menu.MenuItemImpl");
                }
                bottomNavigationItemView.initialize((MenuItemImpl) item2, 0);
                NavigationPresenter navigationPresenter2 = this.mPresenter;
                Intrinsics.checkNotNull(navigationPresenter2);
                navigationPresenter2.setUpdateSuspended(false);
                this.mFirstBuild = false;
                return;
            }
        }
        int i4 = 0;
        while (i4 < size) {
            int i5 = i4 + 1;
            BottomNavigationItemView[] bottomNavigationItemViewArr4 = this.mButtons;
            Intrinsics.checkNotNull(bottomNavigationItemViewArr4);
            if (bottomNavigationItemViewArr4[i4] != null) {
                NavigationPresenter navigationPresenter3 = this.mPresenter;
                Intrinsics.checkNotNull(navigationPresenter3);
                navigationPresenter3.setUpdateSuspended(true);
                BottomNavigationItemView[] bottomNavigationItemViewArr5 = this.mButtons;
                Intrinsics.checkNotNull(bottomNavigationItemViewArr5);
                BottomNavigationItemView bottomNavigationItemView2 = bottomNavigationItemViewArr5[i4];
                MenuBuilder menuBuilder4 = this.mMenu;
                Intrinsics.checkNotNull(menuBuilder4);
                MenuItem item3 = menuBuilder4.getItem(i4);
                if (item3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.appcompat.view.menu.MenuItemImpl");
                }
                bottomNavigationItemView2.initialize((MenuItemImpl) item3, 0);
                NavigationPresenter navigationPresenter4 = this.mPresenter;
                Intrinsics.checkNotNull(navigationPresenter4);
                navigationPresenter4.setUpdateSuspended(false);
            }
            i4 = i5;
        }
    }

    public final void updateSelectPosition(@Nullable MenuItem item) {
        if (item == null) {
            return;
        }
        this.mPreviousSelectedPostion = this.mSelectedItemPosition;
        MenuBuilder menuBuilder = this.mMenu;
        Intrinsics.checkNotNull(menuBuilder);
        int size = menuBuilder.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            MenuBuilder menuBuilder2 = this.mMenu;
            Intrinsics.checkNotNull(menuBuilder2);
            if (menuBuilder2.getItem(i).getItemId() == item.getItemId()) {
                this.mSelectedItemPosition = i;
                return;
            }
            i = i2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BottomNavigationMenuView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.START_ALPHA = 0.3f;
        this.END_ALPHA = 1.0f;
        this.enlargeItemIndex = -1;
        this.mTipList = new SparseArray<>();
        this._$_findViewCache = new LinkedHashMap();
        this.mDefaultPadding = getResources().getDimensionPixelSize(R$dimen.NXcolor_navigation_item_padding);
        TransitionSet transitionSet = new TransitionSet();
        this.mSet = transitionSet;
        Intrinsics.checkNotNull(transitionSet);
        transitionSet.addTransition(new Fade());
        TransitionSet transitionSet2 = this.mSet;
        Intrinsics.checkNotNull(transitionSet2);
        transitionSet2.setOrdering(0);
        TransitionSet transitionSet3 = this.mSet;
        Intrinsics.checkNotNull(transitionSet3);
        transitionSet3.setDuration(ACTIVE_ANIMATION_DURATION_MS);
        TransitionSet transitionSet4 = this.mSet;
        Intrinsics.checkNotNull(transitionSet4);
        transitionSet4.setInterpolator((TimeInterpolator) new FastOutSlowInInterpolator());
        TransitionSet transitionSet5 = this.mSet;
        Intrinsics.checkNotNull(transitionSet5);
        transitionSet5.addTransition(new htj());
        this.mOnClickListener = new View.OnClickListener() { // from class: com.oplus.aiunit.vision.h22
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BottomNavigationMenuView.m4701_init_$lambda0(this.i, view);
            }
        };
        this.mTempChildWidths = new int[BottomNavigationMenu.INSTANCE.a()];
    }

    public final void setTipsView(int position, @NotNull String tips, int tipsType, int marginStart, int marginTop, int textSize, int radius) {
        Intrinsics.checkNotNullParameter(tips, "tips");
        if (position >= 0) {
            try {
                BottomNavigationItemView[] bottomNavigationItemViewArr = this.mButtons;
                Intrinsics.checkNotNull(bottomNavigationItemViewArr);
                if (position < bottomNavigationItemViewArr.length) {
                    BottomNavigationItemView[] bottomNavigationItemViewArr2 = this.mButtons;
                    Intrinsics.checkNotNull(bottomNavigationItemViewArr2);
                    int length = bottomNavigationItemViewArr2.length;
                    MenuBuilder menuBuilder = this.mMenu;
                    Intrinsics.checkNotNull(menuBuilder);
                    if (length != menuBuilder.size()) {
                        return;
                    }
                    BottomNavigationItemView[] bottomNavigationItemViewArr3 = this.mButtons;
                    Intrinsics.checkNotNull(bottomNavigationItemViewArr3);
                    MenuItemImpl mItemData = bottomNavigationItemViewArr3[position].getMItemData();
                    if (mItemData == null) {
                        return;
                    }
                    MenuBuilder menuBuilder2 = this.mMenu;
                    Intrinsics.checkNotNull(menuBuilder2);
                    int size = menuBuilder2.size();
                    int i = 0;
                    while (i < size) {
                        int i2 = i + 1;
                        MenuBuilder menuBuilder3 = this.mMenu;
                        Intrinsics.checkNotNull(menuBuilder3);
                        MenuItem item = menuBuilder3.getItem(i);
                        if (item != null && mItemData.getItemId() == item.getItemId()) {
                            addTipBean(item, tips, tipsType);
                            BottomNavigationItemView[] bottomNavigationItemViewArr4 = this.mButtons;
                            Intrinsics.checkNotNull(bottomNavigationItemViewArr4);
                            bottomNavigationItemViewArr4[i].setTipsView(tips, tipsType, marginStart, marginTop, textSize, radius);
                            return;
                        }
                        i = i2;
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    public final void setItemBackgroundRes(int background, int position) {
        BottomNavigationItemView bottomNavigationItemView;
        BottomNavigationItemView[] bottomNavigationItemViewArr = this.mButtons;
        if (bottomNavigationItemViewArr == null || (bottomNavigationItemView = bottomNavigationItemViewArr[position]) == null) {
            return;
        }
        bottomNavigationItemView.setItemBackground(background);
    }

    public final void setTipsView(int tips, int tipsType) {
        setTipsView(String.valueOf(tips), tipsType);
    }

    public final void setTipsView(@NotNull String tips, int tipsType) {
        Intrinsics.checkNotNullParameter(tips, "tips");
        try {
            MenuBuilder menuBuilder = this.mMenu;
            Intrinsics.checkNotNull(menuBuilder);
            int size = menuBuilder.size();
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                if (i == this.mSelectedItemPosition) {
                    MenuBuilder menuBuilder2 = this.mMenu;
                    Intrinsics.checkNotNull(menuBuilder2);
                    MenuItem item = menuBuilder2.getItem(i);
                    if (item != null) {
                        addTipBean(item, tips, tipsType);
                        BottomNavigationItemView[] bottomNavigationItemViewArr = this.mButtons;
                        Intrinsics.checkNotNull(bottomNavigationItemViewArr);
                        bottomNavigationItemViewArr[i].setTipsView(tips, tipsType);
                        return;
                    }
                }
                i = i2;
            }
        } catch (Exception unused) {
        }
    }

    public final void setTipsView(int position, int tips, int tipsType) {
        setTipsView(position, String.valueOf(tips), tipsType);
    }

    public final void setTipsView(int position, @NotNull String tips, int tipsType) {
        Intrinsics.checkNotNullParameter(tips, "tips");
        if (position >= 0) {
            try {
                BottomNavigationItemView[] bottomNavigationItemViewArr = this.mButtons;
                Intrinsics.checkNotNull(bottomNavigationItemViewArr);
                if (position < bottomNavigationItemViewArr.length) {
                    BottomNavigationItemView[] bottomNavigationItemViewArr2 = this.mButtons;
                    Intrinsics.checkNotNull(bottomNavigationItemViewArr2);
                    if (bottomNavigationItemViewArr2[position] == null) {
                        return;
                    }
                    BottomNavigationItemView[] bottomNavigationItemViewArr3 = this.mButtons;
                    Intrinsics.checkNotNull(bottomNavigationItemViewArr3);
                    MenuItemImpl mItemData = bottomNavigationItemViewArr3[position].getMItemData();
                    if (mItemData == null) {
                        return;
                    }
                    MenuBuilder menuBuilder = this.mMenu;
                    Intrinsics.checkNotNull(menuBuilder);
                    int size = menuBuilder.size();
                    int i = 0;
                    while (i < size) {
                        int i2 = i + 1;
                        MenuBuilder menuBuilder2 = this.mMenu;
                        Intrinsics.checkNotNull(menuBuilder2);
                        MenuItem item = menuBuilder2.getItem(i);
                        if (item != null && mItemData.getItemId() == item.getItemId()) {
                            addTipBean(item, tips, tipsType);
                            BottomNavigationItemView[] bottomNavigationItemViewArr4 = this.mButtons;
                            Intrinsics.checkNotNull(bottomNavigationItemViewArr4);
                            bottomNavigationItemViewArr4[i].setTipsView(tips, tipsType);
                            return;
                        }
                        i = i2;
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    public /* synthetic */ BottomNavigationMenuView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomNavigationMenuView(@NotNull Context context, @NotNull AttributeSet attrs, int i) {
        super(context, attrs, R$attr.NearBottomNavigationMenuViewStyle);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.START_ALPHA = 0.3f;
        this.END_ALPHA = 1.0f;
        this.enlargeItemIndex = -1;
        this.mTipList = new SparseArray<>();
        this._$_findViewCache = new LinkedHashMap();
    }

    public final void setTipsView(int position, int tips, int tipsType, int width, int height, int marginStart, int marginTop, int textSize, int radius) {
        setTipsView(position, String.valueOf(tips), tipsType, width, height, marginStart, marginTop, textSize, radius);
    }

    public final void setTipsView(int position, @NotNull String tips, int tipsType, int width, int height, int marginStart, int marginTop, int textSize, int radius) {
        Intrinsics.checkNotNullParameter(tips, "tips");
        if (position >= 0) {
            try {
                BottomNavigationItemView[] bottomNavigationItemViewArr = this.mButtons;
                Intrinsics.checkNotNull(bottomNavigationItemViewArr);
                if (position < bottomNavigationItemViewArr.length) {
                    BottomNavigationItemView[] bottomNavigationItemViewArr2 = this.mButtons;
                    Intrinsics.checkNotNull(bottomNavigationItemViewArr2);
                    if (bottomNavigationItemViewArr2[position] == null) {
                        return;
                    }
                    BottomNavigationItemView[] bottomNavigationItemViewArr3 = this.mButtons;
                    Intrinsics.checkNotNull(bottomNavigationItemViewArr3);
                    MenuItemImpl mItemData = bottomNavigationItemViewArr3[position].getMItemData();
                    if (mItemData == null) {
                        return;
                    }
                    MenuBuilder menuBuilder = this.mMenu;
                    Intrinsics.checkNotNull(menuBuilder);
                    int size = menuBuilder.size();
                    int i = 0;
                    while (i < size) {
                        int i2 = i + 1;
                        MenuBuilder menuBuilder2 = this.mMenu;
                        Intrinsics.checkNotNull(menuBuilder2);
                        MenuItem item = menuBuilder2.getItem(i);
                        if (item != null && mItemData.getItemId() == item.getItemId()) {
                            addTipBean(item, tips, tipsType);
                            BottomNavigationItemView[] bottomNavigationItemViewArr4 = this.mButtons;
                            Intrinsics.checkNotNull(bottomNavigationItemViewArr4);
                            bottomNavigationItemViewArr4[i].setTipsView(tips, tipsType, width, height, marginStart, marginTop, textSize, radius);
                            return;
                        }
                        i = i2;
                    }
                }
            } catch (Exception unused) {
            }
        }
    }
}
