package com.oplus.web.container.engine.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.oplus.aiunit.vision.e1a;
import com.oplus.web.container.engine.WebEngineHelper;

/* JADX INFO: loaded from: classes2.dex */
public class ContainerSdkWebView extends FrameLayout {
    public e1a i;

    public ContainerSdkWebView(Context context) {
        super(context);
        a(context, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(Context context, AttributeSet attributeSet) {
        e1a e1aVarA = WebEngineHelper.a(context, WebEngineHelper.EngineType.SYSTEM, (LifecycleOwner) context);
        this.i = e1aVarA;
        addView(e1aVarA.getWebView());
    }

    public e1a getWebView() {
        return this.i;
    }

    public ContainerSdkWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet);
    }

    public ContainerSdkWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context, attributeSet);
    }
}
