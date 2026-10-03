package com.heytap.accessory.misc.utils;

import com.heytap.accessory.utils.buffer.Buffer;
import com.heytap.accessory.utils.buffer.BufferPool;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class a {
    public static final String a = "a";

    public static Buffer a(int i, byte[] bArr, int i2, int i3) {
        if (bArr == null) {
            com.heytap.accessory.base.logging.a.b(a, "Data is null");
            return null;
        }
        Inflater inflater = new Inflater();
        inflater.setInput(bArr, i2, i3);
        Buffer bufferObtain = BufferPool.obtain(i);
        try {
            int iInflate = inflater.inflate(bufferObtain.getBuffer(), i2, bufferObtain.getBufferLength() - i2);
            inflater.end();
            bufferObtain.setOffset(i2);
            bufferObtain.setPayloadLength(iInflate);
            com.heytap.accessory.base.logging.a.a(a, "Decompressed " + i3 + " -> " + iInflate);
            return bufferObtain;
        } catch (DataFormatException e) {
            com.heytap.accessory.base.logging.a.b(a, "decompressData error," + e);
            bufferObtain.recycle();
            return null;
        }
    }

    public static Buffer a(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            com.heytap.accessory.base.logging.a.b(a, "Data is null");
            return null;
        }
        Deflater deflater = new Deflater();
        deflater.setInput(bArr, i, i2);
        deflater.finish();
        Buffer bufferObtain = BufferPool.obtain(65531);
        int iDeflate = deflater.deflate(bufferObtain.getBuffer(), i, bufferObtain.getLength() - i);
        deflater.end();
        com.heytap.accessory.base.logging.a.a(a, "Compressed " + i2 + " -> " + iDeflate);
        if (iDeflate > i2) {
            bufferObtain.recycle();
            return null;
        }
        bufferObtain.setOffset(i);
        bufferObtain.setPayloadLength(iDeflate);
        return bufferObtain;
    }
}
