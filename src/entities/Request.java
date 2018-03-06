package entities;

import java.util.Date;

/**
 *
 * @author alu2015018
 */
public class Request {

    public String name;
    public String lobby;
    public Date startReserve;
    public Date endReserve;
    public String days;
    public String hours;

    public Request() {
    }

    public Request(String name, String lobby, Date startReserve, Date endReserve, String days, String hours) {
        this.name = name;
        this.lobby = lobby;
        this.startReserve = startReserve;
        this.endReserve = endReserve;
        this.days = days;
        this.hours = hours;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLobby() {
        return lobby;
    }

    public void setLobby(String lobby) {
        this.lobby = lobby;
    }

    public Date getStartReserve() {
        return startReserve;
    }

    public void setStartReserve(Date startReserve) {
        this.startReserve = startReserve;
    }

    public Date getEndReserve() {
        return endReserve;
    }

    public void setEndReserve(Date endReserve) {
        this.endReserve = endReserve;
    }

    public String getDays() {
        return days;
    }

    public void setDays(String days) {
        this.days = days;
    }

    public String getHours() {
        return hours;
    }

    public void setHours(String hours) {
        this.hours = hours;
    }

    @Override
    public String toString() {
        return "request [name=" + name + ", lobby=" + lobby + ", startReserve=" + startReserve + ", endReserve="
                + endReserve + ", days=" + days + ", hours=" + hours + "]";
    }

}
