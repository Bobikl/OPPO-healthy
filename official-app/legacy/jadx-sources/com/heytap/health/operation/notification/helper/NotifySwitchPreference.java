package com.heytap.health.operation.notification.helper;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.internal.StabilityInferred;
import com.coui.appcompat.preference.COUISwitchPreference;
import com.heytap.health.operation.R$string;
import com.support.preference.R$style;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/heytap/health/operation/notification/helper/NotifySwitchPreference;", "Lcom/coui/appcompat/preference/COUISwitchPreference;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "operation_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class NotifySwitchPreference extends COUISwitchPreference {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotifySwitchPreference(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, null, 0, R$style.Preference_COUI_SwitchPreference);
        Intrinsics.checkNotNullParameter(context, "context");
        setKey(context.getString(R$string.operation_notify_switch_preference_key));
        setPersistent(true);
        setDefaultValue(Boolean.TRUE);
        setTitle(R$string.sports_notify_show_btn);
    }

    public /* synthetic */ NotifySwitchPreference(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
