package com.oplus.aiunit.vision;

import android.app.Application;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \r2\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000f"}, d2 = {"Lcom/oplus/aiunit/vision/ej4;", "Lcom/oplus/aiunit/vision/a8a;", "", "configProcess", "", "init", "Landroid/app/Application;", "application", "attachContext", "", "getTag", "<init>", "()V", "Companion", "a", "Health-6.4.4_03460bd_260624_OPlusRelease"}, k = 1, mv = {1, 8, 0})
public final class ej4 extends a8a {
    @Override // com.oplus.aiunit.vision.a8a
    public void attachContext(@Nullable Application application) {
        super.attachContext(application);
        new h85().a();
    }

    @Override // com.oplus.aiunit.vision.a8a
    public int configProcess() {
        return 4;
    }

    @Override // com.oplus.aiunit.vision.a8a
    @NotNull
    public String getTag() {
        return "DBProcessInitializer";
    }

    @Override // com.oplus.aiunit.vision.a8a
    public void init() {
    }
}
