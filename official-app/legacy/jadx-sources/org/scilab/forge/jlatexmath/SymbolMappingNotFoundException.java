package org.scilab.forge.jlatexmath;

import com.oplus.aiunit.vision.x65;

/* JADX INFO: loaded from: classes11.dex */
public class SymbolMappingNotFoundException extends JMathTeXException {
    private static final long serialVersionUID = 2659192520874275262L;

    public SymbolMappingNotFoundException(String str) {
        super("No mapping found for the symbol '" + str + "'! Insert a <" + x65.SYMBOL_MAPPING_EL + ">-element in '" + x65.RESOURCE_NAME + "'.");
    }
}
