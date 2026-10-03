package com.badlogic.gdx.utils;

import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import com.oplus.aiunit.vision.qma;
import com.oplus.aiunit.vision.t0j;
import io.netty.util.internal.StringUtil;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes13.dex */
public enum JsonWriter$OutputType {
    json,
    javascript,
    minimal;

    private static Pattern javascriptPattern = Pattern.compile("^[a-zA-Z_$][a-zA-Z_$0-9]*$");
    private static Pattern minimalNamePattern = Pattern.compile("^[^\":,}/ ][^:]*$");
    private static Pattern minimalValuePattern = Pattern.compile("^[^\":,{\\[\\]/ ][^}\\],]*$");

    public String quoteName(String str) {
        t0j t0jVar = new t0j(str);
        t0jVar.B('\\', "\\\\").B(StringUtil.CARRIAGE_RETURN, "\\r").B('\n', "\\n").B('\t', "\\t");
        int i = qma.a[ordinal()];
        if (i != 1) {
            if (i == 2) {
            }
            return '\"' + t0jVar.B('\"', "\\\"").toString() + '\"';
        }
        if (!str.contains("//") && !str.contains("/*") && minimalNamePattern.matcher(t0jVar).matches()) {
            return t0jVar.toString();
        }
        if (javascriptPattern.matcher(t0jVar).matches()) {
            return t0jVar.toString();
        }
        return '\"' + t0jVar.B('\"', "\\\"").toString() + '\"';
    }

    public String quoteValue(Object obj) {
        int length;
        if (obj == null) {
            return "null";
        }
        String string = obj.toString();
        if ((obj instanceof Number) || (obj instanceof Boolean)) {
            return string;
        }
        t0j t0jVar = new t0j(string);
        t0jVar.B('\\', "\\\\").B(StringUtil.CARRIAGE_RETURN, "\\r").B('\n', "\\n").B('\t', "\\t");
        if (this == minimal && !string.equals(SpeechConstant.TRUE_STR) && !string.equals(SpeechConstant.FALSE_STR) && !string.equals("null") && !string.contains("//") && !string.contains("/*") && (length = t0jVar.length()) > 0 && t0jVar.charAt(length - 1) != ' ' && minimalValuePattern.matcher(t0jVar).matches()) {
            return t0jVar.toString();
        }
        return '\"' + t0jVar.B('\"', "\\\"").toString() + '\"';
    }
}
