package com.google.zxing.client.result;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public final class ISBNParsedResult extends ParsedResult {
    private final String isbn;

    public ISBNParsedResult(String str) {
        super(ParsedResultType.ISBN);
        this.isbn = str;
    }

    @Override // com.google.zxing.client.result.ParsedResult
    public String getDisplayResult() {
        return this.isbn;
    }

    public String getISBN() {
        return this.isbn;
    }
}
