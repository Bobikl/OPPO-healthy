package com.badlogic.gdx.graphics;

import com.badlogic.gdx.utils.GdxRuntimeException;
import com.oplus.aiunit.vision.kb7;
import com.oplus.aiunit.vision.nwi;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.nio.ByteBuffer;
import java.util.zip.InflaterInputStream;

/* JADX INFO: loaded from: classes13.dex */
public class b {

    public static class a {
        public static final byte[] a = new byte[32000];
        public static final byte[] b = new byte[32000];

        /* JADX WARN: Not initialized variable reg: 1, insn: 0x007e: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:25:0x007e */
        public static Pixmap a(kb7 kb7Var) throws Throwable {
            Exception e2;
            Closeable closeable;
            Closeable closeable2 = null;
            try {
                try {
                    DataInputStream dataInputStream = new DataInputStream(new InflaterInputStream(new BufferedInputStream(kb7Var.m())));
                    try {
                        Pixmap pixmap = new Pixmap(dataInputStream.readInt(), dataInputStream.readInt(), Pixmap.Format.fromGdx2DPixmapFormat(dataInputStream.readInt()));
                        ByteBuffer byteBufferT = pixmap.t();
                        byteBufferT.position(0);
                        byteBufferT.limit(byteBufferT.capacity());
                        synchronized (b) {
                            while (true) {
                                byte[] bArr = b;
                                int i = dataInputStream.read(bArr);
                                if (i > 0) {
                                    byteBufferT.put(bArr, 0, i);
                                }
                            }
                        }
                        byteBufferT.position(0);
                        byteBufferT.limit(byteBufferT.capacity());
                        nwi.a(dataInputStream);
                        return pixmap;
                    } catch (Exception e3) {
                        e2 = e3;
                        throw new GdxRuntimeException("Couldn't read Pixmap from file '" + kb7Var + "'", e2);
                    }
                } catch (Throwable th) {
                    th = th;
                    closeable2 = closeable;
                    nwi.a(closeable2);
                    throw th;
                }
            } catch (Exception e4) {
                e2 = e4;
            } catch (Throwable th2) {
                th = th2;
                nwi.a(closeable2);
                throw th;
            }
        }
    }

    public static Pixmap a(kb7 kb7Var) {
        return a.a(kb7Var);
    }
}
