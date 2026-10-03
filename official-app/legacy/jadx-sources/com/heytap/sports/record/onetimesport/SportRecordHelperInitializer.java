package com.heytap.sports.record.onetimesport;

import android.app.Application;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.oplus.aiunit.vision.a8a;
import com.oplus.aiunit.vision.wei;
import com.oplus.aiunit.vision.xei;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\r"}, d2 = {"Lcom/heytap/sports/record/onetimesport/SportRecordHelperInitializer;", "Lcom/oplus/aiunit/vision/a8a;", "", "configProcess", "", "init", "Landroid/app/Application;", "application", "attachContext", "<init>", "()V", "Companion", "a", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
public final class SportRecordHelperInitializer extends a8a {
    public static final int $stable = 0;

    @NotNull
    private static final String TAG = "SportRecordHelperInitializer";

    @Override // com.oplus.aiunit.vision.a8a
    public void attachContext(@Nullable Application application) {
        super.attachContext(application);
        wei.INSTANCE.b(new xei());
    }

    @Override // com.oplus.aiunit.vision.a8a
    public int configProcess() {
        return 13;
    }

    @Override // com.oplus.aiunit.vision.a8a
    public void init() {
    }
}
