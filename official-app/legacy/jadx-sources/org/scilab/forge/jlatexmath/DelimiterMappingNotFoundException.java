package org.scilab.forge.jlatexmath;

import com.oplus.aiunit.vision.upj;

/* JADX INFO: loaded from: classes11.dex */
public class DelimiterMappingNotFoundException extends JMathTeXException {
    private static final long serialVersionUID = 273456491396361682L;

    public DelimiterMappingNotFoundException(char c2) {
        super("No mapping found for the character '" + c2 + "'! Insert a <" + upj.CHARTODEL_MAPPING_EL + ">-element in '" + upj.RESOURCE_NAME + "'.");
    }
}
