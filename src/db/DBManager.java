package db;

import model.Footballer;

import java.util.ArrayList;
import java.util.List;

public class DBManager {
    private static List<Footballer> footballerList = new ArrayList<>();

    static {
        footballerList.add(new Footballer(1L, "Abzal", "Beisebekov", 50000, "Kairat", 100000));
        footballerList.add(new Footballer(2L, "Alibek", "Kassym", 65000, "Zhetisu", 120000));
        footballerList.add(new Footballer(3L, "Nuraly", "Alyp", 23000, "Ordabasy", 47000));
    }

    public static void addFootballer(Footballer footballer) {
        footballerList.add(footballer);
    }

    public static ArrayList<Footballer> getAllFootballers() {
        ArrayList<Footballer> allFootballers = new ArrayList<>();
        for (Footballer footballer : footballerList) {
            allFootballers.add(footballer);
        }
        return allFootballers;
    }
}
