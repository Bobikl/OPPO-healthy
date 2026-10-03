package com.lifesense.plugin.ble.device.proto.A5.parser;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/* JADX INFO: loaded from: classes5.dex */
public class c {
    public Queue a;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f8758c;

    public c(List list, int i) {
        this.f8758c = false;
        this.a = new LinkedList(list);
        this.b = i;
    }

    public void a(boolean z) {
        this.f8758c = z;
    }

    public boolean b() {
        return this.a.isEmpty();
    }

    public String toString() {
        return "A5OtaFileBlock{frames=" + this.a + ", dataLenght=" + this.b + ", fileEnd=" + this.f8758c + '}';
    }

    public c(boolean z) {
        this.f8758c = false;
        this.a = new LinkedList();
        this.f8758c = z;
    }

    public byte[] a() {
        return (byte[]) this.a.poll();
    }
}
