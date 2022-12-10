package by.bsuir.Pestunov.server.command;

import by.bsuir.Pestunov.server.command.exception.CommandException;

public interface Command {
    String complete(Object caller, String request) throws CommandException;
}
