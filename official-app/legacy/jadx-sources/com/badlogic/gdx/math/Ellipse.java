package com.badlogic.gdx.math;

import com.oplus.aiunit.vision.rzc;
import java.io.Serializable;

/* JADX INFO: loaded from: classes13.dex */
public class Ellipse implements Serializable {
    private static final long serialVersionUID = 7381533206532032099L;
    public float height;
    public float width;
    public float x;
    public float y;

    public Ellipse() {
    }

    public float area() {
        return ((this.width * this.height) * 3.1415927f) / 4.0f;
    }

    public float circumference() {
        float f = this.width / 2.0f;
        float f2 = this.height / 2.0f;
        float f3 = f * 3.0f;
        return (f3 > f2 || f2 * 3.0f > f) ? (float) ((((double) ((f + f2) * 3.0f)) - Math.sqrt((f3 + f2) * (f + (f2 * 3.0f)))) * 3.1415927410125732d) : (float) (Math.sqrt(((f * f) + (f2 * f2)) / 2.0f) * 6.2831854820251465d);
    }

    public boolean contains(float f, float f2) {
        float f3 = f - this.x;
        float f4 = f2 - this.y;
        float f5 = this.width;
        float f6 = this.height;
        return ((f3 * f3) / (((f5 * 0.5f) * f5) * 0.5f)) + ((f4 * f4) / (((f6 * 0.5f) * f6) * 0.5f)) <= 1.0f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        Ellipse ellipse = (Ellipse) obj;
        return this.x == ellipse.x && this.y == ellipse.y && this.width == ellipse.width && this.height == ellipse.height;
    }

    public int hashCode() {
        return ((((((rzc.b(this.height) + 53) * 53) + rzc.b(this.width)) * 53) + rzc.b(this.x)) * 53) + rzc.b(this.y);
    }

    public void set(float f, float f2, float f3, float f4) {
        this.x = f;
        this.y = f2;
        this.width = f3;
        this.height = f4;
    }

    public Ellipse setPosition(Vector2 vector2) {
        this.x = vector2.x;
        this.y = vector2.y;
        return this;
    }

    public Ellipse setSize(float f, float f2) {
        this.width = f;
        this.height = f2;
        return this;
    }

    public Ellipse(Ellipse ellipse) {
        this.x = ellipse.x;
        this.y = ellipse.y;
        this.width = ellipse.width;
        this.height = ellipse.height;
    }

    public Ellipse setPosition(float f, float f2) {
        this.x = f;
        this.y = f2;
        return this;
    }

    public boolean contains(Vector2 vector2) {
        return contains(vector2.x, vector2.y);
    }

    public void set(Ellipse ellipse) {
        this.x = ellipse.x;
        this.y = ellipse.y;
        this.width = ellipse.width;
        this.height = ellipse.height;
    }

    public Ellipse(float f, float f2, float f3, float f4) {
        this.x = f;
        this.y = f2;
        this.width = f3;
        this.height = f4;
    }

    public void set(Circle circle) {
        this.x = circle.x;
        this.y = circle.y;
        float f = circle.radius;
        this.width = f * 2.0f;
        this.height = f * 2.0f;
    }

    public Ellipse(Vector2 vector2, float f, float f2) {
        this.x = vector2.x;
        this.y = vector2.y;
        this.width = f;
        this.height = f2;
    }

    public void set(Vector2 vector2, Vector2 vector3) {
        this.x = vector2.x;
        this.y = vector2.y;
        this.width = vector3.x;
        this.height = vector3.y;
    }

    public Ellipse(Vector2 vector2, Vector2 vector3) {
        this.x = vector2.x;
        this.y = vector2.y;
        this.width = vector3.x;
        this.height = vector3.y;
    }

    public Ellipse(Circle circle) {
        this.x = circle.x;
        this.y = circle.y;
        float f = circle.radius;
        this.width = f * 2.0f;
        this.height = f * 2.0f;
    }
}
