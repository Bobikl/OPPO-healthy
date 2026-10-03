package com.oplus.anim.model.content;

import android.graphics.Paint;
import androidx.annotation.Nullable;
import com.oplus.aiunit.vision.c40;
import com.oplus.aiunit.vision.d74;
import com.oplus.aiunit.vision.e40;
import com.oplus.aiunit.vision.i40;
import com.oplus.aiunit.vision.k84;
import com.oplus.aiunit.vision.m1j;
import com.oplus.aiunit.vision.wg6;
import com.oplus.anim.EffectiveAnimationDrawable;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class ShapeStroke implements k84 {
    public final String a;

    @Nullable
    public final e40 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<e40> f19626c;
    public final c40 d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i40 f19627e;
    public final e40 f;
    public final LineCapType g;
    public final LineJoinType h;
    public final float i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f19628j;

    public enum LineCapType {
        BUTT,
        ROUND,
        UNKNOWN;

        public Paint.Cap toPaintCap() {
            int i = a.a[ordinal()];
            if (i != 1) {
                return i != 2 ? Paint.Cap.SQUARE : Paint.Cap.ROUND;
            }
            return Paint.Cap.BUTT;
        }
    }

    public enum LineJoinType {
        MITER,
        ROUND,
        BEVEL;

        public Paint.Join toPaintJoin() {
            int i = a.b[ordinal()];
            if (i == 1) {
                return Paint.Join.BEVEL;
            }
            if (i == 2) {
                return Paint.Join.MITER;
            }
            if (i != 3) {
                return null;
            }
            return Paint.Join.ROUND;
        }
    }

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[LineJoinType.values().length];
            b = iArr;
            try {
                iArr[LineJoinType.BEVEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[LineJoinType.MITER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[LineJoinType.ROUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[LineCapType.values().length];
            a = iArr2;
            try {
                iArr2[LineCapType.BUTT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[LineCapType.ROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[LineCapType.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public ShapeStroke(String str, @Nullable e40 e40Var, List<e40> list, c40 c40Var, i40 i40Var, e40 e40Var2, LineCapType lineCapType, LineJoinType lineJoinType, float f, boolean z) {
        this.a = str;
        this.b = e40Var;
        this.f19626c = list;
        this.d = c40Var;
        this.f19627e = i40Var;
        this.f = e40Var2;
        this.g = lineCapType;
        this.h = lineJoinType;
        this.i = f;
        this.f19628j = z;
    }

    @Override // com.oplus.aiunit.vision.k84
    public d74 a(EffectiveAnimationDrawable effectiveAnimationDrawable, wg6 wg6Var, com.oplus.anim.model.layer.a aVar) {
        return new m1j(effectiveAnimationDrawable, aVar, this);
    }

    public LineCapType b() {
        return this.g;
    }

    public c40 c() {
        return this.d;
    }

    public e40 d() {
        return this.b;
    }

    public LineJoinType e() {
        return this.h;
    }

    public List<e40> f() {
        return this.f19626c;
    }

    public float g() {
        return this.i;
    }

    public String h() {
        return this.a;
    }

    public i40 i() {
        return this.f19627e;
    }

    public e40 j() {
        return this.f;
    }

    public boolean k() {
        return this.f19628j;
    }
}
