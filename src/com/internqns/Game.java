package com.internqns;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Game {
    /*
    """
Given the following inputs:
- <game_data> is a list of dictionaries, with each dictionary representing a player's shot attempts in a game.
The list can be empty, but any dictionary in the list will include the following keys: gameID, playerID, gameDate,
 fieldGoal2Attempted, fieldGoal2Made, fieldGoal3Attempted, fieldGoal3Made, freeThrowAttempted, freeThrowMade.
 All values in this dictionary are ints, except for gameDate which is of type str in the format 'MM/DD/YYYY'
- <true_shooting_cutoff> is the minimum True Shooting percentage value for a player to qualify in a game.
It will be an int value >= 0.

- <player_count> is the number of players that need to meet the <true_shooting_cutoff> in order for a gameID to qualify.
 It will be an int value >= 0.

Implement find_qualified_games to return a list of unique qualified gameIDs in which at least <player_count>
 players have a True Shooting percentage >= <true_shooting_cutoff>, ordered from most to least recent game.
"""
*/
    public static void main(String[] args) throws ParseException {
        List<Map<String, Object>> gameData = new ArrayList<>();
        // Sample data
        Map<String, Object> player1 = new HashMap<>();
        player1.put("gameID", 1);
        player1.put("playerID", 101);
        player1.put("gameDate", "01/02/2024");
        player1.put("fieldGoal2Attempted", 10);
        player1.put("fieldGoal2Made", 5);
        player1.put("fieldGoal3Attempted", 4);
        player1.put("fieldGoal3Made", 2);
        player1.put("freeThrowAttempted", 3);
        player1.put("freeThrowMade", 3);

        Map<String, Object> player2 = new HashMap<>();
        player2.put("gameID", 1);
        player2.put("playerID", 102);
        player2.put("gameDate", "01/02/2024");
        player2.put("fieldGoal2Attempted", 8);
        player2.put("fieldGoal2Made", 4);
        player2.put("fieldGoal3Attempted", 5);
        player2.put("fieldGoal3Made", 3);
        player2.put("freeThrowAttempted", 2);
        player2.put("freeThrowMade", 2);

        Map<String, Object> player3 = new HashMap<>();
        player3.put("gameID", 2);
        player3.put("playerID", 101);
        player3.put("gameDate", "02/15/2024");
        player3.put("fieldGoal2Attempted", 12);
        player3.put("fieldGoal2Made", 6);
        player3.put("fieldGoal3Attempted", 3);
        player3.put("fieldGoal3Made", 1);
        player3.put("freeThrowAttempted", 4);
        player3.put("freeThrowMade", 2);

        Map<String, Object> player4 = new HashMap<>();
        player4.put("gameID", 2);
        player4.put("playerID", 103);
        player4.put("gameDate", "02/15/2024");
        player4.put("fieldGoal2Attempted", 7);
        player4.put("fieldGoal2Made", 2);
        player4.put("fieldGoal3Attempted", 6);
        player4.put("fieldGoal3Made", 3);
        player4.put("freeThrowAttempted", 1);
        player4.put("freeThrowMade", 1);

        gameData.add(player1);
        gameData.add(player2);
        gameData.add(player3);
        gameData.add(player4);

        // Call the function
        List<Integer> qualifiedGames = findQualifiedGames(gameData, 50, 2);
        System.out.println(qualifiedGames);
    }

    public static List<Integer> findQualifiedGames(List<Map<String, Object>> gameData, int trueShootingCutoff, int playerCount) throws ParseException {
        Map<Integer, GameInfo> qualifiedGames = new HashMap<>();
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        // Iterate over the game data
        for (Map<String, Object> playerStats : gameData) {
            int gameId = (Integer) playerStats.get("gameID");
            String gameDate = (String) playerStats.get("gameDate");
            // Calculate True Shooting Percentage for the player
            double tsPercentage = calculateTrueShootingPercentage(playerStats);

            if (tsPercentage >= trueShootingCutoff) {
                qualifiedGames.putIfAbsent(gameId, new GameInfo(gameDate));
                qualifiedGames.get(gameId).incrementQualifyingPlayers();
            }
        }
        List<Integer> result = new ArrayList<>();
        for (Map.Entry<Integer, GameInfo> entry : qualifiedGames.entrySet()) {
            if (entry.getValue().getQualifyingPlayers() >= playerCount) {
                result.add(entry.getKey());
            }
        }
        // Sort the game IDs by their game date in descending order
        result.sort((gameId1, gameId2) -> {
            try {
                Date date1 = dateFormat.parse(qualifiedGames.get(gameId1).getGameDate());
                Date date2 = dateFormat.parse(qualifiedGames.get(gameId2).getGameDate());
                return date2.compareTo(date1); // Most recent first
            } catch (ParseException e) {
                throw new RuntimeException(e);
            }
        });

        return result;
    }


    public static double calculateTrueShootingPercentage(Map<String, Object> playerStats) {
        int fieldGoal2Made = (Integer) playerStats.get("fieldGoal2Made");
        System.out.println(fieldGoal2Made);
        int fieldGoal3Made = (Integer) playerStats.get("fieldGoal3Made");
        int freeThrowMade = (Integer) playerStats.get("freeThrowMade");
        int fieldGoal2Attempted = (Integer) playerStats.get("fieldGoal2Attempted");
        int fieldGoal3Attempted = (Integer) playerStats.get("fieldGoal3Attempted");
        int freeThrowAttempted = (Integer) playerStats.get("freeThrowAttempted");
        int pointsScored = (2 * fieldGoal2Made) + (3 * fieldGoal3Made) + freeThrowMade;

        int fieldGoalAttempts = fieldGoal2Attempted + fieldGoal3Attempted;

        double denominator = 2 * (fieldGoalAttempts + 0.44 * freeThrowAttempted);

        if (denominator == 0) {
            return 0; // Avoid division by zero if no attempts were made
        }
        return (pointsScored / denominator) * 100;
    }

    static class GameInfo {
        private String gameDate;
        private int qualifyingPlayers;

        public GameInfo(String gameDate) {
            this.gameDate = gameDate;
            this.qualifyingPlayers = 0;
        }

        public String getGameDate() {
            return gameDate;
        }

        public int getQualifyingPlayers() {
            return qualifyingPlayers;
        }

        public void incrementQualifyingPlayers() {
            this.qualifyingPlayers++;
        }
    }
}
