class TestBankAccount {
    public static void main(String[] args) {
		BankAccount accountOne = new BankAccount();
        // System.out.println("New Acc No. - " + ba.getAccountNumber());
		accountOne.deposit(100.49, "checking");
		accountOne.deposit(3.00, "savings");
		// accountOne.displayAccountBalance();

		System.out.println(accountOne.totalBalance);
        System.out.println(accountOne.getCheckingBalance());
        System.out.println(accountOne.getSavingsBalance());

		accountOne.withdraw(50, "checking");
		accountOne.withdraw(50, "savings");
		// accountOne.displayAccountBalance();

		System.out.println(BankAccount.totalBalance);


        BankAccount accountTwo = new BankAccount();
        // System.out.println("New Acc No. - " + ba.getAccountNumber());
		accountTwo.deposit(100.49, "checking");
		accountTwo.deposit(3.00, "savings");
		// accountOne.displayAccountBalance();

		System.out.println(accountTwo.totalBalance);
        System.out.println(accountTwo.getCheckingBalance());
        System.out.println(accountTwo.getSavingsBalance());

		accountTwo.withdraw(50, "checking");
		accountTwo.withdraw(50, "savings");
		// accountOne.displayAccountBalance();

		System.out.println(BankAccount.totalBalance);

        // Print number of accounts
        System.out.println(BankAccount.numberOfAccounts);

        // BankAccount ba2 = new BankAccount();
        // System.out.println("New Acc No. - " + ba2.getAccountNumber());
		// ba2.depositMoney(3, "checking");
		// ba2.depositMoney(99, "savings");
		// ba2.displayAccountBalance();
        // ba2.withdrawMoney(50, "checking");
	}
}