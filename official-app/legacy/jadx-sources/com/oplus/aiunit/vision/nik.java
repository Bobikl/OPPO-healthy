package com.oplus.aiunit.vision;

import io.protostuff.MapSchema;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0018\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000e\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\t\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002J\u001f\u0010\n\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\fR\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\fR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\fR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\fR\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\f¨\u0006\u001a"}, d2 = {"Lcom/oplus/aiunit/vision/nik;", "", "", "t", "b", "c", "a", "x", "epsilon", MapSchema.FIELD_NAME_ENTRY, "d", "(DD)D", "D", "ax", "bx", "cx", "ay", "by", "f", "cy", "p1x", "p1y", "p2x", "p2y", "<init>", "(DDDD)V", "nearx_release"}, k = 1, mv = {1, 6, 0})
public final class nik {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final double ax;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final double bx;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final double cx;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final double ay;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final double by;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final double cy;

    public nik(double d, double d2, double d3, double d4) {
        double d5 = d * 3.0d;
        this.cx = d5;
        double d6 = ((d3 - d) * 3.0d) - d5;
        this.bx = d6;
        this.ax = (1.0d - d5) - d6;
        double d7 = d2 * 3.0d;
        this.cy = d7;
        double d8 = ((d4 - d2) * 3.0d) - d7;
        this.by = d8;
        this.ay = (1.0d - d7) - d8;
    }

    public final double a(double t) {
        return (((this.ax * 3.0d * t) + (this.bx * 2.0d)) * t) + this.cx;
    }

    public final double b(double t) {
        return ((((this.ax * t) + this.bx) * t) + this.cx) * t;
    }

    public final double c(double t) {
        return ((((this.ay * t) + this.by) * t) + this.cy) * t;
    }

    public final double d(double x, double epsilon) {
        return c(e(x, epsilon));
    }

    public final double e(double x, double epsilon) {
        double d = x;
        for (int i = 0; i < 8; i++) {
            double dB = b(d) - x;
            if (Math.abs(dB) < epsilon) {
                return d;
            }
            double dA = a(d);
            if (Math.abs(dA) < 1.0E-6d) {
                break;
            }
            d -= dB / dA;
        }
        double d2 = 0.0d;
        if (x < 0.0d) {
            return 0.0d;
        }
        double d3 = 1.0d;
        if (x > 1.0d) {
            return 1.0d;
        }
        double d4 = x;
        while (d2 < d3) {
            double dB2 = b(d4);
            if (Math.abs(dB2 - x) < epsilon) {
                return d4;
            }
            if (x > dB2) {
                d2 = d4;
            } else {
                d3 = d4;
            }
            d4 = ((d3 - d2) * 0.5d) + d2;
        }
        return d4;
    }
}
