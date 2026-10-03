package com.oplus.aiunit.vision;

import android.annotation.SuppressLint;
import android.os.Build;
import com.sensorsdata.analytics.android.sdk.plugin.property.beans.SAPropertyFilter;

/* JADX INFO: loaded from: classes13.dex */
public final class pkj implements zaf.b {
    @Override // com.oplus.aiunit.vision.zaf.b
    public void a(String str) {
        System.loadLibrary(str);
    }

    @Override // com.oplus.aiunit.vision.zaf.b
    public String b(String str) {
        return str.substring(3, str.length() - 3);
    }

    @Override // com.oplus.aiunit.vision.zaf.b
    public String[] c() {
        String[] strArr = Build.SUPPORTED_ABIS;
        if (strArr.length > 0) {
            return strArr;
        }
        String str = Build.CPU_ABI2;
        return !ltj.a(str) ? new String[]{Build.CPU_ABI, str} : new String[]{Build.CPU_ABI};
    }

    @Override // com.oplus.aiunit.vision.zaf.b
    @SuppressLint({"UnsafeDynamicallyLoadedCode"})
    public void d(String str) {
        System.load(str);
    }

    @Override // com.oplus.aiunit.vision.zaf.b
    public String e(String str) {
        return (str.startsWith(SAPropertyFilter.LIB) && str.endsWith(".so")) ? str : System.mapLibraryName(str);
    }
}
