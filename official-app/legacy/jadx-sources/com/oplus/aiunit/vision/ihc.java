package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.res.ColorStateList;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.heytap.nearx.uikit.R$color;
import com.oplus.smartenginehelper.ParserTag;
import com.sensorsdata.analytics.android.autotrack.aop.SensorsDataAutoTrackHelper;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tJ\u0010\u0010\u000e\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\fR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0014\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0019"}, d2 = {"Lcom/oplus/aiunit/vision/ihc;", "Landroid/text/style/ClickableSpan;", "Landroid/view/View;", "widget", "", ParserTag.TAG_ONCLICK, "Landroid/text/TextPaint;", "ds", "updateDrawState", "Lcom/oplus/aiunit/vision/ihc$a;", "listener", "b", "Landroid/content/res/ColorStateList;", "color", "a", "i", "Lcom/oplus/aiunit/vision/ihc$a;", "mClickReference", "j", "Landroid/content/res/ColorStateList;", "mTextColor", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "nearx_release"}, k = 1, mv = {1, 6, 0})
public class ihc extends ClickableSpan {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public a mClickReference;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public ColorStateList mTextColor;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0004"}, d2 = {"Lcom/oplus/aiunit/vision/ihc$a;", "", "", ParserTag.TAG_ONCLICK, "nearx_release"}, k = 1, mv = {1, 6, 0})
    public interface a {
        void onClick();
    }

    public ihc(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        ColorStateList colorStateList = context.getResources().getColorStateList(R$color.nx_color_clickable_text_color);
        Intrinsics.checkNotNullExpressionValue(colorStateList, "context.resources.getCol…lor_clickable_text_color)");
        this.mTextColor = colorStateList;
    }

    public final void a(@Nullable ColorStateList color) {
        if (color != null) {
            this.mTextColor = color;
        }
    }

    public final void b(@NotNull a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.mClickReference = listener;
    }

    @Override // android.text.style.ClickableSpan
    @SensorsDataInstrumented
    public void onClick(@NotNull View widget) {
        Intrinsics.checkNotNullParameter(widget, "widget");
        a aVar = this.mClickReference;
        if (aVar != null) {
            aVar.onClick();
        }
        SensorsDataAutoTrackHelper.trackViewOnClick(widget);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(@NotNull TextPaint ds) {
        Intrinsics.checkNotNullParameter(ds, "ds");
        ds.setColor(this.mTextColor.getColorForState(ds.drawableState, 0));
    }
}
