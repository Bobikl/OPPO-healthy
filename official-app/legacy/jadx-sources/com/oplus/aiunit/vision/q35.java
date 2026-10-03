package com.oplus.aiunit.vision;

import android.content.ContextWrapper;
import android.content.res.AssetManager;
import com.badlogic.gdx.Files;
import java.io.File;

/* JADX INFO: loaded from: classes13.dex */
public class q35 implements k20 {
    public final String a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AssetManager f15614c;

    public q35(AssetManager assetManager, ContextWrapper contextWrapper, boolean z) {
        this.f15614c = assetManager;
        String absolutePath = contextWrapper.getFilesDir().getAbsolutePath();
        if (!absolutePath.endsWith("/")) {
            absolutePath = absolutePath + "/";
        }
        this.b = absolutePath;
        if (z) {
            this.a = f(contextWrapper);
        } else {
            this.a = null;
        }
    }

    @Override // com.badlogic.gdx.Files
    public kb7 a(String str) {
        return new j20(this.f15614c, str, Files.FileType.Internal);
    }

    @Override // com.badlogic.gdx.Files
    public String b() {
        return this.b;
    }

    @Override // com.badlogic.gdx.Files
    public kb7 c(String str, Files.FileType fileType) {
        return new j20(fileType == Files.FileType.Internal ? this.f15614c : null, str, fileType);
    }

    @Override // com.badlogic.gdx.Files
    public String d() {
        return this.a;
    }

    @Override // com.badlogic.gdx.Files
    public kb7 e(String str) {
        return new j20((AssetManager) null, str, Files.FileType.Classpath);
    }

    public String f(ContextWrapper contextWrapper) {
        File externalFilesDir = contextWrapper.getExternalFilesDir(null);
        if (externalFilesDir == null) {
            return null;
        }
        String absolutePath = externalFilesDir.getAbsolutePath();
        if (absolutePath.endsWith("/")) {
            return absolutePath;
        }
        return absolutePath + "/";
    }
}
