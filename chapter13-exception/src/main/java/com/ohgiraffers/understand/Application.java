package main.java.com.ohgiraffers.understand;

import java.util.*;

public class Application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("로또를 몇 장 구매하시겠습니까? (1~10): ");
        int numTickets = scanner.nextInt();
        if (numTickets < 1) {
            System.out.println("로또를 최소 1개 이상 구매해야 합니다.");
            return;
        } else if (numTickets > 1000) {
            System.out.println("로또는 최대 10개까지만 구매할 수 있습니다.");
            return;
        }
        List<Integer> winningNumbers = LottoProgram.generateLottoNumbers();
        List<List<Integer>> tickets = LottoProgram.buyLottoTickets(numTickets);
        LottoProgram.printResults(winningNumbers, tickets);
    }
}

class LottoProgram {
    public static List<Integer> generateLottoNumbers() {
        Random random = new Random();
        Set<Integer> lottoNumbersSet = new HashSet<>();
        while (lottoNumbersSet.size() < 6) {
            int randomNumber = random.nextInt(45) + 1;
            lottoNumbersSet.add(randomNumber);
        }
        return new ArrayList<>(lottoNumbersSet);
    }

    public static List<List<Integer>> buyLottoTickets(int numTickets) {
        List<List<Integer>> tickets = new ArrayList<>();
        for (int i = 0; i < numTickets; i++) {
            tickets.add(generateLottoNumbers());
        }
        return tickets;
    }

    public static boolean checkWinning(List<Integer> ticket, List<Integer> winningNumbers) {
        return new HashSet<>(ticket).equals(new HashSet<>(winningNumbers));
    }

    public static void printResults(List<Integer> winningNumbers, List<List<Integer>> tickets) {
        if (tickets.isEmpty()) {
            System.out.println("당첨 번호가 없습니다.");
            return;
        }

        System.out.println("당첨 번호: " + winningNumbers);

        boolean winnerFound = false;
        for (int i = 0; i < tickets.size(); i++) {
            List<Integer> ticket = tickets.get(i);
            if (checkWinning(ticket, winningNumbers)) {
                System.out.println((i + 1) + "번째 로또 당첨");
                winnerFound = true;
            }
        }

        if (!winnerFound) {
            System.out.println("이번 회차 당첨 없음");
        }
    }
}
