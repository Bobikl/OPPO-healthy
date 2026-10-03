package org.commonmark.ext.gfm.tables;

import com.oplus.aiunit.vision.pf4;

/* JADX INFO: loaded from: classes11.dex */
public class TableCell extends pf4 {
    public boolean f;
    public Alignment g;

    public enum Alignment {
        LEFT,
        CENTER,
        RIGHT
    }

    public Alignment m() {
        return this.g;
    }

    public boolean n() {
        return this.f;
    }

    public void o(Alignment alignment) {
        this.g = alignment;
    }

    public void p(boolean z) {
        this.f = z;
    }
}
