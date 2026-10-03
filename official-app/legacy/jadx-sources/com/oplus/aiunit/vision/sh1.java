package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public class sh1 {
    public int b = 0;
    public final StringBuilder a = new StringBuilder();

    public void a(CharSequence charSequence) {
        if (this.b != 0) {
            this.a.append('\n');
        }
        this.a.append(charSequence);
        this.b++;
    }

    public String b() {
        return this.a.toString();
    }
}
