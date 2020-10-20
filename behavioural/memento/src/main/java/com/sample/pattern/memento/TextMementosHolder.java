package com.sample.pattern.memento;

import java.util.ArrayList;
import java.util.List;

public class TextMementosHolder {
    private List<TextMemento> mementos;
    private int currentVersion = -1;

    public TextMementosHolder() {
        this.mementos = new ArrayList<TextMemento>();
    }

    public void add(TextMemento newMemento) {
        mementos.add(newMemento);
        this.currentVersion = this.mementos.size() - 1;
    }

    private TextMemento getTextMemento(int index) {
        return this.mementos.get(index);
    }

    public TextMemento undo() {
        System.out.println("Undoing ...");

        if(this.currentVersion < 0) {
            return new TextMemento("", 0, null);
        }

        if(this.currentVersion == 0) {
            this.currentVersion = 0;
            return this.getTextMemento(0);
        }
        return this.getTextMemento(--this.currentVersion);
    }

    public TextMemento redo() {
        System.out.println("Redoing ...");
        if(this.currentVersion >= this.mementos.size() -1) {
            this.currentVersion = this.mementos.size() - 1;
            return this.getTextMemento(this.currentVersion);
        }
        return this.getTextMemento(++this.currentVersion);
    }
}
