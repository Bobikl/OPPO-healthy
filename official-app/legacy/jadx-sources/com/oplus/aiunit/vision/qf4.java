package com.oplus.aiunit.vision;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;
import com.heytap.nearx.tangramconfig.strategy.Fields;
import com.oplus.smartenginehelper.entity.TextEntity;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011J8\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016R\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/oplus/aiunit/vision/qf4;", "Landroid/text/style/LineHeightSpan;", "", "text", "", "start", TextEntity.ELLIPSIZE_END, "spanstartv", "lineHeight", "Landroid/graphics/Paint$FontMetricsInt;", "fm", "", "chooseHeight", "i", "I", Fields.HEIGHT_FIELD, "<init>", "(I)V", "health_archives_release"}, k = 1, mv = {1, 8, 0})
public final class qf4 implements LineHeightSpan {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public final int height;

    public qf4(int i) {
        this.height = i;
    }

    @Override // android.text.style.LineHeightSpan
    public void chooseHeight(@NotNull CharSequence text, int start, int end, int spanstartv, int lineHeight, @NotNull Paint.FontMetricsInt fm) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(fm, "fm");
        int i = fm.descent - fm.ascent;
        if (i <= 0) {
            return;
        }
        int iCeil = (int) Math.ceil(this.height);
        int iCeil2 = (int) Math.ceil(((double) fm.descent) * ((double) ((iCeil * 1.0f) / i)));
        fm.descent = iCeil2;
        fm.ascent = iCeil2 - iCeil;
    }
}
