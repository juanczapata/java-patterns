package com.sample.pattern.memento;

public class TextStatusController {
    private String fontFamily;
    private int fontSize;
    private FontColor fontColor;

    public String getFontFamily() {
        return fontFamily;
    }

    public void setFontFamily(String fontFamily) {
        this.fontFamily = fontFamily;
    }

    public int getFontSize() {
        return fontSize;
    }

    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }

    public FontColor getFontColor() {
        return fontColor;
    }

    public void setFontColor(FontColor fontColor) {
        this.fontColor = fontColor;
    }

    public TextMemento save() {
        return new TextMemento(this.fontFamily, this.fontSize, this.fontColor);
    }

    public void restore(TextMemento previousMenento) {
        this.fontFamily = previousMenento.getFontFamily();
        this.fontSize = previousMenento.getFontSize();
        this.fontColor = previousMenento.getColor();
    }

    @Override
    public String toString() {
        return "TextStatusController{" +
                "fontFamily='" + fontFamily + '\'' +
                ", fontSize=" + fontSize +
                ", fontColor=" + fontColor +
                '}';
    }
}
