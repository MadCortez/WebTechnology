package by.bsuir.Pestunov.server.command.impl;

import by.bsuir.Pestunov.server.command.Command;
import by.bsuir.Pestunov.server.command.exception.CommandException;
import by.bsuir.Pestunov.server.model.AuthType;
import by.bsuir.Pestunov.server.service.ServiceFactory;

public class CreateCommand implements Command {
    public String complete(Object caller, String request) throws CommandException {
        String[] arguments = request.split(" ");
        if (arguments.length != 3) throw new CommandException("CREATE invalid syntax");

        System.out.println(arguments[0] + " " + arguments[1] + " " + arguments[2] + "\n");

        if (ServiceFactory.getInstance().getAuthService().getAuthType(caller) != AuthType.MANAGER)
            return "Should be MANAGER";

        ServiceFactory.getInstance().getCaseService().addCase(arguments[1], arguments[2]);
        return "Success";
    }
}
