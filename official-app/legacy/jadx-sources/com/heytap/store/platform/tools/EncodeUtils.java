package com.heytap.store.platform.tools;

import android.text.Html;
import android.util.Base64;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.CharsKt__CharJVMKt;
import p010kotlin.text.Charsets;
import p010kotlin.text.Regex;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u0012\u0010\t\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0012\u0010\r\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006¨\u0006\u0011"}, d2 = {"Lcom/heytap/store/platform/tools/EncodeUtils;", "", "()V", "base64Decode", "", "input", "", "base64Encode", "base64Encode2String", "binaryDecode", "binaryEncode", "htmlDecode", "", "htmlEncode", "urlDecode", "charsetName", "urlEncode", "utils_release"}, k = 1, mv = {1, 4, 0})
public final class EncodeUtils {
    public static final EncodeUtils INSTANCE = new EncodeUtils();

    private EncodeUtils() {
    }

    @Nullable
    public final byte[] base64Decode(@Nullable String input) {
        if (input != null) {
            if (!(input.length() == 0)) {
                return Base64.decode(input, 2);
            }
        }
        return new byte[0];
    }

    @Nullable
    public final byte[] base64Encode(@NotNull String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        byte[] bytes = input.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
        return base64Encode(bytes);
    }

    @Nullable
    public final String base64Encode2String(@Nullable byte[] input) {
        if (input != null) {
            if (!(input.length == 0)) {
                return Base64.encodeToString(input, 2);
            }
        }
        return "";
    }

    @Nullable
    public final String binaryDecode(@Nullable String input) {
        if (input == null) {
            return "";
        }
        if (input.length() == 0) {
            return "";
        }
        Object[] array = new Regex(" ").split(input, 0).toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        StringBuilder sb = new StringBuilder();
        for (String str : (String[]) array) {
            sb.append((char) Integer.parseInt(str, CharsKt__CharJVMKt.checkRadix(2)));
        }
        return sb.toString();
    }

    @Nullable
    public final String binaryEncode(@Nullable String input) {
        if (input == null) {
            return "";
        }
        if (input.length() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        char[] charArray = input.toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray, "(this as java.lang.String).toCharArray()");
        for (char c2 : charArray) {
            sb.append(Integer.toBinaryString(c2));
            sb.append(" ");
        }
        return sb.deleteCharAt(sb.length() - 1).toString();
    }

    @Nullable
    public final CharSequence htmlDecode(@Nullable String input) {
        if (input != null) {
            return input.length() == 0 ? "" : Html.fromHtml(input, 0);
        }
        return "";
    }

    @Nullable
    public final String htmlEncode(@Nullable CharSequence input) {
        if (input == null) {
            return "";
        }
        if (input.length() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int length = input.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = input.charAt(i);
            if (cCharAt == '\"') {
                sb.append("&quot;");
            } else if (cCharAt == '<') {
                sb.append("&lt;");
            } else if (cCharAt == '>') {
                sb.append("&gt;");
            } else if (cCharAt == '&') {
                sb.append("&amp;");
            } else if (cCharAt != '\'') {
                sb.append(cCharAt);
            } else {
                sb.append("&#39;");
            }
        }
        return sb.toString();
    }

    @Nullable
    public final String urlDecode(@Nullable String input) {
        return urlDecode(input, "UTF-8");
    }

    @Nullable
    public final String urlEncode(@Nullable String input) {
        return urlEncode(input, "UTF-8");
    }

    @Nullable
    public final byte[] base64Decode(@Nullable byte[] input) {
        if (input != null) {
            if (!(input.length == 0)) {
                return Base64.decode(input, 2);
            }
        }
        return new byte[0];
    }

    @Nullable
    public final byte[] base64Encode(@Nullable byte[] input) {
        if (input != null) {
            if (!(input.length == 0)) {
                return Base64.encode(input, 2);
            }
        }
        return new byte[0];
    }

    @Nullable
    public final String urlDecode(@Nullable String input, @Nullable String charsetName) {
        if (input != null) {
            if (!(input.length() == 0)) {
                try {
                    return URLDecoder.decode(new Regex("\\+").replace(new Regex("%(?![0-9a-fA-F]{2})").replace(input, "%25"), "%2B"), charsetName);
                } catch (UnsupportedEncodingException e2) {
                    throw new AssertionError(e2);
                }
            }
        }
        return "";
    }

    @Nullable
    public final String urlEncode(@Nullable String input, @Nullable String charsetName) {
        if (input != null) {
            if (!(input.length() == 0)) {
                try {
                    return URLEncoder.encode(input, charsetName);
                } catch (UnsupportedEncodingException e2) {
                    throw new AssertionError(e2);
                }
            }
        }
        return "";
    }
}
