package org.scilab.forge.jlatexmath;

import com.oplus.aiunit.vision.xpj;

/* JADX INFO: loaded from: classes11.dex */
public class InvalidDelimiterException extends JMathTeXException {
    private static final long serialVersionUID = 212553180078002724L;

    public InvalidDelimiterException(String str) {
        super("The symbol with the name '" + str + "' is not defined as a delimiter (del='true') in '" + xpj.RESOURCE_NAME + "'!");
    }

    public InvalidDelimiterException(char c2, String str) {
        super("The character '" + c2 + "' is mapped to a symbol with the name '" + str + "', but that symbol is not defined as a delimiter (del='true') in '" + xpj.RESOURCE_NAME + "'!");
    }
}
