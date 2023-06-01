package entities;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "trip")
public class Trip {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "trip_id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "date")
    private Date date;

    @Column(name = "time")
    private Time time;

    @Column(name = "location")
    private String location;

    @Column(name = "duration")
    private String duration;

    @Column(name = "packing_list")
    private String packing_list;

    @Column(name = "activ")
    private int activ;


    @ManyToMany
    @JoinTable(name = "account_trip",
            joinColumns = {@JoinColumn(name = "trip_id")},
            inverseJoinColumns = {@JoinColumn(name = "account_id")})
    private List<Account> accounts = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "guide_id")
    private Guide guide;


    public Trip() {
    }

    public Trip(Long id, String name, Date date, Time time, String location, String duration, String packing_list, int activ, List<Account> accounts, Guide guide) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.time = time;
        this.location = location;
        this.duration = duration;
        this.packing_list = packing_list;
        this.activ = activ;
        this.accounts = accounts;
        this.guide = guide;
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

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    public Guide getGuide() {
        return guide;
    }

    public void setGuide(Guide guide) {
        this.guide = guide;
    }

    @Override
    public String toString() {
        return "Trip{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", date=" + date +
                ", time=" + time +
                ", location='" + location + '\'' +
                ", duration='" + duration + '\'' +
                ", packing_list='" + packing_list + '\'' +
                ", activ=" + activ +
                ", accounts=" + accounts +
                ", guide=" + guide +
                '}';
    }
}