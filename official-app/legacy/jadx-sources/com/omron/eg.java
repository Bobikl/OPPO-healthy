package com.omron;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes5.dex */
public class eg {
    private static final String a = "h";

    public static class a {
        private List<UUID> a;
        private String b;

        public a(List<UUID> list, String str) {
            this.a = list;
            this.b = str;
        }

        public String a() {
            return this.b;
        }
    }

    public static a a(byte[] bArr) {
        byte b;
        ArrayList arrayList = new ArrayList();
        String str = null;
        if (bArr == null) {
            return new a(arrayList, null);
        }
        try {
            ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
            while (byteBufferOrder.remaining() > 2 && (b = byteBufferOrder.get()) != 0) {
                byte b2 = byteBufferOrder.get();
                if (b2 == 2 || b2 == 3) {
                    while (b >= 2) {
                        arrayList.add(UUID.fromString(String.format("%08x-0000-1000-8000-00805f9b34fb", Short.valueOf(byteBufferOrder.getShort()))));
                        b = (byte) (b - 2);
                    }
                } else if (b2 == 6 || b2 == 7) {
                    while (b >= 16) {
                        arrayList.add(new UUID(byteBufferOrder.getLong(), byteBufferOrder.getLong()));
                        b = (byte) (b - 16);
                    }
                } else if (b2 != 9) {
                    byteBufferOrder.position((byteBufferOrder.position() + b) - 1);
                } else {
                    byte[] bArr2 = new byte[b - 1];
                    byteBufferOrder.get(bArr2);
                    try {
                        str = new String(bArr2, "utf-8");
                    } catch (UnsupportedEncodingException e2) {
                        e2.printStackTrace();
                    }
                }
            }
            return new a(arrayList, str);
        } catch (Exception e3) {
            ay.a(a, "扫描数据解析失败", e3);
            return new a(arrayList, str);
        }
    }
}
