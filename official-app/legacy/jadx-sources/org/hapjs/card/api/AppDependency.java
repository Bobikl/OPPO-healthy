package org.hapjs.card.api;

/* JADX INFO: loaded from: classes11.dex */
public class AppDependency {
    private final int mMinVersion;
    private final String mPkg;

    public AppDependency(String str, int i) {
        this.mPkg = str;
        this.mMinVersion = i;
    }

    public int getMinVersion() {
        return this.mMinVersion;
    }

    public String getPackage() {
        return this.mPkg;
    }

    public String toString() {
        return "[mPkg: " + this.mPkg + ", mMinVersion: " + this.mMinVersion + "]";
    }
}
