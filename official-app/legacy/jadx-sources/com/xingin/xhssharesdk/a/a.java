package com.xingin.xhssharesdk.a;

import com.xingin.xhssharesdk.a.a;
import com.xingin.xhssharesdk.a.a.AbstractC1016a;
import java.io.IOException;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes10.dex */
public abstract class a<MessageType extends a<MessageType, BuilderType>, BuilderType extends AbstractC1016a<MessageType, BuilderType>> implements l {
    public int i = 0;

    /* JADX INFO: renamed from: com.xingin.xhssharesdk.a.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC1016a<MessageType extends a<MessageType, BuilderType>, BuilderType extends AbstractC1016a<MessageType, BuilderType>> implements l.a {
    }

    @Override // com.xingin.xhssharesdk.a.l
    public final byte[] a() {
        try {
            int iB = b();
            byte[] bArr = new byte[iB];
            Logger logger = g.a;
            g.b bVar = new g.b(bArr, iB);
            a(bVar);
            if (bVar.f20423e - bVar.f == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e2) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a byte array threw an IOException (should never happen).", e2);
        }
    }
}
