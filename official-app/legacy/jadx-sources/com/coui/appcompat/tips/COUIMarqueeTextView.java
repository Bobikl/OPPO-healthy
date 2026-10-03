package com.coui.appcompat.tips;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.hardware.display.DisplayManager;
import android.text.StaticLayout;
import android.util.AttributeSet;
import android.view.Display;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.coui.appcompat.tips.COUIMarqueeTextView;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.bj2;
import com.oplus.aiunit.vision.vi2;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import com.support.tips.R$dimen;
import io.netty.util.internal.StringUtil;
import io.protostuff.MapSchema;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 ^2\u00020\u0001:\u0002_\"B)\b\u0007\u0012\b\u0010X\u001a\u0004\u0018\u00010W\u0012\n\b\u0002\u0010Z\u001a\u0004\u0018\u00010Y\u0012\b\b\u0002\u0010[\u001a\u00020\f¢\u0006\u0004\b\\\u0010]J\u001c\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010\t\u001a\u00020\bH\u0014J\b\u0010\n\u001a\u00020\bH\u0014J\b\u0010\u000b\u001a\u00020\u0006H\u0014J\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0014J\u0006\u0010\u0012\u001a\u00020\u0006J\u0006\u0010\u0013\u001a\u00020\u0006J\u0018\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\fH\u0014J\u0010\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J\u0012\u0010\u001c\u001a\u00020\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u0010\u001d\u001a\u00020\u0006H\u0002J\b\u0010\u001e\u001a\u00020\u0006H\u0002J\b\u0010 \u001a\u00020\u001fH\u0002J\b\u0010!\u001a\u00020\u0006H\u0002J\b\u0010\"\u001a\u00020\u0006H\u0002R\u0016\u0010$\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010#R\u0016\u0010&\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010#R\u0016\u0010)\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010,\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010.\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010+R\u0016\u00102\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00104\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010(R\u0016\u00106\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u0010#R\u0016\u00108\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u0010(R\u0018\u0010<\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u001c\u0010@\u001a\b\u0018\u00010=R\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010B\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010(R$\u0010G\u001a\u00020\b2\u0006\u0010C\u001a\u00020\b8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\bD\u0010+\"\u0004\bE\u0010FR*\u0010I\u001a\u00020/2\u0006\u0010C\u001a\u00020/8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bH\u00101\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR$\u0010O\u001a\u00020/2\u0006\u0010C\u001a\u00020/8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\bM\u00101\"\u0004\bN\u0010LR\u0016\u0010Q\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u00101R\u0016\u0010S\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u00101R\u0014\u0010V\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bT\u0010U¨\u0006`"}, d2 = {"Lcom/coui/appcompat/tips/COUIMarqueeTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "", "text", "Landroid/widget/TextView$BufferType;", "type", "", ClickApiEntity.SET_TEXT, "", "getLeftFadingEdgeStrength", "getRightFadingEdgeStrength", "onDetachedFromWindow", "", "color", ClickApiEntity.SET_TEXT_COLOR, "Landroid/graphics/Canvas;", "canvas", "onDraw", "c", "i", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "Landroid/view/accessibility/AccessibilityNodeInfo;", UTraceSQLiteHelperKt.COL_INFO, "onInitializeAccessibilityNodeInfo", "Landroid/view/accessibility/AccessibilityEvent;", "event", "onInitializeAccessibilityEvent", "f", b2n.f, "", MapSchema.FIELD_NAME_ENTRY, b2n.g, "b", "Ljava/lang/String;", "mOriginText", "j", "mFinalDrawText", MapSchema.FIELD_NAME_KEY, "I", "mInitStringWidth", LogFieldKey.LEVEL_KEY, UserInfo.SEX_FEMALE, "mScrollerSpeed", LogFieldKey.MESSAGE_KEY, "mCurrentScrollLocation", "", "n", "Z", "mContinueScrollingEnable", "o", "mScrollRepeatCount", LogFieldKey.PROCESS_NAME_KEY, "mIndividuallyAssembledText", "q", "mIndividuallyAssembledTextWidth", "Landroid/animation/ValueAnimator;", "r", "Landroid/animation/ValueAnimator;", "mScroller", "Lcom/coui/appcompat/tips/COUIMarqueeTextView$b;", "s", "Lcom/coui/appcompat/tips/COUIMarqueeTextView$b;", "mStartScrollRunnable", "t", "mTextViewScrollDistance", "value", "u", "setFadingEdgeStrength", "(F)V", "fadingEdgeStrength", "v", "isMarqueeEnable", "()Z", "setMarqueeEnable", "(Z)V", "w", "setActualMarqueeByMeasured", "isActualMarqueeByMeasured", "x", "isAllCharactersLtR", "y", "mSuppressAccessibilityEvents", "getMContentHeight", "()F", "mContentHeight", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Companion", "a", "coui-support-tips_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCOUIMarqueeTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 COUIMarqueeTextView.kt\ncom/coui/appcompat/tips/COUIMarqueeTextView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,402:1\n1#2:403\n*E\n"})
public final class COUIMarqueeTextView extends AppCompatTextView {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public String mOriginText;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public String mFinalDrawText;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public int mInitStringWidth;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public float mScrollerSpeed;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public float mCurrentScrollLocation;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public boolean mContinueScrollingEnable;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public int mScrollRepeatCount;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    public String mIndividuallyAssembledText;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public int mIndividuallyAssembledTextWidth;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @Nullable
    public ValueAnimator mScroller;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @Nullable
    public b mStartScrollRunnable;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public final int mTextViewScrollDistance;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    public float fadingEdgeStrength;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    public boolean isMarqueeEnable;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    public boolean isActualMarqueeByMeasured;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    public boolean isAllCharactersLtR;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    public boolean mSuppressAccessibilityEvents;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"Lcom/coui/appcompat/tips/COUIMarqueeTextView$b;", "Ljava/lang/Runnable;", "", "run", "<init>", "(Lcom/coui/appcompat/tips/COUIMarqueeTextView;)V", "coui-support-tips_release"}, k = 1, mv = {1, 8, 0})
    public final class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            COUIMarqueeTextView.this.c();
        }
    }

    @JvmOverloads
    public COUIMarqueeTextView(@Nullable Context context) {
        this(context, null, 0, 6, null);
    }

    public static final void d(COUIMarqueeTextView this$0, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.mCurrentScrollLocation -= this$0.mScrollerSpeed;
        this$0.invalidate();
    }

    private final float getMContentHeight() {
        return Math.abs(getPaint().getFontMetrics().bottom - getPaint().getFontMetrics().top) / 2;
    }

    private final void setActualMarqueeByMeasured(boolean z) {
        setFadingEdgeStrength((z && this.isMarqueeEnable) ? 1.0f : 0.0f);
        this.isActualMarqueeByMeasured = z;
    }

    private final void setFadingEdgeStrength(float f) {
        this.fadingEdgeStrength = Math.signum(f);
    }

    public final void b() {
        String str = this.mOriginText;
        StaticLayout staticLayoutBuild = StaticLayout.Builder.obtain(str, 0, str.length(), getPaint(), getWidth()).build();
        Intrinsics.checkNotNullExpressionValue(staticLayoutBuild, "if (Build.VERSION.SDK_IN… 1f, 0f, false)\n        }");
        this.isAllCharactersLtR = true;
        int length = this.mOriginText.length();
        for (int i = 0; i < length; i++) {
            if (staticLayoutBuild.isRtlCharAt(i)) {
                this.isAllCharactersLtR = false;
                return;
            }
        }
    }

    public final void c() {
        setMarqueeEnable(true);
        if (getPaint().measureText(getText().toString()) <= getMeasuredWidth() || this.mContinueScrollingEnable) {
            return;
        }
        ValueAnimator valueAnimator = this.mScroller;
        if (valueAnimator != null) {
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.mScroller = null;
        }
        this.mContinueScrollingEnable = true;
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(Integer.MAX_VALUE);
        this.mScroller = valueAnimatorOfInt;
        if (valueAnimatorOfInt != null) {
            valueAnimatorOfInt.setDuration(2147483647L);
            valueAnimatorOfInt.setInterpolator(new vi2());
            valueAnimatorOfInt.setRepeatCount(-1);
            valueAnimatorOfInt.setRepeatMode(1);
            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.oplus.aiunit.vision.dj2
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    COUIMarqueeTextView.d(this.i, valueAnimator2);
                }
            });
            valueAnimatorOfInt.start();
        }
    }

    public final String e() {
        int iCeil = (int) Math.ceil(this.mTextViewScrollDistance / getPaint().measureText(" "));
        String str = this.mTextViewScrollDistance != 0 ? "" : " ";
        if (iCeil >= 0) {
            int i = 0;
            while (true) {
                str = str + StringUtil.SPACE;
                if (i == iCeil) {
                    break;
                }
                i++;
            }
        }
        return str;
    }

    public final void f() {
        Display display = ((DisplayManager) getContext().getSystemService(DisplayManager.class)).getDisplay(0);
        getResources().getDisplayMetrics();
        this.mScrollerSpeed = getResources().getDimensionPixelOffset(R$dimen.coui_top_tips_scroll_speed) / display.getRefreshRate();
        this.mStartScrollRunnable = new b();
    }

    public final void g() {
        setHorizontalFadingEdgeEnabled(true);
        setFadingEdgeLength(getResources().getDimensionPixelSize(R$dimen.coui_top_tips_fading_edge_size));
        this.mCurrentScrollLocation = getResources().getDimensionPixelOffset(R$dimen.coui_top_tips_scroll_text_start_location);
        getPaint().setColor(getCurrentTextColor());
        setImportantForAccessibility(1);
    }

    @Override // android.widget.TextView, android.view.View
    public float getLeftFadingEdgeStrength() {
        return this.fadingEdgeStrength;
    }

    @Override // android.widget.TextView, android.view.View
    public float getRightFadingEdgeStrength() {
        return this.fadingEdgeStrength;
    }

    public final void h() {
        this.mIndividuallyAssembledText = this.mOriginText;
        this.mIndividuallyAssembledText += e();
        int i = 0;
        this.mScrollRepeatCount = 0;
        this.mIndividuallyAssembledTextWidth = (int) getPaint().measureText(this.mIndividuallyAssembledText);
        int iCeil = (int) Math.ceil(((double) (getMeasuredWidth() / this.mIndividuallyAssembledTextWidth)) + 1.0d);
        this.mFinalDrawText = this.mIndividuallyAssembledText;
        if (iCeil >= 0) {
            while (true) {
                this.mFinalDrawText += this.mIndividuallyAssembledText;
                if (i == iCeil) {
                    break;
                } else {
                    i++;
                }
            }
        }
        this.mInitStringWidth = (int) getPaint().measureText(this.mFinalDrawText);
        b();
        super.setText(this.mFinalDrawText, TextView.BufferType.NORMAL);
    }

    public final void i() {
        this.mContinueScrollingEnable = false;
        this.mCurrentScrollLocation = getResources().getDimensionPixelOffset(R$dimen.coui_top_tips_scroll_text_start_location);
        ValueAnimator valueAnimator = this.mScroller;
        if (valueAnimator != null && valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.mScroller = null;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.isMarqueeEnable) {
            i();
            removeCallbacks(this.mStartScrollRunnable);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (!this.isMarqueeEnable || !this.isActualMarqueeByMeasured) {
            bj2.a("MarqueeView", "onDraw: isMarqueeEnable=" + this.isMarqueeEnable + ", isActualMarqueeByMeasured=" + this.isActualMarqueeByMeasured);
            super.onDraw(canvas);
            return;
        }
        float f = this.mCurrentScrollLocation;
        if (f < 0.0f) {
            int iAbs = (int) Math.abs(f / this.mIndividuallyAssembledTextWidth);
            int i = this.mScrollRepeatCount;
            if (iAbs >= i) {
                this.mScrollRepeatCount = i + 1;
                if (this.mCurrentScrollLocation <= (-this.mInitStringWidth)) {
                    String strSubstring = this.mFinalDrawText.substring(this.mIndividuallyAssembledText.length());
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
                    this.mFinalDrawText = strSubstring;
                    this.mCurrentScrollLocation += this.mIndividuallyAssembledTextWidth;
                    this.mScrollRepeatCount--;
                }
                String str = this.mFinalDrawText + this.mIndividuallyAssembledText;
                this.mFinalDrawText = str;
                this.mSuppressAccessibilityEvents = true;
                super.setText(str, TextView.BufferType.NORMAL);
            }
        }
        if (getLayout() == null) {
            super.onDraw(canvas);
        }
        canvas.save();
        float f2 = this.mCurrentScrollLocation;
        if (!this.isAllCharactersLtR) {
            f2 = -f2;
        }
        canvas.translate(f2, 0.0f);
        getLayout().draw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(@Nullable AccessibilityEvent event) {
        List<CharSequence> text;
        if (!this.mSuppressAccessibilityEvents) {
            super.onInitializeAccessibilityEvent(event);
            return;
        }
        if (event != null && (text = event.getText()) != null) {
            text.clear();
        }
        if (event != null) {
            event.setContentDescription(null);
        }
        this.mSuppressAccessibilityEvents = false;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@NotNull AccessibilityNodeInfo info) {
        Intrinsics.checkNotNullParameter(info, "info");
        super.onInitializeAccessibilityNodeInfo(info);
        info.setText(this.mOriginText);
        info.setContentDescription(this.mOriginText);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        if (getPaint().measureText(getText().toString()) <= getMeasuredWidth()) {
            setActualMarqueeByMeasured(false);
            return;
        }
        setActualMarqueeByMeasured(true);
        if (this.isMarqueeEnable) {
            h();
        }
    }

    public final void setMarqueeEnable(boolean z) {
        float f;
        if (z) {
            setSingleLine(true);
            setMaxLines(1);
            f = 1.0f;
        } else {
            setSingleLine(false);
            setMaxLines(Integer.MAX_VALUE);
            f = 0.0f;
        }
        setFadingEdgeStrength(f);
        this.isMarqueeEnable = z;
    }

    @Override // android.widget.TextView
    public void setText(@Nullable CharSequence text, @Nullable TextView.BufferType type) {
        this.mOriginText = String.valueOf(text);
        super.setText(text, type);
    }

    @Override // android.widget.TextView
    public void setTextColor(int color) {
        super.setTextColor(color);
        getPaint().setColor(getCurrentTextColor());
    }

    @JvmOverloads
    public COUIMarqueeTextView(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public COUIMarqueeTextView(@Nullable Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNull(context);
        this.mOriginText = "";
        this.mFinalDrawText = "";
        this.mScrollerSpeed = getResources().getDimensionPixelOffset(R$dimen.coui_top_tips_scroll_speed);
        this.mCurrentScrollLocation = getResources().getDimensionPixelOffset(R$dimen.coui_top_tips_scroll_text_start_location);
        this.mIndividuallyAssembledText = "";
        this.mTextViewScrollDistance = getResources().getDimensionPixelOffset(R$dimen.coui_top_tips_scroll_text_interval);
        this.isAllCharactersLtR = true;
        f();
        g();
        if (this.isMarqueeEnable) {
            postDelayed(this.mStartScrollRunnable, 1000L);
        }
    }

    public /* synthetic */ COUIMarqueeTextView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
