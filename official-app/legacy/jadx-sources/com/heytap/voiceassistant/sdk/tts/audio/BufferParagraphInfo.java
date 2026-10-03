package com.heytap.voiceassistant.sdk.tts.audio;

/* JADX INFO: loaded from: classes19.dex */
public class BufferParagraphInfo {
    public String mark = "";
    public int paraIndex;
    public long paraLength;
    public String text;

    public BufferParagraphInfo(int i, String str, long j2) {
        this.paraIndex = i;
        this.text = str;
        this.paraLength = j2;
    }
}
