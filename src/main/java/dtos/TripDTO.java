package dtos;

import entities.Trip;

import java.sql.Time;
import java.util.Date;
import java.util.List;

public class TripDTO {

    private Long id;
    private String name;
    private Date date;
    private Time time;
    private String location;
    private String duration;
    private String packing_list;
    private int activ;

    public TripDTO() {
    }

    public TripDTO(long id,String name, Date date, Time time, String location, String duration, String packing_list, int activ) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.time = time;
        this.location = location;
        this.duration = duration;
        this.packing_list = packing_list;
        this.activ = activ;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getPacking_list() {
        return packing_list;
    }

    public void setPacking_list(String packing_list) {
        this.packing_list = packing_list;
    }

    public int getActiv() {
        return activ;
    }

    public void setActiv(int activ) {
        this.activ = activ;
    }

    @Override
    public String toString() {
        return "TripDTO{" +
                "name='" + name + '\'' +
                ", date=" + date +
                ", time=" + time +
                ", location='" + location + '\'' +
                ", duration='" + duration + '\'' +
                ", packing_list='" + packing_list + '\'' +
                ", activ=" + activ +
                '}';
    }
}
