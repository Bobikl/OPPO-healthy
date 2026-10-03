package com.amap.api.col.p0003sl;

/* JADX INFO: loaded from: classes12.dex */
public enum db {
    STYLE_ELEMENT_LABELFILL_OLD("labels.text.fill", 0),
    STYLE_ELEMENT_LABELSTROKE_OLD("labels.text.stroke", 1),
    STYLE_ELEMENT_GEOMETRYSTROKE_OLD("geometry.stroke", 2),
    STYLE_ELEMENT_GEOMETRYFILL_OLD("geometry.fill", 3),
    STYLE_ELEMENT_LABELFILL("textFillColor", 0),
    STYLE_ELEMENT_LABELSTROKE("textStrokeColor", 1),
    STYLE_ELEMENT_GEOMETRYSTROKE("strokeColor", 2),
    STYLE_ELEMENT_GEOMETRYFILL("fillColor", 3),
    STYLE_ELEMENT_GEOMETRYFILL1("color", 3),
    STYLE_ELEMENT_GEOMETRYFILL2("textureName", 3),
    STYLE_ELEMENT_BACKGROUNDFILL("backgroundColor", 4),
    STYLE_ELEMENT_VISIBLE("visible", 5);

    private String m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f679n;

    db(String str, int i) {
        this.m = str;
        this.f679n = i;
    }

    private String a() {
        return this.m;
    }

    public static int a(String str) {
        for (db dbVar : values()) {
            if (dbVar.a().equals(str)) {
                return dbVar.f679n;
            }
        }
        return -1;
    }
}
