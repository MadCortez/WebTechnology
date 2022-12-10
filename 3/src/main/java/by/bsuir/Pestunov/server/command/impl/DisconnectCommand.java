package by.bsuir.Pestunov.server.command.impl;

import by.bsuir.Pestunov.server.command.Command;
import by.bsuir.Pestunov.server.command.exception.CommandException;
import by.bsuir.Pestunov.server.model.AuthType;
import by.bsuir.Pestunov.server.service.ServiceFactory;

public class DisconnectCommand implements Command {
    public String complete(Object caller, String request) throws CommandException {
        ServiceFactory.getInstance().getAuthService().setAuthType(caller, AuthType.UNAUTH);
        return "Bye bye!";
    }
}
