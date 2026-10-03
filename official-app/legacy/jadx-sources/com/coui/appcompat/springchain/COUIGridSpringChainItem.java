package com.coui.appcompat.springchain;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.heytap.log.formatter.LogFieldKey;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0013\b\u0016\u0012\b\u0010&\u001a\u0004\u0018\u00010%¢\u0006\u0004\b'\u0010(B\u001d\b\u0016\u0012\b\u0010&\u001a\u0004\u0018\u00010%\u0012\b\u0010*\u001a\u0004\u0018\u00010)¢\u0006\u0004\b'\u0010+B%\b\u0016\u0012\b\u0010&\u001a\u0004\u0018\u00010%\u0012\b\u0010*\u001a\u0004\u0018\u00010)\u0012\u0006\u0010,\u001a\u00020\u0007¢\u0006\u0004\b'\u0010-J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R\"\u0010\u000e\u001a\u00020\u00078\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u0012\u001a\u00020\u00078\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\t\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR\"\u0010\u0016\u001a\u00020\u00078\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\t\u001a\u0004\b\u0014\u0010\u000b\"\u0004\b\u0015\u0010\rR\"\u0010\u001a\u001a\u00020\u00078\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\t\u001a\u0004\b\u0018\u0010\u000b\"\u0004\b\u0019\u0010\rR\"\u0010\"\u001a\u00020\u001b8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0016\u0010\u0004\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006."}, d2 = {"Lcom/coui/appcompat/springchain/COUIGridSpringChainItem;", "Landroid/widget/FrameLayout;", "", "Landroid/view/View;", "proxyView", "", "setProxyView", "", "i", "I", "getItemX", "()I", "setItemX", "(I)V", "itemX", "j", "getItemY", "setItemY", "itemY", MapSchema.FIELD_NAME_KEY, "getItemWidth", "setItemWidth", "itemWidth", LogFieldKey.LEVEL_KEY, "getItemHeight", "setItemHeight", "itemHeight", "", LogFieldKey.MESSAGE_KEY, "Z", "getSkipSpringChainCalc", "()Z", "setSkipSpringChainCalc", "(Z)V", "skipSpringChainCalc", "n", "Landroid/view/View;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "coui-support-springchain_release"}, k = 1, mv = {1, 8, 0})
public class COUIGridSpringChainItem extends FrameLayout {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public int itemX;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public int itemY;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public int itemWidth;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public int itemHeight;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public boolean skipSpringChainCalc;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public View proxyView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public COUIGridSpringChainItem(@Nullable Context context) {
        super(context);
        Intrinsics.checkNotNull(context);
        this.itemWidth = 1;
        this.itemHeight = 1;
        this.proxyView = this;
    }

    public int getItemHeight() {
        return this.itemHeight;
    }

    public int getItemWidth() {
        return this.itemWidth;
    }

    public int getItemX() {
        return this.itemX;
    }

    public int getItemY() {
        return this.itemY;
    }

    public boolean getSkipSpringChainCalc() {
        return this.skipSpringChainCalc;
    }

    public void setItemHeight(int i) {
        this.itemHeight = i;
    }

    public void setItemWidth(int i) {
        this.itemWidth = i;
    }

    public void setItemX(int i) {
        this.itemX = i;
    }

    public void setItemY(int i) {
        this.itemY = i;
    }

    public void setProxyView(@NotNull View proxyView) {
        Intrinsics.checkNotNullParameter(proxyView, "proxyView");
        this.proxyView = proxyView;
    }

    public void setSkipSpringChainCalc(boolean z) {
        this.skipSpringChainCalc = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public COUIGridSpringChainItem(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNull(context);
        this.itemWidth = 1;
        this.itemHeight = 1;
        this.proxyView = this;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public COUIGridSpringChainItem(@Nullable Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNull(context);
        this.itemWidth = 1;
        this.itemHeight = 1;
        this.proxyView = this;
    }
}
