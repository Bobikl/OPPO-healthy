package com.heytap.health.cervical_vertebra.weiget;

import android.content.Context;
import com.heytap.sporthealth.fit.weiget.JMediaController;
import com.oplus.aiunit.vision.jfk;
import com.oplus.aiunit.vision.rg7;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016¨\u0006\r"}, d2 = {"Lcom/heytap/health/cervical_vertebra/weiget/CervicalSpineMediaController;", "Lcom/heytap/sporthealth/fit/weiget/JMediaController;", "", "isShowing", "", "timeout", "", "c", "n", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "cervical_vertebra_release"}, k = 1, mv = {1, 8, 0})
public final class CervicalSpineMediaController extends JMediaController {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CervicalSpineMediaController(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.heytap.sporthealth.fit.weiget.JMediaController, com.oplus.aiunit.vision.jr9
    public void c(int timeout) {
        super.c(0);
    }

    @Override // com.heytap.sporthealth.fit.weiget.JMediaController, com.oplus.aiunit.vision.jr9
    public boolean isShowing() {
        return false;
    }

    @Override // com.heytap.sporthealth.fit.weiget.JMediaController
    public void n() {
        jfk.b(rg7.g(this));
    }
}
