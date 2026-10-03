package com.oplus.web.container.engine.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.oplus.aiunit.vision.l2a;
import com.oplus.web.container.engine.WebEngineHelper;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class ContainerSdkWebView extends FrameLayout {
    public l2a i;

    public ContainerSdkWebView(Context context) {
        super(context);
        a(context, null);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        l2a l2aVarA = WebEngineHelper.a(context, WebEngineHelper.EngineType.SYSTEM, (LifecycleOwner) context);
        this.i = l2aVarA;
        addView(l2aVarA.getWebView());
    }

    public l2a getWebView() {
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
