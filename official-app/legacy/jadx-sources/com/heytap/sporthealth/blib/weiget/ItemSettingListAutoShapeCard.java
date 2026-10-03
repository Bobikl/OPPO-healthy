package com.heytap.sporthealth.blib.weiget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.coui.appcompat.cardlist.COUICardListSelectedItemLayout;
import com.coui.appcompat.couiswitch.COUISwitch;
import com.coui.appcompat.imageview.COUIRoundImageView;
import com.coui.appcompat.reddot.COUIHintRedDot;
import com.heytap.databaseengineservice.db.table.healtharchives.DBHealthReviewPlan;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.sporthealth.blib.weiget.ItemSettingListAutoShapeCard;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.lh2;
import com.oplus.aiunit.vision.lo9;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import com.oplus.smartenginehelper.entity.ViewEntity;
import com.support.appcompat.R$attr;
import com.support.appcompat.R$dimen;
import com.support.preference.R$id;
import com.support.preference.R$layout;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;
import pantanal.internal.datachannel.CardAction;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001Bk\b\u0007\u0012\u0006\u0010M\u001a\u00020L\u0012\u0006\u0010O\u001a\u00020N\u0012\n\b\u0002\u0010P\u001a\u0004\u0018\u00010N\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010Q\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010R\u001a\u0004\u0018\u00010N\u0012\n\b\u0002\u0010S\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010T\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010U\u001a\u0004\u0018\u00010\f¢\u0006\u0004\bV\u0010WJ\u0014\u0010\u0006\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0017\u0010\b\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0003H\u0016J\u0019\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\u00002\u0017\u0010\u0013\u001a\u0013\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00050\u0010¢\u0006\u0002\b\u0012J\u0012\u0010\u0017\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016J\b\u0010\u0018\u001a\u00020\u0005H\u0014J\u0010\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0019H\u0016R\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0016\u0010#\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010\u001dR\u001b\u0010)\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0016\u0010,\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010+R\u001b\u00101\u001a\u00020-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010&\u001a\u0004\b/\u00100R\u001b\u00106\u001a\u0002028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u0010&\u001a\u0004\b4\u00105R\u001b\u00109\u001a\u0002028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u0010&\u001a\u0004\b8\u00105R\u001b\u0010>\u001a\u00020:8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u0010&\u001a\u0004\b<\u0010=R\u001b\u0010A\u001a\u0002028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b?\u0010&\u001a\u0004\b@\u00105R\u001b\u0010F\u001a\u00020B8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bC\u0010&\u001a\u0004\bD\u0010ER\u0016\u0010I\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0016\u0010K\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010H¨\u0006X"}, d2 = {"Lcom/heytap/sporthealth/blib/weiget/ItemSettingListAutoShapeCard;", "Landroid/widget/FrameLayout;", "Landroid/view/View;", "", "enable", "", "d", CardAction.LIFE_CIRCLE_VALUE_SHOW, "b", "(Ljava/lang/Boolean;)V", ViewEntity.ENABLED, ClickApiEntity.SET_ENABLED, "", DBHealthReviewPlan.DESC, MapSchema.FIELD_NAME_ENTRY, "(Ljava/lang/Integer;)Lcom/heytap/sporthealth/blib/weiget/ItemSettingListAutoShapeCard;", "Lkotlin/Function1;", "Lcom/coui/appcompat/couiswitch/COUISwitch;", "Lkotlin/ExtensionFunctionType;", "config", b2n.f, "Landroid/view/View$OnClickListener;", LogFieldKey.LEVEL_KEY, "setOnClickListener", "onAttachedToWindow", "Landroid/graphics/Canvas;", "canvas", "onDrawForeground", "i", "Z", "getEnable", "()Z", "setEnable", "(Z)V", "j", "showDivider", "Landroid/graphics/Paint;", MapSchema.FIELD_NAME_KEY, "Lkotlin/Lazy;", "getPaint", "()Landroid/graphics/Paint;", lo9.TAG_DEFAULT_CREATION_PAINT, "Lcom/coui/appcompat/cardlist/COUICardListSelectedItemLayout;", "Lcom/coui/appcompat/cardlist/COUICardListSelectedItemLayout;", "selectedItemLayout", "Lcom/coui/appcompat/imageview/COUIRoundImageView;", LogFieldKey.MESSAGE_KEY, "getImIcon", "()Lcom/coui/appcompat/imageview/COUIRoundImageView;", "imIcon", "Landroid/widget/TextView;", "n", "getTvTitle", "()Landroid/widget/TextView;", "tvTitle", "o", "getTvSummary", "tvSummary", "Landroid/widget/LinearLayout;", LogFieldKey.PROCESS_NAME_KEY, "getWidgetFrame", "()Landroid/widget/LinearLayout;", "widgetFrame", "q", "getTvAssignment", "tvAssignment", "Lcom/coui/appcompat/reddot/COUIHintRedDot;", "r", "getHintRedDot", "()Lcom/coui/appcompat/reddot/COUIHintRedDot;", "hintRedDot", "s", "I", "dividerStart", "t", "dividerEnd", "Landroid/content/Context;", "context", "", "title", "summary", "icon", "assignment", "titleColor", "summaryColor", "assignmentColor", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "lib_ui_release"}, k = 1, mv = {1, 8, 0})
@SuppressLint({"ObsoleteSdkInt"})
@SourceDebugExtension({"SMAP\nCardItemLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardItemLayout.kt\ncom/heytap/sporthealth/blib/weiget/ItemSettingListAutoShapeCard\n+ 2 UIConfig.kt\ncom/heytap/sporthealth/blib/helper/UIConfigKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ViewGroup.kt\nandroidx/core/view/ViewGroupKt\n*L\n1#1,312:1\n155#2:313\n155#2:315\n155#2:320\n155#2:321\n1#3:314\n53#4,4:316\n*S KotlinDebug\n*F\n+ 1 CardItemLayout.kt\ncom/heytap/sporthealth/blib/weiget/ItemSettingListAutoShapeCard\n*L\n158#1:313\n159#1:315\n263#1:320\n290#1:321\n179#1:316,4\n*E\n"})
public final class ItemSettingListAutoShapeCard extends FrameLayout {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public boolean enable;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public boolean showDivider;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final Lazy paint;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public COUICardListSelectedItemLayout selectedItemLayout;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final Lazy imIcon;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy tvTitle;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    public final Lazy tvSummary;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    public final Lazy widgetFrame;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    public final Lazy tvAssignment;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @NotNull
    public final Lazy hintRedDot;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    public int dividerStart;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public int dividerEnd;

