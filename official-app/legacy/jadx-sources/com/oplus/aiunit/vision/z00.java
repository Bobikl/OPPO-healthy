package com.oplus.aiunit.vision;

import org.scilab.forge.jlatexmath.AlphabetRegistrationException;

/* JADX INFO: loaded from: classes11.dex */
public interface z00 {
    public static final Character.UnicodeBlock[] JLM_GREEK = {Character.UnicodeBlock.GREEK, Character.UnicodeBlock.GREEK_EXTENDED};
    public static final Character.UnicodeBlock[] JLM_CYRILLIC = {Character.UnicodeBlock.CYRILLIC};

    String a();

    Character.UnicodeBlock[] b();

    Object getPackage() throws AlphabetRegistrationException;
}
