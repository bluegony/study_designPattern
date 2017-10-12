package com.skplanet.h6_command;

/**
 * Created by 1000773 on 2017. 10. 12..
 */
public class SimpleRemoteControl {

    Command slot;

    public void buttonPressed() {
        slot.execute();
    }
    public void undoButtonPressed() {
        slot.undo();
    }

    public void setSlot(Command slot) {
        this.slot = slot;
    }
}
