package com.oplus.aiunit.vision;

import com.heytap.health.base.permission.wxbpermission.PermissionRequestDialog;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, d2 = {"Lcom/oplus/aiunit/vision/sa2;", "Lcom/oplus/aiunit/vision/z8g;", "", "c", "", MapSchema.FIELD_NAME_ENTRY, "<init>", "()V", "Health-6.4.4_03460bd_260624_OPlusRelease"}, k = 1, mv = {1, 8, 0})
public final class sa2 implements z8g {
    @Override // com.oplus.aiunit.vision.z8g
    @NotNull
    public String[] a() {
        return z8g.b.b(this);
    }

    @Override // com.oplus.aiunit.vision.z8g
    @NotNull
    public String[] b() {
        return z8g.b.e(this);
    }

    @Override // com.oplus.aiunit.vision.z8g
    @NotNull
    public String c() {
        return PermissionRequestDialog.WXB;
    }

    @Override // com.oplus.aiunit.vision.z8g
    @NotNull
    public String[] d() {
        return z8g.b.a(this);
    }

    @Override // com.oplus.aiunit.vision.z8g
    public int e() {
        return 3;
    }

    @Override // com.oplus.aiunit.vision.z8g
    @NotNull
    public String[] f() {
        return z8g.b.c(this);
    }

    @Override // com.oplus.aiunit.vision.z8g
    @NotNull
    public String[] g() {
        return z8g.b.d(this);
    }
}
