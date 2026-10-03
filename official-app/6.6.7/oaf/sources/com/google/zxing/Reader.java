package com.google.zxing;

import java.util.Map;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public interface Reader {
    Result decode(BinaryBitmap binaryBitmap) throws NotFoundException, ChecksumException, FormatException;

    Result decode(BinaryBitmap binaryBitmap, Map<DecodeHintType, ?> map) throws NotFoundException, ChecksumException, FormatException;

    void reset();
}
