package com.oplus.aiunit.vision;

import java.io.Writer;

/* JADX INFO: loaded from: classes13.dex */
public final class rrg extends Writer {
    public final gsj i;

    public rrg(z72 z72Var) {
        this.i = new gsj(z72Var);
    }

    public String a() {
        String strL = this.i.l();
        this.i.x();
        return strL;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
    }

    @Override // java.io.Writer
    public void write(char[] cArr) {
        this.i.c(cArr, 0, cArr.length);
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i, int i2) {
        this.i.c(cArr, i, i2);
    }

    @Override // java.io.Writer
    public void write(int i) {
        this.i.a((char) i);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(char c2) {
        write(c2);
        return this;
    }

    @Override // java.io.Writer
    public void write(String str) {
        this.i.b(str, 0, str.length());
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence) {
        String string = charSequence.toString();
        this.i.b(string, 0, string.length());
        return this;
    }

    @Override // java.io.Writer
    public void write(String str, int i, int i2) {
        this.i.b(str, i, i2);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence, int i, int i2) {
        String string = charSequence.subSequence(i, i2).toString();
        this.i.b(string, 0, string.length());
        return this;
    }
}
