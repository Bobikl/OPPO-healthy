package com.google.zxing.qrcode.detector;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public final class FinderPatternInfo {
    private final FinderPattern bottomLeft;
    private final FinderPattern topLeft;
    private final FinderPattern topRight;

    public FinderPatternInfo(FinderPattern[] finderPatternArr) {
        this.bottomLeft = finderPatternArr[0];
        this.topLeft = finderPatternArr[1];
        this.topRight = finderPatternArr[2];
    }

    public FinderPattern getBottomLeft() {
        return this.bottomLeft;
    }

    public FinderPattern getTopLeft() {
        return this.topLeft;
    }

    public FinderPattern getTopRight() {
        return this.topRight;
    }
}
