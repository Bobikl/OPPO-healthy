package com.airbnb.lottie.model.content;

import android.graphics.Paint;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.oplus.aiunit.vision.d40;
import com.oplus.aiunit.vision.e74;
import com.oplus.aiunit.vision.f40;
import com.oplus.aiunit.vision.j40;
import com.oplus.aiunit.vision.k9b;
import com.oplus.aiunit.vision.l84;
import com.oplus.aiunit.vision.n1j;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class ShapeStroke implements l84 {
    public final String a;

    @Nullable
    public final f40 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<f40> f512c;
    public final d40 d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j40 f513e;
    public final f40 f;
    public final LineCapType g;
    public final LineJoinType h;
    public final float i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f514j;

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

    public ShapeStroke(String str, @Nullable f40 f40Var, List<f40> list, d40 d40Var, j40 j40Var, f40 f40Var2, LineCapType lineCapType, LineJoinType lineJoinType, float f, boolean z) {
        this.a = str;
        this.b = f40Var;
        this.f512c = list;
        this.d = d40Var;
        this.f513e = j40Var;
        this.f = f40Var2;
        this.g = lineCapType;
        this.h = lineJoinType;
        this.i = f;
        this.f514j = z;
    }

    @Override // com.oplus.aiunit.vision.l84
    public e74 a(LottieDrawable lottieDrawable, k9b k9bVar, com.airbnb.lottie.model.layer.a aVar) {
        return new n1j(lottieDrawable, aVar, this);
    }

    public LineCapType b() {
        return this.g;
    }

    public d40 c() {
        return this.d;
    }

    public f40 d() {
        return this.b;
    }

    public LineJoinType e() {
        return this.h;
    }

    public List<f40> f() {
        return this.f512c;
    }

    public float g() {
        return this.i;
    }

    public String h() {
        return this.a;
    }

    public j40 i() {
        return this.f513e;
    }

    public f40 j() {
        return this.f;
    }

    public boolean k() {
        return this.f514j;
    }
}
