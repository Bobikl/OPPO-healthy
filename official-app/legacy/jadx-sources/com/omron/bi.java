package com.omron;

import android.support.annotation.NonNull;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

/* JADX INFO: loaded from: classes5.dex */
public class bi {
    private int a;
    private String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private File f8842c;
    private BufferedWriter d;

    public void a(String str) {
        try {
            this.d.write(str);
            this.d.newLine();
            this.d.flush();
        } catch (Exception e2) {
            ay.b("日志追加失败: " + e2.getMessage());
        }
    }

    public int b() {
        return this.a;
    }

    public File c() {
        return this.f8842c;
    }

    public String d() {
        return this.b;
    }

    public boolean e() {
        return this.d != null && this.f8842c.exists();
    }

    public boolean a() {
        BufferedWriter bufferedWriter = this.d;
        if (bufferedWriter != null) {
            try {
                bufferedWriter.close();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        this.d = null;
        this.b = null;
        this.f8842c = null;
        this.a = 0;
        return true;
    }

    public boolean a(int i, @NonNull File file) {
        this.a = i;
        this.b = file.getName();
        this.f8842c = file;
        if (!file.exists()) {
            try {
                File parentFile = this.f8842c.getParentFile();
                if (!parentFile.exists()) {
                    parentFile.mkdirs();
                }
                this.f8842c.createNewFile();
            } catch (Exception e2) {
                e2.printStackTrace();
                a();
                return false;
            }
        }
        this.d = new BufferedWriter(new FileWriter(this.f8842c, true));
        return true;
    }
}
