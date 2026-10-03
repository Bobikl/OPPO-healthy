package com.oplus.aiunit.vision;

import android.app.Activity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import com.afollestad.assent.Permission;
import com.heytap.health.settings.me.settings2.permission.PermissionDetailAct;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\f\u0010\u0007\u001a\u00020\u0004*\u00020\u0002H\u0002J\f\u0010\t\u001a\u00020\b*\u00020\u0002H\u0002R\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/oplus/aiunit/vision/wcf;", "Lcom/oplus/aiunit/vision/d2h;", "Lcom/afollestad/assent/Permission;", PermissionDetailAct.PERMISSION, "", "b", "a", "c", "", "d", "Landroid/app/Activity;", "Landroid/app/Activity;", "activity", "Lcom/oplus/aiunit/vision/ure;", "Lcom/oplus/aiunit/vision/ure;", "prefs", "<init>", "(Landroid/app/Activity;Lcom/oplus/aiunit/vision/ure;)V", "core"}, k = 1, mv = {1, 4, 0})
public final class wcf implements d2h {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final Activity activity;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final ure prefs;

    public wcf(@NotNull Activity activity, @NotNull ure prefs) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(prefs, "prefs");
        this.activity = activity;
        this.prefs = prefs;
    }

    @Override // com.oplus.aiunit.vision.d2h
    public boolean a(@NotNull Permission permission) {
        Intrinsics.checkParameterIsNotNull(permission, "permission");
        Boolean bool = (Boolean) this.prefs.get(d(permission));
        return (!(bool != null ? bool.booleanValue() : false) || c(permission) || b(permission)) ? false : true;
    }

    @Override // com.oplus.aiunit.vision.d2h
    public boolean b(@NotNull Permission permission) {
        Intrinsics.checkParameterIsNotNull(permission, "permission");
        boolean zShouldShowRequestPermissionRationale = ActivityCompat.shouldShowRequestPermissionRationale(this.activity, permission.getValue());
        if (zShouldShowRequestPermissionRationale) {
            this.prefs.a(d(permission), Boolean.valueOf(zShouldShowRequestPermissionRationale));
        }
        return zShouldShowRequestPermissionRationale;
    }

    public final boolean c(@NotNull Permission permission) {
        return ContextCompat.checkSelfPermission(this.activity, permission.getValue()) == 0;
    }

    public final String d(@NotNull Permission permission) {
        return "show_rationale__" + permission.getValue();
    }
}
