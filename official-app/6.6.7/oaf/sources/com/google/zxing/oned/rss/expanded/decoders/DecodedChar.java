package com.google.zxing.oned.rss.expanded.decoders;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
final class DecodedChar extends DecodedObject {
    static final char FNC1 = '$';
    private final char value;

    public DecodedChar(int i, char c) {
        super(i);
        this.value = c;
    }

    public char getValue() {
        return this.value;
    }

    public boolean isFNC1() {
        return this.value == '$';
    }
}
