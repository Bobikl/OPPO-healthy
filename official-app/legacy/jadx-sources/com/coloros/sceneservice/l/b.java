package com.coloros.sceneservice.l;

import android.app.Activity;
import android.content.Intent;
import com.coloros.sceneservice.m.f;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class b {
    public static final String Dc = "coloros.intent.action.SCENE_SERVICE_STATEMENT";
    public static final String Ec = "coloros.intent.action.sceneservice.SHOW_PRIVACY_STATEMENT";
    public static final String Fc = "coloros.intent.action.SCENE_SERVICE_STATEMENT";
    public static final String TAG = "StatementHelper";

    public static Intent a(Activity activity) {
        Intent intent = new Intent("coloros.intent.action.SCENE_SERVICE_STATEMENT");
        intent.addFlags(67108864);
        intent.setPackage("com.coloros.sceneservice");
        intent.putExtra(com.coloros.sceneservice.m.b.Rc, activity.getComponentName());
        return intent;
    }

    @NotNull
    public static Intent getStatementIntent(Activity activity) {
        Intent intent;
        if (com.coloros.sceneservice.m.a.r()) {
            intent = new Intent(Ec);
        } else {
            intent = new Intent("coloros.intent.action.SCENE_SERVICE_STATEMENT");
            intent.addFlags(268435456);
        }
        intent.addFlags(67108864);
        intent.setPackage("com.coloros.sceneservice");
        intent.putExtra(com.coloros.sceneservice.m.b.Rc, activity.getComponentName());
        return intent;
    }

    public static boolean startRequestStatementActivity(Activity activity, int i) {
        try {
            activity.startActivityForResult(a(activity), i);
            return true;
        } catch (Throwable th) {
            f.e(TAG, "startRequestStatementActivity: throwable = " + th);
            return false;
        }
    }

    public static boolean startStatementActivity(Activity activity) {
        try {
            activity.startActivity(getStatementIntent(activity));
            return true;
        } catch (Exception e2) {
            f.e(TAG, "startStatementActivity: exception " + e2);
            return false;
        }
    }
}
