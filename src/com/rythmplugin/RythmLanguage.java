package com.rythmplugin;

import com.intellij.lang.Language;
import com.intellij.psi.templateLanguages.TemplateLanguage;

/**
 * Created by mpl on 04.08.2016.
 */
public class RythmLanguage  extends Language implements TemplateLanguage {
    public static final RythmLanguage INSTANCE = new RythmLanguage();


    private RythmLanguage() {
        super("Rythm");

    }
}
