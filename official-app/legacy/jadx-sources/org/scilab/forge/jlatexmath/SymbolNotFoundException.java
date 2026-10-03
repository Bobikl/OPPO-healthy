package org.scilab.forge.jlatexmath;

import com.oplus.aiunit.vision.xpj;

/* JADX INFO: loaded from: classes11.dex */
public class SymbolNotFoundException extends JMathTeXException {
    private static final long serialVersionUID = -3005021333407670912L;

    public SymbolNotFoundException(String str) {
        super("There's no symbol with the name '" + str + "' defined in '" + xpj.RESOURCE_NAME + "'!");
    }
}
