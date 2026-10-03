package com.badlogic.gdx.graphics.g2d;

import com.oplus.aiunit.vision.uki;
import com.oplus.aiunit.vision.wg0;
import com.oplus.aiunit.vision.x38;
import com.oplus.smartenginehelper.ParserTag;
import java.io.BufferedReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes13.dex */
public class ParticleEmitter {
    public int A;
    public boolean[] B;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public wg0<uki> t;
    public c[] v;
    public int w;
    public String y;
    public wg0<String> z;
    public e a = new e();
    public b b = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public e f1220c = new e();
    public b d = new b();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public f f1221e = new f();
    public f f = new f();
    public f g = new f();
    public f h = new f();
    public f i = new f();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public f f1222j = new f();
    public f k = new f();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public f f1223l = new f();
    public f m = new f();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public a f1224n = new a();
    public e o = new f();
    public e p = new f();
    public f q = new f();
    public f r = new f();
    public g s = new g();
    public SpriteMode u = SpriteMode.single;
    public int x = 4;
    public float C = 1.0f;
    public boolean H = true;
    public boolean I = false;
    public boolean J = true;

    public enum SpawnEllipseSide {
        both,
        top,
        bottom
    }

    public enum SpawnShape {
        point,
        line,
        square,
        ellipse
    }

    public enum SpriteMode {
        single,
        random,
        animated
    }

    public static class a extends d {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static float[] f1225e = new float[4];

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float[] f1226c = {1.0f, 1.0f, 1.0f};
        public float[] d = {0.0f};

        public a() {
            this.b = true;
        }

        @Override // com.badlogic.gdx.graphics.g2d.ParticleEmitter.d
        public void a(BufferedReader bufferedReader) throws IOException {
            super.a(bufferedReader);
            if (!this.a) {
                return;
            }
            this.f1226c = new float[ParticleEmitter.h(bufferedReader, "colorsCount")];
            int i = 0;
            int i2 = 0;
            while (true) {
                float[] fArr = this.f1226c;
                if (i2 >= fArr.length) {
                    break;
                }
                fArr[i2] = ParticleEmitter.g(bufferedReader, ParserTag.TAG_COLORS + i2);
                i2++;
            }
            this.d = new float[ParticleEmitter.h(bufferedReader, "timelineCount")];
            while (true) {
                float[] fArr2 = this.d;
                if (i >= fArr2.length) {
                    return;
                }
                fArr2[i] = ParticleEmitter.g(bufferedReader, "timeline" + i);
                i++;
            }
        }
    }

    public static class b extends f {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f1227j;

        @Override // com.badlogic.gdx.graphics.g2d.ParticleEmitter.f, com.badlogic.gdx.graphics.g2d.ParticleEmitter.e, com.badlogic.gdx.graphics.g2d.ParticleEmitter.d
        public void a(BufferedReader bufferedReader) throws IOException {
            super.a(bufferedReader);
            if (bufferedReader.markSupported()) {
                bufferedReader.mark(100);
            }
            String line = bufferedReader.readLine();
            if (line == null) {
                throw new IOException("Missing value: independent");
            }
            if (line.contains("independent")) {
                this.f1227j = Boolean.parseBoolean(ParticleEmitter.j(line));
            } else if (bufferedReader.markSupported()) {
                bufferedReader.reset();
            } else {
                x38.app.error("ParticleEmitter", "The loaded particle effect descriptor file uses an old invalid format. Please download the latest version of the Particle Editor tool and recreate the file by loading and saving it again.");
                throw new IOException("The loaded particle effect descriptor file uses an old invalid format. Please download the latest version of the Particle Editor tool and recreate the file by loading and saving it again.");
            }
        }
    }

    public static class c extends uki {
    }

    public static class d {
        public boolean a;
        public boolean b;

