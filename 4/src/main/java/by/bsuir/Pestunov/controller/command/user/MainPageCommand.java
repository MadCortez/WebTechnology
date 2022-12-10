package by.bsuir.Pestunov.controller.command.user;

import by.bsuir.Pestunov.controller.command.Command;
import by.bsuir.Pestunov.controller.command.CommandResult;
import by.bsuir.Pestunov.entity.Room;
import by.bsuir.Pestunov.exception.ServiceException;
import by.bsuir.Pestunov.service.RoomService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public class MainPageCommand implements Command {

    private static final String MAIN_PAGE = "/WEB-INF/pages/makeOrder.jsp";
    private static final String ROOM_LIST = "roomList";

    @Override
    public CommandResult execute(HttpServletRequest request, HttpServletResponse response) throws ServiceException {
        RoomService roomService = new RoomService();
        List<Room> freeRoomList = roomService.findFree();
        request.setAttribute(ROOM_LIST, freeRoomList);
        return CommandResult.forward(MAIN_PAGE);
    }
}
