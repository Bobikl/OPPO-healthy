package com.coui.component.responsiveui;

import androidx.lifecycle.MutableLiveData;
import com.coui.component.responsiveui.status.WindowFeature;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&¨\u0006\u0005"}, d2 = {"Lcom/coui/component/responsiveui/IResponsiveUIFeature;", "", "getWindowFeatureLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/coui/component/responsiveui/status/WindowFeature;", "coui-support-responsiveui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface IResponsiveUIFeature {
    @NotNull
    MutableLiveData<WindowFeature> getWindowFeatureLiveData();
}
