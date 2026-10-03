package com.heytap.sporthealth.blib.helper;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import com.coui.appcompat.preference.COUIPreferenceCategory;
import com.heytap.log.formatter.LogFieldKey;
import com.support.preference.R$layout;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b¨\u0006\u0011"}, d2 = {"Lcom/heytap/sporthealth/blib/helper/HCOUIPreferenceCategory;", "Lcom/coui/appcompat/preference/COUIPreferenceCategory;", "", "widgetLayoutRes", "", LogFieldKey.MESSAGE_KEY, "", "title", "Landroid/view/View$OnClickListener;", "click", "n", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "lib_ui_release"}, k = 1, mv = {1, 8, 0})
public final class HCOUIPreferenceCategory extends COUIPreferenceCategory {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HCOUIPreferenceCategory(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.coui.appcompat.preference.COUIPreferenceCategory
    public void m(int widgetLayoutRes) {
        super.m(widgetLayoutRes);
    }

    public final void n(@NotNull String title, @Nullable View.OnClickListener click) {
        Intrinsics.checkNotNullParameter(title, "title");
        m(R$layout.coui_preference_category_widget_layout_textbutton);
        setWidgetLayoutClickListener(click);
        l(title);
    }
}
