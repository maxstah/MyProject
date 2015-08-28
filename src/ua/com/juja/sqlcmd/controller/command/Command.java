package ua.com.juja.sqlcmd.controller.command;

/**
 * Created by indigo on 28.08.2015.
 */
public interface Command {

    boolean canProcess(String command);

    void process(String command);
}
