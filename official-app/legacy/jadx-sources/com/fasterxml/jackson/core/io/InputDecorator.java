package com.fasterxml.jackson.core.io;

import com.oplus.aiunit.vision.ht9;
import java.io.DataInput;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.Serializable;

/* JADX INFO: loaded from: classes13.dex */
public abstract class InputDecorator implements Serializable {
    private static final long serialVersionUID = 1;

    public DataInput decorate(ht9 ht9Var, DataInput dataInput) throws IOException {
        throw new UnsupportedOperationException();
    }

    public abstract InputStream decorate(ht9 ht9Var, InputStream inputStream) throws IOException;

    public abstract InputStream decorate(ht9 ht9Var, byte[] bArr, int i, int i2) throws IOException;

    public abstract Reader decorate(ht9 ht9Var, Reader reader) throws IOException;
}