        public void a(BufferedReader bufferedReader) throws IOException {
            if (this.b) {
                this.a = true;
            } else {
                this.a = ParticleEmitter.e(bufferedReader, "active");
            }
        }

        public void b(boolean z) {
            this.a = z;
        }

        public void c(boolean z) {
            this.b = z;
        }
    }

    public static class e extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f1228c;
        public float d;

        @Override // com.badlogic.gdx.graphics.g2d.ParticleEmitter.d
        public void a(BufferedReader bufferedReader) throws IOException {
            super.a(bufferedReader);
            if (this.a) {
                this.f1228c = ParticleEmitter.g(bufferedReader, "lowMin");
                this.d = ParticleEmitter.g(bufferedReader, "lowMax");
            }
        }
    }

    public static class f extends e {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float[] f1229e = {1.0f};
        public float[] f = {0.0f};
        public float g;
        public float h;
        public boolean i;

        @Override // com.badlogic.gdx.graphics.g2d.ParticleEmitter.e, com.badlogic.gdx.graphics.g2d.ParticleEmitter.d
        public void a(BufferedReader bufferedReader) throws IOException {
            super.a(bufferedReader);
            if (!this.a) {
                return;
            }
            this.g = ParticleEmitter.g(bufferedReader, "highMin");
            this.h = ParticleEmitter.g(bufferedReader, "highMax");
            this.i = ParticleEmitter.e(bufferedReader, "relative");
            this.f1229e = new float[ParticleEmitter.h(bufferedReader, "scalingCount")];
            int i = 0;
            int i2 = 0;
            while (true) {
                float[] fArr = this.f1229e;
                if (i2 >= fArr.length) {
                    break;
                }
                fArr[i2] = ParticleEmitter.g(bufferedReader, "scaling" + i2);
                i2++;
            }
            this.f = new float[ParticleEmitter.h(bufferedReader, "timelineCount")];
            while (true) {
                float[] fArr2 = this.f;
                if (i >= fArr2.length) {
                    return;
                }
                fArr2[i] = ParticleEmitter.g(bufferedReader, "timeline" + i);
                i++;
            }
        }
    }

    public static class g extends d {
        public boolean d;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public SpawnShape f1230c = SpawnShape.point;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public SpawnEllipseSide f1231e = SpawnEllipseSide.both;

        @Override // com.badlogic.gdx.graphics.g2d.ParticleEmitter.d
        public void a(BufferedReader bufferedReader) throws IOException {
            super.a(bufferedReader);
            if (this.a) {
                SpawnShape spawnShapeValueOf = SpawnShape.valueOf(ParticleEmitter.i(bufferedReader, ParserTag.TAG_SHAPE));
                this.f1230c = spawnShapeValueOf;
                if (spawnShapeValueOf == SpawnShape.ellipse) {
                    this.d = ParticleEmitter.e(bufferedReader, "edges");
                    this.f1231e = SpawnEllipseSide.valueOf(ParticleEmitter.i(bufferedReader, "side"));
                }
            }
        }
    }

    public ParticleEmitter() {
        c();
    }

    public static boolean e(BufferedReader bufferedReader, String str) throws IOException {
        return Boolean.parseBoolean(i(bufferedReader, str));
    }

    public static boolean f(String str) throws IOException {
        return Boolean.parseBoolean(j(str));
    }

    public static float g(BufferedReader bufferedReader, String str) throws IOException {
        return Float.parseFloat(i(bufferedReader, str));
    }

    public static int h(BufferedReader bufferedReader, String str) throws IOException {
        return Integer.parseInt(i(bufferedReader, str));
    }

    public static String i(BufferedReader bufferedReader, String str) throws IOException {
        String line = bufferedReader.readLine();
        if (line != null) {
            return j(line);
        }
        throw new IOException("Missing value: " + str);
    }

    public static String j(String str) throws IOException {
        return str.substring(str.indexOf(":") + 1).trim();
    }

    public wg0<String> a() {
        return this.z;
    }

    public wg0<uki> b() {
        return this.t;
    }

    public final void c() {
        this.t = new wg0<>();
        this.z = new wg0<>();
        this.f1220c.c(true);
        this.f1221e.c(true);
        this.d.c(true);
        this.f.c(true);
        this.m.c(true);
        this.s.c(true);
        this.q.c(true);
        this.r.c(true);
    }

    public void d(BufferedReader bufferedReader) throws IOException {
        try {
            this.y = i(bufferedReader, "name");
            bufferedReader.readLine();
            this.a.a(bufferedReader);
            bufferedReader.readLine();
            this.f1220c.a(bufferedReader);
            bufferedReader.readLine();
            m(h(bufferedReader, "minParticleCount"));
            l(h(bufferedReader, "maxParticleCount"));
            bufferedReader.readLine();
            this.f1221e.a(bufferedReader);
            bufferedReader.readLine();
            this.d.a(bufferedReader);
            bufferedReader.readLine();
            this.b.a(bufferedReader);
            bufferedReader.readLine();
            this.o.a(bufferedReader);
            bufferedReader.readLine();
            this.p.a(bufferedReader);
            bufferedReader.readLine();
            this.s.a(bufferedReader);
            bufferedReader.readLine();
            this.q.a(bufferedReader);
            bufferedReader.readLine();
            this.r.a(bufferedReader);
            if (bufferedReader.readLine().trim().equals("- Scale -")) {
                this.f.a(bufferedReader);
                this.g.b(false);
            } else {
                this.f.a(bufferedReader);
                bufferedReader.readLine();
                this.g.a(bufferedReader);
            }
            bufferedReader.readLine();
            this.i.a(bufferedReader);
            bufferedReader.readLine();
            this.f1222j.a(bufferedReader);
            bufferedReader.readLine();
            this.h.a(bufferedReader);
            bufferedReader.readLine();
            this.k.a(bufferedReader);
            bufferedReader.readLine();
            this.f1223l.a(bufferedReader);
            bufferedReader.readLine();
            this.f1224n.a(bufferedReader);
            bufferedReader.readLine();
            this.m.a(bufferedReader);
            bufferedReader.readLine();
            this.D = e(bufferedReader, "attached");
            this.E = e(bufferedReader, "continuous");
            this.F = e(bufferedReader, "aligned");
            this.H = e(bufferedReader, "additive");
            this.G = e(bufferedReader, "behind");
            String line = bufferedReader.readLine();
            if (line.startsWith("premultipliedAlpha")) {
                this.I = f(line);
                line = bufferedReader.readLine();
            }
            if (line.startsWith("spriteMode")) {
                this.u = SpriteMode.valueOf(j(line));
                bufferedReader.readLine();
            }
            wg0<String> wg0Var = new wg0<>();
            while (true) {
                String line2 = bufferedReader.readLine();
                if (line2 == null || line2.isEmpty()) {
                    break;
                } else {
                    wg0Var.a(line2);
                }
            }
            k(wg0Var);
        } catch (RuntimeException e2) {
            if (this.y == null) {
                throw e2;
            }
            throw new RuntimeException("Error parsing emitter: " + this.y, e2);
        }
    }

    public void k(wg0<String> wg0Var) {
        this.z = wg0Var;
    }

    public void l(int i) {
        this.x = i;
        this.B = new boolean[i];
        this.A = 0;
        this.v = new c[i];
    }

    public void m(int i) {
        this.w = i;
    }

    public void n(wg0<uki> wg0Var) {
        this.t = wg0Var;
        if (wg0Var.f18241j == 0) {
            return;
        }
        c[] cVarArr = this.v;
        if (cVarArr.length > 0) {
            c cVar = cVarArr[0];
        }
    }

    public ParticleEmitter(BufferedReader bufferedReader) throws IOException {
        c();
        d(bufferedReader);
    }
}
