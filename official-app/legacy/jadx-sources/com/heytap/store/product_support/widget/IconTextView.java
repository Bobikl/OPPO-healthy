package com.heytap.store.product_support.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f¨\u0006\u000f"}, d2 = {"Lcom/heytap/store/product_support/widget/IconTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "setRichTextWithUrl", "", "url", "", "text", "Companion", "product-support_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class IconTextView extends AppCompatTextView {

    @NotNull
    public static final String ICON_PLACE_HOLDER = "[icon]";

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public IconTextView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void setRichTextWithUrl(@NotNull String url, @NotNull final String text) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(text, "text");
        setText(text);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "this.context");
        new UrlImageGetter(context).getDrawable(url, new UrlImageGetter.OnDrawableLoadListener() { // from class: com.heytap.store.product_support.widget.IconTextView.setRichTextWithUrl.1
            @Override // com.heytap.store.product_support.widget.UrlImageGetter.OnDrawableLoadListener
            public void onReady(@NotNull Drawable resource) {
                Intrinsics.checkNotNullParameter(resource, "resource");
                SpannableString spannableString = new SpannableString(Intrinsics.stringPlus(IconTextView.ICON_PLACE_HOLDER, text));
                UrlDrawableWrapper urlDrawableWrapper = new UrlDrawableWrapper();
                urlDrawableWrapper.setDrawable(resource, this.getTextSize());
                spannableString.setSpan(new VerticalCenterImageSpan(urlDrawableWrapper), 0, 6, 33);
                this.setText(spannableString);
            }
        });
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public IconTextView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ IconTextView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public IconTextView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
