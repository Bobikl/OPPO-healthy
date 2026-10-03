package com.oplus.aiunit.vision;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import com.badlogic.gdx.Files;
import com.badlogic.gdx.utils.GdxRuntimeException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes13.dex */
public class j20 extends kb7 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AssetManager f12732c;

    public j20(AssetManager assetManager, String str, Files.FileType fileType) {
        super(str.replace('\\', mla.SEPARATOR), fileType);
        this.f12732c = assetManager;
    }

    @Override // com.oplus.aiunit.vision.kb7
    public kb7 a(String str) {
        String strReplace = str.replace('\\', mla.SEPARATOR);
        return this.a.getPath().length() == 0 ? new j20(this.f12732c, new File(strReplace), this.b) : new j20(this.f12732c, new File(this.a, strReplace), this.b);
    }

    @Override // com.oplus.aiunit.vision.kb7
    public boolean c() {
        if (this.b != Files.FileType.Internal) {
            return super.c();
        }
        String path = this.a.getPath();
        try {
            this.f12732c.open(path).close();
            return true;
        } catch (Exception unused) {
            try {
                return this.f12732c.list(path).length > 0;
            } catch (Exception unused2) {
                return false;
            }
        }
    }

    @Override // com.oplus.aiunit.vision.kb7
    public File e() {
        return this.b == Files.FileType.Local ? new File(x38.files.b(), this.a.getPath()) : super.e();
    }

    @Override // com.oplus.aiunit.vision.kb7
    public long f() {
        if (this.b == Files.FileType.Internal) {
            AssetFileDescriptor assetFileDescriptorOpenFd = null;
            try {
                assetFileDescriptorOpenFd = this.f12732c.openFd(this.a.getPath());
                long length = assetFileDescriptorOpenFd.getLength();
                try {
                    assetFileDescriptorOpenFd.close();
                } catch (IOException unused) {
                }
                return length;
            } catch (IOException unused2) {
                if (assetFileDescriptorOpenFd != null) {
                    try {
                        assetFileDescriptorOpenFd.close();
                    } catch (IOException unused3) {
                    }
                }
            } catch (Throwable th) {
                if (assetFileDescriptorOpenFd != null) {
                    try {
                        assetFileDescriptorOpenFd.close();
                    } catch (IOException unused4) {
                    }
                }
                throw th;
            }
        }
        return super.f();
    }

    @Override // com.oplus.aiunit.vision.kb7
    public kb7 i() {
        File parentFile = this.a.getParentFile();
        if (parentFile == null) {
            parentFile = this.b == Files.FileType.Absolute ? new File("/") : new File("");
        }
        return new j20(this.f12732c, parentFile, this.b);
    }

    @Override // com.oplus.aiunit.vision.kb7
    public InputStream m() {
        if (this.b != Files.FileType.Internal) {
            return super.m();
        }
        try {
            return this.f12732c.open(this.a.getPath());
        } catch (IOException e2) {
            throw new GdxRuntimeException("Error reading file: " + this.a + " (" + this.b + ")", e2);
        }
    }

    @Override // com.oplus.aiunit.vision.kb7
    public kb7 s(String str) {
        String strReplace = str.replace('\\', mla.SEPARATOR);
        if (this.a.getPath().length() != 0) {
            return x38.files.c(new File(this.a.getParent(), strReplace).getPath(), this.b);
        }
        throw new GdxRuntimeException("Cannot get the sibling of the root.");
    }

    public AssetFileDescriptor u() throws IOException {
        AssetManager assetManager = this.f12732c;
        if (assetManager != null) {
            return assetManager.openFd(j());
        }
        return null;
    }

    public j20(AssetManager assetManager, File file, Files.FileType fileType) {
        super(file, fileType);
        this.f12732c = assetManager;
    }
}
