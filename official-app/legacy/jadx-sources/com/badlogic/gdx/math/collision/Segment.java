package com.badlogic.gdx.math.collision;

import com.badlogic.gdx.math.Vector3;
import java.io.Serializable;

/* JADX INFO: loaded from: classes13.dex */
public class Segment implements Serializable {
    private static final long serialVersionUID = 2739667069736519602L;
    public final Vector3 a;
    public final Vector3 b;

    public Segment(Vector3 vector3, Vector3 vector4) {
        Vector3 vector5 = new Vector3();
        this.a = vector5;
        Vector3 vector6 = new Vector3();
        this.b = vector6;
        vector5.set(vector3);
        vector6.set(vector4);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        Segment segment = (Segment) obj;
        return this.a.equals(segment.a) && this.b.equals(segment.b);
    }

    public int hashCode() {
        return ((this.a.hashCode() + 71) * 71) + this.b.hashCode();
    }

    public float len() {
        return this.a.dst(this.b);
    }

    public float len2() {
        return this.a.dst2(this.b);
    }

    public Segment(float f, float f2, float f3, float f4, float f5, float f6) {
        Vector3 vector3 = new Vector3();
        this.a = vector3;
        Vector3 vector4 = new Vector3();
        this.b = vector4;
        vector3.set(f, f2, f3);
        vector4.set(f4, f5, f6);
    }
}
