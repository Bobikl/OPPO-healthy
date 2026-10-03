package com.oplus.aiunit.vision;

import com.badlogic.gdx.Files;
import com.badlogic.gdx.utils.GdxRuntimeException;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes13.dex */
public class kb7 {
    public File a;
    public Files.FileType b;

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Files.FileType.values().length];
            a = iArr;
            try {
                iArr[Files.FileType.Internal.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[Files.FileType.Classpath.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[Files.FileType.Absolute.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[Files.FileType.External.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public kb7() {
    }

    public kb7 a(String str) {
        return this.a.getPath().length() == 0 ? new kb7(new File(str), this.b) : new kb7(new File(this.a, str), this.b);
    }

    public final int b() {
        int iF = (int) f();
        if (iF != 0) {
            return iF;
        }
        return 512;
    }

    public boolean c() {
        int i = a.a[this.b.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return e().exists();
            }
        } else if (e().exists()) {
            return true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("/");
        sb.append(this.a.getPath().replace('\\', mla.SEPARATOR));
        return kb7.class.getResource(sb.toString()) != null;
    }

    public String d() {
        String name = this.a.getName();
        int iLastIndexOf = name.lastIndexOf(46);
        return iLastIndexOf == -1 ? "" : name.substring(iLastIndexOf + 1);
    }

    public File e() {
        return this.b == Files.FileType.External ? new File(x38.files.d(), this.a.getPath()) : this.a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof kb7)) {
            return false;
        }
        kb7 kb7Var = (kb7) obj;
        return this.b == kb7Var.b && j().equals(kb7Var.j());
    }

    public long f() {
        Files.FileType fileType = this.b;
        if (fileType != Files.FileType.Classpath && (fileType != Files.FileType.Internal || this.a.exists())) {
            return e().length();
        }
        InputStream inputStreamM = m();
        try {
            return inputStreamM.available();
        } catch (Exception unused) {
            return 0L;
        } finally {
            nwi.a(inputStreamM);
        }
    }

    public String g() {
        return this.a.getName();
    }

    public String h() {
        String name = this.a.getName();
        int iLastIndexOf = name.lastIndexOf(46);
        return iLastIndexOf == -1 ? name : name.substring(0, iLastIndexOf);
    }

    public int hashCode() {
        return ((37 + this.b.hashCode()) * 67) + j().hashCode();
    }

    public kb7 i() {
        File parentFile = this.a.getParentFile();
        if (parentFile == null) {
            parentFile = this.b == Files.FileType.Absolute ? new File("/") : new File("");
        }
        return new kb7(parentFile, this.b);
    }

    public String j() {
        return this.a.getPath().replace('\\', mla.SEPARATOR);
    }

    public String k() {
        String strReplace = this.a.getPath().replace('\\', mla.SEPARATOR);
        int iLastIndexOf = strReplace.lastIndexOf(46);
        return iLastIndexOf == -1 ? strReplace : strReplace.substring(0, iLastIndexOf);
    }

    public BufferedInputStream l(int i) {
        return new BufferedInputStream(m(), i);
    }

    public InputStream m() {
        Files.FileType fileType = this.b;
        if (fileType == Files.FileType.Classpath || ((fileType == Files.FileType.Internal && !e().exists()) || (this.b == Files.FileType.Local && !e().exists()))) {
            InputStream resourceAsStream = kb7.class.getResourceAsStream("/" + this.a.getPath().replace('\\', mla.SEPARATOR));
            if (resourceAsStream != null) {
                return resourceAsStream;
            }
            throw new GdxRuntimeException("File not found: " + this.a + " (" + this.b + ")");
        }
        try {
            return new FileInputStream(e());
        } catch (Exception e2) {
            if (e().isDirectory()) {
                throw new GdxRuntimeException("Cannot open a stream to a directory: " + this.a + " (" + this.b + ")", e2);
            }
            throw new GdxRuntimeException("Error reading file: " + this.a + " (" + this.b + ")", e2);
        }
    }

    public byte[] n() {
        InputStream inputStreamM = m();
        try {
            try {
                byte[] bArrD = nwi.d(inputStreamM, b());
                nwi.a(inputStreamM);
                return bArrD;
            } catch (IOException e2) {
                throw new GdxRuntimeException("Error reading file: " + this, e2);
            }
        } catch (Throwable th) {
            nwi.a(inputStreamM);
            throw th;
        }
    }

    public String o() {
        return p(null);
    }

    public String p(String str) {
        StringBuilder sb = new StringBuilder(b());
        InputStreamReader inputStreamReader = null;
        try {
            try {
                inputStreamReader = str == null ? new InputStreamReader(m()) : new InputStreamReader(m(), str);
                char[] cArr = new char[256];
                while (true) {
                    int i = inputStreamReader.read(cArr);
                    if (i == -1) {
                        nwi.a(inputStreamReader);
                        return sb.toString();
                    }
                    sb.append(cArr, 0, i);
                }
            } catch (IOException e2) {
                throw new GdxRuntimeException("Error reading layout file: " + this, e2);
            }
        } catch (Throwable th) {
            nwi.a(inputStreamReader);
            throw th;
        }
    }

    public BufferedReader q(int i) {
        return new BufferedReader(new InputStreamReader(m()), i);
    }

    public Reader r(String str) {
        InputStream inputStreamM = m();
        try {
            return new InputStreamReader(inputStreamM, str);
        } catch (UnsupportedEncodingException e2) {
            nwi.a(inputStreamM);
            throw new GdxRuntimeException("Error reading file: " + this, e2);
        }
    }

    public kb7 s(String str) {
        if (this.a.getPath().length() != 0) {
            return new kb7(new File(this.a.getParent(), str), this.b);
        }
        throw new GdxRuntimeException("Cannot get the sibling of the root.");
    }

    public Files.FileType t() {
        return this.b;
    }

    public String toString() {
        return this.a.getPath().replace('\\', mla.SEPARATOR);
    }

    public kb7(String str, Files.FileType fileType) {
        this.b = fileType;
        this.a = new File(str);
    }

    public kb7(File file, Files.FileType fileType) {
        this.a = file;
        this.b = fileType;
    }
}
