package com.skplanet.h6_command;

/**
 * Created by 1000773 on 2017. 10. 12..
 */
public interface Command {
    void execute();
    void undo();
}
