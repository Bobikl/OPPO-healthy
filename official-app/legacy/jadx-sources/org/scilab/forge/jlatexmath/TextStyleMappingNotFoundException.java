package org.scilab.forge.jlatexmath;

import com.oplus.aiunit.vision.x65;

/* JADX INFO: loaded from: classes11.dex */
public class TextStyleMappingNotFoundException extends JMathTeXException {
    private static final long serialVersionUID = 4887043712790844966L;

    public TextStyleMappingNotFoundException(String str) {
        super("No mapping found for the text style '" + str + "'! Insert a <" + x65.STYLE_MAPPING_EL + ">-element in '" + x65.RESOURCE_NAME + "'.");
    }
}
