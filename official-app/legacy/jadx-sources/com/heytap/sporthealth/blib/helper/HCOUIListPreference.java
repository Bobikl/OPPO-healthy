package com.heytap.sporthealth.blib.helper;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.internal.StabilityInferred;
import com.coui.appcompat.preference.COUIListPreference;
import com.oplus.smartenginehelper.ParserTag;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0003\u001a\u00020\u0002H\u0014R*\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u0013"}, d2 = {"Lcom/heytap/sporthealth/blib/helper/HCOUIListPreference;", "Lcom/coui/appcompat/preference/COUIListPreference;", "", ParserTag.TAG_ONCLICK, "Lkotlin/Function0;", "", "v", "Lkotlin/jvm/functions/Function0;", "getInterceptClick", "()Lkotlin/jvm/functions/Function0;", "setInterceptClick", "(Lkotlin/jvm/functions/Function0;)V", "interceptClick", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "lib_ui_release"}, k = 1, mv = {1, 8, 0})
public final class HCOUIListPreference extends COUIListPreference {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @Nullable
    public Function0<Boolean> interceptClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HCOUIListPreference(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // androidx.preference.DialogPreference, androidx.preference.Preference
    public void onClick() {
        Function0<Boolean> function0 = this.interceptClick;
        boolean z = false;
        if (function0 != null && function0.invoke().booleanValue()) {
            z = true;
        }
        if (z) {
            return;
        }
        super.onClick();
    }
}
