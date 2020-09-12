package com.hy.crm.pojo.vo;

import com.hy.crm.pojo.Client;
import com.hy.crm.pojo.Contract;
import com.hy.crm.pojo.Income;
import com.hy.crm.pojo.Invoice;

import java.util.List;

public class ContractExt extends Contract {
  private Contract contract;
  private List<Income> income;
  private List<Invoice> invoices;

    public ContractExt(Contract contract, List<Income> income, List<Invoice> invoices) {
        this.contract = contract;
        this.income = income;
        this.invoices = invoices;
    }

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }

    public List<Income> getIncome() {
        return income;
    }

    public void setIncome(List<Income> income) {
        this.income = income;
    }

    public List<Invoice> getInvoices() {
        return invoices;
    }

    public void setInvoices(List<Invoice> invoices) {
        this.invoices = invoices;
    }

    @Override
    public String toString() {
        return "ContractExt{" +
                "contract=" + contract +
                ", income=" + income +
                ", invoices=" + invoices +
                '}';
    }
}