    public /* synthetic */ ItemSettingListAutoShapeCard(Context context, String str, String str2, boolean z, Integer num, String str3, Integer num2, Integer num3, Integer num4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? true : z, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : num2, (i & 128) != 0 ? null : num3, (i & 256) != 0 ? null : num4);
    }

    public static final void c(ItemSettingListAutoShapeCard this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Object parent = this$0.getTvTitle().getParent();
        if (!(parent instanceof View)) {
            parent = null;
        }
        View view = (View) parent;
        this$0.dividerStart = view != null ? view.getLeft() : 0;
        this$0.dividerEnd = this$0.getWidth() - this$0.selectedItemLayout.getPaddingEnd();
    }

    public static /* synthetic */ ItemSettingListAutoShapeCard f(ItemSettingListAutoShapeCard itemSettingListAutoShapeCard, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        return itemSettingListAutoShapeCard.e(num);
    }

    private final COUIHintRedDot getHintRedDot() {
        Object value = this.hintRedDot.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-hintRedDot>(...)");
        return (COUIHintRedDot) value;
    }

    private final COUIRoundImageView getImIcon() {
        Object value = this.imIcon.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-imIcon>(...)");
        return (COUIRoundImageView) value;
    }

    private final Paint getPaint() {
        return (Paint) this.paint.getValue();
    }

    private final TextView getTvAssignment() {
        Object value = this.tvAssignment.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-tvAssignment>(...)");
        return (TextView) value;
    }

    private final TextView getTvSummary() {
        Object value = this.tvSummary.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-tvSummary>(...)");
        return (TextView) value;
    }

    private final TextView getTvTitle() {
        Object value = this.tvTitle.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-tvTitle>(...)");
        return (TextView) value;
    }

    private final LinearLayout getWidgetFrame() {
        Object value = this.widgetFrame.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-widgetFrame>(...)");
        return (LinearLayout) value;
    }

    public final void b(@Nullable Boolean show) {
        if (show != null) {
            getHintRedDot().setVisibility(show.booleanValue() ? 0 : 8);
            getHintRedDot().setPointMode(1);
        }
    }

    public final void d(View view, boolean z) {
        if (!(view instanceof ViewGroup)) {
            view.setEnabled(z);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            d(viewGroup.getChildAt(i), z);
        }
    }

    @NotNull
    public final ItemSettingListAutoShapeCard e(@Nullable Integer desc) {
        getWidgetFrame().removeAllViews();
        View viewInflate = View.inflate(getContext(), R$layout.coui_preference_widget_jump, getWidgetFrame());
        if (desc != null) {
            desc.intValue();
            ((TextView) viewInflate.findViewById(R$id.coui_statusText1)).setText(desc.intValue());
        }
        return this;
    }

    @NotNull
    public final ItemSettingListAutoShapeCard g(@NotNull Function1<? super COUISwitch, Unit> config) {
        Intrinsics.checkNotNullParameter(config, "config");
        getWidgetFrame().removeAllViews();
        config.invoke((COUISwitch) View.inflate(getContext(), R$layout.coui_preference_widget_switch, getWidgetFrame()).findViewById(R.id.switch_widget));
        return this;
    }

    public final boolean getEnable() {
        return this.enable;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        Unit unit = null;
        if (!(parent instanceof ViewGroup)) {
            parent = null;
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        if (viewGroup != null) {
            int iIndexOfChild = viewGroup.indexOfChild(this);
            boolean z = iIndexOfChild == viewGroup.getChildCount() - 1;
            boolean z2 = iIndexOfChild == 0;
            if (!z && !z2) {
                this.showDivider = true;
                this.selectedItemLayout.setPositionInGroup(2);
                postInvalidate();
            } else if (z2 && z) {
                this.showDivider = false;
                this.selectedItemLayout.setPositionInGroup(4);
                postInvalidate();
            } else if (z2) {
                this.showDivider = true;
                this.selectedItemLayout.setPositionInGroup(1);
                postInvalidate();
            } else if (z) {
                this.showDivider = false;
                this.selectedItemLayout.setPositionInGroup(3);
                postInvalidate();
            }
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            this.selectedItemLayout.setPositionInGroup(4);
        }
        setWillNotDraw(false);
        post(new Runnable() { // from class: com.oplus.aiunit.vision.cha
            @Override // java.lang.Runnable
            public final void run() {
                ItemSettingListAutoShapeCard.c(this.i);
            }
        });
    }

    @Override // android.view.View
    public void onDrawForeground(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDrawForeground(canvas);
        if (this.showDivider) {
            canvas.drawLine(this.dividerStart, getHeight(), this.dividerEnd, getHeight(), getPaint());
        }
    }

    public final void setEnable(boolean z) {
        this.enable = z;
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        d(this, this.enable);
        this.selectedItemLayout.setBackgroundAnimationEnabled(enabled);
    }

    @Override // android.view.View
    public void setOnClickListener(@Nullable View.OnClickListener l2) {
        this.selectedItemLayout.setOnClickListener(l2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ItemSettingListAutoShapeCard(@NotNull final Context context, @NotNull String title, @Nullable String str, boolean z, @Nullable Integer num, @Nullable String str2, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4) {
        Unit unit;
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(title, "title");
        this.enable = z;
        this.paint = LazyKt__LazyJVMKt.lazy(new Function0<Paint>() { // from class: com.heytap.sporthealth.blib.weiget.ItemSettingListAutoShapeCard$paint$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final Paint invoke() {
                Paint paint = new Paint();
                Context context2 = context;
                ItemSettingListAutoShapeCard itemSettingListAutoShapeCard = this;
                paint.setColor(lh2.a(context2, R$attr.couiColorDivider));
                paint.setStrokeWidth(itemSettingListAutoShapeCard.getResources().getDimensionPixelOffset(R$dimen.coui_list_divider_height));
                return paint;
            }
        });
        this.imIcon = LazyKt__LazyJVMKt.lazy(new Function0<COUIRoundImageView>() { // from class: com.heytap.sporthealth.blib.weiget.ItemSettingListAutoShapeCard$imIcon$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            public final COUIRoundImageView invoke() {
                return (COUIRoundImageView) this.this$0.findViewById(R.id.icon);
            }
        });
        this.tvTitle = LazyKt__LazyJVMKt.lazy(new Function0<TextView>() { // from class: com.heytap.sporthealth.blib.weiget.ItemSettingListAutoShapeCard$tvTitle$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            public final TextView invoke() {
                return (TextView) this.this$0.findViewById(R.id.title);
            }
        });
        this.tvSummary = LazyKt__LazyJVMKt.lazy(new Function0<TextView>() { // from class: com.heytap.sporthealth.blib.weiget.ItemSettingListAutoShapeCard$tvSummary$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            public final TextView invoke() {
                return (TextView) this.this$0.findViewById(R.id.summary);
            }
        });
        this.widgetFrame = LazyKt__LazyJVMKt.lazy(new Function0<LinearLayout>() { // from class: com.heytap.sporthealth.blib.weiget.ItemSettingListAutoShapeCard$widgetFrame$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            public final LinearLayout invoke() {
                return (LinearLayout) this.this$0.findViewById(R.id.widget_frame);
            }
        });
        this.tvAssignment = LazyKt__LazyJVMKt.lazy(new Function0<TextView>() { // from class: com.heytap.sporthealth.blib.weiget.ItemSettingListAutoShapeCard$tvAssignment$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            public final TextView invoke() {
                return (TextView) this.this$0.findViewById(R$id.assignment);
            }
        });
        this.hintRedDot = LazyKt__LazyJVMKt.lazy(new Function0<COUIHintRedDot>() { // from class: com.heytap.sporthealth.blib.weiget.ItemSettingListAutoShapeCard$hintRedDot$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            public final COUIHintRedDot invoke() {
                return (COUIHintRedDot) this.this$0.findViewById(R$id.jump_icon_red_dot);
            }
        });
        setForceDarkAllowed(false);
        View.inflate(context, com.heytap.health.ui.R$layout.lib_ui_health_big_padding_coui_preference, this);
        View childAt = getChildAt(0);
        Intrinsics.checkNotNull(childAt, "null cannot be cast to non-null type com.coui.appcompat.cardlist.COUICardListSelectedItemLayout");
        this.selectedItemLayout = (COUICardListSelectedItemLayout) childAt;
        getTvTitle().setText(title);
        if (num2 != null) {
            getTvTitle().setTextColor(num2.intValue());
        }
        boolean z2 = true;
        if (str == null || str.length() == 0) {
            getTvSummary().setVisibility(8);
        } else {
            getTvSummary().setText(str);
            getTvSummary().setVisibility(0);
            if (num3 != null) {
                getTvSummary().setTextColor(num3.intValue());
            }
        }
        if (str2 != null && str2.length() != 0) {
            z2 = false;
        }
        if (z2) {
            getTvAssignment().setVisibility(8);
        } else {
            getTvAssignment().setText(str2);
            getTvAssignment().setVisibility(0);
            if (num4 != null) {
                getTvAssignment().setTextColor(num4.intValue());
            }
        }
        if (num != null) {
            getImIcon().setImageResource(num.intValue());
            Object parent = getImIcon().getParent();
            View view = (View) (parent instanceof View ? parent : null);
            if (view != null) {
                view.setVisibility(0);
            }
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            ViewParent parent2 = getImIcon().getParent();
            View view2 = (View) (parent2 instanceof View ? parent2 : null);
            if (view2 != null) {
                view2.setVisibility(8);
            }
        }
        setEnabled(this.enable);
    }
}
