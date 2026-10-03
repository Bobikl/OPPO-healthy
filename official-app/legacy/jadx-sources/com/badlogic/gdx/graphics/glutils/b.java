package com.badlogic.gdx.graphics.glutils;

import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.TextureData;
import com.badlogic.gdx.utils.BufferUtils;
import com.badlogic.gdx.utils.GdxRuntimeException;
import com.oplus.aiunit.vision.k18;
import com.oplus.aiunit.vision.kb7;
import com.oplus.aiunit.vision.nwi;
import com.oplus.aiunit.vision.ue4;
import com.oplus.aiunit.vision.x38;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.util.zip.GZIPInputStream;

/* JADX INFO: loaded from: classes13.dex */
public class b implements TextureData, ue4 {
    public kb7 a;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1243c;
    public int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1244e;
    public int f;
    public int g = -1;
    public int h = -1;
    public int i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f1245j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f1246l;
    public int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ByteBuffer f1247n;
    public boolean o;

    public b(kb7 kb7Var, boolean z) {
        this.a = kb7Var;
        this.o = z;
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public boolean a() {
        return this.f1247n != null;
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public boolean b() {
        return true;
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public void c(int i) {
        boolean z;
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z2;
        if (this.f1247n == null) {
            throw new GdxRuntimeException("Call prepare() before calling consumeCompressedData()");
        }
        IntBuffer intBufferE = BufferUtils.e(16);
        int i6 = this.b;
        int i7 = 1;
        if (i6 != 0 && this.d != 0) {
            z = false;
        } else {
            if (i6 + this.d != 0) {
                throw new GdxRuntimeException("either both or none of glType, glFormat must be zero");
            }
            z = true;
        }
        if (this.h > 0) {
            i3 = 3553;
            i2 = 2;
        } else {
            i2 = 1;
            i3 = 4660;
        }
        if (this.i > 0) {
            i3 = 4660;
            i2 = 3;
        }
        int i8 = this.k;
        if (i8 == 6) {
            if (i2 != 2) {
                throw new GdxRuntimeException("cube map needs 2D faces");
            }
            i3 = 34067;
        } else if (i8 != 1) {
            throw new GdxRuntimeException("numberOfFaces must be either 1 or 6");
        }
        if (this.f1245j > 0) {
            if (i3 != 4660 && i3 != 3553) {
                throw new GdxRuntimeException("No API for 3D and cube arrays yet");
            }
            i2++;
            i3 = 4660;
        }
        if (i3 == 4660) {
            throw new GdxRuntimeException("Unsupported texture format (only 2D texture are supported in LibGdx for the time being)");
        }
        int i9 = k18.GL_TEXTURE_CUBE_MAP_POSITIVE_X;
        if (i8 != 6 || i == 34067) {
            if (i8 != 6 || i != 34067) {
                if (i != i3 && (34069 > i || i > 34074 || i != 3553)) {
                    throw new GdxRuntimeException("Invalid target requested : 0x" + Integer.toHexString(i) + ", expecting : 0x" + Integer.toHexString(i3));
                }
                i9 = i;
            }
            i4 = -1;
        } else {
            if (34069 > i || i > 34074) {
                throw new GdxRuntimeException("You must specify either GL_TEXTURE_CUBE_MAP to bind all 6 faces of the cube or the requested face GL_TEXTURE_CUBE_MAP_POSITIVE_X and followings.");
            }
            i4 = i - k18.GL_TEXTURE_CUBE_MAP_POSITIVE_X;
        }
        x38.gl.H(k18.GL_UNPACK_ALIGNMENT, intBufferE);
        int i10 = intBufferE.get(0);
        int i11 = 4;
        if (i10 != 4) {
            x38.gl.h(k18.GL_UNPACK_ALIGNMENT, 4);
        }
        int i12 = this.f1244e;
        int i13 = this.d;
        int i14 = this.m;
        int i15 = 0;
        while (i15 < this.f1246l) {
            int iMax = Math.max(i7, this.g >> i15);
            int iMax2 = Math.max(i7, this.h >> i15);
            Math.max(i7, this.i >> i15);
            this.f1247n.position(i14);
            int i16 = this.f1247n.getInt();
            int i17 = (i16 + 3) & (-4);
            i14 += i11;
            int i18 = 0;
            while (i18 < this.k) {
                this.f1247n.position(i14);
                i14 += i17;
                if (i4 == -1 || i4 == i18) {
                    ByteBuffer byteBufferSlice = this.f1247n.slice();
                    byteBufferSlice.limit(i17);
                    i5 = i4;
                    if (i2 != 1 && i2 == 2) {
                        int i19 = this.f1245j;
                        if (i19 > 0) {
                            iMax2 = i19;
                        }
                        if (!z) {
                            z2 = z;
                            x38.gl.t(i9 + i18, i15, i12, iMax, iMax2, 0, i13, this.b, byteBufferSlice);
                        } else if (i12 == ETC1.ETC1_RGB8_OES) {
                            z2 = z;
                            if (x38.graphics.a("GL_OES_compressed_ETC1_RGB8_texture")) {
                                x38.gl.i(i9 + i18, i15, i12, iMax, iMax2, 0, i16, byteBufferSlice);
                            } else {
                                Pixmap pixmapA = ETC1.a(new ETC1.a(iMax, iMax2, byteBufferSlice, 0), Pixmap.Format.RGB888);
                                x38.gl.t(i9 + i18, i15, pixmapA.q(), pixmapA.u(), pixmapA.s(), 0, pixmapA.p(), pixmapA.r(), pixmapA.t());
                                pixmapA.dispose();
                            }
                        } else {
                            z2 = z;
                            x38.gl.i(i9 + i18, i15, i12, iMax, iMax2, 0, i16, byteBufferSlice);
                        }
                    }
                    i18++;
                    i4 = i5;
                    z = z2;
                } else {
                    i5 = i4;
                }
                z2 = z;
                i18++;
                i4 = i5;
                z = z2;
            }
            i15++;
            i4 = i4;
            z = z;
            i7 = 1;
            i11 = 4;
        }
        if (i10 != i11) {
            x38.gl.h(k18.GL_UNPACK_ALIGNMENT, i10);
        }
        if (f()) {
            x38.gl.L(i9);
        }
        h();
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public Pixmap d() {
        throw new GdxRuntimeException("This TextureData implementation does not return a Pixmap");
    }

    @Override // com.oplus.aiunit.vision.ue4
    public void e() {
        c(k18.GL_TEXTURE_CUBE_MAP);
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public boolean f() {
        return this.o;
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public boolean g() {
        throw new GdxRuntimeException("This TextureData implementation does not return a Pixmap");
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public Pixmap.Format getFormat() {
        throw new GdxRuntimeException("This TextureData implementation directly handles texture formats.");
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public int getHeight() {
        return this.h;
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public TextureData.TextureDataType getType() {
        return TextureData.TextureDataType.Custom;
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public int getWidth() {
        return this.g;
    }

    public void h() {
        ByteBuffer byteBuffer = this.f1247n;
        if (byteBuffer != null) {
            BufferUtils.b(byteBuffer);
        }
        this.f1247n = null;
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public void prepare() throws Throwable {
        if (this.f1247n != null) {
            throw new GdxRuntimeException("Already prepared");
        }
        kb7 kb7Var = this.a;
        if (kb7Var == null) {
            throw new GdxRuntimeException("Need a file to load from");
        }
        if (kb7Var.g().endsWith(".zktx")) {
            byte[] bArr = new byte[10240];
            DataInputStream dataInputStream = null;
            try {
                try {
                    DataInputStream dataInputStream2 = new DataInputStream(new BufferedInputStream(new GZIPInputStream(this.a.m())));
                    try {
                        this.f1247n = BufferUtils.f(dataInputStream2.readInt());
                        while (true) {
                            int i = dataInputStream2.read(bArr);
                            if (i == -1) {
                                break;
                            } else {
                                this.f1247n.put(bArr, 0, i);
                            }
                        }
                        this.f1247n.position(0);
                        ByteBuffer byteBuffer = this.f1247n;
                        byteBuffer.limit(byteBuffer.capacity());
                        nwi.a(dataInputStream2);
                    } catch (Exception e2) {
                        e = e2;
                        dataInputStream = dataInputStream2;
                        throw new GdxRuntimeException("Couldn't load zktx file '" + this.a + "'", e);
                    } catch (Throwable th) {
                        th = th;
                        dataInputStream = dataInputStream2;
                        nwi.a(dataInputStream);
                        throw th;
                    }
                } catch (Exception e3) {
                    e = e3;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            this.f1247n = ByteBuffer.wrap(this.a.n());
        }
        if (this.f1247n.get() != -85) {
            throw new GdxRuntimeException("Invalid KTX Header");
        }
        if (this.f1247n.get() != 75) {
            throw new GdxRuntimeException("Invalid KTX Header");
        }
        if (this.f1247n.get() != 84) {
            throw new GdxRuntimeException("Invalid KTX Header");
        }
        if (this.f1247n.get() != 88) {
            throw new GdxRuntimeException("Invalid KTX Header");
        }
        if (this.f1247n.get() != 32) {
            throw new GdxRuntimeException("Invalid KTX Header");
        }
        if (this.f1247n.get() != 49) {
            throw new GdxRuntimeException("Invalid KTX Header");
        }
        if (this.f1247n.get() != 49) {
            throw new GdxRuntimeException("Invalid KTX Header");
        }
        if (this.f1247n.get() != -69) {
            throw new GdxRuntimeException("Invalid KTX Header");
        }
        if (this.f1247n.get() != 13) {
            throw new GdxRuntimeException("Invalid KTX Header");
        }
        if (this.f1247n.get() != 10) {
            throw new GdxRuntimeException("Invalid KTX Header");
        }
        if (this.f1247n.get() != 26) {
            throw new GdxRuntimeException("Invalid KTX Header");
        }
        if (this.f1247n.get() != 10) {
            throw new GdxRuntimeException("Invalid KTX Header");
        }
        int i2 = this.f1247n.getInt();
        if (i2 != 67305985 && i2 != 16909060) {
            throw new GdxRuntimeException("Invalid KTX Header");
        }
        if (i2 != 67305985) {
            ByteBuffer byteBuffer2 = this.f1247n;
            ByteOrder byteOrderOrder = byteBuffer2.order();
            ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
            if (byteOrderOrder == byteOrder) {
                byteOrder = ByteOrder.LITTLE_ENDIAN;
            }
            byteBuffer2.order(byteOrder);
        }
        this.b = this.f1247n.getInt();
        this.f1243c = this.f1247n.getInt();
        this.d = this.f1247n.getInt();
        this.f1244e = this.f1247n.getInt();
        this.f = this.f1247n.getInt();
        this.g = this.f1247n.getInt();
        this.h = this.f1247n.getInt();
        this.i = this.f1247n.getInt();
        this.f1245j = this.f1247n.getInt();
        this.k = this.f1247n.getInt();
        int i3 = this.f1247n.getInt();
        this.f1246l = i3;
        if (i3 == 0) {
            this.f1246l = 1;
            this.o = true;
        }
        this.m = this.f1247n.position() + this.f1247n.getInt();
        if (this.f1247n.isDirect()) {
            return;
        }
        int i4 = this.m;
        for (int i5 = 0; i5 < this.f1246l; i5++) {
            i4 += (((this.f1247n.getInt(i4) + 3) & (-4)) * this.k) + 4;
        }
        this.f1247n.limit(i4);
        this.f1247n.position(0);
        ByteBuffer byteBufferF = BufferUtils.f(i4);
        byteBufferF.order(this.f1247n.order());
        byteBufferF.put(this.f1247n);
        this.f1247n = byteBufferF;
    }
}
