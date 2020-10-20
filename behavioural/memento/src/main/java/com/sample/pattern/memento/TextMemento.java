package com.sample.pattern.memento;

public class TextMemento {
    private String fontFamily = "Times New Roman";
    private int fontSize = 11;
    private FontColor color = FontColor.BLACK;

    public TextMemento(String fontFamily, int fontSize, FontColor color) {
        this.fontFamily = fontFamily;
        this.fontSize = fontSize;
        this.color = color;
    }

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

    public FontColor getColor() {
        return color;
    }

    public void setColor(FontColor color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "TextMemento{" +
                "fontFamily='" + fontFamily + '\'' +
                ", fontSize=" + fontSize +
                ", color=" + color +
                '}';
    }
}

enum FontColor {
    WHITE,
    BLACK,
    BLUE,
    GREEN
        }