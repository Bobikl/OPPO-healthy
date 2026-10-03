package com.oppo.store.web.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.webkit.WebView;
import com.heytap.log.formatter.LogFieldKey;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\n\b\u0016\u0018\u0000 \u001a2\u00020\u0001:\u0002\u001a\u001bB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J(\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\tH\u0014J\u0010\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\tH\u0016R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/oppo/store/web/widget/CrashCatchWebView;", "Landroid/webkit/WebView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "onScrollChangedCallback", "Lcom/oppo/store/web/widget/CrashCatchWebView$OnScrollChangedCallback;", "getOnScrollChangedCallback", "()Lcom/oppo/store/web/widget/CrashCatchWebView$OnScrollChangedCallback;", "setOnScrollChangedCallback", "(Lcom/oppo/store/web/widget/CrashCatchWebView$OnScrollChangedCallback;)V", "init", "", "onScrollChanged", LogFieldKey.LEVEL_KEY, "t", "oldl", "oldt", "setOverScrollMode", "mode", "Companion", "OnScrollChangedCallback", "webbrowser-impl_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public class CrashCatchWebView extends WebView {

    @NotNull
    public static final String URL_BLANK = "about:blank";

    @Nullable
    private OnScrollChangedCallback onScrollChangedCallback;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/oppo/store/web/widget/CrashCatchWebView$OnScrollChangedCallback;", "", "onScroll", "", "dx", "", "dy", "webbrowser-impl_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public interface OnScrollChangedCallback {
        void onScroll(int dx, int dy);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CrashCatchWebView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        init(context);
    }

    private final void init(Context context) {
    }

    @Nullable
    public final OnScrollChangedCallback getOnScrollChangedCallback() {
        return this.onScrollChangedCallback;
    }

    @Override // android.webkit.WebView, android.view.View
    public void onScrollChanged(int l2, int t, int oldl, int oldt) {
        super.onScrollChanged(l2, t, oldl, oldt);
    }

    public final void setOnScrollChangedCallback(@Nullable OnScrollChangedCallback onScrollChangedCallback) {
        this.onScrollChangedCallback = onScrollChangedCallback;
    }

    @Override // android.webkit.WebView, android.view.View
    public void setOverScrollMode(int mode) {
        try {
            super.setOverScrollMode(mode);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CrashCatchWebView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        init(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CrashCatchWebView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        init(context);
    }
}
