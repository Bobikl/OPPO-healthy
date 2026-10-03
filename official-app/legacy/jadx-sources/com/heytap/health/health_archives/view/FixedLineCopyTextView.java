package com.heytap.health.health_archives.view;

import android.content.Context;
import android.text.Editable;
import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.heytap.health.health_archives.view.FixedLineCopyTextView;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.y04;
import com.oplus.smartenginehelper.ParserTag;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.ranges.RangesKt___RangesKt;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010/\u001a\u00020.\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u000100\u0012\b\b\u0002\u00102\u001a\u00020\u0004¢\u0006\u0004\b3\u00104J0\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0014J\u000e\u0010\f\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002J\u000e\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0004J\u0006\u0010\u000f\u001a\u00020\u0002J\u0006\u0010\u0010\u001a\u00020\u0004J\u0018\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004H\u0014J\u0010\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J\b\u0010\u0017\u001a\u00020\u0002H\u0016J\u0018\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0004H\u0016J\b\u0010\u001b\u001a\u00020\tH\u0002J\b\u0010\u001c\u001a\u00020\tH\u0002J\b\u0010\u001d\u001a\u00020\tH\u0002R\u0016\u0010 \u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010#\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010%\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010\"R\u0016\u0010'\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010\u001fR\u0016\u0010)\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010\"R\u0016\u0010+\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010\u001fR\u0016\u0010-\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010\"¨\u00065"}, d2 = {"Lcom/heytap/health/health_archives/view/FixedLineCopyTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "", "changed", "", y04.TIME_STYLE_LEFT_DIR_NAME, "top", y04.TIME_STYLE_RIGHT_DIR_NAME, "bottom", "", "onLayout", "expanded", "setExpanded", "lines", "setCollapsedMaxLines", "f", "getCollapsedMaxLines", "selStart", "selEnd", "onSelectionChanged", "Landroid/view/MotionEvent;", "event", "onTouchEvent", "performClick", "x", "y", "scrollTo", "d", "c", MapSchema.FIELD_NAME_ENTRY, "i", "Z", "isSelectingText", "j", "I", "visibleTextStart", MapSchema.FIELD_NAME_KEY, "visibleTextEnd", LogFieldKey.LEVEL_KEY, "isExpanded", LogFieldKey.MESSAGE_KEY, "collapsedMaxLines", "n", "shouldIgnoreScroll", "o", "preSelectionScrollY", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "health_archives_release"}, k = 1, mv = {1, 8, 0})
public final class FixedLineCopyTextView extends AppCompatTextView {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public boolean isSelectingText;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public int visibleTextStart;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public int visibleTextEnd;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public boolean isExpanded;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public int collapsedMaxLines;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public boolean shouldIgnoreScroll;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public int preSelectionScrollY;

    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J*\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016J*\u0010\u000b\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J\u0012\u0010\r\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\fH\u0016¨\u0006\u000e"}, d2 = {"com/heytap/health/health_archives/view/FixedLineCopyTextView$a", "Landroid/text/TextWatcher;", "", "s", "", "start", "count", ParserTag.TAG_AFTER, "", "beforeTextChanged", "before", "onTextChanged", "Landroid/text/Editable;", "afterTextChanged", "health_archives_release"}, k = 1, mv = {1, 8, 0})
    public static final class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@Nullable Editable s) {
            FixedLineCopyTextView.this.e();
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(@Nullable CharSequence s, int start, int count, int after) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(@Nullable CharSequence s, int start, int before, int count) {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FixedLineCopyTextView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static final void g(FixedLineCopyTextView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.isExpanded) {
            return;
        }
        this$0.scrollTo(this$0.getScrollX(), this$0.preSelectionScrollY);
    }

    public final void c() {
        Layout layout = getLayout();
        if (layout == null) {
            return;
        }
        int lineCount = layout.getLineCount();
        if (lineCount <= 0) {
            this.visibleTextStart = 0;
            this.visibleTextEnd = 0;
            return;
        }
        this.visibleTextStart = layout.getLineStart(0);
        int iMin = this.isExpanded ? lineCount - 1 : Math.min(this.collapsedMaxLines - 1, lineCount - 1);
        if (iMin >= 0 && iMin < lineCount) {
            CharSequence text = getText();
            this.visibleTextEnd = RangesKt___RangesKt.coerceAtLeast(Math.min(layout.getLineEnd(iMin), text != null ? text.length() : 0), this.visibleTextStart);
        } else {
            this.visibleTextStart = 0;
            this.visibleTextEnd = 0;
        }
    }

    public final void d() {
        CharSequence text = getText();
        Editable editable = text instanceof Editable ? (Editable) text : null;
        if (editable == null) {
            return;
        }
        Selection.setSelection(editable, 0);
        this.isSelectingText = false;
    }

    public final void e() {
        CharSequence text = getText();
        if (text instanceof Spannable) {
            return;
        }
        setText(text, TextView.BufferType.SPANNABLE);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getIsExpanded() {
        return this.isExpanded;
    }

    public final int getCollapsedMaxLines() {
        return this.collapsedMaxLines;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        c();
    }

    @Override // android.widget.TextView
    public void onSelectionChanged(int selStart, int selEnd) {
        if (getLayout() == null) {
            super.onSelectionChanged(selStart, selEnd);
            return;
        }
        CharSequence text = getText();
        Spannable spannableValueOf = text instanceof Editable ? (Editable) text : null;
        if (spannableValueOf == null) {
            spannableValueOf = SpannableString.valueOf(getText());
            setText(spannableValueOf, TextView.BufferType.SPANNABLE);
        }
        if ((this.isSelectingText || selStart == selEnd) ? false : true) {
            this.preSelectionScrollY = getScrollY();
        }
        if (selStart == selEnd) {
            this.isSelectingText = false;
            this.shouldIgnoreScroll = false;
            post(new Runnable() { // from class: com.oplus.aiunit.vision.xq7
                @Override // java.lang.Runnable
                public final void run() {
                    FixedLineCopyTextView.g(this.i);
                }
            });
            super.onSelectionChanged(selStart, selEnd);
            return;
        }
        int iCoerceIn = RangesKt___RangesKt.coerceIn(selStart, this.visibleTextStart, this.visibleTextEnd);
        int iCoerceIn2 = RangesKt___RangesKt.coerceIn(selEnd, this.visibleTextStart, this.visibleTextEnd);
        if (iCoerceIn == selStart && iCoerceIn2 == selEnd) {
            this.isSelectingText = iCoerceIn != iCoerceIn2;
            super.onSelectionChanged(iCoerceIn, iCoerceIn2);
        } else {
            this.isSelectingText = true;
            this.shouldIgnoreScroll = true;
            Selection.setSelection(spannableValueOf, iCoerceIn, iCoerceIn2);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(@NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (this.isSelectingText && event.getAction() == 2) {
            return true;
        }
        if (event.getAction() == 1 || event.getAction() == 3) {
            this.isSelectingText = false;
        }
        return super.onTouchEvent(event);
    }

    @Override // android.view.View
    public boolean performClick() {
        return super.performClick();
    }

    @Override // android.view.View
    public void scrollTo(int x, int y) {
        if (!this.isSelectingText && !this.shouldIgnoreScroll) {
            super.scrollTo(x, y);
        } else if (this.shouldIgnoreScroll) {
            this.shouldIgnoreScroll = false;
        }
    }

    public final void setCollapsedMaxLines(int lines) {
        this.collapsedMaxLines = lines;
        if (this.isExpanded) {
            return;
        }
        setMaxLines(lines);
        c();
    }

    public final void setExpanded(boolean expanded) {
        if (this.isExpanded == expanded) {
            return;
        }
        this.isExpanded = expanded;
        setMaxLines(expanded ? Integer.MAX_VALUE : this.collapsedMaxLines);
        if (!expanded) {
            d();
        }
        requestLayout();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FixedLineCopyTextView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ FixedLineCopyTextView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FixedLineCopyTextView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.collapsedMaxLines = 4;
        setTextIsSelectable(true);
        setMaxLines(this.collapsedMaxLines);
        addTextChangedListener(new a());
    }
}
