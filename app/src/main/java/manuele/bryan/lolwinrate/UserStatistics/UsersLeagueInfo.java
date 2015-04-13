package manuele.bryan.lolwinrate.UserStatistics;

import java.util.HashMap;

public class UsersLeagueInfo {
    public static final String QUEUE_RANKED_SOLO_FIVES = "RANKED_SOLO_5x5";
    public static final String QUEUE_RANKED_TEAM_FIVES = "RANKED_TEAM_5x5";
    public static final String QUEUE_RANKED_TEAM_THREE = "RANKED_TEAM_3X3";

    public static final String DIVISION_BRONZE = "BRONZE";
    public static final String DIVISION_SILVER = "SILVER";
    public static final String DIVISION_GOLD = "GOLD";
    public static final String DIVISION_PLAT = "PLATINUM";
    public static final String DIVISION_DIAMOND = "DIAMOND";
    public static final String DIVISION_MASTERS = "MASTER";
    public static final String DIVISION_CHALLENGER = "CHALLENGER";

    public HashMap<String, RankedQueue> queuesList;

    public UsersLeagueInfo(HashMap<String, RankedQueue> queuesList) {
        this.queuesList = queuesList;
    }

    public static class RankedQueue {

        public String divisionName;
        public String tier;
        public String queueType;

        public String teamOrPlayerName;
        public String division;
        public int leaguePoints;
        public int wins;
        public int losses;
        public boolean isHotStreak;
        public boolean isVeteran;
        public boolean isFreshBlood;
        public boolean isInactive;

        public boolean isInSeries;
        public int seriesWins;
        public int seriesLosses;

        public RankedQueue(String divisionName, String tier, String queueType, String teamOrPlayerName, String division,
                           int leaguePoints, int wins, int losses,
                           boolean isHotStreak, boolean isVeteran, boolean isFreshBlood, boolean isInactive,
                           boolean isInSeries, int seriesWins, int seriesLosses) {

            this.divisionName = divisionName;
            this.tier = tier;
            this.queueType = queueType;

            this.teamOrPlayerName = teamOrPlayerName;
            this.queueType = queueType;
            this.division = division;
            this.leaguePoints = leaguePoints;
            this.wins = wins;
            this.losses = losses;
            this.isHotStreak = isHotStreak;
            this.isVeteran = isVeteran;
            this.isFreshBlood = isFreshBlood;
            this.isInactive = isInactive;
            this.isInSeries = isInSeries;
            this.seriesWins = seriesWins;
            this.seriesLosses = seriesLosses;
        }

    }

    public static String getQueueTypePlainText(String queue) {
        switch (queue) {
            case QUEUE_RANKED_SOLO_FIVES:
                return "Solo Queue";
            case QUEUE_RANKED_TEAM_FIVES:
                return "Team 5v5";
            case QUEUE_RANKED_TEAM_THREE:
                return "Team 3v3";
            default:
                return "Ranked";
        }
    }

}
