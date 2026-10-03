package com.heytap.nearx.uikit.widget.statement;

import android.text.Selection;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.widget.TextView;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, d2 = {"Lcom/heytap/nearx/uikit/widget/statement/NearLinkMovementMethod;", "Landroid/text/method/LinkMovementMethod;", "()V", "onTouchEvent", "", "widget", "Landroid/widget/TextView;", "buffer", "Landroid/text/Spannable;", "event", "Landroid/view/MotionEvent;", "nearx_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class NearLinkMovementMethod extends LinkMovementMethod {

    @NotNull
    public static final NearLinkMovementMethod INSTANCE = new NearLinkMovementMethod();

    private NearLinkMovementMethod() {
    }

    @Override // android.text.method.LinkMovementMethod, android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public boolean onTouchEvent(@NotNull TextView widget, @NotNull Spannable buffer, @NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(widget, "widget");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getAction() == 1) {
            int x = (int) event.getX();
            int y = (int) event.getY();
            int totalPaddingLeft = x - widget.getTotalPaddingLeft();
            int totalPaddingTop = y - widget.getTotalPaddingTop();
            int scrollX = totalPaddingLeft + widget.getScrollX();
            int scrollY = totalPaddingTop + widget.getScrollY();
            int offsetForHorizontal = widget.getLayout().getOffsetForHorizontal(widget.getLayout().getLineForVertical(scrollY), scrollX);
            ClickableSpan[] links = (ClickableSpan[]) buffer.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
            Intrinsics.checkNotNullExpressionValue(links, "links");
            if (!(links.length == 0)) {
                ClickableSpan clickableSpan = links[0];
                int spanStart = buffer.getSpanStart(clickableSpan);
                int spanEnd = buffer.getSpanEnd(clickableSpan);
                if (offsetForHorizontal < spanStart || offsetForHorizontal > spanEnd || scrollY > widget.getMeasuredHeight()) {
                    Selection.removeSelection(buffer);
                } else {
                    clickableSpan.onClick(widget);
                }
                return true;
            }
            Selection.removeSelection(buffer);
        }
        return super.onTouchEvent(widget, buffer, event);
    }
}
