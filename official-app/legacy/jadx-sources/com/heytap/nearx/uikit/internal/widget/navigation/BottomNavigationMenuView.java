package com.heytap.nearx.uikit.internal.widget.navigation;

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
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuView;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.nearx.tangramconfig.strategy.Fields;
import com.heytap.nearx.uikit.R$attr;
import com.heytap.nearx.uikit.R$dimen;
import com.heytap.nearx.uikit.internal.widget.navigation.BottomNavigationMenuView;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.c8l;
import com.oplus.aiunit.vision.htj;
import com.oplus.aiunit.vision.y04;
import com.oplus.smartenginehelper.ParserTag;
import com.sensorsdata.analytics.android.autotrack.aop.SensorsDataAutoTrackHelper;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;
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
@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0015\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u0000 \u0096\u00012\u00020\u00012\u00020\u0002:\u0004\u0097\u0001\u0098\u0001B#\b\u0017\u0012\b\u0010\u008f\u0001\u001a\u00030\u008e\u0001\u0012\f\b\u0002\u0010\u0091\u0001\u001a\u0005\u0018\u00010\u0090\u0001¢\u0006\u0006\b\u0092\u0001\u0010\u0093\u0001B(\b\u0016\u0012\b\u0010\u008f\u0001\u001a\u00030\u008e\u0001\u0012\b\u0010\u0091\u0001\u001a\u00030\u0090\u0001\u0012\u0007\u0010\u0094\u0001\u001a\u00020\t¢\u0006\u0006\b\u0092\u0001\u0010\u0095\u0001J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\"\u0010\u000b\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002J\u0012\u0010\u000e\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0011\u001a\u00020\u000fH\u0016J\u0012\u0010\u0014\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0014J\u0018\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\tH\u0014J0\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\tH\u0014J\b\u0010\u001f\u001a\u00020\tH\u0016J\u0010\u0010\"\u001a\u0004\u0018\u00010!2\u0006\u0010 \u001a\u00020\u0005J\u000e\u0010$\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\tJ\u0016\u0010'\u001a\u00020\u00032\u0006\u0010%\u001a\u00020\t2\u0006\u0010&\u001a\u00020\tJ\u000e\u0010*\u001a\u00020\u00032\u0006\u0010)\u001a\u00020(J\u0006\u0010+\u001a\u00020\u0003J\b\u0010,\u001a\u00020\u0003H\u0016J\u000e\u0010-\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\tJ\u0010\u0010/\u001a\u00020\u00032\u0006\u0010.\u001a\u00020\tH\u0016J\u0010\u00100\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005J\u000e\u00102\u001a\u00020\u00032\u0006\u00101\u001a\u00020\u0018J>\u00109\u001a\u00020\u00032\u0006\u0010&\u001a\u00020\t2\u0006\u00103\u001a\u00020\t2\u0006\u00104\u001a\u00020\t2\u0006\u00105\u001a\u00020\t2\u0006\u00106\u001a\u00020\t2\u0006\u00107\u001a\u00020\t2\u0006\u00108\u001a\u00020\tJ>\u0010:\u001a\u00020\u00032\u0006\u0010&\u001a\u00020\t2\u0006\u00103\u001a\u00020\u00072\u0006\u00104\u001a\u00020\t2\u0006\u00105\u001a\u00020\t2\u0006\u00106\u001a\u00020\t2\u0006\u00107\u001a\u00020\t2\u0006\u00108\u001a\u00020\tJ\u0016\u0010;\u001a\u00020\u00032\u0006\u00103\u001a\u00020\t2\u0006\u00104\u001a\u00020\tJ\u0016\u0010<\u001a\u00020\u00032\u0006\u00103\u001a\u00020\u00072\u0006\u00104\u001a\u00020\tJ\u001e\u0010=\u001a\u00020\u00032\u0006\u0010&\u001a\u00020\t2\u0006\u00103\u001a\u00020\t2\u0006\u00104\u001a\u00020\tJ\u001e\u0010>\u001a\u00020\u00032\u0006\u0010&\u001a\u00020\t2\u0006\u00103\u001a\u00020\u00072\u0006\u00104\u001a\u00020\tJ\u000e\u0010?\u001a\u00020\u00032\u0006\u0010&\u001a\u00020\tJ\u0006\u0010@\u001a\u00020\u0003JN\u0010C\u001a\u00020\u00032\u0006\u0010&\u001a\u00020\t2\u0006\u00103\u001a\u00020\t2\u0006\u00104\u001a\u00020\t2\u0006\u0010A\u001a\u00020\t2\u0006\u0010B\u001a\u00020\t2\u0006\u00105\u001a\u00020\t2\u0006\u00106\u001a\u00020\t2\u0006\u00107\u001a\u00020\t2\u0006\u00108\u001a\u00020\tJN\u0010D\u001a\u00020\u00032\u0006\u0010&\u001a\u00020\t2\u0006\u00103\u001a\u00020\u00072\u0006\u00104\u001a\u00020\t2\u0006\u0010A\u001a\u00020\t2\u0006\u0010B\u001a\u00020\t2\u0006\u00105\u001a\u00020\t2\u0006\u00106\u001a\u00020\t2\u0006\u00107\u001a\u00020\t2\u0006\u00108\u001a\u00020\tJ\u0006\u0010E\u001a\u00020\u0003R\u0014\u0010H\u001a\u00020F8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0011\u0010GR\u0014\u0010I\u001a\u00020F8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0010\u0010GR\u0018\u0010M\u001a\u0004\u0018\u00010J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0016\u0010P\u001a\u00020N8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b'\u0010OR\u001e\u0010S\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010Q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010RR\"\u0010Y\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR.\u0010a\u001a\u0004\u0018\u00010Z2\b\u0010[\u001a\u0004\u0018\u00010Z8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R.\u0010e\u001a\u0004\u0018\u00010Z2\b\u0010b\u001a\u0004\u0018\u00010Z8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bC\u0010\\\u001a\u0004\bc\u0010^\"\u0004\bd\u0010`R\u0016\u0010f\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010TR$\u0010i\u001a\u00020\t2\u0006\u0010g\u001a\u00020\t8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b:\u0010T\u001a\u0004\bh\u0010VR\u0016\u0010j\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010TR\u0016\u0010k\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010TR*\u0010n\u001a\u00020\t2\u0006\u0010%\u001a\u00020\t8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bE\u0010T\u001a\u0004\bl\u0010V\"\u0004\bm\u0010XR\u0016\u0010o\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010TR\u0016\u0010p\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010TR\u0016\u0010s\u001a\u00020q8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b,\u0010rR\u0016\u0010u\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010tR\u0016\u0010w\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bv\u0010tR\u0018\u0010{\u001a\u0004\u0018\u00010x8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\by\u0010zR\u001b\u0010\u0080\u0001\u001a\b\u0012\u0004\u0012\u00020}0|8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b~\u0010\u007fR\u001b\u0010\u0083\u0001\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R\u001b\u0010\u0086\u0001\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R\u0017\u0010\u0089\u0001\u001a\u00020\u000f8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0017\u0010\u008b\u0001\u001a\u00020\u000f8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u008a\u0001\u0010\u0088\u0001R\u0016\u0010\u008d\u0001\u001a\u00020\u00188BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bK\u0010\u008c\u0001¨\u0006\u0099\u0001"}, d2 = {"Lcom/heytap/nearx/uikit/internal/widget/navigation/BottomNavigationMenuView;", "Landroid/view/ViewGroup;", "Landroidx/appcompat/view/menu/MenuView;", "", "v", "Landroid/view/MenuItem;", "item", "", SpeechConstant.TTS_PLAY_MARK_TIP, "", "tipType", "d", "Landroidx/appcompat/view/menu/MenuBuilder;", "menu", "initialize", "Lcom/heytap/nearx/uikit/internal/widget/navigation/BottomNavigationItemView;", "j", "i", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "", "changed", y04.TIME_STYLE_LEFT_DIR_NAME, "top", y04.TIME_STYLE_RIGHT_DIR_NAME, "bottom", "onLayout", "getWindowAnimations", "itemId", "Landroidx/appcompat/view/menu/MenuView$ItemView;", b2n.g, "size", "setItemTextSize", "background", "position", LogFieldKey.LEVEL_KEY, "Lcom/heytap/nearx/uikit/internal/widget/navigation/NavigationPresenter;", "presenter", "setPresenter", MapSchema.FIELD_NAME_ENTRY, "x", "w", "defaultHeight", "setItemHeight", "y", "needTextAnim", "setNeedTextAnim", "tips", "tipsType", "marginStart", "marginTop", ParserTag.TAG_TEXT_SIZE, "radius", "o", "r", LogFieldKey.MESSAGE_KEY, "t", "n", "q", "f", b2n.f, Fields.WIDTH_FIELD, Fields.HEIGHT_FIELD, LogFieldKey.PROCESS_NAME_KEY, "s", "u", "", UserInfo.SEX_FEMALE, "START_ALPHA", "END_ALPHA", "Landroid/transition/TransitionSet;", MapSchema.FIELD_NAME_KEY, "Landroid/transition/TransitionSet;", "mSet", "Landroid/view/View$OnClickListener;", "Landroid/view/View$OnClickListener;", "mOnClickListener", "", "[Lcom/heytap/nearx/uikit/internal/widget/navigation/BottomNavigationItemView;", "mButtons", "I", "getEnlargeItemIndex", "()I", "setEnlargeItemIndex", "(I)V", "enlargeItemIndex", "Landroid/content/res/ColorStateList;", "color", "Landroid/content/res/ColorStateList;", "getItemTextColor", "()Landroid/content/res/ColorStateList;", "setItemTextColor", "(Landroid/content/res/ColorStateList;)V", "itemTextColor", "tint", "getIconTintList", "setIconTintList", "iconTintList", "mItemHeight", "<set-?>", "getSelectedItemId", "selectedItemId", "mSelectedItemPosition", "mPreviousSelectedPostion", "getItemBackgroundRes", "setItemBackgroundRes", "itemBackgroundRes", "mItemTextSize", "mDefaultPadding", "", "[I", "mTempChildWidths", "Z", "mNeedTextAnim", "z", "mFirstBuild", "Landroid/animation/Animator;", "A", "Landroid/animation/Animator;", "mEnterAnim", "Landroid/util/SparseArray;", "Lcom/heytap/nearx/uikit/internal/widget/navigation/BottomNavigationMenuView$b;", c8l.KEY_B, "Landroid/util/SparseArray;", "mTipList", "C", "Lcom/heytap/nearx/uikit/internal/widget/navigation/NavigationPresenter;", "mPresenter", "D", "Landroidx/appcompat/view/menu/MenuBuilder;", "mMenu", "getNewItem", "()Lcom/heytap/nearx/uikit/internal/widget/navigation/BottomNavigationItemView;", "newItem", "getNewEnlargeItem", "newEnlargeItem", "()Z", "isRtlMode", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Companion", "a", "b", "nearx_release"}, k = 1, mv = {1, 6, 0})
public class BottomNavigationMenuView extends ViewGroup implements MenuView {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final long F = 100;

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @Nullable
    public Animator mEnterAnim;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @NotNull
    public final SparseArray<b> mTipList;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @Nullable
    public NavigationPresenter mPresenter;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @Nullable
    public MenuBuilder mMenu;

