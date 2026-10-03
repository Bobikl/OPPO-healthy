package androidx.work.impl.utils;

import android.content.ComponentName;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.work.Logger;
import com.oplus.smartenginehelper.entity.ViewEntity;

/* JADX INFO: loaded from: classes12.dex */
public class PackageManagerHelper {
    private static final String TAG = Logger.tagWithPrefix("PackageManagerHelper");

    private PackageManagerHelper() {
    }

    private static int getComponentEnabledSetting(@NonNull Context context, @NonNull String str) {
        return context.getPackageManager().getComponentEnabledSetting(new ComponentName(context, str));
    }

    private static boolean isComponentEnabled(int i, boolean z) {
        if (i == 0) {
            return z;
        }
        return i == 1;
    }

    public static boolean isComponentExplicitlyEnabled(@NonNull Context context, @NonNull Class<?> cls) {
        return isComponentEnabled(getComponentEnabledSetting(context, cls.getName()), false);
    }

    public static void setComponentEnabled(@NonNull Context context, @NonNull Class<?> cls, boolean z) {
        String str = ViewEntity.ENABLED;
        try {
            if (z == isComponentEnabled(getComponentEnabledSetting(context, cls.getName()), false)) {
                Logger.get().debug(TAG, "Skipping component enablement for " + cls.getName());
                return;
            }
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z ? 1 : 2, 1);
            Logger logger = Logger.get();
            String str2 = TAG;
            StringBuilder sb = new StringBuilder();
            sb.append(cls.getName());
            sb.append(" ");
            sb.append(z ? ViewEntity.ENABLED : "disabled");
            logger.debug(str2, sb.toString());
        } catch (Exception e2) {
            Logger logger2 = Logger.get();
            String str3 = TAG;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(cls.getName());
            sb2.append("could not be ");
            if (!z) {
                str = "disabled";
            }
            sb2.append(str);
            logger2.debug(str3, sb2.toString(), e2);
        }
    }

    public static boolean isComponentExplicitlyEnabled(@NonNull Context context, @NonNull String str) {
        return getComponentEnabledSetting(context, str) == 1;
    }
}
