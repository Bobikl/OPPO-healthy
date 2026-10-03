package com.oplus.aiunit.vision;

import android.content.Context;
import android.os.Build;
import android.view.Display;
import com.customer.feedback.sdk.util.HeaderInfoHelper;
import com.heytap.nearx.cloudconfig.util.LogUtils;
import java.util.List;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\f\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u0000\u001a\u0006\u0010\u0003\u001a\u00020\u0001¨\u0006\u0004"}, d2 = {"Landroid/content/Context;", "", "b", "a", "lib_base_release"}, k = 2, mv = {1, 8, 0})
public final class hx9 {
    public static final boolean a() {
        String strA = ukj.a(HeaderInfoHelper.RO_BUILD_ID);
        Intrinsics.checkNotNullExpressionValue(strA, "get(\"ro.build.display.id\")");
        LogUtils logUtils = LogUtils.INSTANCE;
        LogUtils.d$default(logUtils, "ISecDisplayClosedCycle", "versionName: " + strA, null, new Object[0], 4, null);
        if (strA.length() == 0) {
            LogUtils.i$default(logUtils, "ISecDisplayClosedCycle", "version empty", null, new Object[0], 4, null);
            return false;
        }
        List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) strA, new String[]{"_"}, false, 0, 6, (Object) null);
        if (listSplit$default.size() >= 2) {
            try {
                if (!Intrinsics.areEqual(listSplit$default.get(0), "PHT110")) {
                    return false;
                }
                String strSubstring = (String) listSplit$default.get(1);
                int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) strSubstring, "(", 0, false, 6, (Object) null);
                if (iIndexOf$default != -1) {
                    strSubstring = strSubstring.substring(0, iIndexOf$default);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                }
                List listSplit$default2 = StringsKt__StringsKt.split$default((CharSequence) strSubstring, new String[]{"."}, false, 0, 6, (Object) null);
                if (Integer.parseInt((String) listSplit$default2.get(0)) > 13) {
                    return true;
                }
                if (Integer.parseInt((String) listSplit$default2.get(0)) == 13) {
                    if (Integer.parseInt((String) listSplit$default2.get(1)) > 2) {
                        return true;
                    }
                    if (Integer.parseInt((String) listSplit$default2.get(1)) == 2) {
                        if (Integer.parseInt((String) listSplit$default2.get(2)) > 0) {
                            return true;
                        }
                        if (Integer.parseInt((String) listSplit$default2.get(2)) == 0 && Integer.parseInt((String) listSplit$default2.get(3)) >= 120) {
                            return true;
                        }
                    }
                }
                return false;
            } catch (Exception e2) {
                LogUtils.e$default(LogUtils.INSTANCE, "ISecDisplayClosedCycle", "parse version exception:" + e2.getMessage(), null, new Object[0], 4, null);
            }
        }
        return false;
    }

    public static final boolean b(@Nullable Context context) {
        if (!(context instanceof gx9) || Build.VERSION.SDK_INT < 30) {
            return false;
        }
        Display display = context.getDisplay();
        return !(display != null && display.getDisplayId() == 0);
    }
}
