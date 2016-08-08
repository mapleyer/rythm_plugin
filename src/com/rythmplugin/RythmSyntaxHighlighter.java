package com.rythmplugin;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.HighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import com.rythmplugin.psi.RythmTypes;
import com.sun.istack.internal.NotNull;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

/**
 * Created by mpl on 05.08.2016.
 */
public class RythmSyntaxHighlighter extends SyntaxHighlighterBase{
    public static final TextAttributesKey SEPARATOR = createTextAttributesKey("RYTHM_SEPARATOR", DefaultLanguageHighlighterColors.OPERATION_SIGN);
    public static final TextAttributesKey KEY = createTextAttributesKey("RYTHM_KEY", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey VALUE = createTextAttributesKey("RYTHM_VALUE", DefaultLanguageHighlighterColors.STRING);
    public static final TextAttributesKey COMMENT = createTextAttributesKey("RYTHM", DefaultLanguageHighlighterColors.LINE_COMMENT);
    public static final TextAttributesKey BAD_CHARACTER = createTextAttributesKey("RYTHM_BAD_CHARACTER", HighlighterColors.BAD_CHARACTER);
    public static final TextAttributesKey AT = createTextAttributesKey("RYTHM_AT", HighlighterColors.TEXT);
    public static final TextAttributesKey AT_FOR = createTextAttributesKey("RYTHM_AT_FOR", HighlighterColors.TEXT);
    public static final TextAttributesKey AT_IF = createTextAttributesKey("RYTHM_AT_IF", HighlighterColors.TEXT);
    public static final TextAttributesKey AT_WHILE = createTextAttributesKey("RYTHM_AT_WHILE", HighlighterColors.TEXT);



private static final TextAttributesKey[] BAD_CHAR_KEYS = new TextAttributesKey[]{BAD_CHARACTER};
    private static final TextAttributesKey[] SEPARATOR_KEYS = new TextAttributesKey[]{SEPARATOR};
    private static final TextAttributesKey[] KEYS_KEYS = new TextAttributesKey[]{KEY};
    private static final TextAttributesKey[] VALUE_KEYS = new TextAttributesKey[]{VALUE};
    private static final TextAttributesKey[] COMMENT_KEYS = new TextAttributesKey[]{COMMENT};
    private static final TextAttributesKey[] EMPTY_KEYS = new TextAttributesKey[0];

    private static final TextAttributesKey[] AT_KEYS = new TextAttributesKey[]{AT};
    private static final TextAttributesKey[] AT_FOR_KEYS = new TextAttributesKey[]{AT_FOR};
    private static final TextAttributesKey[] AT_WHILE_KEYS = new TextAttributesKey[]{AT_WHILE};
    private static final TextAttributesKey[] AT_IF_KEYS = new TextAttributesKey[]{AT_IF};




    @NotNull
    @Override

    public Lexer getHighlightingLexer(){
        return new RythmLexerAdapter();
    }

    @NotNull
    @Override
    public TextAttributesKey[] getTokenHighlights(IElementType tokenType){
        if(tokenType.equals(RythmTypes.SEPARATOR)){
            return SEPARATOR_KEYS;
        }else if (tokenType.equals(RythmTypes.KEY)){
            return KEYS_KEYS;
        }else if (tokenType.equals(RythmTypes.VALUE)){
            return VALUE_KEYS;
        }else if (tokenType.equals(RythmTypes.COMMENT)){
            return COMMENT_KEYS;
        }else if (tokenType.equals(TokenType.BAD_CHARACTER)){
            return BAD_CHAR_KEYS;

        }else if(tokenType.equals(RythmTypes.AT)){
            return AT_KEYS;
        }else if (tokenType.equals(RythmTypes.AT_FOR)){
           return AT_FOR_KEYS;
        }else if(tokenType.equals(RythmTypes.AT_WHILE)){
            return AT_WHILE_KEYS;
        }else if(tokenType.equals(RythmTypes.AT_IF)){
            return AT_IF_KEYS;
        }else{
            return EMPTY_KEYS;
        }
    }


}
