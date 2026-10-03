package com.badlogic.gdx.graphics.glutils;

import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.utils.BufferUtils;
import com.badlogic.gdx.utils.GdxRuntimeException;
import com.oplus.aiunit.vision.bv5;
import com.oplus.aiunit.vision.kb7;
import com.oplus.aiunit.vision.nwi;
import com.oplus.aiunit.vision.onb;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.nio.ByteBuffer;
import java.util.zip.GZIPInputStream;

/* JADX INFO: loaded from: classes13.dex */
public class ETC1 {
    public static int ETC1_RGB8_OES = 36196;
    public static int PKM_HEADER_SIZE = 16;

    public static Pixmap a(a aVar, Pixmap.Format format) {
        int widthPKM;
        int i;
        int heightPKM;
        if (aVar.i()) {
            widthPKM = getWidthPKM(aVar.k, 0);
            heightPKM = getHeightPKM(aVar.k, 0);
            i = 16;
        } else {
            widthPKM = aVar.i;
            i = 0;
            heightPKM = aVar.f1234j;
        }
        int iB = b(format);
        Pixmap pixmap = new Pixmap(widthPKM, heightPKM, format);
        decodeImage(aVar.k, i, pixmap.t(), 0, widthPKM, heightPKM, iB);
        return pixmap;
    }

    public static int b(Pixmap.Format format) {
        if (format == Pixmap.Format.RGB565) {
            return 2;
        }
        if (format == Pixmap.Format.RGB888) {
            return 3;
        }
        throw new GdxRuntimeException("Can only handle RGB565 or RGB888 images");
    }

    private static native void decodeImage(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, int i3, int i4, int i5);

    public static native int getHeightPKM(ByteBuffer byteBuffer, int i);

    public static native int getWidthPKM(ByteBuffer byteBuffer, int i);

    public static native boolean isValidPKM(ByteBuffer byteBuffer, int i);

    public static final class a implements bv5 {
        public final int i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f1234j;
        public final ByteBuffer k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final int f1235l;

        public a(int i, int i2, ByteBuffer byteBuffer, int i3) {
            this.i = i;
            this.f1234j = i2;
            this.k = byteBuffer;
            this.f1235l = i3;
            b();
        }

        public final void b() {
            if (onb.i(this.i) && onb.i(this.f1234j)) {
                return;
            }
            System.out.println("ETC1Data warning: non-power-of-two ETC1 textures may crash the driver of PowerVR GPUs");
        }

        @Override // com.oplus.aiunit.vision.bv5
        public void dispose() {
            BufferUtils.b(this.k);
        }

        public boolean i() {
            return this.f1235l == 16;
        }

        public String toString() {
            if (!i()) {
                return "raw [" + this.i + "x" + this.f1234j + "], compressed: " + (this.k.capacity() - ETC1.PKM_HEADER_SIZE);
            }
            StringBuilder sb = new StringBuilder();
            sb.append(ETC1.isValidPKM(this.k, 0) ? "valid" : "invalid");
            sb.append(" pkm [");
            sb.append(ETC1.getWidthPKM(this.k, 0));
            sb.append("x");
            sb.append(ETC1.getHeightPKM(this.k, 0));
            sb.append("], compressed: ");
            sb.append(this.k.capacity() - ETC1.PKM_HEADER_SIZE);
            return sb.toString();
        }

        public a(kb7 kb7Var) throws Throwable {
            byte[] bArr = new byte[10240];
            DataInputStream dataInputStream = null;
            try {
                try {
                    DataInputStream dataInputStream2 = new DataInputStream(new BufferedInputStream(new GZIPInputStream(kb7Var.m())));
                    try {
                        this.k = BufferUtils.f(dataInputStream2.readInt());
                        while (true) {
                            int i = dataInputStream2.read(bArr);
                            if (i != -1) {
                                this.k.put(bArr, 0, i);
                            } else {
                                this.k.position(0);
                                ByteBuffer byteBuffer = this.k;
                                byteBuffer.limit(byteBuffer.capacity());
                                nwi.a(dataInputStream2);
                                this.i = ETC1.getWidthPKM(this.k, 0);
                                this.f1234j = ETC1.getHeightPKM(this.k, 0);
                                int i2 = ETC1.PKM_HEADER_SIZE;
                                this.f1235l = i2;
                                this.k.position(i2);
                                b();
                                return;
                            }
                        }
                    } catch (Exception e2) {
                        e = e2;
                        dataInputStream = dataInputStream2;
                        throw new GdxRuntimeException("Couldn't load pkm file '" + kb7Var + "'", e);
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
        }
    }
}
