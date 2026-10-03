package com.fasterxml.jackson.core.io;

import com.oplus.aiunit.vision.ht9;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Serializable;
import java.io.Writer;

/* JADX INFO: loaded from: classes13.dex */
public abstract class OutputDecorator implements Serializable {
    public abstract OutputStream decorate(ht9 ht9Var, OutputStream outputStream) throws IOException;

    public abstract Writer decorate(ht9 ht9Var, Writer writer) throws IOException;
}
