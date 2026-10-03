package com.heytap.log.util;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes19.dex */
public class UTF8Validator {
    public static String convertToUTF8(String str) {
        return isValidUTF8(str) ? str : convertToValidUTF8(str);
    }

    private static String convertToValidUTF8(String str) {
        CharsetDecoder charsetDecoderNewDecoder = StandardCharsets.UTF_8.newDecoder();
        charsetDecoderNewDecoder.onMalformedInput(CodingErrorAction.REPLACE);
        charsetDecoderNewDecoder.onUnmappableCharacter(CodingErrorAction.REPLACE);
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(str.getBytes(StandardCharsets.UTF_8));
        CharBuffer charBufferAllocate = CharBuffer.allocate(str.length());
        charsetDecoderNewDecoder.decode(byteBufferWrap, charBufferAllocate, true);
        charsetDecoderNewDecoder.flush(charBufferAllocate);
        return charBufferAllocate.flip().toString();
    }

    private static boolean isValidUTF8(String str) {
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bytes);
        CharBuffer charBufferAllocate = CharBuffer.allocate(bytes.length);
        while (byteBufferWrap.hasRemaining()) {
            try {
                charBufferAllocate.put((char) byteBufferWrap.get());
            } catch (Exception unused) {
                return false;
            }
        }
        return true;
    }
}
