package baitap4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        FootballTeam[] footballTeams = new FootballTeam[6];
        footballTeams[0] = new FootballTeam(1, "Team1", 10, 15);
        footballTeams[1] = new FootballTeam(2, "Team2", 10, 17);
        footballTeams[2] = new FootballTeam(3, "Team3", 10, 21);
        footballTeams[3] = new FootballTeam(4, "Team4", 10, 13);
        footballTeams[4] = new FootballTeam(5, "Team5", 10, 14);
        footballTeams[5] = new FootballTeam(6, "Team6", 10, 35);
        System.out.println("Danh sách các Team đầu vào");
        for (FootballTeam t: footballTeams) {
            System.out.println(t);
        }
        //Sắp xếp nổi bọt 1 tham số
        Sorting.bubbleSort(footballTeams);
        //Sắp xếp nổi bọt 2 tham số
        Sorting.bubbleSort(footballTeams,(o1, o2)->o2.getScore()-o1.getScore());
        //Sắp xếp chọn 1 tham số
        Sorting.selectionSort(footballTeams);
        //Sắp xếp chọn 2 tham số
        Sorting.selectionSort(footballTeams,(o1, o2)->o2.getScore()-o1.getScore());
        //Sắp xếp chèn 1 tham số
        Sorting.insertionSort(footballTeams);
        //Sắp xếp chèn 2 tham số
        Sorting.insertionSort(footballTeams,(o1, o2)->o2.getScore()-o1.getScore());
        System.out.println("Danh sách các Team sau khi được sắp xếp");
        for (FootballTeam t: footballTeams) {
            System.out.println(t);
        }

    }
}
