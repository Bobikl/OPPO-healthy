package mirror.android.app;

import com.oplus.utils.reflect.RefClass;
import com.oplus.utils.reflect.RefObject;

/* JADX INFO: loaded from: classes11.dex */
public class ActivityManager {
    public static RefObject IActivityManagerSingleton;

    static {
        RefClass.load((Class<?>) ActivityManager.class, "android.app.ActivityManager");
    }
}
