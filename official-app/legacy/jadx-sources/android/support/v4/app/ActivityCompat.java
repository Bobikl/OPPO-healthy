package android.support.v4.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.core.content.ContextCompat;

/* JADX INFO: loaded from: classes.dex */
@Keep
public final class ActivityCompat {
    private ActivityCompat() {
    }

    public static void startActivity(Context context, Intent intent, Bundle bundle) {
        ContextCompat.startActivity(context, intent, bundle);
    }

    public static void startActivityForResult(Activity activity, Intent intent, int i, Bundle bundle) {
        androidx.core.app.ActivityCompat.startActivityForResult(activity, intent, i, bundle);
    }
}
