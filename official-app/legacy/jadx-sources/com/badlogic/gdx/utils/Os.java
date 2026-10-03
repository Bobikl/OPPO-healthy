package com.badlogic.gdx.utils;

import com.sensorsdata.analytics.android.sdk.plugin.property.beans.SAPropertyFilter;

/* JADX INFO: loaded from: classes13.dex */
public enum Os {
    Windows,
    Linux,
    MacOsX,
    Android,
    IOS;

    public String getJniPlatform() {
        if (this == Windows) {
            return "win32";
        }
        if (this == Linux) {
            return "linux";
        }
        return this == MacOsX ? "mac" : "";
    }

    public String getLibExtension() {
        if (this == Windows) {
            return "dll";
        }
        if (this == Linux) {
            return "so";
        }
        if (this == MacOsX) {
            return "dylib";
        }
        return this == Android ? "so" : "";
    }

    public String getLibPrefix() {
        return (this == Linux || this == Android || this == MacOsX) ? SAPropertyFilter.LIB : "";
    }
}
