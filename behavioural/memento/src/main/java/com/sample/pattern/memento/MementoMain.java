package com.sample.pattern.memento;

public class MementoMain {
    public static void main(String[] args) {
        TextMementosHolder holder = new TextMementosHolder();
        TextStatusController controller =  new TextStatusController();
        controller.setFontColor(FontColor.BLUE);
        controller.setFontFamily("Verdana");
        controller.setFontSize(12);
        holder.add(controller.save());
        System.out.println(controller.toString());

        controller.setFontColor(FontColor.GREEN);
        controller.setFontFamily("Comic Sans");
        controller.setFontSize(13);
        holder.add(controller.save());
        System.out.println(controller.toString());

        controller.setFontSize(14);
        controller.setFontFamily("Arial");
        controller.setFontColor(FontColor.WHITE);
        holder.add(controller.save());
        System.out.println(controller.toString());

        System.out.println(holder.undo());
        System.out.println(holder.undo());
        System.out.println(holder.redo());
        System.out.println(holder.redo());
    }
}
