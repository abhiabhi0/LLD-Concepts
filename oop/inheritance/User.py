class User:
	def __init__(self, name, email, age, address):
		self.__name = name
		self.__email = email
		self.__age = age
		self.__address = address

	def change_email(self):
		self.__email = email

	def get_name(self):
		return self.__name