package com.oplus.aiunit.vision;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes13.dex */
public class lpb implements wb7 {
    @Override // com.oplus.aiunit.vision.wb7
    public String a(String str) {
        String strB = b(str);
        String strD = b3f.d(str);
        if (TextUtils.isEmpty(strB)) {
            return strD;
        }
        return strD + "." + strB;
    }

    public final String b(String str) {
        int iLastIndexOf = str.lastIndexOf(46);
        return (iLastIndexOf == -1 || iLastIndexOf <= str.lastIndexOf(47) || (iLastIndexOf + 2) + 4 <= str.length()) ? "" : str.substring(iLastIndexOf + 1, str.length());
    }
}
