package com.heytap.nearx.uikit.widget.edittext;

import android.content.Context;
import android.util.AttributeSet;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import com.oplus.smartenginehelper.entity.ViewEntity;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J \u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0003H&J\b\u0010\r\u001a\u00020\u0007H&J\u0010\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0010H&J\b\u0010\u0011\u001a\u00020\u0007H&J\u0010\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0010H&J\b\u0010\u0014\u001a\u00020\u0007H&J\u0010\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0003H&¨\u0006\u0017"}, d2 = {"Lcom/heytap/nearx/uikit/widget/edittext/NearEditTextDelegate;", "", "getDefaultFocusedStrokeColor", "", "context", "Landroid/content/Context;", "otherInit", "", "editText", "Lcom/heytap/nearx/uikit/widget/edittext/NearEditText;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "resetErrorStatus", "resetUI", "enable", "", "setCursorDrawableRes", ClickApiEntity.SET_ENABLED, ViewEntity.ENABLED, "setErrorStatus", "setFocusedStrokeColor", "color", "nearx_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface NearEditTextDelegate {
    int getDefaultFocusedStrokeColor(@NotNull Context context);

    void otherInit(@NotNull NearEditText editText, @NotNull AttributeSet attrs, int defStyleAttr);

    void resetErrorStatus();

    void resetUI(boolean enable);

    void setCursorDrawableRes();

    void setEnabled(boolean enabled);

    void setErrorStatus();

    void setFocusedStrokeColor(int color);
}
