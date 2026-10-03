package com.heytap.health.menstrual_period.card;

import android.graphics.drawable.Drawable;
import com.heytap.health.base.R$drawable;
import com.oplus.aiunit.vision.qtf;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/graphics/drawable/Drawable;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class BaseCard$arrowDrawable$2 extends Lambda implements Function0<Drawable> {
    public static final BaseCard$arrowDrawable$2 INSTANCE = new BaseCard$arrowDrawable$2();

    public BaseCard$arrowDrawable$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p010kotlin.jvm.functions.Function0
    @Nullable
    public final Drawable invoke() {
        return qtf.h(R$drawable.lib_base_right_arrow);
    }
}
