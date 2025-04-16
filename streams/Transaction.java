package streams;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Transaction {
    public static void main(String[] args) {
        List<TransactionData> transactions = Arrays.asList(new TransactionData("2022-01-01", 100),
                new TransactionData("2022-01-01", 200),
                new TransactionData("2022-01-02", 300),
                new TransactionData("2022-01-02", 400),
                new TransactionData("2022-01-03", 500));

        Map<String, Double> sumOfDay = transactions.stream()
                .collect(Collectors.groupingBy(TransactionData::getDate,Collectors.summingDouble(TransactionData::getAmount)));
    }
}

class TransactionData{
    private String date;
    private double amount;

    public TransactionData(String date, double amount) {
        this.date = date;
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
