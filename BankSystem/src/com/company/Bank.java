package com.company;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        branches = new ArrayList<Branch>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Branch> getBranches() {
        return branches;
    }

    public boolean addBranch (String branchName){
        if (findBranch(branchName) == null){
            this.branches.add(new Branch(branchName));
            return true;
        }
        return false;
    }

    public boolean addCustomer (String branchName, String customerName, double initialAmount) {
        Branch newBranch = findBranch(branchName);
        if (newBranch != null){
            return newBranch.newCustomer(customerName, initialAmount);
        }
        return false;
    }
    public boolean addCustomerTransaction(String branchName, String customerName, double initialAmount) {
        Branch newBranch = findBranch(branchName);
        if (newBranch != null){
            return newBranch.addCustomerTransaction(customerName, initialAmount);
        }
        return false;
    }

    public boolean listCustomers(String branchName, boolean showTransaction) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            System.out.println("Customers details of branch "+ branch.getName());
            ArrayList<Customer> branchCustomers = branch.getCustomers();
            for (int i = 0; i< branchCustomers.size(); i++){
                Customer branchCustomer = branchCustomers.get(i);
                System.out.println("Customer: "+ branchCustomer.getName() + "[" + (i+1) + "]");
                if (showTransaction) {
                    System.out.println("Transactions..");
                    ArrayList<Double> transactions = branchCustomer.getTransaction();
                    for (int j=0; j<transactions.size(); j++) {
                        System.out.println("["+(j+1)+ "] amount " + transactions.get(j));
                    }
                }
            }
            return true;
        } else {
            return false;
        }

    }

    private Branch findBranch(String branchName) {
        for (int i =0; i<branches.size();i++){
            if (branches.get(i).getName().equals(branchName)){
                return branches.get(i);
            }
        }
        return null;
    }
}
