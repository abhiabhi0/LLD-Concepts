from oop.OopBankAccount import OopBankAccount

def main():
	abhi = OopBankAccount(100, 1)
	bob = OopBankAccount(200, 2)

	abhi.transfer(bob, 50)

	print(abhi.getBalance())

if __name__ == '__main__':
	main()