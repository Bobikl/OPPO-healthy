package com.heytap.store.platform.htrouter.utils;

import java.util.regex.Pattern;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u001a\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¨\u0006\u0005"}, d2 = {"find", "", "beVerifiedString", "", "regEx", "htrouter-api_release"}, k = 2, mv = {1, 4, 0})
public final class PatternUtilKt {
    public static final boolean find(@Nullable String str, @Nullable String str2) {
        boolean z = true;
        if (!(str == null || str.length() == 0)) {
            if (str2 != null && str2.length() != 0) {
                z = false;
            }
            if (!z) {
                return Pattern.compile(str2).matcher(str).find();
            }
        }
        return false;
    }
}