    @NotNull
    public Map<Integer, View> E;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public final float START_ALPHA;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public final float END_ALPHA;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    public TransitionSet mSet;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public View.OnClickListener mOnClickListener;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    public BottomNavigationItemView[] mButtons;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public int enlargeItemIndex;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @Nullable
    public ColorStateList itemTextColor;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @Nullable
    public ColorStateList iconTintList;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public int mItemHeight;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public int selectedItemId;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    public int mSelectedItemPosition;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public int mPreviousSelectedPostion;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    public int itemBackgroundRes;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    public int mItemTextSize;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    public int mDefaultPadding;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    public int[] mTempChildWidths;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    public boolean mNeedTextAnim;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    public boolean mFirstBuild;

    /* JADX INFO: renamed from: com.heytap.nearx.uikit.internal.widget.navigation.BottomNavigationMenuView$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0086D¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/heytap/nearx/uikit/internal/widget/navigation/BottomNavigationMenuView$a;", "", "", "ACTIVE_ANIMATION_DURATION_MS", "J", "a", "()J", "<init>", "()V", "nearx_release"}, k = 1, mv = {1, 6, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return BottomNavigationMenuView.F;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011R\"\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\"\u0010\u000f\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/heytap/nearx/uikit/internal/widget/navigation/BottomNavigationMenuView$b;", "", "", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "c", "(Ljava/lang/String;)V", SpeechConstant.TTS_PLAY_MARK_TIP, "", "b", "I", "()I", "d", "(I)V", "tipType", "<init>", "(Ljava/lang/String;I)V", "nearx_release"}, k = 1, mv = {1, 6, 0})
    public static final class b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public String tip;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public int tipType;

        public b(@NotNull String tip, int i) {
            Intrinsics.checkNotNullParameter(tip, "tip");
            this.tip = tip;
            this.tipType = i;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getTip() {
            return this.tip;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getTipType() {
            return this.tipType;
        }

        public final void c(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.tip = str;
        }

        public final void d(int i) {
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

    @SensorsDataInstrumented
    public static final void b(BottomNavigationMenuView this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (view == null) {
            NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type com.heytap.nearx.uikit.internal.widget.navigation.BottomNavigationItemView");
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
            this$0.v();
        }
        SensorsDataAutoTrackHelper.trackViewOnClick(view);
    }

    private final BottomNavigationItemView getNewEnlargeItem() {
        return i();
    }

    private final BottomNavigationItemView getNewItem() {
        return j();
    }

    public final void d(MenuItem item, String tip, int tipType) {
        if (item == null) {
            return;
        }
        b bVar = this.mTipList.get(item.getItemId());
        if (bVar == null) {
            bVar = new b(tip, tipType);
        } else {
            bVar.c(tip);
            bVar.d(tipType);
        }
        this.mTipList.put(item.getItemId(), bVar);
    }

    public final void e() {
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
                b bVar = this.mTipList.get(menuItemImpl.getItemId());
                if (bVar != null) {
                    newItem.g(bVar.getTip(), bVar.getTipType());
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

    public final void f(int position) {
        try {
            BottomNavigationItemView[] bottomNavigationItemViewArr = this.mButtons;
            Intrinsics.checkNotNull(bottomNavigationItemViewArr);
            bottomNavigationItemViewArr[position].b();
        } catch (Exception unused) {
        }
    }

    public final void g() {
        try {
            MenuBuilder menuBuilder = this.mMenu;
            Intrinsics.checkNotNull(menuBuilder);
            int size = menuBuilder.size();
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                BottomNavigationItemView[] bottomNavigationItemViewArr = this.mButtons;
                Intrinsics.checkNotNull(bottomNavigationItemViewArr);
                bottomNavigationItemViewArr[i].b();
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

    public final int getSelectedItemId() {
        return this.selectedItemId;
    }

    @Override // androidx.appcompat.view.menu.MenuView
    public int getWindowAnimations() {
        return 0;
    }

    @Nullable
    public final MenuView.ItemView h(@NotNull MenuItem itemId) {
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

    @NotNull
    public BottomNavigationItemView i() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        return new BottomNavigationItemView(context, null, 0, 0, false, 30, null);
    }

    @Override // androidx.appcompat.view.menu.MenuView
    public void initialize(@Nullable MenuBuilder menu) {
        this.mMenu = menu;
    }

    @NotNull
    public BottomNavigationItemView j() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        return new BottomNavigationItemView(context, null, 0, 0, false, 30, null);
    }

    public final boolean k() {
        return getLayoutDirection() == 1;
    }

    public final void l(int background, int position) {
        BottomNavigationItemView bottomNavigationItemView;
        BottomNavigationItemView[] bottomNavigationItemViewArr = this.mButtons;
        if (bottomNavigationItemViewArr == null || (bottomNavigationItemView = bottomNavigationItemViewArr[position]) == null) {
            return;
        }
        bottomNavigationItemView.setItemBackground(background);
    }

    public final void m(int tips, int tipsType) {
        t(String.valueOf(tips), tipsType);
    }

    public final void n(int position, int tips, int tipsType) {
        q(position, String.valueOf(tips), tipsType);
    }

    public final void o(int position, int tips, int tipsType, int marginStart, int marginTop, int textSize, int radius) {
        r(position, String.valueOf(tips), tipsType, marginStart, marginTop, textSize, radius);
    }

    @Override // android.view.View
    public void onConfigurationChanged(@Nullable Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        this.mDefaultPadding = getResources().getDimensionPixelSize(R$dimen.NXcolor_navigation_item_padding);
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
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
                if (k()) {
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

    @Override // android.view.View
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
                    childAt.setPadding(k() ? 0 : this.mDefaultPadding, 0, k() ? this.mDefaultPadding : 0, 0);
                    int[] iArr5 = this.mTempChildWidths;
                    if (iArr5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mTempChildWidths");
                        iArr5 = null;
                    }
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(iArr5[i5] + this.mDefaultPadding, 1073741824), iMakeMeasureSpec);
                } else if (i5 == childCount - 1) {
                    childAt.setPadding(k() ? this.mDefaultPadding : 0, 0, k() ? 0 : this.mDefaultPadding, 0);
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

    public final void p(int position, int tips, int tipsType, int width, int height, int marginStart, int marginTop, int textSize, int radius) {
        s(position, String.valueOf(tips), tipsType, width, height, marginStart, marginTop, textSize, radius);
    }

    public final void q(int position, @NotNull String tips, int tipsType) {
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
                            d(item, tips, tipsType);
                            BottomNavigationItemView[] bottomNavigationItemViewArr4 = this.mButtons;
                            Intrinsics.checkNotNull(bottomNavigationItemViewArr4);
                            bottomNavigationItemViewArr4[i].g(tips, tipsType);
                            return;
                        }
                        i = i2;
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    public final void r(int position, @NotNull String tips, int tipsType, int marginStart, int marginTop, int textSize, int radius) {
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
                            d(item, tips, tipsType);
                            BottomNavigationItemView[] bottomNavigationItemViewArr4 = this.mButtons;
                            Intrinsics.checkNotNull(bottomNavigationItemViewArr4);
                            bottomNavigationItemViewArr4[i].h(tips, tipsType, marginStart, marginTop, textSize, radius);
                            return;
                        }
                        i = i2;
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    public final void s(int position, @NotNull String tips, int tipsType, int width, int height, int marginStart, int marginTop, int textSize, int radius) {
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
                            d(item, tips, tipsType);
                            BottomNavigationItemView[] bottomNavigationItemViewArr4 = this.mButtons;
                            Intrinsics.checkNotNull(bottomNavigationItemViewArr4);
                            bottomNavigationItemViewArr4[i].i(tips, tipsType, width, height, marginStart, marginTop, textSize, radius);
                            return;
                        }
                        i = i2;
                    }
                }
            } catch (Exception unused) {
            }
        }
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

    public final void t(@NotNull String tips, int tipsType) {
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
                        d(item, tips, tipsType);
                        BottomNavigationItemView[] bottomNavigationItemViewArr = this.mButtons;
                        Intrinsics.checkNotNull(bottomNavigationItemViewArr);
                        bottomNavigationItemViewArr[i].g(tips, tipsType);
                        return;
                    }
                }
                i = i2;
            }
        } catch (Exception unused) {
        }
    }

    public final void u() {
        if (this.mEnterAnim == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<BottomNavigationMenuView, Float>) View.ALPHA, this.START_ALPHA, this.END_ALPHA);
            this.mEnterAnim = objectAnimatorOfFloat;
            Intrinsics.checkNotNull(objectAnimatorOfFloat);
            objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
            Animator animator = this.mEnterAnim;
            Intrinsics.checkNotNull(animator);
            animator.setDuration(F);
        }
        Animator animator2 = this.mEnterAnim;
        Intrinsics.checkNotNull(animator2);
        animator2.start();
    }

    public final void v() {
        if (this.mSelectedItemPosition == this.mPreviousSelectedPostion) {
            return;
        }
        BottomNavigationItemView[] bottomNavigationItemViewArr = this.mButtons;
        Intrinsics.checkNotNull(bottomNavigationItemViewArr);
        bottomNavigationItemViewArr[this.mSelectedItemPosition].j();
        BottomNavigationItemView[] bottomNavigationItemViewArr2 = this.mButtons;
        Intrinsics.checkNotNull(bottomNavigationItemViewArr2);
        bottomNavigationItemViewArr2[this.mPreviousSelectedPostion].k();
    }

    public final void w(int itemId) {
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

    public void x() {
        MenuBuilder menuBuilder = this.mMenu;
        Intrinsics.checkNotNull(menuBuilder);
        int size = menuBuilder.size();
        BottomNavigationItemView[] bottomNavigationItemViewArr = this.mButtons;
        Intrinsics.checkNotNull(bottomNavigationItemViewArr);
        if (size != bottomNavigationItemViewArr.length) {
            e();
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
                navigationPresenter.c(true);
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
                navigationPresenter2.c(false);
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
                navigationPresenter3.c(true);
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
                navigationPresenter4.c(false);
            }
            i4 = i5;
        }
    }

    public final void y(@Nullable MenuItem item) {
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
        this.E = new LinkedHashMap();
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
        transitionSet3.setDuration(F);
        TransitionSet transitionSet4 = this.mSet;
        Intrinsics.checkNotNull(transitionSet4);
        transitionSet4.setInterpolator((TimeInterpolator) new FastOutSlowInInterpolator());
        TransitionSet transitionSet5 = this.mSet;
        Intrinsics.checkNotNull(transitionSet5);
        transitionSet5.addTransition(new htj());
        this.mOnClickListener = new View.OnClickListener() { // from class: com.oplus.aiunit.vision.i22
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BottomNavigationMenuView.b(this.i, view);
            }
        };
        this.mTempChildWidths = new int[BottomNavigationMenu.INSTANCE.a()];
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
        this.E = new LinkedHashMap();
    }
}
