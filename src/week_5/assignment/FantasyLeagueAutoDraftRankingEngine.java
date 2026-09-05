package week_5.assignment;

import java.util.Arrays;

public class FantasyLeagueAutoDraftRankingEngine {

    static class Player implements Comparable<Player> {
        String name;
        int matchesPlayed;
        double battingAverage;
        boolean injured;

        Player(String name, int matchesPlayed,
               double battingAverage, boolean injured) {
            this.name = name;
            this.matchesPlayed = matchesPlayed;
            this.battingAverage = battingAverage;
            this.injured = injured;
        }

        @Override
        public int compareTo(Player other) {
            return Double.compare(other.battingAverage, this.battingAverage);
        }
    }

    // Rule 1: experienced players
    static boolean isDraftable(int matchesPlayed) {
        return matchesPlayed >= 10;
    }

    // Rule 2: newer players need experience + fitness
    static boolean isDraftable(int matchesPlayed, boolean injured) {
        return matchesPlayed >= 5 && !injured;
    }

    static String draftAndRank(Player[] players) {

        int count = 0;

        for (Player player : players) {
            if (isDraftable(player.matchesPlayed)
                    || isDraftable(player.matchesPlayed, player.injured)) {
                count++;
            }
        }

        Player[] draftablePlayers = new Player[count];

        int index = 0;

        for (Player player : players) {
            if (isDraftable(player.matchesPlayed)
                    || isDraftable(player.matchesPlayed, player.injured)) {
                draftablePlayers[index] = player;
                index++;
            }
        }

        Arrays.sort(draftablePlayers);

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < draftablePlayers.length; i++) {
            result.append(i + 1)
                    .append(". ")
                    .append(draftablePlayers[i].name);

            if (i < draftablePlayers.length - 1) {
                result.append(" | ");
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {

        Player[] players = {
                new Player("Virat", 15, 48.0, false),
                new Player("Rohit", 7, 55.0, false),
                new Player("Sameer", 3, 60.0, false),
                new Player("Dev", 12, 20.0, true)
        };

        System.out.println(draftAndRank(players));
    }
}