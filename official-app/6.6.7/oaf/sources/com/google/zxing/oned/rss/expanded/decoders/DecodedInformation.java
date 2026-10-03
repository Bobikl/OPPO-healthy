package com.google.zxing.oned.rss.expanded.decoders;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
final class DecodedInformation extends DecodedObject {
    private final String newString;
    private final boolean remaining;
    private final int remainingValue;

    public DecodedInformation(int i, String str) {
        super(i);
        this.newString = str;
        this.remaining = false;
        this.remainingValue = 0;
    }

    public String getNewString() {
        return this.newString;
    }

    public int getRemainingValue() {
        return this.remainingValue;
    }

    public boolean isRemaining() {
        return this.remaining;
    }

    public DecodedInformation(int i, String str, int i2) {
        super(i);
        this.remaining = true;
        this.remainingValue = i2;
        this.newString = str;
    }
}
