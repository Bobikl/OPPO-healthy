package com.oplus.aiunit.vision;

import io.netty.util.internal.StringUtil;
import okio.Utf8;

/* JADX INFO: loaded from: classes11.dex */
public class m8e {
    public static final String CLOSETAG = "</[A-Za-z][A-Za-z0-9-]*\\s*[>]";
    public static int CODE_BLOCK_INDENT = 4;
    public static final String OPENTAG = "<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>";

    public static int a(int i) {
        return 4 - (i % 4);
    }

    public static int b(char c2, CharSequence charSequence, int i) {
        int length = charSequence.length();
        while (i < length) {
            if (charSequence.charAt(i) == c2) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static int c(CharSequence charSequence, int i) {
        int length = charSequence.length();
        while (i < length) {
            char cCharAt = charSequence.charAt(i);
            if (cCharAt == '\n' || cCharAt == '\r') {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static int d(CharSequence charSequence, int i) {
        int length = charSequence.length();
        while (i < length) {
            char cCharAt = charSequence.charAt(i);
            if (cCharAt != ' ') {
                switch (cCharAt) {
                    case '\t':
                    case '\n':
                    case 11:
                    case '\f':
                    case '\r':
                        break;
                    default:
                        return i;
                }
            }
            i++;
        }
        return -1;
    }

    public static boolean e(CharSequence charSequence) {
        int length = charSequence.length();
        return k(StringUtil.SPACE, charSequence, 0, length) != length;
    }

    public static boolean f(CharSequence charSequence) {
        return d(charSequence, 0) == -1;
    }

    public static boolean g(CharSequence charSequence, int i) {
        if (i >= charSequence.length()) {
            return false;
        }
        char cCharAt = charSequence.charAt(i);
        switch (cCharAt) {
            case '!':
            case '\"':
            case '#':
            case '$':
            case '%':
            case '&':
            case '\'':
            case '(':
            case ')':
            case '*':
            case '+':
            case ',':
            case '-':
            case '.':
            case '/':
                return true;
            default:
                switch (cCharAt) {
                    case ':':
                    case ';':
                    case '<':
                    case '=':
                    case '>':
                    case '?':
                    case '@':
                        return true;
                    default:
                        switch (cCharAt) {
                            case '[':
                            case '\\':
                            case ']':
                            case '^':
                            case '_':
                            case '`':
                                return true;
                            default:
                                switch (cCharAt) {
                                    case '{':
                                    case '|':
                                    case '}':
                                    case '~':
                                        return true;
                                    default:
                                        return false;
                                }
                        }
                }
        }
    }

    public static boolean h(CharSequence charSequence, int i) {
        return Character.isLetter(Character.codePointAt(charSequence, i));
    }

    public static boolean i(CharSequence charSequence, int i) {
        if (i >= charSequence.length()) {
            return false;
        }
        char cCharAt = charSequence.charAt(i);
        return cCharAt == '\t' || cCharAt == ' ';
    }

    public static CharSequence j(CharSequence charSequence) {
        int length = charSequence.length();
        StringBuilder sb = null;
        for (int i = 0; i < length; i++) {
            char cCharAt = charSequence.charAt(i);
            if (cCharAt == 0) {
                if (sb == null) {
                    sb = new StringBuilder(length);
                    sb.append(charSequence, 0, i);
                }
                sb.append(Utf8.REPLACEMENT_CHARACTER);
            } else if (sb != null) {
                sb.append(cCharAt);
            }
        }
        return sb != null ? sb.toString() : charSequence;
    }

    public static int k(char c2, CharSequence charSequence, int i, int i2) {
        while (i < i2) {
            if (charSequence.charAt(i) != c2) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static int l(char c2, CharSequence charSequence, int i, int i2) {
        while (i >= i2) {
            if (charSequence.charAt(i) != c2) {
                return i;
            }
            i--;
        }
        return i2 - 1;
    }

    public static int m(CharSequence charSequence, int i, int i2) {
        while (i < i2) {
            char cCharAt = charSequence.charAt(i);
            if (cCharAt != '\t' && cCharAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static int n(CharSequence charSequence, int i, int i2) {
        while (i >= i2) {
            char cCharAt = charSequence.charAt(i);
            if (cCharAt != '\t' && cCharAt != ' ') {
                return i;
            }
            i--;
        }
        return i2 - 1;
    }
}
