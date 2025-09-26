package Calculations;

import java.util.ArrayList;
import java.util.List;

public class CalculationToSumSuccessTrans {
    int id;
    String status;
    int amount;

    public CalculationToSumSuccessTrans(int id, String status, int amount) {
        this.id = id;
        this.status = status;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "CalculationToSumSuccessTrans{" +
                "id=" + id +
                ", status='" + status + '\'' +
                ", amount=" + amount +
                '}';
    }

    public static void main(String[] args) {
        List<CalculationToSumSuccessTrans> lst = new ArrayList<>();
        lst.add(new CalculationToSumSuccessTrans(1, "SUCCESS", 1000));
        lst.add(new CalculationToSumSuccessTrans(2, "FAIL", 2000));
        lst.add(new CalculationToSumSuccessTrans(3, "SUCCESS", 3000));
        lst.add(new CalculationToSumSuccessTrans(4, "FAIL", 1000));

        int successSum = 0;
        int failSum = 0;
        for (CalculationToSumSuccessTrans result : lst) {
          if("SUCCESS".equals(result.getStatus())){
              successSum +=result.getAmount();
          }
          else{
              failSum += result.getAmount();
          }
        }
        System.out.println("Success Trans Sum: "  + successSum);
        System.out.println("failed trans Sum: " + failSum);

        //using java8
        int successSum1 = lst.stream().filter(a -> "SUCCESS".equals(a.getStatus())).mapToInt(a -> a.getAmount()).sum();
    }
}
