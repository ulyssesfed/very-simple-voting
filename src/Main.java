import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of candidates: ");
        int numberOfCandidates = scanner.nextInt();
        scanner.nextLine();
        String[] candidates = new String[numberOfCandidates];
        int[] votes = new int[numberOfCandidates];
        for (int i = 0; i < numberOfCandidates; i++) {
            System.out.println("Enter the name of candidate " + (i + 1) + ": ");
            candidates[i] = scanner.nextLine();
        }

        System.out.println("Enter the number of voters: ");
        int numberOfVoters = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < numberOfVoters; i++) {
            System.out.println("Enter the name of the candidate you want to vote for: ");
            String candidate = scanner.nextLine();
            for (int j = 0; j < candidates.length; j++) {
                if (candidates[j].equals(candidate)) {
                    votes[j]++;
                    break;
                }
            }
        }

        System.out.println("The election is over!");
        System.out.println("The candidates are: ");
        for (String candidate : candidates) {
            System.out.println(candidate);
        }

        System.out.println("The number of votes each candidate got is: ");
        for (int i = 0; i < votes.length; i++) {
            System.out.println(candidates[i] + " got " + votes[i] + " votes.");
        }

        int maxVotes = votes[0];
        int maxVotesIndex = 0;
        for (int i = 1; i < votes.length; i++) {
            if (votes[i] > maxVotes) {
                maxVotes = votes[i];
                maxVotesIndex = i;
            }
        }
        System.out.println(candidates[maxVotesIndex] + " won the election!");
    }
}