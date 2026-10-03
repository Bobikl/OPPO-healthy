package io.noties.markwon.core.spans;

import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import androidx.annotation.NonNull;
import com.oplus.aiunit.vision.pgb;
import com.oplus.aiunit.vision.pxa;
import com.sensorsdata.analytics.android.autotrack.aop.SensorsDataAutoTrackHelper;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;

/* JADX INFO: loaded from: classes10.dex */
public class LinkSpan extends URLSpan {
    private final String link;
    private final pxa resolver;
    private final pgb theme;

    public LinkSpan(@NonNull pgb pgbVar, @NonNull String str, @NonNull pxa pxaVar) {
        super(str);
        this.theme = pgbVar;
        this.link = str;
        this.resolver = pxaVar;
    }

    @NonNull
    public String getLink() {
        return this.link;
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    @SensorsDataInstrumented
    public void onClick(View view) {
        this.resolver.a(view, this.link);
        SensorsDataAutoTrackHelper.trackViewOnClick(view);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(@NonNull TextPaint textPaint) {
        this.theme.g(textPaint);
    }
}
