package mirror.android.util;

import com.oplus.utils.reflect.RefClass;
import com.oplus.utils.reflect.RefObject;

/* JADX INFO: loaded from: classes11.dex */
public class Singleton {
    public static RefObject mInstance;

    static {
        RefClass.load((Class<?>) Singleton.class, "android.util.Singleton");
    }
}
