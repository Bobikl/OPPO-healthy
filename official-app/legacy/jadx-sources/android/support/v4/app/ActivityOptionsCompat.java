package android.support.v4.app;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class ActivityOptionsCompat extends androidx.core.app.ActivityOptionsCompat {
    private final Bundle mBundle;

    private ActivityOptionsCompat(Bundle bundle) {
        this.mBundle = bundle;
    }

    public static ActivityOptionsCompat fromBundle(Bundle bundle) {
        return new ActivityOptionsCompat(bundle);
    }

    public static ActivityOptionsCompat makeBasic() {
        androidx.core.app.ActivityOptionsCompat activityOptionsCompatMakeBasic = androidx.core.app.ActivityOptionsCompat.makeBasic();
        return new ActivityOptionsCompat(activityOptionsCompatMakeBasic != null ? activityOptionsCompatMakeBasic.toBundle() : null);
    }

    public static ActivityOptionsCompat makeSceneTransitionAnimation(Activity activity, View view, String str) {
        androidx.core.app.ActivityOptionsCompat activityOptionsCompatMakeSceneTransitionAnimation = androidx.core.app.ActivityOptionsCompat.makeSceneTransitionAnimation(activity, view, str);
        return new ActivityOptionsCompat(activityOptionsCompatMakeSceneTransitionAnimation != null ? activityOptionsCompatMakeSceneTransitionAnimation.toBundle() : null);
    }

    @Override // androidx.core.app.ActivityOptionsCompat
    public Bundle toBundle() {
        if (this.mBundle == null) {
            return null;
        }
        return new Bundle(this.mBundle);
    }
}
