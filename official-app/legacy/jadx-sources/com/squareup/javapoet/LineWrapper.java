package com.squareup.javapoet;

import io.netty.util.internal.StringUtil;
import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
final class LineWrapper {
    private boolean closed;
    private final int columnLimit;
    private final String indent;
    private FlushType nextFlush;
    private final RecordingAppendable out;
    private final StringBuilder buffer = new StringBuilder();
    private int column = 0;
    private int indentLevel = -1;

    /* JADX INFO: renamed from: com.squareup.javapoet.LineWrapper$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$squareup$javapoet$LineWrapper$FlushType;

        static {
            int[] iArr = new int[FlushType.values().length];
            $SwitchMap$com$squareup$javapoet$LineWrapper$FlushType = iArr;
            try {
                iArr[FlushType.WRAP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$squareup$javapoet$LineWrapper$FlushType[FlushType.SPACE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$squareup$javapoet$LineWrapper$FlushType[FlushType.EMPTY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public enum FlushType {
        WRAP,
        SPACE,
        EMPTY
    }

    public LineWrapper(Appendable appendable, String str, int i) {
        Util.checkNotNull(appendable, "out == null", new Object[0]);
        this.out = new RecordingAppendable(appendable);
        this.indent = str;
        this.columnLimit = i;
    }

    private void flush(FlushType flushType) throws IOException {
        int i;
        int i2 = AnonymousClass1.$SwitchMap$com$squareup$javapoet$LineWrapper$FlushType[flushType.ordinal()];
        if (i2 == 1) {
            this.out.append('\n');
            int i3 = 0;
            while (true) {
                i = this.indentLevel;
                if (i3 >= i) {
                    break;
                }
                this.out.append(this.indent);
                i3++;
            }
            int length = i * this.indent.length();
            this.column = length;
            this.column = length + this.buffer.length();
        } else if (i2 == 2) {
            this.out.append(StringUtil.SPACE);
        } else if (i2 != 3) {
            throw new IllegalArgumentException("Unknown FlushType: " + flushType);
        }
        this.out.append(this.buffer);
        StringBuilder sb = this.buffer;
        sb.delete(0, sb.length());
        this.indentLevel = -1;
        this.nextFlush = null;
    }

    public void append(String str) throws IOException {
        int length;
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        if (this.nextFlush != null) {
            int iIndexOf = str.indexOf(10);
            if (iIndexOf == -1 && this.column + str.length() <= this.columnLimit) {
                this.buffer.append(str);
                this.column += str.length();
                return;
            }
            flush(iIndexOf == -1 || this.column + iIndexOf > this.columnLimit ? FlushType.WRAP : this.nextFlush);
        }
        this.out.append(str);
        int iLastIndexOf = str.lastIndexOf(10);
        if (iLastIndexOf != -1) {
            length = (str.length() - iLastIndexOf) - 1;
        } else {
            length = str.length() + this.column;
        }
        this.column = length;
    }

    public void close() throws IOException {
        FlushType flushType = this.nextFlush;
        if (flushType != null) {
            flush(flushType);
        }
        this.closed = true;
    }

    public char lastChar() {
        return this.out.lastChar;
    }

    public void wrappingSpace(int i) throws IOException {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        FlushType flushType = this.nextFlush;
        if (flushType != null) {
            flush(flushType);
        }
        this.column++;
        this.nextFlush = FlushType.SPACE;
        this.indentLevel = i;
    }

    public void zeroWidthSpace(int i) throws IOException {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        if (this.column == 0) {
            return;
        }
        FlushType flushType = this.nextFlush;
        if (flushType != null) {
            flush(flushType);
        }
        this.nextFlush = FlushType.EMPTY;
        this.indentLevel = i;
    }

    public static final class RecordingAppendable implements Appendable {
        private final Appendable delegate;
        char lastChar = 0;

        public RecordingAppendable(Appendable appendable) {
            this.delegate = appendable;
        }

        @Override // java.lang.Appendable
        public Appendable append(CharSequence charSequence) throws IOException {
            int length = charSequence.length();
            if (length != 0) {
                this.lastChar = charSequence.charAt(length - 1);
            }
            return this.delegate.append(charSequence);
        }

        @Override // java.lang.Appendable
        public Appendable append(CharSequence charSequence, int i, int i2) throws IOException {
            return append(charSequence.subSequence(i, i2));
        }

        @Override // java.lang.Appendable
        public Appendable append(char c2) throws IOException {
            this.lastChar = c2;
            return this.delegate.append(c2);
        }
    }
}
